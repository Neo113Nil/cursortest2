package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* loaded from: classes3.dex */
public abstract class d7n {
    public static final ConcurrentHashMap a = new ConcurrentHashMap(128);

    public static int a(String str, String str2) {
        str.getClass();
        int length = str.length();
        int length2 = str2.length();
        int i = 0;
        while (i <= length - length2) {
            String str3 = str;
            String str4 = str2;
            if (str3.regionMatches(true, i, str4, 0, length2)) {
                boolean z = true;
                boolean z2 = i == 0 || !c(str3.charAt(i + (-1)));
                int i2 = i + length2;
                if (i2 < length && c(str3.charAt(i2))) {
                    z = false;
                }
                if (z2 && z) {
                    return i;
                }
            }
            i++;
            str = str3;
            str2 = str4;
        }
        return -1;
    }

    public static boolean b(String str, String str2) {
        str.getClass();
        int length = str.length();
        int i = 0;
        while (i < length && CharsKt.d(str.charAt(i))) {
            i++;
        }
        int length2 = str2.length();
        int i2 = i + length2;
        return i2 <= length && str.regionMatches(true, i, str2, 0, length2) && (i2 >= length || !c(str.charAt(i2)));
    }

    public static boolean c(char c) {
        return Character.isLetterOrDigit(c) || c == '_';
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c7n d(String str) {
        int i;
        str.getClass();
        ConcurrentHashMap concurrentHashMap = a;
        if (concurrentHashMap.size() > 256) {
            concurrentHashMap.clear();
        }
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            int a2 = a(str, "FROM");
            int a3 = a(str, "INTO");
            int a4 = a(str, "UPDATE");
            String str2 = "_unknown";
            if (a2 >= 0 && ((a3 < 0 || a2 <= a3) && (a4 < 0 || a2 <= a4))) {
                i = a2 + 4;
            } else if (a3 < 0 || (a4 >= 0 && a3 > a4)) {
                if (a4 >= 0) {
                    i = a4 + 6;
                }
                c7n c7nVar = new c7n(str2, !b(str, "SELECT") ? b7n.a : (b(str, "INSERT") && c.n(str2, "_mview", false)) ? b7n.b : b7n.c);
                Object putIfAbsent = concurrentHashMap.putIfAbsent(str, c7nVar);
                obj = putIfAbsent != null ? c7nVar : putIfAbsent;
            } else {
                i = a3 + 4;
            }
            int length = str.length();
            while (i < length && CharsKt.d(str.charAt(i))) {
                i++;
            }
            String str3 = null;
            if (i < length) {
                char charAt = str.charAt(i);
                if (charAt != '\"' && charAt != '\'') {
                    if (charAt == '[') {
                        int i2 = i + 1;
                        int S = StringsKt.S(str, ']', i2, 4);
                        if (S >= 0) {
                            str3 = str.substring(i2, S);
                        }
                    } else if (charAt != '`') {
                        int i3 = i;
                        while (i3 < length && c(str.charAt(i3))) {
                            i3++;
                        }
                        if (i3 != i) {
                            str3 = str.substring(i, i3);
                        }
                    }
                }
                int i4 = i + 1;
                int S2 = StringsKt.S(str, charAt, i4, 4);
                if (S2 >= 0) {
                    str3 = str.substring(i4, S2);
                }
            }
            if (str3 != null) {
                str2 = str3;
            }
            c7n c7nVar2 = new c7n(str2, !b(str, "SELECT") ? b7n.a : (b(str, "INSERT") && c.n(str2, "_mview", false)) ? b7n.b : b7n.c);
            Object putIfAbsent2 = concurrentHashMap.putIfAbsent(str, c7nVar2);
            if (putIfAbsent2 != null) {
            }
        }
        return (c7n) obj;
    }
}
