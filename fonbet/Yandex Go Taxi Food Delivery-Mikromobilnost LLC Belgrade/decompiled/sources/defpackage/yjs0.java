package defpackage;

import android.content.Context;

/* loaded from: classes10.dex */
public abstract class yjs0 {
    public boolean a;
    public int b;
    public int c;

    public final void a(Context context, qa10 qa10Var) {
        this.a = true;
        c(context, qa10Var);
        if (this.a) {
            vg10.o(getClass().getCanonicalName(), "Missing 'setMeasuredDimens' call by ");
        }
    }

    public abstract void b(Context context, int i, int i2, int i3, n86 n86Var);

    public abstract void c(Context context, qa10 qa10Var);

    public final void d(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.a = false;
    }
}
