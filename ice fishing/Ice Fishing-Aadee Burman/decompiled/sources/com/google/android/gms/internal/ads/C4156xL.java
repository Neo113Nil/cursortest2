package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.xL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4156xL {

    /* renamed from: c, reason: collision with root package name */
    public static final C4156xL f34990c = new C4156xL();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f34992b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C3657o7 f34991a = new C3657o7();

    public final DL a(Class cls) {
        DL c3940tL;
        ConcurrentHashMap concurrentHashMap = this.f34992b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (DL) obj;
        }
        C3657o7 c3657o7 = this.f34991a;
        c3657o7.getClass();
        V2 v22 = EL.f24582a;
        if (!VK.class.isAssignableFrom(cls)) {
            int i = BK.f23877a;
        }
        int i6 = BK.f23877a;
        C4264zL e9 = ((C4019ut) c3657o7.f32862u).e(cls);
        boolean z3 = (e9.f35317d & 2) == 2;
        XJ xj = AbstractC2772Sd.J;
        if (z3) {
            c3940tL = new C3940tL(EL.f24582a, e9.f35314a);
        } else {
            int i9 = AbstractC3994uL.f34525a;
            int i10 = AbstractC3455kL.f31418a;
            V2 v23 = EL.f24582a;
            if (e9.a() - 1 == 1) {
                xj = null;
            }
            int i11 = AbstractC3671oL.f32895a;
            c3940tL = C3832rL.z(e9, v23, xj);
        }
        DL dl = (DL) concurrentHashMap.putIfAbsent(cls, c3940tL);
        return dl != null ? dl : c3940tL;
    }
}
