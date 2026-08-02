package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.jJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3422jJ implements InterfaceC4066vG {

    /* renamed from: a, reason: collision with root package name */
    public static final C3422jJ f32011a = new C3422jJ();

    /* renamed from: b, reason: collision with root package name */
    public static final C3797qG f32012b = new C3797qG(ZF.class, InterfaceC4010uE.class, C3903sF.f34718W);

    @Override // com.google.android.gms.internal.ads.InterfaceC4066vG
    public final Object a(S0.l lVar, S0.s sVar) {
        if (((HashMap) lVar.f2927v).get(AbstractC2991bG.class) != null) {
            throw new ClassCastException();
        }
        lVar.N();
        return new EJ();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4066vG
    public final Class c() {
        return InterfaceC4010uE.class;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4066vG
    public final Class f() {
        return InterfaceC4010uE.class;
    }
}
