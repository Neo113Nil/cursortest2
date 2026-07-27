package W6;

import D.y;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class b extends HashMap implements b6.c {

    /* renamed from: n, reason: collision with root package name */
    public final long f3464n;

    /* renamed from: u, reason: collision with root package name */
    public final int f3465u;

    /* renamed from: v, reason: collision with root package name */
    public int f3466v = 0;

    public b(long j9, int i) {
        this.f3464n = j9;
        this.f3465u = i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(g6.e eVar, Object obj) {
        if (obj == null) {
            return null;
        }
        this.f3466v++;
        if (size() < this.f3464n || containsKey(eVar)) {
            return super.put(eVar, p8.g.b(this.f3465u, obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sb = new StringBuilder("AttributesMap{data=");
        sb.append(super.toString());
        sb.append(", capacity=");
        sb.append(this.f3464n);
        sb.append(", totalAddedValues=");
        return y.m(sb, this.f3466v, '}');
    }
}
