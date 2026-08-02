package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class wfa implements xfa {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;

    public wfa(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfa)) {
            return false;
        }
        wfa wfaVar = (wfa) obj;
        return this.a.equals(wfaVar.a) && this.b.equals(wfaVar.b) && this.c.equals(wfaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dfi.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(tracks=");
        sb.append(this.a);
        sb.append(", playlists=");
        sb.append(this.b);
        sb.append(", albums=");
        return vz1.t(sb, this.c, ")");
    }
}
