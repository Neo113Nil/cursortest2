package defpackage;

import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class f7g {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int d;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((opn) this.k.get(i2)).a;
            zon zonVar = (zon) view3.getLayoutParams();
            if (view3 != view && !zonVar.a.k() && (d = (zonVar.a.d() - this.d) * this.e) >= 0 && d < i) {
                view2 = view3;
                if (d == 0) {
                    break;
                } else {
                    i = d;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((zon) view2.getLayoutParams()).a.d();
        }
    }

    public final View b(amh amhVar) {
        List list = this.k;
        if (list == null) {
            View d = amhVar.d(this.d);
            this.d += this.e;
            return d;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((opn) this.k.get(i)).a;
            zon zonVar = (zon) view.getLayoutParams();
            if (!zonVar.a.k() && this.d == zonVar.a.d()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
