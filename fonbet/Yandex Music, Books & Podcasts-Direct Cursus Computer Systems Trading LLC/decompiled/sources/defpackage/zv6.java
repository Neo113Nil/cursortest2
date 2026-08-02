package defpackage;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class zv6 extends xr2 {
    public final r49 e;
    public final char f;
    public final List g;
    public NumberFormat h;

    public zv6(Locale locale, r49 r49Var) {
        super(new vr2("", c5b.a, false));
        this.e = r49Var;
        this.f = (char) 164;
        this.g = u75.h('.', ',');
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        o(currencyInstance);
        this.h = currencyInstance;
    }

    public static boolean q(eas easVar, int i) {
        int i2 = easVar.a;
        return i2 <= i && i < i2 + easVar.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018a  */
    @Override // defpackage.xr2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, Integer num) {
        int i;
        boolean z;
        int i2;
        int length;
        int length2;
        int i3;
        int i4;
        Number parse;
        int abs;
        int length3;
        int i5;
        String str2 = str;
        String i6 = i();
        String replace = str2.replace(' ', (char) 160);
        replace.getClass();
        eas w = hyf.w(i6, replace);
        int i7 = w.a;
        char decimalSeparator = p().getDecimalSeparator();
        String i8 = i();
        int i9 = -1;
        int length4 = i8.length() - 1;
        if (length4 >= 0) {
            while (true) {
                int i10 = length4 - 1;
                if (i8.charAt(length4) == decimalSeparator) {
                    break;
                } else if (i10 < 0) {
                    break;
                } else {
                    length4 = i10;
                }
            }
        }
        length4 = -1;
        int length5 = str2.length() - 1;
        if (length5 >= 0) {
            while (true) {
                int i11 = length5 - 1;
                if (str2.charAt(length5) == decimalSeparator) {
                    break;
                } else if (i11 < 0) {
                    break;
                } else {
                    length5 = i11;
                }
            }
        }
        length5 = -1;
        boolean z2 = length4 != length5 || (length4 == -1 && length5 == -1);
        char decimalSeparator2 = p().getDecimalSeparator();
        int i12 = 0;
        while (true) {
            if (i12 >= str2.length()) {
                i12 = -1;
                break;
            } else if (str2.charAt(i12) == decimalSeparator2 && !q(w, i12)) {
                break;
            } else {
                i12++;
            }
        }
        if (w.b == 1 && w.c == 0) {
            if (this.g.contains(Character.valueOf(str2.charAt(i7)))) {
                i = i7;
                int maximumFractionDigits = this.h.getMaximumFractionDigits();
                if (i12 == -1) {
                    i2 = maximumFractionDigits;
                    for (int i13 = i12; i13 < str2.length(); i13++) {
                        if (Character.isDigit(str2.charAt(i13)) && !q(w, i13)) {
                            i2--;
                        }
                    }
                    z = true;
                } else {
                    z = true;
                    i2 = maximumFractionDigits;
                    int i14 = 0;
                    int i15 = 0;
                    boolean z3 = false;
                    while (i14 < str2.length()) {
                        char charAt = str2.charAt(i14);
                        int i16 = i15 + 1;
                        boolean q = q(w, i15);
                        if (charAt == decimalSeparator2) {
                            z3 = true;
                        } else if (!q && z3 && Character.isDigit(charAt)) {
                            i2--;
                        }
                        i14++;
                        i15 = i16;
                    }
                }
                boolean z4 = (StringsKt.N(str2, decimalSeparator2) && i == -1) ? false : z;
                StringBuilder sb = new StringBuilder();
                length = str2.length() - 1;
                boolean z5 = false;
                while (length >= 0) {
                    char charAt2 = str2.charAt(length);
                    boolean z6 = sb.length() <= maximumFractionDigits ? z : false;
                    if (Character.isDigit(charAt2)) {
                        if (!q(w, length) || z5 || !z4) {
                            sb.append(charAt2);
                        } else if (i2 > 0) {
                            sb.append(charAt2);
                            i2--;
                        }
                        i5 = -1;
                    } else {
                        i5 = -1;
                        if (z6 && i12 == -1 && length == i) {
                            sb.append(decimalSeparator2);
                        } else if (z6 && charAt2 == decimalSeparator2 && (i12 == length || i12 == -1)) {
                            sb.append(decimalSeparator2);
                            i12 = length;
                        }
                        z5 = z;
                    }
                    length--;
                    i9 = i5;
                    str2 = str;
                }
                int i17 = i9;
                String obj = new StringBuilder((CharSequence) sb.toString()).reverse().toString();
                length2 = obj.length();
                i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        i4 = i17;
                        break;
                    } else {
                        if (obj.charAt(i3) != p().getZeroDigit()) {
                            i4 = i3;
                            break;
                        }
                        i3++;
                    }
                }
                if (i4 > 0) {
                    obj = obj.charAt(i4) == p().getDecimalSeparator() ? mlr.E(i4 - 1, obj) : mlr.E(i4, obj);
                }
                parse = this.h.parse(StringsKt.i0(obj, decimalSeparator) ? StringsKt.U(obj) ? String.valueOf(p().getZeroDigit()) : obj : p().getZeroDigit() + obj);
                if (parse == null) {
                    parse = 0;
                }
                c(w);
                if (z2) {
                    r(parse);
                }
                m(0, null, obj);
                abs = (i().length() > i7 || i().charAt(i7) != p().getGroupingSeparator()) ? Math.abs(i().length() - (str.length() - (num == null ? num.intValue() : this.d))) : num != null ? num.intValue() : this.d;
                length3 = i().length();
                if (abs > length3) {
                    abs = length3;
                }
                this.d = abs;
            }
        }
        i = -1;
        int maximumFractionDigits2 = this.h.getMaximumFractionDigits();
        if (i12 == -1) {
        }
        if (StringsKt.N(str2, decimalSeparator2)) {
        }
        StringBuilder sb2 = new StringBuilder();
        length = str2.length() - 1;
        boolean z52 = false;
        while (length >= 0) {
        }
        int i172 = i9;
        String obj2 = new StringBuilder((CharSequence) sb2.toString()).reverse().toString();
        length2 = obj2.length();
        i3 = 0;
        while (true) {
            if (i3 < length2) {
            }
            i3++;
        }
        if (i4 > 0) {
        }
        if (StringsKt.i0(obj2, decimalSeparator)) {
        }
        parse = this.h.parse(StringsKt.i0(obj2, decimalSeparator) ? StringsKt.U(obj2) ? String.valueOf(p().getZeroDigit()) : obj2 : p().getZeroDigit() + obj2);
        if (parse == null) {
        }
        c(w);
        if (z2) {
        }
        m(0, null, obj2);
        if (i().length() > i7) {
        }
        length3 = i().length();
        if (abs > length3) {
        }
        this.d = abs;
    }

    @Override // defpackage.xr2
    public final void j(PatternSyntaxException patternSyntaxException) {
        this.e.invoke(patternSyntaxException);
    }

    @Override // defpackage.xr2
    public final void k(String str) {
        Number parse = this.h.parse(str);
        if (parse == null) {
            parse = 0;
        }
        r(parse);
        super.k(str);
    }

    public final void o(NumberFormat numberFormat) {
        DecimalFormat decimalFormat = numberFormat instanceof DecimalFormat ? (DecimalFormat) numberFormat : null;
        if (decimalFormat != null) {
            String pattern = decimalFormat.toPattern();
            StringBuilder sb = new StringBuilder();
            int length = pattern.length();
            for (int i = 0; i < length; i++) {
                char charAt = pattern.charAt(i);
                if (charAt != this.f) {
                    sb.append(charAt);
                }
            }
            decimalFormat.applyPattern(StringsKt.t0(sb.toString()).toString());
        }
    }

    public final DecimalFormatSymbols p() {
        NumberFormat numberFormat = this.h;
        numberFormat.getClass();
        return ((DecimalFormat) numberFormat).getDecimalFormatSymbols();
    }

    public final void r(Number number) {
        String format = this.h.format(number);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < format.length(); i++) {
            char charAt = format.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append('#');
            } else {
                sb.append(charAt);
            }
        }
        n(new vr2(sb.toString(), u75.h(new wr2('#', '0', "\\d"), new wr2(p().getDecimalSeparator(), p().getDecimalSeparator(), "[" + p().getDecimalSeparator() + ']')), this.a.c), false);
    }
}
