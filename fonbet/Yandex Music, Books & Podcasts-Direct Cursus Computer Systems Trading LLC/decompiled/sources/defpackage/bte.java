package defpackage;

import com.appsflyer.internal.k;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes6.dex */
public final class bte {

    @NotNull
    public static final ate Companion = new ate();
    public static final t9f[] U = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new qy0(tkr.a, 0), null, null, null, null, null, null, null, null, null, null};
    public final Integer A;
    public final String B;
    public final Integer C;
    public final wq4 D;
    public final Boolean E;
    public final Boolean F;
    public final Boolean G;
    public final Boolean H;
    public final Boolean I;
    public final List J;
    public final Boolean K;
    public final Boolean L;
    public final Boolean M;
    public final Boolean N;
    public final Boolean O;
    public final Long P;
    public final Long Q;
    public final Boolean R;
    public final Boolean S;
    public final Boolean T;
    public final Integer a;
    public final Integer b;
    public final Boolean c;
    public final Boolean d;
    public final y5b e;
    public final rc3 f;
    public final rc3 g;
    public final rc3 h;
    public final rc3 i;
    public final fqe j;
    public final fqe k;
    public final b6b l;
    public final Boolean m;
    public final Boolean n;
    public final Boolean o;
    public final Boolean p;
    public final Integer q;
    public final Integer r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Boolean v;
    public final Boolean w;
    public final Boolean x;
    public final Boolean y;
    public final Boolean z;

    public /* synthetic */ bte(int i, int i2, Integer num, Integer num2, Boolean bool, Boolean bool2, y5b y5bVar, rc3 rc3Var, rc3 rc3Var2, rc3 rc3Var3, rc3 rc3Var4, fqe fqeVar, fqe fqeVar2, b6b b6bVar, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Integer num8, String str, Integer num9, wq4 wq4Var, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, List list, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Long l, Long l2, Boolean bool22, Boolean bool23, Boolean bool24) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = y5bVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = rc3Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = rc3Var2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = rc3Var3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = rc3Var4;
        }
        if ((i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
            this.j = null;
        } else {
            this.j = fqeVar;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = fqeVar2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = b6bVar;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = bool3;
        }
        if ((i & RemoteCameraConfig.Notification.ID) == 0) {
            this.n = null;
        } else {
            this.n = bool4;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = bool5;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = bool6;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = num3;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = num4;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = num5;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = num6;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = num7;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = bool7;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = bool8;
        }
        if ((8388608 & i) == 0) {
            this.x = null;
        } else {
            this.x = bool9;
        }
        if ((16777216 & i) == 0) {
            this.y = null;
        } else {
            this.y = bool10;
        }
        if ((33554432 & i) == 0) {
            this.z = null;
        } else {
            this.z = bool11;
        }
        if ((67108864 & i) == 0) {
            this.A = null;
        } else {
            this.A = num8;
        }
        if ((134217728 & i) == 0) {
            this.B = null;
        } else {
            this.B = str;
        }
        if ((268435456 & i) == 0) {
            this.C = null;
        } else {
            this.C = num9;
        }
        if ((536870912 & i) == 0) {
            this.D = null;
        } else {
            this.D = wq4Var;
        }
        if ((1073741824 & i) == 0) {
            this.E = null;
        } else {
            this.E = bool12;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = bool13;
        }
        if ((i2 & 1) == 0) {
            this.G = null;
        } else {
            this.G = bool14;
        }
        if ((i2 & 2) == 0) {
            this.H = null;
        } else {
            this.H = bool15;
        }
        if ((i2 & 4) == 0) {
            this.I = null;
        } else {
            this.I = bool16;
        }
        if ((i2 & 8) == 0) {
            this.J = null;
        } else {
            this.J = list;
        }
        if ((i2 & 16) == 0) {
            this.K = null;
        } else {
            this.K = bool17;
        }
        if ((i2 & 32) == 0) {
            this.L = null;
        } else {
            this.L = bool18;
        }
        if ((i2 & 64) == 0) {
            this.M = null;
        } else {
            this.M = bool19;
        }
        if ((i2 & 128) == 0) {
            this.N = null;
        } else {
            this.N = bool20;
        }
        if ((i2 & 256) == 0) {
            this.O = null;
        } else {
            this.O = bool21;
        }
        if ((i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
            this.P = null;
        } else {
            this.P = l;
        }
        if ((i2 & 1024) == 0) {
            this.Q = null;
        } else {
            this.Q = l2;
        }
        if ((i2 & 2048) == 0) {
            this.R = null;
        } else {
            this.R = bool22;
        }
        if ((i2 & 4096) == 0) {
            this.S = null;
        } else {
            this.S = bool23;
        }
        if ((i2 & RemoteCameraConfig.Notification.ID) == 0) {
            this.T = null;
        } else {
            this.T = bool24;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bte)) {
            return false;
        }
        bte bteVar = (bte) obj;
        return Intrinsics.d(this.a, bteVar.a) && Intrinsics.d(this.b, bteVar.b) && Intrinsics.d(this.c, bteVar.c) && Intrinsics.d(this.d, bteVar.d) && Intrinsics.d(this.e, bteVar.e) && Intrinsics.d(this.f, bteVar.f) && Intrinsics.d(this.g, bteVar.g) && Intrinsics.d(this.h, bteVar.h) && Intrinsics.d(this.i, bteVar.i) && Intrinsics.d(this.j, bteVar.j) && Intrinsics.d(this.k, bteVar.k) && Intrinsics.d(this.l, bteVar.l) && Intrinsics.d(this.m, bteVar.m) && Intrinsics.d(this.n, bteVar.n) && Intrinsics.d(this.o, bteVar.o) && Intrinsics.d(this.p, bteVar.p) && Intrinsics.d(this.q, bteVar.q) && Intrinsics.d(this.r, bteVar.r) && Intrinsics.d(this.s, bteVar.s) && Intrinsics.d(this.t, bteVar.t) && Intrinsics.d(this.u, bteVar.u) && Intrinsics.d(this.v, bteVar.v) && Intrinsics.d(this.w, bteVar.w) && Intrinsics.d(this.x, bteVar.x) && Intrinsics.d(this.y, bteVar.y) && Intrinsics.d(this.z, bteVar.z) && Intrinsics.d(this.A, bteVar.A) && Intrinsics.d(this.B, bteVar.B) && Intrinsics.d(this.C, bteVar.C) && Intrinsics.d(this.D, bteVar.D) && Intrinsics.d(this.E, bteVar.E) && Intrinsics.d(this.F, bteVar.F) && Intrinsics.d(this.G, bteVar.G) && Intrinsics.d(this.H, bteVar.H) && Intrinsics.d(this.I, bteVar.I) && Intrinsics.d(this.J, bteVar.J) && Intrinsics.d(this.K, bteVar.K) && Intrinsics.d(this.L, bteVar.L) && Intrinsics.d(this.M, bteVar.M) && Intrinsics.d(this.N, bteVar.N) && Intrinsics.d(this.O, bteVar.O) && Intrinsics.d(this.P, bteVar.P) && Intrinsics.d(this.Q, bteVar.Q) && Intrinsics.d(this.R, bteVar.R) && Intrinsics.d(this.S, bteVar.S) && Intrinsics.d(this.T, bteVar.T);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        y5b y5bVar = this.e;
        int hashCode5 = (hashCode4 + (y5bVar == null ? 0 : y5bVar.hashCode())) * 31;
        rc3 rc3Var = this.f;
        int hashCode6 = (hashCode5 + (rc3Var == null ? 0 : rc3Var.hashCode())) * 31;
        rc3 rc3Var2 = this.g;
        int hashCode7 = (hashCode6 + (rc3Var2 == null ? 0 : rc3Var2.hashCode())) * 31;
        rc3 rc3Var3 = this.h;
        int hashCode8 = (hashCode7 + (rc3Var3 == null ? 0 : rc3Var3.hashCode())) * 31;
        rc3 rc3Var4 = this.i;
        int hashCode9 = (hashCode8 + (rc3Var4 == null ? 0 : rc3Var4.hashCode())) * 31;
        fqe fqeVar = this.j;
        int hashCode10 = (hashCode9 + (fqeVar == null ? 0 : fqeVar.hashCode())) * 31;
        fqe fqeVar2 = this.k;
        int hashCode11 = (hashCode10 + (fqeVar2 == null ? 0 : fqeVar2.hashCode())) * 31;
        b6b b6bVar = this.l;
        int hashCode12 = (hashCode11 + (b6bVar == null ? 0 : b6bVar.hashCode())) * 31;
        Boolean bool3 = this.m;
        int hashCode13 = (hashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.n;
        int hashCode14 = (hashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.o;
        int hashCode15 = (hashCode14 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.p;
        int hashCode16 = (hashCode15 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Integer num3 = this.q;
        int hashCode17 = (hashCode16 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.r;
        int hashCode18 = (hashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.s;
        int hashCode19 = (hashCode18 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.t;
        int hashCode20 = (hashCode19 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.u;
        int hashCode21 = (hashCode20 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool7 = this.v;
        int hashCode22 = (hashCode21 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.w;
        int hashCode23 = (hashCode22 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.x;
        int hashCode24 = (hashCode23 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.y;
        int hashCode25 = (hashCode24 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.z;
        int hashCode26 = (hashCode25 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Integer num8 = this.A;
        int hashCode27 = (hashCode26 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str = this.B;
        int hashCode28 = (hashCode27 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num9 = this.C;
        int hashCode29 = (hashCode28 + (num9 == null ? 0 : num9.hashCode())) * 31;
        wq4 wq4Var = this.D;
        int hashCode30 = (hashCode29 + (wq4Var == null ? 0 : wq4Var.hashCode())) * 31;
        Boolean bool12 = this.E;
        int hashCode31 = (hashCode30 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.F;
        int hashCode32 = (hashCode31 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.G;
        int hashCode33 = (hashCode32 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.H;
        int hashCode34 = (hashCode33 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.I;
        int hashCode35 = (hashCode34 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        List list = this.J;
        int hashCode36 = (hashCode35 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool17 = this.K;
        int hashCode37 = (hashCode36 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.L;
        int hashCode38 = (hashCode37 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.M;
        int hashCode39 = (hashCode38 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.N;
        int hashCode40 = (hashCode39 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.O;
        int hashCode41 = (hashCode40 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Long l = this.P;
        int hashCode42 = (hashCode41 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.Q;
        int hashCode43 = (hashCode42 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool22 = this.R;
        int hashCode44 = (hashCode43 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Boolean bool23 = this.S;
        int hashCode45 = (hashCode44 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Boolean bool24 = this.T;
        return hashCode45 + (bool24 != null ? bool24.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalAbFlags(androidExperimentCheckerTestid=");
        sb.append(this.a);
        sb.append(", androidFeatureToggleCheckerTestid=");
        sb.append(this.b);
        sb.append(", addAAExperimentMarkerToLogs=");
        sb.append(this.c);
        sb.append(", enableOptimizedPlayerRelease=");
        sb.append(this.d);
        sb.append(", enableHevcWithService=");
        sb.append(this.e);
        sb.append(", ignoreMaxHeightWithService=");
        sb.append(this.f);
        sb.append(", ignoreMinHeightWithService=");
        sb.append(this.g);
        sb.append(", enableSurfaceCappingInListSDK=");
        sb.append(this.h);
        sb.append(", enableSelectMonoBitrateInListSDK=");
        sb.append(this.i);
        sb.append(", degradationStepsMonoBitrateInListSDK=");
        sb.append(this.j);
        sb.append(", preloadCountInListSDK=");
        sb.append(this.k);
        sb.append(", enableNotDetachingEngineFromPlayingPlayerInListSDK=");
        sb.append(this.l);
        sb.append(", disableRetryOnConnectionFailureInListSDK=");
        sb.append(this.m);
        sb.append(", addFallbackToAVCInListSDK=");
        sb.append(this.n);
        sb.append(", enableDebugViewInListSDK=");
        sb.append(this.o);
        sb.append(", enableBroadcastReceiverForDebugViewInListSDK=");
        sb.append(this.p);
        sb.append(", targetPoolSizeInListSDK=");
        sb.append(this.q);
        sb.append(", maxPoolSizeInListSDK=");
        sb.append(this.r);
        sb.append(", exceptionCountToDisablePoolIncreasingInListSDK=");
        sb.append(this.s);
        sb.append(", forwardEngineInListSDK=");
        sb.append(this.t);
        sb.append(", backwardEngineInListSDK=");
        sb.append(this.u);
        sb.append(", useDataSourceFactoryCreatorInListSDK=");
        sb.append(this.v);
        sb.append(", useNewAsyncLogLogicInEventTracker=");
        sb.append(this.w);
        sb.append(", useMultiplatformBandwidthEstimator=");
        sb.append(this.x);
        sb.append(", useMultiplatformBandwidthEstimatorWithPlatformSync=");
        sb.append(this.y);
        sb.append(", enableCodecTelemetryReportLogger=");
        sb.append(this.z);
        sb.append(", codecTelemetryReportLoggerRecordsCount=");
        sb.append(this.A);
        sb.append(", codecRecoverStrategy=");
        sb.append(this.B);
        sb.append(", codecRecoverStrategyAttempts=");
        sb.append(this.C);
        sb.append(", codecInitializationRemoteFlag=");
        sb.append(this.D);
        sb.append(", disableTooEarlyMediaCodecNativeReleaseReturnWorkaround=");
        sb.append(this.E);
        sb.append(", useSurfaceControl=");
        sb.append(this.F);
        sb.append(", doRetryForStreamResetException=");
        sb.append(this.G);
        sb.append(", performPlayerReleaseOnScope=");
        sb.append(this.H);
        sb.append(", useNewLogicForAutoPlayDecisionWhileRecover=");
        sb.append(this.I);
        sb.append(", modelsNeedsSetOutputSurfaceWorkaround=");
        sb.append(this.J);
        sb.append(", enableAsyncDecoderQueue=");
        sb.append(this.K);
        sb.append(", disableCodecReuseInCaseOfCodecProfileOrLevelUpgrade=");
        sb.append(this.L);
        sb.append(", useLastBandwidthEstimate=");
        sb.append(this.M);
        sb.append(", ignoreSeekOnSamePosition=");
        sb.append(this.N);
        sb.append(", stuckStalledEnabled=");
        sb.append(this.O);
        sb.append(", stuckStalledMinimumBufferForAlertMs=");
        sb.append(this.P);
        sb.append(", stuckStalledAlarmPeriodMs=");
        sb.append(this.Q);
        sb.append(", stuckStalledFatalOnlyIfShouldContinueLoadingIsFalse=");
        sb.append(this.R);
        sb.append(", stuckStalledProduceJustNonFatalErrors=");
        sb.append(this.S);
        sb.append(", stuckStalledWatchOnlySeekStalled=");
        return k.p(sb, this.T, ')');
    }

    public bte() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
    }
}
