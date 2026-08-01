package com.google.android.gms.internal.ads;

import org.json.JSONObject;
import p2.C4826a;

/* renamed from: com.google.android.gms.internal.ads.hm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3313hm implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30928a;

    /* renamed from: b, reason: collision with root package name */
    public final C2570Gf f30929b;

    public /* synthetic */ C3313hm(C2570Gf c2570Gf, int i) {
        this.f30928a = i;
        this.f30929b = c2570Gf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        switch (this.f30928a) {
            case 0:
                JSONObject jSONObject = (JSONObject) this.f30929b.f25042u;
                AbstractC3341iD.j(jSONObject);
                return jSONObject;
            case 1:
                C3959tn c3959tn = (C3959tn) this.f30929b.f25043v;
                AbstractC3341iD.j(c3959tn);
                return c3959tn;
            case 2:
                return (C4826a) this.f30929b.f25044w;
            default:
                return (C4221yf) this.f30929b.f25045x;
        }
    }
}
