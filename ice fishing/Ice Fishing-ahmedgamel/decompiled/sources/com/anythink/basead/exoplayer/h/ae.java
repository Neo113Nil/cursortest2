package com.anythink.basead.exoplayer.h;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ae implements Parcelable {
    public static final Parcelable.Creator<ae> CREATOR = new Parcelable.Creator<ae>() { // from class: com.anythink.basead.exoplayer.h.ae.1
        private static ae a(Parcel parcel) {
            return new ae(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ae createFromParcel(Parcel parcel) {
            return new ae(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ae[] newArray(int i) {
            return new ae[i];
        }

        private static ae[] a(int i) {
            return new ae[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f8298a;

    /* renamed from: b, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.m[] f8299b;

    /* renamed from: c, reason: collision with root package name */
    private int f8300c;

    public ae(com.anythink.basead.exoplayer.m... mVarArr) {
        com.anythink.basead.exoplayer.k.a.b(true);
        this.f8299b = mVarArr;
        this.f8298a = 1;
    }

    public final com.anythink.basead.exoplayer.m a(int i) {
        return this.f8299b[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ae.class == obj.getClass()) {
            ae aeVar = (ae) obj;
            if (this.f8298a == aeVar.f8298a && Arrays.equals(this.f8299b, aeVar.f8299b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8300c == 0) {
            this.f8300c = Arrays.hashCode(this.f8299b) + 527;
        }
        return this.f8300c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8298a);
        for (int i4 = 0; i4 < this.f8298a; i4++) {
            parcel.writeParcelable(this.f8299b[i4], 0);
        }
    }

    public final int a(com.anythink.basead.exoplayer.m mVar) {
        int i = 0;
        while (true) {
            com.anythink.basead.exoplayer.m[] mVarArr = this.f8299b;
            if (i >= mVarArr.length) {
                return -1;
            }
            if (mVar == mVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public ae(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f8298a = readInt;
        this.f8299b = new com.anythink.basead.exoplayer.m[readInt];
        for (int i = 0; i < this.f8298a; i++) {
            this.f8299b[i] = (com.anythink.basead.exoplayer.m) parcel.readParcelable(com.anythink.basead.exoplayer.m.class.getClassLoader());
        }
    }
}
