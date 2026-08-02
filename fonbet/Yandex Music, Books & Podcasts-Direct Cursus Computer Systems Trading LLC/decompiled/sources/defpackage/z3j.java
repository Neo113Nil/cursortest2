package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class z3j extends bfu {
    public final xdr k = ydr.a(v3j.a);
    public final jyr l = l18.b.b(hag.I(gui.class), true);
    public rar m;

    public z3j() {
        G();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(z3j z3jVar, cg6 cg6Var) {
        y3j y3jVar;
        int i;
        rj6 rj6Var;
        Object obj;
        Object obj2;
        if (cg6Var instanceof y3j) {
            y3jVar = (y3j) cg6Var;
            int i2 = y3jVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y3jVar.l = i2 - Integer.MIN_VALUE;
                Object obj3 = y3jVar.j;
                nm6 nm6Var = nm6.a;
                i = y3jVar.l;
                if (i != 0) {
                    qgg.h0(obj3);
                    gui guiVar = (gui) z3jVar.l.getValue();
                    y3jVar.l = 1;
                    obj3 = guiVar.c(y3jVar);
                    if (obj3 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj3);
                }
                rj6Var = (rj6) obj3;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        return u3j.a;
                    }
                    b6e.s();
                    return null;
                }
                qsi a = ((jsi) ((qj6) rj6Var).a).a();
                List list = a != null ? a.c : null;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((xsi) obj2) instanceof wsi) {
                            break;
                        }
                    }
                    obj = (xsi) obj2;
                } else {
                    obj = null;
                }
                wsi wsiVar = obj instanceof wsi ? (wsi) obj : null;
                List list2 = list;
                return (list2 == null || list2.isEmpty() || wsiVar == null) ? t3j.a : new w3j(wsiVar.a);
            }
        }
        y3jVar = new y3j(z3jVar, cg6Var);
        Object obj32 = y3jVar.j;
        nm6 nm6Var2 = nm6.a;
        i = y3jVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj32;
        if (rj6Var instanceof qj6) {
        }
    }

    public final void G() {
        xdr xdrVar = this.k;
        xdrVar.getClass();
        Continuation continuation = null;
        xdrVar.m(null, v3j.a);
        rar rarVar = this.m;
        if (rarVar != null) {
            rarVar.g(null);
        }
        this.m = x97.y(ot0.F(this), null, null, new h1j(this, continuation, 1), 3);
    }
}
