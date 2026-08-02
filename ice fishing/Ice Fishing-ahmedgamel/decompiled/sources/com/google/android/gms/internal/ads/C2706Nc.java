package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Nc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2706Nc implements InterfaceC3272gc {

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC3272gc f27286n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2740Pc f27287u;

    public C2706Nc(C2740Pc c2740Pc, InterfaceC3272gc interfaceC3272gc) {
        Objects.requireNonNull(c2740Pc);
        this.f27287u = c2740Pc;
        this.f27286n = interfaceC3272gc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3272gc
    public final /* bridge */ /* synthetic */ void e(Object obj, Map map) {
        this.f27286n.e(this.f27287u, map);
    }
}
