package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public class s70 {
    public static final List b = Collections.EMPTY_LIST;
    public final pnt0 a = new pnt0();

    public s70(m70... m70VarArr) {
        for (m70 m70Var : m70VarArr) {
            a(m70Var);
        }
    }

    public final void a(m70 m70Var) {
        pnt0 pnt0Var = this.a;
        int e = pnt0Var.e();
        while (pnt0Var.b(e) != null) {
            e++;
            if (e == 2147483646) {
                ny61.g("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
                return;
            }
        }
        if (m70Var == null) {
            ny61.t("AdapterDelegate is null!");
            return;
        }
        if (e == 2147483646) {
            ny61.g("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
        } else if (pnt0Var.b(e) == null) {
            pnt0Var.d(e, m70Var);
        } else {
            StringBuilder t = b64.t(e, "An AdapterDelegate is already registered for the viewType = ", ". Already registered AdapterDelegate is ");
            t.append(pnt0Var.b(e));
            throw new IllegalArgumentException(t.toString());
        }
    }

    public final m70 b(int i) {
        Object obj;
        pnt0 pnt0Var = this.a;
        int c = cvw.c(pnt0Var.b, pnt0Var.w, i);
        if (c < 0 || (obj = pnt0Var.c[c]) == kp50.b) {
            obj = null;
        }
        return (m70) obj;
    }

    public final int c(int i, Object obj) {
        if (obj == null) {
            ny61.t("Items datasource is null!");
            return 0;
        }
        pnt0 pnt0Var = this.a;
        int e = pnt0Var.e();
        for (int i2 = 0; i2 < e; i2++) {
            if (((m70) pnt0Var.f(i2)).a(i, obj)) {
                return pnt0Var.c(i2);
            }
        }
        ny61.t(obj instanceof List ? qv10.i(i, "No AdapterDelegate added that matches item=", ((List) obj).get(i).toString(), " at position=", " in data source") : "No AdapterDelegate added for item at position=" + i + ". items=" + obj);
        return 0;
    }

    public final void d(Object obj, int i, x0 x0Var, List list) {
        m70 b2 = b(x0Var.y);
        if (b2 == null) {
            StringBuilder t = b64.t(i, "No delegate found for item at position = ", " for viewType = ");
            t.append(x0Var.y);
            throw new NullPointerException(t.toString());
        }
        if (list == null) {
            list = b;
        }
        b2.b(obj, i, x0Var, list);
    }

    public final x0 e(ViewGroup viewGroup, int i) {
        m70 b2 = b(i);
        if (b2 != null) {
            return b2.c(viewGroup);
        }
        ny61.t(oyr.i(i, "No AdapterDelegate added for ViewType "));
        return null;
    }

    public final boolean f(x0 x0Var) {
        m70 b2 = b(x0Var.y);
        if (b2 != null) {
            b2.d(x0Var);
            return false;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(x0Var);
        quz.p(sb, x0Var.F(), x0Var.y);
        return false;
    }

    public final void g(x0 x0Var) {
        m70 b2 = b(x0Var.y);
        if (b2 != null) {
            b2.e(x0Var);
            return;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(x0Var);
        quz.p(sb, x0Var.F(), x0Var.y);
    }

    public final void h(x0 x0Var) {
        m70 b2 = b(x0Var.y);
        if (b2 != null) {
            b2.f(x0Var);
            return;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(x0Var);
        quz.p(sb, x0Var.F(), x0Var.y);
    }

    public final void i(x0 x0Var) {
        m70 b2 = b(x0Var.y);
        if (b2 != null) {
            b2.g(x0Var);
            return;
        }
        StringBuilder sb = new StringBuilder("No delegate found for ");
        sb.append(x0Var);
        quz.p(sb, x0Var.F(), x0Var.y);
    }

    public s70() {
    }
}
