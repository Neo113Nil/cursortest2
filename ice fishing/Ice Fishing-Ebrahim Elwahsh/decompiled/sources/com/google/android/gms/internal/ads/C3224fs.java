package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.fs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3224fs implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30894a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30895b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30896c;

    public /* synthetic */ C3224fs(int i, Object obj, boolean z8) {
        this.f30894a = i;
        this.f30895b = obj;
        this.f30896c = z8;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final void b(Object obj) {
        switch (this.f30894a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                String str = (String) this.f30895b;
                if (str != null) {
                    Bundle b9 = AbstractC2720Pd.b("pii", bundle);
                    b9.putString("afai", str);
                    b9.putBoolean("is_afai_lat", this.f30896c);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = (Bundle) obj;
                bundle2.putString("gct", (String) this.f30895b);
                if (this.f30896c) {
                    bundle2.putString(com.anythink.expressad.video.dynview.a.a.f21256U, "1");
                    break;
                }
                break;
            default:
                Bundle bundle3 = (Bundle) obj;
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31776r6)).booleanValue()) {
                    bundle3.putBoolean("app_switched", this.f30896c);
                }
                q2.j1 j1Var = (q2.j1) this.f30895b;
                if (j1Var != null) {
                    int i = j1Var.f40090n;
                    if (i != 1) {
                        if (i == 2) {
                            bundle3.putString("avo", "l");
                            break;
                        }
                    } else {
                        bundle3.putString("avo", "p");
                        break;
                    }
                }
                break;
        }
    }
}
