package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ed, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3142ed implements InterfaceC3733pc {

    /* renamed from: a, reason: collision with root package name */
    public final C2835Wc f29949a;

    /* renamed from: b, reason: collision with root package name */
    public final C3467kg f29950b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3196fd f29951c;

    public C3142ed(C2835Wc c2835Wc, C3196fd c3196fd, C3467kg c3467kg) {
        Objects.requireNonNull(c3196fd);
        this.f29951c = c3196fd;
        this.f29949a = c2835Wc;
        this.f29950b = c3467kg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3733pc
    public final void b(JSONObject jSONObject) {
        C2835Wc c2835Wc = this.f29949a;
        C3467kg c3467kg = this.f29950b;
        try {
            try {
                c3467kg.b(((InterfaceC2928ad) this.f29951c.f30277c).b(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e9) {
                c3467kg.c(e9);
            }
        } finally {
            c2835Wc.s();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3733pc
    public final void z(String str) {
        C3467kg c3467kg = this.f29950b;
        C2835Wc c2835Wc = this.f29949a;
        try {
            if (str == null) {
                c3467kg.c(new L2.m());
            } else {
                c3467kg.c(new L2.m(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            c2835Wc.s();
            throw th;
        }
        c2835Wc.s();
    }
}
