package defpackage;

import java.util.Locale;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class c85 {
    public final int a;

    public /* synthetic */ c85(int i) {
        this.a = i;
    }

    public static String a(int i) {
        String hexString = Integer.toHexString(i);
        hexString.getClass();
        String upperCase = StringsKt.X(8, hexString).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return "#".concat(upperCase);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c85) {
            return this.a == ((c85) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
