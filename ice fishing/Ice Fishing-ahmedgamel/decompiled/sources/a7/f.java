package a7;

import D.x;
import g6.C4535a;
import g6.InterfaceC4536b;
import h6.C4579a;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class f extends HashMap implements InterfaceC4536b {

    /* renamed from: n, reason: collision with root package name */
    public final long f4327n;

    /* renamed from: u, reason: collision with root package name */
    public final int f4328u;

    /* renamed from: v, reason: collision with root package name */
    public int f4329v = 0;

    public f(long j6, int i) {
        this.f4327n = j6;
        this.f4328u = i;
    }

    @Override // g6.InterfaceC4536b
    public final f6.c h() {
        I1.d dVar = new I1.d(2);
        super.forEach(new S6.b(2, dVar));
        return dVar.d().h();
    }

    public final C4535a i() {
        I1.d dVar = new I1.d(2);
        super.forEach(new S6.b(2, dVar));
        return dVar.d();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Object put(C4579a c4579a, Object obj) {
        if (obj == null) {
            return null;
        }
        this.f4329v++;
        if (size() < this.f4327n || containsKey(c4579a)) {
            return super.put(c4579a, com.bumptech.glide.d.b(this.f4328u, obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtendedAttributesMap{data=");
        sb.append(super.toString());
        sb.append(", capacity=");
        sb.append(this.f4327n);
        sb.append(", totalAddedValues=");
        return x.n(sb, this.f4329v, '}');
    }
}
