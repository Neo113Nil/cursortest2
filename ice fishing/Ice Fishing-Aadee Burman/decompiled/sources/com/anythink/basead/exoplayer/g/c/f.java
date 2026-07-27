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
    public final List<b> f7364a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7365a;

        /* renamed from: b, reason: collision with root package name */
        public final long f7366b;

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
            parcel.writeInt(this.f7365a);
            parcel.writeLong(this.f7366b);
        }

        private a(int i, long j6) {
            this.f7365a = i;
            this.f7366b = j6;
        }

        public static /* synthetic */ void a(a aVar, Parcel parcel) {
            parcel.writeInt(aVar.f7365a);
            parcel.writeLong(aVar.f7366b);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f7367a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7368b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f7369c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f7370d;

        /* renamed from: e, reason: collision with root package name */
        public final long f7371e;

        /* renamed from: f, reason: collision with root package name */
        public final List<a> f7372f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f7373g;

        /* renamed from: h, reason: collision with root package name */
        public final long f7374h;
        public final int i;

        /* renamed from: j, reason: collision with root package name */
        public final int f7375j;

        /* renamed from: k, reason: collision with root package name */
        public final int f7376k;

        private b(long j6, boolean z3, boolean z6, boolean z9, List<a> list, long j9, boolean z10, long j10, int i, int i6, int i9) {
            this.f7367a = j6;
            this.f7368b = z3;
            this.f7369c = z6;
            this.f7370d = z9;
            this.f7372f = Collections.unmodifiableList(list);
            this.f7371e = j9;
            this.f7373g = z10;
            this.f7374h = j10;
            this.i = i;
            this.f7375j = i6;
            this.f7376k = i9;
        }

        public static /* synthetic */ b a(Parcel parcel) {
            return new b(parcel);
        }

        private static b b(s sVar) {
            boolean z3;
            boolean z6;
            int i;
            int i6;
            int i9;
            ArrayList arrayList;
            long j6;
            long j9;
            boolean z9;
            long j10;
            long h9 = sVar.h();
            boolean z10 = true;
            boolean z11 = false;
            boolean z12 = false;
            if ((sVar.d() & 128) != 0) {
                z3 = true;
            } else {
                z3 = true;
                z10 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z10) {
                z6 = false;
                i = 0;
                i6 = 0;
                i9 = 0;
                arrayList = arrayList2;
                j6 = com.anythink.basead.exoplayer.b.f6382b;
                j9 = com.anythink.basead.exoplayer.b.f6382b;
                z9 = false;
            } else {
                int d2 = sVar.d();
                boolean z13 = (d2 & 128) != 0 ? z3 : false;
                boolean z14 = (d2 & 64) != 0 ? z3 : false;
                char c9 = ' ';
                boolean z15 = (d2 & 32) != 0 ? z3 : false;
                long h10 = z14 ? sVar.h() : com.anythink.basead.exoplayer.b.f6382b;
                if (!z14) {
                    int d9 = sVar.d();
                    ArrayList arrayList3 = new ArrayList(d9);
                    int i10 = 0;
                    while (i10 < d9) {
                        arrayList3.add(new a(sVar.d(), sVar.h(), z11 ? (byte) 1 : (byte) 0));
                        i10++;
                        c9 = c9;
                    }
                    arrayList2 = arrayList3;
                }
                char c10 = c9;
                if (z15) {
                    long d10 = sVar.d();
                    boolean z16 = (128 & d10) != 0;
                    j10 = ((((d10 & 1) << c10) | sVar.h()) * 1000) / 90;
                    z12 = z16;
                } else {
                    j10 = com.anythink.basead.exoplayer.b.f6382b;
                }
                int e9 = sVar.e();
                int d11 = sVar.d();
                boolean z17 = z13;
                z6 = z12;
                z11 = z17;
                i9 = sVar.d();
                long j11 = h10;
                i = e9;
                i6 = d11;
                long j12 = j10;
                arrayList = arrayList2;
                z9 = z14;
                j6 = j11;
                j9 = j12;
            }
            return new b(h9, z10, z11, z9, arrayList, j6, z6, j9, i, i6, i9);
        }

        private static b c(Parcel parcel) {
            return new b(parcel);
        }

        public static /* synthetic */ b a(s sVar) {
            boolean z3;
            boolean z6;
            int i;
            int i6;
            int i9;
            ArrayList arrayList;
            long j6;
            long j9;
            boolean z9;
            long j10;
            long h9 = sVar.h();
            boolean z10 = true;
            boolean z11 = false;
            boolean z12 = false;
            if ((sVar.d() & 128) != 0) {
                z3 = true;
            } else {
                z3 = true;
                z10 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z10) {
                z6 = false;
                i = 0;
                i6 = 0;
                i9 = 0;
                arrayList = arrayList2;
                j6 = com.anythink.basead.exoplayer.b.f6382b;
                j9 = com.anythink.basead.exoplayer.b.f6382b;
                z9 = false;
            } else {
                int d2 = sVar.d();
                boolean z13 = (d2 & 128) != 0 ? z3 : false;
                boolean z14 = (d2 & 64) != 0 ? z3 : false;
                char c9 = ' ';
                boolean z15 = (d2 & 32) != 0 ? z3 : false;
                long h10 = z14 ? sVar.h() : com.anythink.basead.exoplayer.b.f6382b;
                if (!z14) {
                    int d9 = sVar.d();
                    ArrayList arrayList3 = new ArrayList(d9);
                    int i10 = 0;
                    while (i10 < d9) {
                        arrayList3.add(new a(sVar.d(), sVar.h(), z11 ? (byte) 1 : (byte) 0));
                        i10++;
                        c9 = c9;
                    }
                    arrayList2 = arrayList3;
                }
                char c10 = c9;
                if (z15) {
                    long d10 = sVar.d();
                    boolean z16 = (128 & d10) != 0;
                    j10 = ((((d10 & 1) << c10) | sVar.h()) * 1000) / 90;
                    z12 = z16;
                } else {
                    j10 = com.anythink.basead.exoplayer.b.f6382b;
                }
                int e9 = sVar.e();
                int d11 = sVar.d();
                boolean z17 = z13;
                z6 = z12;
                z11 = z17;
                i9 = sVar.d();
                long j11 = h10;
                i = e9;
                i6 = d11;
                long j12 = j10;
                arrayList = arrayList2;
                z9 = z14;
                j6 = j11;
                j9 = j12;
            }
            return new b(h9, z10, z11, z9, arrayList, j6, z6, j9, i, i6, i9);
        }

        private b(Parcel parcel) {
            this.f7367a = parcel.readLong();
            this.f7368b = parcel.readByte() == 1;
            this.f7369c = parcel.readByte() == 1;
            this.f7370d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(a.a(parcel));
            }
            this.f7372f = Collections.unmodifiableList(arrayList);
            this.f7371e = parcel.readLong();
            this.f7373g = parcel.readByte() == 1;
            this.f7374h = parcel.readLong();
            this.i = parcel.readInt();
            this.f7375j = parcel.readInt();
            this.f7376k = parcel.readInt();
        }

        private void b(Parcel parcel) {
            parcel.writeLong(this.f7367a);
            parcel.writeByte(this.f7368b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f7369c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f7370d ? (byte) 1 : (byte) 0);
            int size = this.f7372f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                a.a(this.f7372f.get(i), parcel);
            }
            parcel.writeLong(this.f7371e);
            parcel.writeByte(this.f7373g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f7374h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.f7375j);
            parcel.writeInt(this.f7376k);
        }

        private static /* synthetic */ void a(b bVar, Parcel parcel) {
            parcel.writeLong(bVar.f7367a);
            parcel.writeByte(bVar.f7368b ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f7369c ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f7370d ? (byte) 1 : (byte) 0);
            int size = bVar.f7372f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                a.a(bVar.f7372f.get(i), parcel);
            }
            parcel.writeLong(bVar.f7371e);
            parcel.writeByte(bVar.f7373g ? (byte) 1 : (byte) 0);
            parcel.writeLong(bVar.f7374h);
            parcel.writeInt(bVar.i);
            parcel.writeInt(bVar.f7375j);
            parcel.writeInt(bVar.f7376k);
        }
    }

    public /* synthetic */ f(Parcel parcel, byte b9) {
        this(parcel);
    }

    public static f a(s sVar) {
        int d2 = sVar.d();
        ArrayList arrayList = new ArrayList(d2);
        for (int i = 0; i < d2; i++) {
            arrayList.add(b.a(sVar));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.f7364a.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            b bVar = this.f7364a.get(i6);
            parcel.writeLong(bVar.f7367a);
            parcel.writeByte(bVar.f7368b ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f7369c ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f7370d ? (byte) 1 : (byte) 0);
            int size2 = bVar.f7372f.size();
            parcel.writeInt(size2);
            for (int i9 = 0; i9 < size2; i9++) {
                a.a(bVar.f7372f.get(i9), parcel);
            }
            parcel.writeLong(bVar.f7371e);
            parcel.writeByte(bVar.f7373g ? (byte) 1 : (byte) 0);
            parcel.writeLong(bVar.f7374h);
            parcel.writeInt(bVar.i);
            parcel.writeInt(bVar.f7375j);
            parcel.writeInt(bVar.f7376k);
        }
    }

    private f(List<b> list) {
        this.f7364a = Collections.unmodifiableList(list);
    }

    private f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(b.a(parcel));
        }
        this.f7364a = Collections.unmodifiableList(arrayList);
    }
}
