package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.jk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3417jk extends AbstractBinderC3336i8 implements r2.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f31307n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f31308u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C3471kk f31309v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3417jk(C3471kk c3471kk, String str, long j6) {
        super("com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
        this.f31307n = str;
        this.f31308u = j6;
        Objects.requireNonNull(c3471kk);
        this.f31309v = c3471kk;
    }

    @Override // r2.e
    public final void A2(Bundle bundle) {
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.se)).booleanValue()) {
            this.f31309v.b(this.f31307n, this.f31308u, "1", bundle);
        }
    }

    @Override // r2.e
    public final void L(Bundle bundle) {
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.se)).booleanValue()) {
            this.f31309v.b(this.f31307n, this.f31308u, "0", bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Bundle bundle = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
            AbstractC3388j8.f(parcel);
            A2(bundle);
            return true;
        }
        if (i != 2) {
            return false;
        }
        Bundle bundle2 = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
        AbstractC3388j8.f(parcel);
        L(bundle2);
        return true;
    }
}
