package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kpg implements bf5 {
    public final List a;

    public kpg(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.bf5
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kpg) && Intrinsics.d(this.a, ((kpg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.bf5
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final String toString() {
        return v3w.f("LocalSearchResult(items=", ")", this.a);
    }
}
