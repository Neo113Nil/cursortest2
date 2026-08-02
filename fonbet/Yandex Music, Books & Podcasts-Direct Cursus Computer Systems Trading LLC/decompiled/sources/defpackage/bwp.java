package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.pulse.metrics.o;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes.dex */
public final class bwp implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new cwp(parcel);
            case 1:
                parcel.getClass();
                return new zwp((jxp) parcel.readParcelable(zwp.class.getClassLoader()), co6.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 2:
                parcel.getClass();
                return new dxp(parcel.readString(), Album$AlbumType.valueOf(parcel.readString()));
            case 3:
                parcel.getClass();
                return new exp(parcel.readString());
            case 4:
                parcel.getClass();
                return new fxp(parcel.readString());
            case 5:
                parcel.getClass();
                return new gxp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
            case 6:
                parcel.getClass();
                return new hxp(parcel.readString(), parcel.readString(), lqs.valueOf(parcel.readString()));
            case 7:
                parcel.getClass();
                return new ixp(parcel.readString());
            case 8:
                return new oxp(parcel);
            case 9:
                return new rxp(parcel);
            case 10:
                return new sxp(parcel);
            case 11:
                return new txp(parcel);
            case 12:
                return new vxp(parcel);
            case 13:
                parcel.getClass();
                return new tiq(parcel.readString());
            case 14:
                parcel.getClass();
                return new dqq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : c0p.valueOf(parcel.readString()));
            case 15:
                parcel.getClass();
                parcel.readInt();
                return tuq.a;
            case 16:
                parcel.getClass();
                return new qvq(parcel.readString());
            case 17:
                parcel.getClass();
                parcel.readInt();
                return wvq.a;
            case 18:
                parcel.getClass();
                return new awq(parcel.readString());
            case 19:
                parcel.getClass();
                return new bwq(parcel.readString());
            case 20:
                parcel.getClass();
                parcel.readInt();
                return dwq.a;
            case 21:
                jar jarVar = new jar();
                jarVar.a = parcel.readInt();
                jarVar.b = parcel.readInt();
                jarVar.d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    jarVar.c = iArr;
                    parcel.readIntArray(iArr);
                }
                return jarVar;
            case 22:
                kar karVar = new kar();
                karVar.a = parcel.readInt();
                karVar.b = parcel.readInt();
                int readInt2 = parcel.readInt();
                karVar.c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    karVar.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                karVar.e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    karVar.f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                karVar.h = parcel.readInt() == 1;
                karVar.i = parcel.readInt() == 1;
                karVar.j = parcel.readInt() == 1;
                karVar.g = parcel.readArrayList(jar.class.getClassLoader());
                return karVar;
            case 23:
                return new kjr(parcel);
            case 24:
                return new evr(parcel);
            case 25:
                parcel.getClass();
                parcel.readInt();
                return wxr.b;
            case 26:
                parcel.getClass();
                parcel.readInt();
                return xxr.b;
            case 27:
                parcel.getClass();
                parcel.readInt();
                return yxr.b;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                return new zxr(parcel.readInt());
            default:
                parcel.getClass();
                parcel.readInt();
                return ayr.b;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new cwp[i];
            case 1:
                return new zwp[i];
            case 2:
                return new dxp[i];
            case 3:
                return new exp[i];
            case 4:
                return new fxp[i];
            case 5:
                return new gxp[i];
            case 6:
                return new hxp[i];
            case 7:
                return new ixp[i];
            case 8:
                return new oxp[i];
            case 9:
                return new rxp[i];
            case 10:
                return new sxp[i];
            case 11:
                return new txp[i];
            case 12:
                return new vxp[i];
            case 13:
                return new tiq[i];
            case 14:
                return new dqq[i];
            case 15:
                return new tuq[i];
            case 16:
                return new qvq[i];
            case 17:
                return new wvq[i];
            case 18:
                return new awq[i];
            case 19:
                return new bwq[i];
            case 20:
                return new dwq[i];
            case 21:
                return new jar[i];
            case 22:
                return new kar[i];
            case 23:
                return new kjr[i];
            case 24:
                return new evr[i];
            case 25:
                return new wxr[i];
            case 26:
                return new xxr[i];
            case 27:
                return new yxr[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new zxr[i];
            default:
                return new ayr[i];
        }
    }
}
