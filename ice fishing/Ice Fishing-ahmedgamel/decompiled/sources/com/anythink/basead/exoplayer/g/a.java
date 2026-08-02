package com.anythink.basead.exoplayer.g;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.anythink.basead.exoplayer.g.a.1
        private static a a(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ a[] newArray(int i) {
            return new a[0];
        }

        private static a[] a() {
            return new a[0];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0025a[] f8057a;

    /* renamed from: com.anythink.basead.exoplayer.g.a$a, reason: collision with other inner class name */
    public interface InterfaceC0025a extends Parcelable {
    }

    public a(InterfaceC0025a... interfaceC0025aArr) {
        this.f8057a = interfaceC0025aArr;
    }

    public final int a() {
        return this.f8057a.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8057a, ((a) obj).f8057a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8057a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8057a.length);
        for (InterfaceC0025a interfaceC0025a : this.f8057a) {
            parcel.writeParcelable(interfaceC0025a, 0);
        }
    }

    public final InterfaceC0025a a(int i) {
        return this.f8057a[i];
    }

    public a(List<? extends InterfaceC0025a> list) {
        InterfaceC0025a[] interfaceC0025aArr = new InterfaceC0025a[list.size()];
        this.f8057a = interfaceC0025aArr;
        list.toArray(interfaceC0025aArr);
    }

    public a(Parcel parcel) {
        this.f8057a = new InterfaceC0025a[parcel.readInt()];
        int i = 0;
        while (true) {
            InterfaceC0025a[] interfaceC0025aArr = this.f8057a;
            if (i >= interfaceC0025aArr.length) {
                return;
            }
            interfaceC0025aArr[i] = (InterfaceC0025a) parcel.readParcelable(InterfaceC0025a.class.getClassLoader());
            i++;
        }
    }
}
