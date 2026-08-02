package defpackage;

import android.content.Context;
import com.yandex.passport.sloth.ui.dependencies.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class uo3 implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ m b;
    public final /* synthetic */ qe3 c;
    public final /* synthetic */ z66 d;
    public final /* synthetic */ raa e;
    public final /* synthetic */ eca f;
    public final /* synthetic */ Context g;

    public /* synthetic */ uo3(boolean z, m mVar, qe3 qe3Var, z66 z66Var, raa raaVar, eca ecaVar, Context context) {
        this.a = z;
        this.b = mVar;
        this.c = qe3Var;
        this.d = z66Var;
        this.e = raaVar;
        this.f = ecaVar;
        this.g = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = this.a;
        m mVar = this.b;
        if (z) {
            v7g.L((Context) mVar.d, new lik(vik.f, null, null));
            return Unit.a;
        }
        mVar.e();
        this.c.a(sjb.Download);
        z66 z66Var = this.d;
        if (z66Var.g()) {
            ((taa) this.e).e(this.f);
        } else {
            hld.I(this.g, z66Var);
        }
        return Unit.a;
    }
}
