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
    public final int f8549a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8550b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8551c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f8552d;

    /* renamed from: e, reason: collision with root package name */
    private int f8553e;

    private b(int i, int i6, int i9, byte[] bArr) {
        this.f8549a = i;
        this.f8550b = i6;
        this.f8551c = i9;
        this.f8552d = bArr;
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
            if (this.f8549a == bVar.f8549a && this.f8550b == bVar.f8550b && this.f8551c == bVar.f8551c && Arrays.equals(this.f8552d, bVar.f8552d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8553e == 0) {
            this.f8553e = Arrays.hashCode(this.f8552d) + ((((((this.f8549a + 527) * 31) + this.f8550b) * 31) + this.f8551c) * 31);
        }
        return this.f8553e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f8549a);
        sb.append(", ");
        sb.append(this.f8550b);
        sb.append(", ");
        sb.append(this.f8551c);
        sb.append(", ");
        sb.append(this.f8552d != null);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8549a);
        parcel.writeInt(this.f8550b);
        parcel.writeInt(this.f8551c);
        af.a(parcel, this.f8552d != null);
        byte[] bArr = this.f8552d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public b(Parcel parcel) {
        this.f8549a = parcel.readInt();
        this.f8550b = parcel.readInt();
        this.f8551c = parcel.readInt();
        this.f8552d = af.a(parcel) ? parcel.createByteArray() : null;
    }
}
