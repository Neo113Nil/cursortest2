package defpackage;

import android.view.View;

/* loaded from: classes4.dex */
public abstract class ll2 extends opn {
    public final View u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll2(View view) {
        super(view);
        view.getClass();
        this.u = view;
    }

    public final View t(int i) {
        View findViewById = this.u.findViewById(i);
        findViewById.getClass();
        return findViewById;
    }

    public abstract void u(int i);
}
