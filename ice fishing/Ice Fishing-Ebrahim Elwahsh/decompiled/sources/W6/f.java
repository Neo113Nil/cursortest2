package W6;

import D.y;
import c6.C0542a;
import c6.InterfaceC0543b;
import d6.C4460a;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class f extends HashMap implements InterfaceC0543b {

    /* renamed from: n, reason: collision with root package name */
    public final long f3470n;

    /* renamed from: u, reason: collision with root package name */
    public final int f3471u;

    /* renamed from: v, reason: collision with root package name */
    public int f3472v = 0;

    public f(long j9, int i) {
        this.f3470n = j9;
        this.f3471u = i;
    }

    @Override // c6.InterfaceC0543b
    public final b6.c h() {
        I1.b bVar = new I1.b(2);
        super.forEach(new O6.a(2, bVar));
        return bVar.e().h();
    }

    public final C0542a i() {
        I1.b bVar = new I1.b(2);
        super.forEach(new O6.a(2, bVar));
        return bVar.e();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Object put(C4460a c4460a, Object obj) {
        if (obj == null) {
            return null;
        }
        this.f3472v++;
        if (size() < this.f3470n || containsKey(c4460a)) {
            return super.put(c4460a, p8.g.b(this.f3471u, obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtendedAttributesMap{data=");
        sb.append(super.toString());
        sb.append(", capacity=");
        sb.append(this.f3470n);
        sb.append(", totalAddedValues=");
        return y.m(sb, this.f3472v, '}');
    }
}
