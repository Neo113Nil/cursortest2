package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.ads.AdError;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3327i extends C2616Ja {

    /* renamed from: F, reason: collision with root package name */
    public static final C3327i f30977F = new C3327i(new C3273h());

    /* renamed from: A, reason: collision with root package name */
    public final boolean f30978A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f30979B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f30980C;

    /* renamed from: D, reason: collision with root package name */
    public final SparseArray f30981D;

    /* renamed from: E, reason: collision with root package name */
    public final SparseBooleanArray f30982E;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f30983w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f30984x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f30985y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f30986z;

    static {
        String str = AbstractC3159eu.f29993a;
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

    public C3327i(C3273h c3273h) {
        super(c3273h);
        this.f30983w = c3273h.f30695w;
        this.f30984x = c3273h.f30696x;
        this.f30985y = c3273h.f30697y;
        this.f30986z = c3273h.f30698z;
        this.f30978A = c3273h.f30690A;
        this.f30979B = c3273h.f30691B;
        this.f30980C = c3273h.f30692C;
        this.f30981D = c3273h.f30693D;
        this.f30982E = c3273h.f30694E;
    }

    @Override // com.google.android.gms.internal.ads.C2616Ja
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3327i.class == obj.getClass()) {
            C3327i c3327i = (C3327i) obj;
            if (super.equals(c3327i) && this.f30983w == c3327i.f30983w && this.f30984x == c3327i.f30984x && this.f30985y == c3327i.f30985y && this.f30986z == c3327i.f30986z && this.f30978A == c3327i.f30978A && this.f30979B == c3327i.f30979B && this.f30980C == c3327i.f30980C) {
                SparseBooleanArray sparseBooleanArray = this.f30982E;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = c3327i.f30982E;
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.f30981D;
                            int size2 = sparseArray.size();
                            SparseArray sparseArray2 = c3327i.f30981D;
                            if (sparseArray2.size() == size2) {
                                for (int i6 = 0; i6 < size2; i6++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i6));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i6);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                PQ pq = (PQ) entry.getKey();
                                                if (map2.containsKey(pq) && Objects.equals(entry.getValue(), map2.get(pq))) {
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

    @Override // com.google.android.gms.internal.ads.C2616Ja
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f30983w ? 1 : 0)) * 961) + (this.f30984x ? 1 : 0)) * 961) + (this.f30985y ? 1 : 0)) * 28629151) + (this.f30986z ? 1 : 0)) * 31) + (this.f30978A ? 1 : 0)) * 31) + (this.f30979B ? 1 : 0)) * 961) + (this.f30980C ? 1 : 0)) * 31;
    }
}
