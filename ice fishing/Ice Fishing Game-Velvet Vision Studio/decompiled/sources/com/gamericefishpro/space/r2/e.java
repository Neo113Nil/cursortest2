package com.gamericefishpro.space.r2;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements CharSequence {
    public final List d;
    public final String e;
    public final ArrayList i;
    public final ArrayList v;

    static {
        com.gamericefishpro.space.u6.c cVar = y.a;
    }

    public e(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.d = list;
        this.e = str;
        int i = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i2 = 0; i2 < size; i2++) {
                c cVar = (c) list.get(i2);
                Object obj = cVar.a;
                if (obj instanceof b0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(cVar);
                } else if (obj instanceof p) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(cVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.i = arrayList;
        this.v = arrayList2;
        List listI = arrayList2 != null ? CollectionsKt.I(arrayList2, new d(i)) : null;
        if (listI == null || listI.isEmpty()) {
            return;
        }
        int i3 = ((c) CollectionsKt.w(listI)).c;
        com.gamericefishpro.space.t.v vVar = com.gamericefishpro.space.t.k.a;
        com.gamericefishpro.space.t.v vVar2 = new com.gamericefishpro.space.t.v(1);
        vVar2.a(i3);
        int size2 = listI.size();
        for (int i4 = 1; i4 < size2; i4++) {
            c cVar2 = (c) listI.get(i4);
            while (true) {
                int i5 = vVar2.b;
                if (i5 == 0) {
                    break;
                }
                if (i5 == 0) {
                    com.gamericefishpro.space.u.a.e("IntList is empty.");
                    throw null;
                }
                int i6 = vVar2.a[i5 - 1];
                int i7 = cVar2.b;
                int i8 = cVar2.c;
                if (i7 < i6) {
                    if (i8 > i6) {
                        com.gamericefishpro.space.w2.a.a("Paragraph overlap not allowed, end " + i8 + " should be less than or equal to " + i6);
                        break;
                    }
                    break;
                }
                vVar2.c(i5 - 1);
            }
            vVar2.a(cVar2.c);
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.e.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.a(this.e, eVar.e) && Intrinsics.a(this.d, eVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.e.hashCode() * 31;
        List list = this.d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.e.length();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        ArrayList arrayList;
        if (i > i2) {
            com.gamericefishpro.space.w2.a.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.e;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        int i3 = f.a;
        if (i > i2) {
            com.gamericefishpro.space.w2.a.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.d;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                c cVar = (c) list.get(i4);
                int i5 = cVar.b;
                int i6 = cVar.c;
                if (f.a(i, i2, i5, i6)) {
                    arrayList.add(new c(cVar.a, Math.max(i, cVar.b) - i, Math.min(i2, i6) - i, cVar.d));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        return new e(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.e;
    }

    public e(String str) {
        this(str, com.gamericefishpro.space.ph.g0.d);
    }

    public e(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
