package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class qh6 {
    public final String a;
    public final List b;
    public final v9b c;
    public final v9b d;

    public qh6(String str, List list, v9b v9bVar, v9b v9bVar2) {
        this.a = str;
        this.b = list;
        this.c = v9bVar;
        this.d = v9bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh6)) {
            return false;
        }
        qh6 qh6Var = (qh6) obj;
        return this.a.equals(qh6Var.a) && Intrinsics.d(this.b, qh6Var.b) && Intrinsics.d(this.c, qh6Var.c) && Intrinsics.d(this.d, qh6Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        v9b v9bVar = this.c;
        int hashCode3 = (hashCode2 + (v9bVar == null ? 0 : v9bVar.hashCode())) * 31;
        v9b v9bVar2 = this.d;
        return hashCode3 + (v9bVar2 != null ? v9bVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = ouj.v("ContinueListenMyShelfEntityUiData(title=", this.a, ", subtitle=", ", foregroundCover=", this.b);
        v.append(this.c);
        v.append(", backgroundCover=");
        v.append(this.d);
        v.append(")");
        return v.toString();
    }
}
