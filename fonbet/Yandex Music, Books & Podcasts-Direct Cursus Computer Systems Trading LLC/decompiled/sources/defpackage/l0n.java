package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l0n extends l9 {

    @NonNull
    public static final Parcelable.Creator<l0n> CREATOR = new vzw(23);
    public final o0n a;
    public final yn3 b;

    public l0n(String str, int i) {
        y1g.G(str);
        try {
            this.a = o0n.a(str);
            try {
                this.b = yn3.a(i);
            } catch (xn3 e) {
                xq0.t(e);
                throw null;
            }
        } catch (n0n e2) {
            xq0.t(e2);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0n)) {
            return false;
        }
        l0n l0nVar = (l0n) obj;
        return this.a.equals(l0nVar.a) && this.b.equals(l0nVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return hrg.s("PublicKeyCredentialParameters{\n type=", String.valueOf(this.a), ", \n algorithm=", String.valueOf(this.b), "\n }");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [b40, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        this.a.getClass();
        o8g.j0(parcel, 2, "public-key");
        o8g.g0(parcel, 3, Integer.valueOf(this.b.a.a()));
        o8g.p0(parcel, o0);
    }
}
