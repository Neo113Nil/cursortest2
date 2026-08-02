package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class pot implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<pot> CREATOR = new b3s(17);
    public final String a;
    public final String b;
    public final Uri c;
    public final File d;
    public long e;

    public pot(String str, String str2, Uri uri, File file, long j) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = file;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pot)) {
            return false;
        }
        pot potVar = (pot) obj;
        return Intrinsics.d(this.a, potVar.a) && Intrinsics.d(this.b, potVar.b) && Intrinsics.d(this.c, potVar.c) && Intrinsics.d(this.d, potVar.d) && this.e == potVar.e;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        Uri uri = this.c;
        int hashCode = (c + (uri == null ? 0 : uri.hashCode())) * 31;
        File file = this.d;
        return Long.hashCode(this.e) + ((hashCode + (file != null ? file.hashCode() : 0)) * 31);
    }

    public final String toString() {
        long j = this.e;
        StringBuilder m = f1d.m("UploadJob(user=", this.a, ", kind=", this.b, ", coverUri=");
        m.append(this.c);
        m.append(", coverFile=");
        m.append(this.d);
        m.append(", coverSize=");
        return hrg.m(j, ")", m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeSerializable(this.d);
        parcel.writeLong(this.e);
    }
}
