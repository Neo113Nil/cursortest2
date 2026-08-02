package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class q1e implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2e b;

    public /* synthetic */ q1e(s2e s2eVar, int i) {
        this.a = i;
        this.b = s2eVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        s2e s2eVar = this.b;
        switch (i) {
            case 0:
                b1r g = b1r.g(s2eVar.j(), (String) obj, 0);
                iu2 iu2Var = g.i;
                iu2Var.getClass();
                float f = zs4.a;
                Context context = iu2Var.getContext();
                context.getClass();
                int d = (int) zs4.d(context);
                ViewGroup.LayoutParams layoutParams = iu2Var.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin += d;
                    iu2Var.setLayoutParams(marginLayoutParams);
                }
                g.i();
                return Unit.a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    s2eVar.i().setRefreshing(true);
                } else {
                    if (booleanValue) {
                        b6e.s();
                        return null;
                    }
                    s2eVar.i().setRefreshing(false);
                }
                return Unit.a;
        }
    }
}
