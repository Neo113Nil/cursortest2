package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.a0;
import androidx.fragment.app.b;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes4.dex */
public final class a5c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new c5c(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 1:
                parcel.getClass();
                return new tdc(parcel.readString());
            case 2:
                parcel.getClass();
                parcel.readInt();
                return udc.a;
            case 3:
                return new tfc(parcel);
            case 4:
                parcel.getClass();
                return new vrc(parcel.readString());
            case 5:
                wtc wtcVar = new wtc();
                wtcVar.a = parcel.readString();
                wtcVar.b = parcel.readInt();
                return wtcVar;
            case 6:
                cuc cucVar = new cuc();
                cucVar.e = null;
                cucVar.f = new ArrayList();
                cucVar.g = new ArrayList();
                cucVar.a = parcel.createStringArrayList();
                cucVar.b = parcel.createStringArrayList();
                cucVar.c = (b[]) parcel.createTypedArray(b.CREATOR);
                cucVar.d = parcel.readInt();
                cucVar.e = parcel.readString();
                cucVar.f = parcel.createStringArrayList();
                cucVar.g = parcel.createTypedArrayList(zi2.CREATOR);
                cucVar.h = parcel.createTypedArrayList(wtc.CREATOR);
                return cucVar;
            case 7:
                return new a0(parcel);
            case 8:
                parcel.getClass();
                return new ixc(parcel.readString(), parcel.readString(), (CoverPath) parcel.readParcelable(ixc.class.getClassLoader()), qo6.valueOf(parcel.readString()), (tn6) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                parcel.getClass();
                drt drtVar = (drt) parcel.readParcelable(yxc.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new yxc(drtVar, readInt, readString, z3, (b6d) parcel.readParcelable(yxc.class.getClassLoader()), parcel.readInt() != 0 ? true : z, parcel.readInt() != 0 ? true : z, parcel.readInt() != 0 ? true : z, parcel.createStringArrayList());
            case 10:
                parcel.getClass();
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    arrayList.add(parcel.readParcelable(g1d.class.getClassLoader()));
                }
                String readString2 = parcel.readString();
                int readInt3 = parcel.readInt();
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = false;
                }
                return new g1d(readInt3, readString2, arrayList, z4, parcel.readInt() != 0 ? z2 : false);
            case 11:
                parcel.getClass();
                return new b6d(parcel.readString());
            case 12:
                return new dcd(parcel);
            case 13:
                parcel.getClass();
                return new dnd(parcel.createStringArrayList());
            case 14:
                parcel.getClass();
                return new gnd(parcel.readString());
            case 15:
                parcel.getClass();
                return new hnd(parcel.readString(), parcel.readString());
            case 16:
                parcel.getClass();
                return new jnd(parcel.readString());
            case 17:
                parcel.getClass();
                return new nod(parcel);
            case 18:
                parcel.getClass();
                return new aud(parcel.readString());
            case 19:
                parcel.getClass();
                return new bud(parcel.readInt());
            case 20:
                parcel.getClass();
                parcel.readInt();
                return cud.a;
            case 21:
                parcel.getClass();
                return new iae(parcel.readString(), parcel.readString());
            case 22:
                parcel.getClass();
                return new ece((tn6) parcel.readSerializable(), qo6.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 23:
                parcel.getClass();
                return zee.valueOf(parcel.readString());
            case 24:
                parcel.getClass();
                return new aie(parcel.readInt(), parcel.readString(), parcel.readString());
            case 25:
                parcel.getClass();
                return new bie((ffk) parcel.readParcelable(bie.class.getClassLoader()));
            case 26:
                return new moe(parcel);
            case 27:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new sre((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new y9f(parcel);
            default:
                parcel.getClass();
                return new onf(parcel.readString(), parcel.readBundle(onf.class.getClassLoader()), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new c5c[i];
            case 1:
                return new tdc[i];
            case 2:
                return new udc[i];
            case 3:
                return new tfc[i];
            case 4:
                return new vrc[i];
            case 5:
                return new wtc[i];
            case 6:
                return new cuc[i];
            case 7:
                return new a0[i];
            case 8:
                return new ixc[i];
            case 9:
                return new yxc[i];
            case 10:
                return new g1d[i];
            case 11:
                return new b6d[i];
            case 12:
                return new dcd[i];
            case 13:
                return new dnd[i];
            case 14:
                return new gnd[i];
            case 15:
                return new hnd[i];
            case 16:
                return new jnd[i];
            case 17:
                return new nod[i];
            case 18:
                return new aud[i];
            case 19:
                return new bud[i];
            case 20:
                return new cud[i];
            case 21:
                return new iae[i];
            case 22:
                return new ece[i];
            case 23:
                return new zee[i];
            case 24:
                return new aie[i];
            case 25:
                return new bie[i];
            case 26:
                return new moe[i];
            case 27:
                return new sre[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new y9f[i];
            default:
                return new onf[i];
        }
    }
}
