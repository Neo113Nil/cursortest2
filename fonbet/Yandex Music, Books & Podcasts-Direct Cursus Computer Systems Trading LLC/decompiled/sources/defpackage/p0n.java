package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p0n extends l9 {

    @NonNull
    public static final Parcelable.Creator<p0n> CREATOR = new vzw(29);
    public final obx a;
    public final String b;
    public final String c;
    public final String d;

    public p0n(String str, String str2, String str3, byte[] bArr) {
        y1g.G(bArr);
        this.a = obx.t(bArr.length, bArr);
        y1g.G(str);
        this.b = str;
        this.c = str2;
        y1g.G(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0n)) {
            return false;
        }
        p0n p0nVar = (p0n) obj;
        return ldg.s(this.a, p0nVar.a) && ldg.s(this.b, p0nVar.b) && ldg.s(this.c, p0nVar.c) && ldg.s(this.d, p0nVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder u = ouj.u("PublicKeyCredentialUserEntity{\n id=", vq1.M(this.a.u()), ", \n name='");
        u.append(this.b);
        u.append("', \n icon='");
        u.append(this.c);
        u.append("', \n displayName='");
        return su4.o(u, this.d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.c0(parcel, 2, this.a.u());
        o8g.j0(parcel, 3, this.b);
        o8g.j0(parcel, 4, this.c);
        o8g.j0(parcel, 5, this.d);
        o8g.p0(parcel, o0);
    }
}
