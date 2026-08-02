package com.yandex.passport.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new b(((com.yandex.passport.common.resources.c) parcel.readParcelable(b.class.getClassLoader())).a);
            case 1:
                parcel.getClass();
                parcel.readInt();
                return c.a;
            case 2:
                parcel.getClass();
                return new r0(parcel.readDouble(), parcel.readDouble());
            case 3:
                parcel.getClass();
                return new u0(parcel.readLong());
            case 4:
                parcel.getClass();
                i1 valueOf = i1.valueOf(parcel.readString());
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new j1(valueOf, linkedHashSet);
            case 5:
                parcel.getClass();
                String readString = parcel.readString();
                m1.a(readString);
                return new m1(readString);
            case 6:
                parcel.getClass();
                return new z1((com.yandex.passport.api.impl.b) parcel.readParcelable(z1.class.getClassLoader()), parcel.readLong());
            case 7:
                parcel.getClass();
                return new j2(parcel.readLong());
            case 8:
                parcel.getClass();
                return new k2(parcel.readInt());
            case 9:
                parcel.getClass();
                return new m2(parcel.readInt());
            case 10:
                parcel.getClass();
                parcel.readInt();
                return n2.a;
            case 11:
                parcel.getClass();
                return new p2(parcel.readInt(), parcel.readInt());
            case 12:
                parcel.getClass();
                parcel.readInt();
                return q2.a;
            case 13:
                parcel.getClass();
                parcel.readInt();
                return r2.a;
            default:
                parcel.getClass();
                parcel.readInt();
                return t2.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new b[i];
            case 1:
                return new c[i];
            case 2:
                return new r0[i];
            case 3:
                return new u0[i];
            case 4:
                return new j1[i];
            case 5:
                return new m1[i];
            case 6:
                return new z1[i];
            case 7:
                return new j2[i];
            case 8:
                return new k2[i];
            case 9:
                return new m2[i];
            case 10:
                return new n2[i];
            case 11:
                return new p2[i];
            case 12:
                return new q2[i];
            case 13:
                return new r2[i];
            default:
                return new t2[i];
        }
    }
}
