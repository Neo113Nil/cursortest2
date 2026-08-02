package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class sct implements upr {
    public final d7k a = new d7k();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int g;

    public sct(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = dvt.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.upr
    public final void i(byte[] bArr, int i, int i2, tpr tprVar, ua6 ua6Var) {
        String t;
        int i3;
        int i4;
        d7k d7kVar = this.a;
        d7kVar.F(i + i2, bArr);
        d7kVar.H(i);
        int i5 = 1;
        int i6 = 0;
        int i7 = 2;
        vq1.v(d7kVar.a() >= 2);
        int B = d7kVar.B();
        if (B == 0) {
            t = "";
        } else {
            int i8 = d7kVar.b;
            Charset D = d7kVar.D();
            int i9 = B - (d7kVar.b - i8);
            if (D == null) {
                D = StandardCharsets.UTF_8;
            }
            t = d7kVar.t(i9, D);
        }
        if (t.isEmpty()) {
            ude udeVar = yde.b;
            ua6Var.accept(new uv6(-9223372036854775807L, -9223372036854775807L, qsn.e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t);
        b(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float f = this.f;
        while (d7kVar.a() >= 8) {
            int i10 = d7kVar.b;
            int h = d7kVar.h();
            int h2 = d7kVar.h();
            if (h2 == 1937013100) {
                vq1.v(d7kVar.a() >= i7 ? i5 : i6);
                int B2 = d7kVar.B();
                int i11 = i6;
                while (i11 < B2) {
                    vq1.v(d7kVar.a() >= 12 ? i5 : i6);
                    int B3 = d7kVar.B();
                    int B4 = d7kVar.B();
                    d7kVar.I(i7);
                    int i12 = i11;
                    int v = d7kVar.v();
                    d7kVar.I(i5);
                    int h3 = d7kVar.h();
                    if (B4 > spannableStringBuilder.length()) {
                        StringBuilder q = k5r.q(B4, "Truncating styl end (", ") to cueText.length() (");
                        q.append(spannableStringBuilder.length());
                        q.append(").");
                        vq1.n0("Tx3gParser", q.toString());
                        B4 = spannableStringBuilder.length();
                    }
                    if (B3 >= B4) {
                        vq1.n0("Tx3gParser", dfi.f("Ignoring styl with start (", B3, B4, ") >= end (", ")."));
                        i4 = i12;
                    } else {
                        i4 = i12;
                        int i13 = B4;
                        b(spannableStringBuilder, v, this.c, B3, i13, 0);
                        a(spannableStringBuilder, h3, this.d, B3, i13, 0);
                    }
                    i11 = i4 + 1;
                    i5 = 1;
                    i6 = 0;
                    i7 = 2;
                }
                i3 = i7;
            } else if (h2 == 1952608120 && this.b) {
                i3 = 2;
                vq1.v(d7kVar.a() >= 2);
                f = dvt.h(d7kVar.B() / this.g, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            d7kVar.H(i10 + h);
            i7 = i3;
            i5 = 1;
            i6 = 0;
        }
        ua6Var.accept(new uv6(-9223372036854775807L, -9223372036854775807L, yde.y(new rv6(spannableStringBuilder, null, null, null, f, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f))));
    }

    @Override // defpackage.upr
    public final int y() {
        return 2;
    }
}
