package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class l implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new m(com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.h.CREATOR.createFromParcel(parcel));
            case 1:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.pay.ui.yb.web.internal.a.a;
            case 2:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.pay.ui.yb.web.internal.b.a;
            case 3:
                parcel.getClass();
                return new com.yandex.plus.pay.ui.yb.web.internal.c(parcel.readString());
            case 4:
                parcel.getClass();
                parcel.readInt();
                return com.yandex.plus.pay.ui.yb.web.internal.d.a;
            case 5:
                parcel.getClass();
                return new com.yandex.plus.pay.ui.yb.web.internal.ui.b(parcel.readString(), parcel.readLong(), parcel.readLong(), com.yandex.plus.pay.ui.yb.api.e.valueOf(parcel.readString()));
            default:
                com.yandex.plus.plaquesdk.design.d dVar = new com.yandex.plus.plaquesdk.design.d(parcel);
                dVar.a = parcel.readInt() == 1;
                return dVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new m[i];
            case 1:
                return new com.yandex.plus.pay.ui.yb.web.internal.a[i];
            case 2:
                return new com.yandex.plus.pay.ui.yb.web.internal.b[i];
            case 3:
                return new com.yandex.plus.pay.ui.yb.web.internal.c[i];
            case 4:
                return new com.yandex.plus.pay.ui.yb.web.internal.d[i];
            case 5:
                return new com.yandex.plus.pay.ui.yb.web.internal.ui.b[i];
            default:
                return new com.yandex.plus.plaquesdk.design.d[i];
        }
    }
}
