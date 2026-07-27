package Z5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;
import kotlin.jvm.internal.h;
import r7.AbstractC4974e;
import r7.C4985p;

/* loaded from: classes2.dex */
public final class d extends AbstractC4974e implements RandomAccess, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final C4985p f4278n;

    /* renamed from: u, reason: collision with root package name */
    public Object f4279u;

    public d() {
        C4985p c4985p = C4985p.f40358n;
        this.f4278n = c4985p;
        this.f4279u = c4985p;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // r7.AbstractC4974e
    public final int a() {
        return this.f4279u.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        Object obj2 = this.f4279u;
        C4985p c4985p = this.f4278n;
        if (obj2 == c4985p) {
            this.f4279u = new ArrayList(c4985p);
        }
        Object obj3 = this.f4279u;
        h.c(obj3, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        ((ArrayList) obj3).add(i, obj);
    }

    @Override // r7.AbstractC4974e
    public final Object c(int i) {
        Object obj = this.f4279u;
        C4985p c4985p = this.f4278n;
        if (obj == c4985p) {
            this.f4279u = new ArrayList(c4985p);
        }
        Object obj2 = this.f4279u;
        h.c(obj2, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return ((ArrayList) obj2).remove(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f4279u.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.f4279u;
        C4985p c4985p = this.f4278n;
        if (obj2 == c4985p) {
            this.f4279u = new ArrayList(c4985p);
        }
        Object obj3 = this.f4279u;
        h.c(obj3, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return ((ArrayList) obj3).set(i, obj);
    }
}
