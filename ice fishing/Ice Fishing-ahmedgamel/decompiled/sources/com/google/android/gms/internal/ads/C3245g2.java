package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import w.AbstractC5128c;

/* renamed from: com.google.android.gms.internal.ads.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3245g2 extends AbstractC2923a2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f31257b;

    /* renamed from: c, reason: collision with root package name */
    public final RB f31258c;

    public C3245g2(String str, String str2, C3523lC c3523lC) {
        super(str);
        AbstractC2792Sd.i(!c3523lC.isEmpty());
        this.f31257b = str2;
        RB n9 = RB.n(c3523lC);
        this.f31258c = n9;
    }

    public static ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC3945t3
    public final void a(M2 m22) {
        char c9;
        Integer valueOf;
        String str = this.f29779a;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c9 = 16;
                    break;
                }
                c9 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c9 = '\f';
                    break;
                }
                c9 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c9 = 18;
                    break;
                }
                c9 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c9 = 20;
                    break;
                }
                c9 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c9 = '\n';
                    break;
                }
                c9 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c9 = 17;
                    break;
                }
                c9 = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c9 = 22;
                    break;
                }
                c9 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c9 = '\r';
                    break;
                }
                c9 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c9 = 14;
                    break;
                }
                c9 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c9 = 15;
                    break;
                }
                c9 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c9 = 21;
                    break;
                }
                c9 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c9 = 19;
                    break;
                }
                c9 = 65535;
                break;
            case 2581856:
                if (str.equals("TPOS")) {
                    c9 = 24;
                    break;
                }
                c9 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c9 = '\t';
                    break;
                }
                c9 = 65535;
                break;
            case 2584864:
                if (str.equals("TSST")) {
                    c9 = 23;
                    break;
                }
                c9 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c9 = 11;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        RB rb = this.f31258c;
        try {
            switch (c9) {
                case 0:
                case 1:
                    m22.f27002a = (CharSequence) rb.get(0);
                    break;
                case 2:
                case 3:
                    m22.f27003b = (CharSequence) rb.get(0);
                    break;
                case 4:
                case 5:
                    m22.f27005d = (CharSequence) rb.get(0);
                    break;
                case 6:
                case 7:
                    m22.f27004c = (CharSequence) rb.get(0);
                    break;
                case '\b':
                case '\t':
                    String str2 = (String) rb.get(0);
                    String str3 = AbstractC3182eu.f30782a;
                    String[] split = str2.split("/", -1);
                    int parseInt = Integer.parseInt(split[0]);
                    valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    m22.f27009h = Integer.valueOf(parseInt);
                    m22.i = valueOf;
                    break;
                case '\n':
                case 11:
                    m22.f27012l = Integer.valueOf(Integer.parseInt((String) rb.get(0)));
                    break;
                case '\f':
                case '\r':
                    String str4 = (String) rb.get(0);
                    int parseInt2 = Integer.parseInt(str4.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str4.substring(0, 2));
                    m22.f27013m = Integer.valueOf(parseInt2);
                    m22.f27014n = Integer.valueOf(parseInt3);
                    break;
                case 14:
                    ArrayList b9 = b((String) rb.get(0));
                    int size = b9.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                m22.f27014n = (Integer) b9.get(2);
                            }
                        }
                        m22.f27013m = (Integer) b9.get(1);
                    }
                    m22.f27012l = (Integer) b9.get(0);
                    break;
                case 15:
                    ArrayList b10 = b((String) rb.get(0));
                    int size2 = b10.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                m22.f27017q = (Integer) b10.get(2);
                            }
                        }
                        m22.f27016p = (Integer) b10.get(1);
                    }
                    m22.f27015o = (Integer) b10.get(0);
                    break;
                case 16:
                case 17:
                    m22.f27019s = (CharSequence) rb.get(0);
                    break;
                case 18:
                case 19:
                    m22.f27020t = (CharSequence) rb.get(0);
                    break;
                case 20:
                case 21:
                    m22.f27018r = (CharSequence) rb.get(0);
                    break;
                case 22:
                    Integer p9 = UC.p((String) rb.get(0));
                    if (p9 != null) {
                        String a9 = AbstractC3030c2.a(p9.intValue());
                        if (a9 != null) {
                            m22.f27024x = a9;
                            break;
                        }
                    } else {
                        m22.f27024x = (CharSequence) rb.get(0);
                        break;
                    }
                    break;
                case 23:
                    m22.f27021u = (CharSequence) rb.get(0);
                    break;
                case 24:
                    String str5 = (String) rb.get(0);
                    String str6 = AbstractC3182eu.f30782a;
                    String[] split2 = str5.split("/", -1);
                    int parseInt4 = Integer.parseInt(split2[0]);
                    valueOf = split2.length > 1 ? Integer.valueOf(Integer.parseInt(split2[1])) : null;
                    m22.f27022v = Integer.valueOf(parseInt4);
                    m22.f27023w = valueOf;
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3245g2.class == obj.getClass()) {
            C3245g2 c3245g2 = (C3245g2) obj;
            if (Objects.equals(this.f29779a, c3245g2.f29779a) && Objects.equals(this.f31257b, c3245g2.f31257b) && this.f31258c.equals(c3245g2.f31258c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f29779a.hashCode() + 527;
        String str = this.f31257b;
        return this.f31258c.hashCode() + (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2923a2
    public final String toString() {
        String valueOf = String.valueOf(this.f31258c);
        String str = this.f29779a;
        int length = String.valueOf(str).length();
        String str2 = this.f31257b;
        StringBuilder sb = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + valueOf.length());
        AbstractC5128c.h(sb, str, ": description=", str2, ": values=");
        sb.append(valueOf);
        return sb.toString();
    }
}
