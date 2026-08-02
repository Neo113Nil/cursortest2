package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g3n implements h3n {
    public final m3n a;
    public final q2n b;
    public final m c;
    public final y3n d;
    public final q2n e;
    public final y3n f;
    public final q2n g;

    public g3n(m3n m3nVar, q2n q2nVar, m mVar, y3n y3nVar, q2n q2nVar2, y3n y3nVar2, q2n q2nVar3) {
        this.a = m3nVar;
        this.b = q2nVar;
        this.c = mVar;
        this.d = y3nVar;
        this.e = q2nVar2;
        this.f = y3nVar2;
        this.g = q2nVar3;
    }

    @Override // defpackage.i3n
    public final m3n a() {
        return this.a;
    }

    @Override // defpackage.h3n
    public final q2n b() {
        return this.b;
    }

    @Override // defpackage.h3n
    public final m c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3n)) {
            return false;
        }
        g3n g3nVar = (g3n) obj;
        return this.a.equals(g3nVar.a) && Intrinsics.d(this.b, g3nVar.b) && Intrinsics.d(this.c, g3nVar.c) && this.d.equals(g3nVar.d) && this.e.equals(g3nVar.e) && this.f.equals(g3nVar.f) && this.g.equals(g3nVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q2n q2nVar = this.b;
        int hashCode2 = (hashCode + (q2nVar == null ? 0 : q2nVar.hashCode())) * 31;
        m mVar = this.c;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (mVar != null ? mVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Slider(texts=" + this.a + ", bottomButton=" + this.b + ", disclaimer=" + this.c + ", leftButtonText=" + this.d + ", leftButton=" + this.e + ", rightButtonText=" + this.f + ", rightButton=" + this.g + ")";
    }
}
