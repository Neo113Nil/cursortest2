package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Mr implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26352a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f26353b;

    public /* synthetic */ Mr(int i, boolean z3) {
        this.f26352a = i;
        this.f26353b = z3;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f26352a) {
            case 0:
                ((Bundle) obj).putString("adid_p", true != this.f26353b ? "0" : "1");
                break;
            case 1:
                ((Bundle) obj).putBoolean("ibrr", this.f26353b);
                break;
            case 2:
                ((Bundle) obj).putBoolean("is_gbid", this.f26353b);
                break;
            default:
                Bundle bundle = (Bundle) obj;
                if (this.f26353b) {
                    bundle.putBoolean("sdk_prefetch", true);
                    break;
                }
                break;
        }
    }
}
