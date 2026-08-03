package f5;

import hc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: b, reason: collision with root package name */
    public final j f2313b;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f2313b.equals(((b) obj).f2313b);
        }
        return false;
    }

    @Override // f5.e
    public final Object getValue() {
        throw new IllegalStateException("The driver used with SQLDelight is asynchronous, so SQLDelight should be configured for\nasynchronous usage:\n\nsqldelight {\n  databases {\n    MyDatabase {\n      generateAsync = true\n    }\n  }\n}");
    }

    public final int hashCode() {
        return this.f2313b.hashCode();
    }

    public final String toString() {
        return "AsyncValue(getter=" + this.f2313b + ')';
    }
}
