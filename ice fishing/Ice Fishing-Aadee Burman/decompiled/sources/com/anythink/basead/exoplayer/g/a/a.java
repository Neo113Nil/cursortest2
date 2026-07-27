package com.anythink.basead.exoplayer.g.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.g.a;
import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements a.InterfaceC0025a {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.anythink.basead.exoplayer.g.a.a.1
        private static a a(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel);
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
    public final String f7272a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7273b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7274c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7275d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7276e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f7277f;

    /* renamed from: g, reason: collision with root package name */
    private int f7278g;

    public a(String str, String str2, long j6, long j9, byte[] bArr, long j10) {
        this.f7272a = str;
        this.f7273b = str2;
        this.f7274c = j6;
        this.f7276e = j9;
        this.f7277f = bArr;
        this.f7275d = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f7275d == aVar.f7275d && this.f7274c == aVar.f7274c && this.f7276e == aVar.f7276e && af.a((Object) this.f7272a, (Object) aVar.f7272a) && af.a((Object) this.f7273b, (Object) aVar.f7273b) && Arrays.equals(this.f7277f, aVar.f7277f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f7278g == 0) {
            String str = this.f7272a;
            int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f7273b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j6 = this.f7275d;
            int i = (hashCode2 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
            long j9 = this.f7274c;
            int i6 = (i + ((int) (j9 ^ (j9 >>> 32)))) * 31;
            long j10 = this.f7276e;
            this.f7278g = Arrays.hashCode(this.f7277f) + ((i6 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f7278g;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f7272a + ", id=" + this.f7276e + ", value=" + this.f7273b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7272a);
        parcel.writeString(this.f7273b);
        parcel.writeLong(this.f7275d);
        parcel.writeLong(this.f7274c);
        parcel.writeLong(this.f7276e);
        parcel.writeByteArray(this.f7277f);
    }

    public a(Parcel parcel) {
        this.f7272a = parcel.readString();
        this.f7273b = parcel.readString();
        this.f7275d = parcel.readLong();
        this.f7274c = parcel.readLong();
        this.f7276e = parcel.readLong();
        this.f7277f = parcel.createByteArray();
    }
}
