package defpackage;

import com.yandex.div.core.expression.a;
import com.yandex.div.core.expression.local.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.c3;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class zkl0 {
    public final nfh a;
    public final m6o b;
    public final Map c = Collections.synchronizedMap(new LinkedHashMap());
    public final WeakHashMap d = new WeakHashMap();

    public zkl0(nfh nfhVar, m6o m6oVar) {
        this.a = nfhVar;
        this.b = m6oVar;
    }

    public final void a(Div2View div2View) {
        WeakHashMap weakHashMap = this.d;
        Set set = (Set) weakHashMap.get(div2View);
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                b bVar = (b) this.c.get((String) it.next());
                if (bVar != null) {
                    bVar.d = false;
                    for (a aVar : bVar.g) {
                        if (!aVar.d) {
                            aVar.d = true;
                            yuf0 yuf0Var = aVar.c;
                            if (yuf0Var != null) {
                                yuf0Var.m(div2View);
                            }
                            aVar.a.d.i();
                        }
                    }
                }
            }
        }
        weakHashMap.remove(div2View);
    }

    public final b b(zmk zmkVar, omk omkVar, Div2View div2View) {
        boolean z;
        ptf0 ptf0Var;
        Expression S;
        WeakHashMap weakHashMap = this.d;
        Object obj = weakHashMap.get(div2View);
        if (obj == null) {
            obj = new LinkedHashSet();
            weakHashMap.put(div2View, obj);
        }
        String str = zmkVar.a;
        ((Set) obj).add(str);
        l6o a = this.b.a(omkVar, zmkVar);
        Map map = this.c;
        b bVar = (b) map.get(str);
        if (bVar == null) {
            b bVar2 = new b(omkVar, zmkVar, this.a, a);
            map.put(str, bVar2);
            if (div2View != null) {
                bVar2.j = new WeakReference(div2View);
            }
            return bVar2;
        }
        a aVar = bVar.l;
        if (div2View != null) {
            bVar.j = new WeakReference(div2View);
        }
        tvo tvoVar = aVar.a;
        f231 f231Var = tvoVar.d;
        rtf0 rtf0Var = aVar.b;
        if (rtf0Var == null) {
            rtf0Var = qtf0.a;
        }
        List<c3> list = omkVar.g;
        if (list != null) {
            for (c3 c3Var : list) {
                c231 k = f231Var.k(tje.E(c3Var));
                if (k == null) {
                    try {
                        c231 h0 = tje.h0(c3Var, tvoVar, rtf0Var, a);
                        if (h0 != null) {
                            f231Var.m(h0);
                        }
                    } catch (VariableDeclarationException e) {
                        a.e(e);
                    }
                } else {
                    if (c3Var instanceof xml) {
                        z = k instanceof u131;
                    } else if (c3Var instanceof anl) {
                        z = k instanceof y131;
                    } else if (c3Var instanceof bnl) {
                        z = k instanceof x131;
                    } else if (c3Var instanceof fnl) {
                        z = k instanceof z131;
                    } else if (c3Var instanceof yml) {
                        z = k instanceof v131;
                    } else if (c3Var instanceof inl) {
                        z = k instanceof a231;
                    } else if (c3Var instanceof zml) {
                        z = k instanceof w131;
                    } else if (c3Var instanceof wml) {
                        z = k instanceof t131;
                    } else {
                        if (!(c3Var instanceof dnl)) {
                            w511.b();
                            return null;
                        }
                        z = (k instanceof com.yandex.div.data.a) && ((dnl) c3Var).c.e == ((com.yandex.div.data.a) k).m();
                    }
                    if (!z) {
                        a.e(new IllegalArgumentException(vuu0.c("\n                           Variable inconsistency detected!\n                           at DivData: " + tje.E(c3Var) + Extension.O_BRAKE_SPACE + c3Var + ")\n                           at VariableController: " + k + "\n                        ")));
                    } else if ((c3Var instanceof dnl) && (k instanceof com.yandex.div.data.a) && (S = tje.S((ptf0Var = ((dnl) c3Var).c), tvoVar, a)) != null) {
                        com.yandex.div.data.a aVar2 = (com.yandex.div.data.a) k;
                        aVar2.n(aVar2.j().f(S, ptf0Var.c, ptf0Var.d));
                    }
                }
            }
        }
        yuf0 yuf0Var = aVar.c;
        if (yuf0Var != null) {
            List list2 = omkVar.f;
            if (list2 == null) {
                list2 = EmptyList.a;
            }
            yuf0Var.s(list2);
        }
        return bVar;
    }
}
