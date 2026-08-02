package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import s2.InterfaceC4919a;
import v2.InterfaceC5097a;

/* renamed from: com.google.android.gms.internal.ads.mc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3594mc implements InterfaceC5097a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f33213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f33214b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4919a f33215c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap f33216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Map f33217e;

    public C3594mc(C3648nc c3648nc, boolean z6, InterfaceC4919a interfaceC4919a, HashMap hashMap, Map map) {
        this.f33214b = z6;
        this.f33215c = interfaceC4919a;
        this.f33216d = hashMap;
        this.f33217e = map;
        Objects.requireNonNull(c3648nc);
        this.f33213a = false;
    }

    @Override // v2.InterfaceC5097a
    public final void e0(boolean z6) {
        if (this.f33213a) {
            return;
        }
        InterfaceC4919a interfaceC4919a = this.f33215c;
        if (z6 && this.f33214b) {
            ((InterfaceC2579Fl) interfaceC4919a).D();
        }
        this.f33213a = true;
        String str = (String) this.f33217e.get("event_id");
        Boolean valueOf = Boolean.valueOf(z6);
        HashMap hashMap = this.f33216d;
        hashMap.put(str, valueOf);
        ((InterfaceC2672Lc) interfaceC4919a).d("openIntentAsync", hashMap);
    }

    @Override // v2.InterfaceC5097a
    public final void x(int i) {
    }
}
