package defpackage;

/* loaded from: classes3.dex */
public final class t64 implements s64 {
    public final gow a;
    public final String b;

    public t64(gow gowVar) {
        this.a = gowVar;
        this.b = gowVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t64) && this.a.equals(((t64) obj).a);
    }

    @Override // defpackage.u64
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "YnisonDescriptor(device=" + this.a + ")";
    }
}
