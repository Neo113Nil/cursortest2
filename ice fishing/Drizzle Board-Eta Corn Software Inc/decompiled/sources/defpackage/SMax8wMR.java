package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class SMax8wMR implements Parcelable.Creator {
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ SMax8wMR(int i) {
        this.qoPGr6Ce = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.qoPGr6Ce) {
            case 0:
                S7WAX0X5 s7wax0x5 = new S7WAX0X5();
                s7wax0x5.NCTxEWno = parcel.readInt();
                return s7wax0x5;
            case 1:
                return new Bo5Vs0Am(parcel);
            case 2:
                j jVar = new j(parcel);
                jVar.NCTxEWno = parcel.readByte() != 0;
                return jVar;
            case 3:
                return new o1(parcel);
            case 4:
                return new p1(parcel);
            case 5:
                v1 v1Var = new v1();
                v1Var.eVhOlqcC = 255;
                v1Var.ow5vqvCr = -2;
                v1Var.OnDfzHZD = -2;
                v1Var.ygLcUYwZ = -2;
                v1Var.I5GHvsYW = Boolean.TRUE;
                v1Var.NCTxEWno = parcel.readInt();
                v1Var.MdtA4re8 = (Integer) parcel.readSerializable();
                v1Var.wxUZMvaN = (Integer) parcel.readSerializable();
                v1Var.VgvYg0wo = (Integer) parcel.readSerializable();
                v1Var.P7K7Inc8 = (Integer) parcel.readSerializable();
                v1Var.b2ZJblxo = (Integer) parcel.readSerializable();
                v1Var.Qr9iLBAD = (Integer) parcel.readSerializable();
                v1Var.jb9XjC4I = (Integer) parcel.readSerializable();
                v1Var.eVhOlqcC = parcel.readInt();
                v1Var.k3x7lurq = parcel.readString();
                v1Var.ow5vqvCr = parcel.readInt();
                v1Var.OnDfzHZD = parcel.readInt();
                v1Var.ygLcUYwZ = parcel.readInt();
                v1Var.sjUBp5pO = parcel.readString();
                v1Var.OxcuoDLp = parcel.readString();
                v1Var.amk52bBQ = parcel.readInt();
                v1Var.Ey6iv0m0 = (Integer) parcel.readSerializable();
                v1Var.RXQxj5Oe = (Integer) parcel.readSerializable();
                v1Var.FySoLYna = (Integer) parcel.readSerializable();
                v1Var.gjV1z5T1 = (Integer) parcel.readSerializable();
                v1Var.WYNAV5pd = (Integer) parcel.readSerializable();
                v1Var.DK9slbsy = (Integer) parcel.readSerializable();
                v1Var.lwWCatUu = (Integer) parcel.readSerializable();
                v1Var.Mq3SeTnW = (Integer) parcel.readSerializable();
                v1Var.U0LaHZX7 = (Integer) parcel.readSerializable();
                v1Var.i7xS8jrb = (Integer) parcel.readSerializable();
                v1Var.I5GHvsYW = (Boolean) parcel.readSerializable();
                v1Var.lDXGDhIF = (Locale) parcel.readSerializable();
                v1Var.euDDoUNr = (Boolean) parcel.readSerializable();
                v1Var.SgZGMMPL = (Integer) parcel.readSerializable();
                return v1Var;
            case 6:
                aj ajVar = new aj();
                ajVar.NCTxEWno = parcel.readString();
                ajVar.MdtA4re8 = parcel.readInt();
                return ajVar;
            case 7:
                fj fjVar = new fj();
                fjVar.P7K7Inc8 = null;
                fjVar.b2ZJblxo = new ArrayList();
                fjVar.Qr9iLBAD = new ArrayList();
                fjVar.NCTxEWno = parcel.createStringArrayList();
                fjVar.MdtA4re8 = parcel.createStringArrayList();
                fjVar.wxUZMvaN = (o1[]) parcel.createTypedArray(o1.CREATOR);
                fjVar.VgvYg0wo = parcel.readInt();
                fjVar.P7K7Inc8 = parcel.readString();
                fjVar.b2ZJblxo = parcel.createStringArrayList();
                fjVar.Qr9iLBAD = parcel.createTypedArrayList(p1.CREATOR);
                fjVar.jb9XjC4I = parcel.createTypedArrayList(aj.CREATOR);
                return fjVar;
            case 8:
                return new wj(parcel);
            case 9:
                fp fpVar = new fp();
                fpVar.NCTxEWno = parcel.readInt();
                fpVar.MdtA4re8 = parcel.readInt();
                fpVar.wxUZMvaN = parcel.readInt() == 1;
                return fpVar;
            case 10:
                mr mrVar = new mr(parcel);
                mrVar.NCTxEWno = ((Integer) parcel.readValue(mr.class.getClassLoader())).intValue();
                return mrVar;
            case 11:
                nv nvVar = new nv();
                nvVar.NCTxEWno = parcel.readInt();
                nvVar.MdtA4re8 = (bz) parcel.readParcelable(nv.class.getClassLoader());
                return nvVar;
            case 12:
                bw bwVar = new bw(parcel);
                bwVar.NCTxEWno = parcel.readInt();
                return bwVar;
            case 13:
                return new ParcelImpl(parcel);
            case 14:
                n90 n90Var = new n90();
                n90Var.NCTxEWno = parcel.readInt();
                n90Var.MdtA4re8 = parcel.readInt();
                n90Var.VgvYg0wo = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    n90Var.wxUZMvaN = iArr;
                    parcel.readIntArray(iArr);
                }
                return n90Var;
            default:
                o90 o90Var = new o90();
                o90Var.NCTxEWno = parcel.readInt();
                o90Var.MdtA4re8 = parcel.readInt();
                int readInt2 = parcel.readInt();
                o90Var.wxUZMvaN = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    o90Var.VgvYg0wo = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                o90Var.P7K7Inc8 = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    o90Var.b2ZJblxo = iArr3;
                    parcel.readIntArray(iArr3);
                }
                o90Var.jb9XjC4I = parcel.readInt() == 1;
                o90Var.eVhOlqcC = parcel.readInt() == 1;
                o90Var.k3x7lurq = parcel.readInt() == 1;
                o90Var.Qr9iLBAD = parcel.readArrayList(n90.class.getClassLoader());
                return o90Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.qoPGr6Ce) {
            case 0:
                return new S7WAX0X5[i];
            case 1:
                return new Bo5Vs0Am[i];
            case 2:
                return new j[i];
            case 3:
                return new o1[i];
            case 4:
                return new p1[i];
            case 5:
                return new v1[i];
            case 6:
                return new aj[i];
            case 7:
                return new fj[i];
            case 8:
                return new wj[i];
            case 9:
                return new fp[i];
            case 10:
                return new mr[i];
            case 11:
                return new nv[i];
            case 12:
                return new bw[i];
            case 13:
                return new ParcelImpl[i];
            case 14:
                return new n90[i];
            default:
                return new o90[i];
        }
    }
}
