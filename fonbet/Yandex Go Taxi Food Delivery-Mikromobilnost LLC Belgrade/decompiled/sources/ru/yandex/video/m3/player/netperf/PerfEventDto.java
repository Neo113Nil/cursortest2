package ru.yandex.video.m3.player.netperf;

import defpackage.jl40;
import defpackage.qv10;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BÃ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0002\u0010\u001bJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\t\u0010B\u001a\u00020\u0019HÆ\u0003J\t\u0010C\u001a\u00020\u0019HÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\t\u0010E\u001a\u00020\u0006HÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\t\u0010G\u001a\u00020\u0006HÆ\u0003J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\t\u0010I\u001a\u00020\u0006HÆ\u0003J\t\u0010J\u001a\u00020\u0006HÆ\u0003Jå\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019HÆ\u0001J\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010O\u001a\u00020PHÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR\u0011\u0010\u001a\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b4\u00100¨\u0006R"}, d2 = {"Lru/yandex/video/m3/player/netperf/PerfEventDto;", "", "name", "", "nextHopProtocol", "startTime", "", "domainLookupStart", "domainLookupEnd", "fetchStart", "connectStart", "secureConnectionStart", "connectEnd", "requestStart", "responseStart", "responseEnd", "duration", "transferSize", "decodedBodySize", "entryType", "initiatorType", "workerStart", "redirectStart", "redirectEnd", "serverTiming", "Lru/yandex/video/m3/player/netperf/IntArrayWrapper;", "workerTiming", "(Ljava/lang/String;Ljava/lang/String;JJJJJJJJJJJJJLjava/lang/String;Ljava/lang/String;JJJLru/yandex/video/m3/player/netperf/IntArrayWrapper;Lru/yandex/video/m3/player/netperf/IntArrayWrapper;)V", "getConnectEnd", "()J", "getConnectStart", "getDecodedBodySize", "getDomainLookupEnd", "getDomainLookupStart", "getDuration", "getEntryType", "()Ljava/lang/String;", "getFetchStart", "getInitiatorType", "getName", "getNextHopProtocol", "getRedirectEnd", "getRedirectStart", "getRequestStart", "getResponseEnd", "getResponseStart", "getSecureConnectionStart", "getServerTiming", "()Lru/yandex/video/m3/player/netperf/IntArrayWrapper;", "getStartTime", "getTransferSize", "getWorkerStart", "getWorkerTiming", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PerfEventDto {
    public static final int $stable = 8;
    private final long connectEnd;
    private final long connectStart;
    private final long decodedBodySize;
    private final long domainLookupEnd;
    private final long domainLookupStart;
    private final long duration;
    private final String entryType;
    private final long fetchStart;
    private final String initiatorType;
    private final String name;
    private final String nextHopProtocol;
    private final long redirectEnd;
    private final long redirectStart;
    private final long requestStart;
    private final long responseEnd;
    private final long responseStart;
    private final long secureConnectionStart;
    private final IntArrayWrapper serverTiming;
    private final long startTime;
    private final long transferSize;
    private final long workerStart;
    private final IntArrayWrapper workerTiming;

    public /* synthetic */ PerfEventDto(String str, String str2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, String str3, String str4, long j14, long j15, long j16, IntArrayWrapper intArrayWrapper, IntArrayWrapper intArrayWrapper2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, (i & 32768) != 0 ? "resource" : str3, (i & 65536) != 0 ? "" : str4, (i & 131072) != 0 ? 0L : j14, (i & 262144) != 0 ? 0L : j15, (i & 524288) != 0 ? 0L : j16, (i & 1048576) != 0 ? IntArrayWrapperKt.getEmptyIntArrayWrapper() : intArrayWrapper, (i & 2097152) != 0 ? IntArrayWrapperKt.getEmptyIntArrayWrapper() : intArrayWrapper2);
    }

    public static /* synthetic */ PerfEventDto copy$default(PerfEventDto perfEventDto, String str, String str2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, String str3, String str4, long j14, long j15, long j16, IntArrayWrapper intArrayWrapper, IntArrayWrapper intArrayWrapper2, int i, Object obj) {
        IntArrayWrapper intArrayWrapper3;
        long j17;
        long j18;
        long j19;
        String str5;
        long j20;
        String str6;
        long j21;
        long j22;
        IntArrayWrapper intArrayWrapper4;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j30;
        long j31;
        long j32;
        String str7 = (i & 1) != 0 ? perfEventDto.name : str;
        String str8 = (i & 2) != 0 ? perfEventDto.nextHopProtocol : str2;
        long j33 = (i & 4) != 0 ? perfEventDto.startTime : j;
        long j34 = (i & 8) != 0 ? perfEventDto.domainLookupStart : j2;
        long j35 = (i & 16) != 0 ? perfEventDto.domainLookupEnd : j3;
        long j36 = (i & 32) != 0 ? perfEventDto.fetchStart : j4;
        long j37 = (i & 64) != 0 ? perfEventDto.connectStart : j5;
        long j38 = (i & 128) != 0 ? perfEventDto.secureConnectionStart : j6;
        String str9 = str7;
        String str10 = str8;
        long j39 = (i & 256) != 0 ? perfEventDto.connectEnd : j7;
        long j40 = (i & 512) != 0 ? perfEventDto.requestStart : j8;
        long j41 = (i & 1024) != 0 ? perfEventDto.responseStart : j9;
        long j42 = (i & 2048) != 0 ? perfEventDto.responseEnd : j10;
        long j43 = (i & 4096) != 0 ? perfEventDto.duration : j11;
        long j44 = (i & 8192) != 0 ? perfEventDto.transferSize : j12;
        long j45 = (i & 16384) != 0 ? perfEventDto.decodedBodySize : j13;
        String str11 = (i & 32768) != 0 ? perfEventDto.entryType : str3;
        String str12 = (i & 65536) != 0 ? perfEventDto.initiatorType : str4;
        long j46 = j45;
        long j47 = (i & 131072) != 0 ? perfEventDto.workerStart : j14;
        long j48 = (i & 262144) != 0 ? perfEventDto.redirectStart : j15;
        long j49 = (i & 524288) != 0 ? perfEventDto.redirectEnd : j16;
        IntArrayWrapper intArrayWrapper5 = (i & 1048576) != 0 ? perfEventDto.serverTiming : intArrayWrapper;
        if ((i & 2097152) != 0) {
            j17 = j49;
            intArrayWrapper3 = perfEventDto.workerTiming;
            j19 = j44;
            str5 = str11;
            j20 = j46;
            str6 = str12;
            j21 = j47;
            j22 = j48;
            intArrayWrapper4 = intArrayWrapper5;
            j24 = j38;
            j25 = j39;
            j26 = j40;
            j27 = j41;
            j28 = j42;
            j18 = j43;
            j29 = j33;
            j30 = j34;
            j31 = j35;
            j32 = j36;
            j23 = j37;
        } else {
            intArrayWrapper3 = intArrayWrapper2;
            j17 = j49;
            j18 = j43;
            j19 = j44;
            str5 = str11;
            j20 = j46;
            str6 = str12;
            j21 = j47;
            j22 = j48;
            intArrayWrapper4 = intArrayWrapper5;
            j23 = j37;
            j24 = j38;
            j25 = j39;
            j26 = j40;
            j27 = j41;
            j28 = j42;
            j29 = j33;
            j30 = j34;
            j31 = j35;
            j32 = j36;
        }
        return perfEventDto.copy(str9, str10, j29, j30, j31, j32, j23, j24, j25, j26, j27, j28, j18, j19, j20, str5, str6, j21, j22, j17, intArrayWrapper4, intArrayWrapper3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final long getRequestStart() {
        return this.requestStart;
    }

    /* renamed from: component11, reason: from getter */
    public final long getResponseStart() {
        return this.responseStart;
    }

    /* renamed from: component12, reason: from getter */
    public final long getResponseEnd() {
        return this.responseEnd;
    }

    /* renamed from: component13, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* renamed from: component14, reason: from getter */
    public final long getTransferSize() {
        return this.transferSize;
    }

    /* renamed from: component15, reason: from getter */
    public final long getDecodedBodySize() {
        return this.decodedBodySize;
    }

    /* renamed from: component16, reason: from getter */
    public final String getEntryType() {
        return this.entryType;
    }

    /* renamed from: component17, reason: from getter */
    public final String getInitiatorType() {
        return this.initiatorType;
    }

    /* renamed from: component18, reason: from getter */
    public final long getWorkerStart() {
        return this.workerStart;
    }

    /* renamed from: component19, reason: from getter */
    public final long getRedirectStart() {
        return this.redirectStart;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNextHopProtocol() {
        return this.nextHopProtocol;
    }

    /* renamed from: component20, reason: from getter */
    public final long getRedirectEnd() {
        return this.redirectEnd;
    }

    /* renamed from: component21, reason: from getter */
    public final IntArrayWrapper getServerTiming() {
        return this.serverTiming;
    }

    /* renamed from: component22, reason: from getter */
    public final IntArrayWrapper getWorkerTiming() {
        return this.workerTiming;
    }

    /* renamed from: component3, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDomainLookupStart() {
        return this.domainLookupStart;
    }

    /* renamed from: component5, reason: from getter */
    public final long getDomainLookupEnd() {
        return this.domainLookupEnd;
    }

    /* renamed from: component6, reason: from getter */
    public final long getFetchStart() {
        return this.fetchStart;
    }

    /* renamed from: component7, reason: from getter */
    public final long getConnectStart() {
        return this.connectStart;
    }

    /* renamed from: component8, reason: from getter */
    public final long getSecureConnectionStart() {
        return this.secureConnectionStart;
    }

    /* renamed from: component9, reason: from getter */
    public final long getConnectEnd() {
        return this.connectEnd;
    }

    public final PerfEventDto copy(String name, String nextHopProtocol, long startTime, long domainLookupStart, long domainLookupEnd, long fetchStart, long connectStart, long secureConnectionStart, long connectEnd, long requestStart, long responseStart, long responseEnd, long duration, long transferSize, long decodedBodySize, String entryType, String initiatorType, long workerStart, long redirectStart, long redirectEnd, IntArrayWrapper serverTiming, IntArrayWrapper workerTiming) {
        return new PerfEventDto(name, nextHopProtocol, startTime, domainLookupStart, domainLookupEnd, fetchStart, connectStart, secureConnectionStart, connectEnd, requestStart, responseStart, responseEnd, duration, transferSize, decodedBodySize, entryType, initiatorType, workerStart, redirectStart, redirectEnd, serverTiming, workerTiming);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerfEventDto)) {
            return false;
        }
        PerfEventDto perfEventDto = (PerfEventDto) other;
        return jl40.l(this.name, perfEventDto.name) && jl40.l(this.nextHopProtocol, perfEventDto.nextHopProtocol) && this.startTime == perfEventDto.startTime && this.domainLookupStart == perfEventDto.domainLookupStart && this.domainLookupEnd == perfEventDto.domainLookupEnd && this.fetchStart == perfEventDto.fetchStart && this.connectStart == perfEventDto.connectStart && this.secureConnectionStart == perfEventDto.secureConnectionStart && this.connectEnd == perfEventDto.connectEnd && this.requestStart == perfEventDto.requestStart && this.responseStart == perfEventDto.responseStart && this.responseEnd == perfEventDto.responseEnd && this.duration == perfEventDto.duration && this.transferSize == perfEventDto.transferSize && this.decodedBodySize == perfEventDto.decodedBodySize && jl40.l(this.entryType, perfEventDto.entryType) && jl40.l(this.initiatorType, perfEventDto.initiatorType) && this.workerStart == perfEventDto.workerStart && this.redirectStart == perfEventDto.redirectStart && this.redirectEnd == perfEventDto.redirectEnd && jl40.l(this.serverTiming, perfEventDto.serverTiming) && jl40.l(this.workerTiming, perfEventDto.workerTiming);
    }

    public final long getConnectEnd() {
        return this.connectEnd;
    }

    public final long getConnectStart() {
        return this.connectStart;
    }

    public final long getDecodedBodySize() {
        return this.decodedBodySize;
    }

    public final long getDomainLookupEnd() {
        return this.domainLookupEnd;
    }

    public final long getDomainLookupStart() {
        return this.domainLookupStart;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getEntryType() {
        return this.entryType;
    }

    public final long getFetchStart() {
        return this.fetchStart;
    }

    public final String getInitiatorType() {
        return this.initiatorType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNextHopProtocol() {
        return this.nextHopProtocol;
    }

    public final long getRedirectEnd() {
        return this.redirectEnd;
    }

    public final long getRedirectStart() {
        return this.redirectStart;
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

    public final IntArrayWrapper getServerTiming() {
        return this.serverTiming;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getTransferSize() {
        return this.transferSize;
    }

    public final long getWorkerStart() {
        return this.workerStart;
    }

    public final IntArrayWrapper getWorkerTiming() {
        return this.workerTiming;
    }

    public int hashCode() {
        return this.workerTiming.hashCode() + ((this.serverTiming.hashCode() + qv10.c(qv10.c(qv10.c(unr0.b(unr0.b(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(qv10.c(unr0.b(this.name.hashCode() * 31, 31, this.nextHopProtocol), 31, this.startTime), 31, this.domainLookupStart), 31, this.domainLookupEnd), 31, this.fetchStart), 31, this.connectStart), 31, this.secureConnectionStart), 31, this.connectEnd), 31, this.requestStart), 31, this.responseStart), 31, this.responseEnd), 31, this.duration), 31, this.transferSize), 31, this.decodedBodySize), 31, this.entryType), 31, this.initiatorType), 31, this.workerStart), 31, this.redirectStart), 31, this.redirectEnd)) * 31);
    }

    public String toString() {
        return "PerfEventDto(name=" + this.name + ", nextHopProtocol=" + this.nextHopProtocol + ", startTime=" + this.startTime + ", domainLookupStart=" + this.domainLookupStart + ", domainLookupEnd=" + this.domainLookupEnd + ", fetchStart=" + this.fetchStart + ", connectStart=" + this.connectStart + ", secureConnectionStart=" + this.secureConnectionStart + ", connectEnd=" + this.connectEnd + ", requestStart=" + this.requestStart + ", responseStart=" + this.responseStart + ", responseEnd=" + this.responseEnd + ", duration=" + this.duration + ", transferSize=" + this.transferSize + ", decodedBodySize=" + this.decodedBodySize + ", entryType=" + this.entryType + ", initiatorType=" + this.initiatorType + ", workerStart=" + this.workerStart + ", redirectStart=" + this.redirectStart + ", redirectEnd=" + this.redirectEnd + ", serverTiming=" + this.serverTiming + ", workerTiming=" + this.workerTiming + ')';
    }

    public PerfEventDto(String str, String str2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, String str3, String str4, long j14, long j15, long j16, IntArrayWrapper intArrayWrapper, IntArrayWrapper intArrayWrapper2) {
        this.name = str;
        this.nextHopProtocol = str2;
        this.startTime = j;
        this.domainLookupStart = j2;
        this.domainLookupEnd = j3;
        this.fetchStart = j4;
        this.connectStart = j5;
        this.secureConnectionStart = j6;
        this.connectEnd = j7;
        this.requestStart = j8;
        this.responseStart = j9;
        this.responseEnd = j10;
        this.duration = j11;
        this.transferSize = j12;
        this.decodedBodySize = j13;
        this.entryType = str3;
        this.initiatorType = str4;
        this.workerStart = j14;
        this.redirectStart = j15;
        this.redirectEnd = j16;
        this.serverTiming = intArrayWrapper;
        this.workerTiming = intArrayWrapper2;
    }
}
