package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class swl {
    public final MainDatabase a;
    public final ydh b;

    public swl(MainDatabase mainDatabase, ydh ydhVar) {
        ydhVar.getClass();
        this.a = mainDatabase;
        this.b = ydhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r9.a(r4, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(atn atnVar, cg6 cg6Var) {
        rwl rwlVar;
        int i;
        if (cg6Var instanceof rwl) {
            rwlVar = (rwl) cg6Var;
            int i2 = rwlVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rwlVar.m = i2 - Integer.MIN_VALUE;
                Object obj = rwlVar.k;
                nm6 nm6Var = nm6.a;
                i = rwlVar.m;
                MainDatabase mainDatabase = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    tdh tdhVar = this.b.b;
                    rwlVar.j = atnVar;
                    rwlVar.m = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    atnVar = rwlVar.j;
                    qgg.h0(obj);
                }
                o4h E = mainDatabase.E();
                rwlVar.j = null;
                rwlVar.m = 2;
                E.getClass();
                TreeMap treeMap = afo.h;
                j6e a = wyf.x(atnVar).a();
                Object G = up6.G(E.a, true, false, new g20((String) a.a, a, E, 4), rwlVar);
                return G != nm6Var ? nm6Var : G;
            }
        }
        rwlVar = new rwl(this, cg6Var);
        Object obj2 = rwlVar.k;
        nm6 nm6Var2 = nm6.a;
        i = rwlVar.m;
        MainDatabase mainDatabase2 = this.a;
        if (i != 0) {
        }
        o4h E2 = mainDatabase2.E();
        rwlVar.j = null;
        rwlVar.m = 2;
        E2.getClass();
        TreeMap treeMap2 = afo.h;
        j6e a2 = wyf.x(atnVar).a();
        Object G2 = up6.G(E2.a, true, false, new g20((String) a2.a, a2, E2, 4), rwlVar);
        if (G2 != nm6Var2) {
        }
    }
}
