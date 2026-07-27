package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3222g2 extends AbstractC2900a2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f30491b;

    /* renamed from: c, reason: collision with root package name */
    public final RB f30492c;

    public C3222g2(String str, String str2, C3500lC c3500lC) {
        super(str);
        AbstractC2772Sd.i(!c3500lC.isEmpty());
        this.f30491b = str2;
        RB n9 = RB.n(c3500lC);
        this.f30492c = n9;
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
    @Override // com.google.android.gms.internal.ads.InterfaceC3922t3
    public final void a(M2 m22) {
        char c9;
        Integer valueOf;
        String str = this.f29009a;
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
        RB rb = this.f30492c;
        try {
            switch (c9) {
                case 0:
                case 1:
                    m22.f26211a = (CharSequence) rb.get(0);
                    break;
                case 2:
                case 3:
                    m22.f26212b = (CharSequence) rb.get(0);
                    break;
                case 4:
                case 5:
                    m22.f26214d = (CharSequence) rb.get(0);
                    break;
                case 6:
                case 7:
                    m22.f26213c = (CharSequence) rb.get(0);
                    break;
                case '\b':
                case '\t':
                    String str2 = (String) rb.get(0);
                    String str3 = AbstractC3159eu.f29993a;
                    String[] split = str2.split("/", -1);
                    int parseInt = Integer.parseInt(split[0]);
                    valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    m22.f26218h = Integer.valueOf(parseInt);
                    m22.i = valueOf;
                    break;
                case '\n':
                case 11:
                    m22.f26221l = Integer.valueOf(Integer.parseInt((String) rb.get(0)));
                    break;
                case '\f':
                case '\r':
                    String str4 = (String) rb.get(0);
                    int parseInt2 = Integer.parseInt(str4.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str4.substring(0, 2));
                    m22.f26222m = Integer.valueOf(parseInt2);
                    m22.f26223n = Integer.valueOf(parseInt3);
                    break;
                case 14:
                    ArrayList b9 = b((String) rb.get(0));
                    int size = b9.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                m22.f26223n = (Integer) b9.get(2);
                            }
                        }
                        m22.f26222m = (Integer) b9.get(1);
                    }
                    m22.f26221l = (Integer) b9.get(0);
                    break;
                case 15:
                    ArrayList b10 = b((String) rb.get(0));
                    int size2 = b10.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                m22.f26226q = (Integer) b10.get(2);
                            }
                        }
                        m22.f26225p = (Integer) b10.get(1);
                    }
                    m22.f26224o = (Integer) b10.get(0);
                    break;
                case 16:
                case 17:
                    m22.f26228s = (CharSequence) rb.get(0);
                    break;
                case 18:
                case 19:
                    m22.f26229t = (CharSequence) rb.get(0);
                    break;
                case 20:
                case 21:
                    m22.f26227r = (CharSequence) rb.get(0);
                    break;
                case 22:
                    Integer p9 = UC.p((String) rb.get(0));
                    if (p9 != null) {
                        String a9 = AbstractC3007c2.a(p9.intValue());
                        if (a9 != null) {
                            m22.f26233x = a9;
                            break;
                        }
                    } else {
                        m22.f26233x = (CharSequence) rb.get(0);
                        break;
                    }
                    break;
                case 23:
                    m22.f26230u = (CharSequence) rb.get(0);
                    break;
                case 24:
                    String str5 = (String) rb.get(0);
                    String str6 = AbstractC3159eu.f29993a;
                    String[] split2 = str5.split("/", -1);
                    int parseInt4 = Integer.parseInt(split2[0]);
                    valueOf = split2.length > 1 ? Integer.valueOf(Integer.parseInt(split2[1])) : null;
                    m22.f26231v = Integer.valueOf(parseInt4);
                    m22.f26232w = valueOf;
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3222g2.class == obj.getClass()) {
            C3222g2 c3222g2 = (C3222g2) obj;
            if (Objects.equals(this.f29009a, c3222g2.f29009a) && Objects.equals(this.f30491b, c3222g2.f30491b) && this.f30492c.equals(c3222g2.f30492c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f29009a.hashCode() + 527;
        String str = this.f30491b;
        return this.f30492c.hashCode() + (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2900a2
    public final String toString() {
        String valueOf = String.valueOf(this.f30492c);
        String str = this.f29009a;
        int length = String.valueOf(str).length();
        String str2 = this.f30491b;
        StringBuilder sb = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + valueOf.length());
        u1.h.i(sb, str, ": description=", str2, ": values=");
        sb.append(valueOf);
        return sb.toString();
    }
}
