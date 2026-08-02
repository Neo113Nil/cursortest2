package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ds, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3126ds implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30642a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30643b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30644c;

    public /* synthetic */ C3126ds(int i, Object obj, boolean z6) {
        this.f30642a = i;
        this.f30643b = obj;
        this.f30644c = z6;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final void a(Object obj) {
        switch (this.f30642a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                String str = (String) this.f30643b;
                if (str != null) {
                    Bundle b9 = MA.b("pii", bundle);
                    b9.putString("afai", str);
                    b9.putBoolean("is_afai_lat", this.f30644c);
                    break;
                }
                break;
            case 1:
                Bundle bundle2 = (Bundle) obj;
                bundle2.putString("gct", (String) this.f30643b);
                if (this.f30644c) {
                    bundle2.putString(com.anythink.expressad.video.dynview.a.a.f21885U, "1");
                    break;
                }
                break;
            default:
                Bundle bundle3 = (Bundle) obj;
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33136r6)).booleanValue()) {
                    bundle3.putBoolean("app_switched", this.f30644c);
                }
                s2.i1 i1Var = (s2.i1) this.f30643b;
                if (i1Var != null) {
                    int i = i1Var.f40476n;
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
