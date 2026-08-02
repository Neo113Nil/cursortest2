package com.anythink.basead.exoplayer.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.s;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.anythink.basead.exoplayer.g.c.a.1
        private static a a(Parcel parcel) {
            return new a(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ a[] newArray(int i) {
            return new a[i];
        }

        private static a[] a(int i) {
            return new a[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final long f8124a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8125b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8126c;

    public /* synthetic */ a(Parcel parcel, byte b9) {
        this(parcel);
    }

    public static a a(s sVar, int i, long j6) {
        long h3 = sVar.h();
        int i4 = i - 4;
        byte[] bArr = new byte[i4];
        sVar.a(bArr, 0, i4);
        return new a(h3, bArr, j6);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8124a);
        parcel.writeLong(this.f8125b);
        parcel.writeInt(this.f8126c.length);
        parcel.writeByteArray(this.f8126c);
    }

    private a(long j6, byte[] bArr, long j9) {
        this.f8124a = j9;
        this.f8125b = j6;
        this.f8126c = bArr;
    }

    private a(Parcel parcel) {
        this.f8124a = parcel.readLong();
        this.f8125b = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.f8126c = bArr;
        parcel.readByteArray(bArr);
    }
}
