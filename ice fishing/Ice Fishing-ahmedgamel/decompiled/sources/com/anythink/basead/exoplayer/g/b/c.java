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
    public static final String f8071a = "CHAP";

    /* renamed from: b, reason: collision with root package name */
    public final String f8072b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8073c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8074d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8075e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8076f;

    /* renamed from: h, reason: collision with root package name */
    private final h[] f8077h;

    public c(String str, int i, int i4, long j6, long j9, h[] hVarArr) {
        super(f8071a);
        this.f8072b = str;
        this.f8073c = i;
        this.f8074d = i4;
        this.f8075e = j6;
        this.f8076f = j9;
        this.f8077h = hVarArr;
    }

    private int a() {
        return this.f8077h.length;
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
            if (this.f8073c == cVar.f8073c && this.f8074d == cVar.f8074d && this.f8075e == cVar.f8075e && this.f8076f == cVar.f8076f && af.a((Object) this.f8072b, (Object) cVar.f8072b) && Arrays.equals(this.f8077h, cVar.f8077h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.f8073c + 527) * 31) + this.f8074d) * 31) + ((int) this.f8075e)) * 31) + ((int) this.f8076f)) * 31;
        String str = this.f8072b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8072b);
        parcel.writeInt(this.f8073c);
        parcel.writeInt(this.f8074d);
        parcel.writeLong(this.f8075e);
        parcel.writeLong(this.f8076f);
        parcel.writeInt(this.f8077h.length);
        for (h hVar : this.f8077h) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    private h a(int i) {
        return this.f8077h[i];
    }

    public c(Parcel parcel) {
        super(f8071a);
        this.f8072b = parcel.readString();
        this.f8073c = parcel.readInt();
        this.f8074d = parcel.readInt();
        this.f8075e = parcel.readLong();
        this.f8076f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f8077h = new h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f8077h[i] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
