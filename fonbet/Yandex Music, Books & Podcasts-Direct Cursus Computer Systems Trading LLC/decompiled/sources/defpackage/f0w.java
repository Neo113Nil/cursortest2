package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class f0w implements g0w {
    public final ArrayList a;
    public final String b;
    public final boolean c;

    public f0w(String str, ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.g0w
    public final boolean a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0w)) {
            return false;
        }
        f0w f0wVar = (f0w) obj;
        return this.a.equals(f0wVar.a) && this.b.equals(f0wVar.b) && this.c == f0wVar.c;
    }

    @Override // defpackage.g0w
    public final String getText() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForOldUser(lastLikedArtists=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", isSaveAvailable=");
        return ouj.r(sb, this.c, ")");
    }
}
