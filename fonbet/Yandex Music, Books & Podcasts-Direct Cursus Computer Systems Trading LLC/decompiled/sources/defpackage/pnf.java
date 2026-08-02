package defpackage;

import android.content.Intent;
import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class pnf implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ pnf(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                parcel.getClass();
                parcel.readInt();
                return qnf.a;
            case 1:
                parcel.getClass();
                return new rnf(parcel.createStringArrayList(), parcel.readInt() != 0);
            case 2:
                parcel.getClass();
                return byf.valueOf(parcel.readString());
            case 3:
                g7g g7gVar = new g7g();
                g7gVar.a = parcel.readInt();
                g7gVar.b = parcel.readInt();
                g7gVar.c = parcel.readInt() == 1;
                return g7gVar;
            case 4:
                parcel.getClass();
                return new m7g(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                ctg ctgVar = new ctg();
                ctgVar.b = -1;
                ctgVar.k = 0;
                ctgVar.l = 0;
                Parcelable[] readParcelableArray = parcel.readParcelableArray(ytg.class.getClassLoader());
                ctgVar.a = new ytg[readParcelableArray.length];
                for (int i = 0; i < readParcelableArray.length; i++) {
                    ytg[] ytgVarArr = ctgVar.a;
                    ytg ytgVar = (ytg) readParcelableArray[i];
                    ytgVarArr[i] = ytgVar;
                    ytgVar.getClass();
                    ytgVar.b = ctgVar;
                }
                ctgVar.b = parcel.readInt();
                ctgVar.g = (atg) parcel.readParcelable(atg.class.getClassLoader());
                ctgVar.h = gvt.O(parcel);
                ctgVar.i = gvt.O(parcel);
                return ctgVar;
            case 6:
                return new atg(parcel);
            case 7:
                return new btg(parcel);
            case 8:
                parcel.getClass();
                return new qvg((lwg) parcel.readParcelable(qvg.class.getClassLoader()));
            case 9:
                parcel.getClass();
                lt ltVar = (lt) parcel.readParcelable(hwg.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i2 = 0; i2 != readInt; i2++) {
                        arrayList2.add(parcel.readParcelable(hwg.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new hwg(ltVar, arrayList, z);
            case 10:
                parcel.getClass();
                return new iwg((u51) parcel.readParcelable(iwg.class.getClassLoader()), parcel.readInt() != 0);
            case 11:
                parcel.getClass();
                return new jwg((eul) parcel.readParcelable(jwg.class.getClassLoader()), parcel.readInt() != 0);
            case 12:
                parcel.getClass();
                return new lwg(mwg.CREATOR.createFromParcel(parcel), (kwg) parcel.readParcelable(lwg.class.getClassLoader()));
            case 13:
                parcel.getClass();
                return new mwg(parcel.readString(), parcel.readString(), parcel.readString(), qo6.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : jzb.valueOf(parcel.readString()), parcel.readInt() != 0);
            case 14:
                wxg wxgVar = new wxg(parcel);
                wxgVar.a = parcel.readString();
                wxgVar.c = parcel.readFloat();
                wxgVar.d = parcel.readInt() == 1;
                wxgVar.e = parcel.readString();
                wxgVar.f = parcel.readInt();
                wxgVar.g = parcel.readInt();
                return wxgVar;
            case 15:
                parcel.getClass();
                return new h3h(g3h.CREATOR.createFromParcel(parcel), f3h.CREATOR.createFromParcel(parcel));
            case 16:
                parcel.getClass();
                return new f3h(parcel.readInt(), parcel.readString(), parcel.readInt(), r2h.valueOf(parcel.readString()));
            case 17:
                parcel.getClass();
                return new g3h(parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                parcel.getClass();
                return new u4h(parcel.readInt() == 0 ? null : drt.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? r54.CREATOR.createFromParcel(parcel) : null);
            case 19:
                parcel.getClass();
                parcel.readInt();
                return w6h.a;
            case 20:
                parcel.getClass();
                parcel.readInt();
                return x6h.a;
            case 21:
                parcel.getClass();
                parcel.readInt();
                return y6h.a;
            case 22:
                parcel.getClass();
                return new z6h((Intent) parcel.readParcelable(z6h.class.getClassLoader()));
            case 23:
                parcel.getClass();
                parcel.readInt();
                return a7h.a;
            case 24:
                parcel.getClass();
                return new u8h(parcel.readString());
            case 25:
                edh edhVar = new edh(parcel);
                edhVar.a = ((Integer) parcel.readValue(edh.class.getClassLoader())).intValue();
                return edhVar;
            case 26:
                parcel.getClass();
                return new geh(parcel.readInt(), parcel.readInt());
            case 27:
                return new ehh(parcel);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new MediaBrowserCompat$MediaItem(parcel);
            default:
                pmh a = pmh.a(MediaDescription.CREATOR.createFromParcel(parcel));
                a.getClass();
                return a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new qnf[i];
            case 1:
                return new rnf[i];
            case 2:
                return new byf[i];
            case 3:
                return new g7g[i];
            case 4:
                return new m7g[i];
            case 5:
                return new ctg[i];
            case 6:
                return new atg[i];
            case 7:
                return new btg[i];
            case 8:
                return new qvg[i];
            case 9:
                return new hwg[i];
            case 10:
                return new iwg[i];
            case 11:
                return new jwg[i];
            case 12:
                return new lwg[i];
            case 13:
                return new mwg[i];
            case 14:
                return new wxg[i];
            case 15:
                return new h3h[i];
            case 16:
                return new f3h[i];
            case 17:
                return new g3h[i];
            case 18:
                return new u4h[i];
            case 19:
                return new w6h[i];
            case 20:
                return new x6h[i];
            case 21:
                return new y6h[i];
            case 22:
                return new z6h[i];
            case 23:
                return new a7h[i];
            case 24:
                return new u8h[i];
            case 25:
                return new edh[i];
            case 26:
                return new geh[i];
            case 27:
                return new ehh[i];
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new MediaBrowserCompat$MediaItem[i];
            default:
                return new pmh[i];
        }
    }
}
