package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class v2s implements tqq {
    public final tqq a;
    public final int b;

    public v2s(tqq tqqVar, int i) {
        this.a = tqqVar;
        this.b = i;
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.a.a();
    }

    @Override // defpackage.tqq
    public final List c() {
        return this.a.c();
    }

    @Override // defpackage.tqq
    public final vdr e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2s)) {
            return false;
        }
        v2s v2sVar = (v2s) obj;
        return this.a.equals(v2sVar.a) && this.b == v2sVar.b;
    }

    @Override // defpackage.tqq
    public final void g(int i) {
        this.a.g(i);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.tqq
    public final pjc i() {
        return this.a.i();
    }

    @Override // defpackage.tqq
    public final vdr j() {
        return this.a.j();
    }

    public final String toString() {
        return "TabsState(state=" + this.a + ", position=" + this.b + ")";
    }

    @Override // defpackage.tqq, defpackage.rnq
    public final m2s a() {
        return this.a.a();
    }
}
