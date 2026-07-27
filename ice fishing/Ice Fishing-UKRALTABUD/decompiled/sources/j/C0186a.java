package j;

import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186a implements Iterable {

    /* renamed from: f, reason: collision with root package name */
    public final WeakHashMap f2629f = new WeakHashMap();

    public C0186a() {
        new HashMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0186a)) {
            return false;
        }
        C0186a c0186a = (C0186a) obj;
        c0186a.getClass();
        iterator();
        c0186a.iterator();
        return true;
    }

    public final int hashCode() {
        iterator();
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0187b c0187b = new C0187b();
        this.f2629f.put(c0187b, Boolean.FALSE);
        return c0187b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        iterator();
        sb.append("]");
        return sb.toString();
    }
}
