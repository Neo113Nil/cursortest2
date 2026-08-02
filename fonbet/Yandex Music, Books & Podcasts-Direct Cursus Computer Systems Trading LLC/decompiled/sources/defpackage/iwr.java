package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class iwr implements jwr {
    public final List a;

    public iwr(List list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iwr) && Intrinsics.d(this.a, ((iwr) obj).a);
    }

    @Override // defpackage.jwr
    public final n43 getType() {
        return m43.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v3w.f("PreSavesSyncBlock(presaves=", ")", this.a);
    }
}
