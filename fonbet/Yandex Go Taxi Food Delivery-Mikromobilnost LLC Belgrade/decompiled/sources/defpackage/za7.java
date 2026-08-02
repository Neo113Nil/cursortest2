package defpackage;

import kotlin.time.DurationUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class za7 {
    public static final za7 n;
    public static final za7 o;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public String m;

    static {
        ya7 ya7Var = new ya7();
        ya7Var.a = true;
        n = ya7Var.a();
        ya7 ya7Var2 = new ya7();
        ya7Var2.d = true;
        o430 o430Var = e3n.b;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        long o2 = e3n.o(kp50.U(Integer.MAX_VALUE, durationUnit), durationUnit);
        if (o2 < 0) {
            w511.f(qv10.j(o2, "maxStale < 0: "));
        } else {
            ya7Var2.c = o2 <= 2147483647L ? (int) o2 : Integer.MAX_VALUE;
            o = ya7Var2.a();
        }
    }

    public za7(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    public final String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.b) {
            sb.append("no-store, ");
        }
        int i = this.c;
        if (i != -1) {
            n.A(sb, "max-age=", i, Extension.FIX_SPACE);
        }
        int i2 = this.d;
        if (i2 != -1) {
            n.A(sb, "s-maxage=", i2, Extension.FIX_SPACE);
        }
        if (this.e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.h;
        if (i3 != -1) {
            n.A(sb, "max-stale=", i3, Extension.FIX_SPACE);
        }
        int i4 = this.i;
        if (i4 != -1) {
            n.A(sb, "min-fresh=", i4, Extension.FIX_SPACE);
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        this.m = sb2;
        return sb2;
    }
}
