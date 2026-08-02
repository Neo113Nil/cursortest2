package d6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;
import kotlin.jvm.internal.h;
import v7.AbstractC5114e;
import v7.C5125p;

/* loaded from: classes2.dex */
public final class d extends AbstractC5114e implements RandomAccess, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final C5125p f37184n;

    /* renamed from: u, reason: collision with root package name */
    public Object f37185u;

    public d() {
        C5125p c5125p = C5125p.f41221n;
        this.f37184n = c5125p;
        this.f37185u = c5125p;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // v7.AbstractC5114e
    public final int a() {
        return this.f37185u.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        Object obj2 = this.f37185u;
        C5125p c5125p = this.f37184n;
        if (obj2 == c5125p) {
            this.f37185u = new ArrayList(c5125p);
        }
        Object obj3 = this.f37185u;
        h.c(obj3, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        ((ArrayList) obj3).add(i, obj);
    }

    @Override // v7.AbstractC5114e
    public final Object c(int i) {
        Object obj = this.f37185u;
        C5125p c5125p = this.f37184n;
        if (obj == c5125p) {
            this.f37185u = new ArrayList(c5125p);
        }
        Object obj2 = this.f37185u;
        h.c(obj2, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return ((ArrayList) obj2).remove(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f37185u.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.f37185u;
        C5125p c5125p = this.f37184n;
        if (obj2 == c5125p) {
            this.f37185u = new ArrayList(c5125p);
        }
        Object obj3 = this.f37185u;
        h.c(obj3, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return ((ArrayList) obj3).set(i, obj);
    }
}
