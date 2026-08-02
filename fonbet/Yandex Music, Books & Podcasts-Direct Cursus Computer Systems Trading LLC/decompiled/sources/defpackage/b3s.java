package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import com.yandex.pulse.metrics.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import ru.kinopoisk.player.core.ContentId;
import ru.kinopoisk.player.core.VideoTrackData;
import ru.kinopoisk.sdk.easylogin.internal.C7;
import ru.kinopoisk.sdk.easylogin.internal.D4;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes5.dex */
public final class b3s implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ b3s(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Class cls;
        ArrayList arrayList;
        CoverPath coverPath;
        oq oqVar;
        ArrayList arrayList2;
        nxs createFromParcel;
        ArrayList arrayList3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new d3s(parcel.readString(), parcel.readString(), parcel.readString());
            case 1:
                parcel.getClass();
                return new m6s(parcel.readInt() == 0 ? null : gj.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            case 2:
                parcel.getClass();
                return new v7s(parcel.readString(), (lik) parcel.readParcelable(v7s.class.getClassLoader()), parcel.readString());
            case 3:
                parcel.getClass();
                return new uds(parcel.readInt());
            case 4:
                parcel.getClass();
                return new vds(parcel.readString());
            case 5:
                parcel.getClass();
                return mls.valueOf(parcel.readString());
            case 6:
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                k10 createFromParcel2 = k10.CREATOR.createFromParcel(parcel);
                long readLong = parcel.readLong();
                int readInt = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = k.c(zp2.CREATOR, parcel, arrayList4, i, 1);
                }
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean z6 = parcel.readInt() != 0;
                dg2 createFromParcel3 = dg2.CREATOR.createFromParcel(parcel);
                boolean z7 = parcel.readInt() != 0;
                WarningContent valueOf = WarningContent.valueOf(parcel.readString());
                boolean z8 = parcel.readInt() != 0;
                hqs createFromParcel4 = parcel.readInt() == 0 ? null : hqs.CREATOR.createFromParcel(parcel);
                CoverPath coverPath2 = (CoverPath) parcel.readParcelable(mqs.class.getClassLoader());
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                oq createFromParcel5 = parcel.readInt() == 0 ? null : oq.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    cls = mqs.class;
                    coverPath = coverPath2;
                    arrayList = null;
                    oqVar = createFromParcel5;
                } else {
                    int readInt2 = parcel.readInt();
                    cls = mqs.class;
                    arrayList = new ArrayList(readInt2);
                    coverPath = coverPath2;
                    int i2 = 0;
                    while (true) {
                        oqVar = createFromParcel5;
                        if (i2 != readInt2) {
                            i2 = k.c(c01.CREATOR, parcel, arrayList, i2, 1);
                            createFromParcel5 = oqVar;
                            readInt2 = readInt2;
                        }
                    }
                }
                i1m createFromParcel6 = parcel.readInt() == 0 ? null : i1m.CREATOR.createFromParcel(parcel);
                CoverPath coverPath3 = (CoverPath) parcel.readParcelable(cls.getClassLoader());
                Date date = (Date) parcel.readSerializable();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean z9 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    arrayList2 = arrayList;
                    createFromParcel = null;
                } else {
                    arrayList2 = arrayList;
                    createFromParcel = nxs.CREATOR.createFromParcel(parcel);
                }
                nxs nxsVar = createFromParcel;
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                qvs createFromParcel7 = parcel.readInt() == 0 ? null : qvs.CREATOR.createFromParcel(parcel);
                qvs createFromParcel8 = parcel.readInt() == 0 ? null : qvs.CREATOR.createFromParcel(parcel);
                ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                boolean z10 = parcel.readInt() != 0;
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = k.b(parcel, linkedHashMap, parcel.readString(), i3, 1);
                    readInt3 = readInt3;
                    date = date;
                }
                return new mqs(readString, readString2, readString3, createFromParcel2, readLong, arrayList4, readString4, readString5, readString6, z6, createFromParcel3, z7, valueOf, z8, createFromParcel4, coverPath, readString7, readString8, readString9, oqVar, arrayList2, createFromParcel6, coverPath3, date, readString10, readString11, z9, nxsVar, createStringArrayList, createFromParcel7, createFromParcel8, createStringArrayList2, z10, linkedHashMap, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readInt() != 0);
            case 7:
                parcel.getClass();
                return new hqs(parcel.readInt() != 0, parcel.readInt() != 0);
            case 8:
                parcel.getClass();
                return new zus(parcel.readInt());
            case 9:
                parcel.getClass();
                return new qvs(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
            case 10:
                parcel.getClass();
                return new nxs(parcel.readFloat(), parcel.readFloat());
            case 11:
                parcel.getClass();
                return new cbt(parcel.readString(), parcel.createStringArrayList());
            case 12:
                parcel.getClass();
                return new cjt(parcel.readInt() == 0 ? null : d9g.valueOf(parcel.readString()), parcel.readInt() != 0 ? zpd.valueOf(parcel.readString()) : null, rht.valueOf(parcel.readString()));
            case 13:
                parcel.getClass();
                return new gjt(parcel.readString(), parcel.readString(), cjt.CREATOR.createFromParcel(parcel));
            case 14:
                parcel.getClass();
                return ujt.valueOf(parcel.readString());
            case 15:
                parcel.getClass();
                return new vjt((gjt) parcel.readParcelable(vjt.class.getClassLoader()), (ujt) parcel.readParcelable(vjt.class.getClassLoader()));
            case 16:
                parcel.getClass();
                return new umt(parcel.readInt());
            case 17:
                parcel.getClass();
                return new pot(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(pot.class.getClassLoader()), (File) parcel.readSerializable(), parcel.readLong());
            case 18:
                parcel.getClass();
                return new drt(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 19:
                parcel.getClass();
                return new r1u(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                parcel.getClass();
                return new s1u(parcel.readString(), parcel.readString(), parcel.readString());
            case 21:
                parcel.getClass();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                CoverPath coverPath4 = (CoverPath) parcel.readParcelable(x1u.class.getClassLoader());
                String readString15 = parcel.readString();
                long readLong2 = parcel.readLong();
                ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
                int readInt4 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = k.c(c01.CREATOR, parcel, arrayList5, i4, 1);
                }
                boolean z11 = parcel.readInt() != 0;
                int readInt5 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt5);
                for (int i5 = 0; i5 != readInt5; i5++) {
                    arrayList6.add(h94.valueOf(parcel.readString()));
                }
                int readInt6 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt6);
                int i6 = 0;
                while (i6 != readInt6) {
                    i6 = k.c(hs5.CREATOR, parcel, arrayList7, i6, 1);
                }
                return new x1u(readString12, readString13, readString14, coverPath4, readString15, readLong2, createStringArrayList3, arrayList5, z11, arrayList6, arrayList7, parcel.readInt() == 0 ? null : j1g.valueOf(parcel.readString()), (Date) parcel.readSerializable());
            case 22:
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt7 = parcel.readInt();
                    ArrayList arrayList8 = new ArrayList(readInt7);
                    for (int i7 = 0; i7 != readInt7; i7++) {
                        arrayList8.add(parcel.readParcelable(e8u.class.getClassLoader()));
                    }
                    arrayList3 = arrayList8;
                }
                return new e8u(arrayList3, parcel.createStringArrayList(), parcel.readInt(), wmn.valueOf(parcel.readString()));
            case 23:
                parcel.getClass();
                return new VideoTrackData((ContentId) parcel.readParcelable(VideoTrackData.class.getClassLoader()), parcel.readLong(), parcel.readString(), parcel.readString(), (D4) parcel.readSerializable(), parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), C7.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 24:
                return new jcv(parcel);
            case 25:
                parcel.getClass();
                return new odv(parcel.readString(), parcel.readInt() != 0);
            case 26:
                pev pevVar = new pev(parcel);
                pevVar.e = parcel.readString();
                return pevVar;
            case 27:
                parcel.getClass();
                boolean z12 = false;
                boolean z13 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z12 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z13 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                boolean z14 = z;
                if (parcel.readInt() != 0) {
                    z5 = z4;
                } else {
                    z5 = z4;
                    z4 = z14;
                }
                String readString16 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z5 = z14;
                }
                return new xfv(readString16, z12, z13, z2, z3, z4, z5);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                parcel.readInt();
                return mnv.a;
            default:
                parcel.getClass();
                return new nnv((aab) parcel.readParcelable(nnv.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new d3s[i];
            case 1:
                return new m6s[i];
            case 2:
                return new v7s[i];
            case 3:
                return new uds[i];
            case 4:
                return new vds[i];
            case 5:
                return new mls[i];
            case 6:
                return new mqs[i];
            case 7:
                return new hqs[i];
            case 8:
                return new zus[i];
            case 9:
                return new qvs[i];
            case 10:
                return new nxs[i];
            case 11:
                return new cbt[i];
            case 12:
                return new cjt[i];
            case 13:
                return new gjt[i];
            case 14:
                return new ujt[i];
            case 15:
                return new vjt[i];
            case 16:
                return new umt[i];
            case 17:
                return new pot[i];
            case 18:
                return new drt[i];
            case 19:
                return new r1u[i];
            case 20:
                return new s1u[i];
            case 21:
                return new x1u[i];
            case 22:
                return new e8u[i];
            case 23:
                return new VideoTrackData[i];
            case 24:
                return new jcv[i];
            case 25:
                return new odv[i];
            case 26:
                return new pev[i];
            case 27:
                return new xfv[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new mnv[i];
            default:
                return new nnv[i];
        }
    }
}
