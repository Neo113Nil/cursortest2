package defpackage;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.search.SearchView;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class eq2 implements ycg, jpj {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eq2(Object obj, int i, int i2) {
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c;
        int i = SearchView.E;
        zne g = kqvVar.a.g(647);
        marginLayoutParams.leftMargin = this.a + g.a;
        marginLayoutParams.rightMargin = this.b + g.c;
        return kqvVar;
    }

    public int a(int i) {
        ViewGroup viewGroup;
        int measuredHeight;
        xo9 xo9Var = ((jua) this.c).a.a;
        xy0 xy0Var = xo9Var.h;
        if (xo9Var.m == null) {
            return -1;
        }
        ngu nguVar = xo9Var.e;
        int collapsiblePaddingBottom = nguVar != null ? nguVar.getCollapsiblePaddingBottom() : 0;
        List m = xo9Var.m.m();
        if (i >= 0) {
            m.size();
        }
        xj9 xj9Var = (xj9) m.get(i);
        ro9 ro9Var = xj9Var.a;
        xzb xzbVar = xj9Var.c;
        DisplayMetrics displayMetrics = xj9Var.b;
        bk9 a = ro9Var.a.d().a();
        Integer valueOf = a instanceof yj9 ? Integer.valueOf(vq1.j0(a, displayMetrics, xzbVar, null)) : null;
        if (valueOf != null) {
            measuredHeight = valueOf.intValue();
        } else {
            rq2 rq2Var = (rq2) xy0Var.get(Integer.valueOf(i));
            if (rq2Var == null) {
                ViewGroup viewGroup2 = (ViewGroup) xo9Var.a.a(xo9Var.i);
                rq2 rq2Var2 = new rq2(xo9Var, viewGroup2, xj9Var, i);
                xy0Var.put(Integer.valueOf(i), rq2Var2);
                viewGroup = viewGroup2;
                rq2Var = rq2Var2;
            } else {
                viewGroup = rq2Var.a;
            }
            rq2Var.a();
            viewGroup.forceLayout();
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(this.a, 1073741824), vq1.j0(xj9Var.a.a.d().a(), displayMetrics, xzbVar, null) == -1 ? this.b : View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = viewGroup.getMeasuredHeight();
        }
        return measuredHeight + collapsiblePaddingBottom;
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        ((d80) obj).p((c80) this.c, this.a, this.b);
    }
}
