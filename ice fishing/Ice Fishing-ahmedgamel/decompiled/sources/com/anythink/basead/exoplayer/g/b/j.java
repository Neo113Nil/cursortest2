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
    public static final String f8117a = "PRIV";

    /* renamed from: b, reason: collision with root package name */
    public final String f8118b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f8119c;

    public j(String str, byte[] bArr) {
        super(f8117a);
        this.f8118b = str;
        this.f8119c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (af.a((Object) this.f8118b, (Object) jVar.f8118b) && Arrays.equals(this.f8119c, jVar.f8119c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8118b;
        return Arrays.hashCode(this.f8119c) + (((str != null ? str.hashCode() : 0) + 527) * 31);
    }

    @Override // com.anythink.basead.exoplayer.g.b.h
    public final String toString() {
        return this.f8112g + ": owner=" + this.f8118b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8118b);
        parcel.writeByteArray(this.f8119c);
    }

    public j(Parcel parcel) {
        super(f8117a);
        this.f8118b = parcel.readString();
        this.f8119c = parcel.createByteArray();
    }
}
