package defpackage;

import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;

/* loaded from: classes3.dex */
public final class t400 implements rb00 {
    public final /* synthetic */ b a;

    public t400(b bVar) {
        this.a = bVar;
    }

    public final boolean a() {
        b bVar = this.a;
        return jl40.l(bVar.r().isEnabledOnUserCardsScreen(), Boolean.TRUE) && bVar.r().isEnabled();
    }

    public final boolean b() {
        return ((CommonFeatureFlag) this.a.d(wlp.O0).getData()).isEnabled();
    }

    public final boolean c() {
        return ((CommonFeatureFlag) this.a.d(wlp.P0).getData()).isEnabled();
    }

    public final boolean d() {
        dfr dfrVar = wlp.P0;
        b bVar = this.a;
        return ((CommonFeatureFlag) bVar.d(dfrVar).getData()).isEnabled() && ((CommonFeatureFlag) bVar.d(wlp.Q0).getData()).isEnabled();
    }

    public final boolean e() {
        return ((CommonFeatureFlag) this.a.d(wlp.g0).getData()).isEnabled();
    }
}
