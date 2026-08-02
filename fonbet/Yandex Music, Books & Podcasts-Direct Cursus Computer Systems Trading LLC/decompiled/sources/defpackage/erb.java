package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class erb {
    public final dw1 a;
    public final lqa b;
    public final xqr c;
    public final lnm d;
    public final Integer e;
    public final String f;

    public erb(dw1 dw1Var, lqa lqaVar, xqr xqrVar, lnm lnmVar, Integer num, String str) {
        this.a = dw1Var;
        this.b = lqaVar;
        this.c = xqrVar;
        this.d = lnmVar;
        this.e = num;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!erb.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        erb erbVar = (erb) obj;
        return Intrinsics.d(this.e, erbVar.e) && this.a.equals(erbVar.a) && this.b.equals(erbVar.b) && this.c.equals(erbVar.c) && Intrinsics.d(this.d, erbVar.d) && Intrinsics.d(this.f, erbVar.f);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(false) * 961;
        Integer num = this.e;
        int hashCode2 = (this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + ((hashCode + (num != null ? num.intValue() : 0)) * 31)) * 31)) * 31)) * 29791;
        lnm lnmVar = this.d;
        int hashCode3 = (hashCode2 + (lnmVar != null ? lnmVar.hashCode() : 0)) * 29791;
        String str = this.f;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExoPlayerDelegateConfig(audioDelegateConfig=");
        sb.append(this.a);
        sb.append(", drmConfig=");
        sb.append(this.b);
        sb.append(", supplementalDelegateProperties=");
        sb.append(this.c);
        sb.append(", initialBandwidthValueProvider=null, priorityTaskManager=null, preloadPrioritySettings=");
        sb.append(this.d);
        sb.append(", liveSpeedControlObserver=null, liveConfigurationOverride=null, useBandwidthLastValueProvider=false, enableOutputSurfaceWorkaround=null, maxRecoverAttempts=");
        sb.append(this.e);
        sb.append(", recoverType=");
        return dfi.i(sb, this.f, ')');
    }
}
