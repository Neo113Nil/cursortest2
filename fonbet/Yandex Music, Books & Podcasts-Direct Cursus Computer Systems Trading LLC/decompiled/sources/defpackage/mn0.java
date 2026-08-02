package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mn0 implements CharSequence {
    public static final /* synthetic */ int e = 0;
    public final List a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;

    static {
        apo apoVar = fpo.a;
    }

    public mn0(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.a = list;
        this.b = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                ln0 ln0Var = (ln0) list.get(i);
                Object obj = ln0Var.a;
                if (obj instanceof c4r) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(ln0Var);
                } else if (obj instanceof x5k) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(ln0Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.c = arrayList;
        this.d = arrayList2;
        List o0 = arrayList2 != null ? CollectionsKt.o0(arrayList2, new C1318t(20)) : null;
        List list2 = o0;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int i2 = ((ln0) CollectionsKt.Q(o0)).c;
        roi roiVar = spe.a;
        roi roiVar2 = new roi(1);
        roiVar2.a(i2);
        int size2 = o0.size();
        for (int i3 = 1; i3 < size2; i3++) {
            ln0 ln0Var2 = (ln0) o0.get(i3);
            while (true) {
                if (roiVar2.b != 0) {
                    int d = roiVar2.d();
                    int i4 = ln0Var2.b;
                    int i5 = ln0Var2.c;
                    if (i4 >= d) {
                        roiVar2.f(roiVar2.b - 1);
                    } else if (i5 > d) {
                        tme.a("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + d);
                    }
                }
            }
            roiVar2.a(ln0Var2.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public final List a(int i) {
        ?? r1;
        List list = this.a;
        if (list != null) {
            r1 = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                ln0 ln0Var = (ln0) obj;
                if ((ln0Var.a instanceof p7g) && nn0.c(0, i, ln0Var.b, ln0Var.c)) {
                    r1.add(obj);
                }
            }
        } else {
            r1 = c5b.a;
        }
        r1.getClass();
        return r1;
    }

    public final List b(int i, int i2, String str) {
        List list = this.a;
        if (list == null) {
            return c5b.a;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ln0 ln0Var = (ln0) list.get(i3);
            Object obj = ln0Var.a;
            int i4 = ln0Var.c;
            int i5 = ln0Var.b;
            String str2 = ln0Var.d;
            if ((obj instanceof dkr) && str.equals(str2) && nn0.c(i, i2, i5, i4)) {
                Object obj2 = ln0Var.a;
                obj2.getClass();
                arrayList.add(new ln0(i5, i4, ((dkr) obj2).a, str2));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        if (r1.isEmpty() != false) goto L26;
     */
    @Override // java.lang.CharSequence
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mn0 subSequence(int i, int i2) {
        ArrayList arrayList;
        if (i > i2) {
            tme.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.b;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i2);
        mn0 mn0Var = nn0.a;
        if (i > i2) {
            tme.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.a;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ln0 ln0Var = (ln0) list.get(i3);
                int i4 = ln0Var.b;
                int i5 = ln0Var.c;
                if (nn0.c(i, i2, i4, i5)) {
                    arrayList.add(new ln0(Math.max(i, ln0Var.b) - i, Math.min(i2, i5) - i, ln0Var.a, ln0Var.d));
                }
            }
        }
        arrayList = null;
        return new mn0(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.b.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn0)) {
            return false;
        }
        mn0 mn0Var = (mn0) obj;
        return Intrinsics.d(this.b, mn0Var.b) && Intrinsics.d(this.a, mn0Var.a);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        List list = this.a;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.b.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.b;
    }

    public mn0(int i, String str, ArrayList arrayList) {
        this(str, (i & 2) != 0 ? c5b.a : arrayList, c5b.a);
    }

    public mn0(String str) {
        this(str, c5b.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mn0(String str, List list, List list2) {
        this(list, str);
        mn0 mn0Var = nn0.a;
        if (list.isEmpty() && list2.isEmpty()) {
            list = null;
        } else if (!list2.isEmpty()) {
            if (list.isEmpty()) {
                list = list2;
            } else {
                ArrayList arrayList = new ArrayList(list2.size() + list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add((ln0) list.get(i));
                }
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList.add((ln0) list2.get(i2));
                }
                list = arrayList;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mn0(String str, List list) {
        this(r3.isEmpty() ? null : r3, str);
        List list2 = list;
    }
}
