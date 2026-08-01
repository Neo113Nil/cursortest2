package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new Parcelable.Creator<k>() { // from class: com.anythink.basead.exoplayer.g.b.k.1
        private static k a(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ k[] newArray(int i) {
            return new k[i];
        }

        private static k[] a(int i) {
            return new k[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f7334a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7335b;

    public k(String str, String str2, String str3) {
        super(str);
        this.f7334a = str2;
        this.f7335b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f7326g.equals(kVar.f7326g) && af.a((Object) this.f7334a, (Object) kVar.f7334a) && af.a((Object) this.f7335b, (Object) kVar.f7335b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int k9 = u1.h.k(527, 31, this.f7326g);
        String str = this.f7334a;
        int hashCode = (k9 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7335b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f7326g + ": value=" + this.f7335b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7326g);
        parcel.writeString(this.f7334a);
        parcel.writeString(this.f7335b);
    }

    public k(Parcel parcel) {
        super(parcel.readString());
        this.f7334a = parcel.readString();
        this.f7335b = parcel.readString();
    }
}
