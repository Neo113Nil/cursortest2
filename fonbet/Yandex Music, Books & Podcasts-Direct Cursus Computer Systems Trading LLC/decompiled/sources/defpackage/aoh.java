package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class aoh extends l9 {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public static final msg e = new msg("MediaLiveSeekableRange", null);

    @NonNull
    public static final Parcelable.Creator<aoh> CREATOR = new k2x(24);

    public aoh(long j, long j2, boolean z, boolean z2) {
        this.a = Math.max(j, 0L);
        this.b = Math.max(j2, 0L);
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoh)) {
            return false;
        }
        aoh aohVar = (aoh) obj;
        return this.a == aohVar.a && this.b == aohVar.b && this.c == aohVar.c && this.d == aohVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(2, 8, parcel);
        parcel.writeLong(this.a);
        o8g.q0(3, 8, parcel);
        parcel.writeLong(this.b);
        o8g.q0(4, 4, parcel);
        parcel.writeInt(this.c ? 1 : 0);
        o8g.q0(5, 4, parcel);
        parcel.writeInt(this.d ? 1 : 0);
        o8g.p0(parcel, o0);
    }
}
