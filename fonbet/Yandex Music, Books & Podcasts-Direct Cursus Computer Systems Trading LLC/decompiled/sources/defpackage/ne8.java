package defpackage;

import android.view.MotionEvent;
import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class ne8 extends uif implements Function2 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne8(pe8 pe8Var, e23 e23Var, View view, List list, List list2) {
        super(2);
        this.s = pe8Var;
        this.t = e23Var;
        this.u = view;
        this.v = list;
        this.w = list2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                View view = (View) this.u;
                e23 e23Var = (e23) this.t;
                qg8 qg8Var = ((pe8) this.s).a;
                int action = ((MotionEvent) obj2).getAction();
                boolean z = true;
                if (action == 0) {
                    qg8Var.d(e23Var, view, (List) this.v, "press");
                } else if (action == 1 || action == 3) {
                    qg8Var.d(e23Var, view, (List) this.w, "release");
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                ((Number) obj2).intValue();
                r8g.a((vdr) this.s, (vdr) this.t, (yci) this.u, (xbl) this.v, (iag) this.w, (hq5) obj, rvf.R(1));
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne8(vdr vdrVar, vdr vdrVar2, yci yciVar, xbl xblVar, iag iagVar, int i) {
        super(2);
        this.s = vdrVar;
        this.t = vdrVar2;
        this.u = yciVar;
        this.v = xblVar;
        this.w = iagVar;
    }
}
