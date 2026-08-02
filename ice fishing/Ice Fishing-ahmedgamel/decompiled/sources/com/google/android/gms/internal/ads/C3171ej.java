package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ej, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3171ej implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30757a;

    /* renamed from: b, reason: collision with root package name */
    public final C2696Mj f30758b;

    public /* synthetic */ C3171ej(C2696Mj c2696Mj, int i) {
        this.f30757a = i;
        this.f30758b = c2696Mj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final /* bridge */ /* synthetic */ Object f() {
        switch (this.f30757a) {
            case 0:
                try {
                    return new JSONObject(this.f30758b.a().f28437z);
                } catch (JSONException unused) {
                    return null;
                }
            default:
                return new C4197xm(this.f30758b.a());
        }
    }
}
