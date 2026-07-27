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
    private static final float f7909a = 0.98f;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f7910b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    private static final int f7911c = 1000;

    /* renamed from: d, reason: collision with root package name */
    private final f.a f7912d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference<C0032c> f7913e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7914a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7915b;

        /* renamed from: c, reason: collision with root package name */
        public final String f7916c;

        public a(int i, int i6, String str) {
            this.f7914a = i;
            this.f7915b = i6;
            this.f7916c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f7914a == aVar.f7914a && this.f7915b == aVar.f7915b && TextUtils.equals(this.f7916c, aVar.f7916c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = ((this.f7914a * 31) + this.f7915b) * 31;
            String str = this.f7916c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        private final C0032c f7917a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7918b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7919c;

        /* renamed from: d, reason: collision with root package name */
        private final int f7920d;

        /* renamed from: e, reason: collision with root package name */
        private final int f7921e;

        /* renamed from: f, reason: collision with root package name */
        private final int f7922f;

        /* renamed from: g, reason: collision with root package name */
        private final int f7923g;

        public b(m mVar, C0032c c0032c, int i) {
            this.f7917a = c0032c;
            this.f7918b = c.a(i, false) ? 1 : 0;
            this.f7919c = c.a(mVar, c0032c.f7925b) ? 1 : 0;
            this.f7920d = (mVar.f8682z & 1) != 0 ? 1 : 0;
            this.f7921e = mVar.f8677u;
            this.f7922f = mVar.f8678v;
            this.f7923g = mVar.f8661d;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b bVar) {
            int i = this.f7918b;
            int i6 = bVar.f7918b;
            if (i != i6) {
                return c.a(i, i6);
            }
            int i9 = this.f7919c;
            int i10 = bVar.f7919c;
            if (i9 != i10) {
                return c.a(i9, i10);
            }
            int i11 = this.f7920d;
            int i12 = bVar.f7920d;
            if (i11 != i12) {
                return c.a(i11, i12);
            }
            if (this.f7917a.f7935m) {
                return c.a(bVar.f7923g, this.f7923g);
            }
            int i13 = i != 1 ? -1 : 1;
            int i14 = this.f7921e;
            int i15 = bVar.f7921e;
            if (i14 != i15) {
                return c.a(i14, i15) * i13;
            }
            int i16 = this.f7922f;
            int i17 = bVar.f7922f;
            return i16 != i17 ? c.a(i16, i17) * i13 : c.a(this.f7923g, bVar.f7923g) * i13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f7918b == bVar.f7918b && this.f7919c == bVar.f7919c && this.f7920d == bVar.f7920d && this.f7921e == bVar.f7921e && this.f7922f == bVar.f7922f && this.f7923g == bVar.f7923g) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (((((((((this.f7918b * 31) + this.f7919c) * 31) + this.f7920d) * 31) + this.f7921e) * 31) + this.f7922f) * 31) + this.f7923g;
        }
    }

    /* renamed from: com.anythink.basead.exoplayer.i.c$c, reason: collision with other inner class name */
    public static final class C0032c implements Parcelable {

        /* renamed from: b, reason: collision with root package name */
        public final String f7925b;

        /* renamed from: c, reason: collision with root package name */
        public final String f7926c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f7927d;

        /* renamed from: e, reason: collision with root package name */
        public final int f7928e;

        /* renamed from: f, reason: collision with root package name */
        public final int f7929f;

        /* renamed from: g, reason: collision with root package name */
        public final int f7930g;

        /* renamed from: h, reason: collision with root package name */
        public final int f7931h;
        public final boolean i;

        /* renamed from: j, reason: collision with root package name */
        public final int f7932j;

        /* renamed from: k, reason: collision with root package name */
        public final int f7933k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f7934l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f7935m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f7936n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f7937o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f7938p;

        /* renamed from: q, reason: collision with root package name */
        public final int f7939q;

        /* renamed from: r, reason: collision with root package name */
        private final SparseArray<Map<af, e>> f7940r;

        /* renamed from: s, reason: collision with root package name */
        private final SparseBooleanArray f7941s;

        /* renamed from: a, reason: collision with root package name */
        public static final C0032c f7924a = new C0032c();
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
                if (this.f7927d == c0032c.f7927d && this.f7928e == c0032c.f7928e && this.f7935m == c0032c.f7935m && this.f7936n == c0032c.f7936n && this.f7937o == c0032c.f7937o && this.f7929f == c0032c.f7929f && this.f7930g == c0032c.f7930g && this.i == c0032c.i && this.f7938p == c0032c.f7938p && this.f7934l == c0032c.f7934l && this.f7932j == c0032c.f7932j && this.f7933k == c0032c.f7933k && this.f7931h == c0032c.f7931h && this.f7939q == c0032c.f7939q && TextUtils.equals(this.f7925b, c0032c.f7925b) && TextUtils.equals(this.f7926c, c0032c.f7926c)) {
                    SparseBooleanArray sparseBooleanArray = this.f7941s;
                    SparseBooleanArray sparseBooleanArray2 = c0032c.f7941s;
                    int size = sparseBooleanArray.size();
                    if (sparseBooleanArray2.size() == size) {
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                SparseArray<Map<af, e>> sparseArray = this.f7940r;
                                SparseArray<Map<af, e>> sparseArray2 = c0032c.f7940r;
                                int size2 = sparseArray.size();
                                if (sparseArray2.size() == size2) {
                                    for (int i6 = 0; i6 < size2; i6++) {
                                        int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i6));
                                        if (indexOfKey >= 0) {
                                            Map<af, e> valueAt = sparseArray.valueAt(i6);
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
            int i = (((((((((((((((((((((((((((this.f7927d ? 1 : 0) * 31) + this.f7928e) * 31) + (this.f7935m ? 1 : 0)) * 31) + (this.f7936n ? 1 : 0)) * 31) + (this.f7937o ? 1 : 0)) * 31) + this.f7929f) * 31) + this.f7930g) * 31) + (this.i ? 1 : 0)) * 31) + (this.f7938p ? 1 : 0)) * 31) + (this.f7934l ? 1 : 0)) * 31) + this.f7932j) * 31) + this.f7933k) * 31) + this.f7931h) * 31) + this.f7939q) * 31;
            String str = this.f7925b;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f7926c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            SparseArray<Map<af, e>> sparseArray = this.f7940r;
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i6 = 0; i6 < size; i6++) {
                int keyAt = sparseArray.keyAt(i6);
                Map<af, e> valueAt = sparseArray.valueAt(i6);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<af, e> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
            parcel.writeSparseBooleanArray(this.f7941s);
            parcel.writeString(this.f7925b);
            parcel.writeString(this.f7926c);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f7927d);
            parcel.writeInt(this.f7928e);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f7935m);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f7936n);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f7937o);
            parcel.writeInt(this.f7929f);
            parcel.writeInt(this.f7930g);
            parcel.writeInt(this.f7931h);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.i);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f7938p);
            parcel.writeInt(this.f7932j);
            parcel.writeInt(this.f7933k);
            com.anythink.basead.exoplayer.k.af.a(parcel, this.f7934l);
            parcel.writeInt(this.f7939q);
        }

        public C0032c(SparseArray<Map<af, e>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z3, int i, boolean z6, boolean z9, boolean z10, int i6, int i9, int i10, boolean z11, boolean z12, int i11, int i12, boolean z13, int i13) {
            this.f7940r = sparseArray;
            this.f7941s = sparseBooleanArray;
            this.f7925b = com.anythink.basead.exoplayer.k.af.b(str);
            this.f7926c = com.anythink.basead.exoplayer.k.af.b(str2);
            this.f7927d = z3;
            this.f7928e = i;
            this.f7935m = z6;
            this.f7936n = z9;
            this.f7937o = z10;
            this.f7929f = i6;
            this.f7930g = i9;
            this.f7931h = i10;
            this.i = z11;
            this.f7938p = z12;
            this.f7932j = i11;
            this.f7933k = i12;
            this.f7934l = z13;
            this.f7939q = i13;
        }

        public final boolean a(int i) {
            return this.f7941s.get(i);
        }

        public final e b(int i, af afVar) {
            Map<af, e> map = this.f7940r.get(i);
            if (map != null) {
                return map.get(afVar);
            }
            return null;
        }

        public final boolean a(int i, af afVar) {
            Map<af, e> map = this.f7940r.get(i);
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
                for (int i6 = 0; i6 < readInt3; i6++) {
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
            this.f7940r = a(parcel);
            this.f7941s = parcel.readSparseBooleanArray();
            this.f7925b = parcel.readString();
            this.f7926c = parcel.readString();
            this.f7927d = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f7928e = parcel.readInt();
            this.f7935m = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f7936n = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f7937o = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f7929f = parcel.readInt();
            this.f7930g = parcel.readInt();
            this.f7931h = parcel.readInt();
            this.i = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f7938p = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f7932j = parcel.readInt();
            this.f7933k = parcel.readInt();
            this.f7934l = com.anythink.basead.exoplayer.k.af.a(parcel);
            this.f7939q = parcel.readInt();
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
        private final SparseArray<Map<af, e>> f7942a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseBooleanArray f7943b;

        /* renamed from: c, reason: collision with root package name */
        private String f7944c;

        /* renamed from: d, reason: collision with root package name */
        private String f7945d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f7946e;

        /* renamed from: f, reason: collision with root package name */
        private int f7947f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f7948g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f7949h;
        private boolean i;

        /* renamed from: j, reason: collision with root package name */
        private int f7950j;

        /* renamed from: k, reason: collision with root package name */
        private int f7951k;

        /* renamed from: l, reason: collision with root package name */
        private int f7952l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f7953m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f7954n;

        /* renamed from: o, reason: collision with root package name */
        private int f7955o;

        /* renamed from: p, reason: collision with root package name */
        private int f7956p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f7957q;

        /* renamed from: r, reason: collision with root package name */
        private int f7958r;

        public /* synthetic */ d(C0032c c0032c, byte b9) {
            this(c0032c);
        }

        private d a(String str) {
            this.f7944c = str;
            return this;
        }

        private d b(String str) {
            this.f7945d = str;
            return this;
        }

        private d c(int i) {
            this.f7947f = i;
            return this;
        }

        private d d(boolean z3) {
            this.i = z3;
            return this;
        }

        private d e(boolean z3) {
            this.f7953m = z3;
            return this;
        }

        private d f(boolean z3) {
            this.f7954n = z3;
            return this;
        }

        public d() {
            this(C0032c.f7924a);
        }

        private d a(boolean z3) {
            this.f7946e = z3;
            return this;
        }

        private d b(boolean z3) {
            this.f7948g = z3;
            return this;
        }

        private d c(boolean z3) {
            this.f7949h = z3;
            return this;
        }

        private d d() {
            return a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        private d e() {
            return a(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        private d(C0032c c0032c) {
            this.f7942a = a((SparseArray<Map<af, e>>) c0032c.f7940r);
            this.f7943b = c0032c.f7941s.clone();
            this.f7944c = c0032c.f7925b;
            this.f7945d = c0032c.f7926c;
            this.f7946e = c0032c.f7927d;
            this.f7947f = c0032c.f7928e;
            this.f7948g = c0032c.f7935m;
            this.f7949h = c0032c.f7936n;
            this.i = c0032c.f7937o;
            this.f7950j = c0032c.f7929f;
            this.f7951k = c0032c.f7930g;
            this.f7952l = c0032c.f7931h;
            this.f7953m = c0032c.i;
            this.f7954n = c0032c.f7938p;
            this.f7955o = c0032c.f7932j;
            this.f7956p = c0032c.f7933k;
            this.f7957q = c0032c.f7934l;
            this.f7958r = c0032c.f7939q;
        }

        private d a(int i, int i6) {
            this.f7950j = i;
            this.f7951k = i6;
            return this;
        }

        private d c() {
            return a(1279, 719);
        }

        private d d(int i) {
            this.f7952l = i;
            return this;
        }

        public final d b(int i) {
            if (this.f7958r != i) {
                this.f7958r = i;
            }
            return this;
        }

        private d a(Context context, boolean z3) {
            Point a9 = com.anythink.basead.exoplayer.k.af.a(context);
            return a(a9.x, a9.y, z3);
        }

        public final C0032c b() {
            return new C0032c(this.f7942a, this.f7943b, this.f7944c, this.f7945d, this.f7946e, this.f7947f, this.f7948g, this.f7949h, this.i, this.f7950j, this.f7951k, this.f7952l, this.f7953m, this.f7954n, this.f7955o, this.f7956p, this.f7957q, this.f7958r);
        }

        private d a(int i, int i6, boolean z3) {
            this.f7955o = i;
            this.f7956p = i6;
            this.f7957q = z3;
            return this;
        }

        public final d a(int i, boolean z3) {
            if (this.f7943b.get(i) == z3) {
                return this;
            }
            if (z3) {
                this.f7943b.put(i, true);
                return this;
            }
            this.f7943b.delete(i);
            return this;
        }

        public final d a(int i, af afVar, e eVar) {
            Map<af, e> map = this.f7942a.get(i);
            if (map == null) {
                map = new HashMap<>();
                this.f7942a.put(i, map);
            }
            if (map.containsKey(afVar) && com.anythink.basead.exoplayer.k.af.a(map.get(afVar), eVar)) {
                return this;
            }
            map.put(afVar, eVar);
            return this;
        }

        public final d a(int i, af afVar) {
            Map<af, e> map = this.f7942a.get(i);
            if (map != null && map.containsKey(afVar)) {
                map.remove(afVar);
                if (map.isEmpty()) {
                    this.f7942a.remove(i);
                }
            }
            return this;
        }

        public final d a(int i) {
            Map<af, e> map = this.f7942a.get(i);
            if (map != null && !map.isEmpty()) {
                this.f7942a.remove(i);
            }
            return this;
        }

        public final d a() {
            if (this.f7942a.size() == 0) {
                return this;
            }
            this.f7942a.clear();
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

    public static /* synthetic */ int a(int i, int i6) {
        if (i > i6) {
            return 1;
        }
        return i6 > i ? -1 : 0;
    }

    private static int b(int i, int i6) {
        if (i == -1) {
            return i6 == -1 ? 0 : -1;
        }
        if (i6 == -1) {
            return 1;
        }
        return i - i6;
    }

    private static int c(int i, int i6) {
        if (i > i6) {
            return 1;
        }
        return i6 > i ? -1 : 0;
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

    public static boolean a(int i, boolean z3) {
        int i6 = i & 7;
        if (i6 != 4) {
            return z3 && i6 == 3;
        }
        return true;
    }

    @Deprecated
    private void b(int i, boolean z3) {
        a(d().a(i, z3));
    }

    private C0032c c() {
        return this.f7913e.get();
    }

    private c(f.a aVar) {
        this.f7912d = aVar;
        this.f7913e = new AtomicReference<>(C0032c.f7924a);
    }

    private void a(C0032c c0032c) {
        com.anythink.basead.exoplayer.k.a.a(c0032c);
        if (this.f7913e.getAndSet(c0032c).equals(c0032c)) {
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
        public final int f7959a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f7960b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7961c;

        private e(int i, int... iArr) {
            this.f7959a = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f7960b = copyOf;
            this.f7961c = iArr.length;
            Arrays.sort(copyOf);
        }

        private boolean a(int i) {
            for (int i6 : this.f7960b) {
                if (i6 == i) {
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
                if (this.f7959a == eVar.f7959a && Arrays.equals(this.f7960b, eVar.f7960b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f7960b) + (this.f7959a * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7959a);
            parcel.writeInt(this.f7960b.length);
            parcel.writeIntArray(this.f7960b);
        }

        public e(Parcel parcel) {
            this.f7959a = parcel.readInt();
            int readByte = parcel.readByte();
            this.f7961c = readByte;
            int[] iArr = new int[readByte];
            this.f7960b = iArr;
            parcel.readIntArray(iArr);
        }
    }

    private static f b(af afVar, int[][] iArr, int i, C0032c c0032c, f.a aVar) {
        int[] a9;
        int i6;
        af afVar2 = afVar;
        int i9 = c0032c.f7937o ? 24 : 16;
        boolean z3 = c0032c.f7936n && (i & i9) != 0;
        int i10 = 0;
        while (i10 < afVar2.f7516b) {
            ae a10 = afVar2.a(i10);
            String str = null;
            int[] iArr2 = iArr[i10];
            int i11 = c0032c.f7929f;
            int i12 = c0032c.f7930g;
            int i13 = c0032c.f7931h;
            int i14 = c0032c.f7932j;
            int i15 = c0032c.f7933k;
            boolean z6 = c0032c.f7934l;
            if (a10.f7512a < 2) {
                a9 = f7910b;
            } else {
                List<Integer> a11 = a(a10, i14, i15, z6);
                if (a11.size() < 2) {
                    a9 = f7910b;
                } else {
                    if (!z3) {
                        HashSet hashSet = new HashSet();
                        String str2 = null;
                        int i16 = 0;
                        for (int i17 = 0; i17 < a11.size(); i17++) {
                            String str3 = a10.a(a11.get(i17).intValue()).f8665h;
                            if (hashSet.add(str3)) {
                                i6 = i16;
                                int a12 = a(a10, iArr2, i9, str3, i11, i12, i13, a11);
                                if (a12 > i6) {
                                    str2 = str3;
                                    i16 = a12;
                                }
                            } else {
                                i6 = i16;
                            }
                            i16 = i6;
                        }
                        str = str2;
                    }
                    b(a10, iArr2, i9, str, i11, i12, i13, a11);
                    a9 = a11.size() < 2 ? f7910b : com.anythink.basead.exoplayer.k.af.a(a11);
                }
            }
            if (a9.length > 0) {
                return ((f.a) com.anythink.basead.exoplayer.k.a.a(aVar)).a(a10, a9);
            }
            i10++;
            afVar2 = afVar;
        }
        return null;
    }

    private static f c(af afVar, int[][] iArr, C0032c c0032c) {
        ae aeVar = null;
        int i = 0;
        int i6 = 0;
        for (int i9 = 0; i9 < afVar.f7516b; i9++) {
            ae a9 = afVar.a(i9);
            int[] iArr2 = iArr[i9];
            for (int i10 = 0; i10 < a9.f7512a; i10++) {
                if (a(iArr2[i10], c0032c.f7938p)) {
                    int i11 = (a9.a(i10).f8682z & 1) != 0 ? 2 : 1;
                    if (a(iArr2[i10], false)) {
                        i11 += 1000;
                    }
                    if (i11 > i6) {
                        aeVar = a9;
                        i = i10;
                        i6 = i11;
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
        if (this.f7913e.getAndSet(b9).equals(b9)) {
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
        boolean z3;
        boolean z6;
        f fVar;
        String str;
        ae aeVar;
        int[] a9;
        ae aeVar2;
        int[] iArr3;
        C0032c c0032c = this.f7913e.get();
        int a10 = aVar.a();
        int a11 = aVar.a();
        f[] fVarArr = new f[a11];
        boolean z9 = false;
        boolean z10 = false;
        for (int i = 0; i < a11; i++) {
            if (2 == aVar.a(i)) {
                if (z9) {
                    z3 = z10;
                    z6 = false;
                } else {
                    af b9 = aVar.b(i);
                    int[][] iArr4 = iArr[i];
                    int i6 = iArr2[i];
                    z6 = false;
                    f.a aVar2 = this.f7912d;
                    if (!c0032c.f7935m && aVar2 != null) {
                        int i9 = c0032c.f7937o ? 24 : 16;
                        boolean z11 = c0032c.f7936n && (i6 & i9) != 0;
                        int i10 = 0;
                        while (i10 < b9.f7516b) {
                            ae a12 = b9.a(i10);
                            int[] iArr5 = iArr4[i10];
                            int i11 = c0032c.f7929f;
                            f.a aVar3 = aVar2;
                            int i12 = c0032c.f7930g;
                            int i13 = c0032c.f7931h;
                            int i14 = c0032c.f7932j;
                            z3 = z10;
                            int i15 = c0032c.f7933k;
                            boolean z12 = c0032c.f7934l;
                            boolean z13 = z11;
                            int i16 = i10;
                            if (a12.f7512a < 2) {
                                iArr3 = f7910b;
                            } else {
                                List<Integer> a13 = a(a12, i14, i15, z12);
                                if (a13.size() < 2) {
                                    iArr3 = f7910b;
                                } else {
                                    if (z13) {
                                        str = null;
                                    } else {
                                        HashSet hashSet = new HashSet();
                                        int i17 = 0;
                                        int i18 = 0;
                                        String str2 = null;
                                        while (i17 < a13.size()) {
                                            String str3 = a12.a(a13.get(i17).intValue()).f8665h;
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
                                    a9 = list2.size() < 2 ? f7910b : com.anythink.basead.exoplayer.k.af.a(list2);
                                    if (a9.length <= 0) {
                                        fVar = ((f.a) com.anythink.basead.exoplayer.k.a.a(aVar3)).a(aeVar, a9);
                                        break;
                                    }
                                    i10 = i16 + 1;
                                    aVar2 = aVar3;
                                    z10 = z3;
                                    z11 = z13;
                                }
                            }
                            a9 = iArr3;
                            aeVar = a12;
                            if (a9.length <= 0) {
                            }
                        }
                    }
                    z3 = z10;
                    fVar = null;
                    if (fVar == null) {
                        fVar = a(b9, iArr4, c0032c);
                    }
                    fVarArr[i] = fVar;
                    z9 = fVar != null;
                }
                z10 = z3 | (aVar.b(i).f7516b > 0 ? true : z6);
            }
        }
        boolean z14 = z10;
        boolean z15 = false;
        boolean z16 = false;
        for (int i19 = 0; i19 < a11; i19++) {
            int a15 = aVar.a(i19);
            if (a15 != 1) {
                if (a15 != 2) {
                    if (a15 != 3) {
                        fVarArr[i19] = c(aVar.b(i19), iArr[i19], c0032c);
                    } else if (!z16) {
                        f b10 = b(aVar.b(i19), iArr[i19], c0032c);
                        fVarArr[i19] = b10;
                        z16 = b10 != null;
                    }
                }
            } else if (!z15) {
                f a16 = a(aVar.b(i19), iArr[i19], c0032c, z14 ? null : this.f7912d);
                fVarArr[i19] = a16;
                z15 = a16 != null;
            }
        }
        for (int i20 = 0; i20 < a10; i20++) {
            if (c0032c.a(i20)) {
                fVarArr[i20] = null;
            } else {
                af b11 = aVar.b(i20);
                if (c0032c.a(i20, b11)) {
                    e b12 = c0032c.b(i20, b11);
                    if (b12 == null) {
                        fVarArr[i20] = null;
                    } else {
                        if (b12.f7961c == 1) {
                            fVarArr[i20] = new com.anythink.basead.exoplayer.i.d(b11.a(b12.f7959a), b12.f7960b[0]);
                        } else {
                            fVarArr[i20] = ((f.a) com.anythink.basead.exoplayer.k.a.a(this.f7912d)).a(b11.a(b12.f7959a), b12.f7960b);
                        }
                    }
                }
            }
        }
        aa[] aaVarArr = new aa[a10];
        for (int i21 = 0; i21 < a10; i21++) {
            aaVarArr[i21] = (c0032c.a(i21) || (aVar.a(i21) != 5 && fVarArr[i21] == null)) ? null : aa.f6309a;
        }
        a(aVar, iArr, aaVarArr, fVarArr, c0032c.f7939q);
        return Pair.create(aaVarArr, fVarArr);
    }

    private static void b(ae aeVar, int[] iArr, int i, String str, int i6, int i9, int i10, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!a(aeVar.a(intValue), str, iArr[intValue], i, i6, i9, i10)) {
                list.remove(size);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static f b(af afVar, int[][] iArr, C0032c c0032c) {
        int i = 0;
        int i6 = 0;
        ae aeVar = null;
        for (int i9 = 0; i9 < afVar.f7516b; i9++) {
            ae a9 = afVar.a(i9);
            int[] iArr2 = iArr[i9];
            for (int i10 = 0; i10 < a9.f7512a; i10++) {
                if (a(iArr2[i10], c0032c.f7938p)) {
                    m a10 = a9.a(i10);
                    int i11 = a10.f8682z & (~c0032c.f7928e);
                    int i12 = 1;
                    Object[] objArr = (i11 & 1) != 0;
                    Object[] objArr2 = (i11 & 2) != 0;
                    boolean a11 = a(a10, c0032c.f7926c);
                    if (a11 || (c0032c.f7927d && (TextUtils.isEmpty(a10.f8657A) || a(a10, com.anythink.basead.exoplayer.b.ar)))) {
                        i12 = (objArr != false ? 8 : objArr2 == false ? 6 : 4) + (a11 ? 1 : 0);
                    } else if (objArr == true) {
                        i12 = 3;
                    } else if (objArr2 != false) {
                        if (a(a10, c0032c.f7925b)) {
                            i12 = 2;
                        }
                    }
                    if (a(iArr2[i10], false)) {
                        i12 += 1000;
                    }
                    if (i12 > i6) {
                        aeVar = a9;
                        i = i10;
                        i6 = i12;
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
        boolean z3;
        f fVar;
        String str;
        ae aeVar;
        int[] a9;
        ae aeVar2;
        int[] iArr3;
        int a10 = aVar.a();
        f[] fVarArr2 = new f[a10];
        int i = 0;
        boolean z6 = false;
        boolean z9 = false;
        while (i < a10) {
            if (2 == aVar.a(i)) {
                if (z6) {
                    fVarArr = fVarArr2;
                    z3 = z9;
                } else {
                    af b9 = aVar.b(i);
                    int[][] iArr4 = iArr[i];
                    int i6 = iArr2[i];
                    f.a aVar2 = this.f7912d;
                    if (!c0032c.f7935m && aVar2 != null) {
                        int i9 = c0032c.f7937o ? 24 : 16;
                        boolean z10 = c0032c.f7936n && (i6 & i9) != 0;
                        int i10 = 0;
                        while (i10 < b9.f7516b) {
                            ae a11 = b9.a(i10);
                            int[] iArr5 = iArr4[i10];
                            int i11 = c0032c.f7929f;
                            int i12 = c0032c.f7930g;
                            int i13 = c0032c.f7931h;
                            fVarArr = fVarArr2;
                            int i14 = c0032c.f7932j;
                            z3 = z9;
                            int i15 = c0032c.f7933k;
                            boolean z11 = c0032c.f7934l;
                            if (a11.f7512a < 2) {
                                iArr3 = f7910b;
                            } else {
                                List<Integer> a12 = a(a11, i14, i15, z11);
                                if (a12.size() < 2) {
                                    iArr3 = f7910b;
                                } else {
                                    if (z10) {
                                        str = null;
                                    } else {
                                        HashSet hashSet = new HashSet();
                                        int i16 = 0;
                                        int i17 = 0;
                                        String str2 = null;
                                        while (i16 < a12.size()) {
                                            String str3 = a11.a(a12.get(i16).intValue()).f8665h;
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
                                    a9 = list2.size() < 2 ? f7910b : com.anythink.basead.exoplayer.k.af.a(list2);
                                    if (a9.length <= 0) {
                                        fVar = ((f.a) com.anythink.basead.exoplayer.k.a.a(aVar2)).a(aeVar, a9);
                                        break;
                                    }
                                    i10++;
                                    fVarArr2 = fVarArr;
                                    z9 = z3;
                                }
                            }
                            a9 = iArr3;
                            aeVar = a11;
                            if (a9.length <= 0) {
                            }
                        }
                    }
                    fVarArr = fVarArr2;
                    z3 = z9;
                    fVar = null;
                    if (fVar == null) {
                        fVar = a(b9, iArr4, c0032c);
                    }
                    fVarArr[i] = fVar;
                    z6 = fVar != null;
                }
                z9 = z3 | (aVar.b(i).f7516b > 0);
            } else {
                fVarArr = fVarArr2;
            }
            i++;
            fVarArr2 = fVarArr;
        }
        f[] fVarArr3 = fVarArr2;
        boolean z12 = z9;
        boolean z13 = false;
        boolean z14 = false;
        for (int i18 = 0; i18 < a10; i18++) {
            int a14 = aVar.a(i18);
            if (a14 != 1) {
                if (a14 != 2) {
                    if (a14 != 3) {
                        fVarArr3[i18] = c(aVar.b(i18), iArr[i18], c0032c);
                    } else if (!z14) {
                        f b10 = b(aVar.b(i18), iArr[i18], c0032c);
                        fVarArr3[i18] = b10;
                        z14 = b10 != null;
                    }
                }
            } else if (!z13) {
                f a15 = a(aVar.b(i18), iArr[i18], c0032c, z12 ? null : this.f7912d);
                fVarArr3[i18] = a15;
                z13 = a15 != null;
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
        boolean z3;
        int[] a9;
        boolean z6;
        int i6;
        if (!c0032c.f7935m && aVar != null) {
            int i9 = c0032c.f7937o ? 24 : 16;
            boolean z9 = c0032c.f7936n && (i & i9) != 0;
            int i10 = 0;
            while (i10 < afVar.f7516b) {
                ae a10 = afVar.a(i10);
                int[] iArr2 = iArr[i10];
                int i11 = c0032c.f7929f;
                int i12 = c0032c.f7930g;
                int i13 = c0032c.f7931h;
                int i14 = c0032c.f7932j;
                int i15 = c0032c.f7933k;
                boolean z10 = c0032c.f7934l;
                if (a10.f7512a < 2) {
                    a9 = f7910b;
                } else {
                    List<Integer> a11 = a(a10, i14, i15, z10);
                    if (a11.size() < 2) {
                        a9 = f7910b;
                    } else {
                        if (z9) {
                            str = null;
                        } else {
                            HashSet hashSet = new HashSet();
                            int i16 = 0;
                            int i17 = 0;
                            String str2 = null;
                            while (i17 < a11.size()) {
                                String str3 = a10.a(a11.get(i17).intValue()).f8665h;
                                if (hashSet.add(str3)) {
                                    i6 = i16;
                                    z6 = z9;
                                    int a12 = a(a10, iArr2, i9, str3, i11, i12, i13, a11);
                                    if (a12 > i6) {
                                        str2 = str3;
                                        i16 = a12;
                                        i17++;
                                        z9 = z6;
                                    }
                                } else {
                                    z6 = z9;
                                    i6 = i16;
                                }
                                i16 = i6;
                                i17++;
                                z9 = z6;
                            }
                            str = str2;
                        }
                        z3 = z9;
                        b(a10, iArr2, i9, str, i11, i12, i13, a11);
                        a9 = a11.size() < 2 ? f7910b : com.anythink.basead.exoplayer.k.af.a(a11);
                        if (a9.length <= 0) {
                            fVar = ((f.a) com.anythink.basead.exoplayer.k.a.a(aVar)).a(a10, a9);
                            break;
                        }
                        i10++;
                        z9 = z3;
                    }
                }
                z3 = z9;
                if (a9.length <= 0) {
                }
            }
        }
        fVar = null;
        return fVar == null ? a(afVar, iArr, c0032c) : fVar;
    }

    private static int[] a(ae aeVar, int[] iArr, boolean z3, int i, int i6, int i9, int i10, int i11, int i12, boolean z6) {
        int i13;
        int i14;
        int i15;
        String str;
        int i16;
        int i17;
        int i18;
        int[] iArr2;
        ae aeVar2;
        if (aeVar.f7512a < 2) {
            return f7910b;
        }
        List<Integer> a9 = a(aeVar, i11, i12, z6);
        if (a9.size() < 2) {
            return f7910b;
        }
        if (z3) {
            i13 = i9;
            i14 = i6;
            i15 = i10;
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            int i19 = 0;
            int i20 = 0;
            String str2 = null;
            while (i19 < a9.size()) {
                String str3 = aeVar.a(a9.get(i19).intValue()).f8665h;
                if (hashSet.add(str3)) {
                    int i21 = i10;
                    i18 = i9;
                    i16 = i6;
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
                    i16 = i6;
                    i17 = i10;
                    i18 = i22;
                    iArr2 = iArr;
                    aeVar2 = aeVar;
                }
                i19++;
                int i23 = i18;
                i10 = i17;
                i6 = i16;
                i9 = i23;
                aeVar = aeVar2;
                iArr = iArr2;
            }
            i13 = i9;
            i14 = i6;
            i15 = i10;
            str = str2;
        }
        b(aeVar, iArr, i, str, i14, i13, i15, a9);
        return a9.size() < 2 ? f7910b : com.anythink.basead.exoplayer.k.af.a(a9);
    }

    private static int a(ae aeVar, int[] iArr, int i, String str, int i6, int i9, int i10, List<Integer> list) {
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int intValue = list.get(i12).intValue();
            if (a(aeVar.a(intValue), str, iArr[intValue], i, i6, i9, i10)) {
                i11++;
            }
        }
        return i11;
    }

    private static boolean a(m mVar, String str, int i, int i6, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        return a(i, false) && (i & i6) != 0 && (str == null || com.anythink.basead.exoplayer.k.af.a((Object) mVar.f8665h, (Object) str)) && (((i12 = mVar.f8669m) == -1 || i12 <= i9) && (((i13 = mVar.f8670n) == -1 || i13 <= i10) && ((i14 = mVar.f8661d) == -1 || i14 <= i11)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        if (b(r2.f8661d, r10) < 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static f a(af afVar, int[][] iArr, C0032c c0032c) {
        int b9;
        int i;
        int i6;
        int i9;
        af afVar2 = afVar;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        ae aeVar = null;
        int i14 = 0;
        int i15 = 0;
        while (i13 < afVar2.f7516b) {
            ae a9 = afVar2.a(i13);
            List<Integer> a10 = a(a9, c0032c.f7932j, c0032c.f7933k, c0032c.f7934l);
            int[] iArr2 = iArr[i13];
            int i16 = 0;
            while (i16 < a9.f7512a) {
                if (a(iArr2[i16], c0032c.f7938p)) {
                    m a11 = a9.a(i16);
                    boolean z3 = true;
                    boolean z6 = a10.contains(Integer.valueOf(i16)) && ((i = a11.f8669m) == i10 || i <= c0032c.f7929f) && (((i6 = a11.f8670n) == i10 || i6 <= c0032c.f7930g) && ((i9 = a11.f8661d) == i10 || i9 <= c0032c.f7931h));
                    if (z6 || c0032c.i) {
                        int i17 = z6 ? 2 : 1;
                        boolean a12 = a(iArr2[i16], false);
                        if (a12) {
                            i17 += 1000;
                        }
                        boolean z9 = i17 > i15;
                        if (i17 == i15) {
                            if (!c0032c.f7935m) {
                                int a13 = a11.a();
                                if (a13 != i11) {
                                    b9 = b(a13, i11);
                                } else {
                                    b9 = b(a11.f8661d, i12);
                                }
                                if (a12) {
                                }
                                z3 = false;
                                z9 = z3;
                            }
                        }
                        if (z9) {
                            i12 = a11.f8661d;
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

    private static f a(af afVar, int[][] iArr, C0032c c0032c, f.a aVar) {
        int[] iArr2;
        int a9;
        int i = -1;
        int i6 = -1;
        b bVar = null;
        for (int i9 = 0; i9 < afVar.f7516b; i9++) {
            ae a10 = afVar.a(i9);
            int[] iArr3 = iArr[i9];
            for (int i10 = 0; i10 < a10.f7512a; i10++) {
                if (a(iArr3[i10], c0032c.f7938p)) {
                    b bVar2 = new b(a10.a(i10), c0032c, iArr3[i10]);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        i = i9;
                        i6 = i10;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        ae a11 = afVar.a(i);
        if (!c0032c.f7935m && aVar != null) {
            int[] iArr4 = iArr[i];
            boolean z3 = c0032c.f7936n;
            HashSet hashSet = new HashSet();
            a aVar2 = null;
            int i11 = 0;
            for (int i12 = 0; i12 < a11.f7512a; i12++) {
                m a12 = a11.a(i12);
                a aVar3 = new a(a12.f8677u, a12.f8678v, z3 ? null : a12.f8665h);
                if (hashSet.add(aVar3) && (a9 = a(a11, iArr4, aVar3)) > i11) {
                    i11 = a9;
                    aVar2 = aVar3;
                }
            }
            if (i11 > 1) {
                iArr2 = new int[i11];
                int i13 = 0;
                for (int i14 = 0; i14 < a11.f7512a; i14++) {
                    if (a(a11.a(i14), iArr4[i14], (a) com.anythink.basead.exoplayer.k.a.a(aVar2))) {
                        iArr2[i13] = i14;
                        i13++;
                    }
                }
            } else {
                iArr2 = f7910b;
            }
            if (iArr2.length > 0) {
                return aVar.a(a11, iArr2);
            }
        }
        return new com.anythink.basead.exoplayer.i.d(a11, i6);
    }

    private static int[] a(ae aeVar, int[] iArr, boolean z3) {
        int a9;
        HashSet hashSet = new HashSet();
        int i = 0;
        a aVar = null;
        for (int i6 = 0; i6 < aeVar.f7512a; i6++) {
            m a10 = aeVar.a(i6);
            a aVar2 = new a(a10.f8677u, a10.f8678v, z3 ? null : a10.f8665h);
            if (hashSet.add(aVar2) && (a9 = a(aeVar, iArr, aVar2)) > i) {
                i = a9;
                aVar = aVar2;
            }
        }
        if (i > 1) {
            int[] iArr2 = new int[i];
            int i9 = 0;
            for (int i10 = 0; i10 < aeVar.f7512a; i10++) {
                if (a(aeVar.a(i10), iArr[i10], (a) com.anythink.basead.exoplayer.k.a.a(aVar))) {
                    iArr2[i9] = i10;
                    i9++;
                }
            }
            return iArr2;
        }
        return f7910b;
    }

    private static int a(ae aeVar, int[] iArr, a aVar) {
        int i = 0;
        for (int i6 = 0; i6 < aeVar.f7512a; i6++) {
            if (a(aeVar.a(i6), iArr[i6], aVar)) {
                i++;
            }
        }
        return i;
    }

    private static boolean a(m mVar, int i, a aVar) {
        String str;
        return a(i, false) && mVar.f8677u == aVar.f7914a && mVar.f8678v == aVar.f7915b && ((str = aVar.f7916c) == null || TextUtils.equals(str, mVar.f8665h));
    }

    private static void a(e.a aVar, int[][][] iArr, aa[] aaVarArr, f[] fVarArr, int i) {
        boolean z3;
        if (i == 0) {
            return;
        }
        boolean z6 = false;
        int i6 = -1;
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
                            z3 = false;
                            break;
                        }
                        i9 = i10;
                    } else {
                        if (i6 != -1) {
                            z3 = false;
                            break;
                        }
                        i6 = i10;
                    }
                }
            }
        }
        z3 = true;
        if (i9 != -1 && i6 != -1) {
            z6 = true;
        }
        if (z3 && z6) {
            aa aaVar = new aa(i);
            aaVarArr[i9] = aaVar;
            aaVarArr[i6] = aaVar;
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
        return TextUtils.isEmpty(mVar.f8657A) || a(mVar, com.anythink.basead.exoplayer.b.ar);
    }

    public static boolean a(m mVar, String str) {
        return str != null && TextUtils.equals(str, com.anythink.basead.exoplayer.k.af.b(mVar.f8657A));
    }

    private static List<Integer> a(ae aeVar, int i, int i6, boolean z3) {
        int i9;
        ArrayList arrayList = new ArrayList(aeVar.f7512a);
        for (int i10 = 0; i10 < aeVar.f7512a; i10++) {
            arrayList.add(Integer.valueOf(i10));
        }
        if (i != Integer.MAX_VALUE && i6 != Integer.MAX_VALUE) {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < aeVar.f7512a; i12++) {
                m a9 = aeVar.a(i12);
                int i13 = a9.f8669m;
                if (i13 > 0 && (i9 = a9.f8670n) > 0) {
                    Point a10 = a(z3, i, i6, i13, i9);
                    int i14 = a9.f8669m;
                    int i15 = a9.f8670n;
                    int i16 = i14 * i15;
                    if (i14 >= ((int) (a10.x * f7909a)) && i15 >= ((int) (a10.y * f7909a)) && i16 < i11) {
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
    private static Point a(boolean z3, int i, int i6, int i9, int i10) {
        if (z3) {
        }
        i6 = i;
        i = i6;
        int i11 = i9 * i;
        int i12 = i10 * i6;
        if (i11 >= i12) {
            return new Point(i6, com.anythink.basead.exoplayer.k.af.a(i12, i9));
        }
        return new Point(com.anythink.basead.exoplayer.k.af.a(i11, i10), i);
    }
}
