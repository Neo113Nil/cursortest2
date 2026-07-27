package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new Parcelable.Creator<i>() { // from class: com.anythink.basead.exoplayer.g.b.i.1
        private static i a(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ i[] newArray(int i) {
            return new i[i];
        }

        private static i[] a(int i) {
            return new i[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f7327a = "----";

    /* renamed from: b, reason: collision with root package name */
    public final String f7328b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7329c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7330d;

    public i(String str, String str2, String str3) {
        super(f7327a);
        this.f7328b = str;
        this.f7329c = str2;
        this.f7330d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (af.a((Object) this.f7329c, (Object) iVar.f7329c) && af.a((Object) this.f7328b, (Object) iVar.f7328b) && af.a((Object) this.f7330d, (Object) iVar.f7330d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7328b;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f7329c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7330d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f7326g + ": domain=" + this.f7328b + ", description=" + this.f7329c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7326g);
        parcel.writeString(this.f7328b);
        parcel.writeString(this.f7330d);
    }

    public i(Parcel parcel) {
        super(f7327a);
        this.f7328b = (String) com.anythink.basead.exoplayer.k.a.a(parcel.readString());
        this.f7329c = (String) com.anythink.basead.exoplayer.k.a.a(parcel.readString());
        this.f7330d = (String) com.anythink.basead.exoplayer.k.a.a(parcel.readString());
    }
}
