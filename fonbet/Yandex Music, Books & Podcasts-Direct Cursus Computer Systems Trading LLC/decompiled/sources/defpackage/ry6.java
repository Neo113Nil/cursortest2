package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class ry6 extends uif implements Function1 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ ty6 s;
    public final /* synthetic */ xqn t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry6(ty6 ty6Var, xqn xqnVar) {
        super(1);
        this.s = ty6Var;
        this.t = xqnVar;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        ty6 ty6Var = this.s;
        xqn xqnVar = this.t;
        switch (i) {
            case 0:
                f2a f2aVar = (f2a) obj;
                f2aVar.getClass();
                xqnVar.a = f2aVar;
                vwb.W((EditText) f2aVar.a.d);
                f2aVar.setCardPaymentSystem(ix3.g);
                f2aVar.setOnReadyListener(new sv4(6, ty6Var, f2aVar));
                return Unit.a;
            default:
                zy6 zy6Var = (zy6) obj;
                if (Intrinsics.d(zy6Var, vy6.b)) {
                    ((LinearLayout) ty6Var.x().d).setVisibility(0);
                } else if (zy6Var instanceof xy6) {
                    ((LinearLayout) ty6Var.x().d).setVisibility(8);
                    tv8 tv8Var = ((xy6) zy6Var).a;
                    qc9 qc9Var = ty6Var.m;
                    if (qc9Var == null) {
                        Intrinsics.j("parsingEnvironment");
                        throw null;
                    }
                    qc9Var.e(tv8Var.a);
                    int i2 = rv8.i;
                    qc9 qc9Var2 = ty6Var.m;
                    if (qc9Var2 == null) {
                        Intrinsics.j("parsingEnvironment");
                        throw null;
                    }
                    rv8 y = fgq.y(qc9Var2, tv8Var.b);
                    gc8 gc8Var = new gc8((vb8) ty6Var.j.getValue(), null, 0, 6, null);
                    gc8Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    gc8Var.M(y, new dw8(gc8Var.getLogId()));
                    gc8Var.setId(View.generateViewId());
                    ty6Var.p = gc8Var;
                    ((FrameLayout) ty6Var.x().b).addView(ty6Var.p);
                    gc8 gc8Var2 = ty6Var.p;
                    if (gc8Var2 != null) {
                        gc8Var2.post(new jt6(3, tv8Var, ty6Var));
                    }
                } else if (Intrinsics.d(zy6Var, vy6.a)) {
                    ty6Var.requireActivity().onBackPressed();
                } else if (zy6Var instanceof wy6) {
                    f2a f2aVar2 = (f2a) xqnVar.a;
                    if (f2aVar2 != null) {
                        f2aVar2.e(false);
                    }
                    f2a f2aVar3 = (f2a) xqnVar.a;
                    if (f2aVar3 != null) {
                        f2aVar3.g.a();
                    }
                    gc8 gc8Var3 = ty6Var.p;
                    if (gc8Var3 != null) {
                        gc8Var3.N("cvv_confirm_fragment_currentState", "enabled");
                    }
                    wy6 wy6Var = (wy6) zy6Var;
                    int i3 = wy6Var.a;
                    Integer num = wy6Var.b;
                    sbp sbpVar = ty6Var.h;
                    if (sbpVar == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar.P(i3, num);
                } else if (Intrinsics.d(zy6Var, vy6.c)) {
                    f2a f2aVar4 = (f2a) xqnVar.a;
                    if (f2aVar4 != null) {
                        f2aVar4.e(true);
                    }
                    gc8 gc8Var4 = ty6Var.p;
                    if (gc8Var4 != null) {
                        gc8Var4.N("cvv_confirm_fragment_currentState", "loading");
                    }
                } else if (zy6Var instanceof yy6) {
                    f2a f2aVar5 = (f2a) xqnVar.a;
                    if (f2aVar5 != null) {
                        f2aVar5.e(false);
                        Iterator it = CollectionsKt.m0(f2aVar5.g.c, new IntRange(0, r0.c.size() - 2, 1)).iterator();
                        while (it.hasNext()) {
                            ((pv8) it.next()).setState(lv8.e);
                        }
                    }
                    ((ConstraintLayout) ty6Var.x().a).postDelayed(new jt6(4, ty6Var, zy6Var), 500L);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry6(xqn xqnVar, ty6 ty6Var) {
        super(1);
        this.t = xqnVar;
        this.s = ty6Var;
    }
}
