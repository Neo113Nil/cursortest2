package O2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final C0351a f2178a;

    /* renamed from: b, reason: collision with root package name */
    public final M2.d f2179b;

    public /* synthetic */ E(C0351a c0351a, M2.d dVar) {
        this.f2178a = c0351a;
        this.f2179b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof E)) {
            E e9 = (E) obj;
            if (P2.w.l(this.f2178a, e9.f2178a) && P2.w.l(this.f2179b, e9.f2179b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2178a, this.f2179b});
    }

    public final String toString() {
        S0.s sVar = new S0.s(this);
        sVar.f(this.f2178a, "key");
        sVar.f(this.f2179b, "feature");
        return sVar.toString();
    }
}
