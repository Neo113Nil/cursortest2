package a7;

import D.x;
import java.util.HashMap;

/* renamed from: a7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0447b extends HashMap implements f6.c {

    /* renamed from: n, reason: collision with root package name */
    public final long f4321n;

    /* renamed from: u, reason: collision with root package name */
    public final int f4322u;

    /* renamed from: v, reason: collision with root package name */
    public int f4323v = 0;

    public C0447b(long j6, int i) {
        this.f4321n = j6;
        this.f4322u = i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(k6.e eVar, Object obj) {
        if (obj == null) {
            return null;
        }
        this.f4323v++;
        if (size() < this.f4321n || containsKey(eVar)) {
            return super.put(eVar, com.bumptech.glide.d.b(this.f4322u, obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sb = new StringBuilder("AttributesMap{data=");
        sb.append(super.toString());
        sb.append(", capacity=");
        sb.append(this.f4321n);
        sb.append(", totalAddedValues=");
        return x.n(sb, this.f4323v, '}');
    }
}
