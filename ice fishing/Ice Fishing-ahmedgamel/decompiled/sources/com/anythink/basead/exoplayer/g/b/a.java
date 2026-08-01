package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.anythink.basead.exoplayer.g.b.a.1
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
    public static final String f7279a = "APIC";

    /* renamed from: b, reason: collision with root package name */
    public final String f7280b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7281c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7282d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f7283e;

    public a(String str, String str2, int i, byte[] bArr) {
        super(f7279a);
        this.f7280b = str;
        this.f7281c = str2;
        this.f7282d = i;
        this.f7283e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f7282d == aVar.f7282d && af.a((Object) this.f7280b, (Object) aVar.f7280b) && af.a((Object) this.f7281c, (Object) aVar.f7281c) && Arrays.equals(this.f7283e, aVar.f7283e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f7282d + 527) * 31;
        String str = this.f7280b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7281c;
        return Arrays.hashCode(this.f7283e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f7326g + ": mimeType=" + this.f7280b + ", description=" + this.f7281c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7280b);
        parcel.writeString(this.f7281c);
        parcel.writeInt(this.f7282d);
        parcel.writeByteArray(this.f7283e);
    }

    public a(Parcel parcel) {
        super(f7279a);
        this.f7280b = parcel.readString();
        this.f7281c = parcel.readString();
        this.f7282d = parcel.readInt();
        this.f7283e = parcel.createByteArray();
    }
}
