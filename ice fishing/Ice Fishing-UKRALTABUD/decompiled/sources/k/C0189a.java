package k;

import D.C0013n;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0189a extends i implements Map {

    /* renamed from: m, reason: collision with root package name */
    public C0013n f2630m;

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f2630m == null) {
            this.f2630m = new C0013n(this);
        }
        C0013n c0013n = this.f2630m;
        if (((f) c0013n.f242a) == null) {
            c0013n.f242a = new f(c0013n, 0);
        }
        return (f) c0013n.f242a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f2630m == null) {
            this.f2630m = new C0013n(this);
        }
        C0013n c0013n = this.f2630m;
        if (((f) c0013n.f243b) == null) {
            c0013n.f243b = new f(c0013n, 1);
        }
        return (f) c0013n.f243b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f2661h;
        int i2 = this.f2661h;
        int[] iArr = this.f2659f;
        if (iArr.length < size) {
            Object[] objArr = this.f2660g;
            a(size);
            if (this.f2661h > 0) {
                System.arraycopy(iArr, 0, this.f2659f, 0, i2);
                System.arraycopy(objArr, 0, this.f2660g, 0, i2 << 1);
            }
            i.b(iArr, objArr, i2);
        }
        if (this.f2661h != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f2630m == null) {
            this.f2630m = new C0013n(this);
        }
        C0013n c0013n = this.f2630m;
        if (((h) c0013n.f244c) == null) {
            c0013n.f244c = new h(c0013n);
        }
        return (h) c0013n.f244c;
    }
}
