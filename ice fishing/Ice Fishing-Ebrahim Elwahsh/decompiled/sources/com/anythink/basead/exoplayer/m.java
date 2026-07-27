package com.anythink.basead.exoplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new Parcelable.Creator<m>() { // from class: com.anythink.basead.exoplayer.m.1
        private static m a(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ m[] newArray(int i) {
            return new m[i];
        }

        private static m[] a(int i) {
            return new m[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public static final int f8812a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static final long f8813b = Long.MAX_VALUE;

    /* renamed from: A, reason: collision with root package name */
    public final String f8814A;

    /* renamed from: B, reason: collision with root package name */
    public final int f8815B;

    /* renamed from: C, reason: collision with root package name */
    private int f8816C;

    /* renamed from: c, reason: collision with root package name */
    public final String f8817c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8818d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8819e;

    /* renamed from: f, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.g.a f8820f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8821g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8822h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final List<byte[]> f8823j;

    /* renamed from: k, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.d.e f8824k;

    /* renamed from: l, reason: collision with root package name */
    public final long f8825l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8826m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8827n;

    /* renamed from: o, reason: collision with root package name */
    public final float f8828o;

    /* renamed from: p, reason: collision with root package name */
    public final int f8829p;

    /* renamed from: q, reason: collision with root package name */
    public final float f8830q;

    /* renamed from: r, reason: collision with root package name */
    public final int f8831r;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f8832s;

    /* renamed from: t, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.l.b f8833t;

    /* renamed from: u, reason: collision with root package name */
    public final int f8834u;

    /* renamed from: v, reason: collision with root package name */
    public final int f8835v;

    /* renamed from: w, reason: collision with root package name */
    public final int f8836w;

    /* renamed from: x, reason: collision with root package name */
    public final int f8837x;

    /* renamed from: y, reason: collision with root package name */
    public final int f8838y;

    /* renamed from: z, reason: collision with root package name */
    public final int f8839z;

    private m(String str, String str2, String str3, String str4, int i, int i4, int i9, int i10, float f6, int i11, float f9, byte[] bArr, int i12, com.anythink.basead.exoplayer.l.b bVar, int i13, int i14, int i15, int i16, int i17, int i18, String str5, int i19, long j9, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar, com.anythink.basead.exoplayer.g.a aVar) {
        this.f8817c = str;
        this.f8821g = str2;
        this.f8822h = str3;
        this.f8819e = str4;
        this.f8818d = i;
        this.i = i4;
        this.f8826m = i9;
        this.f8827n = i10;
        this.f8828o = f6;
        this.f8829p = i11 == -1 ? 0 : i11;
        this.f8830q = f9 == -1.0f ? 1.0f : f9;
        this.f8832s = bArr;
        this.f8831r = i12;
        this.f8833t = bVar;
        this.f8834u = i13;
        this.f8835v = i14;
        this.f8836w = i15;
        int i20 = i16;
        this.f8837x = i20 == -1 ? 0 : i20;
        this.f8838y = i17 != -1 ? i17 : 0;
        this.f8839z = i18;
        this.f8814A = str5;
        this.f8815B = i19;
        this.f8825l = j9;
        this.f8823j = list == null ? Collections.EMPTY_LIST : list;
        this.f8824k = eVar;
        this.f8820f = aVar;
    }

    private static m a(String str, String str2, String str3, String str4, int i, int i4, int i9, float f6, List<byte[]> list, int i10) {
        return new m(str, str2, str3, str4, i, -1, i4, i9, f6, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i10, null, -1, Long.MAX_VALUE, list, null, null);
    }

    private static m b(String str, String str2, String str3, int i, int i4, int i9, int i10, float f6, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar) {
        return a(str, str2, str3, i, i4, i9, i10, f6, list, -1, -1.0f, null, -1, null, eVar);
    }

    private static m c(String str, String str2, String str3, String str4, int i, int i4, String str5) {
        return new m(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f8818d == mVar.f8818d && this.i == mVar.i && this.f8826m == mVar.f8826m && this.f8827n == mVar.f8827n && this.f8828o == mVar.f8828o && this.f8829p == mVar.f8829p && this.f8830q == mVar.f8830q && this.f8831r == mVar.f8831r && this.f8834u == mVar.f8834u && this.f8835v == mVar.f8835v && this.f8836w == mVar.f8836w && this.f8837x == mVar.f8837x && this.f8838y == mVar.f8838y && this.f8825l == mVar.f8825l && this.f8839z == mVar.f8839z && af.a((Object) this.f8817c, (Object) mVar.f8817c) && af.a((Object) this.f8814A, (Object) mVar.f8814A) && this.f8815B == mVar.f8815B && af.a((Object) this.f8821g, (Object) mVar.f8821g) && af.a((Object) this.f8822h, (Object) mVar.f8822h) && af.a((Object) this.f8819e, (Object) mVar.f8819e) && af.a(this.f8824k, mVar.f8824k) && af.a(this.f8820f, mVar.f8820f) && af.a(this.f8833t, mVar.f8833t) && Arrays.equals(this.f8832s, mVar.f8832s) && b(mVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8816C == 0) {
            String str = this.f8817c;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f8821g;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f8822h;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f8819e;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f8818d) * 31) + this.f8826m) * 31) + this.f8827n) * 31) + this.f8834u) * 31) + this.f8835v) * 31;
            String str5 = this.f8814A;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f8815B) * 31;
            com.anythink.basead.exoplayer.d.e eVar = this.f8824k;
            int hashCode6 = (hashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            com.anythink.basead.exoplayer.g.a aVar = this.f8820f;
            this.f8816C = hashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }
        return this.f8816C;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f8817c);
        sb.append(", ");
        sb.append(this.f8821g);
        sb.append(", ");
        sb.append(this.f8822h);
        sb.append(", ");
        sb.append(this.f8818d);
        sb.append(", ");
        sb.append(this.f8814A);
        sb.append(", [");
        sb.append(this.f8826m);
        sb.append(", ");
        sb.append(this.f8827n);
        sb.append(", ");
        sb.append(this.f8828o);
        sb.append("], [");
        sb.append(this.f8834u);
        sb.append(", ");
        return AbstractC5051n.e(this.f8835v, "])", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8817c);
        parcel.writeString(this.f8821g);
        parcel.writeString(this.f8822h);
        parcel.writeString(this.f8819e);
        parcel.writeInt(this.f8818d);
        parcel.writeInt(this.i);
        parcel.writeInt(this.f8826m);
        parcel.writeInt(this.f8827n);
        parcel.writeFloat(this.f8828o);
        parcel.writeInt(this.f8829p);
        parcel.writeFloat(this.f8830q);
        af.a(parcel, this.f8832s != null);
        byte[] bArr = this.f8832s;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f8831r);
        parcel.writeParcelable(this.f8833t, i);
        parcel.writeInt(this.f8834u);
        parcel.writeInt(this.f8835v);
        parcel.writeInt(this.f8836w);
        parcel.writeInt(this.f8837x);
        parcel.writeInt(this.f8838y);
        parcel.writeInt(this.f8839z);
        parcel.writeString(this.f8814A);
        parcel.writeInt(this.f8815B);
        parcel.writeLong(this.f8825l);
        int size = this.f8823j.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeByteArray(this.f8823j.get(i4));
        }
        parcel.writeParcelable(this.f8824k, 0);
        parcel.writeParcelable(this.f8820f, 0);
    }

    public static m a(String str, String str2, String str3, int i, int i4, int i9, int i10, float f6, List<byte[]> list, int i11, float f9, byte[] bArr, int i12, com.anythink.basead.exoplayer.l.b bVar, com.anythink.basead.exoplayer.d.e eVar) {
        return new m(str, null, str2, str3, i, i4, i9, i10, f6, i11, f9, bArr, i12, bVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, eVar, null);
    }

    private static m b(String str, String str2, String str3, String str4, int i, int i4, String str5) {
        return new m(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    public static String c(m mVar) {
        if (mVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("id=");
        sb.append(mVar.f8817c);
        sb.append(", mimeType=");
        sb.append(mVar.f8822h);
        if (mVar.f8818d != -1) {
            sb.append(", bitrate=");
            sb.append(mVar.f8818d);
        }
        if (mVar.f8826m != -1 && mVar.f8827n != -1) {
            sb.append(", res=");
            sb.append(mVar.f8826m);
            sb.append("x");
            sb.append(mVar.f8827n);
        }
        if (mVar.f8828o != -1.0f) {
            sb.append(", fps=");
            sb.append(mVar.f8828o);
        }
        if (mVar.f8834u != -1) {
            sb.append(", channels=");
            sb.append(mVar.f8834u);
        }
        if (mVar.f8835v != -1) {
            sb.append(", sample_rate=");
            sb.append(mVar.f8835v);
        }
        if (mVar.f8814A != null) {
            sb.append(", language=");
            sb.append(mVar.f8814A);
        }
        return sb.toString();
    }

    private static m a(String str, String str2, String str3, String str4, int i, int i4, int i9, List<byte[]> list, int i10, String str5) {
        return new m(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i4, i9, -1, -1, -1, i10, str5, -1, Long.MAX_VALUE, list, null, null);
    }

    private m b(int i) {
        return new m(this.f8817c, this.f8821g, this.f8822h, this.f8819e, this.f8818d, this.i, this.f8826m, this.f8827n, this.f8828o, i, this.f8830q, this.f8832s, this.f8831r, this.f8833t, this.f8834u, this.f8835v, this.f8836w, this.f8837x, this.f8838y, this.f8839z, this.f8814A, this.f8815B, this.f8825l, this.f8823j, this.f8824k, this.f8820f);
    }

    public static m a(String str, String str2, String str3, int i, int i4, int i9, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar, String str4) {
        return a(str, str2, str3, i, i4, i9, -1, list, eVar, str4);
    }

    public final boolean b(m mVar) {
        if (this.f8823j.size() != mVar.f8823j.size()) {
            return false;
        }
        for (int i = 0; i < this.f8823j.size(); i++) {
            if (!Arrays.equals(this.f8823j.get(i), mVar.f8823j.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static m a(String str, String str2, String str3, int i, int i4, int i9, int i10, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar, String str4) {
        return a(str, str2, str3, i, i4, i9, i10, list, eVar, str4, null);
    }

    private static m a(String str, String str2, String str3, int i, int i4, int i9, int i10, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar, String str4, com.anythink.basead.exoplayer.g.a aVar) {
        return new m(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i4, i9, i10, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, eVar, aVar);
    }

    private static m a(String str, String str2, int i, String str3, com.anythink.basead.exoplayer.d.e eVar) {
        return a(str, str2, (String) null, -1, i, str3, -1, eVar, Long.MAX_VALUE, (List<byte[]>) Collections.EMPTY_LIST);
    }

    private static m a(String str, String str2, String str3, int i, int i4, String str4, int i9, com.anythink.basead.exoplayer.d.e eVar) {
        return a(str, str2, str3, i, i4, str4, i9, eVar, Long.MAX_VALUE, (List<byte[]>) Collections.EMPTY_LIST);
    }

    private static m a(String str, String str2, String str3, int i, int i4, String str4, com.anythink.basead.exoplayer.d.e eVar, long j9) {
        return a(str, str2, str3, i, i4, str4, -1, eVar, j9, (List<byte[]>) Collections.EMPTY_LIST);
    }

    public static m a(String str, String str2, String str3, int i, int i4, String str4, int i9, com.anythink.basead.exoplayer.d.e eVar, long j9, List<byte[]> list) {
        return new m(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, str4, i9, j9, list, eVar, null);
    }

    private static m a(String str, String str2, String str3, int i, int i4, List<byte[]> list, String str4, com.anythink.basead.exoplayer.d.e eVar) {
        return new m(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, str4, -1, Long.MAX_VALUE, list, eVar, null);
    }

    public static m a(String str, String str2) {
        return new m(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
    }

    public static m a(String str, String str2, String str3, com.anythink.basead.exoplayer.d.e eVar) {
        return new m(str, null, str2, str3, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, eVar, null);
    }

    public final m a(int i) {
        return new m(this.f8817c, this.f8821g, this.f8822h, this.f8819e, this.f8818d, i, this.f8826m, this.f8827n, this.f8828o, this.f8829p, this.f8830q, this.f8832s, this.f8831r, this.f8833t, this.f8834u, this.f8835v, this.f8836w, this.f8837x, this.f8838y, this.f8839z, this.f8814A, this.f8815B, this.f8825l, this.f8823j, this.f8824k, this.f8820f);
    }

    public final m a(long j9) {
        return new m(this.f8817c, this.f8821g, this.f8822h, this.f8819e, this.f8818d, this.i, this.f8826m, this.f8827n, this.f8828o, this.f8829p, this.f8830q, this.f8832s, this.f8831r, this.f8833t, this.f8834u, this.f8835v, this.f8836w, this.f8837x, this.f8838y, this.f8839z, this.f8814A, this.f8815B, j9, this.f8823j, this.f8824k, this.f8820f);
    }

    private m a(String str, String str2, String str3, int i, int i4, int i9, int i10, String str4) {
        return new m(str, this.f8821g, str2, str3, i, this.i, i4, i9, this.f8828o, this.f8829p, this.f8830q, this.f8832s, this.f8831r, this.f8833t, this.f8834u, this.f8835v, this.f8836w, this.f8837x, this.f8838y, i10, str4, this.f8815B, this.f8825l, this.f8823j, this.f8824k, this.f8820f);
    }

    public final m a(m mVar) {
        if (this == mVar) {
            return this;
        }
        String str = mVar.f8817c;
        String str2 = this.f8819e;
        if (str2 == null) {
            str2 = mVar.f8819e;
        }
        String str3 = str2;
        int i = this.f8818d;
        if (i == -1) {
            i = mVar.f8818d;
        }
        int i4 = i;
        float f6 = this.f8828o;
        if (f6 == -1.0f) {
            f6 = mVar.f8828o;
        }
        float f9 = f6;
        int i9 = this.f8839z | mVar.f8839z;
        String str4 = this.f8814A;
        if (str4 == null) {
            str4 = mVar.f8814A;
        }
        return new m(str, this.f8821g, this.f8822h, str3, i4, this.i, this.f8826m, this.f8827n, f9, this.f8829p, this.f8830q, this.f8832s, this.f8831r, this.f8833t, this.f8834u, this.f8835v, this.f8836w, this.f8837x, this.f8838y, i9, str4, this.f8815B, this.f8825l, this.f8823j, com.anythink.basead.exoplayer.d.e.a(mVar.f8824k, this.f8824k), this.f8820f);
    }

    public m(Parcel parcel) {
        this.f8817c = parcel.readString();
        this.f8821g = parcel.readString();
        this.f8822h = parcel.readString();
        this.f8819e = parcel.readString();
        this.f8818d = parcel.readInt();
        this.i = parcel.readInt();
        this.f8826m = parcel.readInt();
        this.f8827n = parcel.readInt();
        this.f8828o = parcel.readFloat();
        this.f8829p = parcel.readInt();
        this.f8830q = parcel.readFloat();
        this.f8832s = af.a(parcel) ? parcel.createByteArray() : null;
        this.f8831r = parcel.readInt();
        this.f8833t = (com.anythink.basead.exoplayer.l.b) parcel.readParcelable(com.anythink.basead.exoplayer.l.b.class.getClassLoader());
        this.f8834u = parcel.readInt();
        this.f8835v = parcel.readInt();
        this.f8836w = parcel.readInt();
        this.f8837x = parcel.readInt();
        this.f8838y = parcel.readInt();
        this.f8839z = parcel.readInt();
        this.f8814A = parcel.readString();
        this.f8815B = parcel.readInt();
        this.f8825l = parcel.readLong();
        int readInt = parcel.readInt();
        this.f8823j = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f8823j.add(parcel.createByteArray());
        }
        this.f8824k = (com.anythink.basead.exoplayer.d.e) parcel.readParcelable(com.anythink.basead.exoplayer.d.e.class.getClassLoader());
        this.f8820f = (com.anythink.basead.exoplayer.g.a) parcel.readParcelable(com.anythink.basead.exoplayer.g.a.class.getClassLoader());
    }

    public final m a(int i, int i4) {
        return new m(this.f8817c, this.f8821g, this.f8822h, this.f8819e, this.f8818d, this.i, this.f8826m, this.f8827n, this.f8828o, this.f8829p, this.f8830q, this.f8832s, this.f8831r, this.f8833t, this.f8834u, this.f8835v, this.f8836w, i, i4, this.f8839z, this.f8814A, this.f8815B, this.f8825l, this.f8823j, this.f8824k, this.f8820f);
    }

    public final m a(com.anythink.basead.exoplayer.d.e eVar) {
        return new m(this.f8817c, this.f8821g, this.f8822h, this.f8819e, this.f8818d, this.i, this.f8826m, this.f8827n, this.f8828o, this.f8829p, this.f8830q, this.f8832s, this.f8831r, this.f8833t, this.f8834u, this.f8835v, this.f8836w, this.f8837x, this.f8838y, this.f8839z, this.f8814A, this.f8815B, this.f8825l, this.f8823j, eVar, this.f8820f);
    }

    public final m a(com.anythink.basead.exoplayer.g.a aVar) {
        return new m(this.f8817c, this.f8821g, this.f8822h, this.f8819e, this.f8818d, this.i, this.f8826m, this.f8827n, this.f8828o, this.f8829p, this.f8830q, this.f8832s, this.f8831r, this.f8833t, this.f8834u, this.f8835v, this.f8836w, this.f8837x, this.f8838y, this.f8839z, this.f8814A, this.f8815B, this.f8825l, this.f8823j, this.f8824k, aVar);
    }

    public final int a() {
        int i;
        int i4 = this.f8826m;
        if (i4 == -1 || (i = this.f8827n) == -1) {
            return -1;
        }
        return i4 * i;
    }

    private static m a(String str, String str2, String str3, int i, int i4, int i9, int i10, float f6, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar) {
        return a(str, str2, str3, i, i4, i9, i10, f6, list, -1, -1.0f, null, -1, null, eVar);
    }

    private static m a(String str, String str2, String str3, String str4, int i, int i4, String str5) {
        return new m(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    private static m a(String str, String str2, int i, String str3) {
        return a(str, str2, (String) null, -1, i, str3, -1, (com.anythink.basead.exoplayer.d.e) null, Long.MAX_VALUE, (List<byte[]>) Collections.EMPTY_LIST);
    }
}
