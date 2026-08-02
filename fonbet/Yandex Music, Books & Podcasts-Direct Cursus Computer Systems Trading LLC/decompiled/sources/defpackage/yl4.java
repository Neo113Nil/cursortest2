package defpackage;

import android.util.Property;

/* loaded from: classes3.dex */
public final class yl4 extends Property {
    public static final yl4 a = new yl4(am4.class, "circularReveal");

    @Override // android.util.Property
    public final Object get(Object obj) {
        return ((bm4) obj).getRevealInfo();
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((bm4) obj).setRevealInfo((am4) obj2);
    }
}
