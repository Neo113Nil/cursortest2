package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class igw extends o5g {
    public final List c;

    public igw(List list) {
        this.c = list;
    }

    @Override // defpackage.o5g
    public final List B() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof igw) && Intrinsics.d(this.c, ((igw) obj).c);
    }

    public final int hashCode() {
        List list = this.c;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return v3w.f("Default(backoffTimeouts=", ")", this.c);
    }
}
