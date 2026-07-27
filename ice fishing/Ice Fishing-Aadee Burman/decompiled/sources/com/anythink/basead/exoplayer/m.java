package com.anythink.basead.exoplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    public static final int f8655a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static final long f8656b = Long.MAX_VALUE;

    /* renamed from: A, reason: collision with root package name */
    public final String f8657A;

    /* renamed from: B, reason: collision with root package name */
    public final int f8658B;

    /* renamed from: C, reason: collision with root package name */
    private int f8659C;

    /* renamed from: c, reason: collision with root package name */
    public final String f8660c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8661d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8662e;

    /* renamed from: f, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.g.a f8663f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8664g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8665h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final List<byte[]> f8666j;

    /* renamed from: k, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.d.e f8667k;

    /* renamed from: l, reason: collision with root package name */
    public final long f8668l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8669m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8670n;

    /* renamed from: o, reason: collision with root package name */
    public final float f8671o;

    /* renamed from: p, reason: collision with root package name */
    public final int f8672p;

    /* renamed from: q, reason: collision with root package name */
    public final float f8673q;

    /* renamed from: r, reason: collision with root package name */
    public final int f8674r;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f8675s;

    /* renamed from: t, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.l.b f8676t;

    /* renamed from: u, reason: collision with root package name */
    public final int f8677u;

    /* renamed from: v, reason: collision with root package name */
    public final int f8678v;

    /* renamed from: w, reason: collision with root package name */
    public final int f8679w;

    /* renamed from: x, reason: collision with root package name */
    public final int f8680x;

    /* renamed from: y, reason: collision with root package name */
    public final int f8681y;

    /* renamed from: z, reason: collision with root package name */
    public final int f8682z;

    private m(String str, String str2, String str3, String str4, int i, int i6, int i9, int i10, float f3, int i11, float f9, byte[] bArr, int i12, com.anythink.basead.exoplayer.l.b bVar, int i13, int i14, int i15, int i16, int i17, int i18, String str5, int i19, long j6, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar, com.anythink.basead.exoplayer.g.a aVar) {
        this.f8660c = str;
        this.f8664g = str2;
        this.f8665h = str3;
        this.f8662e = str4;
        this.f8661d = i;
        this.i = i6;
        this.f8669m = i9;
        this.f8670n = i10;
        this.f8671o = f3;
        this.f8672p = i11 == -1 ? 0 : i11;
        this.f8673q = f9 == -1.0f ? 1.0f : f9;
        this.f8675s = bArr;
        this.f8674r = i12;
        this.f8676t = bVar;
        this.f8677u = i13;
        this.f8678v = i14;
        this.f8679w = i15;
        int i20 = i16;
        this.f8680x = i20 == -1 ? 0 : i20;
        this.f8681y = i17 != -1 ? i17 : 0;
        this.f8682z = i18;
        this.f8657A = str5;
        this.f8658B = i19;
        this.f8668l = j6;
        this.f8666j = list == null ? Collections.EMPTY_LIST : list;
        this.f8667k = eVar;
        this.f8663f = aVar;
    }

    private static m a(String str, String str2, String str3, String str4, int i, int i6, int i9, float f3, List<byte[]> list, int i10) {
        return new m(str, str2, str3, str4, i, -1, i6, i9, f3, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i10, null, -1, Long.MAX_VALUE, list, null, null);
    }

    private static m b(String str, String str2, String str3, int i, int i6, int i9, int i10, float f3, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar) {
        return a(str, str2, str3, i, i6, i9, i10, f3, list, -1, -1.0f, null, -1, null, eVar);
    }

    private static m c(String str, String str2, String str3, String str4, int i, int i6, String str5) {
        return new m(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i6, str5, -1, Long.MAX_VALUE, null, null, null);
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
            if (this.f8661d == mVar.f8661d && this.i == mVar.i && this.f8669m == mVar.f8669m && this.f8670n == mVar.f8670n && this.f8671o == mVar.f8671o && this.f8672p == mVar.f8672p && this.f8673q == mVar.f8673q && this.f8674r == mVar.f8674r && this.f8677u == mVar.f8677u && this.f8678v == mVar.f8678v && this.f8679w == mVar.f8679w && this.f8680x == mVar.f8680x && this.f8681y == mVar.f8681y && this.f8668l == mVar.f8668l && this.f8682z == mVar.f8682z && af.a((Object) this.f8660c, (Object) mVar.f8660c) && af.a((Object) this.f8657A, (Object) mVar.f8657A) && this.f8658B == mVar.f8658B && af.a((Object) this.f8664g, (Object) mVar.f8664g) && af.a((Object) this.f8665h, (Object) mVar.f8665h) && af.a((Object) this.f8662e, (Object) mVar.f8662e) && af.a(this.f8667k, mVar.f8667k) && af.a(this.f8663f, mVar.f8663f) && af.a(this.f8676t, mVar.f8676t) && Arrays.equals(this.f8675s, mVar.f8675s) && b(mVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8659C == 0) {
            String str = this.f8660c;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f8664g;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f8665h;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f8662e;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f8661d) * 31) + this.f8669m) * 31) + this.f8670n) * 31) + this.f8677u) * 31) + this.f8678v) * 31;
            String str5 = this.f8657A;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f8658B) * 31;
            com.anythink.basead.exoplayer.d.e eVar = this.f8667k;
            int hashCode6 = (hashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            com.anythink.basead.exoplayer.g.a aVar = this.f8663f;
            this.f8659C = hashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }
        return this.f8659C;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f8660c);
        sb.append(", ");
        sb.append(this.f8664g);
        sb.append(", ");
        sb.append(this.f8665h);
        sb.append(", ");
        sb.append(this.f8661d);
        sb.append(", ");
        sb.append(this.f8657A);
        sb.append(", [");
        sb.append(this.f8669m);
        sb.append(", ");
        sb.append(this.f8670n);
        sb.append(", ");
        sb.append(this.f8671o);
        sb.append("], [");
        sb.append(this.f8677u);
        sb.append(", ");
        return u1.h.e(this.f8678v, "])", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8660c);
        parcel.writeString(this.f8664g);
        parcel.writeString(this.f8665h);
        parcel.writeString(this.f8662e);
        parcel.writeInt(this.f8661d);
        parcel.writeInt(this.i);
        parcel.writeInt(this.f8669m);
        parcel.writeInt(this.f8670n);
        parcel.writeFloat(this.f8671o);
        parcel.writeInt(this.f8672p);
        parcel.writeFloat(this.f8673q);
        af.a(parcel, this.f8675s != null);
        byte[] bArr = this.f8675s;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f8674r);
        parcel.writeParcelable(this.f8676t, i);
        parcel.writeInt(this.f8677u);
        parcel.writeInt(this.f8678v);
        parcel.writeInt(this.f8679w);
        parcel.writeInt(this.f8680x);
        parcel.writeInt(this.f8681y);
        parcel.writeInt(this.f8682z);
        parcel.writeString(this.f8657A);
        parcel.writeInt(this.f8658B);
        parcel.writeLong(this.f8668l);
        int size = this.f8666j.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            parcel.writeByteArray(this.f8666j.get(i6));
        }
        parcel.writeParcelable(this.f8667k, 0);
        parcel.writeParcelable(this.f8663f, 0);
    }

    public static m a(String str, String str2, String str3, int i, int i6, int i9, int i10, float f3, List<byte[]> list, int i11, float f9, byte[] bArr, int i12, com.anythink.basead.exoplayer.l.b bVar, com.anythink.basead.exoplayer.d.e eVar) {
        return new m(str, null, str2, str3, i, i6, i9, i10, f3, i11, f9, bArr, i12, bVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, eVar, null);
    }

    private static m b(String str, String str2, String str3, String str4, int i, int i6, String str5) {
        return new m(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i6, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    public static String c(m mVar) {
        if (mVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("id=");
        sb.append(mVar.f8660c);
        sb.append(", mimeType=");
        sb.append(mVar.f8665h);
        if (mVar.f8661d != -1) {
            sb.append(", bitrate=");
            sb.append(mVar.f8661d);
        }
        if (mVar.f8669m != -1 && mVar.f8670n != -1) {
            sb.append(", res=");
            sb.append(mVar.f8669m);
            sb.append("x");
            sb.append(mVar.f8670n);
        }
        if (mVar.f8671o != -1.0f) {
            sb.append(", fps=");
            sb.append(mVar.f8671o);
        }
        if (mVar.f8677u != -1) {
            sb.append(", channels=");
            sb.append(mVar.f8677u);
        }
        if (mVar.f8678v != -1) {
            sb.append(", sample_rate=");
            sb.append(mVar.f8678v);
        }
        if (mVar.f8657A != null) {
            sb.append(", language=");
            sb.append(mVar.f8657A);
        }
        return sb.toString();
    }

    private static m a(String str, String str2, String str3, String str4, int i, int i6, int i9, List<byte[]> list, int i10, String str5) {
        return new m(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i6, i9, -1, -1, -1, i10, str5, -1, Long.MAX_VALUE, list, null, null);
    }

    private m b(int i) {
        return new m(this.f8660c, this.f8664g, this.f8665h, this.f8662e, this.f8661d, this.i, this.f8669m, this.f8670n, this.f8671o, i, this.f8673q, this.f8675s, this.f8674r, this.f8676t, this.f8677u, this.f8678v, this.f8679w, this.f8680x, this.f8681y, this.f8682z, this.f8657A, this.f8658B, this.f8668l, this.f8666j, this.f8667k, this.f8663f);
    }

    public static m a(String str, String str2, String str3, int i, int i6, int i9, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar, String str4) {
        return a(str, str2, str3, i, i6, i9, -1, list, eVar, str4);
    }

    public final boolean b(m mVar) {
        if (this.f8666j.size() != mVar.f8666j.size()) {
            return false;
        }
        for (int i = 0; i < this.f8666j.size(); i++) {
            if (!Arrays.equals(this.f8666j.get(i), mVar.f8666j.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static m a(String str, String str2, String str3, int i, int i6, int i9, int i10, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar, String str4) {
        return a(str, str2, str3, i, i6, i9, i10, list, eVar, str4, null);
    }

    private static m a(String str, String str2, String str3, int i, int i6, int i9, int i10, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar, String str4, com.anythink.basead.exoplayer.g.a aVar) {
        return new m(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i6, i9, i10, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, eVar, aVar);
    }

    private static m a(String str, String str2, int i, String str3, com.anythink.basead.exoplayer.d.e eVar) {
        return a(str, str2, (String) null, -1, i, str3, -1, eVar, Long.MAX_VALUE, (List<byte[]>) Collections.EMPTY_LIST);
    }

    private static m a(String str, String str2, String str3, int i, int i6, String str4, int i9, com.anythink.basead.exoplayer.d.e eVar) {
        return a(str, str2, str3, i, i6, str4, i9, eVar, Long.MAX_VALUE, (List<byte[]>) Collections.EMPTY_LIST);
    }

    private static m a(String str, String str2, String str3, int i, int i6, String str4, com.anythink.basead.exoplayer.d.e eVar, long j6) {
        return a(str, str2, str3, i, i6, str4, -1, eVar, j6, (List<byte[]>) Collections.EMPTY_LIST);
    }

    public static m a(String str, String str2, String str3, int i, int i6, String str4, int i9, com.anythink.basead.exoplayer.d.e eVar, long j6, List<byte[]> list) {
        return new m(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i6, str4, i9, j6, list, eVar, null);
    }

    private static m a(String str, String str2, String str3, int i, int i6, List<byte[]> list, String str4, com.anythink.basead.exoplayer.d.e eVar) {
        return new m(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i6, str4, -1, Long.MAX_VALUE, list, eVar, null);
    }

    public static m a(String str, String str2) {
        return new m(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
    }

    public static m a(String str, String str2, String str3, com.anythink.basead.exoplayer.d.e eVar) {
        return new m(str, null, str2, str3, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, eVar, null);
    }

    public final m a(int i) {
        return new m(this.f8660c, this.f8664g, this.f8665h, this.f8662e, this.f8661d, i, this.f8669m, this.f8670n, this.f8671o, this.f8672p, this.f8673q, this.f8675s, this.f8674r, this.f8676t, this.f8677u, this.f8678v, this.f8679w, this.f8680x, this.f8681y, this.f8682z, this.f8657A, this.f8658B, this.f8668l, this.f8666j, this.f8667k, this.f8663f);
    }

    public final m a(long j6) {
        return new m(this.f8660c, this.f8664g, this.f8665h, this.f8662e, this.f8661d, this.i, this.f8669m, this.f8670n, this.f8671o, this.f8672p, this.f8673q, this.f8675s, this.f8674r, this.f8676t, this.f8677u, this.f8678v, this.f8679w, this.f8680x, this.f8681y, this.f8682z, this.f8657A, this.f8658B, j6, this.f8666j, this.f8667k, this.f8663f);
    }

    private m a(String str, String str2, String str3, int i, int i6, int i9, int i10, String str4) {
        return new m(str, this.f8664g, str2, str3, i, this.i, i6, i9, this.f8671o, this.f8672p, this.f8673q, this.f8675s, this.f8674r, this.f8676t, this.f8677u, this.f8678v, this.f8679w, this.f8680x, this.f8681y, i10, str4, this.f8658B, this.f8668l, this.f8666j, this.f8667k, this.f8663f);
    }

    public final m a(m mVar) {
        if (this == mVar) {
            return this;
        }
        String str = mVar.f8660c;
        String str2 = this.f8662e;
        if (str2 == null) {
            str2 = mVar.f8662e;
        }
        String str3 = str2;
        int i = this.f8661d;
        if (i == -1) {
            i = mVar.f8661d;
        }
        int i6 = i;
        float f3 = this.f8671o;
        if (f3 == -1.0f) {
            f3 = mVar.f8671o;
        }
        float f9 = f3;
        int i9 = this.f8682z | mVar.f8682z;
        String str4 = this.f8657A;
        if (str4 == null) {
            str4 = mVar.f8657A;
        }
        return new m(str, this.f8664g, this.f8665h, str3, i6, this.i, this.f8669m, this.f8670n, f9, this.f8672p, this.f8673q, this.f8675s, this.f8674r, this.f8676t, this.f8677u, this.f8678v, this.f8679w, this.f8680x, this.f8681y, i9, str4, this.f8658B, this.f8668l, this.f8666j, com.anythink.basead.exoplayer.d.e.a(mVar.f8667k, this.f8667k), this.f8663f);
    }

    public m(Parcel parcel) {
        this.f8660c = parcel.readString();
        this.f8664g = parcel.readString();
        this.f8665h = parcel.readString();
        this.f8662e = parcel.readString();
        this.f8661d = parcel.readInt();
        this.i = parcel.readInt();
        this.f8669m = parcel.readInt();
        this.f8670n = parcel.readInt();
        this.f8671o = parcel.readFloat();
        this.f8672p = parcel.readInt();
        this.f8673q = parcel.readFloat();
        this.f8675s = af.a(parcel) ? parcel.createByteArray() : null;
        this.f8674r = parcel.readInt();
        this.f8676t = (com.anythink.basead.exoplayer.l.b) parcel.readParcelable(com.anythink.basead.exoplayer.l.b.class.getClassLoader());
        this.f8677u = parcel.readInt();
        this.f8678v = parcel.readInt();
        this.f8679w = parcel.readInt();
        this.f8680x = parcel.readInt();
        this.f8681y = parcel.readInt();
        this.f8682z = parcel.readInt();
        this.f8657A = parcel.readString();
        this.f8658B = parcel.readInt();
        this.f8668l = parcel.readLong();
        int readInt = parcel.readInt();
        this.f8666j = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f8666j.add(parcel.createByteArray());
        }
        this.f8667k = (com.anythink.basead.exoplayer.d.e) parcel.readParcelable(com.anythink.basead.exoplayer.d.e.class.getClassLoader());
        this.f8663f = (com.anythink.basead.exoplayer.g.a) parcel.readParcelable(com.anythink.basead.exoplayer.g.a.class.getClassLoader());
    }

    public final m a(int i, int i6) {
        return new m(this.f8660c, this.f8664g, this.f8665h, this.f8662e, this.f8661d, this.i, this.f8669m, this.f8670n, this.f8671o, this.f8672p, this.f8673q, this.f8675s, this.f8674r, this.f8676t, this.f8677u, this.f8678v, this.f8679w, i, i6, this.f8682z, this.f8657A, this.f8658B, this.f8668l, this.f8666j, this.f8667k, this.f8663f);
    }

    public final m a(com.anythink.basead.exoplayer.d.e eVar) {
        return new m(this.f8660c, this.f8664g, this.f8665h, this.f8662e, this.f8661d, this.i, this.f8669m, this.f8670n, this.f8671o, this.f8672p, this.f8673q, this.f8675s, this.f8674r, this.f8676t, this.f8677u, this.f8678v, this.f8679w, this.f8680x, this.f8681y, this.f8682z, this.f8657A, this.f8658B, this.f8668l, this.f8666j, eVar, this.f8663f);
    }

    public final m a(com.anythink.basead.exoplayer.g.a aVar) {
        return new m(this.f8660c, this.f8664g, this.f8665h, this.f8662e, this.f8661d, this.i, this.f8669m, this.f8670n, this.f8671o, this.f8672p, this.f8673q, this.f8675s, this.f8674r, this.f8676t, this.f8677u, this.f8678v, this.f8679w, this.f8680x, this.f8681y, this.f8682z, this.f8657A, this.f8658B, this.f8668l, this.f8666j, this.f8667k, aVar);
    }

    public final int a() {
        int i;
        int i6 = this.f8669m;
        if (i6 == -1 || (i = this.f8670n) == -1) {
            return -1;
        }
        return i6 * i;
    }

    private static m a(String str, String str2, String str3, int i, int i6, int i9, int i10, float f3, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar) {
        return a(str, str2, str3, i, i6, i9, i10, f3, list, -1, -1.0f, null, -1, null, eVar);
    }

    private static m a(String str, String str2, String str3, String str4, int i, int i6, String str5) {
        return new m(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i6, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    private static m a(String str, String str2, int i, String str3) {
        return a(str, str2, (String) null, -1, i, str3, -1, (com.anythink.basead.exoplayer.d.e) null, Long.MAX_VALUE, (List<byte[]>) Collections.EMPTY_LIST);
    }
}
