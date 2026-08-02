package com.datadog.android.okhttp;

import androidx.room.util.DBUtil;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.trifle.KeyHandle$keyPair$2;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.SdkReference$1;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.domain.event.ResourceTiming;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import com.datadog.android.rum.resource.ResourceId;
import com.google.android.gms.internal.mlkit_vision_common.zzhu;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes9.dex */
public final class DatadogEventListener extends EventListener {
    public long bodyEnd;
    public long bodyStart;
    public long callStart;
    public long connEnd;
    public long connStart;
    public long dnsEnd;
    public long dnsStart;
    public long headersEnd;
    public long headersStart;
    public final ResourceId key;
    public final InternalSdkCore sdkCore;
    public long sslEnd;
    public long sslStart;

    /* loaded from: classes.dex */
    public final class Factory implements EventListener.Factory {
        public static final DatadogEventListener$Factory$Companion$NO_OP_EVENT_LISTENER$1 NO_OP_EVENT_LISTENER = new DatadogEventListener$Factory$Companion$NO_OP_EVENT_LISTENER$1();
        public final WorkLauncherImpl sdkCoreReference = new WorkLauncherImpl((Function1) SdkReference$1.INSTANCE);

        @Override // okhttp3.EventListener.Factory
        public final EventListener create(RealCall realCall) {
            ResourceId buildResourceId = zzhu.buildResourceId(realCall.originalRequest);
            InternalSdkCore internalSdkCore = this.sdkCoreReference.get();
            if (internalSdkCore != null) {
                return new DatadogEventListener(internalSdkCore, buildResourceId);
            }
            InternalLogger.Companion.getClass();
            DBUtil.log$default(InternalLogger.Companion.UNBOUND, 3, InternalLogger.Target.USER, new KeyHandle$keyPair$2(realCall, 21), null, false, 56);
            return NO_OP_EVENT_LISTENER;
        }
    }

    public DatadogEventListener(InternalSdkCore internalSdkCore, ResourceId resourceId) {
        this.sdkCore = internalSdkCore;
        this.key = resourceId;
    }

    @Override // okhttp3.EventListener
    public final void callEnd(Call call) {
        call.getClass();
        super.callEnd(call);
        sendTiming();
    }

    @Override // okhttp3.EventListener
    public final void callFailed(Call call, IOException iOException) {
        call.getClass();
        iOException.getClass();
        super.callFailed(call, iOException);
        sendTiming();
    }

    @Override // okhttp3.EventListener
    public final void callStart(Call call) {
        call.getClass();
        super.callStart(call);
        sendWaitForResourceTimingEvent();
        this.callStart = this.sdkCore.getTime().deviceTimeNs;
    }

    @Override // okhttp3.EventListener
    public final void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        this.connEnd = this.sdkCore.getTime().deviceTimeNs;
    }

    @Override // okhttp3.EventListener
    public final void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        super.connectStart(call, inetSocketAddress, proxy);
        sendWaitForResourceTimingEvent();
        this.connStart = this.sdkCore.getTime().deviceTimeNs;
    }

    @Override // okhttp3.EventListener
    public final void dnsEnd(Call call, String str, List list) {
        call.getClass();
        str.getClass();
        list.getClass();
        super.dnsEnd(call, str, list);
        this.dnsEnd = this.sdkCore.getTime().deviceTimeNs;
    }

    @Override // okhttp3.EventListener
    public final void dnsStart(Call call, String str) {
        call.getClass();
        str.getClass();
        super.dnsStart(call, str);
        sendWaitForResourceTimingEvent();
        this.dnsStart = this.sdkCore.getTime().deviceTimeNs;
    }

    @Override // okhttp3.EventListener
    public final void responseBodyEnd(Call call, long j) {
        call.getClass();
        super.responseBodyEnd(call, j);
        this.bodyEnd = this.sdkCore.getTime().deviceTimeNs;
    }

    @Override // okhttp3.EventListener
    public final void responseBodyStart(Call call) {
        call.getClass();
        super.responseBodyStart(call);
        sendWaitForResourceTimingEvent();
        this.bodyStart = this.sdkCore.getTime().deviceTimeNs;
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersEnd(Call call, Response response) {
        call.getClass();
        response.getClass();
        super.responseHeadersEnd(call, response);
        this.headersEnd = this.sdkCore.getTime().deviceTimeNs;
        if (response.code >= 400) {
            sendTiming();
        }
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersStart(Call call) {
        call.getClass();
        super.responseHeadersStart(call);
        sendWaitForResourceTimingEvent();
        this.headersStart = this.sdkCore.getTime().deviceTimeNs;
    }

    @Override // okhttp3.EventListener
    public final void secureConnectEnd(Call call, Handshake handshake) {
        this.sslEnd = this.sdkCore.getTime().deviceTimeNs;
    }

    @Override // okhttp3.EventListener
    public final void secureConnectStart(Call call) {
        call.getClass();
        super.secureConnectStart(call);
        sendWaitForResourceTimingEvent();
        this.sslStart = this.sdkCore.getTime().deviceTimeNs;
    }

    public final void sendTiming() {
        long j;
        Pair pair;
        long j2 = this.dnsStart;
        Pair pair2 = j2 == 0 ? new Pair(0L, 0L) : new Pair(Long.valueOf(j2 - this.callStart), Long.valueOf(this.dnsEnd - this.dnsStart));
        long longValue = ((Number) pair2.first).longValue();
        long longValue2 = ((Number) pair2.second).longValue();
        long j3 = this.connStart;
        Pair pair3 = j3 == 0 ? new Pair(0L, 0L) : new Pair(Long.valueOf(j3 - this.callStart), Long.valueOf(this.connEnd - this.connStart));
        long longValue3 = ((Number) pair3.first).longValue();
        long longValue4 = ((Number) pair3.second).longValue();
        long j4 = this.sslStart;
        if (j4 == 0) {
            pair = new Pair(0L, 0L);
            j = 0;
        } else {
            j = 0;
            pair = new Pair(Long.valueOf(j4 - this.callStart), Long.valueOf(this.sslEnd - this.sslStart));
        }
        long longValue5 = ((Number) pair.first).longValue();
        long longValue6 = ((Number) pair.second).longValue();
        long j5 = this.headersStart;
        Pair pair4 = j5 == j ? new Pair(0L, 0L) : new Pair(Long.valueOf(j5 - this.callStart), Long.valueOf(this.headersEnd - this.headersStart));
        long longValue7 = ((Number) pair4.first).longValue();
        long longValue8 = ((Number) pair4.second).longValue();
        long j6 = this.bodyStart;
        Pair pair5 = j6 == j ? new Pair(0L, 0L) : new Pair(Long.valueOf(j6 - this.callStart), Long.valueOf(this.bodyEnd - this.bodyStart));
        ResourceTiming resourceTiming = new ResourceTiming(longValue, longValue2, longValue3, longValue4, longValue5, longValue6, longValue7, longValue8, ((Number) pair5.first).longValue(), ((Number) pair5.second).longValue());
        RumMonitor rumMonitor = GlobalRumMonitor.get(this.sdkCore);
        AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
        if (advancedRumMonitor != null) {
            advancedRumMonitor.addResourceTiming(this.key, resourceTiming);
        }
    }

    public final void sendWaitForResourceTimingEvent() {
        RumMonitor rumMonitor = GlobalRumMonitor.get(this.sdkCore);
        AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
        if (advancedRumMonitor != null) {
            advancedRumMonitor.waitForResourceTiming(this.key);
        }
    }
}
