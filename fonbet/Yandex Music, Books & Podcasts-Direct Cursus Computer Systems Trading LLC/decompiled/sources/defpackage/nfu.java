package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class nfu {
    public final View a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f = true;
    public boolean g = true;

    public nfu(View view) {
        this.a = view;
    }

    public final void a() {
        int i = this.d;
        View view = this.a;
        int top = i - (view.getTop() - this.b);
        WeakHashMap weakHashMap = wdu.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(this.e - (view.getLeft() - this.c));
    }

    public final boolean b(int i) {
        if (!this.f || this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }
}
