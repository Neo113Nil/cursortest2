package defpackage;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class unk {
    public final rr5 a;
    public final Date b;
    public final lxs c;

    public unk(rr5 rr5Var, Date date, lxs lxsVar) {
        rr5Var.getClass();
        this.a = rr5Var;
        this.b = date;
        this.c = lxsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unk)) {
            return false;
        }
        unk unkVar = (unk) obj;
        return Intrinsics.d(this.a, unkVar.a) && Intrinsics.d(this.b, unkVar.b) && this.c == unkVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Date date = this.b;
        return this.c.hashCode() + ((hashCode + (date == null ? 0 : date.hashCode())) * 31);
    }

    public final String toString() {
        return "PhonotekaSavedTrack(trackId=" + this.a + ", timestamp=" + this.b + ", trackListType=" + this.c + ")";
    }
}
