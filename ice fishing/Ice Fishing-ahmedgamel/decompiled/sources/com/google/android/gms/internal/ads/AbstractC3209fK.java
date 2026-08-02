package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.fK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3209fK implements InterfaceC4064vE {

    /* renamed from: a, reason: collision with root package name */
    public static final S0.e f31030a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f31031b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f31032c;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ZJ zj = ZJ.f29650n;
        C3961tJ c3961tJ = C3961tJ.f35045b;
        hashMap.put(zj, c3961tJ);
        hashMap2.put(c3961tJ, zj);
        ZJ zj2 = ZJ.f29651u;
        C3961tJ c3961tJ2 = C3961tJ.f35046c;
        hashMap.put(zj2, c3961tJ2);
        hashMap2.put(c3961tJ2, zj2);
        ZJ zj3 = ZJ.f29652v;
        C3961tJ c3961tJ3 = C3961tJ.f35047d;
        hashMap.put(zj3, c3961tJ3);
        hashMap2.put(c3961tJ3, zj3);
        f31030a = new S0.e(26, Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
        f31031b = new byte[0];
        f31032c = new byte[]{0};
    }
}
