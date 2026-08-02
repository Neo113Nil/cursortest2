package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d6l implements e6l {
    public final n7q a;
    public final w0l b;
    public final v0l c;
    public final u0l d;

    public d6l(n7q n7qVar, w0l w0lVar, v0l v0lVar, u0l u0lVar) {
        n7qVar.getClass();
        this.a = n7qVar;
        this.b = w0lVar;
        this.c = v0lVar;
        this.d = u0lVar;
    }

    public static d6l a(d6l d6lVar, n7q n7qVar, w0l w0lVar, v0l v0lVar, int i) {
        if ((i & 1) != 0) {
            n7qVar = d6lVar.a;
        }
        if ((i & 2) != 0) {
            w0lVar = d6lVar.b;
        }
        if ((i & 4) != 0) {
            v0lVar = d6lVar.c;
        }
        u0l u0lVar = d6lVar.d;
        n7qVar.getClass();
        v0lVar.getClass();
        return new d6l(n7qVar, w0lVar, v0lVar, u0lVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6l)) {
            return false;
        }
        d6l d6lVar = (d6l) obj;
        return Intrinsics.d(this.a, d6lVar.a) && this.b == d6lVar.b && this.c == d6lVar.c && this.d == d6lVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Ready(queueState=" + this.a + ", playingState=" + this.b + ", playerState=" + this.c + ", muteState=" + this.d + ")";
    }
}
