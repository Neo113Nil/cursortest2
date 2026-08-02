package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3513l2 implements InterfaceC3945t3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f32464a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32465b;

    public C3513l2(String str, String str2) {
        this.f32464a = AbstractC3066cl.s(str);
        this.f32465b = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC3945t3
    public final void a(M2 m22) {
        char c9;
        String str = this.f32464a;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c9 = '\t';
                    break;
                }
                c9 = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c9 = '\n';
                    break;
                }
                c9 = 65535;
                break;
            case 905239725:
                if (str.equals("DISCSUBTITLE")) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        String str2 = this.f32465b;
        switch (c9) {
            case 0:
                m22.f27002a = str2;
                break;
            case 1:
                m22.f27003b = str2;
                break;
            case 2:
                m22.f27004c = str2;
                break;
            case 3:
                m22.f27005d = str2;
                break;
            case 4:
                Integer p9 = UC.p(str2);
                if (p9 != null) {
                    m22.f27009h = p9;
                    break;
                }
                break;
            case 5:
                Integer p10 = UC.p(str2);
                if (p10 != null) {
                    m22.i = p10;
                    break;
                }
                break;
            case 6:
                m22.f27021u = str2;
                break;
            case 7:
                Integer p11 = UC.p(str2);
                if (p11 != null) {
                    m22.f27022v = p11;
                    break;
                }
                break;
            case '\b':
                Integer p12 = UC.p(str2);
                if (p12 != null) {
                    m22.f27023w = p12;
                    break;
                }
                break;
            case '\t':
                m22.f27024x = str2;
                break;
            case '\n':
                m22.f27006e = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3513l2.class == obj.getClass()) {
            C3513l2 c3513l2 = (C3513l2) obj;
            if (this.f32464a.equals(c3513l2.f32464a) && this.f32465b.equals(c3513l2.f32465b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f32465b.hashCode() + ((this.f32464a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String str = this.f32464a;
        int length = String.valueOf(str).length();
        String str2 = this.f32465b;
        return com.IceFishing.LiveIceFishing.k.r(new StringBuilder(length + 5 + String.valueOf(str2).length()), "VC: ", str, "=", str2);
    }
}
