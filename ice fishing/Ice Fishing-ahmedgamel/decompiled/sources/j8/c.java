package j8;

import Q7.j;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Comparator;
import x.C5175n;
import y8.h;
import y8.r;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f38494a = new byte[0];

    static {
        h hVar = h.f41925w;
        y8.b.e(C5175n.c("efbbbf"), C5175n.c("feff"), C5175n.c("fffe0000"), C5175n.c("fffe"), C5175n.c("0000feff"));
    }

    public static final void a(Closeable closeable) {
        kotlin.jvm.internal.h.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e9) {
            throw e9;
        } catch (Exception unused) {
        }
    }

    public static final int b(int i, int i4, String str, String str2) {
        kotlin.jvm.internal.h.e(str, "<this>");
        while (i < i4) {
            if (j.l0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i4;
    }

    public static final int c(String str, int i, int i4, char c9) {
        kotlin.jvm.internal.h.e(str, "<this>");
        while (i < i4) {
            if (str.charAt(i) == c9) {
                return i;
            }
            i++;
        }
        return i4;
    }

    public static final boolean d(Comparator comparator, String[] strArr, String[] strArr2) {
        kotlin.jvm.internal.h.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int e(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (kotlin.jvm.internal.h.f(charAt, 31) <= 0 || kotlin.jvm.internal.h.f(charAt, com.anythink.expressad.video.module.a.a.f22515R) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int f(int i, int i4, String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        while (i < i4) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i4;
    }

    public static final int g(int i, int i4, String str) {
        kotlin.jvm.internal.h.e(str, "<this>");
        int i6 = i4 - 1;
        if (i <= i6) {
            while (true) {
                char charAt = str.charAt(i6);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i6 + 1;
                }
                if (i6 == i) {
                    break;
                }
                i6--;
            }
        }
        return i;
    }

    public static final String[] h(Comparator comparator, String[] strArr, String[] other) {
        kotlin.jvm.internal.h.e(strArr, "<this>");
        kotlin.jvm.internal.h.e(other, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, other[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean i(String name) {
        kotlin.jvm.internal.h.e(name, "name");
        return name.equalsIgnoreCase("Authorization") || name.equalsIgnoreCase("Cookie") || name.equalsIgnoreCase("Proxy-Authorization") || name.equalsIgnoreCase("Set-Cookie");
    }

    public static final int j(char c9) {
        if ('0' <= c9 && c9 < ':') {
            return c9 - '0';
        }
        if ('a' <= c9 && c9 < 'g') {
            return c9 - 'W';
        }
        if ('A' > c9 || c9 >= 'G') {
            return -1;
        }
        return c9 - '7';
    }

    public static final int k(r rVar) {
        kotlin.jvm.internal.h.e(rVar, "<this>");
        return (rVar.z() & 255) | ((rVar.z() & 255) << 16) | ((rVar.z() & 255) << 8);
    }

    public static final int l(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String m(int i, int i4, String str) {
        int f2 = f(i, i4, str);
        String substring = str.substring(f2, g(f2, i4, str));
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        return substring;
    }
}
