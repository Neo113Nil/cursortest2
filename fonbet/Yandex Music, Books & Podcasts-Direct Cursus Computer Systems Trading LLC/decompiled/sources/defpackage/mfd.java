package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mfd extends pfd {
    public final h1q a;
    public final j1q b;

    public mfd(h1q h1qVar, j1q j1qVar) {
        h1qVar.getClass();
        this.a = h1qVar;
        this.b = j1qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfd)) {
            return false;
        }
        mfd mfdVar = (mfd) obj;
        return Intrinsics.d(this.a, mfdVar.a) && this.b.equals(mfdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Generative(generative=" + this.a + ", playable=" + this.b + ")";
    }
}
