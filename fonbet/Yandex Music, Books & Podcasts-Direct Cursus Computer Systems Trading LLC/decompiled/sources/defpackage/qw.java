package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class qw implements sw {
    public final tw a;
    public final u9b b;
    public final u9b c;

    public qw(tw twVar) {
        twVar.getClass();
        this.a = twVar;
        ow owVar = twVar.a;
        this.b = owVar.a.e;
        this.c = owVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qw) && Intrinsics.d(this.a, ((qw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Loaded(albumPromoBundle=" + this.a + ")";
    }
}
