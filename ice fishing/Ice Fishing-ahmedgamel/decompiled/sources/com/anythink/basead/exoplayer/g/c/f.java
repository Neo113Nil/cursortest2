package com.anythink.basead.exoplayer.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends com.anythink.basead.exoplayer.g.c.b {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: com.anythink.basead.exoplayer.g.c.f.1
        private static f a(Parcel parcel) {
            return new f(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ f createFromParcel(Parcel parcel) {
            return new f(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ f[] newArray(int i) {
            return new f[i];
        }

        private static f[] a(int i) {
            return new f[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final List<b> f8150a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8151a;

        /* renamed from: b, reason: collision with root package name */
        public final long f8152b;

        public /* synthetic */ a(int i, long j6, byte b9) {
            this(i, j6);
        }

        public static /* synthetic */ a a(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong());
        }

        private static a b(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong());
        }

        private void c(Parcel parcel) {
            parcel.writeInt(this.f8151a);
            parcel.writeLong(this.f8152b);
        }

        private a(int i, long j6) {
            this.f8151a = i;
            this.f8152b = j6;
        }

        public static /* synthetic */ void a(a aVar, Parcel parcel) {
            parcel.writeInt(aVar.f8151a);
            parcel.writeLong(aVar.f8152b);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f8153a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f8154b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f8155c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f8156d;

        /* renamed from: e, reason: collision with root package name */
        public final long f8157e;

        /* renamed from: f, reason: collision with root package name */
        public final List<a> f8158f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f8159g;

        /* renamed from: h, reason: collision with root package name */
        public final long f8160h;
        public final int i;

        /* renamed from: j, reason: collision with root package name */
        public final int f8161j;

        /* renamed from: k, reason: collision with root package name */
        public final int f8162k;

        private b(long j6, boolean z6, boolean z9, boolean z10, List<a> list, long j9, boolean z11, long j10, int i, int i4, int i6) {
            this.f8153a = j6;
            this.f8154b = z6;
            this.f8155c = z9;
            this.f8156d = z10;
            this.f8158f = Collections.unmodifiableList(list);
            this.f8157e = j9;
            this.f8159g = z11;
            this.f8160h = j10;
            this.i = i;
            this.f8161j = i4;
            this.f8162k = i6;
        }

        public static /* synthetic */ b a(Parcel parcel) {
            return new b(parcel);
        }

        private static b b(s sVar) {
            boolean z6;
            boolean z9;
            int i;
            int i4;
            int i6;
            ArrayList arrayList;
            long j6;
            long j9;
            boolean z10;
            long j10;
            long h3 = sVar.h();
            boolean z11 = true;
            boolean z12 = false;
            boolean z13 = false;
            if ((sVar.d() & 128) != 0) {
                z6 = true;
            } else {
                z6 = true;
                z11 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z11) {
                z9 = false;
                i = 0;
                i4 = 0;
                i6 = 0;
                arrayList = arrayList2;
                j6 = com.anythink.basead.exoplayer.b.f7168b;
                j9 = com.anythink.basead.exoplayer.b.f7168b;
                z10 = false;
            } else {
                int d9 = sVar.d();
                boolean z14 = (d9 & 128) != 0 ? z6 : false;
                boolean z15 = (d9 & 64) != 0 ? z6 : false;
                char c9 = ' ';
                boolean z16 = (d9 & 32) != 0 ? z6 : false;
                long h9 = z15 ? sVar.h() : com.anythink.basead.exoplayer.b.f7168b;
                if (!z15) {
                    int d10 = sVar.d();
                    ArrayList arrayList3 = new ArrayList(d10);
                    int i9 = 0;
                    while (i9 < d10) {
                        arrayList3.add(new a(sVar.d(), sVar.h(), z12 ? (byte) 1 : (byte) 0));
                        i9++;
                        c9 = c9;
                    }
                    arrayList2 = arrayList3;
                }
                char c10 = c9;
                if (z16) {
                    long d11 = sVar.d();
                    boolean z17 = (128 & d11) != 0;
                    j10 = ((((d11 & 1) << c10) | sVar.h()) * 1000) / 90;
                    z13 = z17;
                } else {
                    j10 = com.anythink.basead.exoplayer.b.f7168b;
                }
                int e9 = sVar.e();
                int d12 = sVar.d();
                boolean z18 = z14;
                z9 = z13;
                z12 = z18;
                i6 = sVar.d();
                long j11 = h9;
                i = e9;
                i4 = d12;
                long j12 = j10;
                arrayList = arrayList2;
                z10 = z15;
                j6 = j11;
                j9 = j12;
            }
            return new b(h3, z11, z12, z10, arrayList, j6, z9, j9, i, i4, i6);
        }

        private static b c(Parcel parcel) {
            return new b(parcel);
        }

        public static /* synthetic */ b a(s sVar) {
            boolean z6;
            boolean z9;
            int i;
            int i4;
            int i6;
            ArrayList arrayList;
            long j6;
            long j9;
            boolean z10;
            long j10;
            long h3 = sVar.h();
            boolean z11 = true;
            boolean z12 = false;
            boolean z13 = false;
            if ((sVar.d() & 128) != 0) {
                z6 = true;
            } else {
                z6 = true;
                z11 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z11) {
                z9 = false;
                i = 0;
                i4 = 0;
                i6 = 0;
                arrayList = arrayList2;
                j6 = com.anythink.basead.exoplayer.b.f7168b;
                j9 = com.anythink.basead.exoplayer.b.f7168b;
                z10 = false;
            } else {
                int d9 = sVar.d();
                boolean z14 = (d9 & 128) != 0 ? z6 : false;
                boolean z15 = (d9 & 64) != 0 ? z6 : false;
                char c9 = ' ';
                boolean z16 = (d9 & 32) != 0 ? z6 : false;
                long h9 = z15 ? sVar.h() : com.anythink.basead.exoplayer.b.f7168b;
                if (!z15) {
                    int d10 = sVar.d();
                    ArrayList arrayList3 = new ArrayList(d10);
                    int i9 = 0;
                    while (i9 < d10) {
                        arrayList3.add(new a(sVar.d(), sVar.h(), z12 ? (byte) 1 : (byte) 0));
                        i9++;
                        c9 = c9;
                    }
                    arrayList2 = arrayList3;
                }
                char c10 = c9;
                if (z16) {
                    long d11 = sVar.d();
                    boolean z17 = (128 & d11) != 0;
                    j10 = ((((d11 & 1) << c10) | sVar.h()) * 1000) / 90;
                    z13 = z17;
                } else {
                    j10 = com.anythink.basead.exoplayer.b.f7168b;
                }
                int e9 = sVar.e();
                int d12 = sVar.d();
                boolean z18 = z14;
                z9 = z13;
                z12 = z18;
                i6 = sVar.d();
                long j11 = h9;
                i = e9;
                i4 = d12;
                long j12 = j10;
                arrayList = arrayList2;
                z10 = z15;
                j6 = j11;
                j9 = j12;
            }
            return new b(h3, z11, z12, z10, arrayList, j6, z9, j9, i, i4, i6);
        }

        private b(Parcel parcel) {
            this.f8153a = parcel.readLong();
            this.f8154b = parcel.readByte() == 1;
            this.f8155c = parcel.readByte() == 1;
            this.f8156d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(a.a(parcel));
            }
            this.f8158f = Collections.unmodifiableList(arrayList);
            this.f8157e = parcel.readLong();
            this.f8159g = parcel.readByte() == 1;
            this.f8160h = parcel.readLong();
            this.i = parcel.readInt();
            this.f8161j = parcel.readInt();
            this.f8162k = parcel.readInt();
        }

        private void b(Parcel parcel) {
            parcel.writeLong(this.f8153a);
            parcel.writeByte(this.f8154b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f8155c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f8156d ? (byte) 1 : (byte) 0);
            int size = this.f8158f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                a.a(this.f8158f.get(i), parcel);
            }
            parcel.writeLong(this.f8157e);
            parcel.writeByte(this.f8159g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f8160h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.f8161j);
            parcel.writeInt(this.f8162k);
        }

        private static /* synthetic */ void a(b bVar, Parcel parcel) {
            parcel.writeLong(bVar.f8153a);
            parcel.writeByte(bVar.f8154b ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f8155c ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f8156d ? (byte) 1 : (byte) 0);
            int size = bVar.f8158f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                a.a(bVar.f8158f.get(i), parcel);
            }
            parcel.writeLong(bVar.f8157e);
            parcel.writeByte(bVar.f8159g ? (byte) 1 : (byte) 0);
            parcel.writeLong(bVar.f8160h);
            parcel.writeInt(bVar.i);
            parcel.writeInt(bVar.f8161j);
            parcel.writeInt(bVar.f8162k);
        }
    }

    public /* synthetic */ f(Parcel parcel, byte b9) {
        this(parcel);
    }

    public static f a(s sVar) {
        int d9 = sVar.d();
        ArrayList arrayList = new ArrayList(d9);
        for (int i = 0; i < d9; i++) {
            arrayList.add(b.a(sVar));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.f8150a.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = this.f8150a.get(i4);
            parcel.writeLong(bVar.f8153a);
            parcel.writeByte(bVar.f8154b ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f8155c ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f8156d ? (byte) 1 : (byte) 0);
            int size2 = bVar.f8158f.size();
            parcel.writeInt(size2);
            for (int i6 = 0; i6 < size2; i6++) {
                a.a(bVar.f8158f.get(i6), parcel);
            }
            parcel.writeLong(bVar.f8157e);
            parcel.writeByte(bVar.f8159g ? (byte) 1 : (byte) 0);
            parcel.writeLong(bVar.f8160h);
            parcel.writeInt(bVar.i);
            parcel.writeInt(bVar.f8161j);
            parcel.writeInt(bVar.f8162k);
        }
    }

    private f(List<b> list) {
        this.f8150a = Collections.unmodifiableList(list);
    }

    private f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(b.a(parcel));
        }
        this.f8150a = Collections.unmodifiableList(arrayList);
    }
}
