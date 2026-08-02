package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h3h implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<h3h> CREATOR = new pnf(15);
    public final g3h a;
    public final f3h b;

    public h3h(g3h g3hVar, f3h f3hVar) {
        g3hVar.getClass();
        f3hVar.getClass();
        this.a = g3hVar;
        this.b = f3hVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3h)) {
            return false;
        }
        h3h h3hVar = (h3h) obj;
        return Intrinsics.d(this.a, h3hVar.a) && Intrinsics.d(this.b, h3hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LyricsReportBundle(trackInfo=" + this.a + ", lyricsInfo=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
    }
}
