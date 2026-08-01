package d6;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;
import kotlin.jvm.internal.h;
import v7.AbstractC5124e;
import v7.C5135p;

/* loaded from: classes2.dex */
public final class d extends AbstractC5124e implements RandomAccess, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final C5135p f37076n;

    /* renamed from: u, reason: collision with root package name */
    public Object f37077u;

    public d() {
        C5135p c5135p = C5135p.f41442n;
        this.f37076n = c5135p;
        this.f37077u = c5135p;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // v7.AbstractC5124e
    public final int a() {
        return this.f37077u.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        Object obj2 = this.f37077u;
        C5135p c5135p = this.f37076n;
        if (obj2 == c5135p) {
            this.f37077u = new ArrayList(c5135p);
        }
        Object obj3 = this.f37077u;
        h.c(obj3, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        ((ArrayList) obj3).add(i, obj);
    }

    @Override // v7.AbstractC5124e
    public final Object c(int i) {
        Object obj = this.f37077u;
        C5135p c5135p = this.f37076n;
        if (obj == c5135p) {
            this.f37077u = new ArrayList(c5135p);
        }
        Object obj2 = this.f37077u;
        h.c(obj2, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return ((ArrayList) obj2).remove(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f37077u.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Object obj2 = this.f37077u;
        C5135p c5135p = this.f37076n;
        if (obj2 == c5135p) {
            this.f37077u = new ArrayList(c5135p);
        }
        Object obj3 = this.f37077u;
        h.c(obj3, "null cannot be cast to non-null type java.util.ArrayList<T of com.squareup.wire.internal.MutableOnWriteList>");
        return ((ArrayList) obj3).set(i, obj);
    }
}
