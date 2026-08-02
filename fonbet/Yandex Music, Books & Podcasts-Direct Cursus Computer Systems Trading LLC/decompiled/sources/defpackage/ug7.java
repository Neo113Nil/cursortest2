package defpackage;

import com.appsflyer.internal.k;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.MediaCodecReuseLog;
import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes6.dex */
public final class ug7 {
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
    public final tvs k;
    public final String l;
    public final int m;

    public ug7(TrackType trackType, String str, String str2, tvs tvsVar, tvs tvsVar2, hg7 hg7Var, int i, int i2, MediaCodecReuseLog mediaCodecReuseLog, Boolean bool) {
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
        this.k = tvsVar == null ? tvsVar2 : tvsVar;
        this.l = str == null ? str2 : str;
        this.m = c() == 2 ? i2 + 1 : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [tvs] */
    /* JADX WARN: Type inference failed for: r7v3, types: [hg7] */
    public static ug7 b(ug7 ug7Var, String str, String str2, isb isbVar, tvs tvsVar, bh3 bh3Var, int i, int i2, MediaCodecReuseLog mediaCodecReuseLog, Boolean bool, int i3) {
        String str3 = str;
        TrackType trackType = ug7Var.a;
        if ((i3 & 2) != 0) {
            str3 = ug7Var.b;
        }
        if ((i3 & 4) != 0) {
            str2 = ug7Var.c;
        }
        isb isbVar2 = isbVar;
        if ((i3 & 8) != 0) {
            isbVar2 = ug7Var.d;
        }
        if ((i3 & 16) != 0) {
            tvsVar = ug7Var.e;
        }
        bh3 bh3Var2 = bh3Var;
        if ((i3 & 32) != 0) {
            bh3Var2 = ug7Var.f;
        }
        if ((i3 & 64) != 0) {
            i = ug7Var.g;
        }
        if ((i3 & 128) != 0) {
            i2 = ug7Var.h;
        }
        if ((i3 & 256) != 0) {
            mediaCodecReuseLog = ug7Var.i;
        }
        if ((i3 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
            bool = ug7Var.j;
        }
        Boolean bool2 = bool;
        trackType.getClass();
        MediaCodecReuseLog mediaCodecReuseLog2 = mediaCodecReuseLog;
        int i4 = i2;
        int i5 = i;
        bh3 bh3Var3 = bh3Var2;
        tvs tvsVar2 = tvsVar;
        isb isbVar3 = isbVar2;
        return new ug7(trackType, str3, str2, isbVar3, tvsVar2, bh3Var3, i5, i4, mediaCodecReuseLog2, bool2);
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug7)) {
            return false;
        }
        ug7 ug7Var = (ug7) obj;
        return this.a == ug7Var.a && Intrinsics.d(this.b, ug7Var.b) && Intrinsics.d(this.c, ug7Var.c) && Intrinsics.d(this.d, ug7Var.d) && Intrinsics.d(this.e, ug7Var.e) && Intrinsics.d(this.f, ug7Var.f) && this.g == ug7Var.g && this.h == ug7Var.h && Intrinsics.d(this.i, ug7Var.i) && Intrinsics.d(this.j, ug7Var.j);
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
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecoderUpdates(trackType=");
        sb.append(this.a);
        sb.append(", newDecoder=");
        sb.append(this.b);
        sb.append(", lastDecoder=");
        sb.append(this.c);
        sb.append(", newTrack=");
        sb.append(this.d);
        sb.append(", lastTrack=");
        sb.append(this.e);
        sb.append(", decoderCounter=");
        sb.append(this.f);
        sb.append(", lastInitCount=");
        sb.append(this.g);
        sb.append(", lastReuseCount=");
        sb.append(this.h);
        sb.append(", reuseLog=");
        sb.append(this.i);
        sb.append(", isHardwareAccelerated=");
        return k.p(sb, this.j, ')');
    }

    public /* synthetic */ ug7(TrackType trackType) {
        this(trackType, null, null, null, null, null, 0, 0, null, null);
    }
}
