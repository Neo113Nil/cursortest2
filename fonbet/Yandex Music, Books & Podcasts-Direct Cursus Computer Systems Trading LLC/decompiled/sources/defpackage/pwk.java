package defpackage;

/* loaded from: classes3.dex */
public final class pwk implements qwk {
    public final int a;

    public pwk(int i) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pwk) && this.a == ((pwk) obj).a;
    }

    public final int hashCode() {
        return ouj.D(this.a);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AdditionalInfoVideoClip(recommendationType=");
        switch (this.a) {
            case 1:
                str = "UNSPECIFIED";
                break;
            case 2:
                str = "RECOMMENDED";
                break;
            case 3:
                str = "ON_DEMAND";
                break;
            case 4:
                str = "SEARCH";
                break;
            case 5:
                str = "ARTIST";
                break;
            case 6:
                str = "OWN";
                break;
            case 7:
                str = "EDITORIAL_CHOICE";
                break;
            case 8:
                str = "UNRECOGNIZED";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
