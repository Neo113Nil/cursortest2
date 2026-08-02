package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class kwt extends l9 {

    @NonNull
    public static final Parcelable.Creator<kwt> CREATOR = new k2x(16);
    public final int a;
    public final short b;
    public final short c;

    public kwt(int i, short s, short s2) {
        this.a = i;
        this.b = s;
        this.c = s2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kwt)) {
            return false;
        }
        kwt kwtVar = (kwt) obj;
        return this.a == kwtVar.a && this.b == kwtVar.b && this.c == kwtVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Short.valueOf(this.b), Short.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.b);
        o8g.q0(3, 4, parcel);
        parcel.writeInt(this.c);
        o8g.p0(parcel, o0);
    }
}
