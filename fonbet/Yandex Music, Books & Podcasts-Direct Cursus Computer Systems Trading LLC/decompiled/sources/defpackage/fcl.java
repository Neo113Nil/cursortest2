package defpackage;

import android.os.Looper;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.player.scaling.ScalingMode;

/* loaded from: classes6.dex */
public final class fcl {
    public final pv9 a;
    public final Looper b;
    public final y0t c;
    public final ScalingMode d;
    public final bt2 e;
    public final nlr f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final int k;
    public final boolean l;
    public final int m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final boolean r;
    public final List s;
    public final Boolean t;
    public final boolean u;
    public final Boolean v;
    public final Boolean w;
    public final jmr x;
    public final wa6 y;

    public fcl(pv9 pv9Var, Looper looper, y0t y0tVar, ScalingMode scalingMode, bt2 bt2Var, nlr nlrVar, boolean z, boolean z2, boolean z3, String str, int i, boolean z4, int i2, long j, boolean z5, boolean z6, int i3, boolean z7, List list, Boolean bool, boolean z8, Boolean bool2, Boolean bool3, jmr jmrVar, wa6 wa6Var) {
        this.a = pv9Var;
        this.b = looper;
        this.c = y0tVar;
        this.d = scalingMode;
        this.e = bt2Var;
        this.f = nlrVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = str;
        this.k = i;
        this.l = z4;
        this.m = i2;
        this.n = j;
        this.o = z5;
        this.p = z6;
        this.q = i3;
        this.r = z7;
        this.s = list;
        this.t = bool;
        this.u = z8;
        this.v = bool2;
        this.w = bool3;
        this.x = jmrVar;
        this.y = wa6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fcl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        fcl fclVar = (fcl) obj;
        return this.a.equals(fclVar.a) && this.b.equals(fclVar.b) && this.c.equals(fclVar.c) && this.d == fclVar.d && Intrinsics.d(this.e, fclVar.e) && Intrinsics.d(this.f, fclVar.f) && this.g == fclVar.g && this.h == fclVar.h && this.i == fclVar.i && this.j.equals(fclVar.j) && this.k == fclVar.k && this.l == fclVar.l && this.m == fclVar.m && this.n == fclVar.n && this.o == fclVar.o && this.p == fclVar.p && this.q == fclVar.q && this.r == fclVar.r && Intrinsics.d(this.s, fclVar.s) && Intrinsics.d(this.t, fclVar.t) && this.u == fclVar.u && Intrinsics.d(this.v, fclVar.v) && Intrinsics.d(this.w, fclVar.w) && Intrinsics.d(this.x, fclVar.x);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        bt2 bt2Var = this.e;
        int hashCode2 = (hashCode + (bt2Var != null ? bt2Var.hashCode() : 0)) * 31;
        nlr nlrVar = this.f;
        int d = k5r.d(k5r.e((k5r.e(k5r.e(tlm.c(this.n, (k5r.e((k5r.c(k5r.e(k5r.e(k5r.e((hashCode2 + (nlrVar != null ? nlrVar.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j) + this.k) * 31, 31, this.l) + this.m) * 31, 31), 31, this.o), 31, this.p) + this.q) * 31, 31, this.r), 31, this.s);
        Boolean bool = this.t;
        int e = k5r.e((d + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.u);
        Boolean bool2 = this.v;
        int hashCode3 = (e + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.w;
        int hashCode4 = (hashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        jmr jmrVar = this.x;
        return hashCode4 + (jmrVar != null ? jmrVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlayerDelegateParameters(drmTypeConsumer=" + this.a + ", exoPlayerLooper=" + this.b + ", trackSelectionRestrictionsProvider=" + this.c + ", videoScalingMode=" + this.d + ", reportBuilder=" + this.e + ", strmEventLogger=" + this.f + ", useMultiplatformBandwidthEstimator=" + this.g + ", useMultiplatformBandwidthEstimatorWithPlatformSync=" + this.h + ", enableCodecTelemetryReportLogger=" + this.i + ", codecRecoverStrategy='" + this.j + "', codecRecoverStrategyAttempts=" + this.k + ", shouldTryInitCodecsWithRetries=" + this.l + ", initCodecRetriesCount=" + this.m + ", initCodecTimeoutMs=" + this.n + ", disableTooEarlyMediaCodecNativeReleaseReturnWorkaround=" + this.o + ", useSurfaceControl=" + this.p + ", codecTelemetryReportLoggerRecordsCount=" + this.q + ", useIncrementalCodecInitTimeout=" + this.r + ", modelsNeedsSetOutputSurfaceWorkaround=" + this.s + ", enableAsyncDecoderQueue=" + this.t + ", disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade=" + this.u + ", enableUseLastBandwidthEstimate=" + this.v + ", ignoreSeekOnSamePosition=" + this.w + ", stuckStalledConfig=" + this.x + ')';
    }
}
