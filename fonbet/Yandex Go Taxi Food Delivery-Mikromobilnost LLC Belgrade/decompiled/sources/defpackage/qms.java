package defpackage;

import jason.statham.interpreter.error.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class qms implements ams {
    @Override // defpackage.ams
    public final Object d(jje jjeVar, inj injVar) {
        int i = injVar.c;
        if (i == 1) {
            Object obj = injVar.a[0];
            if (!ym11.g(obj)) {
                throw a.a("Function \"sort\" is not defined for ".concat(rhb1.e(obj)));
            }
            List list = (List) obj;
            if (!list.isEmpty()) {
                Iterable iterable = (Iterable) obj;
                boolean z = iterable instanceof Collection;
                if (!z || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (!(it.next() instanceof String)) {
                            if (!z || !((Collection) iterable).isEmpty()) {
                                Iterator it2 = iterable.iterator();
                                while (it2.hasNext()) {
                                    if (!(it2.next() instanceof Long)) {
                                        if (!z || !((Collection) iterable).isEmpty()) {
                                            Iterator it3 = iterable.iterator();
                                            while (it3.hasNext()) {
                                                if (!(it3.next() instanceof Double)) {
                                                    if (!z || !((Collection) iterable).isEmpty()) {
                                                        Iterator it4 = iterable.iterator();
                                                        while (it4.hasNext()) {
                                                            if (!(it4.next() instanceof Boolean)) {
                                                                throw a.a("Function \"sort\" is not defined for ".concat(rhb1.e(obj)));
                                                            }
                                                        }
                                                    }
                                                    if (list.size() > 1) {
                                                        xcc.q(list, new ybc());
                                                        return obj;
                                                    }
                                                }
                                            }
                                        }
                                        if (list.size() > 1) {
                                            xcc.q(list, new xbc());
                                            return obj;
                                        }
                                    }
                                }
                            }
                            if (list.size() > 1) {
                                xcc.q(list, new wbc());
                                return obj;
                            }
                        }
                    }
                }
                if (list.size() > 1) {
                    xcc.q(list, new vbc());
                }
            }
            return obj;
        }
        if (i != 2) {
            throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"sort\" requires 1-2 arguments but "));
        }
        Object[] objArr = injVar.a;
        Object obj2 = objArr[0];
        Object obj3 = objArr[1];
        if (!ym11.g(obj2) || !(obj3 instanceof Boolean)) {
            throw a.a("Function \"sort\" is not defined for " + rhb1.e(obj2) + Extension.FIX_SPACE + rhb1.e(obj2));
        }
        List list2 = (List) obj2;
        if (!list2.isEmpty()) {
            if (((Boolean) obj3).booleanValue()) {
                Iterable iterable2 = (Iterable) obj2;
                boolean z2 = iterable2 instanceof Collection;
                if (!z2 || !((Collection) iterable2).isEmpty()) {
                    Iterator it5 = iterable2.iterator();
                    while (it5.hasNext()) {
                        if (!(it5.next() instanceof String)) {
                            if (!z2 || !((Collection) iterable2).isEmpty()) {
                                Iterator it6 = iterable2.iterator();
                                while (it6.hasNext()) {
                                    if (!(it6.next() instanceof Long)) {
                                        if (!z2 || !((Collection) iterable2).isEmpty()) {
                                            Iterator it7 = iterable2.iterator();
                                            while (it7.hasNext()) {
                                                if (!(it7.next() instanceof Double)) {
                                                    if (!z2 || !((Collection) iterable2).isEmpty()) {
                                                        Iterator it8 = iterable2.iterator();
                                                        while (it8.hasNext()) {
                                                            if (!(it8.next() instanceof Boolean)) {
                                                                throw a.a("Function \"sort\" is not defined for " + rhb1.e(obj2) + Extension.FIX_SPACE + rhb1.e(obj3));
                                                            }
                                                        }
                                                    }
                                                    if (list2.size() > 1) {
                                                        xcc.q(list2, new gcc());
                                                        return obj2;
                                                    }
                                                }
                                            }
                                        }
                                        if (list2.size() > 1) {
                                            xcc.q(list2, new fcc());
                                            return obj2;
                                        }
                                    }
                                }
                            }
                            if (list2.size() > 1) {
                                xcc.q(list2, new ecc());
                                return obj2;
                            }
                        }
                    }
                }
                if (list2.size() > 1) {
                    xcc.q(list2, new dcc());
                    return obj2;
                }
            } else {
                Iterable iterable3 = (Iterable) obj2;
                boolean z3 = iterable3 instanceof Collection;
                if (!z3 || !((Collection) iterable3).isEmpty()) {
                    Iterator it9 = iterable3.iterator();
                    while (it9.hasNext()) {
                        if (!(it9.next() instanceof String)) {
                            if (!z3 || !((Collection) iterable3).isEmpty()) {
                                Iterator it10 = iterable3.iterator();
                                while (it10.hasNext()) {
                                    if (!(it10.next() instanceof Long)) {
                                        if (!z3 || !((Collection) iterable3).isEmpty()) {
                                            Iterator it11 = iterable3.iterator();
                                            while (it11.hasNext()) {
                                                if (!(it11.next() instanceof Double)) {
                                                    if (!z3 || !((Collection) iterable3).isEmpty()) {
                                                        Iterator it12 = iterable3.iterator();
                                                        while (it12.hasNext()) {
                                                            if (!(it12.next() instanceof Boolean)) {
                                                                throw a.a("Function \"sort\" is not defined for " + rhb1.e(obj2) + Extension.FIX_SPACE + rhb1.e(obj3));
                                                            }
                                                        }
                                                    }
                                                    if (list2.size() > 1) {
                                                        xcc.q(list2, new ccc());
                                                        return obj2;
                                                    }
                                                }
                                            }
                                        }
                                        if (list2.size() > 1) {
                                            xcc.q(list2, new bcc());
                                            return obj2;
                                        }
                                    }
                                }
                            }
                            if (list2.size() > 1) {
                                xcc.q(list2, new acc());
                                return obj2;
                            }
                        }
                    }
                }
                if (list2.size() > 1) {
                    xcc.q(list2, new zbc());
                }
            }
        }
        return obj2;
    }
}
