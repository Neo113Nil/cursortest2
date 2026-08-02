package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m0n extends l9 {

    @NonNull
    public static final Parcelable.Creator<m0n> CREATOR = new vzw(26);
    public final String a;
    public final String b;
    public final String c;

    public m0n(String str, String str2, String str3) {
        y1g.G(str);
        this.a = str;
        y1g.G(str2);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0n)) {
            return false;
        }
        m0n m0nVar = (m0n) obj;
        return ldg.s(this.a, m0nVar.a) && ldg.s(this.b, m0nVar.b) && ldg.s(this.c, m0nVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb.append(this.a);
        sb.append("', \n name='");
        sb.append(this.b);
        sb.append("', \n icon='");
        return su4.o(sb, this.c, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a);
        o8g.j0(parcel, 3, this.b);
        o8g.j0(parcel, 4, this.c);
        o8g.p0(parcel, o0);
    }
}
