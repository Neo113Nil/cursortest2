package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.anythink.basead.exoplayer.g.b.d.1
        private static d a(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ d[] newArray(int i) {
            return new d[i];
        }

        private static d[] a(int i) {
            return new d[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final String f8078a = "CTOC";

    /* renamed from: b, reason: collision with root package name */
    public final String f8079b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8080c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8081d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f8082e;

    /* renamed from: f, reason: collision with root package name */
    private final h[] f8083f;

    public d(String str, boolean z6, boolean z9, String[] strArr, h[] hVarArr) {
        super(f8078a);
        this.f8079b = str;
        this.f8080c = z6;
        this.f8081d = z9;
        this.f8082e = strArr;
        this.f8083f = hVarArr;
    }

    private int a() {
        return this.f8083f.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f8080c == dVar.f8080c && this.f8081d == dVar.f8081d && af.a((Object) this.f8079b, (Object) dVar.f8079b) && Arrays.equals(this.f8082e, dVar.f8082e) && Arrays.equals(this.f8083f, dVar.f8083f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.f8080c ? 1 : 0) + 527) * 31) + (this.f8081d ? 1 : 0)) * 31;
        String str = this.f8079b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8079b);
        parcel.writeByte(this.f8080c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8081d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f8082e);
        parcel.writeInt(this.f8083f.length);
        for (h hVar : this.f8083f) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    private h a(int i) {
        return this.f8083f[i];
    }

    public d(Parcel parcel) {
        super(f8078a);
        this.f8079b = parcel.readString();
        this.f8080c = parcel.readByte() != 0;
        this.f8081d = parcel.readByte() != 0;
        this.f8082e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f8083f = new h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f8083f[i] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
