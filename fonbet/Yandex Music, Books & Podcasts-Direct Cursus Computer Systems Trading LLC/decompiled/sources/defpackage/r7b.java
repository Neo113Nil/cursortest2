package defpackage;

/* loaded from: classes5.dex */
public final class r7b {
    public final ldi a;
    public final g3a b;
    public final l3a c;
    public final n3a d;
    public final mdi e;
    public final j3a f;

    public r7b(ldi ldiVar, g3a g3aVar, l3a l3aVar, n3a n3aVar, mdi mdiVar, j3a j3aVar) {
        this.a = ldiVar;
        this.b = g3aVar;
        this.c = l3aVar;
        this.d = n3aVar;
        this.e = mdiVar;
        this.f = j3aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r7b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        r7b r7bVar = (r7b) obj;
        return this.a.equals(r7bVar.a) && this.b.equals(r7bVar.b) && this.c.equals(r7bVar.c) && this.d.equals(r7bVar.d) && this.e.equals(r7bVar.e) && this.f.equals(r7bVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EngineContext(actionDispatcher=" + this.a + ", commandChannel=" + this.b + ", visibleBoundsAware=" + this.c + ", viewLifecycleOwner=" + this.d + ", animationPlayer=" + this.e + ", documentSupplier=" + this.f + ")";
    }
}
