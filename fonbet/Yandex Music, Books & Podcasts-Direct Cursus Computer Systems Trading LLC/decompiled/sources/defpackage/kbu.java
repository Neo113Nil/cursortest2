package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class kbu extends l9 {
    public final int a;
    public final int b;
    public final int c;
    public static final msg d = new msg("VideoInfo", null);

    @NonNull
    public static final Parcelable.Creator<kbu> CREATOR = new k5x(13);

    public kbu(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbu)) {
            return false;
        }
        kbu kbuVar = (kbu) obj;
        return this.b == kbuVar.b && this.a == kbuVar.a && this.c == kbuVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.a);
        o8g.q0(3, 4, parcel);
        parcel.writeInt(this.b);
        o8g.q0(4, 4, parcel);
        parcel.writeInt(this.c);
        o8g.p0(parcel, o0);
    }
}
