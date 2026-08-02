package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class noc extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ooc s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ noc(ooc oocVar, int i) {
        super(1);
        this.r = i;
        this.s = oocVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                qt3 qt3Var = (qt3) obj;
                ooc oocVar = this.s;
                View m = xp3.m(oocVar);
                if (!m.isFocused() && !m.hasFocus()) {
                    if (!yd5.H(m, yd5.K(qt3Var.a), xp3.l(bcx.G(oocVar).getFocusOwner(), kg5.I(oocVar), m))) {
                        qt3Var.b = true;
                    }
                }
                break;
            default:
                qt3 qt3Var2 = (qt3) obj;
                ooc oocVar2 = this.s;
                View m2 = xp3.m(oocVar2);
                if (m2.hasFocus()) {
                    toc focusOwner = bcx.G(oocVar2).getFocusOwner();
                    View I = kg5.I(oocVar2);
                    if (!(m2 instanceof ViewGroup)) {
                        if (!I.requestFocus()) {
                            xq0.q("host view did not take focus");
                            break;
                        }
                    } else {
                        Rect l = xp3.l(focusOwner, I, m2);
                        Integer K = yd5.K(qt3Var2.a);
                        int intValue = K != null ? K.intValue() : 130;
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View view = oocVar2.o;
                        View findNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) I, view, intValue) : focusFinder.findNextFocusFromRect((ViewGroup) I, l, intValue);
                        if (findNextFocus != null && xp3.k(m2, findNextFocus)) {
                            findNextFocus.requestFocus(intValue, l);
                            qt3Var2.b = true;
                        } else if (!I.requestFocus()) {
                            xq0.q("host view did not take focus");
                            break;
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
