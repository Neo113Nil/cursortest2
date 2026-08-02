package com.bugsnag.android;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.TrafficStats;
import android.util.JsonReader;
import androidx.room.Room;
import coil3.Extras;
import com.bugsnag.android.Client;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.StringUtils;
import com.bugsnag.android.internal.TrimMetrics;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.Charsets;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.AppUpdateData;

/* loaded from: classes.dex */
public final class DeliveryParams implements Connectivity {
    public final Object endpoint;
    public final Object headers;

    public DeliveryParams(File file) {
        this.endpoint = file;
        this.headers = new ReentrantReadWriteLock();
    }

    public static HttpURLConnection makeRequest(URL url, byte[] bArr, String str, Map map) {
        URLConnection openConnection = url.openConnection();
        openConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        if (str != null) {
            httpURLConnection.addRequestProperty("Bugsnag-Integrity", str);
        }
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str3 != null) {
                httpURLConnection.addRequestProperty(str2, str3);
            }
        }
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnection;
        } finally {
        }
    }

    public DeliveryStatus deliver(EventPayload eventPayload, DeliveryParams deliveryParams) {
        ImmutableConfig immutableConfig = eventPayload.config;
        if (eventPayload.toByteArray().length > 999700) {
            Event event = eventPayload.event;
            if (event == null) {
                File file = eventPayload.eventFile;
                file.getClass();
                String str = eventPayload.apiKey;
                if (str == null) {
                    str = immutableConfig.apiKey;
                }
                event = new MarshalledEventSource(file, str, immutableConfig.logger).invoke$1();
                eventPayload.event = event;
            }
            EventInternal eventInternal = event.impl;
            int i = immutableConfig.maxStringValueLength;
            Metadata metadata = eventInternal.metadata;
            List list = eventInternal.threads;
            Iterator it = metadata.store.entrySet().iterator();
            int i2 = 0;
            int i3 = 0;
            while (it.hasNext()) {
                Object value = ((Map.Entry) it.next()).getValue();
                value.getClass();
                TrimMetrics trimStringValuesTo = StringUtils.trimStringValuesTo(i, TypeIntrinsics.asMutableMap(value));
                i2 += trimStringValuesTo.getItemsTrimmed();
                i3 += trimStringValuesTo.getDataTrimmed();
            }
            TrimMetrics trimMetrics = new TrimMetrics(i2, i3);
            int itemsTrimmed = trimMetrics.getItemsTrimmed();
            int dataTrimmed = trimMetrics.getDataTrimmed();
            Iterator it2 = eventInternal.breadcrumbs.iterator();
            while (it2.hasNext()) {
                Map map = ((Breadcrumb) it2.next()).impl.metadata;
                TrimMetrics trimMetrics2 = map == null ? new TrimMetrics(0, 0) : StringUtils.trimStringValuesTo(i, map);
                itemsTrimmed += trimMetrics2.getItemsTrimmed();
                dataTrimmed += trimMetrics2.getDataTrimmed();
            }
            TrimMetrics trimMetrics3 = new TrimMetrics(itemsTrimmed, dataTrimmed);
            eventInternal.internalMetrics.setMetadataTrimMetrics(trimMetrics3.component1(), trimMetrics3.component2());
            int size = list.size();
            int i4 = immutableConfig.maxReportedThreads;
            if (size > i4) {
                list.subList(i4, size).clear();
                list.add(new Thread("", "[" + (size - i4) + " threads omitted as the maxReportedThreads limit (" + i4 + ") was exceeded]", ErrorType.UNKNOWN, false, 7, new Stacktrace(new StackTraceElement[]{new StackTraceElement("", "", "-", 0)}, immutableConfig.projectPackages, immutableConfig.logger), immutableConfig.logger));
            }
            eventPayload.cachedBytes = null;
            byte[] byteArray = eventPayload.toByteArray();
            if (byteArray.length > 999700) {
                int length = byteArray.length - 999700;
                Logger logger = eventInternal.logger;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length && !eventInternal.breadcrumbs.isEmpty()) {
                    i5 += Room.serialize((Breadcrumb) eventInternal.breadcrumbs.remove(0)).length;
                    i6++;
                }
                List list2 = eventInternal.breadcrumbs;
                if (i6 == 1) {
                    list2.add(new Breadcrumb("Removed to reduce payload size", logger));
                } else {
                    StringBuilder sb = new StringBuilder("Removed, along with ");
                    sb.append(i6 - 1);
                    sb.append(" older breadcrumbs, to reduce payload size");
                    list2.add(new Breadcrumb(sb.toString(), logger));
                }
                TrimMetrics trimMetrics4 = new TrimMetrics(i6, i5);
                eventInternal.internalMetrics.setBreadcrumbTrimMetrics(trimMetrics4.getItemsTrimmed(), trimMetrics4.getDataTrimmed());
                eventPayload.cachedBytes = null;
                eventPayload.toByteArray();
            }
        }
        DeliveryStatus deliver = deliver((String) deliveryParams.endpoint, eventPayload.toByteArray(), Bugsnag.getIntegrityToken(eventPayload), (Map) deliveryParams.headers);
        ((Logger) this.headers).i("Error API request finished with status " + deliver);
        return deliver;
    }

    @Override // com.bugsnag.android.Connectivity
    public boolean hasNetworkConnection() {
        return ((ConnectivityManager) this.endpoint).getActiveNetwork() != null;
    }

    public JsonStream.Streamable load(Function1 function1) {
        ReentrantReadWriteLock.ReadLock readLock = ((ReentrantReadWriteLock) this.headers).readLock();
        readLock.lock();
        try {
            File file = (File) this.endpoint;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), PKIFailureInfo.certRevoked);
            try {
                JsonStream.Streamable streamable = (JsonStream.Streamable) function1.invoke(new JsonReader(bufferedReader));
                bufferedReader.close();
                return streamable;
            } finally {
            }
        } finally {
            readLock.unlock();
        }
    }

    public void logRequestInfo(int i, HttpURLConnection httpURLConnection, DeliveryStatus deliveryStatus) {
        BufferedReader bufferedReader;
        Logger logger = (Logger) this.headers;
        try {
            Result.Companion companion = Result.Companion;
            logger.i("Request completed with code " + i + ", message: " + httpURLConnection.getResponseMessage() + ", headers: " + httpURLConnection.getHeaderFields());
        } catch (Throwable unused) {
            Result.Companion companion2 = Result.Companion;
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), Charsets.UTF_8), PKIFailureInfo.certRevoked);
            try {
                logger.d("Received request response: ".concat(AppUpdateData.readText(bufferedReader)));
                bufferedReader.close();
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Throwable unused2) {
            Result.Companion companion3 = Result.Companion;
        }
        try {
            if (deliveryStatus == DeliveryStatus.DELIVERED) {
                return;
            }
            bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream(), Charsets.UTF_8), PKIFailureInfo.certRevoked);
            try {
                logger.w("Request error details: ".concat(AppUpdateData.readText(bufferedReader)));
                bufferedReader.close();
            } finally {
            }
        } catch (Throwable unused3) {
            Result.Companion companion4 = Result.Companion;
        }
    }

    public void persist(JsonStream.Streamable streamable) {
        ReentrantReadWriteLock.WriteLock writeLock = ((ReentrantReadWriteLock) this.headers).writeLock();
        writeLock.lock();
        try {
            File file = (File) this.endpoint;
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), Charsets.UTF_8), PKIFailureInfo.certRevoked);
            try {
                streamable.toStream(new JsonStream(bufferedWriter));
                bufferedWriter.close();
            } finally {
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // com.bugsnag.android.Connectivity
    public void registerForNetworkChanges() {
        ((ConnectivityManager) this.endpoint).registerDefaultNetworkCallback((ConnectivityApi24$ConnectivityTrackerCallback) this.headers);
    }

    @Override // com.bugsnag.android.Connectivity
    public String retrieveNetworkAccessState() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.endpoint;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        NetworkCapabilities networkCapabilities = activeNetwork != null ? connectivityManager.getNetworkCapabilities(activeNetwork) : null;
        return networkCapabilities == null ? "none" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(3) ? "ethernet" : networkCapabilities.hasTransport(0) ? "cellular" : "unknown";
    }

    public /* synthetic */ DeliveryParams(Object obj, Object obj2) {
        this.endpoint = obj;
        this.headers = obj2;
    }

    public DeliveryParams(ConnectivityManager connectivityManager, final Client.AnonymousClass1 anonymousClass1) {
        this.endpoint = connectivityManager;
        this.headers = new ConnectivityManager.NetworkCallback(anonymousClass1) { // from class: com.bugsnag.android.ConnectivityApi24$ConnectivityTrackerCallback
            public final Client.AnonymousClass1 cb;
            public final AtomicBoolean receivedFirstCallback = new AtomicBoolean(false);

            {
                this.cb = anonymousClass1;
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                Client.AnonymousClass1 anonymousClass12;
                super.onAvailable(network);
                if (!this.receivedFirstCallback.getAndSet(true) || (anonymousClass12 = this.cb) == null) {
                    return;
                }
                anonymousClass12.invoke(Boolean.TRUE, "unknown");
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onUnavailable() {
                Client.AnonymousClass1 anonymousClass12;
                super.onUnavailable();
                if (!this.receivedFirstCallback.getAndSet(true) || (anonymousClass12 = this.cb) == null) {
                    return;
                }
                anonymousClass12.invoke(Boolean.FALSE, "unknown");
            }
        };
    }

    public DeliveryStatus deliver(String str, byte[] bArr, String str2, Map map) {
        DeliveryStatus deliveryStatus;
        Logger logger = (Logger) this.headers;
        TrafficStats.setThreadStatsTag(1);
        if (!((Extras.Key) this.endpoint).hasNetworkConnection()) {
            return DeliveryStatus.UNDELIVERED;
        }
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnection = makeRequest(new URL(str), bArr, str2, map);
                int responseCode = httpURLConnection.getResponseCode();
                DeliveryStatus.Companion.getClass();
                if (200 <= responseCode && responseCode < 300) {
                    deliveryStatus = DeliveryStatus.DELIVERED;
                } else if (400 <= responseCode && responseCode < 500 && responseCode != 408 && responseCode != 429) {
                    deliveryStatus = DeliveryStatus.FAILURE;
                } else {
                    deliveryStatus = DeliveryStatus.UNDELIVERED;
                }
                logRequestInfo(responseCode, httpURLConnection, deliveryStatus);
                httpURLConnection.disconnect();
                return deliveryStatus;
            } catch (IOException e) {
                logger.w("IOException encountered in request", e);
                DeliveryStatus deliveryStatus2 = DeliveryStatus.UNDELIVERED;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return deliveryStatus2;
            } catch (Exception e2) {
                logger.w("Unexpected error delivering payload", e2);
                DeliveryStatus deliveryStatus3 = DeliveryStatus.FAILURE;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return deliveryStatus3;
            } catch (OutOfMemoryError e3) {
                logger.w("Encountered OOM delivering payload, falling back to persist on disk", e3);
                DeliveryStatus deliveryStatus4 = DeliveryStatus.UNDELIVERED;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return deliveryStatus4;
            }
        } catch (Throwable th) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }
}
