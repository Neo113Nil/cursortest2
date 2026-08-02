package ru.yandex.video.m3.player.ui.debug.internal.model;

import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.ui.debug.model.LatencyData;
import ru.yandex.video.m3.player.ui.debug.model.SessionColor;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J<\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/model/TimerData;", "", "latencyData", "Lru/yandex/video/m3/player/ui/debug/model/LatencyData;", "dateTime", "", "targetBufferSize", "", "sessionColor", "Lru/yandex/video/m3/player/ui/debug/model/SessionColor;", "(Lru/yandex/video/m3/player/ui/debug/model/LatencyData;Ljava/lang/String;Ljava/lang/Long;Lru/yandex/video/m3/player/ui/debug/model/SessionColor;)V", "getDateTime", "()Ljava/lang/String;", "getLatencyData", "()Lru/yandex/video/m3/player/ui/debug/model/LatencyData;", "getSessionColor", "()Lru/yandex/video/m3/player/ui/debug/model/SessionColor;", "getTargetBufferSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Lru/yandex/video/m3/player/ui/debug/model/LatencyData;Ljava/lang/String;Ljava/lang/Long;Lru/yandex/video/m3/player/ui/debug/model/SessionColor;)Lru/yandex/video/m3/player/ui/debug/internal/model/TimerData;", "equals", "", "other", "hashCode", "", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TimerData {
    public static final int $stable = 0;
    private final String dateTime;
    private final LatencyData latencyData;
    private final SessionColor sessionColor;
    private final Long targetBufferSize;

    public /* synthetic */ TimerData(LatencyData latencyData, String str, Long l, SessionColor sessionColor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : latencyData, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? SessionColor.NONE : sessionColor);
    }

    public static /* synthetic */ TimerData copy$default(TimerData timerData, LatencyData latencyData, String str, Long l, SessionColor sessionColor, int i, Object obj) {
        if ((i & 1) != 0) {
            latencyData = timerData.latencyData;
        }
        if ((i & 2) != 0) {
            str = timerData.dateTime;
        }
        if ((i & 4) != 0) {
            l = timerData.targetBufferSize;
        }
        if ((i & 8) != 0) {
            sessionColor = timerData.sessionColor;
        }
        return timerData.copy(latencyData, str, l, sessionColor);
    }

    /* renamed from: component1, reason: from getter */
    public final LatencyData getLatencyData() {
        return this.latencyData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDateTime() {
        return this.dateTime;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getTargetBufferSize() {
        return this.targetBufferSize;
    }

    /* renamed from: component4, reason: from getter */
    public final SessionColor getSessionColor() {
        return this.sessionColor;
    }

    public final TimerData copy(LatencyData latencyData, String dateTime, Long targetBufferSize, SessionColor sessionColor) {
        return new TimerData(latencyData, dateTime, targetBufferSize, sessionColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerData)) {
            return false;
        }
        TimerData timerData = (TimerData) other;
        return jl40.l(this.latencyData, timerData.latencyData) && jl40.l(this.dateTime, timerData.dateTime) && jl40.l(this.targetBufferSize, timerData.targetBufferSize) && this.sessionColor == timerData.sessionColor;
    }

    public final String getDateTime() {
        return this.dateTime;
    }

    public final LatencyData getLatencyData() {
        return this.latencyData;
    }

    public final SessionColor getSessionColor() {
        return this.sessionColor;
    }

    public final Long getTargetBufferSize() {
        return this.targetBufferSize;
    }

    public int hashCode() {
        LatencyData latencyData = this.latencyData;
        int hashCode = (latencyData == null ? 0 : latencyData.hashCode()) * 31;
        String str = this.dateTime;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.targetBufferSize;
        return this.sessionColor.hashCode() + ((hashCode2 + (l != null ? l.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "TimerData(latencyData=" + this.latencyData + ", dateTime=" + this.dateTime + ", targetBufferSize=" + this.targetBufferSize + ", sessionColor=" + this.sessionColor + ')';
    }

    public TimerData(LatencyData latencyData, String str, Long l, SessionColor sessionColor) {
        this.latencyData = latencyData;
        this.dateTime = str;
        this.targetBufferSize = l;
        this.sessionColor = sessionColor;
    }

    public TimerData() {
        this(null, null, null, null, 15, null);
    }
}
