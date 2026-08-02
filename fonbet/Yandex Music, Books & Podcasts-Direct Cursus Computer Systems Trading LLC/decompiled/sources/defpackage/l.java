package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes3.dex */
public final class l implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        zov zovVar;
        boolean z;
        ArrayList arrayList;
        Integer num;
        Integer num2;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        Class cls;
        mqs mqsVar;
        boolean z5;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new m(parcel.readString(), parcel.readString());
            case 1:
                parcel.getClass();
                return new ja(parcel);
            case 2:
                return ad.m[parcel.readInt()];
            case 3:
                parcel.getClass();
                return new se(parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                parcel.getClass();
                return new ff(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
            case 5:
                parcel.getClass();
                return new qh(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
            case 6:
                parcel.getClass();
                return new gj(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 7:
                parcel.getClass();
                xx3 xx3Var = (xx3) parcel.readParcelable(ln.class.getClassLoader());
                xfk xfkVar = (xfk) parcel.readParcelable(ln.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList3.add(parcel.readParcelable(ln.class.getClassLoader()));
                }
                xt0 xt0Var = (xt0) parcel.readParcelable(ln.class.getClassLoader());
                j8o createFromParcel = j8o.CREATOR.createFromParcel(parcel);
                boolean z6 = parcel.readInt() != 0;
                lmk createFromParcel2 = lmk.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                boolean z9 = parcel.readInt() != 0;
                ind indVar = (ind) parcel.readParcelable(ln.class.getClassLoader());
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                int readInt2 = parcel.readInt();
                boolean z10 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                dnd dndVar = (dnd) parcel.readParcelable(ln.class.getClassLoader());
                boolean z13 = parcel.readInt() != 0;
                LinkedHashMap linkedHashMap = null;
                zov valueOf = parcel.readInt() == 0 ? null : zov.valueOf(parcel.readString());
                boolean z14 = parcel.readInt() != 0;
                boolean z15 = parcel.readInt() != 0;
                Boolean valueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                if (parcel.readInt() == 0) {
                    zovVar = valueOf;
                    z = z6;
                } else {
                    int readInt3 = parcel.readInt();
                    zovVar = valueOf;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
                    boolean z16 = z6;
                    int i2 = 0;
                    while (i2 != readInt3) {
                        i2 = k.b(parcel, linkedHashMap2, parcel.readString(), i2, 1);
                        indVar = indVar;
                        xx3Var = xx3Var;
                    }
                    linkedHashMap = linkedHashMap2;
                    z = z16;
                }
                return new ln(xx3Var, xfkVar, arrayList3, xt0Var, createFromParcel, z, createFromParcel2, readString, readString2, z7, z8, z9, indVar, readString3, readString4, readInt2, z10, z11, z12, dndVar, z13, zovVar, z14, z15, valueOf2, linkedHashMap, parcel.readString(), z6w.valueOf(parcel.readString()));
            case 8:
                parcel.getClass();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                boolean z17 = parcel.readInt() != 0;
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                WarningContent valueOf3 = WarningContent.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                    num = null;
                } else {
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt4);
                    int i3 = 0;
                    while (i3 != readInt4) {
                        i3 = k.c(oq.CREATOR, parcel, arrayList4, i3, 1);
                    }
                    arrayList = arrayList4;
                    num = null;
                }
                String readString10 = parcel.readString();
                Integer num3 = num;
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                int readInt5 = parcel.readInt();
                String readString13 = parcel.readString();
                int readInt6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt6);
                int i4 = 0;
                while (true) {
                    boolean z18 = z17;
                    if (i4 == readInt6) {
                        CoverPath coverPath = (CoverPath) parcel.readParcelable(oq.class.getClassLoader());
                        Date date = (Date) parcel.readSerializable();
                        int readInt7 = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            num2 = num3;
                            z2 = true;
                        } else {
                            num2 = num3;
                            z2 = false;
                        }
                        CoverPath coverPath2 = (CoverPath) parcel.readParcelable(oq.class.getClassLoader());
                        String readString14 = parcel.readString();
                        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                        int readInt8 = parcel.readInt();
                        ArrayList arrayList6 = new ArrayList(readInt8);
                        int i5 = 0;
                        while (i5 != readInt8) {
                            i5 = k.c(zt.CREATOR, parcel, arrayList6, i5, 1);
                            readInt8 = readInt8;
                            readString5 = readString5;
                        }
                        String str2 = readString5;
                        Integer valueOf4 = parcel.readInt() == 0 ? num2 : Integer.valueOf(parcel.readInt());
                        Integer valueOf5 = parcel.readInt() == 0 ? num2 : Integer.valueOf(parcel.readInt());
                        ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
                        if (parcel.readInt() != 0) {
                            z3 = true;
                            str = str2;
                            z4 = true;
                        } else {
                            z3 = true;
                            str = str2;
                            z4 = false;
                        }
                        return new oq(str, readString6, readString7, z18, readString8, readString9, valueOf3, arrayList, readString10, readString11, readString12, readInt5, readString13, arrayList5, coverPath, date, readInt7, z2, coverPath2, readString14, createStringArrayList, arrayList6, valueOf4, valueOf5, createStringArrayList2, z4, parcel.readInt() != 0 ? z3 : false, parcel.readInt() != 0 ? z3 : false, parcel.readString());
                    }
                    i4 = k.c(zp2.CREATOR, parcel, arrayList5, i4, 1);
                    z17 = z18;
                    readInt6 = readInt6;
                }
            case 9:
                parcel.getClass();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                tq valueOf6 = tq.valueOf(parcel.readString());
                dud dudVar = (dud) parcel.readParcelable(uq.class.getClassLoader());
                String readString17 = parcel.readString();
                String readString18 = parcel.readString();
                mqs mqsVar2 = (mqs) parcel.readParcelable(uq.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    cls = uq.class;
                    mqsVar = mqsVar2;
                    z5 = true;
                } else {
                    cls = uq.class;
                    mqsVar = mqsVar2;
                    z5 = false;
                }
                return new uq(readString15, readString16, valueOf6, dudVar, readString17, readString18, mqsVar, z5, (sq) parcel.readParcelable(cls.getClassLoader()), parcel.readInt() != 0);
            case 10:
                parcel.getClass();
                parcel.readInt();
                return qq.a;
            case 11:
                parcel.getClass();
                parcel.readInt();
                return rq.a;
            case 12:
                parcel.getClass();
                return new lt(parcel.readString(), Album$AlbumType.valueOf(parcel.readString()), parcel.readString(), WarningContent.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : u9b.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? gd6.CREATOR.createFromParcel(parcel) : null);
            case 13:
                parcel.getClass();
                return new zt(parcel.readString(), parcel.readString());
            case 14:
                parcel.getClass();
                return new hy(parcel.readString(), parcel.readString(), (dud) parcel.readParcelable(hy.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, (ky) parcel.readParcelable(hy.class.getClassLoader()), parcel.readString());
            case 15:
                parcel.getClass();
                parcel.readInt();
                return iy.a;
            case 16:
                parcel.getClass();
                parcel.readInt();
                return jy.a;
            case 17:
                parcel.getClass();
                return new k10(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString());
            case 18:
                parcel.getClass();
                return new ma0(lf3.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 19:
                cs0 cs0Var = new cs0(parcel);
                cs0Var.a = parcel.readByte() != 0;
                return cs0Var;
            case 20:
                parcel.getClass();
                return new xt0(parcel.readString(), parcel.readString(), parcel.readString());
            case 21:
                parcel.getClass();
                return ou0.valueOf(parcel.readString());
            case 22:
                parcel.getClass();
                return new a01(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 23:
                parcel.getClass();
                String readString19 = parcel.readString();
                String readString20 = parcel.readString();
                boolean z19 = parcel.readInt() != 0;
                boolean z20 = parcel.readInt() != 0;
                boolean z21 = parcel.readInt() != 0;
                b01 createFromParcel3 = parcel.readInt() == 0 ? null : b01.CREATOR.createFromParcel(parcel);
                int readInt9 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt10 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt10);
                    int i6 = 0;
                    while (i6 != readInt10) {
                        i6 = k.c(c01.CREATOR, parcel, arrayList2, i6, 1);
                    }
                }
                return new c01(readString19, readString20, z19, z20, z21, createFromParcel3, readInt9, arrayList2, parcel.readString(), a01.CREATOR.createFromParcel(parcel), (CoverPath) parcel.readParcelable(c01.class.getClassLoader()), (CoverPath) parcel.readParcelable(c01.class.getClassLoader()), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt() != 0 ? x41.valueOf(parcel.readString()) : null, parcel.readInt() != 0);
            case 24:
                parcel.getClass();
                return new b01(parcel.readString());
            case 25:
                parcel.getClass();
                return new l31(parcel.readString());
            case 26:
                parcel.getClass();
                return new u51(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : u9b.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : u9b.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? gd6.CREATOR.createFromParcel(parcel) : null);
            case 27:
                parcel.getClass();
                return new j71(b81.valueOf(parcel.readString()), (u51) parcel.readParcelable(j71.class.getClassLoader()));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                return new lh1((u51) parcel.readParcelable(lh1.class.getClassLoader()), qi1.valueOf(parcel.readString()), (dud) parcel.readParcelable(lh1.class.getClassLoader()), parcel.readString());
            default:
                parcel.getClass();
                return new fk1(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new m[i];
            case 1:
                return new ja[i];
            case 2:
                return new ad[i];
            case 3:
                return new se[i];
            case 4:
                return new ff[i];
            case 5:
                return new qh[i];
            case 6:
                return new gj[i];
            case 7:
                return new ln[i];
            case 8:
                return new oq[i];
            case 9:
                return new uq[i];
            case 10:
                return new qq[i];
            case 11:
                return new rq[i];
            case 12:
                return new lt[i];
            case 13:
                return new zt[i];
            case 14:
                return new hy[i];
            case 15:
                return new iy[i];
            case 16:
                return new jy[i];
            case 17:
                return new k10[i];
            case 18:
                return new ma0[i];
            case 19:
                return new cs0[i];
            case 20:
                return new xt0[i];
            case 21:
                return new ou0[i];
            case 22:
                return new a01[i];
            case 23:
                return new c01[i];
            case 24:
                return new b01[i];
            case 25:
                return new l31[i];
            case 26:
                return new u51[i];
            case 27:
                return new j71[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new lh1[i];
            default:
                return new fk1[i];
        }
    }
}
