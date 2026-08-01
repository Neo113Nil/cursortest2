package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ws, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4126ws implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34896a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f34897b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f34898c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34899d;

    public C4126ws(String str, Bundle bundle, String str2) {
        this.f34897b = str;
        this.f34898c = bundle;
        this.f34899d = str2;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        switch (this.f34896a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                bundle.putString("consent_string", this.f34897b);
                bundle.putString("fc_consent", this.f34899d);
                Bundle bundle2 = this.f34898c;
                if (bundle2 != null) {
                    bundle.putBundle("iab_consent_info", bundle2);
                    break;
                }
                break;
            default:
                Bundle bundle3 = (Bundle) obj;
                bundle3.putString("rtb", this.f34897b);
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32218c5)).booleanValue()) {
                    String str = this.f34899d;
                    if (!str.isEmpty()) {
                        bundle3.putString("cld_status", str);
                    }
                }
                Bundle bundle4 = this.f34898c;
                if (!bundle4.isEmpty()) {
                    bundle3.putBundle("adapter_initialization_status", bundle4);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ C4126ws(String str, String str2, Bundle bundle) {
        this.f34897b = str;
        this.f34899d = str2;
        this.f34898c = bundle;
    }
}
