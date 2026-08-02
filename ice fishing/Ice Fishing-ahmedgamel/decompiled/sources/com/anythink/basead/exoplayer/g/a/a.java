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
    public final String f8058a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8059b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8060c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8061d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8062e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f8063f;

    /* renamed from: g, reason: collision with root package name */
    private int f8064g;

    public a(String str, String str2, long j6, long j9, byte[] bArr, long j10) {
        this.f8058a = str;
        this.f8059b = str2;
        this.f8060c = j6;
        this.f8062e = j9;
        this.f8063f = bArr;
        this.f8061d = j10;
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
            if (this.f8061d == aVar.f8061d && this.f8060c == aVar.f8060c && this.f8062e == aVar.f8062e && af.a((Object) this.f8058a, (Object) aVar.f8058a) && af.a((Object) this.f8059b, (Object) aVar.f8059b) && Arrays.equals(this.f8063f, aVar.f8063f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8064g == 0) {
            String str = this.f8058a;
            int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f8059b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j6 = this.f8061d;
            int i = (hashCode2 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
            long j9 = this.f8060c;
            int i4 = (i + ((int) (j9 ^ (j9 >>> 32)))) * 31;
            long j10 = this.f8062e;
            this.f8064g = Arrays.hashCode(this.f8063f) + ((i4 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f8064g;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f8058a + ", id=" + this.f8062e + ", value=" + this.f8059b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8058a);
        parcel.writeString(this.f8059b);
        parcel.writeLong(this.f8061d);
        parcel.writeLong(this.f8060c);
        parcel.writeLong(this.f8062e);
        parcel.writeByteArray(this.f8063f);
    }

    public a(Parcel parcel) {
        this.f8058a = parcel.readString();
        this.f8059b = parcel.readString();
        this.f8061d = parcel.readLong();
        this.f8060c = parcel.readLong();
        this.f8062e = parcel.readLong();
        this.f8063f = parcel.createByteArray();
    }
}
