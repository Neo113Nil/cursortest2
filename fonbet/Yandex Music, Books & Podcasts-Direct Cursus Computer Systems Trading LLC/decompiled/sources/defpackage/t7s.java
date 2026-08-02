package defpackage;

import android.view.View;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class t7s implements ux8 {
    public final jyr a;
    public final jyr b;
    public final boolean c;
    public final jyr d;
    public gc8 e;

    public t7s(jyr jyrVar) {
        this.a = jyrVar;
        final int i = 0;
        this.b = btf.b(new Function0(this) { // from class: s7s
            public final /* synthetic */ t7s b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                rv8 divData;
                switch (i) {
                    case 0:
                        ojk ojkVar = (ojk) this.b.a.getValue();
                        bik bikVar = bik.b;
                        ojkVar.getClass();
                        return ojk.a(bikVar);
                    default:
                        gc8 gc8Var = this.b.e;
                        if (gc8Var == null || (divData = gc8Var.getDivData()) == null) {
                            return null;
                        }
                        return (String) CollectionsKt.firstOrNull(wct.w(divData));
                }
            }
        });
        l18 l18Var = l18.b;
        bdt I = hag.I(i7s.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        jyr jyrVar2 = tn4.a;
        this.c = xz0.u(new rn4[]{rn4.b}, (rn4) tn4.b.getValue());
        final int i2 = 1;
        this.d = btf.b(new Function0(this) { // from class: s7s
            public final /* synthetic */ t7s b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                rv8 divData;
                switch (i2) {
                    case 0:
                        ojk ojkVar = (ojk) this.b.a.getValue();
                        bik bikVar = bik.b;
                        ojkVar.getClass();
                        return ojk.a(bikVar);
                    default:
                        gc8 gc8Var = this.b.e;
                        if (gc8Var == null || (divData = gc8Var.getDivData()) == null) {
                            return null;
                        }
                        return (String) CollectionsKt.firstOrNull(wct.w(divData));
                }
            }
        });
    }

    @Override // defpackage.ux8
    public final void b(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        xzbVar.getClass();
        view.getClass();
        dp8Var.getClass();
        this.e = gc8Var;
        String str = (String) this.d.getValue();
        jyr jyrVar = this.b;
        if (str != null) {
            aik aikVar = (aik) jyrVar.getValue();
            aikVar.b();
            aikVar.c();
        } else {
            view.setVisibility(this.c ? 0 : 8);
            if (view.getVisibility() == 0) {
                aik aikVar2 = (aik) jyrVar.getValue();
                aikVar2.b();
                aikVar2.c();
            }
        }
    }

    @Override // defpackage.ux8
    public final boolean c(dp8 dp8Var) {
        dp8Var.getClass();
        return sj2.t(dp8Var, "restore_purchase");
    }

    @Override // defpackage.ux8
    public final void e(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        gc8Var.getClass();
        xzbVar.getClass();
        view.getClass();
        dp8Var.getClass();
    }
}
