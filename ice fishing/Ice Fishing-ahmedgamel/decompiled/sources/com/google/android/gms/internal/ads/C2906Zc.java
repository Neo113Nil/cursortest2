package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.Zc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2906Zc implements InterfaceC2689Mc, InterfaceC2890Yc {

    /* renamed from: n, reason: collision with root package name */
    public final C2740Pc f29669n;

    /* renamed from: u, reason: collision with root package name */
    public final HashSet f29670u = new HashSet();

    public C2906Zc(C2740Pc c2740Pc) {
        this.f29669n = c2740Pc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2689Mc, com.google.android.gms.internal.ads.InterfaceC2757Qc
    public final void b(String str) {
        this.f29669n.b(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2890Yc
    public final void h(String str, InterfaceC3272gc interfaceC3272gc) {
        this.f29669n.h(str, interfaceC3272gc);
        this.f29670u.remove(new AbstractMap.SimpleEntry(str, interfaceC3272gc));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2890Yc
    public final void i(String str, InterfaceC3272gc interfaceC3272gc) {
        this.f29669n.i(str, interfaceC3272gc);
        this.f29670u.add(new AbstractMap.SimpleEntry(str, interfaceC3272gc));
    }
}
