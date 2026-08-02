package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.qd81;
import defpackage.rf71;
import defpackage.z2a1;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class dp extends g11 {
    public static final Parcelable.Creator<dp> CREATOR = new cp();
    public final byte[] c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dp(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = rf71.a;
        this.c = parcel.createByteArray();
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ qd81 a() {
        return super.a();
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ byte[] b() {
        return super.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dp.class == obj.getClass()) {
            dp dpVar = (dp) obj;
            if (this.b.equals(dpVar.b) && Arrays.equals(this.c, dpVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + z2a1.a(527, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ void a(a291 a291Var) {
        super.a(a291Var);
    }

    public dp(String str, byte[] bArr) {
        super(str);
        this.c = bArr;
    }
}
