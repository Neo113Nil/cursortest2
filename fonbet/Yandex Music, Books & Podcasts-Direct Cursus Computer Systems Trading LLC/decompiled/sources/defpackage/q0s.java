package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class q0s {
    public final int a;
    public final o0s b;
    public final ArrayList c;

    public q0s(int i, o0s o0sVar, ArrayList arrayList) {
        this.a = i;
        this.b = o0sVar;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0s)) {
            return false;
        }
        q0s q0sVar = (q0s) obj;
        return this.a == q0sVar.a && this.b == q0sVar.b && this.c.equals(q0sVar.c);
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
