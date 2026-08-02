package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bmu implements dmu {
    public final List a;
    public final r3q b;
    public final v80 c;

    public bmu(List list, r3q r3qVar, v80 v80Var) {
        list.getClass();
        v80Var.getClass();
        this.a = list;
        this.b = r3qVar;
        this.c = v80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmu)) {
            return false;
        }
        bmu bmuVar = (bmu) obj;
        return Intrinsics.d(this.a, bmuVar.a) && this.b.equals(bmuVar.b) && Intrinsics.d(this.c, bmuVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TracksFromSearchEntity(tracks=" + this.a + ", sourceEntity=" + this.b + ", analyticsValues=" + this.c + ")";
    }
}
