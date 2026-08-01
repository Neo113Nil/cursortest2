package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.oc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3679oc implements InterfaceC3733pc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32913a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3467kg f32914b;

    public C3679oc(C3088dc c3088dc, C3467kg c3467kg) {
        this.f32914b = c3467kg;
        Objects.requireNonNull(c3088dc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3733pc
    public final void b(JSONObject jSONObject) {
        switch (this.f32913a) {
            case 0:
                this.f32914b.b(jSONObject);
                break;
            default:
                C3467kg c3467kg = this.f32914b;
                try {
                    c3467kg.b(jSONObject);
                    break;
                } catch (IllegalStateException unused) {
                    return;
                } catch (JSONException e9) {
                    c3467kg.c(e9);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3733pc
    public final void z(String str) {
        switch (this.f32913a) {
            case 0:
                this.f32914b.c(new L2.m(str));
                break;
            default:
                C3467kg c3467kg = this.f32914b;
                try {
                    if (str == null) {
                        c3467kg.c(new L2.m());
                    } else {
                        c3467kg.c(new L2.m(str));
                    }
                    break;
                } catch (IllegalStateException unused) {
                    return;
                }
        }
    }

    public C3679oc(C3304hd c3304hd, C3467kg c3467kg) {
        Objects.requireNonNull(c3304hd);
        this.f32914b = c3467kg;
    }
}
