package Q7;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import u7.C5081g;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2723n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2724u;

    public /* synthetic */ r(int i, Object obj) {
        this.f2723n = i;
        this.f2724u = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // I7.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i4;
        int i6;
        Object obj3;
        C5081g c5081g;
        Object obj4;
        switch (this.f2723n) {
            case 0:
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                kotlin.jvm.internal.h.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                List list = (List) this.f2724u;
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str = (String) list.get(0);
                    int q02 = j.q0(DelimitedRangesSequence, str, intValue, false, 4);
                    if (q02 >= 0) {
                        c5081g = new C5081g(Integer.valueOf(q02), str);
                        if (c5081g != null) {
                            return null;
                        }
                        return new C5081g(c5081g.f41052n, Integer.valueOf(((String) c5081g.f41053u).length()));
                    }
                    c5081g = null;
                    if (c5081g != null) {
                    }
                } else {
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    N7.c cVar = new N7.c(intValue, DelimitedRangesSequence.length(), 1);
                    boolean z6 = DelimitedRangesSequence instanceof String;
                    int i9 = cVar.f2107v;
                    int i10 = cVar.f2106u;
                    if (z6) {
                        if ((i9 > 0 && intValue <= i10) || (i9 < 0 && i10 <= intValue)) {
                            int i11 = intValue;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str2 = (String) obj4;
                                        if (q.d0(0, i11, str2.length(), str2, (String) DelimitedRangesSequence, false)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    c5081g = new C5081g(Integer.valueOf(i11), str3);
                                } else if (i11 != i10) {
                                    i11 += i9;
                                }
                            }
                        }
                        c5081g = null;
                        if (c5081g != null) {
                        }
                    } else {
                        if ((i9 > 0 && intValue <= i10) || (i9 < 0 && i10 <= intValue)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        int i12 = i10;
                                        String str4 = (String) obj3;
                                        int i13 = i9;
                                        i = intValue;
                                        i4 = i13;
                                        i6 = i12;
                                        if (!j.w0(str4, 0, DelimitedRangesSequence, i, str4.length(), false)) {
                                            i9 = i4;
                                            intValue = i;
                                            i10 = i6;
                                        }
                                    } else {
                                        int i14 = i9;
                                        i = intValue;
                                        i4 = i14;
                                        i6 = i10;
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    c5081g = new C5081g(Integer.valueOf(i), str5);
                                } else if (i != i6) {
                                    int i15 = i + i4;
                                    i9 = i4;
                                    intValue = i15;
                                    i10 = i6;
                                }
                            }
                        }
                        c5081g = null;
                        if (c5081g != null) {
                        }
                    }
                }
            default:
                CharSequence DelimitedRangesSequence2 = (CharSequence) obj;
                int intValue2 = ((Integer) obj2).intValue();
                kotlin.jvm.internal.h.e(DelimitedRangesSequence2, "$this$DelimitedRangesSequence");
                int r02 = j.r0(DelimitedRangesSequence2, (char[]) this.f2724u, intValue2, false);
                if (r02 < 0) {
                    return null;
                }
                return new C5081g(Integer.valueOf(r02), 1);
        }
    }
}
