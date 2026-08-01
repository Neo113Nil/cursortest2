package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.Zc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2883Zc implements InterfaceC2669Mc, InterfaceC2867Yc {

    /* renamed from: n, reason: collision with root package name */
    public final C2720Pc f28892n;

    /* renamed from: u, reason: collision with root package name */
    public final HashSet f28893u = new HashSet();

    public C2883Zc(C2720Pc c2720Pc) {
        this.f28892n = c2720Pc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2669Mc, com.google.android.gms.internal.ads.InterfaceC2737Qc
    public final void b(String str) {
        this.f28892n.b(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2867Yc
    public final void h(String str, InterfaceC3249gc interfaceC3249gc) {
        this.f28892n.h(str, interfaceC3249gc);
        this.f28893u.remove(new AbstractMap.SimpleEntry(str, interfaceC3249gc));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2867Yc
    public final void i(String str, InterfaceC3249gc interfaceC3249gc) {
        this.f28892n.i(str, interfaceC3249gc);
        this.f28893u.add(new AbstractMap.SimpleEntry(str, interfaceC3249gc));
    }
}
