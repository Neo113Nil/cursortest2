package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ph6 {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final List d;

    public ph6(String str, Integer num, Integer num2, ArrayList arrayList) {
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph6)) {
            return false;
        }
        ph6 ph6Var = (ph6) obj;
        return this.a.equals(ph6Var.a) && Intrinsics.d(this.b, ph6Var.b) && Intrinsics.d(this.c, ph6Var.c) && Intrinsics.d(this.d, ph6Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.d;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ContinueListenMyShelfEntity(title=" + this.a + ", bookCount=" + this.b + ", podcastCount=" + this.c + ", covers=" + this.d + ")";
    }
}
