package defpackage;

/* loaded from: classes.dex */
public final class kju implements n2i {
    public final String a;
    public final String b;

    public kju(String str, String str2) {
        this.a = ltg.N(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kju.class == obj.getClass()) {
            kju kjuVar = (kju) obj;
            if (this.a.equals(kjuVar.a) && this.b.equals(kjuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + k5r.c(527, 31, this.a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.n2i
    public final void populateMediaMetadata(eoh eohVar) {
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
                Integer c0 = zc4.c0(str2);
                if (c0 != null) {
                    eohVar.o = c0;
                    break;
                }
                break;
            case 1:
                Integer c02 = zc4.c0(str2);
                if (c02 != null) {
                    eohVar.C = c02;
                    break;
                }
                break;
            case 2:
                Integer c03 = zc4.c0(str2);
                if (c03 != null) {
                    eohVar.n = c03;
                    break;
                }
                break;
            case 3:
                eohVar.c = str2;
                break;
            case 4:
                eohVar.D = str2;
                break;
            case 5:
                eohVar.a = str2;
                break;
            case 6:
                eohVar.g = str2;
                break;
            case 7:
                Integer c04 = zc4.c0(str2);
                if (c04 != null) {
                    eohVar.B = c04;
                    break;
                }
                break;
            case '\b':
                eohVar.d = str2;
                break;
            case '\t':
                eohVar.b = str2;
                break;
        }
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
