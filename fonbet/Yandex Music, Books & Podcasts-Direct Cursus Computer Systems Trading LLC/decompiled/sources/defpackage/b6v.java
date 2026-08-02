package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b6v implements e6v {
    public final r3q a;

    public b6v(r3q r3qVar) {
        r3qVar.getClass();
        this.a = r3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b6v) && Intrinsics.d(this.a, ((b6v) obj).a);
    }

    @Override // defpackage.e6v
    public final u3q getEntity() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PhonotekaSource(entity=" + this.a + ")";
    }
}
