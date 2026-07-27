package k;

import D.C0013n;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189a extends i implements Map {

    /* renamed from: l, reason: collision with root package name */
    public C0013n f2638l;

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f2638l == null) {
            this.f2638l = new C0013n(this);
        }
        C0013n c0013n = this.f2638l;
        if (((f) c0013n.f243a) == null) {
            c0013n.f243a = new f(c0013n, 0);
        }
        return (f) c0013n.f243a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f2638l == null) {
            this.f2638l = new C0013n(this);
        }
        C0013n c0013n = this.f2638l;
        if (((f) c0013n.f244b) == null) {
            c0013n.f244b = new f(c0013n, 1);
        }
        return (f) c0013n.f244b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f2669g;
        int i2 = this.f2669g;
        int[] iArr = this.f2667e;
        if (iArr.length < size) {
            Object[] objArr = this.f2668f;
            a(size);
            if (this.f2669g > 0) {
                System.arraycopy(iArr, 0, this.f2667e, 0, i2);
                System.arraycopy(objArr, 0, this.f2668f, 0, i2 << 1);
            }
            i.b(iArr, objArr, i2);
        }
        if (this.f2669g != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f2638l == null) {
            this.f2638l = new C0013n(this);
        }
        C0013n c0013n = this.f2638l;
        if (((h) c0013n.f245c) == null) {
            c0013n.f245c = new h(c0013n);
        }
        return (h) c0013n.f245c;
    }
}
