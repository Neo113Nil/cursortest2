package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ys, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4257ys implements Os {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36020a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f36021b;

    public /* synthetic */ C4257ys(Boolean bool, int i) {
        this.f36020a = i;
        this.f36021b = bool;
    }

    @Override // com.google.android.gms.internal.ads.Os
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.f36020a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Boolean bool = this.f36021b;
                if (bool != null) {
                    bundle.putBoolean("hw_accel", bool.booleanValue());
                    break;
                }
                break;
            default:
                Bundle bundle2 = (Bundle) obj;
                Boolean bool2 = this.f36021b;
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
