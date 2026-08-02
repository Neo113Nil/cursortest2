package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
public final class z0a {
    public final xy0 a = new xy0(0);

    public final int a(String str) {
        if (str == null) {
            return -1;
        }
        xy0 xy0Var = this.a;
        Object obj = xy0Var.get(str);
        if (obj == null) {
            obj = Integer.valueOf(View.generateViewId());
            xy0Var.put(str, obj);
        }
        return ((Number) obj).intValue();
    }
}
