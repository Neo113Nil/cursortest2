package defpackage;

import kotlin.text.b;

/* loaded from: classes3.dex */
public final class jy4 extends tst {
    public static final jy4 e = new jy4("userCollectionHue", Float.valueOf(-1.0f), false, false);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tst
    public final String a(Boolean bool) {
        return String.valueOf(((Number) bool).floatValue());
    }

    @Override // defpackage.tst
    public final Object b(String str) {
        if (str != null) {
            return b.i(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jy4);
    }

    public final int hashCode() {
        return -461297632;
    }

    public final String toString() {
        return "CollectionHue";
    }
}
