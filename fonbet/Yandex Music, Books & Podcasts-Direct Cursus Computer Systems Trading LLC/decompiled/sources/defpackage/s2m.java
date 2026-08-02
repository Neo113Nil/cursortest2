package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.RatingCompat;
import com.appsflyer.internal.k;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Date;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes5.dex */
public final class s2m implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ s2m(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        u9e u9eVar = null;
        Bundle bundle = null;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new t2m(rr5.CREATOR.createFromParcel(parcel), (Date) parcel.readSerializable());
            case 1:
                parcel.getClass();
                return new mem(lem.valueOf(parcel.readString()), kem.valueOf(parcel.readString()), parcel.readString());
            case 2:
                parcel.getClass();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = k.c(ljm.CREATOR, parcel, arrayList, i, 1);
                }
                return new kjm(arrayList, parcel.readString(), (Date) parcel.readSerializable(), parcel.readLong(), (CoverPath) parcel.readParcelable(kjm.class.getClassLoader()), parcel.readString(), parcel.readString(), WarningContent.valueOf(parcel.readString()), (Date) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0 ? zjm.CREATOR.createFromParcel(parcel) : null);
            case 3:
                parcel.getClass();
                return new ljm(parcel.readString(), parcel.readString(), (CoverPath) parcel.readParcelable(ljm.class.getClassLoader()));
            case 4:
                parcel.getClass();
                return new zjm(parcel.createStringArrayList(), parcel.readInt() != 0);
            case 5:
                parcel.getClass();
                return new oom(parcel.readInt() != 0, parcel.readDouble(), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
            case 6:
                parcel.getClass();
                return new rtm(parcel);
            case 7:
                return new iin(parcel.readInt(), parcel.readFloat());
            case 8:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 9:
                int f0 = f8g.f0(parcel);
                while (parcel.dataPosition() < f0) {
                    int readInt2 = parcel.readInt();
                    if (((char) readInt2) != 2) {
                        f8g.W(parcel, readInt2);
                    } else {
                        bundle = f8g.p(parcel, readInt2);
                    }
                }
                f8g.B(parcel, f0);
                return new zun(bundle);
            case 10:
                parcel.getClass();
                return new c2o(d2o.CREATOR.createFromParcel(parcel), parcel.readFloat(), parcel.readFloat());
            case 11:
                parcel.getClass();
                return d2o.valueOf(parcel.readString());
            case 12:
                parcel.getClass();
                return e8o.valueOf(parcel.readString());
            case 13:
                i8o i8oVar = new i8o();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i2 = h8o.h;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(u9e.f);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof u9e)) {
                        t9e t9eVar = new t9e();
                        t9eVar.a = readStrongBinder;
                        u9eVar = t9eVar;
                    } else {
                        u9eVar = (u9e) queryLocalInterface;
                    }
                }
                i8oVar.a = u9eVar;
                return i8oVar;
            case 14:
                parcel.getClass();
                return new j8o(parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 15:
                parcel.getClass();
                return new k8o((bfk) parcel.readParcelable(k8o.class.getClassLoader()));
            case 16:
                parcel.getClass();
                parcel.readInt();
                return l8o.a;
            case 17:
                parcel.getClass();
                parcel.readInt();
                return m8o.a;
            case 18:
                parcel.getClass();
                parcel.readInt();
                return n8o.a;
            case 19:
                parcel.getClass();
                parcel.readInt();
                return o8o.a;
            case 20:
                parcel.getClass();
                parcel.readInt();
                return p8o.a;
            case 21:
                parcel.getClass();
                parcel.readInt();
                return q8o.a;
            case 22:
                parcel.getClass();
                parcel.readInt();
                return r8o.a;
            case 23:
                parcel.getClass();
                parcel.readInt();
                return s8o.a;
            case 24:
                parcel.getClass();
                return new t8o((bfk) parcel.readParcelable(t8o.class.getClassLoader()));
            case 25:
                parcel.getClass();
                return new u8o(parcel.readString());
            case 26:
                parcel.getClass();
                parcel.readInt();
                return v8o.a;
            case 27:
                parcel.getClass();
                parcel.readInt();
                return w8o.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                return new x8o((bfk) parcel.readParcelable(x8o.class.getClassLoader()));
            default:
                parcel.getClass();
                parcel.readInt();
                return y8o.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new t2m[i];
            case 1:
                return new mem[i];
            case 2:
                return new kjm[i];
            case 3:
                return new ljm[i];
            case 4:
                return new zjm[i];
            case 5:
                return new oom[i];
            case 6:
                return new rtm[i];
            case 7:
                return new iin[i];
            case 8:
                return new RatingCompat[i];
            case 9:
                return new zun[i];
            case 10:
                return new c2o[i];
            case 11:
                return new d2o[i];
            case 12:
                return new e8o[i];
            case 13:
                return new i8o[i];
            case 14:
                return new j8o[i];
            case 15:
                return new k8o[i];
            case 16:
                return new l8o[i];
            case 17:
                return new m8o[i];
            case 18:
                return new n8o[i];
            case 19:
                return new o8o[i];
            case 20:
                return new p8o[i];
            case 21:
                return new q8o[i];
            case 22:
                return new r8o[i];
            case 23:
                return new s8o[i];
            case 24:
                return new t8o[i];
            case 25:
                return new u8o[i];
            case 26:
                return new v8o[i];
            case 27:
                return new w8o[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new x8o[i];
            default:
                return new y8o[i];
        }
    }
}
