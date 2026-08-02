package defpackage;

/* loaded from: classes4.dex */
public final class vel implements xel {
    public final vdl a;

    public vel(vdl vdlVar) {
        this.a = vdlVar;
    }

    @Override // defpackage.xel
    public final vdl a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vel) && this.a.equals(((vel) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "DefinitelyAbsent(reference=" + this.a + ")";
    }
}
