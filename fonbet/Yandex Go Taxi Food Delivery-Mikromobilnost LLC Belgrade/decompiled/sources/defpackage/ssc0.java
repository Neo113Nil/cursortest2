package defpackage;

import com.yandex.plus.home.plaque.repository.api.model.Predicate$Compare$Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes8.dex */
public final class ssc0 {
    public static cie0 a(uie0 uie0Var) {
        if (uie0Var instanceof qie0) {
            return new zhe0(Integer.valueOf(((qie0) uie0Var).a()));
        }
        if (uie0Var instanceof nie0) {
            return new zhe0(Double.valueOf(((nie0) uie0Var).a()));
        }
        if (uie0Var instanceof tie0) {
            return new aie0(((tie0) uie0Var).a());
        }
        w511.b();
        return null;
    }

    public static eie0 b(hle0 hle0Var) {
        HashSet hashSet;
        cie0 aie0Var;
        if (hle0Var instanceof tje0) {
            return new she0(((tje0) hle0Var).a());
        }
        if (hle0Var instanceof qje0) {
            return new the0(((qje0) hle0Var).a(), Predicate$Compare$Type.EQUALS, new yhe0(true));
        }
        if (hle0Var instanceof wje0) {
            wje0 wje0Var = (wje0) hle0Var;
            String a = wje0Var.a();
            cje0 b = wje0Var.b();
            if (b instanceof yie0) {
                aie0Var = new zhe0(Integer.valueOf(((yie0) b).a()));
            } else {
                if (!(b instanceof bje0)) {
                    w511.b();
                    return null;
                }
                aie0Var = new aie0(((bje0) b).a());
            }
            return new uhe0(a, aie0Var);
        }
        if (hle0Var instanceof zje0) {
            zje0 zje0Var = (zje0) hle0Var;
            return new the0(zje0Var.a(), Predicate$Compare$Type.EQUALS, a(zje0Var.b()));
        }
        if (hle0Var instanceof cke0) {
            cke0 cke0Var = (cke0) hle0Var;
            return new the0(cke0Var.a(), Predicate$Compare$Type.GREATER, a(cke0Var.b()));
        }
        if (hle0Var instanceof fke0) {
            fke0 fke0Var = (fke0) hle0Var;
            return new the0(fke0Var.a(), Predicate$Compare$Type.GREATER_OR_EQUALS, a(fke0Var.b()));
        }
        if (hle0Var instanceof oke0) {
            oke0 oke0Var = (oke0) hle0Var;
            return new the0(oke0Var.a(), Predicate$Compare$Type.LESSER, a(oke0Var.b()));
        }
        if (hle0Var instanceof rke0) {
            rke0 rke0Var = (rke0) hle0Var;
            return new the0(rke0Var.a(), Predicate$Compare$Type.LESSER_OR_EQUALS, a(rke0Var.b()));
        }
        if (hle0Var instanceof ike0) {
            ike0 ike0Var = (ike0) hle0Var;
            String a2 = ike0Var.a();
            kje0 b2 = ike0Var.b();
            if (b2 instanceof gje0) {
                gje0 gje0Var = (gje0) b2;
                Set a3 = gje0Var.a();
                hashSet = new HashSet(gje0Var.a().size());
                Iterator it = a3.iterator();
                while (it.hasNext()) {
                    hashSet.add(new zhe0((Number) it.next()));
                }
            } else {
                if (!(b2 instanceof jje0)) {
                    w511.b();
                    return null;
                }
                jje0 jje0Var = (jje0) b2;
                Set a4 = jje0Var.a();
                hashSet = new HashSet(jje0Var.a().size());
                Iterator it2 = a4.iterator();
                while (it2.hasNext()) {
                    hashSet.add(new aie0((String) it2.next()));
                }
            }
            return new vhe0(a2, hashSet);
        }
        if (hle0Var instanceof lke0) {
            return new xhe0(new whe0(((lke0) hle0Var).a()));
        }
        if (hle0Var instanceof xke0) {
            return new whe0(((xke0) hle0Var).a());
        }
        if (hle0Var instanceof uke0) {
            return new xhe0(b(((uke0) hle0Var).a()));
        }
        if (hle0Var instanceof ble0) {
            List list = ((ble0) hle0Var).a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(b((hle0) it3.next()));
            }
            return new qhe0(arrayList);
        }
        if (!(hle0Var instanceof ele0)) {
            if (hle0Var == null) {
                return new she0(true);
            }
            w511.b();
            return null;
        }
        List a5 = ((ele0) hle0Var).a();
        ArrayList arrayList2 = new ArrayList(tcc.n(a5, 10));
        Iterator it4 = a5.iterator();
        while (it4.hasNext()) {
            arrayList2.add(b((hle0) it4.next()));
        }
        return new rhe0(arrayList2);
    }
}
