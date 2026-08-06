package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: c, reason: collision with root package name */
    public static final T f2345c = new T();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f2347b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final F f2346a = new F();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.O] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.datastore.preferences.protobuf.O] */
    public final W a(Class cls) {
        C0116p c0116p;
        N x2;
        N n2;
        Class cls2;
        AbstractC0124y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f2347b;
        W w2 = (W) concurrentHashMap.get(cls);
        if (w2 != null) {
            return w2;
        }
        F f2 = this.f2346a;
        f2.getClass();
        Class cls3 = X.f2355a;
        if (!AbstractC0122w.class.isAssignableFrom(cls) && (cls2 = X.f2355a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        V b2 = ((E) f2.f2315a).b(cls);
        if ((b2.f2354d & 2) == 2) {
            boolean isAssignableFrom = AbstractC0122w.class.isAssignableFrom(cls);
            AbstractC0122w abstractC0122w = b2.f2351a;
            if (isAssignableFrom) {
                n2 = new O(X.f2357c, AbstractC0117q.f2432a, abstractC0122w);
            } else {
                e0 e0Var = X.f2356b;
                C0116p c0116p2 = AbstractC0117q.f2433b;
                if (c0116p2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                n2 = new O(e0Var, c0116p2, abstractC0122w);
            }
            x2 = n2;
        } else if (AbstractC0122w.class.isAssignableFrom(cls)) {
            P p2 = Q.f2344b;
            C c2 = D.f2312b;
            e0 e0Var2 = X.f2357c;
            C0116p c0116p3 = H.j.b(b2.d()) != 1 ? AbstractC0117q.f2432a : null;
            J j2 = K.f2323b;
            int[] iArr = N.f2325n;
            if (!(b2 instanceof V)) {
                b2.getClass();
                throw new ClassCastException();
            }
            x2 = N.x(b2, p2, c2, e0Var2, c0116p3, j2);
        } else {
            P p3 = Q.f2343a;
            C c3 = D.f2311a;
            e0 e0Var3 = X.f2356b;
            if (H.j.b(b2.d()) != 1) {
                c0116p = AbstractC0117q.f2433b;
                if (c0116p == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                c0116p = null;
            }
            J j3 = K.f2322a;
            int[] iArr2 = N.f2325n;
            if (!(b2 instanceof V)) {
                b2.getClass();
                throw new ClassCastException();
            }
            x2 = N.x(b2, p3, c3, e0Var3, c0116p, j3);
        }
        W w3 = (W) concurrentHashMap.putIfAbsent(cls, x2);
        return w3 != null ? w3 : x2;
    }
}
