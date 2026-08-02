package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class yn3 implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<yn3> CREATOR = new oex(20);
    public final Enum a;

    /* JADX WARN: Multi-variable type inference failed */
    public yn3(b40 b40Var) {
        this.a = (Enum) b40Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yn3 a(int i) {
        oen oenVar;
        if (i == -262) {
            oenVar = oen.RS1;
        } else {
            oen[] values = oen.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    for (dya dyaVar : dya.values()) {
                        if (dyaVar.a == i) {
                            oenVar = dyaVar;
                        }
                    }
                    throw new xn3(dfi.c(i, "Algorithm with COSE value ", " not supported"));
                }
                oen oenVar2 = values[i2];
                if (oenVar2.a == i) {
                    oenVar = oenVar2;
                    break;
                }
                i2++;
            }
        }
        return new yn3(oenVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [b40, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v3, types: [b40, java.lang.Enum] */
    public final boolean equals(Object obj) {
        return (obj instanceof yn3) && this.a.a() == ((yn3) obj).a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return hrg.q("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.a), "}");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [b40, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a());
    }
}
