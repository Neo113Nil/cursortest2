package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Nc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2686Nc implements InterfaceC3249gc {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC3249gc f26503n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2720Pc f26504u;

    public C2686Nc(C2720Pc c2720Pc, InterfaceC3249gc interfaceC3249gc) {
        Objects.requireNonNull(c2720Pc);
        this.f26504u = c2720Pc;
        this.f26503n = interfaceC3249gc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3249gc
    public final /* bridge */ /* synthetic */ void e(Object obj, Map map) {
        this.f26503n.e(this.f26504u, map);
    }
}
