package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.eG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3151eG {

    /* renamed from: b, reason: collision with root package name */
    public static final C3151eG f30697b = new C3151eG();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f30698a = new ConcurrentHashMap();

    public final void a(InterfaceC3098dG interfaceC3098dG, Class cls) {
        InterfaceC3098dG interfaceC3098dG2 = (InterfaceC3098dG) this.f30698a.putIfAbsent(cls, interfaceC3098dG);
        if (interfaceC3098dG2 != null && !interfaceC3098dG2.equals(interfaceC3098dG)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
    }
}
