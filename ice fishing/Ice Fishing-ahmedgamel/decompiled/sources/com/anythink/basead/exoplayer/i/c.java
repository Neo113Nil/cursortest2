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
    private static final float f8695a = 0.98f;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f8696b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    private static final int f8697c = 1000;

    /* renamed from: d, reason: collision with root package name */
    private final f.a f8698d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference<C0032c> f8699e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8700a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8701b;

        /* renamed from: c, reason: collision with root package name */
        public final String f8702c;

        public a(int i, int i4, String str) {
            this.f8700a = i;
            this.f8701b = i4;
            this.f8702c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f8700a == aVar.f8700a && this.f8701b == aVar.f8701b && TextUtils.equals(this.f8702c, aVar.f8702c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = ((this.f8700a * 31) + this.f8701b) * 31;
            String str = this.f8702c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        private final C0032c f8703a;

        /* renamed from: b, reason: collision with root package name */
        private final int f8704b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8705c;

        /* renamed from: d, reason: collision with root package name */
        private final int f8706d;

        /* renamed from: e, reason: collision with root package name */
        private final int f8707e;

        /* renamed from: f, reason: collision with root package name */
        private final int f8708f;

        /* renamed from: g, reason: collision with root package name */
        private final int f8709g;

        public b(m mVar, C0032c c0032c, int i) {
            this.f8703a = c0032c;
            this.f8704b = c.a(i, false) ? 1 : 0;
            this.f8705c = c.a(mVar, c0032c.f8711b) ? 1 : 0;
            this.f8706d = (mVar.f9468z & 1) != 0 ? 1 : 0;
            this.f8707e = mVar.f9463u;
            this.f8708f = mVar.f9464v;
            this.f8709g = mVar.f9447d;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b bVar) {
            int i = this.f8704b;
            int i4 = bVar.f8704b;
            if (i != i4) {
                return c.a(i, i4);
            }
            int i6 = this.f8705c;
            int i9 = bVar.f8705c;
            if (i6 != i9) {
                return c.a(i6, i9);
            }
            int i10 = this.f8706d;
            int i11 = bVar.f8706d;
            if (i10 != i11) {
                return c.a(i10, i11);
            }
            if (this.f8703a.f8721m) {
                return c.a(bVar.f8709g, this.f8709g);
            }
            int i12 = i != 1 ? -1 : 1;
            int i13 = this.f8707e;
            int i14 = bVar.f8707e;
            if (i13 != i14) {
                return c.a(i13, i14) * i12;
            }
            int i15 = this.f8708f;
            int i16 = bVar.f8708f;
            return i15 != i16 ? c.a(i15, i16) * i12 : c.a(this.f8709g, bVar.f8709g) * i12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f8704b == bVar.f8704b && this.f8705c == bVar.f8705c && this.f8706d == bVar.f8706d && this.f8707e == bVar.f8707e && this.f8708f == bVar.f8708f && this.f8709g == bVar.f8709g) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (((((((((this.f8704b * 31) + this.f8705c) * 31) + this.f8706d) * 31) + this.f8707e) * 31) + this.f8708f) * 31) + this.f8709g;
        }
    }

    /* renamed from: com.anythink.basead.exoplayer.i.c$c, reason: collision with other inner class name */
    public static final class C0032c implements Parcelable {

        /* renamed from: b, reason: collision with root package name */
        public final String f8711b;

        /* renamed from: c, reason: collision with root package name */
        public final String f8712c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f8713d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8714e;

        /* renamed from: f, reason: collision with root package name */
        public final int f8715f;

        /* renamed from: g, reason: collision with root package name */
        public final int f8716g;

        /* renamed from: h, reason: collision with root package name */
        public final int f8717h;
        public final boolean i;

        /* renamed from: j, reason: collision with root package name */
        public final int f8718j;

        /* renamed from: k, reason: collision with root package name */
        public final int f8719k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f8720l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f8721m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f8722n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f8723o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f8724p;

        /* renamed from: q, reason: collision with root package name */
        public final int f8725q;

        /* renamed from: r, reason: collision with root package name */
        private final SparseArray<Map<af, e>> f8726r;

        /* renamed from: s, reason: collision with root package name */
        private final SparseBooleanArray f8727s;

        /* renamed from: a, reason: collision with root package name */
        public static final C0032c f8710a = new C0032c();
        public static final Parcelable.Creator<C0032c> CREATOR = new Parcelable.Creator<C0032c>() { // from class: com.anythink.basead.exoplayer.i.c.c.1
            private static C0032c a(Parcel parcel) {
                return new C0032c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ C0032c createFromParcel(Parcel parcel) {
                return new C0032c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ C0032c[] newArray(int i) {
                return new C0032c[i];
            }

            private static C0032c[] a(int i) {
                return new C0032c[i];
            }
        };

        private C0032c() {
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
            if (obj != null && C0032c.class == obj.getClass()) {
                C0032c c0032c = (C0032c) obj;
                if (this.f8713d == c0032c.f8713d && this.f8714e == c0032c.f8714e && this.f8721m == c0032c.f8721m && this.f8722n == c0032c.f8722n && this.f8723o == c0032c.f8723o && this.f8715f == c0032c.f8715f && this.f8716g == c0032c.f8716g && this.i == c0032c.i && this.f8724p == c0032c.f8724p && this.f8720l == c0032c.f8720l && this.f8718j == c0032c.f8718j && this.f8719k == c0032c.f8719k && this.f8717h == c0032c.f8717h && this.f8725q == c0032c.f8725q && TextUtils.equals(this.f8711b, c0032c.f8711b) && TextUtils.equals(this.f8712c, c0032c.f8712c)) {
                    SparseBooleanArray sparseBooleanArray = this.f8727s;
                    SparseBooleanArray sparseBooleanArray2 = c0032c.f8727s;
                    int size = sparseBooleanArray.size();
                    if (sparseBooleanArray2.size() == size) {
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                SparseArray<Map<af, e>> sparseArray = this.f8726r;
                                SparseArray<Map<af, e>> sparseArray2 = c0032c.f8726r;
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
            int i = (((((((((((((((((((((((((((this.f8713d ? 1 : 0) * 31) + this.f8714e) * 31) + (this.f8721m ? 1 : 0)) * 31) + (this.f8722n ? 1 : 0)) * 31) + (this.f8723o ? 1 : 0)) * 31) + this.f8715f) * 31) + this.f8716g) * 31) + (this.i ? 1 : 0)) * 31) + (this.f8724p ? 1 : 0)) * 31) + (this.f8720l ? 1 : 0)) * 31) + this.f8718j) * 31) + this.f8719k) * 31) + this.f8717h) * 31) + this.f8725q) * 31;
            String str = this.f8711b;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f8712c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            SparseArray<Map<af, e>> sparseArray = this.f8726r;
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
            parcel.writeSparseBooleanArray(this.f8727s);
            parcel.writeString(this.f8711b);
            parcel.writeString(this.f8712c);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f8713d);
            parcel.writeInt(this.f8714e);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f8721m);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f8722n);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f8723o);
            parcel.writeInt(this.f8715f);
            parcel.writeInt(this.f8716g);
            parcel.writeInt(this.f8717h);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.i);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f8724p);
            parcel.writeInt(this.f8718j);
            parcel.writeInt(this.f8719k);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f8720l);
            parcel.writeInt(this.f8725q);
        }

        public C0032c(SparseArray<Map<af, e>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z6, int i, boolean z9, boolean z10, boolean z11, int i4, int i6, int i9, boolean z12, boolean z13, int i10, int i11, boolean z14, int i12) {
            this.f8726r = sparseArray;
            this.f8727s = sparseBooleanArray;
            this.f8711b = com.anythink.basead.exoplayer.k.af.b(str);
            this.f8712c = com.anythink.basead.exoplayer.k.af.b(str2);
            this.f8713d = z6;
            this.f8714e = i;
            this.f8721m = z9;
            this.f8722n = z10;
            this.f8723o = z11;
            this.f8715f = i4;
            this.f8716g = i6;
            this.f8717h = i9;
            this.i = z12;
            this.f8724p = z13;
            this.f8718j = i10;
            this.f8719k = i11;
            this.f8720l = z14;
            this.f8725q = i12;
        }

        public final boolean a(int i) {
            return this.f8727s.get(i);
        }

        public final e b(int i, af afVar) {
            Map<af, e> map = this.f8726r.get(i);
            if (map != null) {
                return map.get(afVar);
            }
            return null;
        }

        public final boolean a(int i, af afVar) {
            Map<af, e> map = this.f8726r.get(i);
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

        public C0032c(Parcel parcel) {
            this.f8726r = a(parcel);
            this.f8727s = parcel.readSparseBooleanArray();
            this.f8711b = parcel.readString();
            this.f8712c = parcel.readString();
            this.f8713d = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f8714e = parcel.readInt();
            this.f8721m = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f8722n = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f8723o = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f8715f = parcel.readInt();
            this.f8716g = parcel.readInt();
            this.f8717h = parcel.readInt();
            this.i = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f8724p = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f8718j = parcel.readInt();
            this.f8719k = parcel.readInt();
            this.f8720l = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f8725q = parcel.readInt();
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
        private final SparseArray<Map<af, e>> f8728a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseBooleanArray f8729b;

        /* renamed from: c, reason: collision with root package name */
        private String f8730c;

        /* renamed from: d, reason: collision with root package name */
        private String f8731d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f8732e;

        /* renamed from: f, reason: collision with root package name */
        private int f8733f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f8734g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f8735h;
        private boolean i;

        /* renamed from: j, reason: collision with root package name */
        private int f8736j;

        /* renamed from: k, reason: collision with root package name */
        private int f8737k;

        /* renamed from: l, reason: collision with root package name */
        private int f8738l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f8739m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f8740n;

        /* renamed from: o, reason: collision with root package name */
        private int f8741o;

        /* renamed from: p, reason: collision with root package name */
        private int f8742p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f8743q;

        /* renamed from: r, reason: collision with root package name */
        private int f8744r;

        public /* synthetic */ d(C0032c c0032c, byte b9) {
            this(c0032c);
        }

        private d a(String str) {
            this.f8730c = str;
            return this;
        }

        private d b(String str) {
            this.f8731d = str;
            return this;
        }

        private d c(int i) {
            this.f8733f = i;
            return this;
        }

        private d d(boolean z6) {
            this.i = z6;
            return this;
        }

        private d e(boolean z6) {
            this.f8739m = z6;
            return this;
        }

        private d f(boolean z6) {
            this.f8740n = z6;
            return this;
        }

        public d() {
            this(C0032c.f8710a);
        }

        private d a(boolean z6) {
            this.f8732e = z6;
            return this;
        }

        private d b(boolean z6) {
            this.f8734g = z6;
            return this;
        }

        private d c(boolean z6) {
            this.f8735h = z6;
            return this;
        }

        private d d() {
            return a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        private d e() {
            return a(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        private d(C0032c c0032c) {
            this.f8728a = a((SparseArray<Map<af, e>>) c0032c.f8726r);
            this.f8729b = c0032c.f8727s.clone();
            this.f8730c = c0032c.f8711b;
            this.f8731d = c0032c.f8712c;
            this.f8732e = c0032c.f8713d;
            this.f8733f = c0032c.f8714e;
            this.f8734g = c0032c.f8721m;
            this.f8735h = c0032c.f8722n;
            this.i = c0032c.f8723o;
            this.f8736j = c0032c.f8715f;
            this.f8737k = c0032c.f8716g;
            this.f8738l = c0032c.f8717h;
            this.f8739m = c0032c.i;
            this.f8740n = c0032c.f8724p;
            this.f8741o = c0032c.f8718j;
            this.f8742p = c0032c.f8719k;
            this.f8743q = c0032c.f8720l;
            this.f8744r = c0032c.f8725q;
        }

        private d a(int i, int i4) {
            this.f8736j = i;
            this.f8737k = i4;
            return this;
        }

        private d c() {
            return a(1279, 719);
        }

        private d d(int i) {
            this.f8738l = i;
            return this;
        }

        public final d b(int i) {
            if (this.f8744r != i) {
                this.f8744r = i;
            }
            return this;
        }

        private d a(Context context, boolean z6) {
            Point a9 = com.anythink.basead.exoplayer.k.af.a(context);
            return a(a9.x, a9.y, z6);
        }

        public final C0032c b() {
            return new C0032c(this.f8728a, this.f8729b, this.f8730c, this.f8731d, this.f8732e, this.f8733f, this.f8734g, this.f8735h, this.i, this.f8736j, this.f8737k, this.f8738l, this.f8739m, this.f8740n, this.f8741o, this.f8742p, this.f8743q, this.f8744r);
        }

        private d a(int i, int i4, boolean z6) {
            this.f8741o = i;
            this.f8742p = i4;
            this.f8743q = z6;
            return this;
        }

        public final d a(int i, boolean z6) {
            if (this.f8729b.get(i) == z6) {
                return this;
            }
            if (z6) {
                this.f8729b.put(i, true);
                return this;
            }
            this.f8729b.delete(i);
            return this;
        }

        public final d a(int i, af afVar, e eVar) {
            Map<af, e> map = this.f8728a.get(i);
            if (map == null) {
                map = new HashMap<>();
                this.f8728a.put(i, map);
            }
            if (map.containsKey(afVar) && com.anythink.basead.exoplayer.k.af.a(map.get(afVar), eVar)) {
                return this;
            }
            map.put(afVar, eVar);
            return this;
        }

        public final d a(int i, af afVar) {
            Map<af, e> map = this.f8728a.get(i);
            if (map != null && map.containsKey(afVar)) {
                map.remove(afVar);
                if (map.isEmpty()) {
                    this.f8728a.remove(i);
                }
            }
            return this;
        }

        public final d a(int i) {
            Map<af, e> map = this.f8728a.get(i);
            if (map != null && !map.isEmpty()) {
                this.f8728a.remove(i);
            }
            return this;
        }

        public final d a() {
            if (this.f8728a.size() == 0) {
                return this;
            }
            this.f8728a.clear();
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
        this(new a.C0031a(dVar));
    }

    public static boolean a(int i, boolean z6) {
        int i4 = i & 7;
        if (i4 != 4) {
            return z6 && i4 == 3;
        }
        return true;
    }

    @Deprecated
    private void b(int i, boolean z6) {
        a(d().a(i, z6));
    }

    private C0032c c() {
        return this.f8699e.get();
    }

    private c(f.a aVar) {
        this.f8698d = aVar;
        this.f8699e = new AtomicReference<>(C0032c.f8710a);
    }

    private void a(C0032c c0032c) {
        com.anythink.basead.exoplayer.k.a.a(c0032c);
        if (this.f8699e.getAndSet(c0032c).equals(c0032c)) {
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
        public final int f8745a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f8746b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8747c;

        private e(int i, int... iArr) {
            this.f8745a = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f8746b = copyOf;
            this.f8747c = iArr.length;
            Arrays.sort(copyOf);
        }

        private boolean a(int i) {
            for (int i4 : this.f8746b) {
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
                if (this.f8745a == eVar.f8745a && Arrays.equals(this.f8746b, eVar.f8746b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f8746b) + (this.f8745a * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f8745a);
            parcel.writeInt(this.f8746b.length);
            parcel.writeIntArray(this.f8746b);
        }

        public e(Parcel parcel) {
            this.f8745a = parcel.readInt();
            int readByte = parcel.readByte();
            this.f8747c = readByte;
            int[] iArr = new int[readByte];
            this.f8746b = iArr;
            parcel.readIntArray(iArr);
        }
    }

    private static f b(af afVar, int[][] iArr, int i, C0032c c0032c, f.a aVar) {
        int[] a9;
        int i4;
        af afVar2 = afVar;
        int i6 = c0032c.f8723o ? 24 : 16;
        boolean z6 = c0032c.f8722n && (i & i6) != 0;
        int i9 = 0;
        while (i9 < afVar2.f8302b) {
            ae a10 = afVar2.a(i9);
            String str = null;
            int[] iArr2 = iArr[i9];
            int i10 = c0032c.f8715f;
            int i11 = c0032c.f8716g;
            int i12 = c0032c.f8717h;
            int i13 = c0032c.f8718j;
            int i14 = c0032c.f8719k;
            boolean z9 = c0032c.f8720l;
            if (a10.f8298a < 2) {
                a9 = f8696b;
            } else {
                List<Integer> a11 = a(a10, i13, i14, z9);
                if (a11.size() < 2) {
                    a9 = f8696b;
                } else {
                    if (!z6) {
                        HashSet hashSet = new HashSet();
                        String str2 = null;
                        int i15 = 0;
                        for (int i16 = 0; i16 < a11.size(); i16++) {
                            String str3 = a10.a(a11.get(i16).intValue()).f9451h;
                            if (hashSet.add(str3)) {
                                i4 = i15;
                                int a12 = a(a10, iArr2, i6, str3, i10, i11, i12, a11);
                                if (a12 > i4) {
                                    str2 = str3;
                                    i15 = a12;
                                }
                            } else {
                                i4 = i15;
                            }
                            i15 = i4;
                        }
                        str = str2;
                    }
                    b(a10, iArr2, i6, str, i10, i11, i12, a11);
                    a9 = a11.size() < 2 ? f8696b : com.anythink.basead.exoplayer.k.af.a(a11);
                }
            }
            if (a9.length > 0) {
                return ((f.a) com.anythink.basead.exoplayer.k.a.a(aVar)).a(a10, a9);
            }
            i9++;
            afVar2 = afVar;
        }
        return null;
    }

    private static f c(af afVar, int[][] iArr, C0032c c0032c) {
        ae aeVar = null;
        int i = 0;
        int i4 = 0;
        for (int i6 = 0; i6 < afVar.f8302b; i6++) {
            ae a9 = afVar.a(i6);
            int[] iArr2 = iArr[i6];
            for (int i9 = 0; i9 < a9.f8298a; i9++) {
                if (a(iArr2[i9], c0032c.f8724p)) {
                    int i10 = (a9.a(i9).f9468z & 1) != 0 ? 2 : 1;
                    if (a(iArr2[i9], false)) {
                        i10 += 1000;
                    }
                    if (i10 > i4) {
                        aeVar = a9;
                        i = i9;
                        i4 = i10;
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
        C0032c b9 = dVar.b();
        com.anythink.basead.exoplayer.k.a.a(b9);
        if (this.f8699e.getAndSet(b9).equals(b9)) {
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
        boolean z6;
        boolean z9;
        f fVar;
        String str;
        ae aeVar;
        int[] a9;
        ae aeVar2;
        int[] iArr3;
        C0032c c0032c = this.f8699e.get();
        int a10 = aVar.a();
        int a11 = aVar.a();
        f[] fVarArr = new f[a11];
        boolean z10 = false;
        boolean z11 = false;
        for (int i = 0; i < a11; i++) {
            if (2 == aVar.a(i)) {
                if (z10) {
                    z6 = z11;
                    z9 = false;
                } else {
                    af b9 = aVar.b(i);
                    int[][] iArr4 = iArr[i];
                    int i4 = iArr2[i];
                    z9 = false;
                    f.a aVar2 = this.f8698d;
                    if (!c0032c.f8721m && aVar2 != null) {
                        int i6 = c0032c.f8723o ? 24 : 16;
                        boolean z12 = c0032c.f8722n && (i4 & i6) != 0;
                        int i9 = 0;
                        while (i9 < b9.f8302b) {
                            ae a12 = b9.a(i9);
                            int[] iArr5 = iArr4[i9];
                            int i10 = c0032c.f8715f;
                            f.a aVar3 = aVar2;
                            int i11 = c0032c.f8716g;
                            int i12 = c0032c.f8717h;
                            int i13 = c0032c.f8718j;
                            z6 = z11;
                            int i14 = c0032c.f8719k;
                            boolean z13 = c0032c.f8720l;
                            boolean z14 = z12;
                            int i15 = i9;
                            if (a12.f8298a < 2) {
                                iArr3 = f8696b;
                            } else {
                                List<Integer> a13 = a(a12, i13, i14, z13);
                                if (a13.size() < 2) {
                                    iArr3 = f8696b;
                                } else {
                                    if (z14) {
                                        str = null;
                                    } else {
                                        HashSet hashSet = new HashSet();
                                        int i16 = 0;
                                        int i17 = 0;
                                        String str2 = null;
                                        while (i16 < a13.size()) {
                                            String str3 = a12.a(a13.get(i16).intValue()).f9451h;
                                            List<Integer> list = a13;
                                            if (hashSet.add(str3)) {
                                                aeVar2 = a12;
                                                int a14 = a(aeVar2, iArr5, i6, str3, i10, i11, i12, list);
                                                if (a14 > i17) {
                                                    i17 = a14;
                                                    str2 = str3;
                                                }
                                            } else {
                                                aeVar2 = a12;
                                            }
                                            i16++;
                                            a12 = aeVar2;
                                            a13 = list;
                                        }
                                        str = str2;
                                    }
                                    List<Integer> list2 = a13;
                                    ae aeVar3 = a12;
                                    b(aeVar3, iArr5, i6, str, i10, i11, i12, list2);
                                    aeVar = aeVar3;
                                    a9 = list2.size() < 2 ? f8696b : com.anythink.basead.exoplayer.k.af.a(list2);
                                    if (a9.length <= 0) {
                                        fVar = ((f.a) com.anythink.basead.exoplayer.k.a.a(aVar3)).a(aeVar, a9);
                                        break;
                                    }
                                    i9 = i15 + 1;
                                    aVar2 = aVar3;
                                    z11 = z6;
                                    z12 = z14;
                                }
                            }
                            a9 = iArr3;
                            aeVar = a12;
                            if (a9.length <= 0) {
                            }
                        }
                    }
                    z6 = z11;
                    fVar = null;
                    if (fVar == null) {
                        fVar = a(b9, iArr4, c0032c);
                    }
                    fVarArr[i] = fVar;
                    z10 = fVar != null;
                }
                z11 = z6 | (aVar.b(i).f8302b > 0 ? true : z9);
            }
        }
        boolean z15 = z11;
        boolean z16 = false;
        boolean z17 = false;
        for (int i18 = 0; i18 < a11; i18++) {
            int a15 = aVar.a(i18);
            if (a15 != 1) {
                if (a15 != 2) {
                    if (a15 != 3) {
                        fVarArr[i18] = c(aVar.b(i18), iArr[i18], c0032c);
                    } else if (!z17) {
                        f b10 = b(aVar.b(i18), iArr[i18], c0032c);
                        fVarArr[i18] = b10;
                        z17 = b10 != null;
                    }
                }
            } else if (!z16) {
                f a16 = a(aVar.b(i18), iArr[i18], c0032c, z15 ? null : this.f8698d);
                fVarArr[i18] = a16;
                z16 = a16 != null;
            }
        }
        for (int i19 = 0; i19 < a10; i19++) {
            if (c0032c.a(i19)) {
                fVarArr[i19] = null;
            } else {
                af b11 = aVar.b(i19);
                if (c0032c.a(i19, b11)) {
                    e b12 = c0032c.b(i19, b11);
                    if (b12 == null) {
                        fVarArr[i19] = null;
                    } else {
                        if (b12.f8747c == 1) {
                            fVarArr[i19] = new com.anythink.basead.exoplayer.i.d(b11.a(b12.f8745a), b12.f8746b[0]);
                        } else {
                            fVarArr[i19] = ((f.a) com.anythink.basead.exoplayer.k.a.a(this.f8698d)).a(b11.a(b12.f8745a), b12.f8746b);
                        }
                    }
                }
            }
        }
        aa[] aaVarArr = new aa[a10];
        for (int i20 = 0; i20 < a10; i20++) {
            aaVarArr[i20] = (c0032c.a(i20) || (aVar.a(i20) != 5 && fVarArr[i20] == null)) ? null : aa.f7095a;
        }
        a(aVar, iArr, aaVarArr, fVarArr, c0032c.f8725q);
        return Pair.create(aaVarArr, fVarArr);
    }

    private static void b(ae aeVar, int[] iArr, int i, String str, int i4, int i6, int i9, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!a(aeVar.a(intValue), str, iArr[intValue], i, i4, i6, i9)) {
                list.remove(size);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static f b(af afVar, int[][] iArr, C0032c c0032c) {
        int i = 0;
        int i4 = 0;
        ae aeVar = null;
        for (int i6 = 0; i6 < afVar.f8302b; i6++) {
            ae a9 = afVar.a(i6);
            int[] iArr2 = iArr[i6];
            for (int i9 = 0; i9 < a9.f8298a; i9++) {
                if (a(iArr2[i9], c0032c.f8724p)) {
                    m a10 = a9.a(i9);
                    int i10 = a10.f9468z & (~c0032c.f8714e);
                    int i11 = 1;
                    Object[] objArr = (i10 & 1) != 0;
                    Object[] objArr2 = (i10 & 2) != 0;
                    boolean a11 = a(a10, c0032c.f8712c);
                    if (a11 || (c0032c.f8713d && (TextUtils.isEmpty(a10.f9443A) || a(a10, com.anythink.basead.exoplayer.b.ar)))) {
                        i11 = (objArr != false ? 8 : objArr2 == false ? 6 : 4) + (a11 ? 1 : 0);
                    } else if (objArr == true) {
                        i11 = 3;
                    } else if (objArr2 != false) {
                        if (a(a10, c0032c.f8711b)) {
                            i11 = 2;
                        }
                    }
                    if (a(iArr2[i9], false)) {
                        i11 += 1000;
                    }
                    if (i11 > i4) {
                        aeVar = a9;
                        i = i9;
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

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8 A[LOOP:1: B:20:0x0042->B:28:0x00e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private f[] a(e.a aVar, int[][][] iArr, int[] iArr2, C0032c c0032c) {
        f[] fVarArr;
        boolean z6;
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
                    z6 = z10;
                } else {
                    af b9 = aVar.b(i);
                    int[][] iArr4 = iArr[i];
                    int i4 = iArr2[i];
                    f.a aVar2 = this.f8698d;
                    if (!c0032c.f8721m && aVar2 != null) {
                        int i6 = c0032c.f8723o ? 24 : 16;
                        boolean z11 = c0032c.f8722n && (i4 & i6) != 0;
                        int i9 = 0;
                        while (i9 < b9.f8302b) {
                            ae a11 = b9.a(i9);
                            int[] iArr5 = iArr4[i9];
                            int i10 = c0032c.f8715f;
                            int i11 = c0032c.f8716g;
                            int i12 = c0032c.f8717h;
                            fVarArr = fVarArr2;
                            int i13 = c0032c.f8718j;
                            z6 = z10;
                            int i14 = c0032c.f8719k;
                            boolean z12 = c0032c.f8720l;
                            if (a11.f8298a < 2) {
                                iArr3 = f8696b;
                            } else {
                                List<Integer> a12 = a(a11, i13, i14, z12);
                                if (a12.size() < 2) {
                                    iArr3 = f8696b;
                                } else {
                                    if (z11) {
                                        str = null;
                                    } else {
                                        HashSet hashSet = new HashSet();
                                        int i15 = 0;
                                        int i16 = 0;
                                        String str2 = null;
                                        while (i15 < a12.size()) {
                                            String str3 = a11.a(a12.get(i15).intValue()).f9451h;
                                            List<Integer> list = a12;
                                            if (hashSet.add(str3)) {
                                                aeVar2 = a11;
                                                int a13 = a(aeVar2, iArr5, i6, str3, i10, i11, i12, list);
                                                if (a13 > i16) {
                                                    i16 = a13;
                                                    str2 = str3;
                                                }
                                            } else {
                                                aeVar2 = a11;
                                            }
                                            i15++;
                                            a11 = aeVar2;
                                            a12 = list;
                                        }
                                        str = str2;
                                    }
                                    List<Integer> list2 = a12;
                                    ae aeVar3 = a11;
                                    b(aeVar3, iArr5, i6, str, i10, i11, i12, list2);
                                    aeVar = aeVar3;
                                    a9 = list2.size() < 2 ? f8696b : com.anythink.basead.exoplayer.k.af.a(list2);
                                    if (a9.length <= 0) {
                                        fVar = ((f.a) com.anythink.basead.exoplayer.k.a.a(aVar2)).a(aeVar, a9);
                                        break;
                                    }
                                    i9++;
                                    fVarArr2 = fVarArr;
                                    z10 = z6;
                                }
                            }
                            a9 = iArr3;
                            aeVar = a11;
                            if (a9.length <= 0) {
                            }
                        }
                    }
                    fVarArr = fVarArr2;
                    z6 = z10;
                    fVar = null;
                    if (fVar == null) {
                        fVar = a(b9, iArr4, c0032c);
                    }
                    fVarArr[i] = fVar;
                    z9 = fVar != null;
                }
                z10 = z6 | (aVar.b(i).f8302b > 0);
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
        for (int i17 = 0; i17 < a10; i17++) {
            int a14 = aVar.a(i17);
            if (a14 != 1) {
                if (a14 != 2) {
                    if (a14 != 3) {
                        fVarArr3[i17] = c(aVar.b(i17), iArr[i17], c0032c);
                    } else if (!z15) {
                        f b10 = b(aVar.b(i17), iArr[i17], c0032c);
                        fVarArr3[i17] = b10;
                        z15 = b10 != null;
                    }
                }
            } else if (!z14) {
                f a15 = a(aVar.b(i17), iArr[i17], c0032c, z13 ? null : this.f8698d);
                fVarArr3[i17] = a15;
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
    private static f a(af afVar, int[][] iArr, int i, C0032c c0032c, f.a aVar) {
        f fVar;
        String str;
        boolean z6;
        int[] a9;
        boolean z9;
        int i4;
        if (!c0032c.f8721m && aVar != null) {
            int i6 = c0032c.f8723o ? 24 : 16;
            boolean z10 = c0032c.f8722n && (i & i6) != 0;
            int i9 = 0;
            while (i9 < afVar.f8302b) {
                ae a10 = afVar.a(i9);
                int[] iArr2 = iArr[i9];
                int i10 = c0032c.f8715f;
                int i11 = c0032c.f8716g;
                int i12 = c0032c.f8717h;
                int i13 = c0032c.f8718j;
                int i14 = c0032c.f8719k;
                boolean z11 = c0032c.f8720l;
                if (a10.f8298a < 2) {
                    a9 = f8696b;
                } else {
                    List<Integer> a11 = a(a10, i13, i14, z11);
                    if (a11.size() < 2) {
                        a9 = f8696b;
                    } else {
                        if (z10) {
                            str = null;
                        } else {
                            HashSet hashSet = new HashSet();
                            int i15 = 0;
                            int i16 = 0;
                            String str2 = null;
                            while (i16 < a11.size()) {
                                String str3 = a10.a(a11.get(i16).intValue()).f9451h;
                                if (hashSet.add(str3)) {
                                    i4 = i15;
                                    z9 = z10;
                                    int a12 = a(a10, iArr2, i6, str3, i10, i11, i12, a11);
                                    if (a12 > i4) {
                                        str2 = str3;
                                        i15 = a12;
                                        i16++;
                                        z10 = z9;
                                    }
                                } else {
                                    z9 = z10;
                                    i4 = i15;
                                }
                                i15 = i4;
                                i16++;
                                z10 = z9;
                            }
                            str = str2;
                        }
                        z6 = z10;
                        b(a10, iArr2, i6, str, i10, i11, i12, a11);
                        a9 = a11.size() < 2 ? f8696b : com.anythink.basead.exoplayer.k.af.a(a11);
                        if (a9.length <= 0) {
                            fVar = ((f.a) com.anythink.basead.exoplayer.k.a.a(aVar)).a(a10, a9);
                            break;
                        }
                        i9++;
                        z10 = z6;
                    }
                }
                z6 = z10;
                if (a9.length <= 0) {
                }
            }
        }
        fVar = null;
        return fVar == null ? a(afVar, iArr, c0032c) : fVar;
    }

    private static int[] a(ae aeVar, int[] iArr, boolean z6, int i, int i4, int i6, int i9, int i10, int i11, boolean z9) {
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        int i16;
        int i17;
        int[] iArr2;
        ae aeVar2;
        if (aeVar.f8298a < 2) {
            return f8696b;
        }
        List<Integer> a9 = a(aeVar, i10, i11, z9);
        if (a9.size() < 2) {
            return f8696b;
        }
        if (z6) {
            i12 = i6;
            i13 = i4;
            i14 = i9;
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            int i18 = 0;
            int i19 = 0;
            String str2 = null;
            while (i18 < a9.size()) {
                String str3 = aeVar.a(a9.get(i18).intValue()).f9451h;
                if (hashSet.add(str3)) {
                    int i20 = i9;
                    i17 = i6;
                    i15 = i4;
                    iArr2 = iArr;
                    aeVar2 = aeVar;
                    int a10 = a(aeVar2, iArr2, i, str3, i15, i17, i20, a9);
                    i16 = i20;
                    if (a10 > i19) {
                        i19 = a10;
                        str2 = str3;
                    }
                } else {
                    int i21 = i6;
                    i15 = i4;
                    i16 = i9;
                    i17 = i21;
                    iArr2 = iArr;
                    aeVar2 = aeVar;
                }
                i18++;
                int i22 = i17;
                i9 = i16;
                i4 = i15;
                i6 = i22;
                aeVar = aeVar2;
                iArr = iArr2;
            }
            i12 = i6;
            i13 = i4;
            i14 = i9;
            str = str2;
        }
        b(aeVar, iArr, i, str, i13, i12, i14, a9);
        return a9.size() < 2 ? f8696b : com.anythink.basead.exoplayer.k.af.a(a9);
    }

    private static int a(ae aeVar, int[] iArr, int i, String str, int i4, int i6, int i9, List<Integer> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int intValue = list.get(i11).intValue();
            if (a(aeVar.a(intValue), str, iArr[intValue], i, i4, i6, i9)) {
                i10++;
            }
        }
        return i10;
    }

    private static boolean a(m mVar, String str, int i, int i4, int i6, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        return a(i, false) && (i & i4) != 0 && (str == null || com.anythink.basead.exoplayer.k.af.a((Object) mVar.f9451h, (Object) str)) && (((i11 = mVar.f9455m) == -1 || i11 <= i6) && (((i12 = mVar.f9456n) == -1 || i12 <= i9) && ((i13 = mVar.f9447d) == -1 || i13 <= i10)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        if (b(r2.f9447d, r10) < 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static f a(af afVar, int[][] iArr, C0032c c0032c) {
        int b9;
        int i;
        int i4;
        int i6;
        af afVar2 = afVar;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        ae aeVar = null;
        int i13 = 0;
        int i14 = 0;
        while (i12 < afVar2.f8302b) {
            ae a9 = afVar2.a(i12);
            List<Integer> a10 = a(a9, c0032c.f8718j, c0032c.f8719k, c0032c.f8720l);
            int[] iArr2 = iArr[i12];
            int i15 = 0;
            while (i15 < a9.f8298a) {
                if (a(iArr2[i15], c0032c.f8724p)) {
                    m a11 = a9.a(i15);
                    boolean z6 = true;
                    boolean z9 = a10.contains(Integer.valueOf(i15)) && ((i = a11.f9455m) == i9 || i <= c0032c.f8715f) && (((i4 = a11.f9456n) == i9 || i4 <= c0032c.f8716g) && ((i6 = a11.f9447d) == i9 || i6 <= c0032c.f8717h));
                    if (z9 || c0032c.i) {
                        int i16 = z9 ? 2 : 1;
                        boolean a12 = a(iArr2[i15], false);
                        if (a12) {
                            i16 += 1000;
                        }
                        boolean z10 = i16 > i14;
                        if (i16 == i14) {
                            if (!c0032c.f8721m) {
                                int a13 = a11.a();
                                if (a13 != i10) {
                                    b9 = b(a13, i10);
                                } else {
                                    b9 = b(a11.f9447d, i11);
                                }
                                if (a12) {
                                }
                                z6 = false;
                                z10 = z6;
                            }
                        }
                        if (z10) {
                            i11 = a11.f9447d;
                            i10 = a11.a();
                            aeVar = a9;
                            i13 = i15;
                            i14 = i16;
                        }
                    }
                }
                i15++;
                i9 = -1;
            }
            i12++;
            afVar2 = afVar;
            i9 = -1;
        }
        if (aeVar == null) {
            return null;
        }
        return new com.anythink.basead.exoplayer.i.d(aeVar, i13);
    }

    private static f a(af afVar, int[][] iArr, C0032c c0032c, f.a aVar) {
        int[] iArr2;
        int a9;
        int i = -1;
        int i4 = -1;
        b bVar = null;
        for (int i6 = 0; i6 < afVar.f8302b; i6++) {
            ae a10 = afVar.a(i6);
            int[] iArr3 = iArr[i6];
            for (int i9 = 0; i9 < a10.f8298a; i9++) {
                if (a(iArr3[i9], c0032c.f8724p)) {
                    b bVar2 = new b(a10.a(i9), c0032c, iArr3[i9]);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        i = i6;
                        i4 = i9;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        ae a11 = afVar.a(i);
        if (!c0032c.f8721m && aVar != null) {
            int[] iArr4 = iArr[i];
            boolean z6 = c0032c.f8722n;
            HashSet hashSet = new HashSet();
            a aVar2 = null;
            int i10 = 0;
            for (int i11 = 0; i11 < a11.f8298a; i11++) {
                m a12 = a11.a(i11);
                a aVar3 = new a(a12.f9463u, a12.f9464v, z6 ? null : a12.f9451h);
                if (hashSet.add(aVar3) && (a9 = a(a11, iArr4, aVar3)) > i10) {
                    i10 = a9;
                    aVar2 = aVar3;
                }
            }
            if (i10 > 1) {
                iArr2 = new int[i10];
                int i12 = 0;
                for (int i13 = 0; i13 < a11.f8298a; i13++) {
                    if (a(a11.a(i13), iArr4[i13], (a) com.anythink.basead.exoplayer.k.a.a(aVar2))) {
                        iArr2[i12] = i13;
                        i12++;
                    }
                }
            } else {
                iArr2 = f8696b;
            }
            if (iArr2.length > 0) {
                return aVar.a(a11, iArr2);
            }
        }
        return new com.anythink.basead.exoplayer.i.d(a11, i4);
    }

    private static int[] a(ae aeVar, int[] iArr, boolean z6) {
        int a9;
        HashSet hashSet = new HashSet();
        int i = 0;
        a aVar = null;
        for (int i4 = 0; i4 < aeVar.f8298a; i4++) {
            m a10 = aeVar.a(i4);
            a aVar2 = new a(a10.f9463u, a10.f9464v, z6 ? null : a10.f9451h);
            if (hashSet.add(aVar2) && (a9 = a(aeVar, iArr, aVar2)) > i) {
                i = a9;
                aVar = aVar2;
            }
        }
        if (i > 1) {
            int[] iArr2 = new int[i];
            int i6 = 0;
            for (int i9 = 0; i9 < aeVar.f8298a; i9++) {
                if (a(aeVar.a(i9), iArr[i9], (a) com.anythink.basead.exoplayer.k.a.a(aVar))) {
                    iArr2[i6] = i9;
                    i6++;
                }
            }
            return iArr2;
        }
        return f8696b;
    }

    private static int a(ae aeVar, int[] iArr, a aVar) {
        int i = 0;
        for (int i4 = 0; i4 < aeVar.f8298a; i4++) {
            if (a(aeVar.a(i4), iArr[i4], aVar)) {
                i++;
            }
        }
        return i;
    }

    private static boolean a(m mVar, int i, a aVar) {
        String str;
        return a(i, false) && mVar.f9463u == aVar.f8700a && mVar.f9464v == aVar.f8701b && ((str = aVar.f8702c) == null || TextUtils.equals(str, mVar.f9451h));
    }

    private static void a(e.a aVar, int[][][] iArr, aa[] aaVarArr, f[] fVarArr, int i) {
        boolean z6;
        if (i == 0) {
            return;
        }
        boolean z9 = false;
        int i4 = -1;
        int i6 = -1;
        for (int i9 = 0; i9 < aVar.a(); i9++) {
            int a9 = aVar.a(i9);
            f fVar = fVarArr[i9];
            if ((a9 == 1 || a9 == 2) && fVar != null) {
                int[][] iArr2 = iArr[i9];
                int a10 = aVar.b(i9).a(fVar.f());
                int i10 = 0;
                while (true) {
                    if (i10 < fVar.g()) {
                        if ((iArr2[a10][fVar.b(i10)] & 32) != 32) {
                            break;
                        } else {
                            i10++;
                        }
                    } else if (a9 == 1) {
                        if (i6 != -1) {
                            z6 = false;
                            break;
                        }
                        i6 = i9;
                    } else {
                        if (i4 != -1) {
                            z6 = false;
                            break;
                        }
                        i4 = i9;
                    }
                }
            }
        }
        z6 = true;
        if (i6 != -1 && i4 != -1) {
            z9 = true;
        }
        if (z6 && z9) {
            aa aaVar = new aa(i);
            aaVarArr[i6] = aaVar;
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
        return TextUtils.isEmpty(mVar.f9443A) || a(mVar, com.anythink.basead.exoplayer.b.ar);
    }

    public static boolean a(m mVar, String str) {
        return str != null && TextUtils.equals(str, com.anythink.basead.exoplayer.k.af.b(mVar.f9443A));
    }

    private static List<Integer> a(ae aeVar, int i, int i4, boolean z6) {
        int i6;
        ArrayList arrayList = new ArrayList(aeVar.f8298a);
        for (int i9 = 0; i9 < aeVar.f8298a; i9++) {
            arrayList.add(Integer.valueOf(i9));
        }
        if (i != Integer.MAX_VALUE && i4 != Integer.MAX_VALUE) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < aeVar.f8298a; i11++) {
                m a9 = aeVar.a(i11);
                int i12 = a9.f9455m;
                if (i12 > 0 && (i6 = a9.f9456n) > 0) {
                    Point a10 = a(z6, i, i4, i12, i6);
                    int i13 = a9.f9455m;
                    int i14 = a9.f9456n;
                    int i15 = i13 * i14;
                    if (i13 >= ((int) (a10.x * f8695a)) && i14 >= ((int) (a10.y * f8695a)) && i15 < i10) {
                        i10 = i15;
                    }
                }
            }
            if (i10 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int a11 = aeVar.a(((Integer) arrayList.get(size)).intValue()).a();
                    if (a11 == -1 || a11 > i10) {
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
    private static Point a(boolean z6, int i, int i4, int i6, int i9) {
        if (z6) {
        }
        i4 = i;
        i = i4;
        int i10 = i6 * i;
        int i11 = i9 * i4;
        if (i10 >= i11) {
            return new Point(i4, com.anythink.basead.exoplayer.k.af.a(i11, i6));
        }
        return new Point(com.anythink.basead.exoplayer.k.af.a(i10, i9), i);
    }
}
