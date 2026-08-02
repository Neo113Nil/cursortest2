package defpackage;

import java.util.Map;

/* loaded from: classes5.dex */
public final class vri {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(gv90 gv90Var, boolean z, Map map) {
        String str;
        boolean z2 = gv90Var instanceof mu90;
        if (z2) {
            nr nrVar = ((mu90) gv90Var).a;
            if (nrVar instanceof vn) {
                str = ((vn) nrVar).e;
                if (str == null) {
                    c3s c3sVar = (c3s) map.get(str);
                    return (c3sVar == null || (c3sVar instanceof a3s)) ? false : true;
                }
                if (!z || !z2) {
                    return false;
                }
                nr nrVar2 = ((mu90) gv90Var).a;
                if ((nrVar2 instanceof rn) || (nrVar2 instanceof nn)) {
                    return true;
                }
                if (!(nrVar2 instanceof pn)) {
                    return false;
                }
                jw40 jw40Var = ((pn) nrVar2).d;
                if (jw40Var.c.c instanceof nn) {
                    return true;
                }
                kw40 kw40Var = jw40Var.d;
                return (kw40Var != null ? kw40Var.c : null) instanceof nn;
            }
        }
        str = null;
        if (str == null) {
        }
    }
}
