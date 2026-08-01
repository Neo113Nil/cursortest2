package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import q2.InterfaceC4870a;
import t2.InterfaceC5033a;

/* renamed from: com.google.android.gms.internal.ads.mc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3571mc implements InterfaceC5033a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f32433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f32434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4870a f32435c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f32436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f32437e;

    public C3571mc(C3625nc c3625nc, boolean z3, InterfaceC4870a interfaceC4870a, HashMap hashMap, Map map) {
        this.f32434b = z3;
        this.f32435c = interfaceC4870a;
        this.f32436d = hashMap;
        this.f32437e = map;
        Objects.requireNonNull(c3625nc);
        this.f32433a = false;
    }

    @Override // t2.InterfaceC5033a
    public final void e0(boolean z3) {
        if (this.f32433a) {
            return;
        }
        InterfaceC4870a interfaceC4870a = this.f32435c;
        if (z3 && this.f32434b) {
            ((InterfaceC2542El) interfaceC4870a).J();
        }
        this.f32433a = true;
        String str = (String) this.f32437e.get("event_id");
        Boolean valueOf = Boolean.valueOf(z3);
        HashMap hashMap = this.f32436d;
        hashMap.put(str, valueOf);
        ((InterfaceC2652Lc) interfaceC4870a).d("openIntentAsync", hashMap);
    }

    @Override // t2.InterfaceC5033a
    public final void x(int i) {
    }
}
