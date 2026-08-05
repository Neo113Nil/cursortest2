package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class wj implements Parcelable {
    public static final Parcelable.Creator<wj> CREATOR = new SMax8wMR(8);
    public final String MdtA4re8;
    public final String NCTxEWno;
    public final String OnDfzHZD;
    public final int P7K7Inc8;
    public final boolean Qr9iLBAD;
    public final int VgvYg0wo;
    public final String b2ZJblxo;
    public final boolean eVhOlqcC;
    public final boolean jb9XjC4I;
    public final boolean k3x7lurq;
    public final boolean lDXGDhIF;
    public final int ow5vqvCr;
    public final boolean wxUZMvaN;
    public final int ygLcUYwZ;

    public wj(Parcel parcel) {
        this.NCTxEWno = parcel.readString();
        this.MdtA4re8 = parcel.readString();
        this.wxUZMvaN = parcel.readInt() != 0;
        this.VgvYg0wo = parcel.readInt();
        this.P7K7Inc8 = parcel.readInt();
        this.b2ZJblxo = parcel.readString();
        this.Qr9iLBAD = parcel.readInt() != 0;
        this.jb9XjC4I = parcel.readInt() != 0;
        this.eVhOlqcC = parcel.readInt() != 0;
        this.k3x7lurq = parcel.readInt() != 0;
        this.ow5vqvCr = parcel.readInt();
        this.OnDfzHZD = parcel.readString();
        this.ygLcUYwZ = parcel.readInt();
        this.lDXGDhIF = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final li qoPGr6Ce(yi yiVar) {
        li qoPGr6Ce = yiVar.qoPGr6Ce(this.NCTxEWno);
        qoPGr6Ce.P7K7Inc8 = this.MdtA4re8;
        qoPGr6Ce.lDXGDhIF = this.wxUZMvaN;
        qoPGr6Ce.OxcuoDLp = true;
        qoPGr6Ce.gjV1z5T1 = this.VgvYg0wo;
        qoPGr6Ce.WYNAV5pd = this.P7K7Inc8;
        qoPGr6Ce.DK9slbsy = this.b2ZJblxo;
        qoPGr6Ce.i7xS8jrb = this.Qr9iLBAD;
        qoPGr6Ce.OnDfzHZD = this.jb9XjC4I;
        qoPGr6Ce.U0LaHZX7 = this.eVhOlqcC;
        qoPGr6Ce.lwWCatUu = this.k3x7lurq;
        qoPGr6Ce.zCflySGU = po.values()[this.ow5vqvCr];
        qoPGr6Ce.jb9XjC4I = this.OnDfzHZD;
        qoPGr6Ce.eVhOlqcC = this.ygLcUYwZ;
        qoPGr6Ce.pRiPUEwG = this.lDXGDhIF;
        return qoPGr6Ce;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.NCTxEWno);
        sb.append(" (");
        sb.append(this.MdtA4re8);
        sb.append(")}:");
        if (this.wxUZMvaN) {
            sb.append(" fromLayout");
        }
        int i = this.P7K7Inc8;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.b2ZJblxo;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.Qr9iLBAD) {
            sb.append(" retainInstance");
        }
        if (this.jb9XjC4I) {
            sb.append(" removing");
        }
        if (this.eVhOlqcC) {
            sb.append(" detached");
        }
        if (this.k3x7lurq) {
            sb.append(" hidden");
        }
        String str2 = this.OnDfzHZD;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.ygLcUYwZ);
        }
        if (this.lDXGDhIF) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.NCTxEWno);
        parcel.writeString(this.MdtA4re8);
        parcel.writeInt(this.wxUZMvaN ? 1 : 0);
        parcel.writeInt(this.VgvYg0wo);
        parcel.writeInt(this.P7K7Inc8);
        parcel.writeString(this.b2ZJblxo);
        parcel.writeInt(this.Qr9iLBAD ? 1 : 0);
        parcel.writeInt(this.jb9XjC4I ? 1 : 0);
        parcel.writeInt(this.eVhOlqcC ? 1 : 0);
        parcel.writeInt(this.k3x7lurq ? 1 : 0);
        parcel.writeInt(this.ow5vqvCr);
        parcel.writeString(this.OnDfzHZD);
        parcel.writeInt(this.ygLcUYwZ);
        parcel.writeInt(this.lDXGDhIF ? 1 : 0);
    }

    public wj(li liVar) {
        this.NCTxEWno = liVar.getClass().getName();
        this.MdtA4re8 = liVar.P7K7Inc8;
        this.wxUZMvaN = liVar.lDXGDhIF;
        this.VgvYg0wo = liVar.gjV1z5T1;
        this.P7K7Inc8 = liVar.WYNAV5pd;
        this.b2ZJblxo = liVar.DK9slbsy;
        this.Qr9iLBAD = liVar.i7xS8jrb;
        this.jb9XjC4I = liVar.OnDfzHZD;
        this.eVhOlqcC = liVar.U0LaHZX7;
        this.k3x7lurq = liVar.lwWCatUu;
        this.ow5vqvCr = liVar.zCflySGU.ordinal();
        this.OnDfzHZD = liVar.jb9XjC4I;
        this.ygLcUYwZ = liVar.eVhOlqcC;
        this.lDXGDhIF = liVar.pRiPUEwG;
    }
}
