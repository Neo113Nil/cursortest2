package defpackage;

import java.lang.reflect.Method;
import java.util.Objects;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class rc90 extends d6z {
    public final Method f;
    public final int g;
    public final String h;
    public final zme i;
    public final boolean j;

    public rc90(Method method, int i, String str, zme zmeVar, boolean z) {
        this.f = method;
        this.g = i;
        Objects.requireNonNull(str, "name == null");
        this.h = str;
        this.i = zmeVar;
        this.j = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    @Override // defpackage.d6z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(q5j0 q5j0Var, Object obj) {
        String str;
        String replace;
        String str2 = this.h;
        if (obj == null) {
            throw udq0.J(this.f, this.g, oyr.p("Path parameter \"", str2, "\" value must not be null."), new Object[0]);
        }
        String str3 = (String) this.i.l(obj);
        if (q5j0Var.c == null) {
            ny61.w();
            return;
        }
        int length = str3.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str3.codePointAt(i);
            boolean z = this.j;
            int i2 = 47;
            int i3 = -1;
            int i4 = HProv.PP_VERSION_TIMESTAMP;
            int i5 = 32;
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                yp6 yp6Var = new yp6();
                yp6Var.w0(0, i, str3);
                yp6 yp6Var2 = null;
                while (i < length) {
                    int codePointAt2 = str3.codePointAt(i);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 < i5 || codePointAt2 >= i4 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i3 || (!z && (codePointAt2 == i2 || codePointAt2 == 37))) {
                            if (yp6Var2 == null) {
                                yp6Var2 = new yp6();
                            }
                            yp6Var2.z0(codePointAt2);
                            long j = yp6Var2.b;
                            long j2 = 0;
                            while (j2 < j) {
                                byte e = yp6Var2.e(j2);
                                yp6Var.e0(37);
                                char[] cArr = q5j0.l;
                                yp6Var.e0(cArr[((e & 255) >> 4) & 15]);
                                yp6Var.e0(cArr[e & PKIBody._CCP]);
                                j2++;
                                yp6Var2 = yp6Var2;
                            }
                            yp6Var2.clear();
                        } else {
                            yp6Var.z0(codePointAt2);
                        }
                    }
                    i += Character.charCount(codePointAt2);
                    i2 = 47;
                    i3 = -1;
                    i4 = HProv.PP_VERSION_TIMESTAMP;
                    i5 = 32;
                }
                str = yp6Var.I0();
                replace = q5j0Var.c.replace("{" + str2 + "}", str);
                if (q5j0.m.matcher(replace).matches()) {
                    q5j0Var.c = replace;
                    return;
                } else {
                    ny61.g("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(str3));
                    return;
                }
            }
            i += Character.charCount(codePointAt);
        }
        str = str3;
        replace = q5j0Var.c.replace("{" + str2 + "}", str);
        if (q5j0.m.matcher(replace).matches()) {
        }
    }
}
