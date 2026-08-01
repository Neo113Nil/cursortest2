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
    public static final String f7298a = "COMM";

    /* renamed from: b, reason: collision with root package name */
    public final String f7299b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7300c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7301d;

    public e(String str, String str2, String str3) {
        super(f7298a);
        this.f7299b = str;
        this.f7300c = str2;
        this.f7301d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (af.a((Object) this.f7300c, (Object) eVar.f7300c) && af.a((Object) this.f7299b, (Object) eVar.f7299b) && af.a((Object) this.f7301d, (Object) eVar.f7301d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7299b;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f7300c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7301d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f7326g + ": language=" + this.f7299b + ", description=" + this.f7300c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7326g);
        parcel.writeString(this.f7299b);
        parcel.writeString(this.f7301d);
    }

    public e(Parcel parcel) {
        super(f7298a);
        this.f7299b = parcel.readString();
        this.f7300c = parcel.readString();
        this.f7301d = parcel.readString();
    }
}
