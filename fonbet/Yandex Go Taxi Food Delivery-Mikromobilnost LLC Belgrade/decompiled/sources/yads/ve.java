package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.oyr;
import defpackage.qd81;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ve implements bs1 {
    public static final Parcelable.Creator<ve> CREATOR = new ue();
    public final int b;
    public final String c;

    public ve(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ qd81 a() {
        return super.a();
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ byte[] b() {
        return super.b();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.b);
        sb.append(",url=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeInt(this.b);
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ void a(a291 a291Var) {
        super.a(a291Var);
    }
}
