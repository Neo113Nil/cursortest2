package com.connectsdk.service.upnp;

import com.connectsdk.core.MediaInfo;
import com.connectsdk.core.Util;
import com.connectsdk.discovery.provider.ssdp.SSDPClient;
import com.connectsdk.service.DLNAService;
import com.connectsdk.service.capability.MediaControl;
import com.connectsdk.service.capability.listeners.ResponseListener;
import com.connectsdk.service.command.URLServiceSubscription;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class DLNAHttpServer {
    final int port = 49291;
    volatile boolean running = false;
    CopyOnWriteArrayList<URLServiceSubscription<?>> subscriptions = new CopyOnWriteArrayList<>();
    volatile ServerSocket welcomeSocket;

    private void handleEntry(JSONObject jSONObject) throws JSONException {
        boolean parseBoolean;
        if (jSONObject.has("TransportState")) {
            MediaControl.PlayStateStatus convertTransportStateToPlayStateStatus = MediaControl.PlayStateStatus.convertTransportStateToPlayStateStatus(jSONObject.getString("TransportState"));
            Iterator<URLServiceSubscription<?>> it = this.subscriptions.iterator();
            while (it.hasNext()) {
                URLServiceSubscription<?> next = it.next();
                if (next.getTarget().equalsIgnoreCase(DLNAService.PLAY_STATE)) {
                    for (int i = 0; i < next.getListeners().size(); i++) {
                        Util.postSuccess((ResponseListener) next.getListeners().get(i), convertTransportStateToPlayStateStatus);
                    }
                }
            }
        }
        if ((jSONObject.has("Volume") && !jSONObject.has("channel")) || (jSONObject.has("Volume") && jSONObject.getString("channel").equals("Master"))) {
            float f = jSONObject.getInt("Volume") / 100.0f;
            Iterator<URLServiceSubscription<?>> it2 = this.subscriptions.iterator();
            while (it2.hasNext()) {
                URLServiceSubscription<?> next2 = it2.next();
                if (next2.getTarget().equalsIgnoreCase("volume")) {
                    for (int i2 = 0; i2 < next2.getListeners().size(); i2++) {
                        Util.postSuccess((ResponseListener) next2.getListeners().get(i2), Float.valueOf(f));
                    }
                }
            }
        }
        if ((jSONObject.has("Mute") && !jSONObject.has("channel")) || (jSONObject.has("Mute") && jSONObject.getString("channel").equals("Master"))) {
            String string = jSONObject.getString("Mute");
            try {
                parseBoolean = true;
                if (Integer.parseInt(string) != 1) {
                    parseBoolean = false;
                }
            } catch (NumberFormatException unused) {
                parseBoolean = Boolean.parseBoolean(string);
            }
            Iterator<URLServiceSubscription<?>> it3 = this.subscriptions.iterator();
            while (it3.hasNext()) {
                URLServiceSubscription<?> next3 = it3.next();
                if (next3.getTarget().equalsIgnoreCase("mute")) {
                    for (int i3 = 0; i3 < next3.getListeners().size(); i3++) {
                        Util.postSuccess((ResponseListener) next3.getListeners().get(i3), Boolean.valueOf(parseBoolean));
                    }
                }
            }
        }
        if (jSONObject.has("CurrentTrackMetaData")) {
            MediaInfo mediaInfo = DLNAMediaInfoParser.getMediaInfo(jSONObject.getString("CurrentTrackMetaData"));
            Iterator<URLServiceSubscription<?>> it4 = this.subscriptions.iterator();
            while (it4.hasNext()) {
                URLServiceSubscription<?> next4 = it4.next();
                if (next4.getTarget().equalsIgnoreCase("info")) {
                    for (int i4 = 0; i4 < next4.getListeners().size(); i4++) {
                        Util.postSuccess((ResponseListener) next4.getListeners().get(i4), mediaInfo);
                    }
                }
            }
        }
    }

    private void handleLastChange(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("InstanceID")) {
            JSONArray jSONArray = jSONObject.getJSONArray("InstanceID");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    handleEntry(jSONArray2.getJSONObject(i2));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0002 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void processRequests() {
        BufferedReader bufferedReader;
        String str;
        DataOutputStream dataOutputStream;
        PrintWriter printWriter;
        StringBuilder sb;
        while (this.running && this.welcomeSocket != null && !this.welcomeSocket.isClosed()) {
            try {
                Socket accept = this.welcomeSocket.accept();
                PrintWriter printWriter2 = null;
                printWriter2 = null;
                ByteArrayInputStream byteArrayInputStream = null;
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        do {
                            int read = bufferedReader.read();
                            if (read == -1) {
                                break;
                            } else {
                                sb2.append((char) read);
                            }
                        } while (!sb2.toString().endsWith("\r\n\r\n"));
                        sb = new StringBuilder();
                        str = null;
                    } catch (IOException e) {
                        e = e;
                        str = null;
                    }
                } catch (IOException e2) {
                    e = e2;
                    bufferedReader = null;
                    str = null;
                }
                try {
                    do {
                        try {
                            int read2 = bufferedReader.read();
                            if (read2 != -1) {
                                sb.append((char) read2);
                                str = sb.toString();
                            }
                        } catch (IOException e3) {
                            e = e3;
                            e.printStackTrace();
                            break;
                            dataOutputStream = new DataOutputStream(accept.getOutputStream());
                            printWriter = new PrintWriter(dataOutputStream);
                            try {
                                try {
                                    printWriter.println(SSDPClient.OK);
                                    printWriter.println("Connection: Close");
                                    printWriter.println("Content-Length: 0");
                                    printWriter.println();
                                    printWriter.flush();
                                } catch (Throwable th) {
                                    th = th;
                                    printWriter2 = printWriter;
                                    try {
                                        bufferedReader.close();
                                        printWriter2.close();
                                        dataOutputStream.close();
                                        accept.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                    } catch (NullPointerException e5) {
                                        e5.printStackTrace();
                                    }
                                    throw th;
                                }
                            } catch (IOException e6) {
                                e = e6;
                                e.printStackTrace();
                                bufferedReader.close();
                                printWriter.close();
                                dataOutputStream.close();
                                accept.close();
                                if (str != null) {
                                }
                            }
                            try {
                                bufferedReader.close();
                                printWriter.close();
                                dataOutputStream.close();
                                accept.close();
                            } catch (IOException e7) {
                                e7.printStackTrace();
                            } catch (NullPointerException e8) {
                                e8.printStackTrace();
                            }
                            if (str != null) {
                            }
                        }
                        break;
                    } while (!str.endsWith("</e:propertyset>"));
                    break;
                    dataOutputStream = new DataOutputStream(accept.getOutputStream());
                    try {
                        printWriter = new PrintWriter(dataOutputStream);
                        printWriter.println(SSDPClient.OK);
                        printWriter.println("Connection: Close");
                        printWriter.println("Content-Length: 0");
                        printWriter.println();
                        printWriter.flush();
                        bufferedReader.close();
                        printWriter.close();
                        dataOutputStream.close();
                    } catch (IOException e9) {
                        e = e9;
                        printWriter = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e10) {
                    e = e10;
                    dataOutputStream = null;
                    printWriter = null;
                } catch (Throwable th3) {
                    th = th3;
                    dataOutputStream = null;
                }
                accept.close();
                if (str != null) {
                    try {
                        byteArrayInputStream = new ByteArrayInputStream(str.getBytes("UTF-8"));
                    } catch (UnsupportedEncodingException e11) {
                        e11.printStackTrace();
                    }
                    try {
                        JSONArray parse = new DLNANotifyParser().parse(byteArrayInputStream);
                        for (int i = 0; i < parse.length(); i++) {
                            JSONObject jSONObject = parse.getJSONObject(i);
                            if (jSONObject.has("LastChange")) {
                                handleLastChange(jSONObject.getJSONObject("LastChange"));
                            }
                        }
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    } catch (JSONException e13) {
                        e13.printStackTrace();
                    } catch (XmlPullParserException e14) {
                        e14.printStackTrace();
                    }
                }
            } catch (IOException e15) {
                e15.printStackTrace();
                return;
            }
        }
    }

    public int getPort() {
        return 49291;
    }

    public List<URLServiceSubscription<?>> getSubscriptions() {
        return this.subscriptions;
    }

    public boolean isRunning() {
        return this.running;
    }

    public void setSubscriptions(List<URLServiceSubscription<?>> list) {
        this.subscriptions = new CopyOnWriteArrayList<>(list);
    }

    public synchronized void start() {
        if (this.running) {
            return;
        }
        this.running = true;
        try {
            this.welcomeSocket = new ServerSocket(49291);
            Util.runInBackground(new Runnable() { // from class: com.connectsdk.service.upnp.DLNAHttpServer.1
                @Override // java.lang.Runnable
                public void run() {
                    DLNAHttpServer.this.processRequests();
                }
            }, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized void stop() {
        try {
            if (this.running) {
                Iterator<URLServiceSubscription<?>> it = this.subscriptions.iterator();
                while (it.hasNext()) {
                    it.next().unsubscribe();
                }
                this.subscriptions.clear();
                if (this.welcomeSocket != null && !this.welcomeSocket.isClosed()) {
                    try {
                        this.welcomeSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                this.welcomeSocket = null;
                this.running = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
