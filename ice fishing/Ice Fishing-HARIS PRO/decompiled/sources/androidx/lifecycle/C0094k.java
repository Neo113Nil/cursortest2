package androidx.lifecycle;

/* renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094k {
    public static EnumC0096m a(EnumC0097n enumC0097n) {
        D1.i.e(enumC0097n, "state");
        int ordinal = enumC0097n.ordinal();
        if (ordinal == 1) {
            return EnumC0096m.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0096m.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0096m.ON_RESUME;
    }
}
