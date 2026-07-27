package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;

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
    public final String f7336a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7337b;

    public l(String str, String str2, String str3) {
        super(str);
        this.f7336a = str2;
        this.f7337b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f7326g.equals(lVar.f7326g) && af.a((Object) this.f7336a, (Object) lVar.f7336a) && af.a((Object) this.f7337b, (Object) lVar.f7337b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int k9 = u1.h.k(527, 31, this.f7326g);
        String str = this.f7336a;
        int hashCode = (k9 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7337b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f7326g + ": url=" + this.f7337b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7326g);
        parcel.writeString(this.f7336a);
        parcel.writeString(this.f7337b);
    }

    public l(Parcel parcel) {
        super(parcel.readString());
        this.f7336a = parcel.readString();
        this.f7337b = parcel.readString();
    }
}
