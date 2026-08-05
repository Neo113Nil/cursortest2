package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class o1 implements Parcelable {
    public static final Parcelable.Creator<o1> CREATOR = new SMax8wMR(3);
    public final ArrayList MdtA4re8;
    public final int[] NCTxEWno;
    public final ArrayList OnDfzHZD;
    public final int P7K7Inc8;
    public final int Qr9iLBAD;
    public final int[] VgvYg0wo;
    public final String b2ZJblxo;
    public final CharSequence eVhOlqcC;
    public final int jb9XjC4I;
    public final int k3x7lurq;
    public final boolean lDXGDhIF;
    public final CharSequence ow5vqvCr;
    public final int[] wxUZMvaN;
    public final ArrayList ygLcUYwZ;

    public o1(n1 n1Var) {
        int size = n1Var.qoPGr6Ce.size();
        this.NCTxEWno = new int[size * 6];
        if (!n1Var.b2ZJblxo) {
            m1.Ey6iv0m0("Not on back stack");
            throw null;
        }
        this.MdtA4re8 = new ArrayList(size);
        this.wxUZMvaN = new int[size];
        this.VgvYg0wo = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ak akVar = (ak) n1Var.qoPGr6Ce.get(i2);
            int i3 = i + 1;
            this.NCTxEWno[i] = akVar.qoPGr6Ce;
            ArrayList arrayList = this.MdtA4re8;
            li liVar = akVar.NCTxEWno;
            arrayList.add(liVar != null ? liVar.P7K7Inc8 : null);
            int[] iArr = this.NCTxEWno;
            iArr[i3] = akVar.MdtA4re8 ? 1 : 0;
            iArr[i + 2] = akVar.wxUZMvaN;
            iArr[i + 3] = akVar.VgvYg0wo;
            int i4 = i + 5;
            iArr[i + 4] = akVar.P7K7Inc8;
            i += 6;
            iArr[i4] = akVar.b2ZJblxo;
            this.wxUZMvaN[i2] = akVar.Qr9iLBAD.ordinal();
            this.VgvYg0wo[i2] = akVar.jb9XjC4I.ordinal();
        }
        this.P7K7Inc8 = n1Var.P7K7Inc8;
        this.b2ZJblxo = n1Var.jb9XjC4I;
        this.Qr9iLBAD = n1Var.KlHjfFWx;
        this.jb9XjC4I = n1Var.eVhOlqcC;
        this.eVhOlqcC = n1Var.k3x7lurq;
        this.k3x7lurq = n1Var.ow5vqvCr;
        this.ow5vqvCr = n1Var.OnDfzHZD;
        this.OnDfzHZD = n1Var.ygLcUYwZ;
        this.ygLcUYwZ = n1Var.lDXGDhIF;
        this.lDXGDhIF = n1Var.sjUBp5pO;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void qoPGr6Ce(n1 n1Var) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.NCTxEWno;
            boolean z = true;
            if (i >= iArr.length) {
                n1Var.P7K7Inc8 = this.P7K7Inc8;
                n1Var.jb9XjC4I = this.b2ZJblxo;
                n1Var.b2ZJblxo = true;
                n1Var.eVhOlqcC = this.jb9XjC4I;
                n1Var.k3x7lurq = this.eVhOlqcC;
                n1Var.ow5vqvCr = this.k3x7lurq;
                n1Var.OnDfzHZD = this.ow5vqvCr;
                n1Var.ygLcUYwZ = this.OnDfzHZD;
                n1Var.lDXGDhIF = this.ygLcUYwZ;
                n1Var.sjUBp5pO = this.lDXGDhIF;
                return;
            }
            ak akVar = new ak();
            int i3 = i + 1;
            akVar.qoPGr6Ce = iArr[i];
            if (ej.ytu5o6f4(2)) {
                Log.v("FragmentManager", "Instantiate " + n1Var + " op #" + i2 + " base fragment #" + iArr[i3]);
            }
            akVar.Qr9iLBAD = po.values()[this.wxUZMvaN[i2]];
            akVar.jb9XjC4I = po.values()[this.VgvYg0wo[i2]];
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            akVar.MdtA4re8 = z;
            int i5 = iArr[i4];
            akVar.wxUZMvaN = i5;
            int i6 = iArr[i + 3];
            akVar.VgvYg0wo = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            akVar.P7K7Inc8 = i8;
            i += 6;
            int i9 = iArr[i7];
            akVar.b2ZJblxo = i9;
            n1Var.NCTxEWno = i5;
            n1Var.MdtA4re8 = i6;
            n1Var.wxUZMvaN = i8;
            n1Var.VgvYg0wo = i9;
            n1Var.NCTxEWno(akVar);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.NCTxEWno);
        parcel.writeStringList(this.MdtA4re8);
        parcel.writeIntArray(this.wxUZMvaN);
        parcel.writeIntArray(this.VgvYg0wo);
        parcel.writeInt(this.P7K7Inc8);
        parcel.writeString(this.b2ZJblxo);
        parcel.writeInt(this.Qr9iLBAD);
        parcel.writeInt(this.jb9XjC4I);
        TextUtils.writeToParcel(this.eVhOlqcC, parcel, 0);
        parcel.writeInt(this.k3x7lurq);
        TextUtils.writeToParcel(this.ow5vqvCr, parcel, 0);
        parcel.writeStringList(this.OnDfzHZD);
        parcel.writeStringList(this.ygLcUYwZ);
        parcel.writeInt(this.lDXGDhIF ? 1 : 0);
    }

    public o1(Parcel parcel) {
        this.NCTxEWno = parcel.createIntArray();
        this.MdtA4re8 = parcel.createStringArrayList();
        this.wxUZMvaN = parcel.createIntArray();
        this.VgvYg0wo = parcel.createIntArray();
        this.P7K7Inc8 = parcel.readInt();
        this.b2ZJblxo = parcel.readString();
        this.Qr9iLBAD = parcel.readInt();
        this.jb9XjC4I = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.eVhOlqcC = (CharSequence) creator.createFromParcel(parcel);
        this.k3x7lurq = parcel.readInt();
        this.ow5vqvCr = (CharSequence) creator.createFromParcel(parcel);
        this.OnDfzHZD = parcel.createStringArrayList();
        this.ygLcUYwZ = parcel.createStringArrayList();
        this.lDXGDhIF = parcel.readInt() != 0;
    }
}
