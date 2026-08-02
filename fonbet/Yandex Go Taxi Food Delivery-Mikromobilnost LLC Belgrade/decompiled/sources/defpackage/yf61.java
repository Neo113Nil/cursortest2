package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes9.dex */
public abstract class yf61 {
    public static final byte[] a = new byte[0];
    public static final ng70 b = ffx.b0(cvw.r("efbbbf"), cvw.r("feff"), cvw.r("fffe0000"), cvw.r("fffe"), cvw.r("0000feff"));

    public static final void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder w = unr0.w(j, "length=", ", offset=");
            w.append(j2);
            w.append(", count=");
            w.append(j2);
            throw new ArrayIndexOutOfBoundsException(w.toString());
        }
    }

    public static final void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void c(r1r r1rVar, oq90 oq90Var) {
        try {
            IOException iOException = null;
            for (oq90 oq90Var2 : r1rVar.o(oq90Var)) {
                try {
                    if (r1rVar.v(oq90Var2).b) {
                        c(r1rVar, oq90Var2);
                    }
                    r1rVar.k(oq90Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int d(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (evu0.z(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int e(String str, char c, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int f(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return e(str, c, i, i2);
    }

    public static final boolean g(String[] strArr, String[] strArr2, Comparator comparator) {
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

    public static final int h(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (jl40.q(charAt, 31) <= 0 || jl40.q(charAt, HProv.PP_VERSION_TIMESTAMP) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int i(int i, int i2, String str) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int j(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] k(String[] strArr, String[] strArr2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean l(String str) {
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int m(char c) {
        if ('0' <= c && c < ':') {
            return c - MoneyInputEditView.DEFAULT_VALUE;
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final int n(qq6 qq6Var) {
        return (qq6Var.readByte() & 255) | ((qq6Var.readByte() & 255) << 16) | ((qq6Var.readByte() & 255) << 8);
    }

    public static final int o(yp6 yp6Var) {
        int i = 0;
        while (!yp6Var.I1() && yp6Var.e(0L) == 61) {
            i++;
            yp6Var.readByte();
        }
        return i;
    }

    public static final int p(int i, String str) {
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

    public static final String q(int i, int i2, String str) {
        int i3 = i(i, i2, str);
        return str.substring(i3, j(i3, i2, str));
    }
}
