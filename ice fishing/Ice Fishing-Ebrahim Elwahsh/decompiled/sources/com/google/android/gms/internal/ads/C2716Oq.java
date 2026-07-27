package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Oq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2716Oq implements InterfaceC3544lq {

    /* renamed from: a, reason: collision with root package name */
    public final C2781Sn f26765a;

    public C2716Oq(C2781Sn c2781Sn) {
        this.f26765a = c2781Sn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3544lq
    public final C3598mq a(String str, JSONObject jSONObject) {
        return new C3598mq(this.f26765a.a(str, jSONObject), new BinderC2597Hq(), str);
    }
}
