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
    public static final String f8065a = "APIC";

    /* renamed from: b, reason: collision with root package name */
    public final String f8066b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8067c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8068d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f8069e;

    public a(String str, String str2, int i, byte[] bArr) {
        super(f8065a);
        this.f8066b = str;
        this.f8067c = str2;
        this.f8068d = i;
        this.f8069e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f8068d == aVar.f8068d && af.a((Object) this.f8066b, (Object) aVar.f8066b) && af.a((Object) this.f8067c, (Object) aVar.f8067c) && Arrays.equals(this.f8069e, aVar.f8069e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f8068d + 527) * 31;
        String str = this.f8066b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8067c;
        return Arrays.hashCode(this.f8069e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f8112g + ": mimeType=" + this.f8066b + ", description=" + this.f8067c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8066b);
        parcel.writeString(this.f8067c);
        parcel.writeInt(this.f8068d);
        parcel.writeByteArray(this.f8069e);
    }

    public a(Parcel parcel) {
        super(f8065a);
        this.f8066b = parcel.readString();
        this.f8067c = parcel.readString();
        this.f8068d = parcel.readInt();
        this.f8069e = parcel.createByteArray();
    }
}
