package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wqw {
    public final int a;
    public final vqw b;

    public wqw(int i, vqw vqwVar) {
        vqwVar.getClass();
        this.a = i;
        this.b = vqwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqw)) {
            return false;
        }
        wqw wqwVar = (wqw) obj;
        return this.a == wqwVar.a && Intrinsics.d(this.b, wqwVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
