package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class mhu implements la8 {
    public final View a;
    public volatile ou7 b;

    public mhu(View view, ou7 ou7Var) {
        this.a = view;
        this.b = ou7Var;
    }

    @Override // defpackage.la8
    public final void a() {
        boolean z;
        ohu c = k.c(this.a);
        synchronized (c) {
            z = this != c.b;
        }
        if (z) {
            return;
        }
        k.c(this.a).c();
    }

    @Override // defpackage.la8
    public final mu7 b() {
        return this.b;
    }
}
