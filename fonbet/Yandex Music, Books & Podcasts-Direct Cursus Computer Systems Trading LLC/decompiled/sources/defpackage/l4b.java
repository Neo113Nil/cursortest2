package defpackage;

/* loaded from: classes5.dex */
public final class l4b implements iie {
    public final boolean a;

    public l4b(boolean z) {
        this.a = z;
    }

    @Override // defpackage.iie
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.iie
    public final h8j d() {
        return null;
    }

    public final String toString() {
        return dfi.i(new StringBuilder("Empty{"), this.a ? "Active" : "New", '}');
    }
}
