package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g7c extends h7c {
    public final List a;
    public final String b;

    public g7c(List list, String str) {
        list.getClass();
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.h7c
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7c)) {
            return false;
        }
        g7c g7cVar = (g7c) obj;
        return Intrinsics.d(this.a, g7cVar.a) && Intrinsics.d(this.b, g7cVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Success(items=" + this.a + ", blockTitle=" + this.b + ")";
    }
}
