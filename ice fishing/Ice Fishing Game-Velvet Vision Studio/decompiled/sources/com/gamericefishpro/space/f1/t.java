package com.gamericefishpro.space.f1;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.n.f2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ t(int i) {
        this.a = i;
    }

    public static u a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = t.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new u();
        }
        com.gamericefishpro.space.x0.e eVarBuilder = com.gamericefishpro.space.x0.h.i.builder();
        for (int i2 = 0; i2 < i; i2++) {
            eVarBuilder.add(parcel.readValue(classLoader));
        }
        return new u(eVarBuilder.d());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return a(parcel, classLoader);
            case 1:
                return new com.gamericefishpro.space.fa.b(parcel, classLoader);
            case 2:
                if (parcel.readParcelable(classLoader) == null) {
                    return com.gamericefishpro.space.j4.b.e;
                }
                throw new IllegalStateException("superState must be null");
            case 3:
                return new com.gamericefishpro.space.la.e(parcel, classLoader);
            case 4:
                return new f2(parcel, classLoader);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return new com.gamericefishpro.space.na.a0(parcel, classLoader);
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new com.gamericefishpro.space.p3.e(parcel, classLoader);
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new com.gamericefishpro.space.r5.i0(parcel, classLoader);
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return new com.gamericefishpro.space.x9.a(parcel, classLoader);
            default:
                return new com.gamericefishpro.space.y9.c(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new u[i];
            case 1:
                return new com.gamericefishpro.space.fa.b[i];
            case 2:
                return new com.gamericefishpro.space.j4.b[i];
            case 3:
                return new com.gamericefishpro.space.la.e[i];
            case 4:
                return new f2[i];
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return new com.gamericefishpro.space.na.a0[i];
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new com.gamericefishpro.space.p3.e[i];
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new com.gamericefishpro.space.r5.i0[i];
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return new com.gamericefishpro.space.x9.a[i];
            default:
                return new com.gamericefishpro.space.y9.c[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return a(parcel, null);
            case 1:
                return new com.gamericefishpro.space.fa.b(parcel, null);
            case 2:
                if (parcel.readParcelable(null) == null) {
                    return com.gamericefishpro.space.j4.b.e;
                }
                throw new IllegalStateException("superState must be null");
            case 3:
                return new com.gamericefishpro.space.la.e(parcel, null);
            case 4:
                return new f2(parcel, null);
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return new com.gamericefishpro.space.na.a0(parcel, null);
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return new com.gamericefishpro.space.p3.e(parcel, null);
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return new com.gamericefishpro.space.r5.i0(parcel, null);
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return new com.gamericefishpro.space.x9.a(parcel, null);
            default:
                return new com.gamericefishpro.space.y9.c(parcel, null);
        }
    }
}
