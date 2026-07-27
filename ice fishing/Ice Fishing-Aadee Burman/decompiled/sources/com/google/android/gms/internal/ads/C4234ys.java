package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ys, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4234ys implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35236a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f35237b;

    public /* synthetic */ C4234ys(Boolean bool, int i) {
        this.f35236a = i;
        this.f35237b = bool;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f35236a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Boolean bool = this.f35237b;
                if (bool != null) {
                    bundle.putBoolean("hw_accel", bool.booleanValue());
                    break;
                }
                break;
            default:
                Bundle bundle2 = (Bundle) obj;
                Boolean bool2 = this.f35237b;
                if (bool2 != null) {
                    if (!bool2.booleanValue()) {
                        bundle2.putInt("lft", 0);
                        break;
                    } else {
                        bundle2.putInt("lft", 1);
                        break;
                    }
                } else {
                    bundle2.putInt("lft", -1);
                    break;
                }
        }
    }
}
