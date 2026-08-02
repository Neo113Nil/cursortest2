package defpackage;

import android.view.View;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.yandex.video.m3.player.PreparingParams;

/* loaded from: classes.dex */
public final class qqv extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qqv(int i, Object obj, Object obj2) {
        super(1);
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        int i2 = 1;
        Object obj2 = this.t;
        Object obj3 = this.s;
        switch (i) {
            case 0:
                rqv rqvVar = (rqv) obj3;
                View view = (View) obj2;
                boe boeVar = rqvVar.v;
                if (rqvVar.u == 0) {
                    WeakHashMap weakHashMap = wdu.a;
                    ndu.n(view, boeVar);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(boeVar);
                    wdu.t(view, boeVar);
                }
                rqvVar.u++;
                break;
            case 1:
                ie0 ie0Var = (ie0) obj;
                Function2 function2 = (Function2) obj2;
                y5w y5wVar = (y5w) obj3;
                if (!y5wVar.c) {
                    nyf lifecycle = ie0Var.a.getLifecycle();
                    y5wVar.e = function2;
                    if (y5wVar.d == null) {
                        y5wVar.d = lifecycle;
                        lifecycle.a(y5wVar);
                    } else if (lifecycle.b().compareTo(lyf.c) >= 0) {
                        y5wVar.b.n(new wn5(new x5w(y5wVar, function2, i2), -2000640158, true));
                    }
                }
                break;
            case 2:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                qne m = qne.m(gut.H(), r7wVar.getMessage(), 2);
                x60 x60Var = (x60) ((g0c) obj3);
                x60Var.getClass();
                x60Var.a(m);
                r7wVar.printStackTrace();
                r7o r7oVar = z7o.b;
                Unit unit = Unit.a;
                ((zt3) obj2).resumeWith(unit);
                break;
            case 3:
                rnn rnnVar = (rnn) obj;
                rnnVar.getClass();
                rnnVar.a = (PreparingParams) obj3;
                rnnVar.b = ((cbw) obj2).j();
                break;
            default:
                ((jsk) obj).d((ksk) obj3, 0, 0, ((qtw) obj2).o);
                break;
        }
        return Unit.a;
    }
}
