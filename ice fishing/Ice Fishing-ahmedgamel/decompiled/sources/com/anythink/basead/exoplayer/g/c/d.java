package com.anythink.basead.exoplayer.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.ac;
import com.anythink.basead.exoplayer.k.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.anythink.basead.exoplayer.g.c.d.1
        private static d a(Parcel parcel) {
            return new d(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ d createFromParcel(Parcel parcel) {
            return new d(parcel, (byte) 0);
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
    public final long f7349a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7350b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7351c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7352d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7353e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7354f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7355g;

    /* renamed from: h, reason: collision with root package name */
    public final List<a> f7356h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final long f7357j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7358k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7359l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7360m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7361a;

        /* renamed from: b, reason: collision with root package name */
        public final long f7362b;

        /* renamed from: c, reason: collision with root package name */
        public final long f7363c;

        public /* synthetic */ a(int i, long j6, long j9, byte b9) {
            this(i, j6, j9);
        }

        public static a a(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        private void b(Parcel parcel) {
            parcel.writeInt(this.f7361a);
            parcel.writeLong(this.f7362b);
            parcel.writeLong(this.f7363c);
        }

        private a(int i, long j6, long j9) {
            this.f7361a = i;
            this.f7362b = j6;
            this.f7363c = j9;
        }
    }

    public /* synthetic */ d(Parcel parcel, byte b9) {
        this(parcel);
    }

    public static d a(s sVar, long j6, ac acVar) {
        List list;
        long j9;
        boolean z3;
        boolean z6;
        boolean z9;
        boolean z10;
        int i;
        int i6;
        int i9;
        boolean z11;
        int i10;
        long j10;
        long h9 = sVar.h();
        boolean z12 = (sVar.d() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long j11 = com.anythink.basead.exoplayer.b.f6382b;
        if (z12) {
            list = list2;
            j9 = -9223372036854775807L;
            z3 = false;
            z6 = false;
            z9 = false;
            z10 = false;
            i = 0;
            i6 = 0;
            i9 = 0;
        } else {
            int d2 = sVar.d();
            boolean z13 = (d2 & 128) != 0;
            boolean z14 = (d2 & 64) != 0;
            boolean z15 = (d2 & 32) != 0;
            boolean z16 = (d2 & 16) != 0;
            long a9 = (!z14 || z16) ? -9223372036854775807L : g.a(sVar, j6);
            if (!z14) {
                int d9 = sVar.d();
                ArrayList arrayList = new ArrayList(d9);
                int i11 = 0;
                while (i11 < d9) {
                    int d10 = sVar.d();
                    if (z16) {
                        i10 = d9;
                        j10 = -9223372036854775807L;
                    } else {
                        i10 = d9;
                        j10 = g.a(sVar, j6);
                    }
                    arrayList.add(new a(d10, j10, acVar.a(j10), (byte) 0));
                    i11++;
                    d9 = i10;
                }
                list2 = arrayList;
            }
            if (z15) {
                long d11 = sVar.d();
                boolean z17 = (128 & d11) != 0;
                j11 = ((((d11 & 1) << 32) | sVar.h()) * 1000) / 90;
                z11 = z17;
            } else {
                z11 = false;
            }
            int e9 = sVar.e();
            long j12 = a9;
            j9 = j11;
            j11 = j12;
            i6 = sVar.d();
            i9 = sVar.d();
            i = e9;
            z10 = z11;
            z3 = z13;
            z6 = z14;
            list = list2;
            z9 = z16;
        }
        return new d(h9, z12, z3, z6, z9, j11, acVar.a(j11), list, z10, j9, i, i6, i9);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7349a);
        parcel.writeByte(this.f7350b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f7351c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f7352d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f7353e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f7354f);
        parcel.writeLong(this.f7355g);
        int size = this.f7356h.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            a aVar = this.f7356h.get(i6);
            parcel.writeInt(aVar.f7361a);
            parcel.writeLong(aVar.f7362b);
            parcel.writeLong(aVar.f7363c);
        }
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f7357j);
        parcel.writeInt(this.f7358k);
        parcel.writeInt(this.f7359l);
        parcel.writeInt(this.f7360m);
    }

    private d(long j6, boolean z3, boolean z6, boolean z9, boolean z10, long j9, long j10, List<a> list, boolean z11, long j11, int i, int i6, int i9) {
        this.f7349a = j6;
        this.f7350b = z3;
        this.f7351c = z6;
        this.f7352d = z9;
        this.f7353e = z10;
        this.f7354f = j9;
        this.f7355g = j10;
        this.f7356h = Collections.unmodifiableList(list);
        this.i = z11;
        this.f7357j = j11;
        this.f7358k = i;
        this.f7359l = i6;
        this.f7360m = i9;
    }

    private d(Parcel parcel) {
        this.f7349a = parcel.readLong();
        this.f7350b = parcel.readByte() == 1;
        this.f7351c = parcel.readByte() == 1;
        this.f7352d = parcel.readByte() == 1;
        this.f7353e = parcel.readByte() == 1;
        this.f7354f = parcel.readLong();
        this.f7355g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(a.a(parcel));
        }
        this.f7356h = Collections.unmodifiableList(arrayList);
        this.i = parcel.readByte() == 1;
        this.f7357j = parcel.readLong();
        this.f7358k = parcel.readInt();
        this.f7359l = parcel.readInt();
        this.f7360m = parcel.readInt();
    }
}
