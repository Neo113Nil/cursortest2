package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.ads.AdError;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3350i extends C2636Ja {

    /* renamed from: F, reason: collision with root package name */
    public static final C3350i f31750F = new C3350i(new C3296h());

    /* renamed from: A, reason: collision with root package name */
    public final boolean f31751A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f31752B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f31753C;

    /* renamed from: D, reason: collision with root package name */
    public final SparseArray f31754D;

    /* renamed from: E, reason: collision with root package name */
    public final SparseBooleanArray f31755E;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f31756w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f31757x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f31758y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f31759z;

    static {
        String str = AbstractC3182eu.f30782a;
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(1017, 36);
        Integer.toString(1018, 36);
    }

    public C3350i(C3296h c3296h) {
        super(c3296h);
        this.f31756w = c3296h.f31461w;
        this.f31757x = c3296h.f31462x;
        this.f31758y = c3296h.f31463y;
        this.f31759z = c3296h.f31464z;
        this.f31751A = c3296h.f31456A;
        this.f31752B = c3296h.f31457B;
        this.f31753C = c3296h.f31458C;
        this.f31754D = c3296h.f31459D;
        this.f31755E = c3296h.f31460E;
    }

    @Override // com.google.android.gms.internal.ads.C2636Ja
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3350i.class == obj.getClass()) {
            C3350i c3350i = (C3350i) obj;
            if (super.equals(c3350i) && this.f31756w == c3350i.f31756w && this.f31757x == c3350i.f31757x && this.f31758y == c3350i.f31758y && this.f31759z == c3350i.f31759z && this.f31751A == c3350i.f31751A && this.f31752B == c3350i.f31752B && this.f31753C == c3350i.f31753C) {
                SparseBooleanArray sparseBooleanArray = this.f31755E;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = c3350i.f31755E;
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.f31754D;
                            int size2 = sparseArray.size();
                            SparseArray sparseArray2 = c3350i.f31754D;
                            if (sparseArray2.size() == size2) {
                                for (int i4 = 0; i4 < size2; i4++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i4));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i4);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                SQ sq = (SQ) entry.getKey();
                                                if (map2.containsKey(sq) && Objects.equals(entry.getValue(), map2.get(sq))) {
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

    @Override // com.google.android.gms.internal.ads.C2636Ja
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f31756w ? 1 : 0)) * 961) + (this.f31757x ? 1 : 0)) * 961) + (this.f31758y ? 1 : 0)) * 28629151) + (this.f31759z ? 1 : 0)) * 31) + (this.f31751A ? 1 : 0)) * 31) + (this.f31752B ? 1 : 0)) * 961) + (this.f31753C ? 1 : 0)) * 31;
    }
}
