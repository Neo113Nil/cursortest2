package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;
import java.lang.Character;
import java.nio.ByteBuffer;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;

/* loaded from: classes10.dex */
public final class yi6 implements iv60, mml0, au5, kk71 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object w;
    public Object x;

    public yi6(CharSequence charSequence, int i, Locale locale) {
        this.a = 9;
        this.w = charSequence;
        if (charSequence.length() < 0) {
            jxv.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            jxv.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.x = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new ej9(i, charSequence));
    }

    @Override // defpackage.mml0
    public void R(float f, float f2) {
        b((byte) 0);
        f(2);
        float[] fArr = (float[]) this.x;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        this.c = i + 2;
        fArr[i2] = f2;
    }

    @Override // defpackage.mml0
    public void S(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        b((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
        f(5);
        float[] fArr = (float[]) this.x;
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

    @Override // defpackage.mml0
    public void T(float f, float f2) {
        b((byte) 1);
        f(2);
        float[] fArr = (float[]) this.x;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        fArr[i] = f;
        this.c = i + 2;
        fArr[i2] = f2;
    }

    @Override // defpackage.mml0
    public void U(float f, float f2, float f3, float f4) {
        b((byte) 3);
        f(4);
        float[] fArr = (float[]) this.x;
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

    @Override // defpackage.mml0
    public void V(float f, float f2, float f3, float f4, float f5, float f6) {
        b((byte) 2);
        f(6);
        float[] fArr = (float[]) this.x;
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

    @Override // defpackage.au5
    public zt5 a(c5p c5pVar, long j) {
        long j2;
        long position = c5pVar.getPosition();
        int min = (int) Math.min(this.c, c5pVar.getLength() - position);
        ef90 ef90Var = (ef90) this.x;
        ef90Var.H(min);
        c5pVar.g(0, min, ef90Var.a);
        int i = ef90Var.c;
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (true) {
            if (ef90Var.a() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArr = ef90Var.a;
            int i2 = ef90Var.b;
            while (true) {
                if (i2 >= i) {
                    j2 = -9223372036854775807L;
                    break;
                }
                j2 = -9223372036854775807L;
                if (bArr[i2] == 71) {
                    break;
                }
                i2++;
            }
            int i3 = i2 + 188;
            if (i3 > i) {
                break;
            }
            long c = tub1.c(ef90Var, i2, this.b);
            if (c != j2) {
                long b = ((sez0) this.w).b(c);
                if (b > j) {
                    return j5 == j2 ? new zt5(-1, b, position) : new zt5(0, -9223372036854775807L, position + j4);
                }
                j5 = b;
                if (100000 + j5 > j) {
                    return new zt5(0, -9223372036854775807L, position + i2);
                }
                j4 = i2;
            }
            ef90Var.K(i3);
            j3 = i3;
        }
        return j5 != j2 ? new zt5(-2, j5, position + j3) : zt5.d;
    }

    public void b(byte b) {
        int i = this.b;
        byte[] bArr = (byte[]) this.w;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.w = bArr2;
        }
        byte[] bArr3 = (byte[]) this.w;
        int i2 = this.b;
        this.b = i2 + 1;
        bArr3[i2] = b;
    }

    public IntentSenderRequest c() {
        return new IntentSenderRequest((IntentSender) this.w, (Intent) this.x, this.b, this.c);
    }

    @Override // defpackage.mml0
    public void close() {
        b((byte) 8);
    }

    @Override // defpackage.kk71
    public zt5 d(w971 w971Var, long j) {
        long j2;
        long j3 = w971Var.w;
        int min = (int) Math.min(this.c, w971Var.c - j3);
        dl81 dl81Var = (dl81) this.x;
        dl81Var.i(min);
        w971Var.I(dl81Var.a, 0, min, false);
        int i = dl81Var.c;
        long j4 = -1;
        long j5 = -1;
        long j6 = -9223372036854775807L;
        while (true) {
            int i2 = dl81Var.c;
            int i3 = dl81Var.b;
            if (i2 - i3 < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArr = dl81Var.a;
            while (true) {
                if (i3 >= i) {
                    j2 = -9223372036854775807L;
                    break;
                }
                j2 = -9223372036854775807L;
                if (bArr[i3] == 71) {
                    break;
                }
                i3++;
            }
            int i4 = i3 + 188;
            if (i4 > i) {
                break;
            }
            long a = lia1.a(dl81Var, i3, this.b);
            if (a != j2) {
                long c = ((lo61) this.w).c(a);
                if (c > j) {
                    return j6 == j2 ? new zt5(-1, c, j3) : new zt5(0, -9223372036854775807L, j3 + j5);
                }
                j6 = c;
                if (100000 + j6 > j) {
                    return new zt5(0, -9223372036854775807L, j3 + i3);
                }
                j5 = i3;
            }
            dl81Var.m(i4);
            j4 = i4;
        }
        return j6 != j2 ? new zt5(-2, j6, j3 + j4) : zt5.e;
    }

    public void e(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder s = b64.s(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        s.append(i3);
        s.append(']');
        jxv.a(s.toString());
    }

    public void f(int i) {
        float[] fArr = (float[]) this.x;
        if (fArr.length < this.c + i) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.x = fArr2;
        }
    }

    public void g(mml0 mml0Var) {
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            byte b = ((byte[]) this.w)[i2];
            if (b == 0) {
                float[] fArr = (float[]) this.x;
                int i3 = i + 1;
                float f = fArr[i];
                i += 2;
                mml0Var.R(f, fArr[i3]);
            } else if (b == 1) {
                float[] fArr2 = (float[]) this.x;
                int i4 = i + 1;
                float f2 = fArr2[i];
                i += 2;
                mml0Var.T(f2, fArr2[i4]);
            } else if (b == 2) {
                float[] fArr3 = (float[]) this.x;
                mml0Var.V(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                i += 6;
            } else if (b == 3) {
                float[] fArr4 = (float[]) this.x;
                float f3 = fArr4[i];
                float f4 = fArr4[i + 1];
                int i5 = i + 3;
                float f5 = fArr4[i + 2];
                i += 4;
                mml0Var.U(f3, f4, f5, fArr4[i5]);
            } else if (b != 8) {
                boolean z = (b & 2) != 0;
                boolean z2 = (b & 1) != 0;
                float[] fArr5 = (float[]) this.x;
                mml0Var.S(fArr5[i], fArr5[i + 1], fArr5[i + 2], fArr5[i + 3], fArr5[i + 4], z, z2);
                i += 5;
            } else {
                mml0Var.close();
            }
        }
    }

    public int h() {
        qv4 qv4Var = (qv4) this.x;
        String str = (String) this.w;
        if (qv4Var == null) {
            return str.length();
        }
        return (qv4Var.b - qv4Var.a()) + (str.length() - (this.c - this.b));
    }

    public boolean i(int i) {
        CharSequence charSequence = (CharSequence) this.w;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!ftn.e()) {
                    return false;
                }
                ftn a = ftn.a();
                if (a.c() != 1 || a.b(i3, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.iv60
    public int j(int i) {
        int i2 = this.b;
        if (((String) this.w).length() == 0 || i < i2) {
            return 0;
        }
        String str = (String) this.x;
        String substring = str.substring(i2, str.length() - this.c);
        int i3 = i - i2;
        int length = substring.length();
        if (i3 > length) {
            i3 = length;
        }
        String A0 = gvu0.A0(i3, substring);
        int i4 = 0;
        for (int i5 = 0; i5 < A0.length(); i5++) {
            if (A0.charAt(i5) == ' ') {
                i4++;
            }
        }
        int i6 = i3 - i4;
        if (i6 < 0) {
            return 0;
        }
        return i6;
    }

    public boolean k(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return qn91.h(Character.codePointBefore((CharSequence) this.w, i));
    }

    public boolean l(int i) {
        e(i);
        if (!((BreakIterator) this.x).isBoundary(i)) {
            return false;
        }
        if (o(i) && o(i - 1) && o(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.w).length() - 1 || !(n(i) || n(i + 1));
    }

    @Override // defpackage.au5
    public void m() {
        ef90 ef90Var = (ef90) this.x;
        byte[] bArr = tw21.c;
        ef90Var.getClass();
        ef90Var.I(bArr.length, bArr);
    }

    public boolean n(int i) {
        CharSequence charSequence = (CharSequence) this.w;
        int i2 = i - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (jl40.l(of, unicodeBlock) && jl40.l(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return jl40.l(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && jl40.l(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean o(int i) {
        CharSequence charSequence = (CharSequence) this.w;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!ftn.e()) {
                return false;
            }
            ftn a = ftn.a();
            if (a.c() != 1 || a.b(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean p(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return qn91.h(Character.codePointAt((CharSequence) this.w, i));
    }

    public void q(int i, int i2, int i3, int i4) {
        int i5 = this.c;
        if (i < 0) {
            int i6 = this.b;
            i += i6;
            i2 += 4 - ((i6 + 4) % 8);
        }
        if (i2 < 0) {
            i2 += i5;
            i += 4 - ((i5 + 4) % 8);
        }
        ((byte[]) this.x)[(i * i5) + i2] = (byte) ((((String) this.w).charAt(i3) & (1 << (8 - i4))) == 0 ? 0 : 1);
    }

    @Override // defpackage.iv60
    public int r(int i) {
        int i2 = this.b;
        String str = (String) this.w;
        if (str.length() == 0) {
            return i2 + 1;
        }
        int i3 = 0;
        if (str.length() > 3) {
            if (i == str.length()) {
                i3 = (str.length() - 1) / 3;
            } else {
                Iterable m = y6i0.m(y6i0.i(str.length(), 4), 3);
                if (!(m instanceof Collection) || !((Collection) m).isEmpty()) {
                    c6w it = m.iterator();
                    while (it.c) {
                        if (i > it.nextInt() - 3 && (i3 = i3 + 1) < 0) {
                            scc.l();
                            throw null;
                        }
                    }
                }
            }
        }
        return i2 + i + i3;
    }

    public int s(int i) {
        e(i);
        int following = ((BreakIterator) this.x).following(i);
        return (o(following + (-1)) && o(following) && !n(following)) ? s(following) : following;
    }

    public int t(int i) {
        e(i);
        int preceding = ((BreakIterator) this.x).preceding(i);
        return (o(preceding) && i(preceding) && !n(preceding)) ? t(preceding) : preceding;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                qv4 qv4Var = (qv4) this.x;
                String str = (String) this.w;
                if (qv4Var == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append((char[]) qv4Var.x, 0, qv4Var.c);
                char[] cArr = (char[]) qv4Var.x;
                int i = qv4Var.w;
                sb.append(cArr, i, qv4Var.b - i);
                String str2 = (String) this.w;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(int i, int i2, String str) {
        if (i > i2) {
            jxv.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            jxv.a("start must be non-negative, but was " + i);
        }
        qv4 qv4Var = (qv4) this.x;
        if (qv4Var == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.w).length() - i2, 64);
            int i3 = i - min;
            ((String) this.w).getChars(i3, i, cArr, 0);
            int i4 = max - min2;
            int i5 = min2 + i2;
            ((String) this.w).getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            qv4 qv4Var2 = new qv4();
            qv4Var2.b = max;
            qv4Var2.x = cArr;
            qv4Var2.c = length;
            qv4Var2.w = i4;
            this.x = qv4Var2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > qv4Var.b - qv4Var.a()) {
            this.w = toString();
            this.x = null;
            this.b = -1;
            this.c = -1;
            u(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > qv4Var.a()) {
            int a = length2 - qv4Var.a();
            int i9 = qv4Var.b;
            do {
                i9 *= 2;
            } while (i9 - qv4Var.b < a);
            char[] cArr2 = new char[i9];
            System.arraycopy((char[]) qv4Var.x, 0, cArr2, 0, qv4Var.c);
            int i10 = qv4Var.b;
            int i11 = qv4Var.w;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy((char[]) qv4Var.x, i11, cArr2, i13, (i12 + i11) - i11);
            qv4Var.x = cArr2;
            qv4Var.b = i9;
            qv4Var.w = i13;
        }
        int i14 = qv4Var.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) qv4Var.x;
            System.arraycopy(cArr3, i8, cArr3, qv4Var.w - i15, i15);
            qv4Var.c = i7;
            qv4Var.w -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int a2 = qv4Var.a() + i7;
            int a3 = qv4Var.a() + i8;
            int i16 = qv4Var.w;
            int i17 = a2 - i16;
            char[] cArr4 = (char[]) qv4Var.x;
            System.arraycopy(cArr4, i16, cArr4, qv4Var.c, i17);
            qv4Var.c += i17;
            qv4Var.w = a3;
        } else {
            qv4Var.w = qv4Var.a() + i8;
            qv4Var.c = i7;
        }
        str.getChars(0, str.length(), (char[]) qv4Var.x, qv4Var.c);
        qv4Var.c = str.length() + qv4Var.c;
    }

    public void v(Intent intent) {
        this.x = intent;
    }

    public void w(int i, int i2) {
        this.c = i;
        this.b = i2;
    }

    public void x(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        q(i4, i5, i3, 1);
        int i6 = i2 - 1;
        q(i4, i6, i3, 2);
        int i7 = i - 1;
        q(i7, i5, i3, 3);
        q(i7, i6, i3, 4);
        q(i7, i2, i3, 5);
        q(i, i5, i3, 6);
        q(i, i6, i3, 7);
        q(i, i2, i3, 8);
    }

    public yi6(int i, lo61 lo61Var, int i2) {
        this.a = 11;
        this.b = i;
        this.w = lo61Var;
        this.c = i2;
        this.x = new dl81();
    }

    public yi6(String str, String str2, int i, int i2) {
        this.a = 1;
        this.w = str;
        this.x = str2;
        this.b = i;
        this.c = i2;
    }

    public yi6(Activity activity) {
        this.a = 7;
        this.w = activity;
        this.c = -1;
    }

    public /* synthetic */ yi6(byte b, int i) {
        this.a = i;
    }

    public yi6(String str, int i, int i2) {
        this.a = 2;
        this.w = str;
        this.c = i;
        this.b = i2;
        byte[] bArr = new byte[i * i2];
        this.x = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public yi6(IntentSender intentSender) {
        this.a = 3;
        this.w = intentSender;
    }

    public yi6(int i, sez0 sez0Var, int i2) {
        this.a = 8;
        this.b = i;
        this.w = sez0Var;
        this.c = i2;
        this.x = new ef90();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yi6(PendingIntent pendingIntent) {
        this(pendingIntent.getIntentSender());
        this.a = 3;
    }

    public yi6(String str, ByteBuffer byteBuffer, int i, int i2) {
        this.a = 5;
        this.b = i;
        this.w = str;
        this.c = i2;
        this.x = byteBuffer;
    }

    public yi6(int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 10:
                this.w = new ro71[i];
                this.c = 0;
                break;
            default:
                this.w = new vzz0[i];
                this.c = 0;
                break;
        }
    }

    @Override // defpackage.kk71, defpackage.e381, defpackage.jm71
    /* renamed from: a */
    public void mo24a() {
        ((dl81) this.x).e(rf71.f);
    }
}
