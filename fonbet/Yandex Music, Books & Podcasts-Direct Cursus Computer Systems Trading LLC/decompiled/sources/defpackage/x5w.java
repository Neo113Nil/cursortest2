package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class x5w extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ y5w s;
    public final /* synthetic */ Function2 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5w(y5w y5wVar, Function2 function2, int i) {
        super(2);
        this.r = i;
        this.s = y5wVar;
        this.t = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.r;
        Function2 function2 = this.t;
        y5w y5wVar = this.s;
        int i2 = 1;
        int i3 = 0;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    AndroidCompositionLocals_androidKt.a(y5wVar.a, function2, oq5Var, 0);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Number) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AndroidComposeView androidComposeView = y5wVar.a;
                    Object tag = androidComposeView.getTag(R.id.inspection_slot_table_set);
                    Continuation continuation = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof j9f) && !(tag instanceof o9f))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = androidComposeView.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof j9f) && !(tag2 instanceof o9f))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        vr5 vr5Var = oq5Var2.Q;
                        if (vr5Var == null) {
                            vr5Var = new vr5(oq5Var2.g);
                            oq5Var2.Q = vr5Var;
                        }
                        set.add(vr5Var);
                        oq5Var2.p = true;
                        oq5Var2.B = true;
                        oq5Var2.c.g();
                        oq5Var2.G.g();
                        oxq oxqVar = oq5Var2.H;
                        fxq fxqVar = oxqVar.a;
                        oxqVar.e = fxqVar.j;
                        oxqVar.f = fxqVar.k;
                    }
                    boolean h = oq5Var2.h(y5wVar);
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (h || K == kjnVar) {
                        K = new w5w(y5wVar, continuation, i3);
                        oq5Var2.k0(K);
                    }
                    gld.w(oq5Var2, androidComposeView, (Function2) K);
                    boolean h2 = oq5Var2.h(y5wVar);
                    Object K2 = oq5Var2.K();
                    if (h2 || K2 == kjnVar) {
                        K2 = new w5w(y5wVar, continuation, i2);
                        oq5Var2.k0(K2);
                    }
                    gld.w(oq5Var2, androidComposeView, (Function2) K2);
                    etn.l(loe.a.a(set), ild.C(-1193460702, new x5w(y5wVar, function2, i3), oq5Var2), oq5Var2, 56);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
