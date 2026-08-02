package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class jzu implements kzu {
    public final ArrayList a;
    public final b6v b;
    public final v80 c;
    public final ezu d;

    public jzu(ArrayList arrayList, b6v b6vVar, v80 v80Var, ezu ezuVar) {
        this.a = arrayList;
        this.b = b6vVar;
        this.c = v80Var;
        this.d = ezuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzu)) {
            return false;
        }
        jzu jzuVar = (jzu) obj;
        return this.a.equals(jzuVar.a) && this.b.equals(jzuVar.b) && this.c.equals(jzuVar.c) && this.d.equals(jzuVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TracksByIds(trackIds=" + this.a + ", source=" + this.b + ", analyticsValues=" + this.c + ", startParameters=" + this.d + ")";
    }
}
