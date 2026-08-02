package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.oc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3702oc implements InterfaceC3756pc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33699a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3490kg f33700b;

    public C3702oc(C3111dc c3111dc, C3490kg c3490kg) {
        this.f33700b = c3490kg;
        Objects.requireNonNull(c3111dc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3756pc
    public final void b(JSONObject jSONObject) {
        switch (this.f33699a) {
            case 0:
                this.f33700b.b(jSONObject);
                break;
            default:
                C3490kg c3490kg = this.f33700b;
                try {
                    c3490kg.b(jSONObject);
                    break;
                } catch (IllegalStateException unused) {
                    return;
                } catch (JSONException e9) {
                    c3490kg.c(e9);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3756pc
    public final void z(String str) {
        switch (this.f33699a) {
            case 0:
                this.f33700b.c(new N2.n(str));
                break;
            default:
                C3490kg c3490kg = this.f33700b;
                try {
                    if (str == null) {
                        c3490kg.c(new N2.n());
                    } else {
                        c3490kg.c(new N2.n(str));
                    }
                    break;
                } catch (IllegalStateException unused) {
                    return;
                }
        }
    }

    public C3702oc(C3327hd c3327hd, C3490kg c3490kg) {
        Objects.requireNonNull(c3327hd);
        this.f33700b = c3490kg;
    }
}
