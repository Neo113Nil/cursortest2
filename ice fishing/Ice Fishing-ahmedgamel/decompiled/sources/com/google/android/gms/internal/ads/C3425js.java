package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.js, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3425js implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31333a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f31334b;

    public /* synthetic */ C3425js(int i, Integer num) {
        this.f31333a = i;
        this.f31334b = num;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f31333a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Integer num = this.f31334b;
                if (num != null) {
                    bundle.putInt("aos", num.intValue());
                    break;
                }
                break;
            default:
                Bundle bundle2 = (Bundle) obj;
                Integer num2 = this.f31334b;
                if (num2 != null) {
                    bundle2.putInt("dspct", Math.min(num2.intValue(), 20));
                    break;
                }
                break;
        }
    }
}
