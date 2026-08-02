package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.a;
import com.google.android.material.bottomsheet.c;

/* loaded from: classes.dex */
public final class w6k implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ w6k(int i) {
        this.a = i;
    }

    public static jii a(Parcel parcel) {
        parcel.getClass();
        return a(parcel);
    }

    public static x6k b(Parcel parcel, ClassLoader classLoader) {
        n2r n2rVar;
        if (classLoader == null) {
            classLoader = w6k.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            n2rVar = wvo.e;
        } else if (readInt == 1) {
            n2rVar = ehv.h;
        } else {
            if (readInt != 2) {
                xq0.q(dfi.c(readInt, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            n2rVar = rwd.h;
        }
        return new x6k(readValue, n2rVar);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return b(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return a.b;
                }
                xq0.q("superState must be null");
                return null;
            case 2:
                return new nd3(parcel, null);
            case 3:
                return new c(parcel, (ClassLoader) null);
            case 4:
                return new ej4(parcel, null);
            case 5:
                return new yk6(parcel, null);
            case 6:
                return new e0c(parcel, null);
            case 7:
                return new itc(parcel, null);
            case 8:
                return new tch(parcel, null);
            case 9:
                return a(parcel);
            case 10:
                return new ipn(parcel, null);
            case 11:
                return new gzo(parcel, null);
            case 12:
                return new n8p(parcel, null);
            case 13:
                return new o8p(parcel, null);
            case 14:
                return new cfq(parcel, (ClassLoader) null);
            case 15:
                return new kcs(parcel, null);
            case 16:
                return new sos(parcel, null);
            case 17:
                return new yfu(parcel, null);
            default:
                hgu hguVar = new hgu(parcel, null);
                hguVar.a = parcel.readInt();
                hguVar.b = parcel.readInt();
                hguVar.c = parcel.readParcelable(null);
                return hguVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new x6k[i];
            case 1:
                return new a[i];
            case 2:
                return new nd3[i];
            case 3:
                return new c[i];
            case 4:
                return new ej4[i];
            case 5:
                return new yk6[i];
            case 6:
                return new e0c[i];
            case 7:
                return new itc[i];
            case 8:
                return new tch[i];
            case 9:
                return new jii[i];
            case 10:
                return new ipn[i];
            case 11:
                return new gzo[i];
            case 12:
                return new n8p[i];
            case 13:
                return new o8p[i];
            case 14:
                return new cfq[i];
            case 15:
                return new kcs[i];
            case 16:
                return new sos[i];
            case 17:
                return new yfu[i];
            default:
                return new hgu[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return b(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return a.b;
                }
                xq0.q("superState must be null");
                return null;
            case 2:
                return new nd3(parcel, classLoader);
            case 3:
                return new c(parcel, classLoader);
            case 4:
                return new ej4(parcel, classLoader);
            case 5:
                return new yk6(parcel, classLoader);
            case 6:
                return new e0c(parcel, classLoader);
            case 7:
                return new itc(parcel, classLoader);
            case 8:
                return new tch(parcel, classLoader);
            case 9:
                parcel.getClass();
                jii jiiVar = new jii(parcel, classLoader);
                int readInt = parcel.readInt();
                Integer valueOf = Integer.valueOf(readInt);
                if (readInt == -1) {
                    valueOf = null;
                }
                jiiVar.a = valueOf;
                return jiiVar;
            case 10:
                return new ipn(parcel, classLoader);
            case 11:
                return new gzo(parcel, classLoader);
            case 12:
                return new n8p(parcel, classLoader);
            case 13:
                return new o8p(parcel, classLoader);
            case 14:
                return new cfq(parcel, classLoader);
            case 15:
                return new kcs(parcel, classLoader);
            case 16:
                return new sos(parcel, classLoader);
            case 17:
                return new yfu(parcel, classLoader);
            default:
                hgu hguVar = new hgu(parcel, classLoader);
                hguVar.a = parcel.readInt();
                hguVar.b = parcel.readInt();
                hguVar.c = parcel.readParcelable(classLoader);
                return hguVar;
        }
    }
}
