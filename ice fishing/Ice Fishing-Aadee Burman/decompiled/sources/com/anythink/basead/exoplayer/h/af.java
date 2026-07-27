package com.anythink.basead.exoplayer.h;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class af implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final int f7516b;

    /* renamed from: c, reason: collision with root package name */
    private final ae[] f7517c;

    /* renamed from: d, reason: collision with root package name */
    private int f7518d;

    /* renamed from: a, reason: collision with root package name */
    public static final af f7515a = new af(new ae[0]);
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
        this.f7517c = aeVarArr;
        this.f7516b = aeVarArr.length;
    }

    public final ae a(int i) {
        return this.f7517c[i];
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
            if (this.f7516b == afVar.f7516b && Arrays.equals(this.f7517c, afVar.f7517c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f7518d == 0) {
            this.f7518d = Arrays.hashCode(this.f7517c);
        }
        return this.f7518d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7516b);
        for (int i6 = 0; i6 < this.f7516b; i6++) {
            parcel.writeParcelable(this.f7517c[i6], 0);
        }
    }

    public final int a(ae aeVar) {
        for (int i = 0; i < this.f7516b; i++) {
            if (this.f7517c[i] == aeVar) {
                return i;
            }
        }
        return -1;
    }

    public af(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f7516b = readInt;
        this.f7517c = new ae[readInt];
        for (int i = 0; i < this.f7516b; i++) {
            this.f7517c[i] = (ae) parcel.readParcelable(ae.class.getClassLoader());
        }
    }

    private boolean a() {
        return this.f7516b == 0;
    }
}
