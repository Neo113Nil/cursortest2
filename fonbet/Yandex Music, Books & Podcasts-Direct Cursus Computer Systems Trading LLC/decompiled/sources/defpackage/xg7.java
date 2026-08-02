package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.Decoder;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes6.dex */
public final class xg7 {
    public final TrackType a;
    public final String b;
    public final String c;
    public final tvs d;
    public final tvs e;
    public final hg7 f;
    public final int g;
    public final int h;
    public final MediaCodecReuseLog i;
    public final Boolean j;
    public final ngl k;
    public final tvs l;
    public final String m;
    public final int n;

    public xg7(TrackType trackType, String str, String str2, tvs tvsVar, tvs tvsVar2, hg7 hg7Var, int i, int i2, MediaCodecReuseLog mediaCodecReuseLog, Boolean bool, ngl nglVar) {
        trackType.getClass();
        this.a = trackType;
        this.b = str;
        this.c = str2;
        this.d = tvsVar;
        this.e = tvsVar2;
        this.f = hg7Var;
        this.g = i;
        this.h = i2;
        this.i = mediaCodecReuseLog;
        this.j = bool;
        this.k = nglVar;
        this.l = tvsVar == null ? tvsVar2 : tvsVar;
        this.m = str == null ? str2 : str;
        this.n = c() == 2 ? i2 + 1 : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v14, types: [hg7] */
    /* JADX WARN: Type inference failed for: r13v16, types: [tvs] */
    public static xg7 b(xg7 xg7Var, String str, String str2, isb isbVar, tvs tvsVar, bh3 bh3Var, int i, int i2, MediaCodecReuseLog mediaCodecReuseLog, Boolean bool, int i3) {
        TrackType trackType = xg7Var.a;
        if ((i3 & 2) != 0) {
            str = xg7Var.b;
        }
        String str3 = str;
        if ((i3 & 4) != 0) {
            str2 = xg7Var.c;
        }
        String str4 = str2;
        isb isbVar2 = (i3 & 8) != 0 ? xg7Var.d : isbVar;
        tvs tvsVar2 = (i3 & 16) != 0 ? xg7Var.e : tvsVar;
        bh3 bh3Var2 = (i3 & 32) != 0 ? xg7Var.f : bh3Var;
        int i4 = (i3 & 64) != 0 ? xg7Var.g : i;
        int i5 = (i3 & 128) != 0 ? xg7Var.h : i2;
        MediaCodecReuseLog mediaCodecReuseLog2 = (i3 & 256) != 0 ? xg7Var.i : mediaCodecReuseLog;
        Boolean bool2 = (i3 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? xg7Var.j : bool;
        ngl nglVar = xg7Var.k;
        trackType.getClass();
        nglVar.getClass();
        return new xg7(trackType, str3, str4, isbVar2, tvsVar2, bh3Var2, i4, i5, mediaCodecReuseLog2, bool2, nglVar);
    }

    public final boolean a() {
        String str = this.b;
        tvs tvsVar = this.d;
        if (str != null) {
            if (c() != 1 || tvsVar == null) {
                return false;
            }
        } else {
            if (tvsVar == null || this.c == null) {
                return false;
            }
            if (c() != 2 && c() != 3) {
                return false;
            }
        }
        return true;
    }

    public final int c() {
        hg7 hg7Var = this.f;
        if (hg7Var == null || hg7Var.c() == 0) {
            return 4;
        }
        if (hg7Var.c() > this.g) {
            return 1;
        }
        MediaCodecReuseLog mediaCodecReuseLog = this.i;
        return (mediaCodecReuseLog != null ? mediaCodecReuseLog.getReuseMethod() : null) == MediaCodecReuseLog.DecoderReuseMethod.DISCARD ? 3 : 2;
    }

    public final Decoder d() {
        DecoderEventData e = e(true, false, false);
        if (e != null) {
            return new Decoder(e.getName(), Integer.valueOf(e.getInits()), Integer.valueOf(e.getReuses()), Integer.valueOf(e.getReleases()), e.getIsHardwareAccelerated());
        }
        return null;
    }

    public final DecoderEventData e(boolean z, boolean z2, boolean z3) {
        String str;
        hg7 hg7Var;
        tvs tvsVar = this.l;
        if (tvsVar != null && (str = this.m) != null && (hg7Var = this.f) != null) {
            return quj.j(str, this.a, hg7Var, tvsVar, this.e, new ri0(2, this, z, z2));
        }
        if (!z3) {
            return null;
        }
        ngl.r(this.k, "DecoderUsageObserverImpl", "getEventData", "Invalid decoder data " + this, null, new Object[0], 8);
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg7)) {
            return false;
        }
        xg7 xg7Var = (xg7) obj;
        return this.a == xg7Var.a && Intrinsics.d(this.b, xg7Var.b) && Intrinsics.d(this.c, xg7Var.c) && Intrinsics.d(this.d, xg7Var.d) && Intrinsics.d(this.e, xg7Var.e) && Intrinsics.d(this.f, xg7Var.f) && this.g == xg7Var.g && this.h == xg7Var.h && Intrinsics.d(this.i, xg7Var.i) && Intrinsics.d(this.j, xg7Var.j) && Intrinsics.d(this.k, xg7Var.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        tvs tvsVar = this.d;
        int hashCode4 = (hashCode3 + (tvsVar == null ? 0 : tvsVar.hashCode())) * 31;
        tvs tvsVar2 = this.e;
        int hashCode5 = (hashCode4 + (tvsVar2 == null ? 0 : tvsVar2.hashCode())) * 31;
        hg7 hg7Var = this.f;
        int a = f1d.a(this.h, f1d.a(this.g, (hashCode5 + (hg7Var == null ? 0 : hg7Var.hashCode())) * 31, 31), 31);
        MediaCodecReuseLog mediaCodecReuseLog = this.i;
        int hashCode6 = (a + (mediaCodecReuseLog == null ? 0 : mediaCodecReuseLog.hashCode())) * 31;
        Boolean bool = this.j;
        return this.k.hashCode() + ((hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DecoderUpdates(trackType=" + this.a + ", newDecoder=" + this.b + ", lastDecoder=" + this.c + ", newTrack=" + this.d + ", lastTrack=" + this.e + ", decoderCounter=" + this.f + ", lastInitCount=" + this.g + ", lastReuseCount=" + this.h + ", reuseLog=" + this.i + ", isHardwareAccelerated=" + this.j + ", playerLogger=" + this.k + ')';
    }

    public /* synthetic */ xg7(TrackType trackType, ksa ksaVar) {
        this(trackType, null, null, null, null, null, 0, 0, null, null, ksaVar);
    }
}
