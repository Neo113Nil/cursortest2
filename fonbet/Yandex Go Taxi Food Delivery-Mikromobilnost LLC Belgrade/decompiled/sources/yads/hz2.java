package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.qd81;
import defpackage.w511;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class hz2 implements bs1 {
    public static final Parcelable.Creator<hz2> CREATOR = new ez2();
    public final ArrayList b;

    public hz2(ArrayList arrayList) {
        this.b = arrayList;
        if (arrayList.isEmpty()) {
            return;
        }
        long j = ((gz2) arrayList.get(0)).c;
        for (int i = 1; i < arrayList.size(); i++) {
            if (((gz2) arrayList.get(i)).b < j) {
                w511.q();
                throw null;
            }
            j = ((gz2) arrayList.get(i)).c;
        }
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ qd81 a() {
        return super.a();
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ byte[] b() {
        return super.b();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hz2.class != obj.getClass()) {
            return false;
        }
        return this.b.equals(((hz2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.b);
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ void a(a291 a291Var) {
        super.a(a291Var);
    }
}
