package com.anythink.expressad.b;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.common.d.j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18236a = "SocketSpider";

    /* renamed from: b, reason: collision with root package name */
    private static final byte f18237b = 2;

    /* renamed from: c, reason: collision with root package name */
    private static final byte f18238c = 3;

    /* renamed from: d, reason: collision with root package name */
    private static volatile AtomicInteger f18239d = new AtomicInteger(1);

    /* renamed from: e, reason: collision with root package name */
    private com.anythink.expressad.f.a f18240e;

    /* renamed from: f, reason: collision with root package name */
    private String f18241f;

    /* renamed from: g, reason: collision with root package name */
    private int f18242g = j.g.b.f12473a;

    public k() {
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.foundation.b.a.c().f();
        com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
        this.f18240e = b9;
        if (b9 == null) {
            com.anythink.expressad.f.b.a();
            this.f18240e = com.anythink.expressad.f.b.c();
        }
    }

    private JSONObject b(String str, com.anythink.expressad.foundation.d.d dVar, boolean z3, boolean z6) {
        JSONObject jSONObject = new JSONObject();
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                String path = parse.getPath();
                String encodedQuery = parse.getEncodedQuery();
                this.f18241f = host;
                jSONObject.put("uri", "https://" + host + path);
                jSONObject.put("data", encodedQuery);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!z3 && !z6) {
                jSONObject2.put("User-Agent", com.anythink.core.common.v.m.h());
            }
            if (dVar != null) {
                if (z3 && dVar.F() == 1) {
                    jSONObject2.put("User-Agent", com.anythink.core.common.v.m.h());
                }
                if (z6 && dVar.E() == 1) {
                    jSONObject2.put("User-Agent", com.anythink.core.common.v.m.h());
                }
            } else {
                jSONObject2.put("User-Agent", com.anythink.core.common.v.m.h());
            }
            jSONObject2.put("Accept-Encoding", com.anythink.expressad.foundation.g.f.g.b.f19341d);
            if (this.f18240e.u() && !TextUtils.isEmpty(str)) {
                jSONObject2.put("referer", str);
            }
            jSONObject.put(com.anythink.expressad.foundation.d.g.f18705j, jSONObject2);
        } catch (Throwable th2) {
            th2.getMessage();
        }
        return jSONObject;
    }

    public final com.anythink.expressad.b.a.a a(String str, com.anythink.expressad.foundation.d.d dVar, boolean z3, boolean z6) {
        com.anythink.expressad.b.a.a aVar = new com.anythink.expressad.b.a.a();
        aVar.f18123g = str;
        if (TextUtils.isEmpty(str)) {
            aVar.f18124h = "request url can not null.";
            return aVar;
        }
        String replace = str.replace(" ", "%20");
        JSONObject b9 = b(replace, dVar, z3, z6);
        if (b9.length() == 0) {
            aVar.f18124h = "request content generation failed.";
            return aVar;
        }
        if (TextUtils.isEmpty(b9.optString("uri"))) {
            aVar.f18124h = "request url parse error.";
            return aVar;
        }
        if (dVar != null) {
            int aM = dVar.aM();
            if (aM == 0) {
                aM = j.g.b.f12473a;
            }
            this.f18242g = aM;
        }
        if (!TextUtils.isEmpty(this.f18241f)) {
            return a(replace, b9.toString());
        }
        aVar.f18124h = "request url parse error.";
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.anythink.expressad.b.a.a a(String str, String str2) {
        OutputStream outputStream;
        Socket socket;
        InputStream inputStream;
        int i;
        boolean z3;
        Object[] objArr;
        byte[] bArr;
        String str3;
        com.anythink.expressad.b.a.a aVar = new com.anythink.expressad.b.a.a();
        Socket socket2 = null;
        byte[] byteArray = null;
        try {
            try {
                socket = new Socket(this.f18241f, this.f18242g);
                try {
                    socket.setSoTimeout(com.anythink.basead.exoplayer.d.f6762a);
                    outputStream = socket.getOutputStream();
                    try {
                        ByteBuffer wrap = ByteBuffer.wrap(new byte[8]);
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        wrap.order(byteOrder);
                        wrap.put((byte) 2);
                        wrap.put((byte) 3);
                        wrap.putShort((short) f18239d.getAndIncrement());
                        if (TextUtils.isEmpty(str2)) {
                            wrap.putInt(0);
                            outputStream.write(wrap.array());
                        } else {
                            if (!TextUtils.isEmpty(str2)) {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                                gZIPOutputStream.write(str2.getBytes());
                                gZIPOutputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                            }
                            wrap.putInt(byteArray.length);
                            outputStream.write(wrap.array());
                            outputStream.write(byteArray);
                        }
                        outputStream.flush();
                        Arrays.toString(wrap.array());
                        inputStream = socket.getInputStream();
                        byte[] bArr2 = new byte[8];
                        inputStream.read(bArr2, 0, 8);
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr2);
                        wrap2.order(byteOrder);
                        i = wrap2.getInt(4);
                        z3 = true;
                        byte b9 = bArr2[1];
                        boolean z6 = b9 == 3;
                        objArr = b9 == 2;
                        Arrays.toString(bArr2);
                        bArr = new byte[i];
                        new DataInputStream(socket.getInputStream()).readFully(bArr);
                        if (z6 || i <= 2 || ((bArr[0] << 8) | (bArr[1] & 255)) != 8075) {
                            z3 = z6;
                        }
                    } catch (Throwable th) {
                        th = th;
                        socket2 = socket;
                        try {
                            th.getMessage();
                            aVar.f18124h = th.getMessage();
                            if (socket2 != null) {
                                socket2.close();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                            }
                            return aVar;
                        } catch (Throwable th2) {
                            if (socket2 != null) {
                                try {
                                    socket2.close();
                                    if (outputStream != null) {
                                        outputStream.close();
                                    }
                                } catch (Exception e9) {
                                    e9.getMessage();
                                }
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = null;
                }
            } catch (Exception e10) {
                e10.getMessage();
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
        }
        if (objArr == true && i == 0) {
            aVar.f18122f = 200;
            aVar.f18123g = str;
            aVar.f18121e = 0;
            socket.close();
            outputStream.close();
            return aVar;
        }
        if (i <= 0) {
            aVar.f18122f = 200;
            aVar.f18123g = str;
            aVar.f18121e = 0;
            socket.close();
            outputStream.close();
            return aVar;
        }
        try {
            if (z3) {
                str3 = a(bArr);
            } else {
                str3 = new String(bArr);
            }
        } catch (Throwable th5) {
            th5.getMessage();
            aVar.f18124h = th5.getMessage();
        }
        if (!TextUtils.isEmpty(str3)) {
            aVar.f18122f = 200;
            aVar.f18123g = str;
            aVar.f18121e = 0;
            try {
                JSONObject optJSONObject = new JSONObject(str3).optJSONObject("data");
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("location");
                    if (!TextUtils.isEmpty(optString)) {
                        aVar.f18122f = 302;
                        aVar.f18117a = optString;
                    }
                }
            } catch (Throwable th6) {
                th6.getMessage();
            }
            socket.close();
            outputStream.close();
            return aVar;
        }
        inputStream.close();
        socket.close();
        outputStream.close();
        return aVar;
    }

    private static byte[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    private static String a(byte[] bArr) {
        if (bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2, 0, 1024);
            if (read > 0) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }
}
