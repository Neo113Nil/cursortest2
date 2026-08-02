package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y4d implements n7q {
    public final y3q a;
    public final k4d b;
    public final b3l c;

    public y4d(y3q y3qVar, k4d k4dVar, b3l b3lVar) {
        b3lVar.getClass();
        this.a = y3qVar;
        this.b = k4dVar;
        this.c = b3lVar;
    }

    @Override // defpackage.n7q
    public final noh a() {
        return moh.a;
    }

    @Override // defpackage.n7q
    public final mwk b() {
        return this.b;
    }

    @Override // defpackage.n7q
    public final b3l c() {
        return this.c;
    }

    @Override // defpackage.n7q
    public final boolean d() {
        return true;
    }

    @Override // defpackage.n7q
    public final long e() {
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4d)) {
            return false;
        }
        y4d y4dVar = (y4d) obj;
        if (!this.a.equals(y4dVar.a) || !this.b.equals(y4dVar.b)) {
            return false;
        }
        moh mohVar = moh.a;
        return mohVar.equals(mohVar) && Intrinsics.d(this.c, y4dVar.c);
    }

    @Override // defpackage.n7q
    public final h4q f() {
        return h4q.b;
    }

    @Override // defpackage.n7q
    public final u3q g() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) - 244674908) * 31);
    }

    public final String toString() {
        return "GenerativeQueueState(playbackEntity=" + this.a + ", current=" + this.b + ", mediaOutputTarget=" + moh.a + ", playableChangeReason=" + this.c + ")";
    }
}
