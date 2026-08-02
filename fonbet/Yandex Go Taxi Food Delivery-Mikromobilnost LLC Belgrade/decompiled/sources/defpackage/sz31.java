package defpackage;

import com.google.common.primitives.a;

/* loaded from: classes10.dex */
public final class sz31 implements s820 {
    public final String a;
    public final String b;

    public sz31(String str, String str2) {
        this.a = f0b1.h(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sz31.class == obj.getClass()) {
            sz31 sz31Var = (sz31) obj;
            if (this.a.equals(sz31Var.a) && this.b.equals(sz31Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + unr0.b(527, 31, this.a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.s820
    public final void populateMediaMetadata(qe10 qe10Var) {
        String str = this.a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = '\t';
                    break;
                }
                break;
        }
        String str2 = this.b;
        switch (c) {
            case 0:
                Integer f = a.f(str2);
                if (f != null) {
                    qe10Var.i = f;
                    break;
                }
                break;
            case 1:
                Integer f2 = a.f(str2);
                if (f2 != null) {
                    qe10Var.v = f2;
                    break;
                }
                break;
            case 2:
                Integer f3 = a.f(str2);
                if (f3 != null) {
                    qe10Var.h = f3;
                    break;
                }
                break;
            case 3:
                qe10Var.c = str2;
                break;
            case 4:
                qe10Var.w = str2;
                break;
            case 5:
                qe10Var.a = str2;
                break;
            case 6:
                qe10Var.e = str2;
                break;
            case 7:
                Integer f4 = a.f(str2);
                if (f4 != null) {
                    qe10Var.u = f4;
                    break;
                }
                break;
            case '\b':
                qe10Var.d = str2;
                break;
            case '\t':
                qe10Var.b = str2;
                break;
        }
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
