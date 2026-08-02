package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new Parcelable.Creator<l>() { // from class: com.anythink.basead.exoplayer.g.b.l.1
        private static l a(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ l[] newArray(int i) {
            return new l[i];
        }

        private static l[] a(int i) {
            return new l[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final String f8122a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8123b;

    public l(String str, String str2, String str3) {
        super(str);
        this.f8122a = str2;
        this.f8123b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f8112g.equals(lVar.f8112g) && af.a((Object) this.f8122a, (Object) lVar.f8122a) && af.a((Object) this.f8123b, (Object) lVar.f8123b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int a9 = AbstractC5128c.a(527, 31, this.f8112g);
        String str = this.f8122a;
        int hashCode = (a9 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8123b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f8112g + ": url=" + this.f8123b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8112g);
        parcel.writeString(this.f8122a);
        parcel.writeString(this.f8123b);
    }

    public l(Parcel parcel) {
        super(parcel.readString());
        this.f8122a = parcel.readString();
        this.f8123b = parcel.readString();
    }
}
