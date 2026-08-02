package defpackage;

import android.view.View;
import androidx.core.view.b;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ts31 {
    public final View a;
    public int b;
    public int c;
    public int d;

    public ts31(View view) {
        this.a = view;
    }

    public final void a() {
        int i = this.d;
        View view = this.a;
        int top = i - (view.getTop() - this.b);
        WeakHashMap weakHashMap = b.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.c));
    }

    public final boolean b(int i) {
        if (this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }
}
