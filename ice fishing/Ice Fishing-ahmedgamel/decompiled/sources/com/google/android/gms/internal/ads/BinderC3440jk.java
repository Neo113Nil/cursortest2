package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.jk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3440jk extends AbstractBinderC3359i8 implements t2.e {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f32094n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f32095u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C3494kk f32096v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC3440jk(C3494kk c3494kk, String str, long j6) {
        super("com.google.android.gms.ads.internal.client.hsdp.IHsdpPrewarmServiceCallback");
        this.f32094n = str;
        this.f32095u = j6;
        Objects.requireNonNull(c3494kk);
        this.f32096v = c3494kk;
    }

    @Override // t2.e
    public final void K(Bundle bundle) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.se)).booleanValue()) {
            this.f32096v.b(this.f32094n, this.f32095u, "0", bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Bundle bundle = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
            AbstractC3411j8.f(parcel);
            w2(bundle);
            return true;
        }
        if (i != 2) {
            return false;
        }
        Bundle bundle2 = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
        AbstractC3411j8.f(parcel);
        K(bundle2);
        return true;
    }

    @Override // t2.e
    public final void w2(Bundle bundle) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.se)).booleanValue()) {
            this.f32096v.b(this.f32094n, this.f32095u, "1", bundle);
        }
    }
}
