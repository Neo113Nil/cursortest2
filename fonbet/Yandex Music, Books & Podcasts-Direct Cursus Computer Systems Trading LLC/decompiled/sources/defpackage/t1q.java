package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t1q implements n7q {
    public static final t1q h = new t1q(new k1q(), null, new e2q(new ckd("".concat("_fake_id"), false, bkd.g, "", "", null, 0)), null, c5b.a);
    public final z3q a;
    public final m1q b;
    public final m1q c;
    public final m1q d;
    public final List e;
    public final int f;
    public final boolean g;

    public t1q(z3q z3qVar, m1q m1qVar, m1q m1qVar2, m1q m1qVar3, List list) {
        z3qVar.getClass();
        m1qVar2.getClass();
        list.getClass();
        this.a = z3qVar;
        this.b = m1qVar;
        this.c = m1qVar2;
        this.d = m1qVar3;
        this.e = list;
        this.f = list.indexOf(m1qVar2);
        this.g = list.isEmpty();
    }

    @Override // defpackage.n7q
    public final noh a() {
        return moh.a;
    }

    @Override // defpackage.n7q
    public final mwk b() {
        return this.c;
    }

    @Override // defpackage.n7q
    public final b3l c() {
        return a3l.a;
    }

    @Override // defpackage.n7q
    public final boolean d() {
        return false;
    }

    @Override // defpackage.n7q
    public final long e() {
        return 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1q)) {
            return false;
        }
        t1q t1qVar = (t1q) obj;
        if (!Intrinsics.d(this.a, t1qVar.a) || !Intrinsics.d(this.b, t1qVar.b) || !Intrinsics.d(this.c, t1qVar.c) || !Intrinsics.d(this.d, t1qVar.d) || !Intrinsics.d(this.e, t1qVar.e)) {
            return false;
        }
        a3l a3lVar = a3l.a;
        return a3lVar.equals(a3lVar);
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
        int hashCode = this.a.hashCode() * 31;
        m1q m1qVar = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (m1qVar == null ? 0 : m1qVar.hashCode())) * 31)) * 31;
        m1q m1qVar2 = this.d;
        return ((this.e.hashCode() + ((hashCode2 + (m1qVar2 != null ? m1qVar2.hashCode() : 0)) * 31)) * 31) + 1915220355;
    }

    public final String toString() {
        return "SharedGlagolQueueState(playbackEntity=" + this.a + ", previous=" + this.b + ", current=" + this.c + ", next=" + this.d + ", playables=" + this.e + ", playableChangeReason=" + a3l.a + ")";
    }
}
