package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ly implements uy {
    public final te a;

    public ly(te teVar) {
        teVar.getClass();
        this.a = teVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ly) && Intrinsics.d(this.a, ((ly) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BrandedButton(uiData=" + this.a + ")";
    }
}
