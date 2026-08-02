package defpackage;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class qy6 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ty6 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qy6(ty6 ty6Var, int i) {
        super(1);
        this.r = i;
        this.s = ty6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ol3 ol3Var = (ol3) obj;
                boolean z = ol3Var instanceof ml3;
                ty6 ty6Var = this.s;
                if (z) {
                    gc8 gc8Var = ty6Var.p;
                    if (gc8Var != null) {
                        gc8Var.N("cvv_confirm_fragment_currentState", "enabled");
                    }
                    View findFocus = ((ConstraintLayout) ty6Var.x().a).findFocus();
                    if (findFocus != null) {
                        findFocus.clearFocus();
                    }
                } else if (ol3Var instanceof ll3) {
                    gc8 gc8Var2 = ty6Var.p;
                    if (gc8Var2 != null) {
                        gc8Var2.N("cvv_confirm_fragment_currentState", "disabled");
                    }
                } else {
                    Intrinsics.d(ol3Var, nl3.a);
                }
                return Unit.a;
            default:
                l2c l2cVar = (l2c) obj;
                boolean d = Intrinsics.d(l2cVar, h2c.a);
                ty6 ty6Var2 = this.s;
                if (d) {
                    sbp sbpVar = ty6Var2.h;
                    if (sbpVar == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar.t();
                } else if (l2cVar instanceof j2c) {
                    sbp sbpVar2 = ty6Var2.h;
                    if (sbpVar2 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    j2c j2cVar = (j2c) l2cVar;
                    sbpVar2.k(j2cVar.a, j2cVar.b);
                } else {
                    Intrinsics.d(l2cVar, i2c.a);
                }
                return Unit.a;
        }
    }
}
