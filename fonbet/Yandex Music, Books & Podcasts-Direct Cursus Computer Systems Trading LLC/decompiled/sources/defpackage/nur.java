package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.View;
import android.view.WindowInsetsAnimation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.yandex.passport.api.k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class nur implements w8p, bgn, jpj, p7q, pun, OnCompleteListener, u0x {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public nur(mqs mqsVar) {
        this.a = 6;
        mqsVar.getClass();
        this.b = mqsVar;
        StationId o = StationId.o(mqsVar.a);
        o.getClass();
        this.c = o8g.E(c9g.E(o));
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        xhu xhuVar = (xhu) this.b;
        weg wegVar = (weg) this.c;
        weg wegVar2 = new weg();
        wegVar2.a = wegVar.a;
        wegVar2.b = wegVar.b;
        wegVar2.c = wegVar.c;
        wegVar2.d = wegVar.d;
        return xhuVar.h(view, kqvVar, wegVar2);
    }

    public void a(n0 n0Var, String str) {
        ((zh2) this.b).getClass();
        s0 Y = jf0.Y(n0Var, str);
        Vector vector = (Vector) this.c;
        nen nenVar = new nen();
        e0 e0Var = new e0(2);
        e0Var.e(n0Var);
        e0Var.e(Y);
        d07 d07Var = new d07(e0Var);
        d07Var.c = -1;
        e07 e07Var = new e07(d07Var);
        e07Var.d = -1;
        nenVar.a = e07Var;
        vector.addElement(nenVar);
    }

    @Override // defpackage.pun
    public void accept(Object obj, Object obj2) {
        zyw zywVar = (zyw) this.b;
        rad radVar = (rad) this.c;
        yyw yywVar = new yyw(3, (i8s) obj2);
        szw szwVar = (szw) ((azw) obj).s();
        String str = zywVar.k;
        Parcel X = szwVar.X();
        int i = ezw.a;
        X.writeStrongBinder(yywVar);
        ezw.c(X, radVar);
        X.writeString(str);
        szwVar.p0(X, 4);
    }

    @Override // defpackage.w8p
    public void b(d7k d7kVar) {
        ebt ebtVar = (ebt) this.c;
        SparseArray sparseArray = ebtVar.h;
        v94 v94Var = (v94) this.b;
        if (d7kVar.v() == 0 && (d7kVar.v() & 128) != 0) {
            d7kVar.I(6);
            int a = d7kVar.a() / 4;
            for (int i = 0; i < a; i++) {
                d7kVar.f(v94Var.b, 0, 4);
                v94Var.q(0);
                int i2 = v94Var.i(16);
                v94Var.t(3);
                if (i2 == 0) {
                    v94Var.t(13);
                } else {
                    int i3 = v94Var.i(13);
                    if (sparseArray.get(i3) == null) {
                        sparseArray.put(i3, new x8p(new c1t(ebtVar, i3)));
                        ebtVar.n++;
                    }
                }
            }
            if (ebtVar.a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r7.d(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(cg6 cg6Var) {
        qns qnsVar;
        Object obj;
        int i;
        Object a;
        if (cg6Var instanceof qns) {
            qnsVar = (qns) cg6Var;
            int i2 = qnsVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qnsVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = qnsVar.j;
                obj = nm6.a;
                i = qnsVar.l;
                int i3 = 2;
                if (i != 0) {
                    qgg.h0(obj2);
                    c9k c9kVar = (c9k) this.c;
                    qnsVar.l = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                wns wnsVar = (wns) this.b;
                qnsVar.l = 2;
                a = lmm.a((wb7) wnsVar.b.getValue(), new z0i(i3, 28, null), qnsVar);
                if (a != obj) {
                    a = Unit.a;
                }
            }
        }
        qnsVar = new qns(this, cg6Var);
        Object obj22 = qnsVar.j;
        obj = nm6.a;
        i = qnsVar.l;
        int i32 = 2;
        if (i != 0) {
        }
        wns wnsVar2 = (wns) this.b;
        qnsVar.l = 2;
        a = lmm.a((wb7) wnsVar2.b.getValue(), new z0i(i32, 28, null), qnsVar);
        if (a != obj) {
        }
    }

    @Override // defpackage.u0x
    public Object d() {
        return new ikx(((k81) ((c5p) this.b).b).a, (xlx) ((u0x) this.c).d());
    }

    @Override // defpackage.bgn
    public Object f(long j, fr4 fr4Var) {
        return ((nnd) this.c).f(j, fr4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (r9 == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        if (r9 == r2) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(String str, cg6 cg6Var) {
        rns rnsVar;
        int i;
        String str2;
        wns wnsVar = (wns) this.b;
        if (cg6Var instanceof rns) {
            rnsVar = (rns) cg6Var;
            int i2 = rnsVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rnsVar.n = i2 - Integer.MIN_VALUE;
                Object obj = rnsVar.l;
                nm6 nm6Var = nm6.a;
                i = rnsVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    rnsVar.j = str;
                    rnsVar.n = 1;
                    obj = wnsVar.a(str, rnsVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            String str3 = rnsVar.k;
                            qgg.h0(obj);
                            return str3;
                        }
                        str = rnsVar.j;
                        qgg.h0(obj);
                        String str4 = (String) obj;
                        if (str4 == null) {
                            return null;
                        }
                        rnsVar.j = null;
                        rnsVar.k = str4;
                        rnsVar.n = 3;
                        return wnsVar.b(str, str4, rnsVar) == nm6Var ? nm6Var : str4;
                    }
                    str = rnsVar.j;
                    qgg.h0(obj);
                }
                str2 = (String) obj;
                if (str2 == null) {
                    return str2;
                }
                c9k c9kVar = (c9k) this.c;
                rnsVar.j = str;
                rnsVar.n = 2;
                obj = c9kVar.n(str, rnsVar);
            }
        }
        rnsVar = new rns(this, cg6Var);
        Object obj2 = rnsVar.l;
        nm6 nm6Var2 = nm6.a;
        i = rnsVar.n;
        if (i != 0) {
        }
        str2 = (String) obj2;
        if (str2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004c, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(String str, cg6 cg6Var) {
        sns snsVar;
        int i;
        Object l;
        z7o z7oVar;
        String str2;
        z7o z7oVar2;
        Object obj;
        if (cg6Var instanceof sns) {
            snsVar = (sns) cg6Var;
            int i2 = snsVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                snsVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = snsVar.l;
                nm6 nm6Var = nm6.a;
                i = snsVar.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    c9k c9kVar = (c9k) this.c;
                    snsVar.j = str;
                    snsVar.n = 1;
                    l = c9kVar.l(str, snsVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z7oVar2 = snsVar.k;
                        qgg.h0(obj2);
                        z7oVar = z7oVar2;
                        obj = z7oVar.a;
                        if (obj instanceof t7o) {
                            return obj;
                        }
                        r7o r7oVar = z7o.b;
                        return ((k) obj).a;
                    }
                    str = snsVar.j;
                    qgg.h0(obj2);
                    l = ((z7o) obj2).a;
                }
                z7oVar = new z7o(l);
                if (l instanceof t7o) {
                    l = null;
                }
                k kVar = (k) l;
                str2 = kVar == null ? kVar.a : null;
                if (str2 != null) {
                    wns wnsVar = (wns) this.b;
                    snsVar.j = null;
                    snsVar.k = z7oVar;
                    snsVar.n = 2;
                    if (wnsVar.b(str, str2, snsVar) != nm6Var) {
                        z7oVar2 = z7oVar;
                        z7oVar = z7oVar2;
                    }
                    return nm6Var;
                }
                obj = z7oVar.a;
                if (obj instanceof t7o) {
                }
            }
        }
        snsVar = new sns(this, cg6Var);
        Object obj22 = snsVar.l;
        nm6 nm6Var2 = nm6.a;
        i = snsVar.n;
        if (i != 0) {
        }
        z7oVar = new z7o(l);
        if (l instanceof t7o) {
        }
        k kVar2 = (k) l;
        if (kVar2 == null) {
        }
        if (str2 != null) {
        }
        obj = z7oVar.a;
        if (obj instanceof t7o) {
        }
    }

    public void i(ejw ejwVar) {
        Unit unit;
        ejwVar.getClass();
        this.b = ejwVar;
        HashMap hashMap = (HashMap) this.c;
        hashMap.clear();
        if (!(ejwVar instanceof djw)) {
            if ((ejwVar instanceof cjw) || (ejwVar instanceof ajw) || (ejwVar instanceof bjw)) {
                return;
            }
            b6e.s();
            return;
        }
        Map map = ((djw) ejwVar).a.f().b;
        if (((ejw) this.b) instanceof djw) {
            unit = Unit.a;
        } else {
            unit = null;
            su4.s(2, null, "Only SharedYnisonWaveEntity entity can have sources", null);
        }
        if (unit == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            b6v b6vVar = (b6v) entry.getValue();
            hashMap.put(b6vVar.a.getId(), new pkw(b6vVar, intValue));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
    
        if (r10 != r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0055, code lost:
    
        if (r0.d(r1) == r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(String str, cg6 cg6Var) {
        tns tnsVar;
        int i;
        Object l;
        z7o z7oVar;
        z7o z7oVar2;
        Object obj;
        c9k c9kVar = (c9k) this.c;
        if (cg6Var instanceof tns) {
            tnsVar = (tns) cg6Var;
            int i2 = tnsVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tnsVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = tnsVar.l;
                nm6 nm6Var = nm6.a;
                i = tnsVar.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    tnsVar.j = str;
                    tnsVar.n = 1;
                } else if (i == 1) {
                    str = tnsVar.j;
                    qgg.h0(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z7oVar2 = tnsVar.k;
                        qgg.h0(obj2);
                        z7oVar = z7oVar2;
                        obj = z7oVar.a;
                        if (!(obj instanceof t7o)) {
                            return obj;
                        }
                        r7o r7oVar = z7o.b;
                        return ((k) obj).a;
                    }
                    str = tnsVar.j;
                    qgg.h0(obj2);
                    l = ((z7o) obj2).a;
                    z7oVar = new z7o(l);
                    if (l instanceof t7o) {
                        l = null;
                    }
                    k kVar = (k) l;
                    String str2 = kVar != null ? kVar.a : null;
                    if (str2 != null) {
                        wns wnsVar = (wns) this.b;
                        tnsVar.j = null;
                        tnsVar.k = z7oVar;
                        tnsVar.n = 3;
                        if (wnsVar.b(str, str2, tnsVar) != nm6Var) {
                            z7oVar2 = z7oVar;
                            z7oVar = z7oVar2;
                        }
                        return nm6Var;
                    }
                    obj = z7oVar.a;
                    if (!(obj instanceof t7o)) {
                    }
                }
                tnsVar.j = str;
                tnsVar.n = 2;
                l = c9kVar.l(str, tnsVar);
            }
        }
        tnsVar = new tns(this, cg6Var);
        Object obj22 = tnsVar.l;
        nm6 nm6Var2 = nm6.a;
        i = tnsVar.n;
        if (i != 0) {
        }
        tnsVar.j = str;
        tnsVar.n = 2;
        l = c9kVar.l(str, tnsVar);
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        s9p e;
        boolean z;
        mqs mqsVar = (mqs) this.b;
        szuVar.getClass();
        e5q e5qVar = szuVar.a;
        if (e5qVar instanceof u4q) {
            e = ((u4q) e5qVar).a.a;
        } else if (e5qVar instanceof s4q) {
            e = ((s4q) e5qVar).a.a;
        } else if (e5qVar instanceof w4q) {
            e = ((w4q) e5qVar).a.a;
        } else {
            if (!(e5qVar instanceof y4q)) {
                if (!(e5qVar instanceof b5q)) {
                    b6e.s();
                    return null;
                }
                List j = szuVar.j();
                rr5 d = mqsVar.d();
                mqs a = ((mwk) CollectionsKt.Q(j)).a();
                return Boolean.valueOf(d.equals(a != null ? a.d() : null));
            }
            e = ((y4q) e5qVar).a.e();
        }
        List j2 = szuVar.j();
        if (!e.b((s9p) this.c) || j2.isEmpty()) {
            z = false;
        } else {
            rr5 d2 = mqsVar.d();
            mqs a2 = ((mwk) CollectionsKt.Q(j2)).a();
            z = d2.equals(a2 != null ? a2.d() : null);
        }
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        zlx zlxVar = (zlx) this.b;
        i8s i8sVar = (i8s) this.c;
        synchronized (zlxVar.f) {
            zlxVar.e.remove(i8sVar);
        }
    }

    @Override // defpackage.bgn
    public Object p(int i, long j, fr4 fr4Var) {
        return ((nnd) this.c).p(i, j, fr4Var);
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        f5q k = maqVar.k();
        boolean z = false;
        if (k instanceof abq) {
            s9p d = ((abq) k).a.d();
            List j = maqVar.j();
            if (d.b((s9p) this.c) && !j.isEmpty()) {
                rr5 d2 = ((mqs) this.b).d();
                mqs a = ((mwk) CollectionsKt.Q(j)).a();
                z = d2.equals(a != null ? a.d() : null);
            }
        } else if (!(k instanceof s9q) && !(k instanceof baq) && !(k instanceof oaq) && !(k instanceof taq) && !(k instanceof xaq)) {
            b6e.s();
            return null;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bgn
    public Object r(w5j w5jVar, long j, fr4 fr4Var) {
        return ((nnd) this.c).r(w5jVar, j, fr4Var);
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        z3q z3qVar = t1qVar.a;
        boolean z = false;
        if (z3qVar instanceof u1q) {
            if (((s9p) ((u1q) z3qVar).c.d.getValue()).b((s9p) this.c)) {
                mqs a = t1qVar.c.a();
                if (Intrinsics.d(a != null ? a.d() : null, ((mqs) this.b).d())) {
                    z = true;
                }
            }
        } else if (!(z3qVar instanceof r1q) && !(z3qVar instanceof a2q) && !(z3qVar instanceof c1q) && !(z3qVar instanceof e1q) && !(z3qVar instanceof h1q) && !(z3qVar instanceof k1q)) {
            b6e.s();
            return null;
        }
        return Boolean.valueOf(z);
    }

    public String toString() {
        switch (this.a) {
            case 8:
                return "Bounds{lower=" + ((zne) this.b) + " upper=" + ((zne) this.c) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return Boolean.FALSE;
    }

    public /* synthetic */ nur(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public nur(Context context) {
        this.a = 12;
        this.b = context;
    }

    public nur() {
        this.a = 3;
        this.b = new qst(this);
    }

    public nur(ote oteVar, vh4 vh4Var) {
        this.a = 7;
        oteVar.getClass();
        this.b = oteVar;
        this.c = vh4Var;
    }

    public nur(b56 b56Var, cr crVar, a aVar) {
        this.a = 4;
        aVar.getClass();
        this.b = b56Var;
        this.c = new nnd(b56Var, crVar, aVar);
    }

    public nur(WindowInsetsAnimation.Bounds bounds) {
        this.a = 8;
        this.b = tpv.g(bounds);
        this.c = tpv.f(bounds);
    }

    public /* synthetic */ nur(int i) {
        this.a = i;
    }

    public nur(ebt ebtVar) {
        this.a = 2;
        this.c = ebtVar;
        this.b = new v94(new byte[4], 4);
    }

    @Override // defpackage.w8p
    public void e(ojs ojsVar, t2c t2cVar, cp2 cp2Var) {
    }
}
