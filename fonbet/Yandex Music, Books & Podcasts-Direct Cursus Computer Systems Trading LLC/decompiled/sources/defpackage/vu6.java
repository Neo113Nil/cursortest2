package defpackage;

/* loaded from: classes.dex */
public final class vu6 implements u7t {
    public final int b;

    public vu6(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        xq0.x("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.u7t
    public final c8t a(z8t z8tVar, sce sceVar) {
        return !(sceVar instanceof bqr) ? new iej(z8tVar, sceVar) : ((bqr) sceVar).c == bb7.a ? new iej(z8tVar, sceVar) : new wu6(z8tVar, sceVar, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vu6) {
            return this.b == ((vu6) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.b * 31);
    }
}
