package defpackage;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class t7f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v7f b;

    public /* synthetic */ t7f(v7f v7fVar, int i) {
        this.a = i;
        this.b = v7fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                uu5 uu5Var = this.b.n;
                if (uu5Var != null) {
                    rn5 rn5Var = (rn5) uu5Var.c;
                    if (rn5Var != null) {
                        rn5Var.f = t75.c((mqs) uu5Var.a);
                    }
                    rn5 rn5Var2 = (rn5) uu5Var.c;
                    if (rn5Var2 != null) {
                        rn5Var2.V(new g3a(27, uu5Var));
                    }
                }
                break;
            default:
                v7f v7fVar = this.b;
                BottomSheetBehavior bottomSheetBehavior = v7fVar.k;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(3);
                }
                BottomSheetBehavior bottomSheetBehavior2 = v7fVar.k;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.setSkipCollapsed(true);
                }
                break;
        }
        return Unit.a;
    }
}
