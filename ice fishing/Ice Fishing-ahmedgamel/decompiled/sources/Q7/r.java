package Q7;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import u7.C5089g;

/* loaded from: classes2.dex */
public final /* synthetic */ class r implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f2686n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f2687u;

    public /* synthetic */ r(int i, Object obj) {
        this.f2686n = i;
        this.f2687u = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // I7.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i6;
        int i9;
        Object obj3;
        C5089g c5089g;
        Object obj4;
        switch (this.f2686n) {
            case 0:
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                kotlin.jvm.internal.h.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                List list = (List) this.f2687u;
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str = (String) list.get(0);
                    int a02 = j.a0(DelimitedRangesSequence, str, intValue, false, 4);
                    if (a02 >= 0) {
                        c5089g = new C5089g(Integer.valueOf(a02), str);
                        if (c5089g != null) {
                            return null;
                        }
                        return new C5089g(c5089g.f41332n, Integer.valueOf(((String) c5089g.f41333u).length()));
                    }
                    c5089g = null;
                    if (c5089g != null) {
                    }
                } else {
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    N7.c cVar = new N7.c(intValue, DelimitedRangesSequence.length(), 1);
                    boolean z3 = DelimitedRangesSequence instanceof String;
                    int i10 = cVar.f2019v;
                    int i11 = cVar.f2018u;
                    if (z3) {
                        if ((i10 > 0 && intValue <= i11) || (i10 < 0 && i11 <= intValue)) {
                            int i12 = intValue;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str2 = (String) obj4;
                                        if (q.N(0, i12, str2.length(), str2, (String) DelimitedRangesSequence, false)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    c5089g = new C5089g(Integer.valueOf(i12), str3);
                                } else if (i12 != i11) {
                                    i12 += i10;
                                }
                            }
                        }
                        c5089g = null;
                        if (c5089g != null) {
                        }
                    } else {
                        if ((i10 > 0 && intValue <= i11) || (i10 < 0 && i11 <= intValue)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        int i13 = i11;
                                        String str4 = (String) obj3;
                                        int i14 = i10;
                                        i = intValue;
                                        i6 = i14;
                                        i9 = i13;
                                        if (!j.g0(str4, 0, DelimitedRangesSequence, i, str4.length(), false)) {
                                            i10 = i6;
                                            intValue = i;
                                            i11 = i9;
                                        }
                                    } else {
                                        int i15 = i10;
                                        i = intValue;
                                        i6 = i15;
                                        i9 = i11;
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    c5089g = new C5089g(Integer.valueOf(i), str5);
                                } else if (i != i9) {
                                    int i16 = i + i6;
                                    i10 = i6;
                                    intValue = i16;
                                    i11 = i9;
                                }
                            }
                        }
                        c5089g = null;
                        if (c5089g != null) {
                        }
                    }
                }
            default:
                CharSequence DelimitedRangesSequence2 = (CharSequence) obj;
                int intValue2 = ((Integer) obj2).intValue();
                kotlin.jvm.internal.h.e(DelimitedRangesSequence2, "$this$DelimitedRangesSequence");
                int b02 = j.b0(DelimitedRangesSequence2, (char[]) this.f2687u, intValue2, false);
                if (b02 < 0) {
                    return null;
                }
                return new C5089g(Integer.valueOf(b02), 1);
        }
    }
}
