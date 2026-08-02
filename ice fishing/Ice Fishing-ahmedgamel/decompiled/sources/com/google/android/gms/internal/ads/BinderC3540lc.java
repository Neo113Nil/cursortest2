package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.lc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3540lc extends AbstractBinderC3359i8 implements t2.g {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f32549n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C3648nc f32550u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3540lc(C3648nc c3648nc, String str) {
        super("com.google.android.gms.ads.internal.client.hsdp.IHsdpServiceCallback");
        this.f32549n = str;
        Objects.requireNonNull(c3648nc);
        this.f32550u = c3648nc;
    }

    @Override // t2.g
    public final void K(Bundle bundle) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.se)).booleanValue()) {
            this.f32550u.d("hsdp_on_error", bundle, this.f32549n);
        }
    }

    @Override // t2.g
    public final void O(Bundle bundle) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.se)).booleanValue()) {
            this.f32550u.d("hsdp_on_shown", bundle, this.f32549n);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Bundle bundle = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
            AbstractC3411j8.f(parcel);
            O(bundle);
        } else if (i == 2) {
            Bundle bundle2 = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
            AbstractC3411j8.f(parcel);
            W(bundle2);
        } else {
            if (i != 3) {
                return false;
            }
            Bundle bundle3 = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
            AbstractC3411j8.f(parcel);
            K(bundle3);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // t2.g
    public final void W(Bundle bundle) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.se)).booleanValue()) {
            this.f32550u.d("hsdp_on_dismissed", bundle, this.f32549n);
        }
    }
}
