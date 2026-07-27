package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.vf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4059vf extends AbstractBinderC3336i8 implements InterfaceC3198ff {

    /* renamed from: n, reason: collision with root package name */
    public final String f34710n;

    /* renamed from: u, reason: collision with root package name */
    public final int f34711u;

    public BinderC4059vf(String str, int i) {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.f34710n = str;
        this.f34711u = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f34710n);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f34711u);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3198ff
    public final String d() {
        return this.f34710n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3198ff
    public final int e() {
        return this.f34711u;
    }
}
