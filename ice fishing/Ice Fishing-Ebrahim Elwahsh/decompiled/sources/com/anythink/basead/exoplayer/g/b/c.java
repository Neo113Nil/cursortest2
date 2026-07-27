package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.anythink.basead.exoplayer.g.b.c.1
        private static c a(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ c[] newArray(int i) {
            return new c[i];
        }

        private static c[] a(int i) {
            return new c[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f7442a = "CHAP";

    /* renamed from: b, reason: collision with root package name */
    public final String f7443b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7444c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7445d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7446e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7447f;

    /* renamed from: h, reason: collision with root package name */
    private final h[] f7448h;

    public c(String str, int i, int i4, long j9, long j10, h[] hVarArr) {
        super(f7442a);
        this.f7443b = str;
        this.f7444c = i;
        this.f7445d = i4;
        this.f7446e = j9;
        this.f7447f = j10;
        this.f7448h = hVarArr;
    }

    private int a() {
        return this.f7448h.length;
    }

    @Override // com.anythink.basead.exoplayer.g.b.h, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f7444c == cVar.f7444c && this.f7445d == cVar.f7445d && this.f7446e == cVar.f7446e && this.f7447f == cVar.f7447f && af.a((Object) this.f7443b, (Object) cVar.f7443b) && Arrays.equals(this.f7448h, cVar.f7448h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.f7444c + 527) * 31) + this.f7445d) * 31) + ((int) this.f7446e)) * 31) + ((int) this.f7447f)) * 31;
        String str = this.f7443b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7443b);
        parcel.writeInt(this.f7444c);
        parcel.writeInt(this.f7445d);
        parcel.writeLong(this.f7446e);
        parcel.writeLong(this.f7447f);
        parcel.writeInt(this.f7448h.length);
        for (h hVar : this.f7448h) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    private h a(int i) {
        return this.f7448h[i];
    }

    public c(Parcel parcel) {
        super(f7442a);
        this.f7443b = parcel.readString();
        this.f7444c = parcel.readInt();
        this.f7445d = parcel.readInt();
        this.f7446e = parcel.readLong();
        this.f7447f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f7448h = new h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f7448h[i] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
