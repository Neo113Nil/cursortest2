package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.b3x;
import defpackage.epe;
import defpackage.l9;
import defpackage.o8g;
import defpackage.oex;
import defpackage.vkj;
import defpackage.zzg;

/* loaded from: classes.dex */
public final class MaskedWallet extends l9 implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new oex(22);
    public String a;
    public String b;
    public String[] c;
    public String d;
    public b3x e;
    public b3x f;
    public zzg[] g;
    public vkj[] h;
    public UserAddress i;
    public UserAddress j;
    public epe[] k;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a);
        o8g.j0(parcel, 3, this.b);
        o8g.k0(parcel, 4, this.c);
        o8g.j0(parcel, 5, this.d);
        o8g.i0(parcel, 6, this.e, i);
        o8g.i0(parcel, 7, this.f, i);
        o8g.m0(parcel, 8, this.g, i);
        o8g.m0(parcel, 9, this.h, i);
        o8g.i0(parcel, 10, this.i, i);
        o8g.i0(parcel, 11, this.j, i);
        o8g.m0(parcel, 12, this.k, i);
        o8g.p0(parcel, o0);
    }
}
