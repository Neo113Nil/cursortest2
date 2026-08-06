package z1;

import h1.C0234d;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import w1.C1062c;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements t1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8640c;

    public /* synthetic */ p(Object obj, boolean z2, int i2) {
        this.f8638a = i2;
        this.f8640c = obj;
        this.f8639b = z2;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        C0234d c0234d;
        Object obj4;
        int i2 = this.f8638a;
        CharSequence DelimitedRangesSequence = (CharSequence) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                kotlin.jvm.internal.i.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int Z2 = g.Z(DelimitedRangesSequence, (char[]) this.f8640c, intValue, this.f8639b);
                if (Z2 < 0) {
                    return null;
                }
                return new C0234d(Integer.valueOf(Z2), 1);
            default:
                kotlin.jvm.internal.i.e(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                List list = (List) this.f8640c;
                boolean z2 = this.f8639b;
                if (z2 || list.size() != 1) {
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    C1062c c1062c = new C1062c(intValue, DelimitedRangesSequence.length(), 1);
                    boolean z3 = DelimitedRangesSequence instanceof String;
                    int i3 = c1062c.f8518c;
                    int i4 = c1062c.f8517b;
                    if (z3) {
                        if ((i3 > 0 && intValue <= i4) || (i3 < 0 && i4 <= intValue)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str = (String) obj4;
                                        if (o.O(0, intValue, str.length(), str, (String) DelimitedRangesSequence, z2)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str2 = (String) obj4;
                                if (str2 != null) {
                                    c0234d = new C0234d(Integer.valueOf(intValue), str2);
                                } else if (intValue != i4) {
                                    intValue += i3;
                                }
                            }
                        }
                        c0234d = null;
                    } else {
                        if ((i3 > 0 && intValue <= i4) || (i3 < 0 && i4 <= intValue)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str3 = (String) obj3;
                                        if (g.c0(str3, 0, DelimitedRangesSequence, intValue, str3.length(), z2)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                String str4 = (String) obj3;
                                if (str4 != null) {
                                    c0234d = new C0234d(Integer.valueOf(intValue), str4);
                                } else if (intValue != i4) {
                                    intValue += i3;
                                }
                            }
                        }
                        c0234d = null;
                    }
                } else {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str5 = (String) list.get(0);
                    int Y = g.Y(DelimitedRangesSequence, str5, intValue, false, 4);
                    if (Y >= 0) {
                        c0234d = new C0234d(Integer.valueOf(Y), str5);
                    }
                    c0234d = null;
                }
                if (c0234d == null) {
                    return null;
                }
                return new C0234d(c0234d.f3386a, Integer.valueOf(((String) c0234d.f3387b).length()));
        }
    }
}
