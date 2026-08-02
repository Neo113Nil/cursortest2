package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class e extends h {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.anythink.basead.exoplayer.g.b.e.1
        private static e a(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ e[] newArray(int i) {
            return new e[i];
        }

        private static e[] a(int i) {
            return new e[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f8084a = "COMM";

    /* renamed from: b, reason: collision with root package name */
    public final String f8085b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8086c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8087d;

    public e(String str, String str2, String str3) {
        super(f8084a);
        this.f8085b = str;
        this.f8086c = str2;
        this.f8087d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (af.a((Object) this.f8086c, (Object) eVar.f8086c) && af.a((Object) this.f8085b, (Object) eVar.f8085b) && af.a((Object) this.f8087d, (Object) eVar.f8087d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8085b;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f8086c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8087d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f8112g + ": language=" + this.f8085b + ", description=" + this.f8086c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8112g);
        parcel.writeString(this.f8085b);
        parcel.writeString(this.f8087d);
    }

    public e(Parcel parcel) {
        super(f8084a);
        this.f8085b = parcel.readString();
        this.f8086c = parcel.readString();
        this.f8087d = parcel.readString();
    }
}
