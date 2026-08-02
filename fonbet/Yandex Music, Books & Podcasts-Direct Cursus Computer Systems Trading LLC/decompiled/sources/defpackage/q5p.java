package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class q5p implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6p b;

    public /* synthetic */ q5p(b6p b6pVar, int i) {
        this.a = i;
        this.b = b6pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context;
        int i = this.a;
        b6p b6pVar = this.b;
        ?? r4 = 0;
        r4 = 0;
        switch (i) {
            case 0:
                hmn hmnVar = (hmn) obj;
                hmnVar.getClass();
                Context requireContext = b6pVar.requireContext();
                requireContext.getClass();
                p6p K = b6pVar.K();
                if (!hmnVar.equals(emn.a)) {
                    if (!(hmnVar instanceof fmn)) {
                        if (!(hmnVar instanceof gmn)) {
                            b6e.s();
                            break;
                        } else {
                            mqs mqsVar = ((gmn) hmnVar).a;
                            zp2 zp2Var = (zp2) CollectionsKt.Q(mqsVar.f);
                            String j = mqsVar.j();
                            zp2Var.getClass();
                            if (xv7.C(zp2Var.a)) {
                                j = ouj.o(zp2Var.b, " - ", j);
                            }
                            j.getClass();
                            ((grh) b6pVar.H().p.b).j = j;
                            K.a(j);
                            xdr xdrVar = K.l;
                            Boolean bool = Boolean.FALSE;
                            xdrVar.getClass();
                            xdrVar.m(null, bool);
                            j7i H = b6pVar.H();
                            H.y = "";
                            x97.y(ot0.F(H), null, null, new zig(H, mqsVar, r4, 20), 3);
                        }
                    } else {
                        y5g.n0(requireContext, R.string.error_unknown, 0);
                    }
                }
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                b6pVar.K().a(str);
                j7i H2 = b6pVar.H();
                x97.y(ot0.F(H2), null, null, new zig(H2, str, r4, 19), 3);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue = bool2.booleanValue();
                xdr xdrVar2 = b6pVar.q;
                xdrVar2.getClass();
                xdrVar2.m(null, bool2);
                if (booleanValue) {
                    View view = b6pVar.getView();
                    if (view != null && (context = view.getContext()) != null) {
                        r4 = context.getSystemService("input_method");
                    }
                    r4.getClass();
                    ((InputMethodManager) r4).showSoftInput(b6pVar.requireView(), 0);
                } else {
                    b6pVar.L();
                }
                break;
        }
        return Unit.a;
    }
}
