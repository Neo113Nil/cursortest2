package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class rw0 {
    public java.lang.CharSequence JhCgjQRTAOCT;
    public java.lang.Object WDYagTQQm9ns;
    public final /* synthetic */ int ZpBGe2uQfcn8 = 0;
    public int fWTAfUmVKrZq;
    public int giKS3J6vZuNy;

    public rw0(java.lang.CharSequence charSequence, int i, java.util.Locale locale) {
        this.JhCgjQRTAOCT = charSequence;
        if (charSequence.length() < 0) {
            defpackage.f80.ZpBGe2uQfcn8("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            defpackage.f80.ZpBGe2uQfcn8("input end index is outside the CharSequence");
        }
        java.text.BreakIterator wordInstance = java.text.BreakIterator.getWordInstance(locale);
        this.WDYagTQQm9ns = wordInstance;
        this.giKS3J6vZuNy = java.lang.Math.max(0, -50);
        this.fWTAfUmVKrZq = java.lang.Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new defpackage.de(charSequence, i));
    }

    public int GE9mJIPrb8gP(int i) {
        ZpBGe2uQfcn8(i);
        int preceding = ((java.text.BreakIterator) this.WDYagTQQm9ns).preceding(i);
        return (QiMR8OkAhezm(preceding) && fWTAfUmVKrZq(preceding) && !oh71FJcDz6S2(preceding)) ? GE9mJIPrb8gP(preceding) : preceding;
    }

    public boolean JhCgjQRTAOCT(int i) {
        int i2 = this.giKS3J6vZuNy + 1;
        if (i > this.fWTAfUmVKrZq || i2 > i) {
            return false;
        }
        return defpackage.j80.UmgHb6n58gfG(java.lang.Character.codePointBefore(this.JhCgjQRTAOCT, i));
    }

    public void Ns0WNyEWdPsk(int i, int i2, java.lang.String str) {
        if (i > i2) {
            defpackage.f80.ZpBGe2uQfcn8("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            defpackage.f80.ZpBGe2uQfcn8("start must be non-negative, but was " + i);
        }
        defpackage.z20 z20Var = (defpackage.z20) this.WDYagTQQm9ns;
        if (z20Var == null) {
            int max = java.lang.Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = java.lang.Math.min(i, 64);
            int min2 = java.lang.Math.min(((java.lang.String) this.JhCgjQRTAOCT).length() - i2, 64);
            java.lang.String str2 = (java.lang.String) this.JhCgjQRTAOCT;
            int i3 = i - min;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            java.lang.String str3 = (java.lang.String) this.JhCgjQRTAOCT;
            int i4 = max - min2;
            int i5 = min2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            defpackage.z20 z20Var2 = new defpackage.z20();
            z20Var2.giKS3J6vZuNy = max;
            z20Var2.WDYagTQQm9ns = cArr;
            z20Var2.fWTAfUmVKrZq = length;
            z20Var2.JhCgjQRTAOCT = i4;
            this.WDYagTQQm9ns = z20Var2;
            this.giKS3J6vZuNy = i3;
            this.fWTAfUmVKrZq = i5;
            return;
        }
        int i6 = this.giKS3J6vZuNy;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > z20Var.giKS3J6vZuNy - z20Var.giKS3J6vZuNy()) {
            this.JhCgjQRTAOCT = toString();
            this.WDYagTQQm9ns = null;
            this.giKS3J6vZuNy = -1;
            this.fWTAfUmVKrZq = -1;
            Ns0WNyEWdPsk(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > z20Var.giKS3J6vZuNy()) {
            int giKS3J6vZuNy = length2 - z20Var.giKS3J6vZuNy();
            int i9 = z20Var.giKS3J6vZuNy;
            do {
                i9 *= 2;
            } while (i9 - z20Var.giKS3J6vZuNy < giKS3J6vZuNy);
            char[] cArr2 = new char[i9];
            java.lang.System.arraycopy((char[]) z20Var.WDYagTQQm9ns, 0, cArr2, 0, z20Var.fWTAfUmVKrZq);
            int i10 = z20Var.giKS3J6vZuNy;
            int i11 = z20Var.JhCgjQRTAOCT;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            java.lang.System.arraycopy((char[]) z20Var.WDYagTQQm9ns, i11, cArr2, i13, (i12 + i11) - i11);
            z20Var.WDYagTQQm9ns = cArr2;
            z20Var.giKS3J6vZuNy = i9;
            z20Var.JhCgjQRTAOCT = i13;
        }
        int i14 = z20Var.fWTAfUmVKrZq;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) z20Var.WDYagTQQm9ns;
            java.lang.System.arraycopy(cArr3, i8, cArr3, z20Var.JhCgjQRTAOCT - i15, i15);
            z20Var.fWTAfUmVKrZq = i7;
            z20Var.JhCgjQRTAOCT -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int giKS3J6vZuNy2 = z20Var.giKS3J6vZuNy() + i7;
            int giKS3J6vZuNy3 = z20Var.giKS3J6vZuNy() + i8;
            int i16 = z20Var.JhCgjQRTAOCT;
            int i17 = giKS3J6vZuNy2 - i16;
            char[] cArr4 = (char[]) z20Var.WDYagTQQm9ns;
            java.lang.System.arraycopy(cArr4, i16, cArr4, z20Var.fWTAfUmVKrZq, i17);
            z20Var.fWTAfUmVKrZq += i17;
            z20Var.JhCgjQRTAOCT = giKS3J6vZuNy3;
        } else {
            z20Var.JhCgjQRTAOCT = z20Var.giKS3J6vZuNy() + i8;
            z20Var.fWTAfUmVKrZq = i7;
        }
        str.getChars(0, str.length(), (char[]) z20Var.WDYagTQQm9ns, z20Var.fWTAfUmVKrZq);
        z20Var.fWTAfUmVKrZq = str.length() + z20Var.fWTAfUmVKrZq;
    }

    public boolean P05cfTpS5W5L(int i) {
        int i2 = this.giKS3J6vZuNy;
        if (i >= this.fWTAfUmVKrZq || i2 > i) {
            return false;
        }
        return defpackage.j80.UmgHb6n58gfG(java.lang.Character.codePointAt(this.JhCgjQRTAOCT, i));
    }

    public boolean QiMR8OkAhezm(int i) {
        java.lang.CharSequence charSequence = this.JhCgjQRTAOCT;
        int i2 = this.giKS3J6vZuNy;
        if (i >= this.fWTAfUmVKrZq || i2 > i) {
            return false;
        }
        if (!java.lang.Character.isLetterOrDigit(java.lang.Character.codePointAt(charSequence, i)) && !java.lang.Character.isSurrogate(charSequence.charAt(i))) {
            if (!defpackage.ju.JhCgjQRTAOCT()) {
                return false;
            }
            defpackage.ju ZpBGe2uQfcn8 = defpackage.ju.ZpBGe2uQfcn8();
            if (ZpBGe2uQfcn8.fWTAfUmVKrZq() != 1 || ZpBGe2uQfcn8.giKS3J6vZuNy(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean WDYagTQQm9ns(int i) {
        ZpBGe2uQfcn8(i);
        if (!((java.text.BreakIterator) this.WDYagTQQm9ns).isBoundary(i)) {
            return false;
        }
        if (QiMR8OkAhezm(i) && QiMR8OkAhezm(i - 1) && QiMR8OkAhezm(i + 1)) {
            return false;
        }
        return i <= 0 || i >= this.JhCgjQRTAOCT.length() - 1 || !(oh71FJcDz6S2(i) || oh71FJcDz6S2(i + 1));
    }

    public void ZpBGe2uQfcn8(int i) {
        int i2 = this.giKS3J6vZuNy;
        int i3 = this.fWTAfUmVKrZq;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        defpackage.f80.ZpBGe2uQfcn8("Invalid offset: " + i + ". Valid range is [" + i2 + " , " + i3 + ']');
    }

    public int e6mdH7fiFuta(int i) {
        ZpBGe2uQfcn8(i);
        int following = ((java.text.BreakIterator) this.WDYagTQQm9ns).following(i);
        return (QiMR8OkAhezm(following + (-1)) && QiMR8OkAhezm(following) && !oh71FJcDz6S2(following)) ? e6mdH7fiFuta(following) : following;
    }

    public boolean fWTAfUmVKrZq(int i) {
        java.lang.CharSequence charSequence = this.JhCgjQRTAOCT;
        int i2 = this.giKS3J6vZuNy + 1;
        if (i > this.fWTAfUmVKrZq || i2 > i) {
            return false;
        }
        if (!java.lang.Character.isLetterOrDigit(java.lang.Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!java.lang.Character.isSurrogate(charSequence.charAt(i3))) {
                if (!defpackage.ju.JhCgjQRTAOCT()) {
                    return false;
                }
                defpackage.ju ZpBGe2uQfcn8 = defpackage.ju.ZpBGe2uQfcn8();
                if (ZpBGe2uQfcn8.fWTAfUmVKrZq() != 1 || ZpBGe2uQfcn8.giKS3J6vZuNy(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public int giKS3J6vZuNy() {
        defpackage.z20 z20Var = (defpackage.z20) this.WDYagTQQm9ns;
        java.lang.String str = (java.lang.String) this.JhCgjQRTAOCT;
        if (z20Var == null) {
            return str.length();
        }
        return (z20Var.giKS3J6vZuNy - z20Var.giKS3J6vZuNy()) + (str.length() - (this.fWTAfUmVKrZq - this.giKS3J6vZuNy));
    }

    public boolean oh71FJcDz6S2(int i) {
        java.lang.CharSequence charSequence = this.JhCgjQRTAOCT;
        int i2 = i - 1;
        java.lang.Character.UnicodeBlock of = java.lang.Character.UnicodeBlock.of(charSequence.charAt(i2));
        java.lang.Character.UnicodeBlock unicodeBlock = java.lang.Character.UnicodeBlock.HIRAGANA;
        if (defpackage.ma0.QiMR8OkAhezm(of, unicodeBlock) && defpackage.ma0.QiMR8OkAhezm(java.lang.Character.UnicodeBlock.of(charSequence.charAt(i)), java.lang.Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return defpackage.ma0.QiMR8OkAhezm(java.lang.Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && defpackage.ma0.QiMR8OkAhezm(java.lang.Character.UnicodeBlock.of(charSequence.charAt(i2)), java.lang.Character.UnicodeBlock.KATAKANA);
    }

    public java.lang.String toString() {
        switch (this.ZpBGe2uQfcn8) {
            case 0:
                defpackage.z20 z20Var = (defpackage.z20) this.WDYagTQQm9ns;
                java.lang.String str = (java.lang.String) this.JhCgjQRTAOCT;
                if (z20Var == null) {
                    return str;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append((java.lang.CharSequence) str, 0, this.giKS3J6vZuNy);
                sb.append((char[]) z20Var.WDYagTQQm9ns, 0, z20Var.fWTAfUmVKrZq);
                char[] cArr = (char[]) z20Var.WDYagTQQm9ns;
                int i = z20Var.JhCgjQRTAOCT;
                sb.append(cArr, i, z20Var.giKS3J6vZuNy - i);
                java.lang.String str2 = (java.lang.String) this.JhCgjQRTAOCT;
                sb.append((java.lang.CharSequence) str2, this.fWTAfUmVKrZq, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ rw0() {
    }
}
