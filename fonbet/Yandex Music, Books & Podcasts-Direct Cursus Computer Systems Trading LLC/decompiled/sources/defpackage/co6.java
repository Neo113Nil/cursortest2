package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes5.dex */
public final class co6 implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<co6> CREATOR = new kg4(21);
    public final CoverPath a;
    public final qo6 b;
    public final Integer c;

    public co6(CoverPath coverPath, qo6 qo6Var, Integer num) {
        coverPath.getClass();
        qo6Var.getClass();
        this.a = coverPath;
        this.b = qo6Var;
        this.c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co6)) {
            return false;
        }
        co6 co6Var = (co6) obj;
        return Intrinsics.d(this.a, co6Var.a) && this.b == co6Var.b && Intrinsics.d(this.c, co6Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "CoverMeta(coverPath=" + this.a + ", coverType=" + this.b + ", coverBackgroundColor=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b.name());
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            k.v(parcel, 1, num);
        }
    }
}
