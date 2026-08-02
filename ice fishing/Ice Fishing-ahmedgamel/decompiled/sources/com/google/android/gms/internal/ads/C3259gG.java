package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.gG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3259gG {

    /* renamed from: b, reason: collision with root package name */
    public static final C3259gG f31317b = new C3259gG();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f31318a = new AtomicReference(new C3958tG(new S0.l(23)));

    public final synchronized void a(C3797qG c3797qG) {
        AtomicReference atomicReference = this.f31318a;
        S0.l lVar = new S0.l((C3958tG) atomicReference.get());
        lVar.L(c3797qG);
        atomicReference.set(new C3958tG(lVar));
    }

    public final synchronized void b(InterfaceC4066vG interfaceC4066vG) {
        AtomicReference atomicReference = this.f31318a;
        S0.l lVar = new S0.l((C3958tG) atomicReference.get());
        Class c9 = interfaceC4066vG.c();
        HashMap hashMap = (HashMap) lVar.f2927v;
        if (hashMap.containsKey(c9)) {
            InterfaceC4066vG interfaceC4066vG2 = (InterfaceC4066vG) hashMap.get(c9);
            if (!interfaceC4066vG2.equals(interfaceC4066vG) || !interfaceC4066vG.equals(interfaceC4066vG2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(c9.toString()));
            }
        } else {
            hashMap.put(c9, interfaceC4066vG);
        }
        atomicReference.set(new C3958tG(lVar));
    }
}
