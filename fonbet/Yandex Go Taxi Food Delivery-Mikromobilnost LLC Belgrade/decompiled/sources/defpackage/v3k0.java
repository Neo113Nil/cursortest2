package defpackage;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes15.dex */
public class v3k0 implements noy0 {
    public final ArrayList a;
    public final LinkedList b;
    public final o3 c;
    public final o3 d;
    public final o3 e;
    public final o3 f;
    public int[] g;

    public v3k0() {
        this.a = new ArrayList();
        this.b = new LinkedList();
        this.c = new o3(new d7g0(11));
        this.d = new o3(new d7g0(12));
        this.e = new o3(new d7g0(13));
        this.f = new o3(new s3k0(this, 2));
    }

    public static boolean e(int i, int i2) {
        return (i & i2) == i2;
    }

    public final void a(String str) {
        int i = 0;
        o3 o3Var = new o3(new r3k0(i, this, str));
        boolean z = false;
        while (i < str.length()) {
            boolean e = e(this.g[i], 8);
            z ^= e;
            if (!z) {
                o3Var.A(str.charAt(i), i, e);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SpannableStringBuilder b(int i, CharSequence charSequence) {
        int i2;
        o3 o3Var;
        o3 o3Var2;
        o3 o3Var3;
        o3 o3Var4;
        int i3;
        int i4;
        int i5;
        boolean z;
        ArrayList arrayList;
        int[] iArr;
        int i6;
        ArrayList arrayList2 = this.a;
        arrayList2.clear();
        this.b.clear();
        this.g = new int[charSequence.length()];
        int i7 = 1;
        int length = charSequence.length() + 1;
        int[] iArr2 = new int[length];
        String charSequence2 = charSequence.toString();
        int i8 = 0;
        Character ch = null;
        Character ch2 = null;
        int i9 = 0;
        Integer num = null;
        while (true) {
            i2 = 8;
            if (i8 > charSequence2.length()) {
                break;
            }
            Character valueOf = i8 < charSequence2.length() ? Character.valueOf(charSequence2.charAt(i8)) : null;
            if (ch2 == null) {
                i6 = i7;
            } else {
                i6 = i7;
                int i10 = i8 - 1;
                if (ch2.charValue() != "```".charAt(i9)) {
                    if (i9 <= 0) {
                    }
                    i9 = 0;
                } else if (num != null) {
                    i9++;
                    if (i9 == 3) {
                        if (valueOf == null || !Character.isLetterOrDigit(valueOf.charValue())) {
                            int[] iArr3 = {num.intValue(), (i10 - 3) + 1};
                            d(iArr3[0], iArr3[i6], 3, 8);
                            i9 = 0;
                            num = null;
                        }
                        i9 = 0;
                    }
                } else if ((i9 != 0 || ch == null || !Character.isLetterOrDigit(ch.charValue())) && (i9 = i9 + 1) == 3) {
                    num = Integer.valueOf((i10 - 3) + 1);
                    i9 = 0;
                }
            }
            i8++;
            ch = ch2;
            ch2 = valueOf;
            i7 = i6;
        }
        int i11 = i7;
        a(charSequence2);
        msi0 msi0Var = new msi0("**", new s3k0(this, 0));
        msi0 msi0Var2 = new msi0("__", new s3k0(this, i11));
        arrayList2.add(msi0Var);
        arrayList2.add(msi0Var2);
        boolean z2 = false;
        boolean z3 = false;
        int i12 = 0;
        Character ch3 = null;
        Character ch4 = null;
        while (i12 <= charSequence2.length()) {
            Character valueOf2 = i12 < charSequence2.length() ? Character.valueOf(charSequence2.charAt(i12)) : null;
            if (ch4 == null) {
                arrayList = arrayList2;
                iArr = iArr2;
            } else {
                char charValue = ch4.charValue();
                int i13 = i12 - 1;
                int i14 = this.g[i13];
                boolean e = z2 ^ e(i14, i2);
                z3 ^= e(i14, 16) || e(i14, 32);
                if (!e && !z3 && !e(i14, 16)) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        msi0 msi0Var3 = (msi0) it.next();
                        ArrayList arrayList3 = arrayList2;
                        int i15 = msi0Var3.a;
                        boolean z4 = e;
                        int[] iArr4 = iArr2;
                        if (charValue == msi0Var3.b.charAt(msi0Var3.d)) {
                            Integer num2 = msi0Var3.e;
                            int i16 = msi0Var3.d;
                            if (num2 != null) {
                                int i17 = i16 + 1;
                                msi0Var3.d = i17;
                                if (i17 == i15) {
                                    if (valueOf2 == null || !Character.isLetterOrDigit(valueOf2.charValue())) {
                                        msi0Var3.d = 0;
                                        msi0Var3.c.a(new int[]{msi0Var3.e.intValue(), (i13 - i15) + 1});
                                        msi0Var3.e = null;
                                    } else {
                                        msi0Var3.d = 0;
                                    }
                                }
                            } else if (i16 != 0 || ch3 == null || !Character.isLetterOrDigit(ch3.charValue())) {
                                int i18 = msi0Var3.d + 1;
                                msi0Var3.d = i18;
                                if (i18 == i15) {
                                    msi0Var3.e = Integer.valueOf((i13 - i15) + 1);
                                    msi0Var3.d = 0;
                                }
                            }
                        } else if (msi0Var3.d > 0) {
                            msi0Var3.d = 0;
                        }
                        e = z4;
                        arrayList2 = arrayList3;
                        iArr2 = iArr4;
                    }
                }
                arrayList = arrayList2;
                iArr = iArr2;
                z2 = e;
            }
            i12++;
            ch3 = ch4;
            ch4 = valueOf2;
            arrayList2 = arrayList;
            iArr2 = iArr;
            i2 = 8;
        }
        int[] iArr5 = iArr2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        char[] charArray = charSequence2.toCharArray();
        int length2 = charArray.length;
        int i19 = 0;
        boolean z5 = false;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            o3Var = this.d;
            o3Var2 = this.c;
            o3Var3 = this.e;
            o3Var4 = this.f;
            if (i21 >= length2) {
                break;
            }
            char c = charArray[i21];
            char[] cArr = charArray;
            int i22 = this.g[i19];
            int i23 = length2;
            if (e(i22, 32)) {
                z5 = !z5;
            }
            if (e(i22, 1) || z5) {
                i20++;
                i5 = 0;
            } else {
                spannableStringBuilder.append(c);
                i5 = 1;
            }
            int i24 = i19 + 1;
            iArr5[i19] = i20;
            if (i == 0) {
                z = z5;
            } else {
                if (e(i22, 16)) {
                    Object F = o3Var4.F(spannableStringBuilder, i5);
                    if (i == 1 && (F instanceof URLSpan)) {
                        spannableStringBuilder.removeSpan(F);
                        z = z5;
                        spannableStringBuilder.append(HexString.CHAR_SPACE).append((CharSequence) ((URLSpan) F).getURL());
                        if (i != 1) {
                            if (e(i22, 8)) {
                                o3Var3.F(spannableStringBuilder, i5);
                            }
                            if (e(i22, 2)) {
                                o3Var2.F(spannableStringBuilder, i5);
                            }
                            if (e(i22, 4)) {
                                o3Var.F(spannableStringBuilder, i5);
                            }
                            i21++;
                            i19 = i24;
                            z5 = z;
                            charArray = cArr;
                            length2 = i23;
                        }
                    }
                }
                z = z5;
                if (i != 1) {
                }
            }
            i21++;
            i19 = i24;
            z5 = z;
            charArray = cArr;
            length2 = i23;
        }
        while (i19 < length) {
            iArr5[i19] = i20;
            i19++;
        }
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            for (Object obj : spannable.getSpans(0, charSequence.length(), Object.class)) {
                int spanStart = spannable.getSpanStart(obj);
                int spanEnd = spannable.getSpanEnd(obj);
                while (true) {
                    int[] iArr6 = this.g;
                    if (spanStart >= iArr6.length) {
                        i3 = 1;
                        break;
                    }
                    i3 = 1;
                    if (!e(iArr6[spanStart], 1)) {
                        break;
                    }
                    spanStart++;
                }
                int i25 = spanEnd - i3;
                while (i25 >= 0 && e(this.g[i25], i3)) {
                    i25--;
                    i3 = 1;
                }
                int i26 = i25 + 1;
                if (spanStart < i26) {
                    int[] iArr7 = this.g;
                    if (i26 < iArr7.length && e(iArr7[i26], 1)) {
                        i4 = iArr5[i25];
                        spannableStringBuilder.setSpan(obj, spanStart - iArr5[spanStart], i26 - i4, 33);
                    }
                    i4 = iArr5[i26];
                    spannableStringBuilder.setSpan(obj, spanStart - iArr5[spanStart], i26 - i4, 33);
                }
            }
        }
        z83.f(o3Var3.c, null);
        z83.f(o3Var4.c, null);
        z83.f(o3Var2.c, null);
        z83.f(o3Var.c, null);
        return spannableStringBuilder;
    }

    public final void c(int i, int i2, int i3, boolean z) {
        int i4;
        int[] iArr;
        int i5 = i;
        while (true) {
            i4 = i + i2;
            iArr = this.g;
            if (i5 >= i4) {
                break;
            }
            iArr[i5] = iArr[i5] | 1;
            i5++;
        }
        if (z) {
            iArr[i4] = iArr[i4] | i3;
        } else {
            iArr[i] = iArr[i] | i3;
        }
    }

    public final void d(int i, int i2, int i3, int i4) {
        if (i + i3 == i2) {
            return;
        }
        c(i, i3, i4, true);
        c(i2, i3, i4, false);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            msi0 msi0Var = (msi0) it.next();
            Integer num = msi0Var.e;
            if (num != null && num.intValue() > i && msi0Var.e.intValue() < i2) {
                msi0Var.e = null;
                msi0Var.d = 0;
            }
        }
    }

    public v3k0(llt0 llt0Var) {
        this.a = new ArrayList();
        this.b = new LinkedList();
        this.c = new o3(new d7g0(11));
        this.d = new o3(new d7g0(12));
        this.e = new o3(new d7g0(13));
        this.f = new o3((t3k0) new r3k0(1, this, llt0Var));
    }
}
