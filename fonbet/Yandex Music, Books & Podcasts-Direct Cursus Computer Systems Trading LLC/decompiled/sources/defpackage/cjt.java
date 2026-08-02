package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class cjt implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<cjt> CREATOR = new b3s(12);
    public final d9g a;
    public final zpd b;
    public final rht c;

    public /* synthetic */ cjt(zpd zpdVar, rht rhtVar, int i) {
        this((i & 1) != 0 ? null : d9g.b, (i & 2) != 0 ? null : zpdVar, rhtVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjt)) {
            return false;
        }
        cjt cjtVar = (cjt) obj;
        return this.a == cjtVar.a && this.b == cjtVar.b && this.c == cjtVar.c;
    }

    public final int hashCode() {
        d9g d9gVar = this.a;
        int hashCode = (d9gVar == null ? 0 : d9gVar.hashCode()) * 31;
        zpd zpdVar = this.b;
        return this.c.hashCode() + ((hashCode + (zpdVar != null ? zpdVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "UniversalEntitiesContentConfiguration(listItemType=" + this.a + ", gridItemType=" + this.b + ", uiType=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        d9g d9gVar = this.a;
        if (d9gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(d9gVar.name());
        }
        zpd zpdVar = this.b;
        if (zpdVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(zpdVar.name());
        }
        parcel.writeString(this.c.name());
    }

    public cjt(d9g d9gVar, zpd zpdVar, rht rhtVar) {
        rhtVar.getClass();
        this.a = d9gVar;
        this.b = zpdVar;
        this.c = rhtVar;
    }
}
