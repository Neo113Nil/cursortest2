package defpackage;

import android.util.Property;

/* loaded from: classes3.dex */
public final class zl4 extends Property {
    public static final zl4 a = new zl4(Integer.class, "circularRevealScrimColor");

    @Override // android.util.Property
    public final Object get(Object obj) {
        return Integer.valueOf(((bm4) obj).getCircularRevealScrimColor());
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((bm4) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
    }
}
