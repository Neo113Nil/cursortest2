package com.google.gson.stream;

import com.connectsdk.service.airplay.PListParser;
import com.google.gson.FormattingStyle;
import com.google.gson.Strictness;
import defpackage.b6e;
import defpackage.kac;
import defpackage.wvs;
import defpackage.xq0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class JsonWriter implements Closeable, Flushable {
    private static final Pattern l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] m = new String[128];
    private static final String[] n;
    private final Writer a;
    private int[] b = new int[32];
    private int c = 0;
    private FormattingStyle d;
    private String e;
    private String f;
    private boolean g;
    private Strictness h;
    private boolean i;
    private String j;
    private boolean k;

    static {
        for (int i = 0; i <= 31; i++) {
            m[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        G0(6);
        this.h = Strictness.b;
        this.k = true;
        Objects.requireNonNull(writer, "out == null");
        this.a = writer;
        I0(FormattingStyle.d);
    }

    private JsonWriter D(int i, int i2, char c) throws IOException {
        int peek = peek();
        if (peek != i2 && peek != i) {
            xq0.q("Nesting problem.");
            return null;
        }
        if (this.j != null) {
            b6e.w(this.j, "Dangling name: ");
            return null;
        }
        this.c--;
        if (peek == i2) {
            j0();
        }
        this.a.write(c);
        return this;
    }

    private JsonWriter F0(int i, char c) throws IOException {
        g();
        G0(i);
        this.a.write(c);
        return this;
    }

    private void G0(int i) {
        int i2 = this.c;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            this.b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        iArr2[i3] = i;
    }

    private void H0(int i) {
        this.b[this.c - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void O0(String str) throws IOException {
        int i;
        String str2;
        String[] strArr = this.i ? n : m;
        this.a.write(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    this.a.write(str, i2, i - i2);
                }
                this.a.write(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                this.a.write(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            this.a.write(str, i2, length - i2);
        }
        this.a.write(34);
    }

    private void W0() throws IOException {
        if (this.j != null) {
            b();
            O0(this.j);
            this.j = null;
        }
    }

    private static boolean a(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void b() throws IOException {
        int peek = peek();
        if (peek == 5) {
            this.a.write(this.f);
        } else if (peek != 3) {
            xq0.q("Nesting problem.");
            return;
        }
        j0();
        H0(4);
    }

    private void g() throws IOException {
        int peek = peek();
        if (peek == 1) {
            H0(2);
            j0();
            return;
        }
        if (peek == 2) {
            this.a.append((CharSequence) this.f);
            j0();
            return;
        }
        if (peek == 4) {
            this.a.append((CharSequence) this.e);
            H0(5);
            return;
        }
        if (peek != 6) {
            if (peek != 7) {
                xq0.q("Nesting problem.");
                return;
            } else if (this.h != Strictness.a) {
                xq0.q("JSON must have only one top-level value.");
                return;
            }
        }
        H0(7);
    }

    private void j0() throws IOException {
        if (this.g) {
            return;
        }
        this.a.write(this.d.a);
        int i = this.c;
        for (int i2 = 1; i2 < i; i2++) {
            this.a.write(this.d.b);
        }
    }

    private int peek() {
        int i = this.c;
        if (i != 0) {
            return this.b[i - 1];
        }
        xq0.q("JsonWriter is closed.");
        return 0;
    }

    public JsonWriter H() throws IOException {
        return D(1, 2, ']');
    }

    public JsonWriter I() throws IOException {
        return D(3, 5, '}');
    }

    public final void I0(FormattingStyle formattingStyle) {
        Objects.requireNonNull(formattingStyle);
        this.d = formattingStyle;
        this.f = StringUtils.COMMA;
        if (formattingStyle.c) {
            this.e = ": ";
            if (formattingStyle.a.isEmpty()) {
                this.f = ", ";
            }
        } else {
            this.e = StringUtils.PROCESS_POSTFIX_DELIMITER;
        }
        this.g = this.d.a.isEmpty() && this.d.b.isEmpty();
    }

    public final void J0(boolean z) {
        this.i = z;
    }

    public final void K0(String str) {
        if (str.isEmpty()) {
            I0(FormattingStyle.d);
        } else {
            FormattingStyle formattingStyle = FormattingStyle.e;
            I0(new FormattingStyle(formattingStyle.a, str, formattingStyle.c));
        }
    }

    @Deprecated
    public final void L0(boolean z) {
        N0(z ? Strictness.a : Strictness.b);
    }

    public final void M0(boolean z) {
        this.k = z;
    }

    public final FormattingStyle N() {
        return this.d;
    }

    public final void N0(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.h = strictness;
    }

    public final boolean P() {
        return this.k;
    }

    public JsonWriter P0(double d) throws IOException {
        W0();
        if (this.h != Strictness.a && (Double.isNaN(d) || Double.isInfinite(d))) {
            b6e.i(d, "Numeric values must be finite, but was ");
            return null;
        }
        g();
        this.a.append((CharSequence) Double.toString(d));
        return this;
    }

    public final Strictness Q() {
        return this.h;
    }

    public JsonWriter Q0(float f) throws IOException {
        W0();
        if (this.h == Strictness.a || !(Float.isNaN(f) || Float.isInfinite(f))) {
            g();
            this.a.append((CharSequence) Float.toString(f));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
    }

    public final boolean R() {
        return this.i;
    }

    public JsonWriter R0(long j) throws IOException {
        W0();
        g();
        this.a.write(Long.toString(j));
        return this;
    }

    public boolean S() {
        return this.h == Strictness.a;
    }

    public JsonWriter S0(Boolean bool) throws IOException {
        if (bool == null) {
            return l0();
        }
        W0();
        g();
        this.a.write(bool.booleanValue() ? PListParser.TAG_TRUE : PListParser.TAG_FALSE);
        return this;
    }

    public JsonWriter T0(Number number) throws IOException {
        if (number == null) {
            return l0();
        }
        W0();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (!a(cls)) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                if (this.h != Strictness.a) {
                    xq0.x("Numeric values must be finite, but was ".concat(obj));
                    return null;
                }
            } else if (cls != Float.class && cls != Double.class && !l.matcher(obj).matches()) {
                wvs.i("String created by ", cls, " is not a valid JSON number: ", obj);
                return null;
            }
        }
        g();
        this.a.append((CharSequence) obj);
        return this;
    }

    public JsonWriter U0(String str) throws IOException {
        if (str == null) {
            return l0();
        }
        W0();
        g();
        O0(str);
        return this;
    }

    public JsonWriter V0(boolean z) throws IOException {
        W0();
        g();
        this.a.write(z ? PListParser.TAG_TRUE : PListParser.TAG_FALSE);
        return this;
    }

    public JsonWriter X(String str) throws IOException {
        if (str == null) {
            return l0();
        }
        W0();
        g();
        this.a.append((CharSequence) str);
        return this;
    }

    public JsonWriter Y(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.j != null) {
            xq0.q("Already wrote a name, expecting a value.");
            return null;
        }
        int peek = peek();
        if (peek == 3 || peek == 5) {
            this.j = str;
            return this;
        }
        xq0.q("Please begin an object before writing a name.");
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
        int i = this.c;
        if (i > 1 || (i == 1 && this.b[i - 1] != 7)) {
            kac.f("Incomplete document");
        } else {
            this.c = 0;
        }
    }

    public void flush() throws IOException {
        if (this.c != 0) {
            this.a.flush();
        } else {
            xq0.q("JsonWriter is closed.");
        }
    }

    public JsonWriter l0() throws IOException {
        if (this.j != null) {
            if (!this.k) {
                this.j = null;
                return this;
            }
            W0();
        }
        g();
        this.a.write("null");
        return this;
    }

    public JsonWriter o() throws IOException {
        W0();
        return F0(1, '[');
    }

    public JsonWriter z() throws IOException {
        W0();
        return F0(3, '{');
    }
}
