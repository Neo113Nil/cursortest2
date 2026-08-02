package defpackage;

/* loaded from: classes9.dex */
public final class xd5 implements je60 {
    public final rxq a;

    public xd5(rxq rxqVar) {
        this.a = rxqVar;
    }

    @Override // defpackage.s7s
    public final m9s a() {
        return this.a.a();
    }

    @Override // defpackage.s7s
    public final wf90 b() {
        return this.a.b();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xd5) {
            return this.a.equals(((xd5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BasicFormatStructure(" + this.a + ')';
    }
}
