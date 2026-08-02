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
    public static final String f8113a = "----";

    /* renamed from: b, reason: collision with root package name */
    public final String f8114b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8115c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8116d;

    public i(String str, String str2, String str3) {
        super(f8113a);
        this.f8114b = str;
        this.f8115c = str2;
        this.f8116d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (af.a((Object) this.f8115c, (Object) iVar.f8115c) && af.a((Object) this.f8114b, (Object) iVar.f8114b) && af.a((Object) this.f8116d, (Object) iVar.f8116d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8114b;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f8115c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8116d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f8112g + ": domain=" + this.f8114b + ", description=" + this.f8115c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8112g);
        parcel.writeString(this.f8114b);
        parcel.writeString(this.f8116d);
    }

    public i(Parcel parcel) {
        super(f8113a);
        this.f8114b = (String) com.anythink.basead.exoplayer.k.a.a(parcel.readString());
        this.f8115c = (String) com.anythink.basead.exoplayer.k.a.a(parcel.readString());
        this.f8116d = (String) com.anythink.basead.exoplayer.k.a.a(parcel.readString());
    }
}
