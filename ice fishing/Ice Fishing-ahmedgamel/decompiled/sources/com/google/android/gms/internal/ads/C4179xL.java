package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.xL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4179xL {

    /* renamed from: c, reason: collision with root package name */
    public static final C4179xL f35771c = new C4179xL();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f35773b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final C3680o7 f35772a = new C3680o7();

    public final DL a(Class cls) {
        DL c3963tL;
        ConcurrentHashMap concurrentHashMap = this.f35773b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (DL) obj;
        }
        C3680o7 c3680o7 = this.f35772a;
        c3680o7.getClass();
        V2 v22 = EL.f25343a;
        if (!VK.class.isAssignableFrom(cls)) {
            int i = BK.f24648a;
        }
        int i4 = BK.f24648a;
        C4287zL e9 = ((C4042ut) c3680o7.f33649u).e(cls);
        boolean z6 = (e9.f36101d & 2) == 2;
        XJ xj = AbstractC2792Sd.J;
        if (z6) {
            c3963tL = new C3963tL(EL.f25343a, e9.f36098a);
        } else {
            int i6 = AbstractC4017uL.f35299a;
            int i9 = AbstractC3478kL.f32197a;
            V2 v23 = EL.f25343a;
            if (e9.a() - 1 == 1) {
                xj = null;
            }
            int i10 = AbstractC3694oL.f33682a;
            c3963tL = C3855rL.z(e9, v23, xj);
        }
        DL dl = (DL) concurrentHashMap.putIfAbsent(cls, c3963tL);
        return dl != null ? dl : c3963tL;
    }
}
