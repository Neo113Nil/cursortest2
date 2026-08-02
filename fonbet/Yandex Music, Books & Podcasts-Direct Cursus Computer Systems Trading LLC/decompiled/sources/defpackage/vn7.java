package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.yandex.pulse.metrics.o;

/* loaded from: classes.dex */
public final class vn7 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ vn7(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new wn7(parcel.readInt());
            case 1:
                a08 a08Var = new a08();
                a08Var.a = parcel.readString();
                a08Var.b = parcel.readString();
                a08Var.c = parcel.readString();
                a08Var.d = parcel.readLong();
                a08Var.e = parcel.readLong();
                return a08Var;
            case 2:
                return new c08(parcel);
            case 3:
                i18 i18Var = new i18();
                i18Var.a = parcel.readString();
                i18Var.b = parcel.readLong();
                return i18Var;
            case 4:
                parcel.getClass();
                return new a58(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : f58.CREATOR.createFromParcel(parcel));
            case 5:
                parcel.getClass();
                return new f58(parcel.readString(), parcel.readString());
            case 6:
                parcel.getClass();
                return new k58((hs5) parcel.readParcelable(k58.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            case 7:
                parcel.getClass();
                return new l58(h94.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
            case 8:
                parcel.getClass();
                return new m58((hs5) parcel.readParcelable(m58.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            case 9:
                parcel.getClass();
                return new o58((hs5) parcel.readParcelable(o58.class.getClassLoader()), parcel.readString(), (dg2) parcel.readParcelable(o58.class.getClassLoader()));
            case 10:
                parcel.getClass();
                return new p58(h94.valueOf(parcel.readString()), parcel.readString(), (dg2) parcel.readParcelable(p58.class.getClassLoader()));
            case 11:
                parcel.getClass();
                return new t9a(parcel.readInt());
            case 12:
                return new iba(parcel);
            case 13:
                return new hba(parcel);
            case 14:
                return new pqa(parcel);
            case 15:
                return new oqa(parcel);
            case 16:
                parcel.getClass();
                return new dva(parcel.readString(), parcel.readString());
            case 17:
                parcel.getClass();
                return new eva(parcel.readString(), dva.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 18:
                parcel.getClass();
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean z3 = parcel.readInt() != 0;
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Parcelable.Creator<eva> creator = eva.CREATOR;
                return new fva(z, z2, readString, readString2, z3, readString3, readString4, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 19:
                parcel.getClass();
                return new y2b(parcel.readInt() != 0, (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), parcel.readParcelable(y2b.class.getClassLoader()));
            case 20:
                parcel.getClass();
                return new u9b(parcel.readString(), parcel.readString(), parcel.readString());
            case 21:
                parcel.getClass();
                return new z9b(parcel.readInt() == 0 ? null : eci.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? vrc.CREATOR.createFromParcel(parcel) : null);
            case 22:
                parcel.getClass();
                parcel.readInt();
                return gcb.a;
            case 23:
                parcel.getClass();
                return new hcb((yxc) parcel.readParcelable(hcb.class.getClassLoader()), parcel.readInt() != 0);
            case 24:
                parcel.getClass();
                parcel.readInt();
                return mdb.a;
            case 25:
                parcel.getClass();
                return new ndb(parcel.readInt() != 0);
            case 26:
                parcel.getClass();
                return new n2c(m2c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 27:
                return new e3c(parcel);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                return new g3c(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, false);
            default:
                parcel.getClass();
                return new b5c(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new wn7[i];
            case 1:
                return new a08[i];
            case 2:
                return new c08[i];
            case 3:
                return new i18[i];
            case 4:
                return new a58[i];
            case 5:
                return new f58[i];
            case 6:
                return new k58[i];
            case 7:
                return new l58[i];
            case 8:
                return new m58[i];
            case 9:
                return new o58[i];
            case 10:
                return new p58[i];
            case 11:
                return new t9a[i];
            case 12:
                return new iba[i];
            case 13:
                return new hba[i];
            case 14:
                return new pqa[i];
            case 15:
                return new oqa[i];
            case 16:
                return new dva[i];
            case 17:
                return new eva[i];
            case 18:
                return new fva[i];
            case 19:
                return new y2b[i];
            case 20:
                return new u9b[i];
            case 21:
                return new z9b[i];
            case 22:
                return new gcb[i];
            case 23:
                return new hcb[i];
            case 24:
                return new mdb[i];
            case 25:
                return new ndb[i];
            case 26:
                return new n2c[i];
            case 27:
                return new e3c[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new g3c[i];
            default:
                return new b5c[i];
        }
    }
}
