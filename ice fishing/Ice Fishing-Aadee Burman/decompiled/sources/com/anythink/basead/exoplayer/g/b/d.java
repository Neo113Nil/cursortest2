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
    public static final String f7292a = "CTOC";

    /* renamed from: b, reason: collision with root package name */
    public final String f7293b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7294c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7295d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f7296e;

    /* renamed from: f, reason: collision with root package name */
    private final h[] f7297f;

    public d(String str, boolean z3, boolean z6, String[] strArr, h[] hVarArr) {
        super(f7292a);
        this.f7293b = str;
        this.f7294c = z3;
        this.f7295d = z6;
        this.f7296e = strArr;
        this.f7297f = hVarArr;
    }

    private int a() {
        return this.f7297f.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f7294c == dVar.f7294c && this.f7295d == dVar.f7295d && af.a((Object) this.f7293b, (Object) dVar.f7293b) && Arrays.equals(this.f7296e, dVar.f7296e) && Arrays.equals(this.f7297f, dVar.f7297f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.f7294c ? 1 : 0) + 527) * 31) + (this.f7295d ? 1 : 0)) * 31;
        String str = this.f7293b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7293b);
        parcel.writeByte(this.f7294c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f7295d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f7296e);
        parcel.writeInt(this.f7297f.length);
        for (h hVar : this.f7297f) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    private h a(int i) {
        return this.f7297f[i];
    }

    public d(Parcel parcel) {
        super(f7292a);
        this.f7293b = parcel.readString();
        this.f7294c = parcel.readByte() != 0;
        this.f7295d = parcel.readByte() != 0;
        this.f7296e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f7297f = new h[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f7297f[i] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }
}
