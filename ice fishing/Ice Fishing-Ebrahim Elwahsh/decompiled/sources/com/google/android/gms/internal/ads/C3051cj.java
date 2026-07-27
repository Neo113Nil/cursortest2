package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.cj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3051cj implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29733a;

    /* renamed from: b, reason: collision with root package name */
    public final C2675Mj f29734b;

    public /* synthetic */ C3051cj(C2675Mj c2675Mj, int i) {
        this.f29733a = i;
        this.f29734b = c2675Mj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.f29733a) {
            case 0:
                try {
                    return new JSONObject(this.f29734b.a().f28187z);
                } catch (JSONException unused) {
                    return null;
                }
            default:
                return new C4025um(this.f29734b.a());
        }
    }
}
