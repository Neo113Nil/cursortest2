package defpackage;

import android.view.Gravity;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import java.util.WeakHashMap;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes10.dex */
public class u130 {
    public final ModalView a;
    public t1w b;
    public t1w c;

    public u130(ModalView modalView) {
        this.a = modalView;
        t1w t1wVar = t1w.h;
        this.b = t1wVar;
        this.c = t1wVar;
    }

    public final q2w a(e230 e230Var, final tls tlsVar) {
        final ModalView e = e();
        final int b = e230Var.b();
        final boolean a = e230Var.a();
        s59 s59Var = new s59(new tls() { // from class: s130
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                Integer num;
                t1w t1wVar = (t1w) obj;
                u130 u130Var = u130.this;
                if (jl40.l(u130Var.b, t1wVar)) {
                    return u130Var.c;
                }
                tlsVar.invoke(t1wVar);
                e.onInsetsHandledInternal$design_components(t1wVar);
                u130Var.b = t1wVar;
                int absoluteGravity = Gravity.getAbsoluteGravity(b, u130Var.e().getLayoutDirection());
                int i = 0;
                boolean z = (absoluteGravity & 3) == 3;
                boolean z2 = (absoluteGravity & 48) == 48;
                boolean z3 = (absoluteGravity & 5) == 5;
                boolean z4 = (absoluteGravity & 80) == 80;
                int i2 = z ? t1wVar.a : 0;
                int i3 = z2 ? t1wVar.b : 0;
                int i4 = z3 ? t1wVar.c : 0;
                int i5 = z4 ? t1wVar.d : 0;
                Integer num2 = t1wVar.e;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    if (a) {
                        i = intValue;
                    } else if (z4) {
                        i = Math.min(intValue, t1wVar.d);
                    }
                    num = Integer.valueOf(i);
                } else {
                    num = null;
                }
                t1w t1wVar2 = new t1w(i2, i3, i4, i5, num);
                u130Var.c = t1wVar2;
                return t1wVar2;
            }
        });
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.o(e, s59Var);
        return new q2w(e, 0);
    }

    public void b(c230 c230Var) {
        a(c230Var, new vmz(28, c230Var, e()));
    }

    public void c(d230 d230Var) {
        a(d230Var, new ft20(6, e()));
    }

    public void d(v130 v130Var) {
        a(v130Var, new vmz(29, e(), v130Var));
    }

    public ModalView e() {
        return this.a;
    }
}
