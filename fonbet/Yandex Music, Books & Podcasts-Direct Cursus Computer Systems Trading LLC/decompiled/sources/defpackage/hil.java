package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class hil implements ksg, hs6, pun {
    public static lsp a(String str) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        rdb rdbVar = lsp.l;
        rdbVar.getClass();
        c7 c7Var = new c7(0, rdbVar);
        while (true) {
            if (!c7Var.hasNext()) {
                break;
            }
            Object next = c7Var.next();
            if (Intrinsics.d(((lsp) next).name(), str)) {
                obj = next;
                break;
            }
        }
        return (lsp) obj;
    }

    public static iil c(kml kmlVar, int i) {
        if ((i & 1) != 0) {
            kmlVar = o8g.s(null, 7);
        }
        g5l g5lVar = g5l.a;
        f5l f5lVar = f5l.c;
        return new iil(kmlVar, new h5l(g5lVar, f5lVar, f5lVar), new l9n("Моя волна", "Бег", x84.a, i9n.a, new fxi("")));
    }

    @Override // defpackage.pun
    public void accept(Object obj, Object obj2) {
        msg msgVar = h4x.G;
        y0x y0xVar = (y0x) ((jox) obj).s();
        y0xVar.P0(y0xVar.M0(), 19);
        ((i8s) obj2).b(Boolean.TRUE);
    }

    @Override // defpackage.ksg
    public void b(String str) {
        System.err.println("[MVIKotlin]: ".concat(str));
    }
}
