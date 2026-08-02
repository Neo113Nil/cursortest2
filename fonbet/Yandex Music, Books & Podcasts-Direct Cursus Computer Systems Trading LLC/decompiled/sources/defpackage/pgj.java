package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.ParcelableVolumeInfo;
import androidx.versionedparcelable.ParcelImpl;
import com.yandex.pulse.metrics.o;
import java.math.BigDecimal;
import java.util.LinkedHashSet;

/* loaded from: classes5.dex */
public final class pgj implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ pgj(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return qgj.a;
            case 1:
                parcel.getClass();
                return new uwj(parcel.readString());
            case 2:
                parcel.getClass();
                return new vwj(parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString());
            case 3:
                parcel.getClass();
                return new xwj(parcel.readString(), (wwj) parcel.readParcelable(xwj.class.getClassLoader()));
            case 4:
                parcel.getClass();
                return new c4k(parcel.readInt());
            case 5:
                return new ParcelImpl(parcel);
            case 6:
                parcel.getClass();
                return new r6k(parcel.readString(), parcel.readString());
            case 7:
                return new t6k(parcel.readFloat());
            case 8:
                return new u6k(parcel.readInt());
            case 9:
                return new v6k(parcel.readLong());
            case 10:
                y6k y6kVar = new y6k();
                y6kVar.a = parcel.readInt();
                y6kVar.c = parcel.readInt();
                y6kVar.d = parcel.readInt();
                y6kVar.e = parcel.readInt();
                y6kVar.b = parcel.readInt();
                return y6kVar;
            case 11:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.a = parcel.readInt();
                parcelableVolumeInfo.c = parcel.readInt();
                parcelableVolumeInfo.d = parcel.readInt();
                parcelableVolumeInfo.e = parcel.readInt();
                parcelableVolumeInfo.b = parcel.readInt();
                return parcelableVolumeInfo;
            case 12:
                parcel.getClass();
                return new r8k(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : t7w.valueOf(parcel.readString()));
            case 13:
                parcel.getClass();
                return new eck(parcel.readString());
            case 14:
                parcel.getClass();
                return new jdk(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 15:
                parcel.getClass();
                return new mek((bg2) parcel.readParcelable(mek.class.getClassLoader()), (vgk) parcel.readParcelable(mek.class.getClassLoader()));
            case 16:
                parcel.getClass();
                return new bfk(zek.valueOf(parcel.readString()), afk.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? yek.valueOf(parcel.readString()) : null);
            case 17:
                parcel.getClass();
                return new ffk(hw3.CREATOR.createFromParcel(parcel), ix3.valueOf(parcel.readString()), parcel.readString(), dm2.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : c5c.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            case 18:
                parcel.getClass();
                parcel.readInt();
                return gfk.a;
            case 19:
                parcel.getClass();
                parcel.readInt();
                return hfk.a;
            case 20:
                parcel.getClass();
                return new qfk(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, cm2.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), ufk.valueOf(parcel.readString()), (b5c) parcel.readParcelable(qfk.class.getClassLoader()), (r8k) parcel.readParcelable(qfk.class.getClassLoader()), (iae) parcel.readParcelable(qfk.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            case 21:
                parcel.getClass();
                parcel.readInt();
                return ifk.a;
            case 22:
                parcel.getClass();
                parcel.readInt();
                return jfk.a;
            case 23:
                parcel.getClass();
                parcel.readInt();
                return kfk.a;
            case 24:
                parcel.getClass();
                parcel.readInt();
                return lfk.a;
            case 25:
                parcel.getClass();
                return new mfk(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(mfk.class.getClassLoader()), (Uri) parcel.readParcelable(mfk.class.getClassLoader()), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            case 26:
                parcel.getClass();
                parcel.readInt();
                return nfk.a;
            case 27:
                parcel.getClass();
                parcel.readInt();
                return ofk.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                return new pfk(parcel.readString(), parcel.readInt() != 0, u7w.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c5c.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            default:
                parcel.getClass();
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                boolean z6 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i = 0; i != readInt; i++) {
                    linkedHashSet.add(u7w.CREATOR.createFromParcel(parcel));
                }
                return new xfk(z, z2, z3, z4, z5, z6, linkedHashSet);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new qgj[i];
            case 1:
                return new uwj[i];
            case 2:
                return new vwj[i];
            case 3:
                return new xwj[i];
            case 4:
                return new c4k[i];
            case 5:
                return new ParcelImpl[i];
            case 6:
                return new r6k[i];
            case 7:
                return new t6k[i];
            case 8:
                return new u6k[i];
            case 9:
                return new v6k[i];
            case 10:
                return new y6k[i];
            case 11:
                return new ParcelableVolumeInfo[i];
            case 12:
                return new r8k[i];
            case 13:
                return new eck[i];
            case 14:
                return new jdk[i];
            case 15:
                return new mek[i];
            case 16:
                return new bfk[i];
            case 17:
                return new ffk[i];
            case 18:
                return new gfk[i];
            case 19:
                return new hfk[i];
            case 20:
                return new qfk[i];
            case 21:
                return new ifk[i];
            case 22:
                return new jfk[i];
            case 23:
                return new kfk[i];
            case 24:
                return new lfk[i];
            case 25:
                return new mfk[i];
            case 26:
                return new nfk[i];
            case 27:
                return new ofk[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new pfk[i];
            default:
                return new xfk[i];
        }
    }
}
