package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class cw {
    public final MainDatabase a;
    public final ydh b;

    public cw(MainDatabase mainDatabase, ydh ydhVar) {
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
        aw awVar;
        int i;
        if (cg6Var instanceof aw) {
            awVar = (aw) cg6Var;
            int i2 = awVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                awVar.m = i2 - Integer.MIN_VALUE;
                Object obj = awVar.k;
                nm6 nm6Var = nm6.a;
                i = awVar.m;
                MainDatabase mainDatabase = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    tdh tdhVar = this.b.c;
                    awVar.j = atnVar;
                    awVar.m = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    atnVar = awVar.j;
                    qgg.h0(obj);
                }
                hjn P = mainDatabase.P();
                awVar.j = null;
                awVar.m = 2;
                Object a = P.a(atnVar, awVar);
                return a != nm6Var ? nm6Var : a;
            }
        }
        awVar = new aw(this, cg6Var);
        Object obj2 = awVar.k;
        nm6 nm6Var2 = nm6.a;
        i = awVar.m;
        MainDatabase mainDatabase2 = this.a;
        if (i != 0) {
        }
        hjn P2 = mainDatabase2.P();
        awVar.j = null;
        awVar.m = 2;
        Object a2 = P2.a(atnVar, awVar);
        if (a2 != nm6Var2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r9.a(r4, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(atn atnVar, cg6 cg6Var) {
        bw bwVar;
        int i;
        if (cg6Var instanceof bw) {
            bwVar = (bw) cg6Var;
            int i2 = bwVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bwVar.m = i2 - Integer.MIN_VALUE;
                Object obj = bwVar.k;
                nm6 nm6Var = nm6.a;
                i = bwVar.m;
                MainDatabase mainDatabase = this.a;
                int i3 = 2;
                if (i != 0) {
                    qgg.h0(obj);
                    tdh tdhVar = this.b.c;
                    bwVar.j = atnVar;
                    bwVar.m = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    atnVar = bwVar.j;
                    qgg.h0(obj);
                }
                o4h E = mainDatabase.E();
                bwVar.j = null;
                bwVar.m = 2;
                E.getClass();
                TreeMap treeMap = afo.h;
                j6e a = wyf.x(atnVar).a();
                Object G = up6.G(E.a, true, false, new g20((String) a.a, a, E, i3), bwVar);
                return G != nm6Var ? nm6Var : G;
            }
        }
        bwVar = new bw(this, cg6Var);
        Object obj2 = bwVar.k;
        nm6 nm6Var2 = nm6.a;
        i = bwVar.m;
        MainDatabase mainDatabase2 = this.a;
        int i32 = 2;
        if (i != 0) {
        }
        o4h E2 = mainDatabase2.E();
        bwVar.j = null;
        bwVar.m = 2;
        E2.getClass();
        TreeMap treeMap2 = afo.h;
        j6e a2 = wyf.x(atnVar).a();
        Object G2 = up6.G(E2.a, true, false, new g20((String) a2.a, a2, E2, i32), bwVar);
        if (G2 != nm6Var2) {
        }
    }
}
