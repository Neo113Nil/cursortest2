package com.anythink.basead.exoplayer.i;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.anythink.basead.exoplayer.aa;
import com.anythink.basead.exoplayer.h.ae;
import com.anythink.basead.exoplayer.h.af;
import com.anythink.basead.exoplayer.i.a;
import com.anythink.basead.exoplayer.i.e;
import com.anythink.basead.exoplayer.i.f;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c extends com.anythink.basead.exoplayer.i.e {

    /* renamed from: a, reason: collision with root package name */
    private static final float f8066a = 0.98f;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f8067b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    private static final int f8068c = 1000;

    /* renamed from: d, reason: collision with root package name */
    private final f.a f8069d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference<C0031c> f8070e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8071a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8072b;

        /* renamed from: c, reason: collision with root package name */
        public final String f8073c;

        public a(int i, int i4, String str) {
            this.f8071a = i;
            this.f8072b = i4;
            this.f8073c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f8071a == aVar.f8071a && this.f8072b == aVar.f8072b && TextUtils.equals(this.f8073c, aVar.f8073c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = ((this.f8071a * 31) + this.f8072b) * 31;
            String str = this.f8073c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        private final C0031c f8074a;

        /* renamed from: b, reason: collision with root package name */
        private final int f8075b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8076c;

        /* renamed from: d, reason: collision with root package name */
        private final int f8077d;

        /* renamed from: e, reason: collision with root package name */
        private final int f8078e;

        /* renamed from: f, reason: collision with root package name */
        private final int f8079f;

        /* renamed from: g, reason: collision with root package name */
        private final int f8080g;

        public b(m mVar, C0031c c0031c, int i) {
            this.f8074a = c0031c;
            this.f8075b = c.a(i, false) ? 1 : 0;
            this.f8076c = c.a(mVar, c0031c.f8082b) ? 1 : 0;
            this.f8077d = (mVar.f8839z & 1) != 0 ? 1 : 0;
            this.f8078e = mVar.f8834u;
            this.f8079f = mVar.f8835v;
            this.f8080g = mVar.f8818d;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b bVar) {
            int i = this.f8075b;
            int i4 = bVar.f8075b;
            if (i != i4) {
                return c.a(i, i4);
            }
            int i9 = this.f8076c;
            int i10 = bVar.f8076c;
            if (i9 != i10) {
                return c.a(i9, i10);
            }
            int i11 = this.f8077d;
            int i12 = bVar.f8077d;
            if (i11 != i12) {
                return c.a(i11, i12);
            }
            if (this.f8074a.f8092m) {
                return c.a(bVar.f8080g, this.f8080g);
            }
            int i13 = i != 1 ? -1 : 1;
            int i14 = this.f8078e;
            int i15 = bVar.f8078e;
            if (i14 != i15) {
                return c.a(i14, i15) * i13;
            }
            int i16 = this.f8079f;
            int i17 = bVar.f8079f;
            return i16 != i17 ? c.a(i16, i17) * i13 : c.a(this.f8080g, bVar.f8080g) * i13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f8075b == bVar.f8075b && this.f8076c == bVar.f8076c && this.f8077d == bVar.f8077d && this.f8078e == bVar.f8078e && this.f8079f == bVar.f8079f && this.f8080g == bVar.f8080g) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (((((((((this.f8075b * 31) + this.f8076c) * 31) + this.f8077d) * 31) + this.f8078e) * 31) + this.f8079f) * 31) + this.f8080g;
        }
    }

    /* renamed from: com.anythink.basead.exoplayer.i.c$c, reason: collision with other inner class name */
    public static final class C0031c implements Parcelable {

        /* renamed from: b, reason: collision with root package name */
        public final String f8082b;

        /* renamed from: c, reason: collision with root package name */
        public final String f8083c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f8084d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8085e;

        /* renamed from: f, reason: collision with root package name */
        public final int f8086f;

        /* renamed from: g, reason: collision with root package name */
        public final int f8087g;

        /* renamed from: h, reason: collision with root package name */
        public final int f8088h;
        public final boolean i;

        /* renamed from: j, reason: collision with root package name */
        public final int f8089j;

        /* renamed from: k, reason: collision with root package name */
        public final int f8090k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f8091l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f8092m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f8093n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f8094o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f8095p;

        /* renamed from: q, reason: collision with root package name */
        public final int f8096q;

        /* renamed from: r, reason: collision with root package name */
        private final SparseArray<Map<af, e>> f8097r;

        /* renamed from: s, reason: collision with root package name */
        private final SparseBooleanArray f8098s;

        /* renamed from: a, reason: collision with root package name */
        public static final C0031c f8081a = new C0031c();
        public static final Parcelable.Creator<C0031c> CREATOR = new Parcelable.Creator<C0031c>() { // from class: com.anythink.basead.exoplayer.i.c.c.1
            private static C0031c a(Parcel parcel) {
                return new C0031c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ C0031c createFromParcel(Parcel parcel) {
                return new C0031c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ C0031c[] newArray(int i) {
                return new C0031c[i];
            }

            private static C0031c[] a(int i) {
                return new C0031c[i];
            }
        };

        private C0031c() {
            this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && C0031c.class == obj.getClass()) {
                C0031c c0031c = (C0031c) obj;
                if (this.f8084d == c0031c.f8084d && this.f8085e == c0031c.f8085e && this.f8092m == c0031c.f8092m && this.f8093n == c0031c.f8093n && this.f8094o == c0031c.f8094o && this.f8086f == c0031c.f8086f && this.f8087g == c0031c.f8087g && this.i == c0031c.i && this.f8095p == c0031c.f8095p && this.f8091l == c0031c.f8091l && this.f8089j == c0031c.f8089j && this.f8090k == c0031c.f8090k && this.f8088h == c0031c.f8088h && this.f8096q == c0031c.f8096q && TextUtils.equals(this.f8082b, c0031c.f8082b) && TextUtils.equals(this.f8083c, c0031c.f8083c)) {
                    SparseBooleanArray sparseBooleanArray = this.f8098s;
                    SparseBooleanArray sparseBooleanArray2 = c0031c.f8098s;
                    int size = sparseBooleanArray.size();
                    if (sparseBooleanArray2.size() == size) {
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                SparseArray<Map<af, e>> sparseArray = this.f8097r;
                                SparseArray<Map<af, e>> sparseArray2 = c0031c.f8097r;
                                int size2 = sparseArray.size();
                                if (sparseArray2.size() == size2) {
                                    for (int i4 = 0; i4 < size2; i4++) {
                                        int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i4));
                                        if (indexOfKey >= 0) {
                                            Map<af, e> valueAt = sparseArray.valueAt(i4);
                                            Map<af, e> valueAt2 = sparseArray2.valueAt(indexOfKey);
                                            if (valueAt2.size() == valueAt.size()) {
                                                for (Map.Entry<af, e> entry : valueAt.entrySet()) {
                                                    af key = entry.getKey();
                                                    if (valueAt2.containsKey(key) && com.anythink.basead.exoplayer.k.af.a(entry.getValue(), valueAt2.get(key))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            } else {
                                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = (((((((((((((((((((((((((((this.f8084d ? 1 : 0) * 31) + this.f8085e) * 31) + (this.f8092m ? 1 : 0)) * 31) + (this.f8093n ? 1 : 0)) * 31) + (this.f8094o ? 1 : 0)) * 31) + this.f8086f) * 31) + this.f8087g) * 31) + (this.i ? 1 : 0)) * 31) + (this.f8095p ? 1 : 0)) * 31) + (this.f8091l ? 1 : 0)) * 31) + this.f8089j) * 31) + this.f8090k) * 31) + this.f8088h) * 31) + this.f8096q) * 31;
            String str = this.f8082b;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f8083c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            SparseArray<Map<af, e>> sparseArray = this.f8097r;
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                Map<af, e> valueAt = sparseArray.valueAt(i4);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<af, e> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
            parcel.writeSparseBooleanArray(this.f8098s);
            parcel.writeString(this.f8082b);
            parcel.writeString(this.f8083c);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f8084d);
            parcel.writeInt(this.f8085e);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f8092m);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f8093n);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f8094o);
            parcel.writeInt(this.f8086f);
            parcel.writeInt(this.f8087g);
            parcel.writeInt(this.f8088h);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.i);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f8095p);
            parcel.writeInt(this.f8089j);
            parcel.writeInt(this.f8090k);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f8091l);
            parcel.writeInt(this.f8096q);
        }

        public C0031c(SparseArray<Map<af, e>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z8, int i, boolean z9, boolean z10, boolean z11, int i4, int i9, int i10, boolean z12, boolean z13, int i11, int i12, boolean z14, int i13) {
            this.f8097r = sparseArray;
            this.f8098s = sparseBooleanArray;
            this.f8082b = com.anythink.basead.exoplayer.k.af.b(str);
            this.f8083c = com.anythink.basead.exoplayer.k.af.b(str2);
            this.f8084d = z8;
            this.f8085e = i;
            this.f8092m = z9;
            this.f8093n = z10;
            this.f8094o = z11;
            this.f8086f = i4;
            this.f8087g = i9;
            this.f8088h = i10;
            this.i = z12;
            this.f8095p = z13;
            this.f8089j = i11;
            this.f8090k = i12;
            this.f8091l = z14;
            this.f8096q = i13;
        }

        public final boolean a(int i) {
            return this.f8098s.get(i);
        }

        public final e b(int i, af afVar) {
            Map<af, e> map = this.f8097r.get(i);
            if (map != null) {
                return map.get(afVar);
            }
            return null;
        }

        public final boolean a(int i, af afVar) {
            Map<af, e> map = this.f8097r.get(i);
            return map != null && map.containsKey(afVar);
        }

        private d a() {
            return new d(this, (byte) 0);
        }

        private static SparseArray<Map<af, e>> a(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<af, e>> sparseArray = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i4 = 0; i4 < readInt3; i4++) {
                    hashMap.put((af) parcel.readParcelable(af.class.getClassLoader()), (e) parcel.readParcelable(e.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        private static void a(Parcel parcel, SparseArray<Map<af, e>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                Map<af, e> valueAt = sparseArray.valueAt(i);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<af, e> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        public C0031c(Parcel parcel) {
            this.f8097r = a(parcel);
            this.f8098s = parcel.readSparseBooleanArray();
            this.f8082b = parcel.readString();
            this.f8083c = parcel.readString();
            this.f8084d = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f8085e = parcel.readInt();
            this.f8092m = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f8093n = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f8094o = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f8086f = parcel.readInt();
            this.f8087g = parcel.readInt();
            this.f8088h = parcel.readInt();
            this.i = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f8095p = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f8089j = parcel.readInt();
            this.f8090k = parcel.readInt();
            this.f8091l = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f8096q = parcel.readInt();
        }

        private static boolean a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean a(SparseArray<Map<af, e>> sparseArray, SparseArray<Map<af, e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey >= 0) {
                    Map<af, e> valueAt = sparseArray.valueAt(i);
                    Map<af, e> valueAt2 = sparseArray2.valueAt(indexOfKey);
                    if (valueAt2.size() == valueAt.size()) {
                        for (Map.Entry<af, e> entry : valueAt.entrySet()) {
                            af key = entry.getKey();
                            if (valueAt2.containsKey(key) && com.anythink.basead.exoplayer.k.af.a(entry.getValue(), valueAt2.get(key))) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        private static boolean a(Map<af, e> map, Map<af, e> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<af, e> entry : map.entrySet()) {
                af key = entry.getKey();
                if (!map2.containsKey(key) || !com.anythink.basead.exoplayer.k.af.a(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray<Map<af, e>> f8099a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseBooleanArray f8100b;

        /* renamed from: c, reason: collision with root package name */
        private String f8101c;

        /* renamed from: d, reason: collision with root package name */
        private String f8102d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f8103e;

        /* renamed from: f, reason: collision with root package name */
        private int f8104f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f8105g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f8106h;
        private boolean i;

        /* renamed from: j, reason: collision with root package name */
        private int f8107j;

        /* renamed from: k, reason: collision with root package name */
        private int f8108k;

        /* renamed from: l, reason: collision with root package name */
        private int f8109l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f8110m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f8111n;

        /* renamed from: o, reason: collision with root package name */
        private int f8112o;

        /* renamed from: p, reason: collision with root package name */
        private int f8113p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f8114q;

        /* renamed from: r, reason: collision with root package name */
        private int f8115r;

        public /* synthetic */ d(C0031c c0031c, byte b9) {
            this(c0031c);
        }

        private d a(String str) {
            this.f8101c = str;
            return this;
        }

        private d b(String str) {
            this.f8102d = str;
            return this;
        }

        private d c(int i) {
            this.f8104f = i;
            return this;
        }

        private d d(boolean z8) {
            this.i = z8;
            return this;
        }

        private d e(boolean z8) {
            this.f8110m = z8;
            return this;
        }

        private d f(boolean z8) {
            this.f8111n = z8;
            return this;
        }

        public d() {
            this(C0031c.f8081a);
        }

        private d a(boolean z8) {
            this.f8103e = z8;
            return this;
        }

        private d b(boolean z8) {
            this.f8105g = z8;
            return this;
        }

        private d c(boolean z8) {
            this.f8106h = z8;
            return this;
        }

        private d d() {
            return a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        private d e() {
            return a(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        private d(C0031c c0031c) {
            this.f8099a = a((SparseArray<Map<af, e>>) c0031c.f8097r);
            this.f8100b = c0031c.f8098s.clone();
            this.f8101c = c0031c.f8082b;
            this.f8102d = c0031c.f8083c;
            this.f8103e = c0031c.f8084d;
            this.f8104f = c0031c.f8085e;
            this.f8105g = c0031c.f8092m;
            this.f8106h = c0031c.f8093n;
            this.i = c0031c.f8094o;
            this.f8107j = c0031c.f8086f;
            this.f8108k = c0031c.f8087g;
            this.f8109l = c0031c.f8088h;
            this.f8110m = c0031c.i;
            this.f8111n = c0031c.f8095p;
            this.f8112o = c0031c.f8089j;
            this.f8113p = c0031c.f8090k;
            this.f8114q = c0031c.f8091l;
            this.f8115r = c0031c.f8096q;
        }

        private d a(int i, int i4) {
            this.f8107j = i;
            this.f8108k = i4;
            return this;
        }

        private d c() {
            return a(1279, 719);
        }

        private d d(int i) {
            this.f8109l = i;
            return this;
        }

        public final d b(int i) {
            if (this.f8115r != i) {
                this.f8115r = i;
            }
            return this;
        }

        private d a(Context context, boolean z8) {
            Point a9 = com.anythink.basead.exoplayer.k.af.a(context);
            return a(a9.x, a9.y, z8);
        }

        public final C0031c b() {
            return new C0031c(this.f8099a, this.f8100b, this.f8101c, this.f8102d, this.f8103e, this.f8104f, this.f8105g, this.f8106h, this.i, this.f8107j, this.f8108k, this.f8109l, this.f8110m, this.f8111n, this.f8112o, this.f8113p, this.f8114q, this.f8115r);
        }

        private d a(int i, int i4, boolean z8) {
            this.f8112o = i;
            this.f8113p = i4;
            this.f8114q = z8;
            return this;
        }

        public final d a(int i, boolean z8) {
            if (this.f8100b.get(i) == z8) {
                return this;
            }
            if (z8) {
                this.f8100b.put(i, true);
                return this;
            }
            this.f8100b.delete(i);
            return this;
        }

        public final d a(int i, af afVar, e eVar) {
            Map<af, e> map = this.f8099a.get(i);
            if (map == null) {
                map = new HashMap<>();
                this.f8099a.put(i, map);
            }
            if (map.containsKey(afVar) && com.anythink.basead.exoplayer.k.af.a(map.get(afVar), eVar)) {
                return this;
            }
            map.put(afVar, eVar);
            return this;
        }

        public final d a(int i, af afVar) {
            Map<af, e> map = this.f8099a.get(i);
            if (map != null && map.containsKey(afVar)) {
                map.remove(afVar);
                if (map.isEmpty()) {
                    this.f8099a.remove(i);
                }
            }
            return this;
        }

        public final d a(int i) {
            Map<af, e> map = this.f8099a.get(i);
            if (map != null && !map.isEmpty()) {
                this.f8099a.remove(i);
            }
            return this;
        }

        public final d a() {
            if (this.f8099a.size() == 0) {
                return this;
            }
            this.f8099a.clear();
            return this;
        }

        private static SparseArray<Map<af, e>> a(SparseArray<Map<af, e>> sparseArray) {
            SparseArray<Map<af, e>> sparseArray2 = new SparseArray<>();
            for (int i = 0; i < sparseArray.size(); i++) {
                sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
            }
            return sparseArray2;
        }
    }

    public c() {
        this((f.a) null);
    }

    public static /* synthetic */ int a(int i, int i4) {
        if (i > i4) {
            return 1;
        }
        return i4 > i ? -1 : 0;
    }

    private static int b(int i, int i4) {
        if (i == -1) {
            return i4 == -1 ? 0 : -1;
        }
        if (i4 == -1) {
            return 1;
        }
        return i - i4;
    }

    private static int c(int i, int i4) {
        if (i > i4) {
            return 1;
        }
        return i4 > i ? -1 : 0;
    }

    private d d() {
        return new d(c(), (byte) 0);
    }

    @Deprecated
    private void e() {
        a(d().a());
    }

    private c(com.anythink.basead.exoplayer.j.d dVar) {
        this(new a.C0030a(dVar));
    }

    public static boolean a(int i, boolean z8) {
        int i4 = i & 7;
        if (i4 != 4) {
            return z8 && i4 == 3;
        }
        return true;
    }

    @Deprecated
    private void b(int i, boolean z8) {
        a(d().a(i, z8));
    }

    private C0031c c() {
        return this.f8070e.get();
    }

    private c(f.a aVar) {
        this.f8069d = aVar;
        this.f8070e = new AtomicReference<>(C0031c.f8081a);
    }

    private void a(C0031c c0031c) {
        C0544a.a(c0031c);
        if (this.f8070e.getAndSet(c0031c).equals(c0031c)) {
            return;
        }
        b();
    }

    @Deprecated
    private e b(int i, af afVar) {
        return c().b(i, afVar);
    }

    @Deprecated
    private void c(int i, af afVar) {
        a(d().a(i, afVar));
    }

    @Deprecated
    private void b(int i) {
        a(d().a(i));
    }

    @Deprecated
    private void c(int i) {
        a(d().b(i));
    }

    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.anythink.basead.exoplayer.i.c.e.1
            private static e a(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ e[] newArray(int i) {
                return new e[i];
            }

            private static e[] a(int i) {
                return new e[i];
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final int f8116a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f8117b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8118c;

        private e(int i, int... iArr) {
            this.f8116a = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f8117b = copyOf;
            this.f8118c = iArr.length;
            Arrays.sort(copyOf);
        }

        private boolean a(int i) {
            for (int i4 : this.f8117b) {
                if (i4 == i) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f8116a == eVar.f8116a && Arrays.equals(this.f8117b, eVar.f8117b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f8117b) + (this.f8116a * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f8116a);
            parcel.writeInt(this.f8117b.length);
            parcel.writeIntArray(this.f8117b);
        }

        public e(Parcel parcel) {
            this.f8116a = parcel.readInt();
            int readByte = parcel.readByte();
            this.f8118c = readByte;
            int[] iArr = new int[readByte];
            this.f8117b = iArr;
            parcel.readIntArray(iArr);
        }
    }

    private static f b(af afVar, int[][] iArr, int i, C0031c c0031c, f.a aVar) {
        int[] a9;
        int i4;
        af afVar2 = afVar;
        int i9 = c0031c.f8094o ? 24 : 16;
        boolean z8 = c0031c.f8093n && (i & i9) != 0;
        int i10 = 0;
        while (i10 < afVar2.f7673b) {
            ae a10 = afVar2.a(i10);
            String str = null;
            int[] iArr2 = iArr[i10];
            int i11 = c0031c.f8086f;
            int i12 = c0031c.f8087g;
            int i13 = c0031c.f8088h;
            int i14 = c0031c.f8089j;
            int i15 = c0031c.f8090k;
            boolean z9 = c0031c.f8091l;
            if (a10.f7669a < 2) {
                a9 = f8067b;
            } else {
                List<Integer> a11 = a(a10, i14, i15, z9);
                if (a11.size() < 2) {
                    a9 = f8067b;
                } else {
                    if (!z8) {
                        HashSet hashSet = new HashSet();
                        String str2 = null;
                        int i16 = 0;
                        for (int i17 = 0; i17 < a11.size(); i17++) {
                            String str3 = a10.a(a11.get(i17).intValue()).f8822h;
                            if (hashSet.add(str3)) {
                                i4 = i16;
                                int a12 = a(a10, iArr2, i9, str3, i11, i12, i13, a11);
                                if (a12 > i4) {
                                    str2 = str3;
                                    i16 = a12;
                                }
                            } else {
                                i4 = i16;
                            }
                            i16 = i4;
                        }
                        str = str2;
                    }
                    b(a10, iArr2, i9, str, i11, i12, i13, a11);
                    a9 = a11.size() < 2 ? f8067b : com.anythink.basead.exoplayer.k.af.a(a11);
                }
            }
            if (a9.length > 0) {
                return ((f.a) C0544a.a(aVar)).a(a10, a9);
            }
            i10++;
            afVar2 = afVar;
        }
        return null;
    }

    private static f c(af afVar, int[][] iArr, C0031c c0031c) {
        ae aeVar = null;
        int i = 0;
        int i4 = 0;
        for (int i9 = 0; i9 < afVar.f7673b; i9++) {
            ae a9 = afVar.a(i9);
            int[] iArr2 = iArr[i9];
            for (int i10 = 0; i10 < a9.f7669a; i10++) {
                if (a(iArr2[i10], c0031c.f8095p)) {
                    int i11 = (a9.a(i10).f8839z & 1) != 0 ? 2 : 1;
                    if (a(iArr2[i10], false)) {
                        i11 += 1000;
                    }
                    if (i11 > i4) {
                        aeVar = a9;
                        i = i10;
                        i4 = i11;
                    }
                }
            }
        }
        if (aeVar == null) {
            return null;
        }
        return new com.anythink.basead.exoplayer.i.d(aeVar, i);
    }

    private void a(d dVar) {
        C0031c b9 = dVar.b();
        C0544a.a(b9);
        if (this.f8070e.getAndSet(b9).equals(b9)) {
            return;
        }
        b();
    }

    @Deprecated
    private boolean a(int i) {
        return c().a(i);
    }

    @Deprecated
    private void a(int i, af afVar, e eVar) {
        a(d().a(i, afVar, eVar));
    }

    @Deprecated
    private boolean a(int i, af afVar) {
        return c().a(i, afVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00fc A[LOOP:1: B:20:0x0054->B:28:0x00fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f1 A[SYNTHETIC] */
    @Override // com.anythink.basead.exoplayer.i.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<aa[], f[]> a(e.a aVar, int[][][] iArr, int[] iArr2) {
        boolean z8;
        boolean z9;
        f fVar;
        String str;
        ae aeVar;
        int[] a9;
        ae aeVar2;
        int[] iArr3;
        C0031c c0031c = this.f8070e.get();
        int a10 = aVar.a();
        int a11 = aVar.a();
        f[] fVarArr = new f[a11];
        boolean z10 = false;
        boolean z11 = false;
        for (int i = 0; i < a11; i++) {
            if (2 == aVar.a(i)) {
                if (z10) {
                    z8 = z11;
                    z9 = false;
                } else {
                    af b9 = aVar.b(i);
                    int[][] iArr4 = iArr[i];
                    int i4 = iArr2[i];
                    z9 = false;
                    f.a aVar2 = this.f8069d;
                    if (!c0031c.f8092m && aVar2 != null) {
                        int i9 = c0031c.f8094o ? 24 : 16;
                        boolean z12 = c0031c.f8093n && (i4 & i9) != 0;
                        int i10 = 0;
                        while (i10 < b9.f7673b) {
                            ae a12 = b9.a(i10);
                            int[] iArr5 = iArr4[i10];
                            int i11 = c0031c.f8086f;
                            f.a aVar3 = aVar2;
                            int i12 = c0031c.f8087g;
                            int i13 = c0031c.f8088h;
                            int i14 = c0031c.f8089j;
                            z8 = z11;
                            int i15 = c0031c.f8090k;
                            boolean z13 = c0031c.f8091l;
                            boolean z14 = z12;
                            int i16 = i10;
                            if (a12.f7669a < 2) {
                                iArr3 = f8067b;
                            } else {
                                List<Integer> a13 = a(a12, i14, i15, z13);
                                if (a13.size() < 2) {
                                    iArr3 = f8067b;
                                } else {
                                    if (z14) {
                                        str = null;
                                    } else {
                                        HashSet hashSet = new HashSet();
                                        int i17 = 0;
                                        int i18 = 0;
                                        String str2 = null;
                                        while (i17 < a13.size()) {
                                            String str3 = a12.a(a13.get(i17).intValue()).f8822h;
                                            List<Integer> list = a13;
                                            if (hashSet.add(str3)) {
                                                aeVar2 = a12;
                                                int a14 = a(aeVar2, iArr5, i9, str3, i11, i12, i13, list);
                                                if (a14 > i18) {
                                                    i18 = a14;
                                                    str2 = str3;
                                                }
                                            } else {
                                                aeVar2 = a12;
                                            }
                                            i17++;
                                            a12 = aeVar2;
                                            a13 = list;
                                        }
                                        str = str2;
                                    }
                                    List<Integer> list2 = a13;
                                    ae aeVar3 = a12;
                                    b(aeVar3, iArr5, i9, str, i11, i12, i13, list2);
                                    aeVar = aeVar3;
                                    a9 = list2.size() < 2 ? f8067b : com.anythink.basead.exoplayer.k.af.a(list2);
                                    if (a9.length <= 0) {
                                        fVar = ((f.a) C0544a.a(aVar3)).a(aeVar, a9);
                                        break;
                                    }
                                    i10 = i16 + 1;
                                    aVar2 = aVar3;
                                    z11 = z8;
                                    z12 = z14;
                                }
                            }
                            a9 = iArr3;
                            aeVar = a12;
                            if (a9.length <= 0) {
                            }
                        }
                    }
                    z8 = z11;
                    fVar = null;
                    if (fVar == null) {
                        fVar = a(b9, iArr4, c0031c);
                    }
                    fVarArr[i] = fVar;
                    z10 = fVar != null;
                }
                z11 = z8 | (aVar.b(i).f7673b > 0 ? true : z9);
            }
        }
        boolean z15 = z11;
        boolean z16 = false;
        boolean z17 = false;
        for (int i19 = 0; i19 < a11; i19++) {
            int a15 = aVar.a(i19);
            if (a15 != 1) {
                if (a15 != 2) {
                    if (a15 != 3) {
                        fVarArr[i19] = c(aVar.b(i19), iArr[i19], c0031c);
                    } else if (!z17) {
                        f b10 = b(aVar.b(i19), iArr[i19], c0031c);
                        fVarArr[i19] = b10;
                        z17 = b10 != null;
                    }
                }
            } else if (!z16) {
                f a16 = a(aVar.b(i19), iArr[i19], c0031c, z15 ? null : this.f8069d);
                fVarArr[i19] = a16;
                z16 = a16 != null;
            }
        }
        for (int i20 = 0; i20 < a10; i20++) {
            if (c0031c.a(i20)) {
                fVarArr[i20] = null;
            } else {
                af b11 = aVar.b(i20);
                if (c0031c.a(i20, b11)) {
                    e b12 = c0031c.b(i20, b11);
                    if (b12 == null) {
                        fVarArr[i20] = null;
                    } else {
                        if (b12.f8118c == 1) {
                            fVarArr[i20] = new com.anythink.basead.exoplayer.i.d(b11.a(b12.f8116a), b12.f8117b[0]);
                        } else {
                            fVarArr[i20] = ((f.a) C0544a.a(this.f8069d)).a(b11.a(b12.f8116a), b12.f8117b);
                        }
                    }
                }
            }
        }
        aa[] aaVarArr = new aa[a10];
        for (int i21 = 0; i21 < a10; i21++) {
            aaVarArr[i21] = (c0031c.a(i21) || (aVar.a(i21) != 5 && fVarArr[i21] == null)) ? null : aa.f6466a;
        }
        a(aVar, iArr, aaVarArr, fVarArr, c0031c.f8096q);
        return Pair.create(aaVarArr, fVarArr);
    }

    private static void b(ae aeVar, int[] iArr, int i, String str, int i4, int i9, int i10, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!a(aeVar.a(intValue), str, iArr[intValue], i, i4, i9, i10)) {
                list.remove(size);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static f b(af afVar, int[][] iArr, C0031c c0031c) {
        int i = 0;
        int i4 = 0;
        ae aeVar = null;
        for (int i9 = 0; i9 < afVar.f7673b; i9++) {
            ae a9 = afVar.a(i9);
            int[] iArr2 = iArr[i9];
            for (int i10 = 0; i10 < a9.f7669a; i10++) {
                if (a(iArr2[i10], c0031c.f8095p)) {
                    m a10 = a9.a(i10);
                    int i11 = a10.f8839z & (~c0031c.f8085e);
                    int i12 = 1;
                    Object[] objArr = (i11 & 1) != 0;
                    Object[] objArr2 = (i11 & 2) != 0;
                    boolean a11 = a(a10, c0031c.f8083c);
                    if (a11 || (c0031c.f8084d && (TextUtils.isEmpty(a10.f8814A) || a(a10, com.anythink.basead.exoplayer.b.ar)))) {
                        i12 = (objArr != false ? 8 : objArr2 == false ? 6 : 4) + (a11 ? 1 : 0);
                    } else if (objArr == true) {
                        i12 = 3;
                    } else if (objArr2 != false) {
                        if (a(a10, c0031c.f8082b)) {
                            i12 = 2;
                        }
                    }
                    if (a(iArr2[i10], false)) {
                        i12 += 1000;
                    }
                    if (i12 > i4) {
                        aeVar = a9;
                        i = i10;
                        i4 = i12;
                    }
                }
            }
        }
        if (aeVar == null) {
            return null;
        }
        return new com.anythink.basead.exoplayer.i.d(aeVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8 A[LOOP:1: B:20:0x0042->B:28:0x00e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private f[] a(e.a aVar, int[][][] iArr, int[] iArr2, C0031c c0031c) {
        f[] fVarArr;
        boolean z8;
        f fVar;
        String str;
        ae aeVar;
        int[] a9;
        ae aeVar2;
        int[] iArr3;
        int a10 = aVar.a();
        f[] fVarArr2 = new f[a10];
        int i = 0;
        boolean z9 = false;
        boolean z10 = false;
        while (i < a10) {
            if (2 == aVar.a(i)) {
                if (z9) {
                    fVarArr = fVarArr2;
                    z8 = z10;
                } else {
                    af b9 = aVar.b(i);
                    int[][] iArr4 = iArr[i];
                    int i4 = iArr2[i];
                    f.a aVar2 = this.f8069d;
                    if (!c0031c.f8092m && aVar2 != null) {
                        int i9 = c0031c.f8094o ? 24 : 16;
                        boolean z11 = c0031c.f8093n && (i4 & i9) != 0;
                        int i10 = 0;
                        while (i10 < b9.f7673b) {
                            ae a11 = b9.a(i10);
                            int[] iArr5 = iArr4[i10];
                            int i11 = c0031c.f8086f;
                            int i12 = c0031c.f8087g;
                            int i13 = c0031c.f8088h;
                            fVarArr = fVarArr2;
                            int i14 = c0031c.f8089j;
                            z8 = z10;
                            int i15 = c0031c.f8090k;
                            boolean z12 = c0031c.f8091l;
                            if (a11.f7669a < 2) {
                                iArr3 = f8067b;
                            } else {
                                List<Integer> a12 = a(a11, i14, i15, z12);
                                if (a12.size() < 2) {
                                    iArr3 = f8067b;
                                } else {
                                    if (z11) {
                                        str = null;
                                    } else {
                                        HashSet hashSet = new HashSet();
                                        int i16 = 0;
                                        int i17 = 0;
                                        String str2 = null;
                                        while (i16 < a12.size()) {
                                            String str3 = a11.a(a12.get(i16).intValue()).f8822h;
                                            List<Integer> list = a12;
                                            if (hashSet.add(str3)) {
                                                aeVar2 = a11;
                                                int a13 = a(aeVar2, iArr5, i9, str3, i11, i12, i13, list);
                                                if (a13 > i17) {
                                                    i17 = a13;
                                                    str2 = str3;
                                                }
                                            } else {
                                                aeVar2 = a11;
                                            }
                                            i16++;
                                            a11 = aeVar2;
                                            a12 = list;
                                        }
                                        str = str2;
                                    }
                                    List<Integer> list2 = a12;
                                    ae aeVar3 = a11;
                                    b(aeVar3, iArr5, i9, str, i11, i12, i13, list2);
                                    aeVar = aeVar3;
                                    a9 = list2.size() < 2 ? f8067b : com.anythink.basead.exoplayer.k.af.a(list2);
                                    if (a9.length <= 0) {
                                        fVar = ((f.a) C0544a.a(aVar2)).a(aeVar, a9);
                                        break;
                                    }
                                    i10++;
                                    fVarArr2 = fVarArr;
                                    z10 = z8;
                                }
                            }
                            a9 = iArr3;
                            aeVar = a11;
                            if (a9.length <= 0) {
                            }
                        }
                    }
                    fVarArr = fVarArr2;
                    z8 = z10;
                    fVar = null;
                    if (fVar == null) {
                        fVar = a(b9, iArr4, c0031c);
                    }
                    fVarArr[i] = fVar;
                    z9 = fVar != null;
                }
                z10 = z8 | (aVar.b(i).f7673b > 0);
            } else {
                fVarArr = fVarArr2;
            }
            i++;
            fVarArr2 = fVarArr;
        }
        f[] fVarArr3 = fVarArr2;
        boolean z13 = z10;
        boolean z14 = false;
        boolean z15 = false;
        for (int i18 = 0; i18 < a10; i18++) {
            int a14 = aVar.a(i18);
            if (a14 != 1) {
                if (a14 != 2) {
                    if (a14 != 3) {
                        fVarArr3[i18] = c(aVar.b(i18), iArr[i18], c0031c);
                    } else if (!z15) {
                        f b10 = b(aVar.b(i18), iArr[i18], c0031c);
                        fVarArr3[i18] = b10;
                        z15 = b10 != null;
                    }
                }
            } else if (!z14) {
                f a15 = a(aVar.b(i18), iArr[i18], c0031c, z13 ? null : this.f8069d);
                fVarArr3[i18] = a15;
                z14 = a15 != null;
            }
        }
        return fVarArr3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8 A[LOOP:0: B:14:0x0023->B:22:0x00b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static f a(af afVar, int[][] iArr, int i, C0031c c0031c, f.a aVar) {
        f fVar;
        String str;
        boolean z8;
        int[] a9;
        boolean z9;
        int i4;
        if (!c0031c.f8092m && aVar != null) {
            int i9 = c0031c.f8094o ? 24 : 16;
            boolean z10 = c0031c.f8093n && (i & i9) != 0;
            int i10 = 0;
            while (i10 < afVar.f7673b) {
                ae a10 = afVar.a(i10);
                int[] iArr2 = iArr[i10];
                int i11 = c0031c.f8086f;
                int i12 = c0031c.f8087g;
                int i13 = c0031c.f8088h;
                int i14 = c0031c.f8089j;
                int i15 = c0031c.f8090k;
                boolean z11 = c0031c.f8091l;
                if (a10.f7669a < 2) {
                    a9 = f8067b;
                } else {
                    List<Integer> a11 = a(a10, i14, i15, z11);
                    if (a11.size() < 2) {
                        a9 = f8067b;
                    } else {
                        if (z10) {
                            str = null;
                        } else {
                            HashSet hashSet = new HashSet();
                            int i16 = 0;
                            int i17 = 0;
                            String str2 = null;
                            while (i17 < a11.size()) {
                                String str3 = a10.a(a11.get(i17).intValue()).f8822h;
                                if (hashSet.add(str3)) {
                                    i4 = i16;
                                    z9 = z10;
                                    int a12 = a(a10, iArr2, i9, str3, i11, i12, i13, a11);
                                    if (a12 > i4) {
                                        str2 = str3;
                                        i16 = a12;
                                        i17++;
                                        z10 = z9;
                                    }
                                } else {
                                    z9 = z10;
                                    i4 = i16;
                                }
                                i16 = i4;
                                i17++;
                                z10 = z9;
                            }
                            str = str2;
                        }
                        z8 = z10;
                        b(a10, iArr2, i9, str, i11, i12, i13, a11);
                        a9 = a11.size() < 2 ? f8067b : com.anythink.basead.exoplayer.k.af.a(a11);
                        if (a9.length <= 0) {
                            fVar = ((f.a) C0544a.a(aVar)).a(a10, a9);
                            break;
                        }
                        i10++;
                        z10 = z8;
                    }
                }
                z8 = z10;
                if (a9.length <= 0) {
                }
            }
        }
        fVar = null;
        return fVar == null ? a(afVar, iArr, c0031c) : fVar;
    }

    private static int[] a(ae aeVar, int[] iArr, boolean z8, int i, int i4, int i9, int i10, int i11, int i12, boolean z9) {
        int i13;
        int i14;
        int i15;
        String str;
        int i16;
        int i17;
        int i18;
        int[] iArr2;
        ae aeVar2;
        if (aeVar.f7669a < 2) {
            return f8067b;
        }
        List<Integer> a9 = a(aeVar, i11, i12, z9);
        if (a9.size() < 2) {
            return f8067b;
        }
        if (z8) {
            i13 = i9;
            i14 = i4;
            i15 = i10;
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            int i19 = 0;
            int i20 = 0;
            String str2 = null;
            while (i19 < a9.size()) {
                String str3 = aeVar.a(a9.get(i19).intValue()).f8822h;
                if (hashSet.add(str3)) {
                    int i21 = i10;
                    i18 = i9;
                    i16 = i4;
                    iArr2 = iArr;
                    aeVar2 = aeVar;
                    int a10 = a(aeVar2, iArr2, i, str3, i16, i18, i21, a9);
                    i17 = i21;
                    if (a10 > i20) {
                        i20 = a10;
                        str2 = str3;
                    }
                } else {
                    int i22 = i9;
                    i16 = i4;
                    i17 = i10;
                    i18 = i22;
                    iArr2 = iArr;
                    aeVar2 = aeVar;
                }
                i19++;
                int i23 = i18;
                i10 = i17;
                i4 = i16;
                i9 = i23;
                aeVar = aeVar2;
                iArr = iArr2;
            }
            i13 = i9;
            i14 = i4;
            i15 = i10;
            str = str2;
        }
        b(aeVar, iArr, i, str, i14, i13, i15, a9);
        return a9.size() < 2 ? f8067b : com.anythink.basead.exoplayer.k.af.a(a9);
    }

    private static int a(ae aeVar, int[] iArr, int i, String str, int i4, int i9, int i10, List<Integer> list) {
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int intValue = list.get(i12).intValue();
            if (a(aeVar.a(intValue), str, iArr[intValue], i, i4, i9, i10)) {
                i11++;
            }
        }
        return i11;
    }

    private static boolean a(m mVar, String str, int i, int i4, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        return a(i, false) && (i & i4) != 0 && (str == null || com.anythink.basead.exoplayer.k.af.a((Object) mVar.f8822h, (Object) str)) && (((i12 = mVar.f8826m) == -1 || i12 <= i9) && (((i13 = mVar.f8827n) == -1 || i13 <= i10) && ((i14 = mVar.f8818d) == -1 || i14 <= i11)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        if (b(r2.f8818d, r10) < 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static f a(af afVar, int[][] iArr, C0031c c0031c) {
        int b9;
        int i;
        int i4;
        int i9;
        af afVar2 = afVar;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        ae aeVar = null;
        int i14 = 0;
        int i15 = 0;
        while (i13 < afVar2.f7673b) {
            ae a9 = afVar2.a(i13);
            List<Integer> a10 = a(a9, c0031c.f8089j, c0031c.f8090k, c0031c.f8091l);
            int[] iArr2 = iArr[i13];
            int i16 = 0;
            while (i16 < a9.f7669a) {
                if (a(iArr2[i16], c0031c.f8095p)) {
                    m a11 = a9.a(i16);
                    boolean z8 = true;
                    boolean z9 = a10.contains(Integer.valueOf(i16)) && ((i = a11.f8826m) == i10 || i <= c0031c.f8086f) && (((i4 = a11.f8827n) == i10 || i4 <= c0031c.f8087g) && ((i9 = a11.f8818d) == i10 || i9 <= c0031c.f8088h));
                    if (z9 || c0031c.i) {
                        int i17 = z9 ? 2 : 1;
                        boolean a12 = a(iArr2[i16], false);
                        if (a12) {
                            i17 += 1000;
                        }
                        boolean z10 = i17 > i15;
                        if (i17 == i15) {
                            if (!c0031c.f8092m) {
                                int a13 = a11.a();
                                if (a13 != i11) {
                                    b9 = b(a13, i11);
                                } else {
                                    b9 = b(a11.f8818d, i12);
                                }
                                if (a12) {
                                }
                                z8 = false;
                                z10 = z8;
                            }
                        }
                        if (z10) {
                            i12 = a11.f8818d;
                            i11 = a11.a();
                            aeVar = a9;
                            i14 = i16;
                            i15 = i17;
                        }
                    }
                }
                i16++;
                i10 = -1;
            }
            i13++;
            afVar2 = afVar;
            i10 = -1;
        }
        if (aeVar == null) {
            return null;
        }
        return new com.anythink.basead.exoplayer.i.d(aeVar, i14);
    }

    private static f a(af afVar, int[][] iArr, C0031c c0031c, f.a aVar) {
        int[] iArr2;
        int a9;
        int i = -1;
        int i4 = -1;
        b bVar = null;
        for (int i9 = 0; i9 < afVar.f7673b; i9++) {
            ae a10 = afVar.a(i9);
            int[] iArr3 = iArr[i9];
            for (int i10 = 0; i10 < a10.f7669a; i10++) {
                if (a(iArr3[i10], c0031c.f8095p)) {
                    b bVar2 = new b(a10.a(i10), c0031c, iArr3[i10]);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        i = i9;
                        i4 = i10;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        ae a11 = afVar.a(i);
        if (!c0031c.f8092m && aVar != null) {
            int[] iArr4 = iArr[i];
            boolean z8 = c0031c.f8093n;
            HashSet hashSet = new HashSet();
            a aVar2 = null;
            int i11 = 0;
            for (int i12 = 0; i12 < a11.f7669a; i12++) {
                m a12 = a11.a(i12);
                a aVar3 = new a(a12.f8834u, a12.f8835v, z8 ? null : a12.f8822h);
                if (hashSet.add(aVar3) && (a9 = a(a11, iArr4, aVar3)) > i11) {
                    i11 = a9;
                    aVar2 = aVar3;
                }
            }
            if (i11 > 1) {
                iArr2 = new int[i11];
                int i13 = 0;
                for (int i14 = 0; i14 < a11.f7669a; i14++) {
                    if (a(a11.a(i14), iArr4[i14], (a) C0544a.a(aVar2))) {
                        iArr2[i13] = i14;
                        i13++;
                    }
                }
            } else {
                iArr2 = f8067b;
            }
            if (iArr2.length > 0) {
                return aVar.a(a11, iArr2);
            }
        }
        return new com.anythink.basead.exoplayer.i.d(a11, i4);
    }

    private static int[] a(ae aeVar, int[] iArr, boolean z8) {
        int a9;
        HashSet hashSet = new HashSet();
        int i = 0;
        a aVar = null;
        for (int i4 = 0; i4 < aeVar.f7669a; i4++) {
            m a10 = aeVar.a(i4);
            a aVar2 = new a(a10.f8834u, a10.f8835v, z8 ? null : a10.f8822h);
            if (hashSet.add(aVar2) && (a9 = a(aeVar, iArr, aVar2)) > i) {
                i = a9;
                aVar = aVar2;
            }
        }
        if (i > 1) {
            int[] iArr2 = new int[i];
            int i9 = 0;
            for (int i10 = 0; i10 < aeVar.f7669a; i10++) {
                if (a(aeVar.a(i10), iArr[i10], (a) C0544a.a(aVar))) {
                    iArr2[i9] = i10;
                    i9++;
                }
            }
            return iArr2;
        }
        return f8067b;
    }

    private static int a(ae aeVar, int[] iArr, a aVar) {
        int i = 0;
        for (int i4 = 0; i4 < aeVar.f7669a; i4++) {
            if (a(aeVar.a(i4), iArr[i4], aVar)) {
                i++;
            }
        }
        return i;
    }

    private static boolean a(m mVar, int i, a aVar) {
        String str;
        return a(i, false) && mVar.f8834u == aVar.f8071a && mVar.f8835v == aVar.f8072b && ((str = aVar.f8073c) == null || TextUtils.equals(str, mVar.f8822h));
    }

    private static void a(e.a aVar, int[][][] iArr, aa[] aaVarArr, f[] fVarArr, int i) {
        boolean z8;
        if (i == 0) {
            return;
        }
        boolean z9 = false;
        int i4 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < aVar.a(); i10++) {
            int a9 = aVar.a(i10);
            f fVar = fVarArr[i10];
            if ((a9 == 1 || a9 == 2) && fVar != null) {
                int[][] iArr2 = iArr[i10];
                int a10 = aVar.b(i10).a(fVar.f());
                int i11 = 0;
                while (true) {
                    if (i11 < fVar.g()) {
                        if ((iArr2[a10][fVar.b(i11)] & 32) != 32) {
                            break;
                        } else {
                            i11++;
                        }
                    } else if (a9 == 1) {
                        if (i9 != -1) {
                            z8 = false;
                            break;
                        }
                        i9 = i10;
                    } else {
                        if (i4 != -1) {
                            z8 = false;
                            break;
                        }
                        i4 = i10;
                    }
                }
            }
        }
        z8 = true;
        if (i9 != -1 && i4 != -1) {
            z9 = true;
        }
        if (z8 && z9) {
            aa aaVar = new aa(i);
            aaVarArr[i9] = aaVar;
            aaVarArr[i4] = aaVar;
        }
    }

    private static boolean a(int[][] iArr, af afVar, f fVar) {
        if (fVar == null) {
            return false;
        }
        int a9 = afVar.a(fVar.f());
        for (int i = 0; i < fVar.g(); i++) {
            if ((iArr[a9][fVar.b(i)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(m mVar) {
        return TextUtils.isEmpty(mVar.f8814A) || a(mVar, com.anythink.basead.exoplayer.b.ar);
    }

    public static boolean a(m mVar, String str) {
        return str != null && TextUtils.equals(str, com.anythink.basead.exoplayer.k.af.b(mVar.f8814A));
    }

    private static List<Integer> a(ae aeVar, int i, int i4, boolean z8) {
        int i9;
        ArrayList arrayList = new ArrayList(aeVar.f7669a);
        for (int i10 = 0; i10 < aeVar.f7669a; i10++) {
            arrayList.add(Integer.valueOf(i10));
        }
        if (i != Integer.MAX_VALUE && i4 != Integer.MAX_VALUE) {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < aeVar.f7669a; i12++) {
                m a9 = aeVar.a(i12);
                int i13 = a9.f8826m;
                if (i13 > 0 && (i9 = a9.f8827n) > 0) {
                    Point a10 = a(z8, i, i4, i13, i9);
                    int i14 = a9.f8826m;
                    int i15 = a9.f8827n;
                    int i16 = i14 * i15;
                    if (i14 >= ((int) (a10.x * f8066a)) && i15 >= ((int) (a10.y * f8066a)) && i16 < i11) {
                        i11 = i16;
                    }
                }
            }
            if (i11 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int a11 = aeVar.a(((Integer) arrayList.get(size)).intValue()).a();
                    if (a11 == -1 || a11 > i11) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if ((r6 > r7) != (r4 > r5)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Point a(boolean z8, int i, int i4, int i9, int i10) {
        if (z8) {
        }
        i4 = i;
        i = i4;
        int i11 = i9 * i;
        int i12 = i10 * i4;
        if (i11 >= i12) {
            return new Point(i4, com.anythink.basead.exoplayer.k.af.a(i12, i9));
        }
        return new Point(com.anythink.basead.exoplayer.k.af.a(i11, i10), i);
    }
}
