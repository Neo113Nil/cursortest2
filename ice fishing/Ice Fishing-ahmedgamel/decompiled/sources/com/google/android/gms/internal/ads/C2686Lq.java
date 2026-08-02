package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Lq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2686Lq implements InterfaceC3446jq {

    /* renamed from: a, reason: collision with root package name */
    public final C2785Rn f26970a;

    public C2686Lq(C2785Rn c2785Rn) {
        this.f26970a = c2785Rn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3446jq
    public final C3500kq a(String str, JSONObject jSONObject) {
        return new C3500kq(this.f26970a.a(str, jSONObject), new BinderC2584Fq(), str);
    }
}
