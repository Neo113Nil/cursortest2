package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ds, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3103ds implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29854a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f29855b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29856c;

    public /* synthetic */ C3103ds(int i, Object obj, boolean z3) {
        this.f29854a = i;
        this.f29855b = obj;
        this.f29856c = z3;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        switch (this.f29854a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                String str = (String) this.f29855b;
                if (str != null) {
                    Bundle b9 = MA.b("pii", bundle);
                    b9.putString("afai", str);
                    b9.putBoolean("is_afai_lat", this.f29856c);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = (Bundle) obj;
                bundle2.putString("gct", (String) this.f29855b);
                if (this.f29856c) {
                    bundle2.putString(com.anythink.expressad.video.dynview.a.a.f21098U, "1");
                    break;
                }
                break;
            default:
                Bundle bundle3 = (Bundle) obj;
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32357r6)).booleanValue()) {
                    bundle3.putBoolean("app_switched", this.f29856c);
                }
                q2.i1 i1Var = (q2.i1) this.f29855b;
                if (i1Var != null) {
                    int i = i1Var.f40174n;
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
