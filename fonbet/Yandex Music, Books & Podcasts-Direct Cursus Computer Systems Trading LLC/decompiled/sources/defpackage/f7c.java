package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f7c extends h7c {
    public final String a;
    public final boolean b;
    public final List c;

    public f7c(String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = t75.c(new z6c(z));
    }

    @Override // defpackage.h7c
    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7c)) {
            return false;
        }
        f7c f7cVar = (f7c) obj;
        return Intrinsics.d(this.a, f7cVar.a) && this.b == f7cVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return v3w.e("Placeholder(blockTitle=", this.a, ", isLoading=", ")", this.b);
    }
}
