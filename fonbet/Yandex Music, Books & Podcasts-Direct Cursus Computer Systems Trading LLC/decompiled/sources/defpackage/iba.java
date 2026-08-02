package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class iba implements Parcelable {
    public static final Parcelable.Creator<iba> CREATOR = new vn7(12);
    public final String a;
    public final Uri b;
    public final String c;
    public final List d;
    public final byte[] e;
    public final String f;
    public final byte[] g;
    public final hba h;

    public iba(Parcel parcel) {
        String readString = parcel.readString();
        int i = dvt.a;
        this.a = readString;
        this.b = Uri.parse(parcel.readString());
        this.c = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add((kjr) parcel.readParcelable(kjr.class.getClassLoader()));
        }
        this.d = Collections.unmodifiableList(arrayList);
        this.e = parcel.createByteArray();
        this.f = parcel.readString();
        this.g = parcel.createByteArray();
        this.h = (hba) parcel.readParcelable(hba.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iba)) {
            return false;
        }
        iba ibaVar = (iba) obj;
        return this.a.equals(ibaVar.a) && this.b.equals(ibaVar.b) && Objects.equals(this.c, ibaVar.c) && this.d.equals(ibaVar.d) && Arrays.equals(this.e, ibaVar.e) && Objects.equals(this.f, ibaVar.f) && Arrays.equals(this.g, ibaVar.g) && Objects.equals(this.h, ibaVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 961)) * 31;
        String str = this.c;
        int hashCode2 = (Arrays.hashCode(this.e) + ((this.d.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f;
        int hashCode3 = (Arrays.hashCode(this.g) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        hba hbaVar = this.h;
        return hashCode3 + (hbaVar != null ? hbaVar.hashCode() : 0);
    }

    public final String toString() {
        return this.c + StringUtils.PROCESS_POSTFIX_DELIMITER + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.toString());
        parcel.writeString(this.c);
        List list = this.d;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.e);
        parcel.writeString(this.f);
        parcel.writeByteArray(this.g);
        parcel.writeParcelable(this.h, 0);
    }

    public iba(String str, Uri uri, List list) {
        int Q = dvt.Q(uri);
        if (Q != 0 && Q != 2 && Q != 1) {
            this.h = null;
        } else {
            new StringBuilder("customCacheKey must be null for type: ").append(Q);
            this.h = null;
        }
        this.a = str;
        this.b = uri;
        this.c = null;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = null;
        this.f = null;
        this.g = dvt.c;
    }
}
