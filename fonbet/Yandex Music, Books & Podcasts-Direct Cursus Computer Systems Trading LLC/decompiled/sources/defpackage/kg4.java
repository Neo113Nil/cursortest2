package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import com.yandex.pulse.metrics.o;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import ru.kinopoisk.cast.ContentData;
import ru.kinopoisk.player.core.ContentId;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes5.dex */
public final class kg4 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ kg4(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                parcel.readInt();
                return lg4.a;
            case 1:
                parcel.getClass();
                return new mg4(parcel.readString());
            case 2:
                parcel.getClass();
                parcel.readInt();
                return ng4.a;
            case 3:
                parcel.getClass();
                return o15.valueOf(parcel.readString());
            case 4:
                parcel.getClass();
                return new x85(parcel.readString(), parcel.readString());
            case 5:
                parcel.getClass();
                return new zh5(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 6:
                parcel.getClass();
                return new rr5(parcel.readString(), parcel.readString());
            case 7:
                parcel.getClass();
                return new hs5(gs5.valueOf(parcel.readString()), parcel.readString());
            case 8:
                parcel.getClass();
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = k.c(f5i.CREATOR, parcel, arrayList, i2, 1);
                }
                String readString2 = parcel.readString();
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i3 = 0; i3 != readInt2; i3++) {
                    arrayList2.add(parcel.readParcelable(us5.class.getClassLoader()));
                }
                uy5 createFromParcel = parcel.readInt() == 0 ? null : uy5.CREATOR.createFromParcel(parcel);
                String readString3 = parcel.readString();
                Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = k.c(us5.CREATOR, parcel, arrayList3, i, 1);
                }
                return new us5(readString, arrayList, readString2, arrayList2, createFromParcel, readString3, valueOf, zonedDateTime, readString4, readString5, readString6, readString7, arrayList3, parcel.readString(), parcel.readString(), parcel.readString(), ru5.CREATOR.createFromParcel(parcel));
            case 9:
                parcel.getClass();
                return new vs5(parcel.readString(), parcel.readString(), (dud) parcel.readParcelable(vs5.class.getClassLoader()));
            case 10:
                parcel.getClass();
                return new ru5(parcel.readString());
            case 11:
                parcel.getClass();
                return su5.valueOf(parcel.readString());
            case 12:
                parcel.getClass();
                return new uy5(parcel.readInt(), parcel.readString(), parcel.readString());
            case 13:
                parcel.getClass();
                return g86.valueOf(parcel.readString());
            case 14:
                parcel.getClass();
                return new ContentData((ContentId) parcel.readParcelable(ContentData.class.getClassLoader()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 15:
                parcel.getClass();
                parcel.readInt();
                return vc6.a;
            case 16:
                parcel.getClass();
                parcel.readInt();
                return wc6.a;
            case 17:
                parcel.getClass();
                parcel.readInt();
                return xc6.a;
            case 18:
                parcel.getClass();
                return new yc6(parcel.readString());
            case 19:
                parcel.getClass();
                parcel.readInt();
                return zc6.a;
            case 20:
                parcel.getClass();
                int readInt4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = k.c(hs5.CREATOR, parcel, arrayList4, i4, 1);
                }
                int readInt5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt5);
                for (int i5 = 0; i5 != readInt5; i5++) {
                    arrayList5.add(h94.valueOf(parcel.readString()));
                }
                return new gd6(arrayList4, arrayList5, parcel.readInt() != 0);
            case 21:
                parcel.getClass();
                return new co6((CoverPath) parcel.readParcelable(co6.class.getClassLoader()), qo6.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            case 22:
                jx6 jx6Var = new jx6(parcel);
                jx6Var.f = "";
                jx6Var.e = parcel.readString();
                return jx6Var;
            case 23:
                parcel.getClass();
                return new fz6(parcel.readInt(), parcel.readString(), parcel.readString());
            case 24:
                parcel.getClass();
                return new gz6((ffk) parcel.readParcelable(gz6.class.getClassLoader()));
            case 25:
                return new vd7(parcel.readLong());
            case 26:
                parcel.getClass();
                return new rh7(parcel.readString());
            case 27:
                parcel.getClass();
                return new fi7(parcel.readString(), parcel.readBundle(fi7.class.getClassLoader()), parcel.readInt() != 0);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                parcel.readInt();
                return gi7.a;
            default:
                parcel.getClass();
                return new hi7(parcel.createStringArrayList(), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new lg4[i];
            case 1:
                return new mg4[i];
            case 2:
                return new ng4[i];
            case 3:
                return new o15[i];
            case 4:
                return new x85[i];
            case 5:
                return new zh5[i];
            case 6:
                return new rr5[i];
            case 7:
                return new hs5[i];
            case 8:
                return new us5[i];
            case 9:
                return new vs5[i];
            case 10:
                return new ru5[i];
            case 11:
                return new su5[i];
            case 12:
                return new uy5[i];
            case 13:
                return new g86[i];
            case 14:
                return new ContentData[i];
            case 15:
                return new vc6[i];
            case 16:
                return new wc6[i];
            case 17:
                return new xc6[i];
            case 18:
                return new yc6[i];
            case 19:
                return new zc6[i];
            case 20:
                return new gd6[i];
            case 21:
                return new co6[i];
            case 22:
                return new jx6[i];
            case 23:
                return new fz6[i];
            case 24:
                return new gz6[i];
            case 25:
                return new vd7[i];
            case 26:
                return new rh7[i];
            case 27:
                return new fi7[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new gi7[i];
            default:
                return new hi7[i];
        }
    }
}
