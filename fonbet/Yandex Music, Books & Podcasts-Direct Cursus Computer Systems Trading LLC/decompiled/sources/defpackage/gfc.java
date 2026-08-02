package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.StartFromCacheInfo;
import ru.yandex.video.m3.data.TrackSelectionType;

/* loaded from: classes6.dex */
public final class gfc {
    public final StartFromCacheInfo a;
    public final TrackSelectionType b;

    public gfc(StartFromCacheInfo startFromCacheInfo, TrackSelectionType trackSelectionType) {
        this.a = startFromCacheInfo;
        this.b = trackSelectionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!gfc.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        gfc gfcVar = (gfc) obj;
        return Intrinsics.d(this.a, gfcVar.a) && this.b == gfcVar.b;
    }

    public final int hashCode() {
        StartFromCacheInfo startFromCacheInfo = this.a;
        int hashCode = (startFromCacheInfo != null ? startFromCacheInfo.hashCode() : 0) * 31;
        TrackSelectionType trackSelectionType = this.b;
        return hashCode + (trackSelectionType != null ? trackSelectionType.hashCode() : 0);
    }

    public final String toString() {
        return "FirstPlaybackInfo(startFromCacheInfo=" + this.a + ", videoTrackSelectionType=" + this.b + ')';
    }
}
