package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.iG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3357iG {

    /* renamed from: b, reason: collision with root package name */
    public static final C3357iG f31327b = new C3357iG();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f31328a = new ConcurrentHashMap();

    public final void a(InterfaceC3303hG interfaceC3303hG, Class cls) {
        InterfaceC3303hG interfaceC3303hG2 = (InterfaceC3303hG) this.f31328a.putIfAbsent(cls, interfaceC3303hG);
        if (interfaceC3303hG2 != null && !interfaceC3303hG2.equals(interfaceC3303hG)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
    }
}
