package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Mr implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27137a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27138b;

    public /* synthetic */ Mr(int i, boolean z6) {
        this.f27137a = i;
        this.f27138b = z6;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f27137a) {
            case 0:
                ((Bundle) obj).putString("adid_p", true != this.f27138b ? "0" : "1");
                break;
            case 1:
                ((Bundle) obj).putBoolean("ibrr", this.f27138b);
                break;
            case 2:
                ((Bundle) obj).putBoolean("is_gbid", this.f27138b);
                break;
            default:
                Bundle bundle = (Bundle) obj;
                if (this.f27138b) {
                    bundle.putBoolean("sdk_prefetch", true);
                    break;
                }
                break;
        }
    }
}
