package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Be implements InterfaceC0524k2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4210a = 10;

    /* renamed from: b, reason: collision with root package name */
    public final int f4211b = 13;

    /* renamed from: c, reason: collision with root package name */
    public final z1.f f4212c = new z1.f("^[0-9()\\-+\\s]+$");

    @Override // io.appmetrica.analytics.impl.InterfaceC0524k2
    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        int length2 = sb2.length();
        Character U2 = z1.g.U(str);
        Character U3 = z1.g.U(sb2);
        if (length2 >= this.f4210a && length2 <= this.f4211b && (U3 == null || U3.charValue() != '0')) {
            z1.f fVar = this.f4212c;
            fVar.getClass();
            if (fVar.f8637a.matcher(str).matches()) {
                if (length2 == 10 && (U2 == null || U2.charValue() != '+')) {
                    return "7".concat(sb2);
                }
                if (length2 == 11) {
                    if (U2 != null && U2.charValue() == '+' && U3 != null && U3.charValue() == '8') {
                        return null;
                    }
                    if (U3 != null && U3.charValue() == '8') {
                        return "7" + sb2.substring(1);
                    }
                }
                if (length2 < 12 || U2 == null || U2.charValue() != '+' || U3 == null || U3.charValue() != '7') {
                    return sb2;
                }
                return null;
            }
        }
        return null;
    }
}
