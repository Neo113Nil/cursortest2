package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class vkm {
    public final i5h a;

    public vkm(i5h i5hVar) {
        this.a = i5hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        rkm rkmVar;
        int i;
        if (cg6Var instanceof rkm) {
            rkmVar = (rkm) cg6Var;
            int i2 = rkmVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rkmVar.l = i2 - Integer.MIN_VALUE;
                Object obj = rkmVar.j;
                nm6 nm6Var = nm6.a;
                i = rkmVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    rkmVar.l = 1;
                    obj = this.a.b(str, rkmVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return ((MainDatabase) obj).O();
            }
        }
        rkmVar = new rkm(this, cg6Var);
        Object obj2 = rkmVar.j;
        nm6 nm6Var2 = nm6.a;
        i = rkmVar.l;
        if (i != 0) {
        }
        return ((MainDatabase) obj2).O();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (r10 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r10 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
    
        if (r13 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        if (r13 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, pkm pkmVar, cg6 cg6Var) {
        skm skmVar;
        int i;
        if (cg6Var instanceof skm) {
            skmVar = (skm) cg6Var;
            int i2 = skmVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                skmVar.n = i2 - Integer.MIN_VALUE;
                Object obj = skmVar.l;
                Object obj2 = nm6.a;
                i = skmVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (pkmVar != null) {
                        skmVar.j = str2;
                        skmVar.k = pkmVar;
                        skmVar.n = 1;
                        obj = a(str, skmVar);
                    } else {
                        skmVar.j = str2;
                        skmVar.k = null;
                        skmVar.n = 3;
                        obj = a(str, skmVar);
                    }
                    return obj2;
                }
                if (i == 1) {
                    pkmVar = skmVar.k;
                    str2 = skmVar.j;
                    qgg.h0(obj);
                    String obj3 = pkmVar.toString();
                    skmVar.j = null;
                    skmVar.k = null;
                    skmVar.n = 2;
                    Object G = up6.G(((flm) obj).a, false, true, new cb(str2, obj3, 7), skmVar);
                    if (G != obj2) {
                        G = Unit.a;
                    }
                } else {
                    if (i == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    if (i != 3) {
                        if (i == 4) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = skmVar.j;
                    qgg.h0(obj);
                    skmVar.j = null;
                    skmVar.k = null;
                    skmVar.n = 4;
                    Object G2 = up6.G(((flm) obj).a, false, true, new q1h(str2, 23), skmVar);
                    if (G2 != obj2) {
                        G2 = Unit.a;
                    }
                }
            }
        }
        skmVar = new skm(this, cg6Var);
        Object obj4 = skmVar.l;
        Object obj22 = nm6.a;
        i = skmVar.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(String str, cg6 cg6Var) {
        tkm tkmVar;
        int i;
        if (cg6Var instanceof tkm) {
            tkmVar = (tkm) cg6Var;
            int i2 = tkmVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tkmVar.l = i2 - Integer.MIN_VALUE;
                Object obj = tkmVar.j;
                nm6 nm6Var = nm6.a;
                i = tkmVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    tkmVar.l = 1;
                    obj = a(str, tkmVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Iterable<wkm> iterable = (Iterable) obj;
                        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                        for (wkm wkmVar : iterable) {
                            arrayList.add(new qkm(wkmVar.a, wkmVar.b, pkm.valueOf(wkmVar.c)));
                        }
                        return arrayList;
                    }
                    qgg.h0(obj);
                }
                tkmVar.l = 2;
                obj = up6.G(((flm) obj).a, true, false, new gkm(1), tkmVar);
            }
        }
        tkmVar = new tkm(this, cg6Var);
        Object obj2 = tkmVar.j;
        nm6 nm6Var2 = nm6.a;
        i = tkmVar.l;
        if (i != 0) {
        }
        tkmVar.l = 2;
        obj2 = up6.G(((flm) obj2).a, true, false, new gkm(1), tkmVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, qkm qkmVar, cg6 cg6Var) {
        ukm ukmVar;
        Object obj;
        int i;
        Object G;
        if (cg6Var instanceof ukm) {
            ukmVar = (ukm) cg6Var;
            int i2 = ukmVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ukmVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = ukmVar.k;
                obj = nm6.a;
                i = ukmVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    ukmVar.j = qkmVar;
                    ukmVar.m = 1;
                    obj2 = a(str, ukmVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qkmVar = ukmVar.j;
                    qgg.h0(obj2);
                }
                flm flmVar = (flm) obj2;
                wkm wkmVar = new wkm(qkmVar.a, qkmVar.b, qkmVar.c.toString());
                ukmVar.j = null;
                ukmVar.m = 2;
                G = up6.G(flmVar.a, false, true, new avi(28, flmVar, wkmVar), ukmVar);
                if (G != obj) {
                    G = Unit.a;
                }
            }
        }
        ukmVar = new ukm(this, cg6Var);
        Object obj22 = ukmVar.k;
        obj = nm6.a;
        i = ukmVar.m;
        if (i != 0) {
        }
        flm flmVar2 = (flm) obj22;
        wkm wkmVar2 = new wkm(qkmVar.a, qkmVar.b, qkmVar.c.toString());
        ukmVar.j = null;
        ukmVar.m = 2;
        G = up6.G(flmVar2.a, false, true, new avi(28, flmVar2, wkmVar2), ukmVar);
        if (G != obj) {
        }
    }
}
