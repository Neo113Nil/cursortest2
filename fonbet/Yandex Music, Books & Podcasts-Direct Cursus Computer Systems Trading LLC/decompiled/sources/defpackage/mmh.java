package defpackage;

import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import com.yandex.pulse.metrics.o;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class mmh implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ mmh(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Class cls;
        boolean z;
        switch (this.a) {
            case 0:
                return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
            case 1:
                return new ioh(parcel);
            case 2:
                return new MediaMetadataCompat(parcel);
            case 3:
                return new ksh(parcel);
            case 4:
                return new MediaSessionCompat$QueueItem(parcel);
            case 5:
                lsh lshVar = new lsh();
                lshVar.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return lshVar;
            case 6:
                Parcelable readParcelable = parcel.readParcelable(null);
                readParcelable.getClass();
                return new msh(readParcelable, null);
            case 7:
                return new MediaSessionCompat$Token(parcel.readParcelable(null), null);
            case 8:
                String readString = parcel.readString();
                readString.getClass();
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i < readInt; i++) {
                    String readString2 = parcel.readString();
                    readString2.getClass();
                    String readString3 = parcel.readString();
                    readString3.getClass();
                    linkedHashMap.put(readString2, readString3);
                }
                return new xwh(readString, linkedHashMap);
            case 9:
                parcel.getClass();
                return new pyh(parcel.readString());
            case 10:
                parcel.getClass();
                return new qyh(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 11:
                parcel.getClass();
                return new ryh(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                parcel.getClass();
                return new syh(parcel.readString(), parcel.readString(), parcel.readString(), (qyh) parcel.readParcelable(syh.class.getClassLoader()));
            case 13:
                parcel.getClass();
                return new tyh(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ryh.CREATOR.createFromParcel(parcel));
            case 14:
                parcel.getClass();
                return new f5i(parcel.readString(), parcel.readInt());
            case 15:
                parcel.getClass();
                return new eci(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : f58.CREATOR.createFromParcel(parcel));
            case 16:
                return sdi.a(parcel.readInt(), parcel.readInt());
            case 17:
                parcel.getClass();
                return new uqi(gfo.valueOf(parcel.readString()), parcel.readString());
            case 18:
                parcel.getClass();
                return new psi(parcel.readString(), ysi.valueOf(parcel.readString()));
            case 19:
                parcel.getClass();
                return new qui(parcel.readString(), kvi.valueOf(parcel.readString()));
            case 20:
                parcel.getClass();
                return new rui(parcel.readString());
            case 21:
                parcel.getClass();
                return new kxi((fnb) parcel.readParcelable(kxi.class.getClassLoader()), (gj) parcel.readParcelable(kxi.class.getClassLoader()));
            case 22:
                iyi iyiVar = new iyi(parcel);
                iyiVar.a = parcel.readInt();
                return iyiVar;
            case 23:
                parcel.getClass();
                parcel.readInt();
                return u2j.a;
            case 24:
                parcel.getClass();
                return new g3j(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, cm2.valueOf(parcel.readString()));
            case 25:
                parcel.getClass();
                return new e6j(parcel.readString(), parcel.readString());
            case 26:
                parcel.getClass();
                lik likVar = (lik) parcel.readParcelable(rbj.class.getClassLoader());
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                dud dudVar = (dud) parcel.readParcelable(rbj.class.getClassLoader());
                String readString6 = parcel.readString();
                if (parcel.readInt() != 0) {
                    cls = rbj.class;
                    z = true;
                } else {
                    cls = rbj.class;
                    z = false;
                }
                return new rbj(likVar, readString4, readString5, dudVar, readString6, z, parcel.readInt() != 0, (ubj) parcel.readParcelable(cls.getClassLoader()));
            case 27:
                parcel.getClass();
                parcel.readInt();
                return sbj.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.getClass();
                parcel.readInt();
                return tbj.a;
            default:
                parcel.getClass();
                return new jcj(j0s.valueOf(parcel.readString()), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new MediaDescriptionCompat[i];
            case 1:
                return new ioh[i];
            case 2:
                return new MediaMetadataCompat[i];
            case 3:
                return new ksh[i];
            case 4:
                return new MediaSessionCompat$QueueItem[i];
            case 5:
                return new lsh[i];
            case 6:
                return new msh[i];
            case 7:
                return new MediaSessionCompat$Token[i];
            case 8:
                return new xwh[i];
            case 9:
                return new pyh[i];
            case 10:
                return new qyh[i];
            case 11:
                return new ryh[i];
            case 12:
                return new syh[i];
            case 13:
                return new tyh[i];
            case 14:
                return new f5i[i];
            case 15:
                return new eci[i];
            case 16:
                return new sdi[i];
            case 17:
                return new uqi[i];
            case 18:
                return new psi[i];
            case 19:
                return new qui[i];
            case 20:
                return new rui[i];
            case 21:
                return new kxi[i];
            case 22:
                return new iyi[i];
            case 23:
                return new u2j[i];
            case 24:
                return new g3j[i];
            case 25:
                return new e6j[i];
            case 26:
                return new rbj[i];
            case 27:
                return new sbj[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new tbj[i];
            default:
                return new jcj[i];
        }
    }
}
