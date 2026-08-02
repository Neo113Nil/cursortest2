package com.google.android.gms.internal.ads;

import org.json.JSONObject;
import r2.C4896a;

/* renamed from: com.google.android.gms.internal.ads.im, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3389im implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31885a;

    /* renamed from: b, reason: collision with root package name */
    public final C2590Gf f31886b;

    public /* synthetic */ C3389im(C2590Gf c2590Gf, int i) {
        this.f31885a = i;
        this.f31886b = c2590Gf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        switch (this.f31885a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.f31886b.f25830u;
                AbstractC3364iD.j(jSONObject);
                return jSONObject;
            case 1:
                C4036un c4036un = (C4036un) this.f31886b.f25831v;
                AbstractC3364iD.j(c4036un);
                return c4036un;
            case 2:
                return (C4896a) this.f31886b.f25832w;
            default:
                return (C4244yf) this.f31886b.f25833x;
        }
    }
}
