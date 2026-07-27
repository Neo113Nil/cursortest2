package com.anythink.basead.exoplayer.g.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.g.a;
import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements a.InterfaceC0024a {
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
    public final String f7429a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7430b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7431c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7432d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7433e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f7434f;

    /* renamed from: g, reason: collision with root package name */
    private int f7435g;

    public a(String str, String str2, long j9, long j10, byte[] bArr, long j11) {
        this.f7429a = str;
        this.f7430b = str2;
        this.f7431c = j9;
        this.f7433e = j10;
        this.f7434f = bArr;
        this.f7432d = j11;
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
            if (this.f7432d == aVar.f7432d && this.f7431c == aVar.f7431c && this.f7433e == aVar.f7433e && af.a((Object) this.f7429a, (Object) aVar.f7429a) && af.a((Object) this.f7430b, (Object) aVar.f7430b) && Arrays.equals(this.f7434f, aVar.f7434f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f7435g == 0) {
            String str = this.f7429a;
            int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f7430b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j9 = this.f7432d;
            int i = (hashCode2 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
            long j10 = this.f7431c;
            int i4 = (i + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f7433e;
            this.f7435g = Arrays.hashCode(this.f7434f) + ((i4 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f7435g;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f7429a + ", id=" + this.f7433e + ", value=" + this.f7430b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7429a);
        parcel.writeString(this.f7430b);
        parcel.writeLong(this.f7432d);
        parcel.writeLong(this.f7431c);
        parcel.writeLong(this.f7433e);
        parcel.writeByteArray(this.f7434f);
    }

    public a(Parcel parcel) {
        this.f7429a = parcel.readString();
        this.f7430b = parcel.readString();
        this.f7432d = parcel.readLong();
        this.f7431c = parcel.readLong();
        this.f7433e = parcel.readLong();
        this.f7434f = parcel.createByteArray();
    }
}
