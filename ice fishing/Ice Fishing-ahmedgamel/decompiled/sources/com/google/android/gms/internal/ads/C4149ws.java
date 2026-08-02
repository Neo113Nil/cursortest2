package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ws, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4149ws implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35677a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f35678b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f35679c;

    /* renamed from: d, reason: collision with root package name */
    public final String f35680d;

    public C4149ws(String str, Bundle bundle, String str2) {
        this.f35678b = str;
        this.f35679c = bundle;
        this.f35680d = str2;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        switch (this.f35677a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                bundle.putString("consent_string", this.f35678b);
                bundle.putString("fc_consent", this.f35680d);
                Bundle bundle2 = this.f35679c;
                if (bundle2 != null) {
                    bundle.putBundle("iab_consent_info", bundle2);
                    break;
                }
                break;
            default:
                Bundle bundle3 = (Bundle) obj;
                bundle3.putString("rtb", this.f35678b);
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32997c5)).booleanValue()) {
                    String str = this.f35680d;
                    if (!str.isEmpty()) {
                        bundle3.putString("cld_status", str);
                    }
                }
                Bundle bundle4 = this.f35679c;
                if (!bundle4.isEmpty()) {
                    bundle3.putBundle("adapter_initialization_status", bundle4);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ C4149ws(String str, String str2, Bundle bundle) {
        this.f35678b = str;
        this.f35680d = str2;
        this.f35679c = bundle;
    }
}
