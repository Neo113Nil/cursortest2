package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.zs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4301zs implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35628a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f35629b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f35630c;

    /* renamed from: d, reason: collision with root package name */
    public final String f35631d;

    public C4301zs(String str, Bundle bundle, String str2) {
        this.f35629b = str;
        this.f35630c = bundle;
        this.f35631d = str2;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final void b(Object obj) {
        switch (this.f35628a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                bundle.putString("consent_string", this.f35629b);
                bundle.putString("fc_consent", this.f35631d);
                Bundle bundle2 = this.f35630c;
                if (bundle2 != null) {
                    bundle.putBundle("iab_consent_info", bundle2);
                    break;
                }
                break;
            default:
                Bundle bundle3 = (Bundle) obj;
                bundle3.putString("rtb", this.f35629b);
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31638c5)).booleanValue()) {
                    String str = this.f35631d;
                    if (!str.isEmpty()) {
                        bundle3.putString("cld_status", str);
                    }
                }
                Bundle bundle4 = this.f35630c;
                if (!bundle4.isEmpty()) {
                    bundle3.putBundle("adapter_initialization_status", bundle4);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ C4301zs(String str, String str2, Bundle bundle) {
        this.f35629b = str;
        this.f35631d = str2;
        this.f35630c = bundle;
    }
}
