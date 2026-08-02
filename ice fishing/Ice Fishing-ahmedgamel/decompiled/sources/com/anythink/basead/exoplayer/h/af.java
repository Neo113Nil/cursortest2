package com.anythink.basead.exoplayer.h;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class af implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final int f8302b;

    /* renamed from: c, reason: collision with root package name */
    private final ae[] f8303c;

    /* renamed from: d, reason: collision with root package name */
    private int f8304d;

    /* renamed from: a, reason: collision with root package name */
    public static final af f8301a = new af(new ae[0]);
    public static final Parcelable.Creator<af> CREATOR = new Parcelable.Creator<af>() { // from class: com.anythink.basead.exoplayer.h.af.1
        private static af a(Parcel parcel) {
            return new af(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ af createFromParcel(Parcel parcel) {
            return new af(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ af[] newArray(int i) {
            return new af[i];
        }

        private static af[] a(int i) {
            return new af[i];
        }
    };

    public af(ae... aeVarArr) {
        this.f8303c = aeVarArr;
        this.f8302b = aeVarArr.length;
    }

    public final ae a(int i) {
        return this.f8303c[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && af.class == obj.getClass()) {
            af afVar = (af) obj;
            if (this.f8302b == afVar.f8302b && Arrays.equals(this.f8303c, afVar.f8303c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8304d == 0) {
            this.f8304d = Arrays.hashCode(this.f8303c);
        }
        return this.f8304d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8302b);
        for (int i4 = 0; i4 < this.f8302b; i4++) {
            parcel.writeParcelable(this.f8303c[i4], 0);
        }
    }

    public final int a(ae aeVar) {
        for (int i = 0; i < this.f8302b; i++) {
            if (this.f8303c[i] == aeVar) {
                return i;
            }
        }
        return -1;
    }

    public af(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f8302b = readInt;
        this.f8303c = new ae[readInt];
        for (int i = 0; i < this.f8302b; i++) {
            this.f8303c[i] = (ae) parcel.readParcelable(ae.class.getClassLoader());
        }
    }

    private boolean a() {
        return this.f8302b == 0;
    }
}
