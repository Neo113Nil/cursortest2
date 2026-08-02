package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class akq {
    public final w0l a;
    public final n7q b;

    public akq(w0l w0lVar, n7q n7qVar) {
        n7qVar.getClass();
        this.a = w0lVar;
        this.b = n7qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akq)) {
            return false;
        }
        akq akqVar = (akq) obj;
        return this.a == akqVar.a && Intrinsics.d(this.b, akqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SimplifiedPlaybackState(playingState=" + this.a + ", queueState=" + this.b + ")";
    }
}
