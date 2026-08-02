package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import w.AbstractC5128c;

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
    public final String f8120a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8121b;

    public k(String str, String str2, String str3) {
        super(str);
        this.f8120a = str2;
        this.f8121b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f8112g.equals(kVar.f8112g) && af.a((Object) this.f8120a, (Object) kVar.f8120a) && af.a((Object) this.f8121b, (Object) kVar.f8121b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a9 = AbstractC5128c.a(527, 31, this.f8112g);
        String str = this.f8120a;
        int hashCode = (a9 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8121b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f8112g + ": value=" + this.f8121b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8112g);
        parcel.writeString(this.f8120a);
        parcel.writeString(this.f8121b);
    }

    public k(Parcel parcel) {
        super(parcel.readString());
        this.f8120a = parcel.readString();
        this.f8121b = parcel.readString();
    }
}
