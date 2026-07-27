package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.jc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3422jc implements InterfaceC3476kc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32117a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C3320hg f32118b;

    public C3422jc(C2871Yb c2871Yb, C3320hg c3320hg) {
        this.f32118b = c3320hg;
        Objects.requireNonNull(c2871Yb);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3476kc
    public final void b(String str) {
        switch (this.f32117a) {
            case 0:
                this.f32118b.b(new K2.m(str));
                break;
            default:
                C3320hg c3320hg = this.f32118b;
                try {
                    if (str == null) {
                        c3320hg.b(new K2.m());
                    } else {
                        c3320hg.b(new K2.m(str));
                    }
                    break;
                } catch (IllegalStateException unused) {
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3476kc
    public final void c(JSONObject jSONObject) {
        switch (this.f32117a) {
            case 0:
                this.f32118b.a(jSONObject);
                break;
            default:
                C3320hg c3320hg = this.f32118b;
                try {
                    c3320hg.a(jSONObject);
                    break;
                } catch (IllegalStateException unused) {
                    return;
                } catch (JSONException e6) {
                    c3320hg.b(e6);
                }
        }
    }

    public C3422jc(C3154ed c3154ed, C3320hg c3320hg) {
        Objects.requireNonNull(c3154ed);
        this.f32118b = c3320hg;
    }
}
