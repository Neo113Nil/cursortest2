package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends h {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.anythink.basead.exoplayer.g.b.b.1
        private static b a(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ b[] newArray(int i) {
            return new b[i];
        }

        private static b[] a(int i) {
            return new b[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7284a;

    public b(String str, byte[] bArr) {
        super(str);
        this.f7284a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f7326g.equals(bVar.f7326g) && Arrays.equals(this.f7284a, bVar.f7284a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7284a) + u1.h.k(527, 31, this.f7326g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7326g);
        parcel.writeByteArray(this.f7284a);
    }

    public b(Parcel parcel) {
        super(parcel.readString());
        this.f7284a = parcel.createByteArray();
    }
}
