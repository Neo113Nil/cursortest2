package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import com.appsflyer.internal.k;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes4.dex */
public final class tgk implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ tgk(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b5  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        ArrayList arrayList;
        int i;
        lf1 lf1Var;
        boolean z2;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return ugk.valueOf(parcel.readString());
            case 1:
                parcel.getClass();
                return new vgk(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : hd.valueOf(parcel.readString()), parcel.readString(), (syh) parcel.readParcelable(vgk.class.getClassLoader()), (yhk) parcel.readParcelable(vgk.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 2:
                parcel.getClass();
                return new wgk(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(wgk.class.getClassLoader()), parcel.readInt() == 0 ? null : id.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : tyh.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? eck.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
            case 3:
                parcel.getClass();
                return new ehk(parcel.readString());
            case 4:
                parcel.getClass();
                return new fhk(parcel.readString());
            case 5:
                parcel.getClass();
                return new yhk(parcel.readString());
            case 6:
                parcel.getClass();
                return new lik(vik.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            case 7:
                parcel.getClass();
                return new kmk(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 8:
                parcel.getClass();
                return new lmk(mmk.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 9:
                parcel.getClass();
                return new pmk(parcel.readInt() != 0, lmk.CREATOR.createFromParcel(parcel));
            case 10:
                parcel.getClass();
                return new qmk(smk.CREATOR.createFromParcel(parcel), rrl.CREATOR.createFromParcel(parcel));
            case 11:
                parcel.getClass();
                String readString = parcel.readString();
                cvl createFromParcel = cvl.CREATOR.createFromParcel(parcel);
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                boolean z4 = parcel.readInt() == 0 ? z : true;
                tn6 tn6Var = (tn6) parcel.readSerializable();
                tn6 tn6Var2 = (tn6) parcel.readSerializable();
                tn6 tn6Var3 = (tn6) parcel.readSerializable();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Parcelable.Creator<ece> creator = ece.CREATOR;
                return new smk(readString, createFromParcel, z3, z4, tn6Var, tn6Var2, tn6Var3, readString2, readString3, readString4, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            case 12:
                return new i6l(parcel);
            case 13:
                return new PlaybackStateCompat(parcel);
            case 14:
                return new h6l(parcel);
            case 15:
                parcel.getClass();
                return new v9l(parcel.readInt());
            case 16:
                parcel.getClass();
                cvl createFromParcel2 = cvl.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i2 = 0;
                int i3 = 0;
                while (i3 != readInt) {
                    i3 = k.c(t2m.CREATOR, parcel, arrayList2, i3, 1);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(readInt2);
                    while (i2 != readInt2) {
                        i2 = k.c(mqs.CREATOR, parcel, arrayList3, i2, 1);
                    }
                    arrayList = arrayList3;
                }
                return new rrl(createFromParcel2, arrayList2, arrayList);
            case 17:
                parcel.getClass();
                return new eul(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : u9b.CREATOR.createFromParcel(parcel), parcel.readString());
            case 18:
                parcel.getClass();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                drt createFromParcel3 = drt.CREATOR.createFromParcel(parcel);
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                boolean z5 = true;
                if (parcel.readInt() == 0) {
                    z5 = false;
                }
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                int readInt7 = parcel.readInt();
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                byr byrVar = (byr) parcel.readParcelable(cvl.class.getClassLoader());
                long readLong3 = parcel.readLong();
                Date date = (Date) parcel.readSerializable();
                Date date2 = (Date) parcel.readSerializable();
                tn6 tn6Var4 = (tn6) parcel.readSerializable();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                if (parcel.readInt() != 0) {
                    String readString9 = parcel.readString();
                    if (readString9 != null) {
                        if (readString9.equals("PLAYLIST_OF_THE_DAY")) {
                            i = 1;
                        } else if (readString9.equals("DEJAVU")) {
                            i = 2;
                        } else if (readString9.equals("PREMIERE")) {
                            i = 3;
                        } else if (readString9.equals("MISSED_LIKES")) {
                            i = 4;
                        } else if (readString9.equals("EDITORIAL")) {
                            i = 5;
                        } else if (readString9.equals("UNKNOWN_TYPE")) {
                            i = 6;
                        } else if (readString9.equals("REWIND_2024")) {
                            i = 7;
                        } else {
                            xq0.x("No enum constant ru.yandex.music.data.playlist.AutoPlaylistType.".concat(readString9));
                        }
                        String readString10 = parcel.readString();
                        String readString11 = parcel.readString();
                        u4h createFromParcel4 = parcel.readInt() != 0 ? null : u4h.CREATOR.createFromParcel(parcel);
                        if (parcel.readInt() == 0) {
                            lf1Var = null;
                            z2 = true;
                        } else {
                            lf1Var = null;
                            z2 = false;
                        }
                        return new cvl(readString5, readString6, createFromParcel3, readInt3, readInt4, z5, readInt5, readInt6, readInt7, readLong, readLong2, byrVar, readLong3, date, date2, tn6Var4, readString7, readString8, i, readString10, readString11, createFromParcel4, z2, parcel.readString(), parcel.readInt() == 0, parcel.readInt() != 0 ? lf1Var : lf1.valueOf(parcel.readString()), parcel.readInt() != 0 ? lf1Var : Integer.valueOf(parcel.readInt()));
                    }
                    jj4.j("Name is null");
                }
                i = 0;
                String readString102 = parcel.readString();
                String readString112 = parcel.readString();
                u4h createFromParcel42 = parcel.readInt() != 0 ? null : u4h.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                }
                return new cvl(readString5, readString6, createFromParcel3, readInt3, readInt4, z5, readInt5, readInt6, readInt7, readLong, readLong2, byrVar, readLong3, date, date2, tn6Var4, readString7, readString8, i, readString102, readString112, createFromParcel42, z2, parcel.readString(), parcel.readInt() == 0, parcel.readInt() != 0 ? lf1Var : lf1.valueOf(parcel.readString()), parcel.readInt() != 0 ? lf1Var : Integer.valueOf(parcel.readInt()));
            case 19:
                parcel.getClass();
                return new nvl(parcel.readString(), parcel.readString());
            case 20:
                parcel.getClass();
                return new exl((lxl) parcel.readParcelable(exl.class.getClassLoader()), (dud) parcel.readParcelable(exl.class.getClassLoader()), parcel.readString(), (oxl) parcel.readParcelable(exl.class.getClassLoader()));
            case 21:
                parcel.getClass();
                parcel.readInt();
                return fxl.a;
            case 22:
                parcel.getClass();
                return new gxl(parcel.readLong());
            case 23:
                parcel.getClass();
                return new hxl(parcel.readString(), parcel.readString());
            case 24:
                parcel.getClass();
                return new ixl(parcel.readString(), parcel.readString());
            case 25:
                parcel.getClass();
                return new jxl(parcel.readString(), parcel.readString());
            case 26:
                parcel.getClass();
                return new kxl(parcel.readString());
            case 27:
                parcel.getClass();
                parcel.readInt();
                return mxl.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                parcel.readInt();
                return nxl.a;
            default:
                parcel.getClass();
                return new i1m(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt(), (Date) parcel.readSerializable());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ugk[i];
            case 1:
                return new vgk[i];
            case 2:
                return new wgk[i];
            case 3:
                return new ehk[i];
            case 4:
                return new fhk[i];
            case 5:
                return new yhk[i];
            case 6:
                return new lik[i];
            case 7:
                return new kmk[i];
            case 8:
                return new lmk[i];
            case 9:
                return new pmk[i];
            case 10:
                return new qmk[i];
            case 11:
                return new smk[i];
            case 12:
                return new i6l[i];
            case 13:
                return new PlaybackStateCompat[i];
            case 14:
                return new h6l[i];
            case 15:
                return new v9l[i];
            case 16:
                return new rrl[i];
            case 17:
                return new eul[i];
            case 18:
                return new cvl[i];
            case 19:
                return new nvl[i];
            case 20:
                return new exl[i];
            case 21:
                return new fxl[i];
            case 22:
                return new gxl[i];
            case 23:
                return new hxl[i];
            case 24:
                return new ixl[i];
            case 25:
                return new jxl[i];
            case 26:
                return new kxl[i];
            case 27:
                return new mxl[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new nxl[i];
            default:
                return new i1m[i];
        }
    }
}
