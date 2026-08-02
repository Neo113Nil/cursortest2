package defpackage;

import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class db2 {
    public static String a(String str) {
        str.getClass();
        String Y = StringsKt.Y(str, "tab_prefix_");
        if (!Y.equals(str) && Y.length() != 0) {
            return Y;
        }
        su4.s(2, null, "tab media id is corrupted", null);
        return null;
    }
}
