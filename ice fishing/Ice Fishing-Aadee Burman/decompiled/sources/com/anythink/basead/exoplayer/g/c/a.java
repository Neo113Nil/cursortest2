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
    public final long f7338a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7339b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7340c;

    public /* synthetic */ a(Parcel parcel, byte b9) {
        this(parcel);
    }

    public static a a(s sVar, int i, long j6) {
        long h9 = sVar.h();
        int i6 = i - 4;
        byte[] bArr = new byte[i6];
        sVar.a(bArr, 0, i6);
        return new a(h9, bArr, j6);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7338a);
        parcel.writeLong(this.f7339b);
        parcel.writeInt(this.f7340c.length);
        parcel.writeByteArray(this.f7340c);
    }

    private a(long j6, byte[] bArr, long j9) {
        this.f7338a = j9;
        this.f7339b = j6;
        this.f7340c = bArr;
    }

    private a(Parcel parcel) {
        this.f7338a = parcel.readLong();
        this.f7339b = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.f7340c = bArr;
        parcel.readByteArray(bArr);
    }
}
