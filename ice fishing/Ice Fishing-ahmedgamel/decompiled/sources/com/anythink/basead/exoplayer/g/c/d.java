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
    public final long f8135a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8136b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8137c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8138d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8139e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8140f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8141g;

    /* renamed from: h, reason: collision with root package name */
    public final List<a> f8142h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final long f8143j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8144k;

    /* renamed from: l, reason: collision with root package name */
    public final int f8145l;

    /* renamed from: m, reason: collision with root package name */
    public final int f8146m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8147a;

        /* renamed from: b, reason: collision with root package name */
        public final long f8148b;

        /* renamed from: c, reason: collision with root package name */
        public final long f8149c;

        public /* synthetic */ a(int i, long j6, long j9, byte b9) {
            this(i, j6, j9);
        }

        public static a a(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        private void b(Parcel parcel) {
            parcel.writeInt(this.f8147a);
            parcel.writeLong(this.f8148b);
            parcel.writeLong(this.f8149c);
        }

        private a(int i, long j6, long j9) {
            this.f8147a = i;
            this.f8148b = j6;
            this.f8149c = j9;
        }
    }

    public /* synthetic */ d(Parcel parcel, byte b9) {
        this(parcel);
    }

    public static d a(s sVar, long j6, ac acVar) {
        List list;
        long j9;
        boolean z6;
        boolean z9;
        boolean z10;
        boolean z11;
        int i;
        int i4;
        int i6;
        boolean z12;
        int i9;
        long j10;
        long h3 = sVar.h();
        boolean z13 = (sVar.d() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long j11 = com.anythink.basead.exoplayer.b.f7168b;
        if (z13) {
            list = list2;
            j9 = -9223372036854775807L;
            z6 = false;
            z9 = false;
            z10 = false;
            z11 = false;
            i = 0;
            i4 = 0;
            i6 = 0;
        } else {
            int d9 = sVar.d();
            boolean z14 = (d9 & 128) != 0;
            boolean z15 = (d9 & 64) != 0;
            boolean z16 = (d9 & 32) != 0;
            boolean z17 = (d9 & 16) != 0;
            long a9 = (!z15 || z17) ? -9223372036854775807L : g.a(sVar, j6);
            if (!z15) {
                int d10 = sVar.d();
                ArrayList arrayList = new ArrayList(d10);
                int i10 = 0;
                while (i10 < d10) {
                    int d11 = sVar.d();
                    if (z17) {
                        i9 = d10;
                        j10 = -9223372036854775807L;
                    } else {
                        i9 = d10;
                        j10 = g.a(sVar, j6);
                    }
                    arrayList.add(new a(d11, j10, acVar.a(j10), (byte) 0));
                    i10++;
                    d10 = i9;
                }
                list2 = arrayList;
            }
            if (z16) {
                long d12 = sVar.d();
                boolean z18 = (128 & d12) != 0;
                j11 = ((((d12 & 1) << 32) | sVar.h()) * 1000) / 90;
                z12 = z18;
            } else {
                z12 = false;
            }
            int e9 = sVar.e();
            long j12 = a9;
            j9 = j11;
            j11 = j12;
            i4 = sVar.d();
            i6 = sVar.d();
            i = e9;
            z11 = z12;
            z6 = z14;
            z9 = z15;
            list = list2;
            z10 = z17;
        }
        return new d(h3, z13, z6, z9, z10, j11, acVar.a(j11), list, z11, j9, i, i4, i6);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8135a);
        parcel.writeByte(this.f8136b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8137c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8138d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f8139e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f8140f);
        parcel.writeLong(this.f8141g);
        int size = this.f8142h.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = this.f8142h.get(i4);
            parcel.writeInt(aVar.f8147a);
            parcel.writeLong(aVar.f8148b);
            parcel.writeLong(aVar.f8149c);
        }
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f8143j);
        parcel.writeInt(this.f8144k);
        parcel.writeInt(this.f8145l);
        parcel.writeInt(this.f8146m);
    }

    private d(long j6, boolean z6, boolean z9, boolean z10, boolean z11, long j9, long j10, List<a> list, boolean z12, long j11, int i, int i4, int i6) {
        this.f8135a = j6;
        this.f8136b = z6;
        this.f8137c = z9;
        this.f8138d = z10;
        this.f8139e = z11;
        this.f8140f = j9;
        this.f8141g = j10;
        this.f8142h = Collections.unmodifiableList(list);
        this.i = z12;
        this.f8143j = j11;
        this.f8144k = i;
        this.f8145l = i4;
        this.f8146m = i6;
    }

    private d(Parcel parcel) {
        this.f8135a = parcel.readLong();
        this.f8136b = parcel.readByte() == 1;
        this.f8137c = parcel.readByte() == 1;
        this.f8138d = parcel.readByte() == 1;
        this.f8139e = parcel.readByte() == 1;
        this.f8140f = parcel.readLong();
        this.f8141g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(a.a(parcel));
        }
        this.f8142h = Collections.unmodifiableList(arrayList);
        this.i = parcel.readByte() == 1;
        this.f8143j = parcel.readLong();
        this.f8144k = parcel.readInt();
        this.f8145l = parcel.readInt();
        this.f8146m = parcel.readInt();
    }
}
