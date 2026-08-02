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
    public static final String f8088a = "GEOB";

    /* renamed from: b, reason: collision with root package name */
    public final String f8089b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8090c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8091d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f8092e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super(f8088a);
        this.f8089b = str;
        this.f8090c = str2;
        this.f8091d = str3;
        this.f8092e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (af.a((Object) this.f8089b, (Object) fVar.f8089b) && af.a((Object) this.f8090c, (Object) fVar.f8090c) && af.a((Object) this.f8091d, (Object) fVar.f8091d) && Arrays.equals(this.f8092e, fVar.f8092e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8089b;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f8090c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8091d;
        return Arrays.hashCode(this.f8092e) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f8112g + ": mimeType=" + this.f8089b + ", filename=" + this.f8090c + ", description=" + this.f8091d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8089b);
        parcel.writeString(this.f8090c);
        parcel.writeString(this.f8091d);
        parcel.writeByteArray(this.f8092e);
    }

    public f(Parcel parcel) {
        super(f8088a);
        this.f8089b = parcel.readString();
        this.f8090c = parcel.readString();
        this.f8091d = parcel.readString();
        this.f8092e = parcel.createByteArray();
    }
}
