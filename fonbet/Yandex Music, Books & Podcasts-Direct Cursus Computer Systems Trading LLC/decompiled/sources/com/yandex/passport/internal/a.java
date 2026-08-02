package com.yandex.passport.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.w1;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean valueOf;
        Boolean valueOf2;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 1:
                parcel.getClass();
                return new e(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 2:
                parcel.getClass();
                Boolean bool = null;
                Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new g(valueOf3, readString, readString2, valueOf, valueOf2, bool, parcel.readString(), parcel.readString(), parcel.readLong());
            case 3:
                parcel.getClass();
                return new l(parcel.readString(), (com.yandex.passport.common.core.f) parcel.readParcelable(l.class.getClassLoader()), (com.yandex.passport.common.core.f) parcel.readParcelable(l.class.getClassLoader()), (com.yandex.passport.common.account.a) parcel.readParcelable(l.class.getClassLoader()), (com.yandex.passport.common.core.g) parcel.readParcelable(l.class.getClassLoader()), com.yandex.passport.internal.stash.a.CREATOR.createFromParcel(parcel));
            default:
                parcel.getClass();
                w1 valueOf4 = w1.valueOf(parcel.readString());
                z valueOf5 = z.valueOf(parcel.readString());
                String readString3 = parcel.readString();
                int i = 0;
                boolean z = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                while (i != readInt) {
                    i = com.appsflyer.internal.k.b(parcel, linkedHashMap, parcel.readString(), i, 1);
                }
                return new a0(valueOf4, valueOf5, readString3, z, linkedHashMap);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new b[i];
            case 1:
                return new e[i];
            case 2:
                return new g[i];
            case 3:
                return new l[i];
            default:
                return new a0[i];
        }
    }
}
