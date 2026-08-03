package h2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements CharSequence {

    /* renamed from: g, reason: collision with root package name */
    public final List f2647g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2648h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2649i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2650j;

    static {
        v0.j jVar = y.f2714a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        r1.a(r3.f2633c);
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f2647g = list;
        this.f2648h = str;
        int i10 = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i11 = 0; i11 < size; i11++) {
                c cVar = (c) list.get(i11);
                Object obj = cVar.f2631a;
                if (obj instanceof a0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(cVar);
                } else if (obj instanceof q) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(cVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f2649i = arrayList;
        this.f2650j = arrayList2;
        List c02 = arrayList2 != null ? bc.m.c0(arrayList2, new d(i10)) : null;
        if (c02 == null || c02.isEmpty()) {
            return;
        }
        int i12 = ((c) bc.m.T(c02)).f2633c;
        int i13 = s.j.f6292a;
        int i14 = 1;
        s.t tVar = new s.t(1);
        tVar.a(i12);
        int size2 = c02.size();
        while (i14 < size2) {
            c cVar2 = (c) c02.get(i14);
            while (true) {
                int i15 = tVar.f6342b;
                if (i15 == 0) {
                    break;
                }
                if (i15 == 0) {
                    t.a.e("IntList is empty.");
                    throw null;
                }
                int i16 = tVar.f6341a[i15 - 1];
                int i17 = cVar2.f2632b;
                int i18 = cVar2.f2633c;
                if (i17 >= i16) {
                    tVar.d(i15 - 1);
                } else if (i18 > i16) {
                    m2.a.a("Paragraph overlap not allowed, end " + i18 + " should be less than or equal to " + i16);
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f2648h.charAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return pc.j.a(this.f2648h, eVar.f2648h) && pc.j.a(this.f2647g, eVar.f2647g);
    }

    public final int hashCode() {
        int hashCode = this.f2648h.hashCode() * 31;
        List list = this.f2647g;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f2648h.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if (r1.isEmpty() != false) goto L26;
     */
    @Override // java.lang.CharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence subSequence(int i10, int i11) {
        ArrayList arrayList;
        if (i10 > i11) {
            m2.a.a("start (" + i10 + ") should be less or equal to end (" + i11 + ')');
        }
        String str = this.f2648h;
        if (i10 == 0 && i11 == str.length()) {
            return this;
        }
        String substring = str.substring(i10, i11);
        pc.j.d(substring, "substring(...)");
        int i12 = f.f2657a;
        if (i10 > i11) {
            m2.a.a("start (" + i10 + ") should be less than or equal to end (" + i11 + ')');
        }
        List list = this.f2647g;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                c cVar = (c) list.get(i13);
                int i14 = cVar.f2632b;
                int i15 = cVar.f2633c;
                if (f.a(i10, i11, i14, i15)) {
                    arrayList.add(new c(cVar.f2631a, Math.max(i10, cVar.f2632b) - i10, Math.min(i11, i15) - i10, cVar.f2634d));
                }
            }
        }
        arrayList = null;
        return new e(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f2648h;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(String str) {
        this((List) null, str);
        int i10 = f.f2657a;
    }

    public /* synthetic */ e(String str, int i10) {
        this(str, bc.v.f1067g);
    }

    public e(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
