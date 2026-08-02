package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ve, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2844Ve extends AbstractBinderC3359i8 {

    /* renamed from: n, reason: collision with root package name */
    public final String f29011n;

    /* renamed from: u, reason: collision with root package name */
    public final int f29012u;

    public BinderC2844Ve(String str, int i) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.f29011n = str;
        this.f29012u = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f29011n);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f29012u);
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BinderC2844Ve)) {
            return false;
        }
        BinderC2844Ve binderC2844Ve = (BinderC2844Ve) obj;
        return R2.w.l(this.f29011n, binderC2844Ve.f29011n) && R2.w.l(Integer.valueOf(this.f29012u), Integer.valueOf(binderC2844Ve.f29012u));
    }
}
