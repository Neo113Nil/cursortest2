package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class s0s {
    public final int a;
    public final p0s b;
    public final ArrayList c;

    public s0s(int i, p0s p0sVar, ArrayList arrayList) {
        this.a = i;
        this.b = p0sVar;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0s)) {
            return false;
        }
        s0s s0sVar = (s0s) obj;
        return this.a == s0sVar.a && this.b == s0sVar.b && this.c.equals(s0sVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabData(title=");
        sb.append(this.a);
        sb.append(", screenType=");
        sb.append(this.b);
        sb.append(", playlistList=");
        return vz1.t(sb, this.c, ")");
    }
}
