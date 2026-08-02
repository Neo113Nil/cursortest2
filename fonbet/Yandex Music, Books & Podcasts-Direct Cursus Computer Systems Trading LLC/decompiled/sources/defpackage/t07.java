package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t07 extends uif implements Function1 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ k17 s;
    public final /* synthetic */ u07 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t07(u07 u07Var, k17 k17Var) {
        super(1);
        this.t = u07Var;
        this.s = k17Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                jw3 jw3Var = (jw3) obj;
                jw3Var.getClass();
                u07 u07Var = this.t;
                gc8 gc8Var = u07Var.l;
                if (gc8Var != null) {
                    gc8Var.N("card_input_screen_button_state", u07Var.D(jw3Var));
                }
                z07 A = u07Var.A();
                A.w = jw3Var;
                if (jw3Var == jw3.d && A.G) {
                    g3j newCard = this.s.getNewCard();
                    if (newCard == null) {
                        xq0.q("Valid card state without card number");
                        break;
                    } else {
                        rfk rfkVar = klx.W(newCard).a;
                        if (!Intrinsics.d(A.u, rfkVar)) {
                            A.u = rfkVar;
                            s07 s07Var = A.z;
                            if (s07Var != null) {
                                s07Var.invoke(rfkVar);
                            }
                        }
                    }
                }
                break;
            default:
                View view = (View) obj;
                view.getClass();
                if (view instanceof c17) {
                    ((ViewGroup) view).addView(this.s);
                } else if (view instanceof b17) {
                    this.t.g = (b17) view;
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t07(k17 k17Var, u07 u07Var) {
        super(1);
        this.s = k17Var;
        this.t = u07Var;
    }
}
