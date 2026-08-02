package defpackage;

import android.os.Bundle;

/* loaded from: classes10.dex */
public abstract class t550 {
    public static final n550 b;
    public static final n550 c;
    public static final m550 d;
    public static final m550 e;
    public static final n550 f;
    public static final m550 g;
    public static final m550 h;
    public static final n550 i;
    public static final m550 j;
    public static final m550 k;
    public static final n550 l;
    public static final m550 m;
    public static final m550 n;
    public static final n550 o;
    public static final m550 p;
    public static final m550 q;
    public final boolean a;

    static {
        boolean z = false;
        b = new n550(z, 2);
        int i2 = 4;
        c = new n550(z, i2);
        boolean z2 = true;
        d = new m550(z2, i2);
        e = new m550(z2, 5);
        f = new n550(z, 3);
        g = new m550(z2, 6);
        h = new m550(z2, 7);
        i = new n550(z, 1);
        j = new m550(z2, 2);
        k = new m550(z2, 3);
        int i3 = 0;
        l = new n550(z, i3);
        m = new m550(z2, i3);
        n = new m550(z2, 1);
        o = new n550(z2, 5);
        p = new m550(z2, 8);
        q = new m550(z2, 9);
    }

    public t550(boolean z) {
        this.a = z;
    }

    public abstract Object a(Bundle bundle, String str);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public boolean f(Object obj, Object obj2) {
        return jl40.l(obj, obj2);
    }

    public final String toString() {
        return b();
    }
}
