package K1;

import C1.p;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class m extends D1.j implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(List list, boolean z2) {
        super(2);
        this.f403b = list;
        this.f404c = z2;
    }

    @Override // C1.p
    public final Object d(Object obj, Object obj2) {
        Object obj3;
        t1.d dVar;
        Object obj4;
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        D1.i.e(charSequence, "$this$$receiver");
        List list = this.f403b;
        boolean z2 = this.f404c;
        if (z2 || list.size() != 1) {
            if (intValue < 0) {
                intValue = 0;
            }
            boolean z3 = charSequence instanceof String;
            int i = new H1.c(intValue, charSequence.length(), 1).f343b;
            if (z3) {
                if (intValue <= i) {
                    while (true) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it.next();
                            String str = (String) obj4;
                            if (l.e0(0, intValue, str.length(), str, (String) charSequence, z2)) {
                                break;
                            }
                        }
                        String str2 = (String) obj4;
                        if (str2 == null) {
                            if (intValue == i) {
                                break;
                            }
                            intValue++;
                        } else {
                            dVar = new t1.d(Integer.valueOf(intValue), str2);
                            break;
                        }
                    }
                }
                dVar = null;
            } else {
                if (intValue <= i) {
                    while (true) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            String str3 = (String) obj3;
                            if (d.l0(intValue, str3.length(), charSequence, str3, z2)) {
                                break;
                            }
                        }
                        String str4 = (String) obj3;
                        if (str4 == null) {
                            if (intValue == i) {
                                break;
                            }
                            intValue++;
                        } else {
                            dVar = new t1.d(Integer.valueOf(intValue), str4);
                            break;
                        }
                    }
                }
                dVar = null;
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
            int j02 = d.j0(intValue, 4, charSequence, str5, false);
            if (j02 >= 0) {
                dVar = new t1.d(Integer.valueOf(j02), str5);
            }
            dVar = null;
        }
        if (dVar == null) {
            return null;
        }
        return new t1.d(dVar.f4378a, Integer.valueOf(((String) dVar.f4379b).length()));
    }
}
