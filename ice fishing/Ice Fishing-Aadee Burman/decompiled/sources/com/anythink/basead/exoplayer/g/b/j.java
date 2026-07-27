package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new Parcelable.Creator<j>() { // from class: com.anythink.basead.exoplayer.g.b.j.1
        private static j a(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ j[] newArray(int i) {
            return new j[i];
        }

        private static j[] a(int i) {
            return new j[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f7331a = "PRIV";

    /* renamed from: b, reason: collision with root package name */
    public final String f7332b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f7333c;

    public j(String str, byte[] bArr) {
        super(f7331a);
        this.f7332b = str;
        this.f7333c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (af.a((Object) this.f7332b, (Object) jVar.f7332b) && Arrays.equals(this.f7333c, jVar.f7333c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7332b;
        return Arrays.hashCode(this.f7333c) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f7326g + ": owner=" + this.f7332b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7332b);
        parcel.writeByteArray(this.f7333c);
    }

    public j(Parcel parcel) {
        super(f7331a);
        this.f7332b = parcel.readString();
        this.f7333c = parcel.createByteArray();
    }
}
