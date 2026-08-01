package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.eG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3128eG {

    /* renamed from: b, reason: collision with root package name */
    public static final C3128eG f29905b = new C3128eG();

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f29906a = new ConcurrentHashMap();

    public final void a(InterfaceC3075dG interfaceC3075dG, Class cls) {
        InterfaceC3075dG interfaceC3075dG2 = (InterfaceC3075dG) this.f29906a.putIfAbsent(cls, interfaceC3075dG);
        if (interfaceC3075dG2 != null && !interfaceC3075dG2.equals(interfaceC3075dG)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
    }
}
