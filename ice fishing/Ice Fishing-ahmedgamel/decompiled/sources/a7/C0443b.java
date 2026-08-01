package a7;

import D.y;
import a.AbstractC0422a;
import java.util.HashMap;

/* renamed from: a7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0443b extends HashMap implements f6.c {

    /* renamed from: n, reason: collision with root package name */
    public final long f4353n;

    /* renamed from: u, reason: collision with root package name */
    public final int f4354u;

    /* renamed from: v, reason: collision with root package name */
    public int f4355v = 0;

    public C0443b(long j6, int i) {
        this.f4353n = j6;
        this.f4354u = i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(k6.e eVar, Object obj) {
        if (obj == null) {
            return null;
        }
        this.f4355v++;
        if (size() < this.f4353n || containsKey(eVar)) {
            return super.put(eVar, AbstractC0422a.f(this.f4354u, obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sb = new StringBuilder("AttributesMap{data=");
        sb.append(super.toString());
        sb.append(", capacity=");
        sb.append(this.f4353n);
        sb.append(", totalAddedValues=");
        return y.q(sb, this.f4355v, '}');
    }
}
