package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class uxs {
    public final MainDatabase a;
    public final ydh b;

    public uxs(MainDatabase mainDatabase, ydh ydhVar) {
        ydhVar.getClass();
        this.a = mainDatabase;
        this.b = ydhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r8.a(r3, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(atn atnVar, cg6 cg6Var) {
        sxs sxsVar;
        int i;
        if (cg6Var instanceof sxs) {
            sxsVar = (sxs) cg6Var;
            int i2 = sxsVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sxsVar.m = i2 - Integer.MIN_VALUE;
                Object obj = sxsVar.k;
                nm6 nm6Var = nm6.a;
                i = sxsVar.m;
                MainDatabase mainDatabase = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    tdh tdhVar = this.b.a;
                    sxsVar.j = atnVar;
                    sxsVar.m = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    atnVar = sxsVar.j;
                    qgg.h0(obj);
                }
                hjn P = mainDatabase.P();
                sxsVar.j = null;
                sxsVar.m = 2;
                Object a = P.a(atnVar, sxsVar);
                return a != nm6Var ? nm6Var : a;
            }
        }
        sxsVar = new sxs(this, cg6Var);
        Object obj2 = sxsVar.k;
        nm6 nm6Var2 = nm6.a;
        i = sxsVar.m;
        MainDatabase mainDatabase2 = this.a;
        if (i != 0) {
        }
        hjn P2 = mainDatabase2.P();
        sxsVar.j = null;
        sxsVar.m = 2;
        Object a2 = P2.a(atnVar, sxsVar);
        if (a2 != nm6Var2) {
        }
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
    public final Object b(atn atnVar, cg6 cg6Var) {
        txs txsVar;
        int i;
        if (cg6Var instanceof txs) {
            txsVar = (txs) cg6Var;
            int i2 = txsVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                txsVar.m = i2 - Integer.MIN_VALUE;
                Object obj = txsVar.k;
                nm6 nm6Var = nm6.a;
                i = txsVar.m;
                MainDatabase mainDatabase = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    tdh tdhVar = this.b.a;
                    txsVar.j = atnVar;
                    txsVar.m = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    atnVar = txsVar.j;
                    qgg.h0(obj);
                }
                o4h E = mainDatabase.E();
                txsVar.j = null;
                txsVar.m = 2;
                E.getClass();
                TreeMap treeMap = afo.h;
                j6e a = wyf.x(atnVar).a();
                Object G = up6.G(E.a, true, false, new g20((String) a.a, a, E, 3), txsVar);
                return G != nm6Var ? nm6Var : G;
            }
        }
        txsVar = new txs(this, cg6Var);
        Object obj2 = txsVar.k;
        nm6 nm6Var2 = nm6.a;
        i = txsVar.m;
        MainDatabase mainDatabase2 = this.a;
        if (i != 0) {
        }
        o4h E2 = mainDatabase2.E();
        txsVar.j = null;
        txsVar.m = 2;
        E2.getClass();
        TreeMap treeMap2 = afo.h;
        j6e a2 = wyf.x(atnVar).a();
        Object G2 = up6.G(E2.a, true, false, new g20((String) a2.a, a2, E2, 3), txsVar);
        if (G2 != nm6Var2) {
        }
    }
}
