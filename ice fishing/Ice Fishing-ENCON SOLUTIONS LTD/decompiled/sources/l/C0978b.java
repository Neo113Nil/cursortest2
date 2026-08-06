package l;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map;
import java.util.Set;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0978b extends k implements Map {

    /* renamed from: h, reason: collision with root package name */
    public C0977a f8083h;

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f8083h == null) {
            this.f8083h = new C0977a(0, this);
        }
        C0977a c0977a = this.f8083h;
        if (c0977a.f8078a == null) {
            c0977a.f8078a = new h(c0977a, 0);
        }
        return c0977a.f8078a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f8083h == null) {
            this.f8083h = new C0977a(0, this);
        }
        C0977a c0977a = this.f8083h;
        if (c0977a.f8079b == null) {
            c0977a.f8079b = new h(c0977a, 1);
        }
        return c0977a.f8079b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f8124c;
        int i2 = this.f8124c;
        int[] iArr = this.f8122a;
        if (iArr.length < size) {
            Object[] objArr = this.f8123b;
            a(size);
            if (this.f8124c > 0) {
                System.arraycopy(iArr, 0, this.f8122a, 0, i2);
                System.arraycopy(objArr, 0, this.f8123b, 0, i2 << 1);
            }
            k.b(iArr, objArr, i2);
        }
        if (this.f8124c != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f8083h == null) {
            this.f8083h = new C0977a(0, this);
        }
        C0977a c0977a = this.f8083h;
        if (c0977a.f8080c == null) {
            c0977a.f8080c = new j(c0977a);
        }
        return c0977a.f8080c;
    }
}
