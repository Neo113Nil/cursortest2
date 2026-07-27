package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3395j2 implements InterfaceC4043v3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f32060a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32061b;

    public C3395j2(String str, String str2) {
        this.f32060a = AbstractC3035cL.s(str);
        this.f32061b = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC4043v3
    public final void a(P2 p22) {
        char c4;
        String str = this.f32060a;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        String str2 = this.f32061b;
        switch (c4) {
            case 0:
                p22.f26799a = str2;
                break;
            case 1:
                p22.f26800b = str2;
                break;
            case 2:
                p22.f26801c = str2;
                break;
            case 3:
                p22.f26802d = str2;
                break;
            case 4:
                Integer F8 = AbstractC3194fG.F(str2);
                if (F8 != null) {
                    p22.f26806h = F8;
                    break;
                }
                break;
            case 5:
                Integer F9 = AbstractC3194fG.F(str2);
                if (F9 != null) {
                    p22.i = F9;
                    break;
                }
                break;
            case 6:
                Integer F10 = AbstractC3194fG.F(str2);
                if (F10 != null) {
                    p22.f26818u = F10;
                    break;
                }
                break;
            case 7:
                Integer F11 = AbstractC3194fG.F(str2);
                if (F11 != null) {
                    p22.f26819v = F11;
                    break;
                }
                break;
            case '\b':
                p22.f26820w = str2;
                break;
            case '\t':
                p22.f26803e = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3395j2.class == obj.getClass()) {
            C3395j2 c3395j2 = (C3395j2) obj;
            if (this.f32060a.equals(c3395j2.f32060a) && this.f32061b.equals(c3395j2.f32061b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f32061b.hashCode() + ((this.f32060a.hashCode() + 527) * 31);
    }

    public final String toString() {
        String str = this.f32060a;
        int length = String.valueOf(str).length();
        String str2 = this.f32061b;
        return com.anythink.basead.b.c.i.q(new StringBuilder(length + 5 + String.valueOf(str2).length()), "VC: ", str, "=", str2);
    }
}
