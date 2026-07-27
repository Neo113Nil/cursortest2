package a7;

import D.y;
import a.AbstractC0422a;
import g6.C4531a;
import g6.InterfaceC4532b;
import h6.C4574a;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class f extends HashMap implements InterfaceC4532b {

    /* renamed from: n, reason: collision with root package name */
    public final long f4359n;

    /* renamed from: u, reason: collision with root package name */
    public final int f4360u;

    /* renamed from: v, reason: collision with root package name */
    public int f4361v = 0;

    public f(long j6, int i) {
        this.f4359n = j6;
        this.f4360u = i;
    }

    @Override // g6.InterfaceC4532b
    public final f6.c h() {
        I1.f fVar = new I1.f(1);
        super.forEach(new S6.a(2, fVar));
        return fVar.a().h();
    }

    public final C4531a i() {
        I1.f fVar = new I1.f(1);
        super.forEach(new S6.a(2, fVar));
        return fVar.a();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Object put(C4574a c4574a, Object obj) {
        if (obj == null) {
            return null;
        }
        this.f4361v++;
        if (size() < this.f4359n || containsKey(c4574a)) {
            return super.put(c4574a, AbstractC0422a.f(this.f4360u, obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtendedAttributesMap{data=");
        sb.append(super.toString());
        sb.append(", capacity=");
        sb.append(this.f4359n);
        sb.append(", totalAddedValues=");
        return y.q(sb, this.f4361v, '}');
    }
}
