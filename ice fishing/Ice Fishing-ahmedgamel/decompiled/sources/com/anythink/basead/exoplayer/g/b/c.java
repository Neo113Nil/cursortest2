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
    public static final String f7285a = "CHAP";

    /* renamed from: b, reason: collision with root package name */
    public final String f7286b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7287c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7288d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7289e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7290f;

    /* renamed from: h, reason: collision with root package name */
    private final h[] f7291h;

    public c(String str, int i, int i6, long j6, long j9, h[] hVarArr) {
        super(f7285a);
        this.f7286b = str;
        this.f7287c = i;
        this.f7288d = i6;
        this.f7289e = j6;
        this.f7290f = j9;
        this.f7291h = hVarArr;
    }

    private int a() {
        return this.f7291h.length;
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
            if (this.f7287c == cVar.f7287c && this.f7288d == cVar.f7288d && this.f7289e == cVar.f7289e && this.f7290f == cVar.f7290f && af.a((Object) this.f7286b, (Object) cVar.f7286b) && Arrays.equals(this.f7291h, cVar.f7291h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.f7287c + 527) * 31) + this.f7288d) * 31) + ((int) this.f7289e)) * 31) + ((int) this.f7290f)) * 31;
        String str = this.f7286b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7286b);
        parcel.writeInt(this.f7287c);
        parcel.writeInt(this.f7288d);
        parcel.writeLong(this.f7289e);
        parcel.writeLong(this.f7290f);
        parcel.writeInt(this.f7291h.length);
        for (h hVar : this.f7291h) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    private h a(int i) {
        return this.f7291h[i];
    }

    public c(Parcel parcel) {
        super(f7285a);
        this.f7286b = parcel.readString();
        this.f7287c = parcel.readInt();
        this.f7288d = parcel.readInt();
        this.f7289e = parcel.readLong();
        this.f7290f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f7291h = new h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f7291h[i] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
