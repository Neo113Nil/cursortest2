package defpackage;

import android.view.View;

/* loaded from: classes11.dex */
public abstract class ra {
    public View a;

    public abstract View a();

    public final boolean b() {
        View view = this.a;
        return view != null && view.getVisibility() == 0;
    }

    public final void c(int i) {
        View view = this.a;
        if (view != null) {
            view.setVisibility(i);
        } else if (i != 8) {
            a().setVisibility(i);
        }
    }
}
