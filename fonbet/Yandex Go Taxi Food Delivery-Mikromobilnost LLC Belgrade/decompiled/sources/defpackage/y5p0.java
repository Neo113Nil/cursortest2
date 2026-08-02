package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class y5p0 {
    public final gvn0 a;
    public final r0 b = bvf0.c(EmptyList.a);
    public final r0 c = bvf0.c(null);

    public y5p0(gvn0 gvn0Var) {
        this.a = gvn0Var;
    }

    public final b4p0 a() {
        return (b4p0) this.c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(List list) {
        Object obj;
        Object obj2;
        Object obj3;
        this.b.l(list);
        b4p0 b4p0Var = null;
        if (!list.isEmpty()) {
            b4p0 b4p0Var2 = this.a.a;
            if (b4p0Var2 != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    b4p0 b4p0Var3 = (b4p0) next;
                    if ((b4p0Var2.a.length() <= 0 || b4p0Var3.a.length() <= 0) ? b4p0Var2.getClass() == b4p0Var3.getClass() : jl40.l(b4p0Var2.a, b4p0Var3.a)) {
                        b4p0Var = next;
                        break;
                    }
                }
                b4p0Var = b4p0Var;
            } else {
                List list2 = list;
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    b4p0 b4p0Var4 = (b4p0) obj;
                    if ((b4p0Var4 instanceof b590) && ((b590) b4p0Var4).n.l) {
                        break;
                    }
                }
                b4p0 b4p0Var5 = (b4p0) obj;
                if (b4p0Var5 == null) {
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj3 = null;
                            break;
                        } else {
                            obj3 = it3.next();
                            if (((b4p0) obj3) instanceof xzt0) {
                                break;
                            }
                        }
                    }
                    b4p0Var5 = (b4p0) obj3;
                }
                if (b4p0Var5 == null) {
                    Iterator it4 = list2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it4.next();
                            if (((b4p0) obj2) instanceof b590) {
                                break;
                            }
                        }
                    }
                    b4p0Var5 = (b4p0) obj2;
                }
                if (b4p0Var5 == null) {
                    Iterator it5 = list2.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        Object next2 = it5.next();
                        if (((b4p0) next2) instanceof eer) {
                            b4p0Var = next2;
                            break;
                        }
                    }
                    b4p0Var = b4p0Var;
                } else {
                    b4p0Var = b4p0Var5;
                }
            }
            if (b4p0Var == null) {
                b4p0Var = (b4p0) a.R(list);
            }
        }
        this.c.l(b4p0Var);
        if (b4p0Var != null) {
            this.a.a = b4p0Var;
        }
    }
}
