package com.anythink.basead.exoplayer;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.af;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import w.AbstractC5128c;

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
    public static final int f9441a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static final long f9442b = Long.MAX_VALUE;

    /* renamed from: A, reason: collision with root package name */
    public final String f9443A;

    /* renamed from: B, reason: collision with root package name */
    public final int f9444B;

    /* renamed from: C, reason: collision with root package name */
    private int f9445C;

    /* renamed from: c, reason: collision with root package name */
    public final String f9446c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9447d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9448e;

    /* renamed from: f, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.g.a f9449f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9450g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9451h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final List<byte[]> f9452j;

    /* renamed from: k, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.d.e f9453k;

    /* renamed from: l, reason: collision with root package name */
    public final long f9454l;

    /* renamed from: m, reason: collision with root package name */
    public final int f9455m;

    /* renamed from: n, reason: collision with root package name */
    public final int f9456n;

    /* renamed from: o, reason: collision with root package name */
    public final float f9457o;

    /* renamed from: p, reason: collision with root package name */
    public final int f9458p;

    /* renamed from: q, reason: collision with root package name */
    public final float f9459q;

    /* renamed from: r, reason: collision with root package name */
    public final int f9460r;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f9461s;

    /* renamed from: t, reason: collision with root package name */
    public final com.anythink.basead.exoplayer.l.b f9462t;

    /* renamed from: u, reason: collision with root package name */
    public final int f9463u;

    /* renamed from: v, reason: collision with root package name */
    public final int f9464v;

    /* renamed from: w, reason: collision with root package name */
    public final int f9465w;

    /* renamed from: x, reason: collision with root package name */
    public final int f9466x;

    /* renamed from: y, reason: collision with root package name */
    public final int f9467y;

    /* renamed from: z, reason: collision with root package name */
    public final int f9468z;

    private m(String str, String str2, String str3, String str4, int i, int i4, int i6, int i9, float f2, int i10, float f9, byte[] bArr, int i11, com.anythink.basead.exoplayer.l.b bVar, int i12, int i13, int i14, int i15, int i16, int i17, String str5, int i18, long j6, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar, com.anythink.basead.exoplayer.g.a aVar) {
        this.f9446c = str;
        this.f9450g = str2;
        this.f9451h = str3;
        this.f9448e = str4;
        this.f9447d = i;
        this.i = i4;
        this.f9455m = i6;
        this.f9456n = i9;
        this.f9457o = f2;
        this.f9458p = i10 == -1 ? 0 : i10;
        this.f9459q = f9 == -1.0f ? 1.0f : f9;
        this.f9461s = bArr;
        this.f9460r = i11;
        this.f9462t = bVar;
        this.f9463u = i12;
        this.f9464v = i13;
        this.f9465w = i14;
        int i19 = i15;
        this.f9466x = i19 == -1 ? 0 : i19;
        this.f9467y = i16 != -1 ? i16 : 0;
        this.f9468z = i17;
        this.f9443A = str5;
        this.f9444B = i18;
        this.f9454l = j6;
        this.f9452j = list == null ? Collections.EMPTY_LIST : list;
        this.f9453k = eVar;
        this.f9449f = aVar;
    }

    private static m a(String str, String str2, String str3, String str4, int i, int i4, int i6, float f2, List<byte[]> list, int i9) {
        return new m(str, str2, str3, str4, i, -1, i4, i6, f2, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i9, null, -1, Long.MAX_VALUE, list, null, null);
    }

    private static m b(String str, String str2, String str3, int i, int i4, int i6, int i9, float f2, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar) {
        return a(str, str2, str3, i, i4, i6, i9, f2, list, -1, -1.0f, null, -1, null, eVar);
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
            if (this.f9447d == mVar.f9447d && this.i == mVar.i && this.f9455m == mVar.f9455m && this.f9456n == mVar.f9456n && this.f9457o == mVar.f9457o && this.f9458p == mVar.f9458p && this.f9459q == mVar.f9459q && this.f9460r == mVar.f9460r && this.f9463u == mVar.f9463u && this.f9464v == mVar.f9464v && this.f9465w == mVar.f9465w && this.f9466x == mVar.f9466x && this.f9467y == mVar.f9467y && this.f9454l == mVar.f9454l && this.f9468z == mVar.f9468z && af.a((Object) this.f9446c, (Object) mVar.f9446c) && af.a((Object) this.f9443A, (Object) mVar.f9443A) && this.f9444B == mVar.f9444B && af.a((Object) this.f9450g, (Object) mVar.f9450g) && af.a((Object) this.f9451h, (Object) mVar.f9451h) && af.a((Object) this.f9448e, (Object) mVar.f9448e) && af.a(this.f9453k, mVar.f9453k) && af.a(this.f9449f, mVar.f9449f) && af.a(this.f9462t, mVar.f9462t) && Arrays.equals(this.f9461s, mVar.f9461s) && b(mVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f9445C == 0) {
            String str = this.f9446c;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f9450g;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f9451h;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f9448e;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f9447d) * 31) + this.f9455m) * 31) + this.f9456n) * 31) + this.f9463u) * 31) + this.f9464v) * 31;
            String str5 = this.f9443A;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f9444B) * 31;
            com.anythink.basead.exoplayer.d.e eVar = this.f9453k;
            int hashCode6 = (hashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            com.anythink.basead.exoplayer.g.a aVar = this.f9449f;
            this.f9445C = hashCode6 + (aVar != null ? aVar.hashCode() : 0);
        }
        return this.f9445C;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f9446c);
        sb.append(", ");
        sb.append(this.f9450g);
        sb.append(", ");
        sb.append(this.f9451h);
        sb.append(", ");
        sb.append(this.f9447d);
        sb.append(", ");
        sb.append(this.f9443A);
        sb.append(", [");
        sb.append(this.f9455m);
        sb.append(", ");
        sb.append(this.f9456n);
        sb.append(", ");
        sb.append(this.f9457o);
        sb.append("], [");
        sb.append(this.f9463u);
        sb.append(", ");
        return AbstractC5128c.e(this.f9464v, "])", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9446c);
        parcel.writeString(this.f9450g);
        parcel.writeString(this.f9451h);
        parcel.writeString(this.f9448e);
        parcel.writeInt(this.f9447d);
        parcel.writeInt(this.i);
        parcel.writeInt(this.f9455m);
        parcel.writeInt(this.f9456n);
        parcel.writeFloat(this.f9457o);
        parcel.writeInt(this.f9458p);
        parcel.writeFloat(this.f9459q);
        af.a(parcel, this.f9461s != null);
        byte[] bArr = this.f9461s;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f9460r);
        parcel.writeParcelable(this.f9462t, i);
        parcel.writeInt(this.f9463u);
        parcel.writeInt(this.f9464v);
        parcel.writeInt(this.f9465w);
        parcel.writeInt(this.f9466x);
        parcel.writeInt(this.f9467y);
        parcel.writeInt(this.f9468z);
        parcel.writeString(this.f9443A);
        parcel.writeInt(this.f9444B);
        parcel.writeLong(this.f9454l);
        int size = this.f9452j.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeByteArray(this.f9452j.get(i4));
        }
        parcel.writeParcelable(this.f9453k, 0);
        parcel.writeParcelable(this.f9449f, 0);
    }

    public static m a(String str, String str2, String str3, int i, int i4, int i6, int i9, float f2, List<byte[]> list, int i10, float f9, byte[] bArr, int i11, com.anythink.basead.exoplayer.l.b bVar, com.anythink.basead.exoplayer.d.e eVar) {
        return new m(str, null, str2, str3, i, i4, i6, i9, f2, i10, f9, bArr, i11, bVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, eVar, null);
    }

    private static m b(String str, String str2, String str3, String str4, int i, int i4, String str5) {
        return new m(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    public static String c(m mVar) {
        if (mVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("id=");
        sb.append(mVar.f9446c);
        sb.append(", mimeType=");
        sb.append(mVar.f9451h);
        if (mVar.f9447d != -1) {
            sb.append(", bitrate=");
            sb.append(mVar.f9447d);
        }
        if (mVar.f9455m != -1 && mVar.f9456n != -1) {
            sb.append(", res=");
            sb.append(mVar.f9455m);
            sb.append("x");
            sb.append(mVar.f9456n);
        }
        if (mVar.f9457o != -1.0f) {
            sb.append(", fps=");
            sb.append(mVar.f9457o);
        }
        if (mVar.f9463u != -1) {
            sb.append(", channels=");
            sb.append(mVar.f9463u);
        }
        if (mVar.f9464v != -1) {
            sb.append(", sample_rate=");
            sb.append(mVar.f9464v);
        }
        if (mVar.f9443A != null) {
            sb.append(", language=");
            sb.append(mVar.f9443A);
        }
        return sb.toString();
    }

    private static m a(String str, String str2, String str3, String str4, int i, int i4, int i6, List<byte[]> list, int i9, String str5) {
        return new m(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i4, i6, -1, -1, -1, i9, str5, -1, Long.MAX_VALUE, list, null, null);
    }

    private m b(int i) {
        return new m(this.f9446c, this.f9450g, this.f9451h, this.f9448e, this.f9447d, this.i, this.f9455m, this.f9456n, this.f9457o, i, this.f9459q, this.f9461s, this.f9460r, this.f9462t, this.f9463u, this.f9464v, this.f9465w, this.f9466x, this.f9467y, this.f9468z, this.f9443A, this.f9444B, this.f9454l, this.f9452j, this.f9453k, this.f9449f);
    }

    public static m a(String str, String str2, String str3, int i, int i4, int i6, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar, String str4) {
        return a(str, str2, str3, i, i4, i6, -1, list, eVar, str4);
    }

    public final boolean b(m mVar) {
        if (this.f9452j.size() != mVar.f9452j.size()) {
            return false;
        }
        for (int i = 0; i < this.f9452j.size(); i++) {
            if (!Arrays.equals(this.f9452j.get(i), mVar.f9452j.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static m a(String str, String str2, String str3, int i, int i4, int i6, int i9, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar, String str4) {
        return a(str, str2, str3, i, i4, i6, i9, list, eVar, str4, null);
    }

    private static m a(String str, String str2, String str3, int i, int i4, int i6, int i9, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar, String str4, com.anythink.basead.exoplayer.g.a aVar) {
        return new m(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i4, i6, i9, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, eVar, aVar);
    }

    private static m a(String str, String str2, int i, String str3, com.anythink.basead.exoplayer.d.e eVar) {
        return a(str, str2, (String) null, -1, i, str3, -1, eVar, Long.MAX_VALUE, (List<byte[]>) Collections.EMPTY_LIST);
    }

    private static m a(String str, String str2, String str3, int i, int i4, String str4, int i6, com.anythink.basead.exoplayer.d.e eVar) {
        return a(str, str2, str3, i, i4, str4, i6, eVar, Long.MAX_VALUE, (List<byte[]>) Collections.EMPTY_LIST);
    }

    private static m a(String str, String str2, String str3, int i, int i4, String str4, com.anythink.basead.exoplayer.d.e eVar, long j6) {
        return a(str, str2, str3, i, i4, str4, -1, eVar, j6, (List<byte[]>) Collections.EMPTY_LIST);
    }

    public static m a(String str, String str2, String str3, int i, int i4, String str4, int i6, com.anythink.basead.exoplayer.d.e eVar, long j6, List<byte[]> list) {
        return new m(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, str4, i6, j6, list, eVar, null);
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
        return new m(this.f9446c, this.f9450g, this.f9451h, this.f9448e, this.f9447d, i, this.f9455m, this.f9456n, this.f9457o, this.f9458p, this.f9459q, this.f9461s, this.f9460r, this.f9462t, this.f9463u, this.f9464v, this.f9465w, this.f9466x, this.f9467y, this.f9468z, this.f9443A, this.f9444B, this.f9454l, this.f9452j, this.f9453k, this.f9449f);
    }

    public final m a(long j6) {
        return new m(this.f9446c, this.f9450g, this.f9451h, this.f9448e, this.f9447d, this.i, this.f9455m, this.f9456n, this.f9457o, this.f9458p, this.f9459q, this.f9461s, this.f9460r, this.f9462t, this.f9463u, this.f9464v, this.f9465w, this.f9466x, this.f9467y, this.f9468z, this.f9443A, this.f9444B, j6, this.f9452j, this.f9453k, this.f9449f);
    }

    private m a(String str, String str2, String str3, int i, int i4, int i6, int i9, String str4) {
        return new m(str, this.f9450g, str2, str3, i, this.i, i4, i6, this.f9457o, this.f9458p, this.f9459q, this.f9461s, this.f9460r, this.f9462t, this.f9463u, this.f9464v, this.f9465w, this.f9466x, this.f9467y, i9, str4, this.f9444B, this.f9454l, this.f9452j, this.f9453k, this.f9449f);
    }

    public final m a(m mVar) {
        if (this == mVar) {
            return this;
        }
        String str = mVar.f9446c;
        String str2 = this.f9448e;
        if (str2 == null) {
            str2 = mVar.f9448e;
        }
        String str3 = str2;
        int i = this.f9447d;
        if (i == -1) {
            i = mVar.f9447d;
        }
        int i4 = i;
        float f2 = this.f9457o;
        if (f2 == -1.0f) {
            f2 = mVar.f9457o;
        }
        float f9 = f2;
        int i6 = this.f9468z | mVar.f9468z;
        String str4 = this.f9443A;
        if (str4 == null) {
            str4 = mVar.f9443A;
        }
        return new m(str, this.f9450g, this.f9451h, str3, i4, this.i, this.f9455m, this.f9456n, f9, this.f9458p, this.f9459q, this.f9461s, this.f9460r, this.f9462t, this.f9463u, this.f9464v, this.f9465w, this.f9466x, this.f9467y, i6, str4, this.f9444B, this.f9454l, this.f9452j, com.anythink.basead.exoplayer.d.e.a(mVar.f9453k, this.f9453k), this.f9449f);
    }

    public m(Parcel parcel) {
        this.f9446c = parcel.readString();
        this.f9450g = parcel.readString();
        this.f9451h = parcel.readString();
        this.f9448e = parcel.readString();
        this.f9447d = parcel.readInt();
        this.i = parcel.readInt();
        this.f9455m = parcel.readInt();
        this.f9456n = parcel.readInt();
        this.f9457o = parcel.readFloat();
        this.f9458p = parcel.readInt();
        this.f9459q = parcel.readFloat();
        this.f9461s = af.a(parcel) ? parcel.createByteArray() : null;
        this.f9460r = parcel.readInt();
        this.f9462t = (com.anythink.basead.exoplayer.l.b) parcel.readParcelable(com.anythink.basead.exoplayer.l.b.class.getClassLoader());
        this.f9463u = parcel.readInt();
        this.f9464v = parcel.readInt();
        this.f9465w = parcel.readInt();
        this.f9466x = parcel.readInt();
        this.f9467y = parcel.readInt();
        this.f9468z = parcel.readInt();
        this.f9443A = parcel.readString();
        this.f9444B = parcel.readInt();
        this.f9454l = parcel.readLong();
        int readInt = parcel.readInt();
        this.f9452j = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f9452j.add(parcel.createByteArray());
        }
        this.f9453k = (com.anythink.basead.exoplayer.d.e) parcel.readParcelable(com.anythink.basead.exoplayer.d.e.class.getClassLoader());
        this.f9449f = (com.anythink.basead.exoplayer.g.a) parcel.readParcelable(com.anythink.basead.exoplayer.g.a.class.getClassLoader());
    }

    public final m a(int i, int i4) {
        return new m(this.f9446c, this.f9450g, this.f9451h, this.f9448e, this.f9447d, this.i, this.f9455m, this.f9456n, this.f9457o, this.f9458p, this.f9459q, this.f9461s, this.f9460r, this.f9462t, this.f9463u, this.f9464v, this.f9465w, i, i4, this.f9468z, this.f9443A, this.f9444B, this.f9454l, this.f9452j, this.f9453k, this.f9449f);
    }

    public final m a(com.anythink.basead.exoplayer.d.e eVar) {
        return new m(this.f9446c, this.f9450g, this.f9451h, this.f9448e, this.f9447d, this.i, this.f9455m, this.f9456n, this.f9457o, this.f9458p, this.f9459q, this.f9461s, this.f9460r, this.f9462t, this.f9463u, this.f9464v, this.f9465w, this.f9466x, this.f9467y, this.f9468z, this.f9443A, this.f9444B, this.f9454l, this.f9452j, eVar, this.f9449f);
    }

    public final m a(com.anythink.basead.exoplayer.g.a aVar) {
        return new m(this.f9446c, this.f9450g, this.f9451h, this.f9448e, this.f9447d, this.i, this.f9455m, this.f9456n, this.f9457o, this.f9458p, this.f9459q, this.f9461s, this.f9460r, this.f9462t, this.f9463u, this.f9464v, this.f9465w, this.f9466x, this.f9467y, this.f9468z, this.f9443A, this.f9444B, this.f9454l, this.f9452j, this.f9453k, aVar);
    }

    public final int a() {
        int i;
        int i4 = this.f9455m;
        if (i4 == -1 || (i = this.f9456n) == -1) {
            return -1;
        }
        return i4 * i;
    }

    private static m a(String str, String str2, String str3, int i, int i4, int i6, int i9, float f2, List<byte[]> list, com.anythink.basead.exoplayer.d.e eVar) {
        return a(str, str2, str3, i, i4, i6, i9, f2, list, -1, -1.0f, null, -1, null, eVar);
    }

    private static m a(String str, String str2, String str3, String str4, int i, int i4, String str5) {
        return new m(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    private static m a(String str, String str2, int i, String str3) {
        return a(str, str2, (String) null, -1, i, str3, -1, (com.anythink.basead.exoplayer.d.e) null, Long.MAX_VALUE, (List<byte[]>) Collections.EMPTY_LIST);
    }
}
