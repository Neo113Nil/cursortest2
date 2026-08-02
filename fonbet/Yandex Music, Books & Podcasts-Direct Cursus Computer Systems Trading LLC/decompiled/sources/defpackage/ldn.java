package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ldn {
    public final String a;
    public final List b;
    public final dtq c;

    public ldn(String str, List list, dtq dtqVar) {
        list.getClass();
        dtqVar.getClass();
        this.a = str;
        this.b = list;
        this.c = dtqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldn)) {
            return false;
        }
        ldn ldnVar = (ldn) obj;
        return Intrinsics.d(this.a, ldnVar.a) && Intrinsics.d(this.b, ldnVar.b) && Intrinsics.d(this.c, ldnVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + k5r.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = ouj.v("QuizContentUiData(description=", this.a, ", items=", ", align=", this.b);
        v.append(this.c);
        v.append(")");
        return v.toString();
    }
}
