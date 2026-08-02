package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.pulse.metrics.o;

/* loaded from: classes4.dex */
public final class z8o implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ z8o(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new a9o((bfk) parcel.readParcelable(a9o.class.getClassLoader()));
            case 1:
                parcel.getClass();
                parcel.readInt();
                return b9o.a;
            case 2:
                parcel.getClass();
                parcel.readInt();
                return c9o.a;
            case 3:
                parcel.getClass();
                return new d9o((bfk) parcel.readParcelable(d9o.class.getClassLoader()));
            case 4:
                parcel.getClass();
                parcel.readInt();
                return e9o.a;
            case 5:
                parcel.getClass();
                parcel.readInt();
                return f9o.a;
            case 6:
                parcel.getClass();
                parcel.readInt();
                return g9o.a;
            case 7:
                parcel.getClass();
                return new h9o((bfk) parcel.readParcelable(h9o.class.getClassLoader()));
            case 8:
                parcel.getClass();
                parcel.readInt();
                return i9o.a;
            case 9:
                parcel.getClass();
                parcel.readInt();
                return j9o.a;
            case 10:
                parcel.getClass();
                parcel.readInt();
                return k9o.a;
            case 11:
                parcel.getClass();
                parcel.readInt();
                return l9o.a;
            case 12:
                parcel.getClass();
                parcel.readInt();
                return m9o.a;
            case 13:
                parcel.getClass();
                return new n9o((bfk) parcel.readParcelable(n9o.class.getClassLoader()));
            case 14:
                parcel.getClass();
                parcel.readInt();
                return o9o.a;
            case 15:
                parcel.getClass();
                parcel.readInt();
                return p9o.a;
            case 16:
                parcel.getClass();
                String readString = parcel.readString();
                boolean z3 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z3 = false;
                }
                return new r9o(readString, z3, parcel.readInt() != 0 ? z : false, (wds) parcel.readParcelable(r9o.class.getClassLoader()), (wds) parcel.readParcelable(r9o.class.getClassLoader()), (wds) parcel.readParcelable(r9o.class.getClassLoader()), (wds) parcel.readParcelable(r9o.class.getClassLoader()), parcel.readString(), parcel.readLong(), (bfk) parcel.readParcelable(r9o.class.getClassLoader()), (q9o) parcel.readParcelable(r9o.class.getClassLoader()));
            case 17:
                parcel.getClass();
                String readString2 = parcel.readString();
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z2 = false;
                    z4 = true;
                } else {
                    z2 = false;
                }
                return new s9o(readString2, z4, parcel.readInt() == 0 ? z2 : true, (wds) parcel.readParcelable(s9o.class.getClassLoader()), (wds) parcel.readParcelable(s9o.class.getClassLoader()), (wds) parcel.readParcelable(s9o.class.getClassLoader()), (wds) parcel.readParcelable(s9o.class.getClassLoader()), parcel.readString(), (q9o) parcel.readParcelable(s9o.class.getClassLoader()));
            case 18:
                parcel.getClass();
                return new t9o(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (wds) parcel.readParcelable(t9o.class.getClassLoader()), (wds) parcel.readParcelable(t9o.class.getClassLoader()), (wds) parcel.readParcelable(t9o.class.getClassLoader()), (wds) parcel.readParcelable(t9o.class.getClassLoader()), parcel.readString(), parcel.readLong(), (q9o) parcel.readParcelable(t9o.class.getClassLoader()));
            case 19:
                parcel.getClass();
                parcel.readInt();
                return tno.a;
            case 20:
                parcel.getClass();
                return new eoo(parcel);
            case 21:
                parcel.getClass();
                return new kpo(jpo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
            case 22:
                parcel.getClass();
                return jpo.valueOf(parcel.readString());
            case 23:
                parcel.getClass();
                return new xqo(parcel.readString());
            case 24:
                parcel.getClass();
                parcel.readInt();
                return yqo.a;
            case 25:
                parcel.getClass();
                parcel.readInt();
                return zqo.a;
            case 26:
                parcel.getClass();
                return new j5p((oq) parcel.readParcelable(j5p.class.getClassLoader()), c0p.valueOf(parcel.readString()));
            case 27:
                parcel.getClass();
                return new k5p((c01) parcel.readParcelable(k5p.class.getClassLoader()), c0p.valueOf(parcel.readString()));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                return new l5p(p0p.valueOf(parcel.readString()), c0p.valueOf(parcel.readString()));
            default:
                parcel.getClass();
                return new m5p((cvl) parcel.readParcelable(m5p.class.getClassLoader()), p0p.valueOf(parcel.readString()), c0p.valueOf(parcel.readString()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new a9o[i];
            case 1:
                return new b9o[i];
            case 2:
                return new c9o[i];
            case 3:
                return new d9o[i];
            case 4:
                return new e9o[i];
            case 5:
                return new f9o[i];
            case 6:
                return new g9o[i];
            case 7:
                return new h9o[i];
            case 8:
                return new i9o[i];
            case 9:
                return new j9o[i];
            case 10:
                return new k9o[i];
            case 11:
                return new l9o[i];
            case 12:
                return new m9o[i];
            case 13:
                return new n9o[i];
            case 14:
                return new o9o[i];
            case 15:
                return new p9o[i];
            case 16:
                return new r9o[i];
            case 17:
                return new s9o[i];
            case 18:
                return new t9o[i];
            case 19:
                return new tno[i];
            case 20:
                return new eoo[i];
            case 21:
                return new kpo[i];
            case 22:
                return new jpo[i];
            case 23:
                return new xqo[i];
            case 24:
                return new yqo[i];
            case 25:
                return new zqo[i];
            case 26:
                return new j5p[i];
            case 27:
                return new k5p[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new l5p[i];
            default:
                return new m5p[i];
        }
    }
}
