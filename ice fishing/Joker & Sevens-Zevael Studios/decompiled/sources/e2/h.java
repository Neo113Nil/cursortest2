package e2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final pc.k f1957a;

    /* renamed from: b, reason: collision with root package name */
    public final pc.k f1958b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(oc.a aVar, oc.a aVar2) {
        this.f1957a = (pc.k) aVar;
        this.f1958b = (pc.k) aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [oc.a, pc.k] */
    public final oc.a a() {
        return this.f1958b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [oc.a, pc.k] */
    /* JADX WARN: Type inference failed for: r1v6, types: [oc.a, pc.k] */
    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f1957a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f1958b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
