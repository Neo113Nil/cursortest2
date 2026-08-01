package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ej, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3148ej implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29966a;

    /* renamed from: b, reason: collision with root package name */
    public final C2676Mj f29967b;

    public /* synthetic */ C3148ej(C2676Mj c2676Mj, int i) {
        this.f29966a = i;
        this.f29967b = c2676Mj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final /* bridge */ /* synthetic */ Object f() {
        switch (this.f29966a) {
            case 0:
                try {
                    return new JSONObject(this.f29967b.a().f27654z);
                } catch (JSONException unused) {
                    return null;
                }
            default:
                return new C4120wm(this.f29967b.a());
        }
    }
}
