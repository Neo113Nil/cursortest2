package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x8c extends l9 {

    @NonNull
    public static final Parcelable.Creator<x8c> CREATOR = new pnx(3);
    public final String a;

    public x8c(String str) {
        y1g.G(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x8c) {
            return this.a.equals(((x8c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return su4.o(new StringBuilder("FidoAppIdExtension{appid='"), this.a, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a);
        o8g.p0(parcel, o0);
    }
}
