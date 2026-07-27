package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.gG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3236gG {

    /* renamed from: b, reason: collision with root package name */
    public static final C3236gG f30551b = new C3236gG();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f30552a = new AtomicReference(new C3935tG(new S0.l(20)));

    public final synchronized void a(C3774qG c3774qG) {
        AtomicReference atomicReference = this.f30552a;
        S0.l lVar = new S0.l((C3935tG) atomicReference.get());
        lVar.L(c3774qG);
        atomicReference.set(new C3935tG(lVar));
    }

    public final synchronized void b(InterfaceC4043vG interfaceC4043vG) {
        AtomicReference atomicReference = this.f30552a;
        S0.l lVar = new S0.l((C3935tG) atomicReference.get());
        Class c9 = interfaceC4043vG.c();
        HashMap hashMap = (HashMap) lVar.f2798v;
        if (hashMap.containsKey(c9)) {
            InterfaceC4043vG interfaceC4043vG2 = (InterfaceC4043vG) hashMap.get(c9);
            if (!interfaceC4043vG2.equals(interfaceC4043vG) || !interfaceC4043vG.equals(interfaceC4043vG2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(c9.toString()));
            }
        } else {
            hashMap.put(c9, interfaceC4043vG);
        }
        atomicReference.set(new C3935tG(lVar));
    }
}
