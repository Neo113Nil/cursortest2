package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w.AbstractC5128c;

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
    public final byte[] f8070a;

    public b(String str, byte[] bArr) {
        super(str);
        this.f8070a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f8112g.equals(bVar.f8112g) && Arrays.equals(this.f8070a, bVar.f8070a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8070a) + AbstractC5128c.a(527, 31, this.f8112g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8112g);
        parcel.writeByteArray(this.f8070a);
    }

    public b(Parcel parcel) {
        super(parcel.readString());
        this.f8070a = parcel.createByteArray();
    }
}
