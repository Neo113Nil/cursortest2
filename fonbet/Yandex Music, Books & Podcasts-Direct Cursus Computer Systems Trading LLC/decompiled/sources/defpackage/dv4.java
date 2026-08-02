package defpackage;

/* loaded from: classes3.dex */
public final class dv4 implements ev4 {
    public final Object a = btf.a(bwf.c, new ym4(8, this));

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @Override // defpackage.ev4
    public final String a() {
        return (String) this.a.getValue();
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof dv4);
    }

    public final int hashCode() {
        return Integer.hashCode(5);
    }

    public final String toString() {
        return "WizardElement(position=5)";
    }
}
