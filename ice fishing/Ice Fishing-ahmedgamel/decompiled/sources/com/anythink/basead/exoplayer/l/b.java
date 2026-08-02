package com.anythink.basead.exoplayer.l;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.anythink.basead.exoplayer.l.b.1
        private static b a(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ b[] newArray(int i) {
            return new b[0];
        }

        private static b[] a() {
            return new b[0];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f9335a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9336b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9337c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f9338d;

    /* renamed from: e, reason: collision with root package name */
    private int f9339e;

    private b(int i, int i4, int i6, byte[] bArr) {
        this.f9335a = i;
        this.f9336b = i4;
        this.f9337c = i6;
        this.f9338d = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f9335a == bVar.f9335a && this.f9336b == bVar.f9336b && this.f9337c == bVar.f9337c && Arrays.equals(this.f9338d, bVar.f9338d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f9339e == 0) {
            this.f9339e = Arrays.hashCode(this.f9338d) + ((((((this.f9335a + 527) * 31) + this.f9336b) * 31) + this.f9337c) * 31);
        }
        return this.f9339e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f9335a);
        sb.append(", ");
        sb.append(this.f9336b);
        sb.append(", ");
        sb.append(this.f9337c);
        sb.append(", ");
        sb.append(this.f9338d != null);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9335a);
        parcel.writeInt(this.f9336b);
        parcel.writeInt(this.f9337c);
        af.a(parcel, this.f9338d != null);
        byte[] bArr = this.f9338d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public b(Parcel parcel) {
        this.f9335a = parcel.readInt();
        this.f9336b = parcel.readInt();
        this.f9337c = parcel.readInt();
        this.f9338d = af.a(parcel) ? parcel.createByteArray() : null;
    }
}
