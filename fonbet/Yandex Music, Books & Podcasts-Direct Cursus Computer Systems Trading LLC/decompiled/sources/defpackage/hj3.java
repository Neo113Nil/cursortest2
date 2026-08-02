package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class hj3 implements r7f {
    public static final aaw g = new aaw(15);
    public static final String[] h;
    public final hi3 a;
    public int b;
    public final int[] c = new int[256];
    public final String[] d = new String[256];
    public final int[] e = new int[256];
    public String f;

    static {
        String[] strArr = new String[128];
        for (int i = 0; i < 32; i++) {
            byte b = (byte) i;
            g.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("0123456789abcdef".charAt(b >>> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
            strArr[i] = "\\u00".concat(sb.toString());
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        h = strArr;
    }

    public hj3(hi3 hi3Var) {
        this.a = hi3Var;
        z(6);
    }

    @Override // defpackage.r7f
    public final r7f B0() {
        g("null");
        return this;
    }

    public final void D() {
        if (this.f != null) {
            int o = o();
            hi3 hi3Var = this.a;
            if (o == 5) {
                hi3Var.M0(44);
            } else if (o != 3) {
                xq0.q("Nesting problem.");
                return;
            }
            this.c[this.b - 1] = 4;
            String str = this.f;
            str.getClass();
            aaw.x(hi3Var, str);
            this.f = null;
        }
    }

    @Override // defpackage.r7f
    public final r7f J(boolean z) {
        g(z ? PListParser.TAG_TRUE : PListParser.TAG_FALSE);
        return this;
    }

    @Override // defpackage.r7f
    public final r7f Z(String str) {
        int i = this.b;
        if (i == 0) {
            xq0.q("JsonWriter is closed.");
            return null;
        }
        if (this.f != null) {
            xq0.q("Nesting problem.");
            return null;
        }
        this.f = str;
        this.d[i - 1] = str;
        return this;
    }

    public final void a() {
        int o = o();
        int[] iArr = this.c;
        if (o == 1) {
            iArr[this.b - 1] = 2;
            return;
        }
        hi3 hi3Var = this.a;
        if (o == 2) {
            hi3Var.M0(44);
            return;
        }
        if (o == 4) {
            hi3Var.S0(StringUtils.PROCESS_POSTFIX_DELIMITER);
            iArr[this.b - 1] = 5;
        } else if (o == 6) {
            iArr[this.b - 1] = 7;
        } else if (o != 7) {
            xq0.q("Nesting problem.");
        } else {
            xq0.q("JSON must have only one top-level value.");
        }
    }

    public final void b(int i, int i2, String str) {
        int o = o();
        if (o != i2 && o != i) {
            xq0.q("Nesting problem.");
            return;
        }
        if (this.f != null) {
            l1j.m(this.f, "Dangling name: ");
            return;
        }
        int i3 = this.b;
        int i4 = i3 - 1;
        this.b = i4;
        this.d[i4] = null;
        int i5 = i3 - 2;
        int[] iArr = this.e;
        iArr[i5] = iArr[i5] + 1;
        this.a.S0(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i > 1 || (i == 1 && this.c[i - 1] != 7)) {
            kac.f("Incomplete document");
        } else {
            this.b = 0;
        }
    }

    public final void g(String str) {
        str.getClass();
        D();
        a();
        this.a.S0(str);
        int i = this.b - 1;
        int[] iArr = this.e;
        iArr[i] = iArr[i] + 1;
    }

    @Override // defpackage.r7f
    public final r7f i0(o5f o5fVar) {
        o5fVar.getClass();
        g(o5fVar.a);
        return this;
    }

    @Override // defpackage.r7f
    public final r7f j() {
        D();
        a();
        z(3);
        this.e[this.b - 1] = 0;
        this.a.S0("{");
        return this;
    }

    @Override // defpackage.r7f
    public final r7f l() {
        b(1, 2, "]");
        return this;
    }

    @Override // defpackage.r7f
    public final r7f m() {
        D();
        a();
        z(1);
        this.e[this.b - 1] = 0;
        this.a.S0("[");
        return this;
    }

    @Override // defpackage.r7f
    public final r7f m0(String str) {
        str.getClass();
        D();
        a();
        aaw.x(this.a, str);
        int i = this.b - 1;
        int[] iArr = this.e;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    public final int o() {
        int i = this.b;
        if (i != 0) {
            return this.c[i - 1];
        }
        xq0.q("JsonWriter is closed.");
        return 0;
    }

    @Override // defpackage.r7f
    public final r7f p() {
        b(3, 5, "}");
        return this;
    }

    @Override // defpackage.r7f
    public final r7f t(long j) {
        g(String.valueOf(j));
        return this;
    }

    @Override // defpackage.r7f
    public final r7f u(int i) {
        g(String.valueOf(i));
        return this;
    }

    @Override // defpackage.r7f
    public final r7f y(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            g(String.valueOf(d));
            return this;
        }
        throw new IllegalArgumentException(("Numeric values must be finite, but was " + d).toString());
    }

    public final void z(int i) {
        String str;
        int i2 = this.b;
        int[] iArr = this.c;
        if (i2 != iArr.length) {
            this.b = i2 + 1;
            iArr[i2] = i;
            return;
        }
        int i3 = this.b;
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = this.c[i4];
            if (i5 == 1 || i5 == 2) {
                arrayList.add(Integer.valueOf(this.e[i4]));
            } else if ((i5 == 3 || i5 == 4 || i5 == 5) && (str = this.d[i4]) != null) {
                arrayList.add(str);
            }
        }
        throw new lp0("Nesting too deep at " + CollectionsKt.X(arrayList, ".", null, null, null, 62) + ": circular reference?", null);
    }
}
