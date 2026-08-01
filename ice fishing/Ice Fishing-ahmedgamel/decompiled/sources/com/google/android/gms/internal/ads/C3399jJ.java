package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.jJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3399jJ implements InterfaceC4043vG {

    /* renamed from: a, reason: collision with root package name */
    public static final C3399jJ f31224a = new C3399jJ();

    /* renamed from: b, reason: collision with root package name */
    public static final C3774qG f31225b = new C3774qG(ZF.class, InterfaceC3987uE.class, C3880sF.f33950W);

    @Override // com.google.android.gms.internal.ads.InterfaceC4043vG
    public final Object a(S0.l lVar, S0.s sVar) {
        if (((HashMap) lVar.f2798v).get(AbstractC2968bG.class) != null) {
            throw new ClassCastException();
        }
        lVar.N();
        return new EJ();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4043vG
    public final Class c() {
        return InterfaceC3987uE.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4043vG
    public final Class f() {
        return InterfaceC3987uE.class;
    }
}
