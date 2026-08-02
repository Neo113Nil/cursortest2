package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.vf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4082vf extends AbstractBinderC3359i8 implements InterfaceC3221ff {

    /* renamed from: n, reason: collision with root package name */
    public final String f35467n;

    /* renamed from: u, reason: collision with root package name */
    public final int f35468u;

    public BinderC4082vf(String str, int i) {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.f35467n = str;
        this.f35468u = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f35467n);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f35468u);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3221ff
    public final String d() {
        return this.f35467n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3221ff
    public final int e() {
        return this.f35468u;
    }
}
