package ru.yandex.video.m3.player.netperf;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import defpackage.b64;
import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u008b\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\u0018\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0006H\u0002J\u000e\u00107\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0006J\u0006\u00108\u001a\u000209J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u0006;"}, d2 = {"Lru/yandex/video/m3/player/netperf/NetPerfEvent;", "", "name", "", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, "startTime", "", "dnsStart", "dnsEnd", "connectStart", "secureConnectionStart", "connectEnd", "requestStart", "responseStart", "responseEnd", "transferSize", "duration", "(Ljava/lang/String;Ljava/lang/String;JJJJJJJJJJJ)V", "getConnectEnd", "()J", "getConnectStart", "getDnsEnd", "getDnsStart", "getDuration", "getName", "()Ljava/lang/String;", "getProtocol", "getRequestStart", "getResponseEnd", "getResponseStart", "getSecureConnectionStart", "getStartTime", "getTransferSize", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "relOrZero", "eventTime", "baseEventTime", "relativeToTimestamp", "toDto", "Lru/yandex/video/m3/player/netperf/PerfEventDto;", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class NetPerfEvent {
    public static final int $stable = 0;
    private final long connectEnd;
    private final long connectStart;
    private final long dnsEnd;
    private final long dnsStart;
    private final long duration;
    private final String name;
    private final String protocol;
    private final long requestStart;
    private final long responseEnd;
    private final long responseStart;
    private final long secureConnectionStart;
    private final long startTime;
    private final long transferSize;

    public NetPerfEvent(String str, String str2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.name = str;
        this.protocol = str2;
        this.startTime = j;
        this.dnsStart = j2;
        this.dnsEnd = j3;
        this.connectStart = j4;
        this.secureConnectionStart = j5;
        this.connectEnd = j6;
        this.requestStart = j7;
        this.responseStart = j8;
        this.responseEnd = j9;
        this.transferSize = j10;
        this.duration = j11;
    }

    public static /* synthetic */ NetPerfEvent copy$default(NetPerfEvent netPerfEvent, String str, String str2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i, Object obj) {
        long j12;
        long j13;
        String str3 = (i & 1) != 0 ? netPerfEvent.name : str;
        String str4 = (i & 2) != 0 ? netPerfEvent.protocol : str2;
        long j14 = (i & 4) != 0 ? netPerfEvent.startTime : j;
        long j15 = (i & 8) != 0 ? netPerfEvent.dnsStart : j2;
        long j16 = (i & 16) != 0 ? netPerfEvent.dnsEnd : j3;
        long j17 = (i & 32) != 0 ? netPerfEvent.connectStart : j4;
        long j18 = (i & 64) != 0 ? netPerfEvent.secureConnectionStart : j5;
        long j19 = (i & 128) != 0 ? netPerfEvent.connectEnd : j6;
        String str5 = str3;
        String str6 = str4;
        long j20 = (i & 256) != 0 ? netPerfEvent.requestStart : j7;
        long j21 = (i & 512) != 0 ? netPerfEvent.responseStart : j8;
        long j22 = (i & 1024) != 0 ? netPerfEvent.responseEnd : j9;
        long j23 = (i & 2048) != 0 ? netPerfEvent.transferSize : j10;
        if ((i & 4096) != 0) {
            j13 = j23;
            j12 = netPerfEvent.duration;
        } else {
            j12 = j11;
            j13 = j23;
        }
        return netPerfEvent.copy(str5, str6, j14, j15, j16, j17, j18, j19, j20, j21, j22, j13, j12);
    }

    private final long relOrZero(long eventTime, long baseEventTime) {
        return eventTime == 0 ? eventTime : eventTime - baseEventTime;
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final long getResponseStart() {
        return this.responseStart;
    }

    /* renamed from: component11, reason: from getter */
    public final long getResponseEnd() {
        return this.responseEnd;
    }

    /* renamed from: component12, reason: from getter */
    public final long getTransferSize() {
        return this.transferSize;
    }

    /* renamed from: component13, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProtocol() {
        return this.protocol;
    }

    /* renamed from: component3, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDnsStart() {
        return this.dnsStart;
    }

    /* renamed from: component5, reason: from getter */
    public final long getDnsEnd() {
        return this.dnsEnd;
    }

    /* renamed from: component6, reason: from getter */
    public final long getConnectStart() {
        return this.connectStart;
    }

    /* renamed from: component7, reason: from getter */
    public final long getSecureConnectionStart() {
        return this.secureConnectionStart;
    }

    /* renamed from: component8, reason: from getter */
    public final long getConnectEnd() {
        return this.connectEnd;
    }

    /* renamed from: component9, reason: from getter */
    public final long getRequestStart() {
        return this.requestStart;
    }

    public final NetPerfEvent copy(String name, String protocol, long startTime, long dnsStart, long dnsEnd, long connectStart, long secureConnectionStart, long connectEnd, long requestStart, long responseStart, long responseEnd, long transferSize, long duration) {
        return new NetPerfEvent(name, protocol, startTime, dnsStart, dnsEnd, connectStart, secureConnectionStart, connectEnd, requestStart, responseStart, responseEnd, transferSize, duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetPerfEvent)) {
            return false;
        }
        NetPerfEvent netPerfEvent = (NetPerfEvent) other;
        return jl40.l(this.name, netPerfEvent.name) && jl40.l(this.protocol, netPerfEvent.protocol) && this.startTime == netPerfEvent.startTime && this.dnsStart == netPerfEvent.dnsStart && this.dnsEnd == netPerfEvent.dnsEnd && this.connectStart == netPerfEvent.connectStart && this.secureConnectionStart == netPerfEvent.secureConnectionStart && this.connectEnd == netPerfEvent.connectEnd && this.requestStart == netPerfEvent.requestStart && this.responseStart == netPerfEvent.responseStart && this.responseEnd == netPerfEvent.responseEnd && this.transferSize == netPerfEvent.transferSize && this.duration == netPerfEvent.duration;
    }

    public final long getConnectEnd() {
        return this.connectEnd;
    }

    public final long getConnectStart() {
        return this.connectStart;
    }

    public final long getDnsEnd() {
        return this.dnsEnd;
    }

    public final long getDnsStart() {
        return this.dnsStart;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final long getRequestStart() {
        return this.requestStart;
    }

    public final long getResponseEnd() {
        return this.responseEnd;
    }

    public final long getResponseStart() {
        return this.responseStart;
    }

    public final long getSecureConnectionStart() {
        return this.secureConnectionStart;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getTransferSize() {
        return this.transferSize;
    }

    public int hashCode() {
        return Long.hashCode(this.duration) + qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(unr0.b(this.name.hashCode() * 31, 31, this.protocol), 31, this.startTime), 31, this.dnsStart), 31, this.dnsEnd), 31, this.connectStart), 31, this.secureConnectionStart), 31, this.connectEnd), 31, this.requestStart), 31, this.responseStart), 31, this.responseEnd), 31, this.transferSize);
    }

    public final NetPerfEvent relativeToTimestamp(long baseEventTime) {
        return copy$default(this, null, null, relOrZero(this.startTime, baseEventTime), relOrZero(this.dnsStart, baseEventTime), relOrZero(this.dnsEnd, baseEventTime), relOrZero(this.connectStart, baseEventTime), relOrZero(this.secureConnectionStart, baseEventTime), relOrZero(this.connectEnd, baseEventTime), relOrZero(this.requestStart, baseEventTime), relOrZero(this.responseStart, baseEventTime), relOrZero(this.responseEnd, baseEventTime), 0L, 0L, 6147, null);
    }

    public final PerfEventDto toDto() {
        String str = this.name;
        String str2 = this.protocol;
        long j = this.startTime;
        long j2 = this.dnsStart;
        long j3 = this.dnsEnd;
        long j4 = this.connectStart;
        long j5 = this.secureConnectionStart;
        long j6 = this.connectEnd;
        long j7 = this.requestStart;
        long j8 = this.responseStart;
        long j9 = this.responseEnd;
        long j10 = this.duration;
        long j11 = this.transferSize;
        return new PerfEventDto(str, str2, j, j2, j3, j, j4, j5, j6, j7, j8, j9, j10, j11, j11, null, null, 0L, 0L, 0L, null, null, 4161536, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NetPerfEvent(name=");
        sb.append(this.name);
        sb.append(", protocol=");
        sb.append(this.protocol);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", dnsStart=");
        sb.append(this.dnsStart);
        sb.append(", dnsEnd=");
        sb.append(this.dnsEnd);
        sb.append(", connectStart=");
        sb.append(this.connectStart);
        sb.append(", secureConnectionStart=");
        sb.append(this.secureConnectionStart);
        sb.append(", connectEnd=");
        sb.append(this.connectEnd);
        sb.append(", requestStart=");
        sb.append(this.requestStart);
        sb.append(", responseStart=");
        sb.append(this.responseStart);
        sb.append(", responseEnd=");
        sb.append(this.responseEnd);
        sb.append(", transferSize=");
        sb.append(this.transferSize);
        sb.append(", duration=");
        return b64.o(sb, this.duration, ')');
    }
}
