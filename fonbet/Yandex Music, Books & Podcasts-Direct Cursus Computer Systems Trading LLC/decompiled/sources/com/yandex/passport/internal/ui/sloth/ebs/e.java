package com.yandex.passport.internal.ui.sloth.ebs;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class e implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new f((com.yandex.passport.common.core.f) parcel.readParcelable(f.class.getClassLoader()), parcel.readString(), parcel.readString(), com.yandex.passport.common.ui.a.valueOf(parcel.readString()));
            case 1:
                parcel.getClass();
                return new s0((k1) parcel.readParcelable(s0.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (com.yandex.passport.sloth.data.m) parcel.readParcelable(s0.class.getClassLoader()), parcel.readInt() != 0);
            case 2:
                parcel.getClass();
                return new h1(m1.CREATOR.createFromParcel(parcel));
            case 3:
                parcel.getClass();
                return new i1(parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                parcel.getClass();
                return new j1(m1.CREATOR.createFromParcel(parcel), parcel.readString());
            default:
                parcel.getClass();
                return m1.valueOf(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new f[i];
            case 1:
                return new s0[i];
            case 2:
                return new h1[i];
            case 3:
                return new i1[i];
            case 4:
                return new j1[i];
            default:
                return new m1[i];
        }
    }
}
