package defpackage;

import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class h6k extends p1g {
    public final Method a;
    public final int b;
    public final String c;
    public final pj3 d;
    public final boolean e;

    public h6k(Method method, int i, String str, boolean z) {
        pj3 pj3Var = pj3.b;
        this.a = method;
        this.b = i;
        Objects.requireNonNull(str, "name == null");
        this.c = str;
        this.d = pj3Var;
        this.e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    @Override // defpackage.p1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(j0o j0oVar, Object obj) {
        String str;
        String replace;
        String str2 = this.c;
        if (obj == null) {
            throw jf0.R(this.a, this.b, hrg.q("Path parameter \"", str2, "\" value must not be null."), new Object[0]);
        }
        this.d.getClass();
        String obj2 = obj.toString();
        if (j0oVar.c == null) {
            wvs.b();
            return;
        }
        int length = obj2.length();
        int i = 0;
        while (i < length) {
            int codePointAt = obj2.codePointAt(i);
            boolean z = this.e;
            int i2 = 47;
            int i3 = -1;
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                hi3 hi3Var = new hi3();
                hi3Var.R0(0, i, obj2);
                hi3 hi3Var2 = null;
                while (i < length) {
                    int codePointAt2 = obj2.codePointAt(i);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i3 || (!z && (codePointAt2 == i2 || codePointAt2 == 37))) {
                            if (hi3Var2 == null) {
                                hi3Var2 = new hi3();
                            }
                            hi3Var2.T0(codePointAt2);
                            while (!hi3Var2.N()) {
                                byte readByte = hi3Var2.readByte();
                                hi3Var.M0(37);
                                char[] cArr = j0o.l;
                                hi3Var.M0(cArr[((readByte & 255) >> 4) & 15]);
                                hi3Var.M0(cArr[readByte & 15]);
                            }
                        } else {
                            hi3Var.T0(codePointAt2);
                        }
                    }
                    i += Character.charCount(codePointAt2);
                    i2 = 47;
                    i3 = -1;
                }
                str = hi3Var.G0();
                replace = j0oVar.c.replace("{" + str2 + "}", str);
                if (j0o.m.matcher(replace).matches()) {
                    j0oVar.c = replace;
                    return;
                } else {
                    xq0.x("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(obj2));
                    return;
                }
            }
            i += Character.charCount(codePointAt);
        }
        str = obj2;
        replace = j0oVar.c.replace("{" + str2 + "}", str);
        if (j0o.m.matcher(replace).matches()) {
        }
    }
}
