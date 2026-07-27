package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.kG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3463kG {

    /* renamed from: b, reason: collision with root package name */
    public static final C3463kG f32285b = new C3463kG();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f32286a = new AtomicReference(new C4218yG(new C2593Hm(29)));

    public final synchronized void a(C4002uG c4002uG) {
        AtomicReference atomicReference = this.f32286a;
        C2593Hm c2593Hm = new C2593Hm((C4218yG) atomicReference.get());
        c2593Hm.f(c4002uG);
        atomicReference.set(new C4218yG(c2593Hm));
    }

    public final synchronized void b(AG ag) {
        AtomicReference atomicReference = this.f32286a;
        C2593Hm c2593Hm = new C2593Hm((C4218yG) atomicReference.get());
        Class a9 = ag.a();
        HashMap hashMap = (HashMap) c2593Hm.f25416u;
        if (hashMap.containsKey(a9)) {
            AG ag2 = (AG) hashMap.get(a9);
            if (!ag2.equals(ag) || !ag.equals(ag2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(a9.toString()));
            }
        } else {
            hashMap.put(a9, ag);
        }
        atomicReference.set(new C4218yG(c2593Hm));
    }
}
