package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class ru5 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ru5> CREATOR = new kg4(10);
    public static final ru5 b = new ru5("unspecified");
    public final String a;

    public ru5(String str) {
        str.getClass();
        this.a = str;
    }

    public final su5 d() {
        Object obj;
        su5.b.getClass();
        String str = this.a;
        str.getClass();
        Iterator it = su5.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((su5) obj).a.equals(str)) {
                break;
            }
        }
        su5 su5Var = (su5) obj;
        return su5Var == null ? su5.c : su5Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ru5) && Intrinsics.d(this.a, ((ru5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("ConcertEventInfo(typeRaw=", this.a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
    }
}
