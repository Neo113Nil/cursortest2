package defpackage;

import android.content.res.TypedArray;
import android.util.SparseArray;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class ah3 implements x0t, yko {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public ah3(CharSequence charSequence, int i, Locale locale) {
        this.a = 8;
        this.d = charSequence;
        if (charSequence.length() < 0) {
            tme.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            tme.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new he4(i, charSequence));
    }

    public static boolean y(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public Integer A() {
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        String str = (String) this.d;
        this.b = i + 1;
        return Integer.valueOf(str.charAt(i));
    }

    public float B() {
        jsg jsgVar = (jsg) this.e;
        float l = jsgVar.l(this.b, this.c, (String) this.d);
        if (!Float.isNaN(l)) {
            this.b = jsgVar.b;
        }
        return l;
    }

    public rko C() {
        float B = B();
        if (Float.isNaN(B)) {
            return null;
        }
        int G = G();
        return G == 0 ? new rko(1, B) : new rko(G, B);
    }

    public String D() {
        String str = (String) this.d;
        if (p()) {
            return null;
        }
        int i = this.b;
        char charAt = str.charAt(i);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        int i2 = i();
        while (i2 != -1 && i2 != charAt) {
            i2 = i();
        }
        if (i2 == -1) {
            this.b = i;
            return null;
        }
        int i3 = this.b;
        this.b = i3 + 1;
        return str.substring(i + 1, i3);
    }

    public String E() {
        return F(' ', false);
    }

    public String F(char c, boolean z) {
        String str = (String) this.d;
        if (p()) {
            return null;
        }
        char charAt = str.charAt(this.b);
        if ((!z && y(charAt)) || charAt == c) {
            return null;
        }
        int i = this.b;
        int i2 = i();
        while (i2 != -1 && i2 != c && (z || !y(i2))) {
            i2 = i();
        }
        return str.substring(i, this.b);
    }

    public int G() {
        String str = (String) this.d;
        if (p()) {
            return 0;
        }
        char charAt = str.charAt(this.b);
        int i = this.b;
        if (charAt == '%') {
            this.b = i + 1;
            return 9;
        }
        if (i > this.c - 2) {
            return 0;
        }
        try {
            int q = tlm.q(str.substring(i, i + 2).toLowerCase(Locale.US));
            this.b += 2;
            return q;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public float H() {
        K();
        jsg jsgVar = (jsg) this.e;
        float l = jsgVar.l(this.b, this.c, (String) this.d);
        if (!Float.isNaN(l)) {
            this.b = jsgVar.b;
        }
        return l;
    }

    public int I(int i) {
        j(i);
        int preceding = ((BreakIterator) this.e).preceding(i);
        return (w(preceding) && s(preceding) && !v(preceding)) ? I(preceding) : preceding;
    }

    public void J(int i, int i2, String str) {
        if (i > i2) {
            tme.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            tme.a("start must be non-negative, but was " + i);
        }
        n8n n8nVar = (n8n) this.e;
        if (n8nVar == null) {
            int max = Math.max(KotlinVersion.MAX_COMPONENT_VALUE, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - min;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = max - min2;
            int i5 = min2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            n8n n8nVar2 = new n8n(5, (byte) 0);
            n8nVar2.b = max;
            n8nVar2.e = cArr;
            n8nVar2.c = length;
            n8nVar2.d = i4;
            this.e = n8nVar2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > n8nVar.b - n8nVar.g()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            J(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > n8nVar.g()) {
            int g = length2 - n8nVar.g();
            int i9 = n8nVar.b;
            do {
                i9 *= 2;
            } while (i9 - n8nVar.b < g);
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) n8nVar.e, 0, cArr2, 0, n8nVar.c);
            int i10 = n8nVar.b;
            int i11 = n8nVar.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) n8nVar.e, i11, cArr2, i13, (i12 + i11) - i11);
            n8nVar.e = cArr2;
            n8nVar.b = i9;
            n8nVar.d = i13;
        }
        int i14 = n8nVar.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) n8nVar.e;
            System.arraycopy(cArr3, i8, cArr3, n8nVar.d - i15, i15);
            n8nVar.c = i7;
            n8nVar.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int g2 = n8nVar.g() + i7;
            int g3 = n8nVar.g() + i8;
            int i16 = n8nVar.d;
            int i17 = g2 - i16;
            char[] cArr4 = (char[]) n8nVar.e;
            System.arraycopy(cArr4, i16, cArr4, n8nVar.c, i17);
            n8nVar.c += i17;
            n8nVar.d = g3;
        } else {
            n8nVar.d = n8nVar.g() + i8;
            n8nVar.c = i7;
        }
        str.getChars(0, str.length(), (char[]) n8nVar.e, n8nVar.c);
        n8nVar.c = str.length() + n8nVar.c;
    }

    public boolean K() {
        L();
        int i = this.b;
        if (i == this.c || ((String) this.d).charAt(i) != ',') {
            return false;
        }
        this.b++;
        L();
        return true;
    }

    public void L() {
        while (true) {
            int i = this.b;
            if (i >= this.c || !y(((String) this.d).charAt(i))) {
                return;
            } else {
                this.b++;
            }
        }
    }

    @Override // defpackage.yko
    public void a(float f, float f2, float f3, float f4) {
        h((byte) 3);
        o(4);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        this.c = i + 4;
        fArr[i4] = f4;
    }

    @Override // defpackage.x0t
    public arr b() {
        return (g3a) this.d;
    }

    @Override // defpackage.x0t
    public arr c() {
        return (b6e) this.e;
    }

    @Override // defpackage.yko
    public void close() {
        h((byte) 8);
    }

    @Override // defpackage.yko
    public void d(float f, float f2) {
        h((byte) 0);
        o(2);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        this.c = i + 2;
        fArr[i2] = f2;
    }

    @Override // defpackage.yko
    public void e(float f, float f2, float f3, float f4, float f5, float f6) {
        h((byte) 2);
        o(6);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.c = i5;
        fArr[i4] = f4;
        int i6 = i + 5;
        this.c = i6;
        fArr[i5] = f5;
        this.c = i + 6;
        fArr[i6] = f6;
    }

    @Override // defpackage.yko
    public void f(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        h((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
        o(5);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        int i3 = i + 2;
        this.c = i3;
        fArr[i2] = f2;
        int i4 = i + 3;
        this.c = i4;
        fArr[i3] = f3;
        int i5 = i + 4;
        this.c = i5;
        fArr[i4] = f4;
        this.c = i + 5;
        fArr[i5] = f5;
    }

    @Override // defpackage.yko
    public void g(float f, float f2) {
        h((byte) 1);
        o(2);
        float[] fArr = (float[]) this.e;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        this.c = i + 2;
        fArr[i2] = f2;
    }

    public void h(byte b) {
        int i = this.b;
        byte[] bArr = (byte[]) this.d;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.d = bArr2;
        }
        byte[] bArr3 = (byte[]) this.d;
        int i2 = this.b;
        this.b = i2 + 1;
        bArr3[i2] = b;
    }

    public int i() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.b = i3;
        if (i3 < i2) {
            return ((String) this.d).charAt(i3);
        }
        return -1;
    }

    public void j(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder l = dfi.l("Invalid offset: ", i, i2, ". Valid range is [", " , ");
        l.append(i3);
        l.append(']');
        tme.a(l.toString());
    }

    public Boolean k(Object obj) {
        if (obj == null) {
            return null;
        }
        K();
        int i = this.b;
        if (i == this.c) {
            return null;
        }
        char charAt = ((String) this.d).charAt(i);
        if (charAt != '0' && charAt != '1') {
            return null;
        }
        this.b++;
        return Boolean.valueOf(charAt == '1');
    }

    public float l(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        K();
        return B();
    }

    public boolean m(char c) {
        int i = this.b;
        boolean z = i < this.c && ((String) this.d).charAt(i) == c;
        if (z) {
            this.b++;
        }
        return z;
    }

    public boolean n(String str) {
        int length = str.length();
        int i = this.b;
        boolean z = i <= this.c - length && ((String) this.d).substring(i, i + length).equals(str);
        if (z) {
            this.b += length;
        }
        return z;
    }

    public void o(int i) {
        float[] fArr = (float[]) this.e;
        if (fArr.length < this.c + i) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.e = fArr2;
        }
    }

    public boolean p() {
        return this.b == this.c;
    }

    public void q(yko ykoVar) {
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            byte b = ((byte[]) this.d)[i2];
            if (b == 0) {
                float[] fArr = (float[]) this.e;
                int i3 = i + 1;
                float f = fArr[i];
                i += 2;
                ykoVar.d(f, fArr[i3]);
            } else if (b == 1) {
                float[] fArr2 = (float[]) this.e;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i += 2;
                ykoVar.g(f2, fArr2[i4]);
            } else if (b == 2) {
                float[] fArr3 = (float[]) this.e;
                ykoVar.e(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                i += 6;
            } else if (b == 3) {
                float[] fArr4 = (float[]) this.e;
                float f3 = fArr4[i];
                float f4 = fArr4[i + 1];
                int i5 = i + 3;
                float f5 = fArr4[i + 2];
                i += 4;
                ykoVar.a(f3, f4, f5, fArr4[i5]);
            } else if (b != 8) {
                boolean z = (b & 2) != 0;
                boolean z2 = (b & 1) != 0;
                float[] fArr5 = (float[]) this.e;
                ykoVar.f(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z2, fArr5[i + 3], fArr5[i + 4]);
                i += 5;
            } else {
                ykoVar.close();
            }
        }
    }

    public int r() {
        n8n n8nVar = (n8n) this.e;
        String str = (String) this.d;
        if (n8nVar == null) {
            return str.length();
        }
        return (n8nVar.b - n8nVar.g()) + (str.length() - (this.c - this.b));
    }

    public boolean s(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!r3b.d()) {
                    return false;
                }
                r3b a = r3b.a();
                if (a.c() != 1 || a.b(i3, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean t(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return wxf.B(Character.codePointBefore((CharSequence) this.d, i));
    }

    public String toString() {
        switch (this.a) {
            case 3:
                n8n n8nVar = (n8n) this.e;
                String str = (String) this.d;
                if (n8nVar == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append((char[]) n8nVar.e, 0, n8nVar.c);
                char[] cArr = (char[]) n8nVar.e;
                int i = n8nVar.d;
                sb.append(cArr, i, n8nVar.b - i);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public boolean u(int i) {
        j(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (w(i) && w(i - 1) && w(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.d).length() - 1 || !(v(i) || v(i + 1));
    }

    public boolean v(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (Intrinsics.d(of, unicodeBlock) && Intrinsics.d(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return Intrinsics.d(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && Intrinsics.d(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean w(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!r3b.d()) {
                return false;
            }
            r3b a = r3b.a();
            if (a.c() != 1 || a.b(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean x(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return wxf.B(Character.codePointAt((CharSequence) this.d, i));
    }

    public int z(int i) {
        j(i);
        int following = ((BreakIterator) this.e).following(i);
        return (w(following + (-1)) && w(following) && !v(following)) ? z(following) : following;
    }

    public ah3(int i, int i2) {
        this.a = 2;
        this.b = i;
        this.c = i2;
        this.d = new g3a(24, this);
        this.e = new b6e();
    }

    public /* synthetic */ ah3(int i, byte b) {
        this.a = i;
    }

    public ah3(int i, int i2, float[] fArr, float[] fArr2) {
        this.a = 4;
        this.b = i;
        vq1.v(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.d = fArr;
        this.e = fArr2;
        this.c = i2;
    }

    public ah3(ah3 ah3Var) {
        this.a = 5;
        float[] fArr = (float[]) ah3Var.d;
        this.b = fArr.length / 3;
        this.d = tt0.z(fArr);
        this.e = tt0.z((float[]) ah3Var.e);
        int i = ah3Var.c;
        if (i == 1) {
            this.c = 5;
        } else if (i != 2) {
            this.c = 4;
        } else {
            this.c = 6;
        }
    }

    public ah3(a7b a7bVar, lum lumVar) {
        this.a = 1;
        this.d = new SparseArray();
        this.e = a7bVar;
        TypedArray typedArray = (TypedArray) lumVar.b;
        this.b = typedArray.getResourceId(29, 0);
        this.c = typedArray.getResourceId(54, 0);
    }

    public ah3(String str) {
        this.a = 7;
        this.b = 0;
        this.c = 0;
        this.e = new jsg(1);
        String trim = str.trim();
        this.d = trim;
        this.c = trim.length();
    }

    public ah3(int i) {
        this.a = 0;
        this.d = new lvs[i];
        this.c = 0;
    }
}
