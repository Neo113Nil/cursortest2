package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: com.anythink.basead.exoplayer.g.b.f.1
        private static f a(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ f[] newArray(int i) {
            return new f[i];
        }

        private static f[] a(int i) {
            return new f[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f7302a = "GEOB";

    /* renamed from: b, reason: collision with root package name */
    public final String f7303b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7304c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7305d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f7306e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super(f7302a);
        this.f7303b = str;
        this.f7304c = str2;
        this.f7305d = str3;
        this.f7306e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (af.a((Object) this.f7303b, (Object) fVar.f7303b) && af.a((Object) this.f7304c, (Object) fVar.f7304c) && af.a((Object) this.f7305d, (Object) fVar.f7305d) && Arrays.equals(this.f7306e, fVar.f7306e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7303b;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f7304c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7305d;
        return Arrays.hashCode(this.f7306e) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f7326g + ": mimeType=" + this.f7303b + ", filename=" + this.f7304c + ", description=" + this.f7305d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7303b);
        parcel.writeString(this.f7304c);
        parcel.writeString(this.f7305d);
        parcel.writeByteArray(this.f7306e);
    }

    public f(Parcel parcel) {
        super(f7302a);
        this.f7303b = parcel.readString();
        this.f7304c = parcel.readString();
        this.f7305d = parcel.readString();
        this.f7306e = parcel.createByteArray();
    }
}
