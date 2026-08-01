package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ve, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2821Ve extends AbstractBinderC3336i8 {

    /* renamed from: n, reason: collision with root package name */
    public final String f28214n;

    /* renamed from: u, reason: collision with root package name */
    public final int f28215u;

    public BinderC2821Ve(String str, int i) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.f28214n = str;
        this.f28215u = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f28214n);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f28215u);
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BinderC2821Ve)) {
            return false;
        }
        BinderC2821Ve binderC2821Ve = (BinderC2821Ve) obj;
        return P2.w.l(this.f28214n, binderC2821Ve.f28214n) && P2.w.l(Integer.valueOf(this.f28215u), Integer.valueOf(binderC2821Ve.f28215u));
    }
}
