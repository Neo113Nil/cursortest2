package com.google.android.gms.internal.ads;

import O2.C0361k;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.fK, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3186fK implements InterfaceC4041vE {

    /* renamed from: a, reason: collision with root package name */
    public static final C0361k f30243a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f30244b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f30245c;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ZJ zj = ZJ.f28870n;
        C3938tJ c3938tJ = C3938tJ.f34259b;
        hashMap.put(zj, c3938tJ);
        hashMap2.put(c3938tJ, zj);
        ZJ zj2 = ZJ.f28871u;
        C3938tJ c3938tJ2 = C3938tJ.f34260c;
        hashMap.put(zj2, c3938tJ2);
        hashMap2.put(c3938tJ2, zj2);
        ZJ zj3 = ZJ.f28872v;
        C3938tJ c3938tJ3 = C3938tJ.f34261d;
        hashMap.put(zj3, c3938tJ3);
        hashMap2.put(c3938tJ3, zj3);
        f30243a = new C0361k(Collections.unmodifiableMap(hashMap), Collections.unmodifiableMap(hashMap2));
        f30244b = new byte[0];
        f30245c = new byte[]{0};
    }
}
