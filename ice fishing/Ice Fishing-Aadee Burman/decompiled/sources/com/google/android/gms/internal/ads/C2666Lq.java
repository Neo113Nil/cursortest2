package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Lq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2666Lq implements InterfaceC3423jq {

    /* renamed from: a, reason: collision with root package name */
    public final C2748Qn f26179a;

    public C2666Lq(C2748Qn c2748Qn) {
        this.f26179a = c2748Qn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3423jq
    public final C3477kq a(String str, JSONObject jSONObject) {
        return new C3477kq(this.f26179a.a(str, jSONObject), new BinderC2564Fq(), str);
    }
}
