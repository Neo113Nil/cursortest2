package defpackage;

import com.yandex.music.shared.player.informer.data.storage.a;
import com.yandex.music.shared.player.informer.data.storage.b;
import defpackage.hmm;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class kel {
    public static final hmm.a d = new hmm.a("impressions");
    public final frt a;
    public final cc7 b;
    public final jyr c;

    public kel(cc7 cc7Var, frt frtVar) {
        frtVar.getClass();
        cc7Var.getClass();
        this.a = frtVar;
        this.b = cc7Var;
        this.c = btf.b(new aok(24));
    }

    public static ArrayList d(List list) {
        long currentTimeMillis = System.currentTimeMillis();
        msa msaVar = nsa.b;
        long f = currentTimeMillis - nsa.f(yd5.M(1, ssa.DAYS));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((eel) obj).a() > f) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        hel helVar;
        int i;
        xxq xxqVar;
        if (cg6Var instanceof hel) {
            helVar = (hel) cg6Var;
            int i2 = helVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                helVar.l = i2 - Integer.MIN_VALUE;
                Object obj = helVar.j;
                nm6 nm6Var = nm6.a;
                i = helVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc g = this.a.g();
                    helVar.l = 1;
                    obj = zsd.i0(g, helVar);
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
                xxqVar = (xxq) obj;
                if (xxqVar != null) {
                    return null;
                }
                return ((dc7) this.b).c(xxqVar.a, "artist_informers_impressions");
            }
        }
        helVar = new hel(this, cg6Var);
        Object obj2 = helVar.j;
        nm6 nm6Var2 = nm6.a;
        i = helVar.l;
        if (i != 0) {
        }
        xxqVar = (xxq) obj2;
        if (xxqVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r7.a(r2, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(eel eelVar, cg6 cg6Var) {
        iel ielVar;
        int i;
        wb7 wb7Var;
        if (cg6Var instanceof iel) {
            ielVar = (iel) cg6Var;
            int i2 = ielVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ielVar.m = i2 - Integer.MIN_VALUE;
                Object obj = ielVar.k;
                Object obj2 = nm6.a;
                i = ielVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    ielVar.j = eelVar;
                    ielVar.m = 1;
                    obj = a(ielVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eelVar = ielVar.j;
                    qgg.h0(obj);
                }
                wb7Var = (wb7) obj;
                if (wb7Var != null) {
                    return Unit.a;
                }
                b bVar = new b(this, eelVar, null);
                ielVar.j = null;
                ielVar.m = 2;
            }
        }
        ielVar = new iel(this, cg6Var);
        Object obj3 = ielVar.k;
        Object obj22 = nm6.a;
        i = ielVar.m;
        if (i != 0) {
        }
        wb7Var = (wb7) obj3;
        if (wb7Var != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        if (r7 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0044, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(boolean z, cg6 cg6Var) {
        jel jelVar;
        Object obj;
        int i;
        wb7 wb7Var;
        pjc data;
        String str;
        List a;
        if (cg6Var instanceof jel) {
            jelVar = (jel) cg6Var;
            int i2 = jelVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jelVar.m = i2 - Integer.MIN_VALUE;
                obj = jelVar.k;
                nm6 nm6Var = nm6.a;
                i = jelVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    jelVar.j = z;
                    jelVar.m = 1;
                    obj = a(jelVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = jelVar.j;
                        qgg.h0(obj);
                        hmm hmmVar = (hmm) obj;
                        if (hmmVar != null && (str = (String) hmmVar.a(d)) != null && (a = ((a) this.c.getValue()).a(str)) != null) {
                            return z ? d(a) : (Serializable) a;
                        }
                        return c5b.a;
                    }
                    z = jelVar.j;
                    qgg.h0(obj);
                }
                wb7Var = (wb7) obj;
                if (wb7Var != null && (data = wb7Var.getData()) != null) {
                    jelVar.j = z;
                    jelVar.m = 2;
                    obj = zsd.i0(data, jelVar);
                }
                return c5b.a;
            }
        }
        jelVar = new jel(this, cg6Var);
        obj = jelVar.k;
        nm6 nm6Var2 = nm6.a;
        i = jelVar.m;
        if (i != 0) {
        }
        wb7Var = (wb7) obj;
        if (wb7Var != null) {
            jelVar.j = z;
            jelVar.m = 2;
            obj = zsd.i0(data, jelVar);
        }
        return c5b.a;
    }
}
