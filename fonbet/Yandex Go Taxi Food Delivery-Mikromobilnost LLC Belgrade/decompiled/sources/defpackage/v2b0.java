package defpackage;

import java.util.List;

/* loaded from: classes15.dex */
public abstract class v2b0 {
    public abstract int a(String str, String str2);

    public abstract boolean b(String str, String str2);

    public abstract byte[] c(String str, String str2);

    public abstract List d(String str);

    public abstract long e(String str, String str2, byte[] bArr);

    public void f(String str, String str2, byte[] bArr) {
        if (b(str, str2)) {
            z83.b(null, 1, Integer.valueOf(g(str, str2, bArr)));
        } else {
            z83.h(null, -1 != e(str, str2, bArr));
        }
    }

    public abstract int g(String str, String str2, byte[] bArr);
}
