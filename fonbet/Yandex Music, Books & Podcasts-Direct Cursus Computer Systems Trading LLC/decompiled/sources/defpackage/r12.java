package defpackage;

/* loaded from: classes3.dex */
public final class r12 implements drf {
    public final nrf a;

    public r12(nrf nrfVar) {
        this.a = nrfVar;
    }

    @Override // defpackage.drf
    public final nrf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r12) && this.a.equals(((r12) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AutoCacheOnboardingBlock(meta=" + this.a + ")";
    }
}
