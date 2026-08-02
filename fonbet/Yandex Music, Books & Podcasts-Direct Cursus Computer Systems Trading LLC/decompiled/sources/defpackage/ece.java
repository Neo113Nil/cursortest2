package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import java.io.Serializable;
import java.util.LinkedList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes5.dex */
public final class ece implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<ece> CREATOR = new a5c(22);
    private static final long serialVersionUID = 1;
    public final tn6 a;
    public final qo6 b;
    public final Integer c;
    public final co6 d;

    public ece(tn6 tn6Var, qo6 qo6Var, Integer num) {
        CoverPath none;
        LinkedList linkedList;
        qo6Var.getClass();
        this.a = tn6Var;
        this.b = qo6Var;
        this.c = num;
        if (tn6Var == null || (linkedList = tn6Var.b) == null || (none = (CoverPath) CollectionsKt.firstOrNull(linkedList)) == null) {
            none = CoverPath.none();
            none.getClass();
        }
        this.d = new co6(none, qo6Var, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ece)) {
            return false;
        }
        ece eceVar = (ece) obj;
        return Intrinsics.d(this.a, eceVar.a) && this.b == eceVar.b && Intrinsics.d(this.c, eceVar.c);
    }

    public final int hashCode() {
        tn6 tn6Var = this.a;
        int hashCode = (this.b.hashCode() + ((tn6Var == null ? 0 : tn6Var.hashCode()) * 31)) * 31;
        Integer num = this.c;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ImageMeta(coverInfo=" + this.a + ", coverType=" + this.b + ", coverColor=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.a);
        parcel.writeString(this.b.name());
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            k.v(parcel, 1, num);
        }
    }
}
