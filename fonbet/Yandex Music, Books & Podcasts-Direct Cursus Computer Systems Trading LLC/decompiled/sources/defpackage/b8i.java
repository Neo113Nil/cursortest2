package defpackage;

/* loaded from: classes3.dex */
public final class b8i implements f8i, a8i {
    public final d6i a;
    public final String b;
    public final String c;

    public b8i(d6i d6iVar) {
        this.a = d6iVar;
        this.b = d6iVar.a;
        this.c = d6iVar.c;
    }

    @Override // defpackage.a8i
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b8i) && this.a.equals(((b8i) obj).a);
    }

    @Override // defpackage.a8i
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EntityData(uiData=" + this.a + ")";
    }
}
