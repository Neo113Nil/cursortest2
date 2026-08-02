package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import com.appsflyer.internal.k;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import kotlin.KotlinVersion;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes.dex */
public final class i02 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ i02(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        ArrayList arrayList;
        boolean z2;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new j02(parcel);
            case 1:
                parcel.getClass();
                return new k02(parcel);
            case 2:
                parcel.getClass();
                return new l02(parcel);
            case 3:
                parcel.getClass();
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList3.add(parcel.readParcelable(bg2.class.getClassLoader()));
                }
                boolean z3 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z3 = false;
                }
                return new bg2(arrayList3, z3, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false);
            case 4:
                parcel.getClass();
                return dg2.valueOf(parcel.readString());
            case 5:
                return new b(parcel);
            case 6:
                return new zi2(parcel);
            case 7:
                lk2 lk2Var = new lk2();
                lk2Var.i = KotlinVersion.MAX_COMPONENT_VALUE;
                lk2Var.k = -2;
                lk2Var.l = -2;
                lk2Var.m = -2;
                lk2Var.t = Boolean.TRUE;
                lk2Var.a = parcel.readInt();
                lk2Var.b = (Integer) parcel.readSerializable();
                lk2Var.c = (Integer) parcel.readSerializable();
                lk2Var.d = (Integer) parcel.readSerializable();
                lk2Var.e = (Integer) parcel.readSerializable();
                lk2Var.f = (Integer) parcel.readSerializable();
                lk2Var.g = (Integer) parcel.readSerializable();
                lk2Var.h = (Integer) parcel.readSerializable();
                lk2Var.i = parcel.readInt();
                lk2Var.j = parcel.readString();
                lk2Var.k = parcel.readInt();
                lk2Var.l = parcel.readInt();
                lk2Var.m = parcel.readInt();
                lk2Var.o = parcel.readString();
                lk2Var.p = parcel.readString();
                lk2Var.q = parcel.readInt();
                lk2Var.s = (Integer) parcel.readSerializable();
                lk2Var.u = (Integer) parcel.readSerializable();
                lk2Var.v = (Integer) parcel.readSerializable();
                lk2Var.w = (Integer) parcel.readSerializable();
                lk2Var.x = (Integer) parcel.readSerializable();
                lk2Var.y = (Integer) parcel.readSerializable();
                lk2Var.z = (Integer) parcel.readSerializable();
                lk2Var.C = (Integer) parcel.readSerializable();
                lk2Var.A = (Integer) parcel.readSerializable();
                lk2Var.B = (Integer) parcel.readSerializable();
                lk2Var.t = (Boolean) parcel.readSerializable();
                lk2Var.n = (Locale) parcel.readSerializable();
                lk2Var.D = (Boolean) parcel.readSerializable();
                lk2Var.E = (Integer) parcel.readSerializable();
                return lk2Var;
            case 8:
                parcel.getClass();
                return new nk2(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt2);
                    int i2 = 0;
                    while (i2 != readInt2) {
                        i2 = k.c(zp2.CREATOR, parcel, arrayList4, i2, 1);
                    }
                    arrayList = arrayList4;
                }
                return new zp2(readString, readString2, readString3, readString4, arrayList, parcel.createStringArrayList(), (CoverPath) parcel.readParcelable(zp2.class.getClassLoader()), (CoverPath) parcel.readParcelable(zp2.class.getClassLoader()));
            case 10:
                parcel.getClass();
                return new m13(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 11:
                parcel.getClass();
                String readString5 = parcel.readString();
                return new n13(readString5, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 12:
                parcel.getClass();
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = false;
                }
                return new o13(z4, parcel.readInt() != 0 ? z2 : false, parcel.readInt() != 0 ? z2 : false, parcel.readInt() != 0 ? z2 : false, parcel.readInt() != 0 ? z2 : false);
            case 13:
                parcel.getClass();
                return new fg3(parcel.readString(), parcel.readString());
            case 14:
                parcel.getClass();
                return new jg3(parcel.readString(), parcel.readString());
            case 15:
                parcel.getClass();
                return new zh3(parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                return new cs3((sdi) parcel.readParcelable(sdi.class.getClassLoader()), (sdi) parcel.readParcelable(sdi.class.getClassLoader()), (vd7) parcel.readParcelable(vd7.class.getClassLoader()), (sdi) parcel.readParcelable(sdi.class.getClassLoader()), parcel.readInt());
            case 17:
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt3);
                    for (int i3 = 0; i3 != readInt3; i3++) {
                        arrayList5.add(parcel.readSerializable());
                    }
                    arrayList2 = arrayList5;
                }
                return new pv3(parcel.readString(), arrayList2);
            case 18:
                parcel.getClass();
                return new fw3(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0, parcel.readString());
            case 19:
                parcel.getClass();
                return new hw3(parcel.readString());
            case 20:
                parcel.getClass();
                return new ax3(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : s1u.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? se.CREATOR.createFromParcel(parcel) : null);
            case 21:
                parcel.getClass();
                return new xx3(pv3.CREATOR.createFromParcel(parcel), fw3.CREATOR.createFromParcel(parcel));
            case 22:
                parcel.getClass();
                return f24.valueOf(parcel.readString());
            case 23:
                parcel.getClass();
                return new c44(f24.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
            case 24:
                parcel.getClass();
                return new r54(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 25:
                parcel.getClass();
                cvl createFromParcel = cvl.CREATOR.createFromParcel(parcel);
                int readInt4 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = k.c(rf4.CREATOR, parcel, arrayList6, i4, 1);
                }
                return new qe4(createFromParcel, arrayList6);
            case 26:
                parcel.getClass();
                return new re4((oq) parcel.readParcelable(re4.class.getClassLoader()), jf4.CREATOR.createFromParcel(parcel));
            case 27:
                parcel.getClass();
                return new jf4(parcel.readInt(), (mf4) parcel.readParcelable(jf4.class.getClassLoader()));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                return new lf4(parcel.readInt(), parcel.readInt() == 0 ? null : kf4.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            default:
                parcel.getClass();
                return new rf4(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), mqs.CREATOR.createFromParcel(parcel), (Date) parcel.readSerializable(), lf4.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new j02[i];
            case 1:
                return new k02[i];
            case 2:
                return new l02[i];
            case 3:
                return new bg2[i];
            case 4:
                return new dg2[i];
            case 5:
                return new b[i];
            case 6:
                return new zi2[i];
            case 7:
                return new lk2[i];
            case 8:
                return new nk2[i];
            case 9:
                return new zp2[i];
            case 10:
                return new m13[i];
            case 11:
                return new n13[i];
            case 12:
                return new o13[i];
            case 13:
                return new fg3[i];
            case 14:
                return new jg3[i];
            case 15:
                return new zh3[i];
            case 16:
                return new cs3[i];
            case 17:
                return new pv3[i];
            case 18:
                return new fw3[i];
            case 19:
                return new hw3[i];
            case 20:
                return new ax3[i];
            case 21:
                return new xx3[i];
            case 22:
                return new f24[i];
            case 23:
                return new c44[i];
            case 24:
                return new r54[i];
            case 25:
                return new qe4[i];
            case 26:
                return new re4[i];
            case 27:
                return new jf4[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new lf4[i];
            default:
                return new rf4[i];
        }
    }
}
