package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ed, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3165ed implements InterfaceC3756pc {

    /* renamed from: a, reason: collision with root package name */
    public final C2858Wc f30740a;

    /* renamed from: b, reason: collision with root package name */
    public final C3490kg f30741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3219fd f30742c;

    public C3165ed(C2858Wc c2858Wc, C3219fd c3219fd, C3490kg c3490kg) {
        Objects.requireNonNull(c3219fd);
        this.f30742c = c3219fd;
        this.f30740a = c2858Wc;
        this.f30741b = c3490kg;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3756pc
    public final void b(JSONObject jSONObject) {
        C2858Wc c2858Wc = this.f30740a;
        C3490kg c3490kg = this.f30741b;
        try {
            try {
                c3490kg.b(((InterfaceC2951ad) this.f30742c.f31065c).b(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e9) {
                c3490kg.c(e9);
            }
        } finally {
            c2858Wc.s();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3756pc
    public final void z(String str) {
        C3490kg c3490kg = this.f30741b;
        C2858Wc c2858Wc = this.f30740a;
        try {
            if (str == null) {
                c3490kg.c(new N2.n());
            } else {
                c3490kg.c(new N2.n(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            c2858Wc.s();
            throw th;
        }
        c2858Wc.s();
    }
}
