package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class i6c extends l9 {

    @NonNull
    public static final Parcelable.Creator<i6c> CREATOR = new k2x(28);
    public final String a;
    public final int b;
    public final long c;

    public i6c(String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }

    public final long d() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i6c) {
            i6c i6cVar = (i6c) obj;
            String str = i6cVar.a;
            String str2 = this.a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && d() == i6cVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(d())});
    }

    public final String toString() {
        md7 md7Var = new md7(this);
        md7Var.a(this.a, "name");
        md7Var.a(Long.valueOf(d()), "version");
        return md7Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 1, this.a);
        o8g.q0(2, 4, parcel);
        parcel.writeInt(this.b);
        long d = d();
        o8g.q0(3, 8, parcel);
        parcel.writeLong(d);
        o8g.p0(parcel, o0);
    }

    public i6c(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }
}
