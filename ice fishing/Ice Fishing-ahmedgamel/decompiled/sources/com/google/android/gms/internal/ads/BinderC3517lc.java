package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.lc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3517lc extends AbstractBinderC3336i8 implements r2.g {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f31770n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3625nc f31771u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3517lc(C3625nc c3625nc, String str) {
        super("com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback");
        this.f31770n = str;
        Objects.requireNonNull(c3625nc);
        this.f31771u = c3625nc;
    }

    @Override // r2.g
    public final void L(Bundle bundle) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.se)).booleanValue()) {
            this.f31771u.d("hsdp_on_error", bundle, this.f31770n);
        }
    }

    @Override // r2.g
    public final void O(Bundle bundle) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.se)).booleanValue()) {
            this.f31771u.d("hsdp_on_shown", bundle, this.f31770n);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Bundle bundle = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
            AbstractC3388j8.f(parcel);
            O(bundle);
        } else if (i == 2) {
            Bundle bundle2 = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
            AbstractC3388j8.f(parcel);
            W(bundle2);
        } else {
            if (i != 3) {
                return false;
            }
            Bundle bundle3 = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
            AbstractC3388j8.f(parcel);
            L(bundle3);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // r2.g
    public final void W(Bundle bundle) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.se)).booleanValue()) {
            this.f31771u.d("hsdp_on_dismissed", bundle, this.f31770n);
        }
    }
}
