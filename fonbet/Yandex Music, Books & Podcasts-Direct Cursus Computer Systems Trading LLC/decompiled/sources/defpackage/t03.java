package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class t03 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t03(Function1 function1, ft7 ft7Var, String str) {
        super(0);
        this.r = 0;
        this.t = (uif) function1;
        this.u = ft7Var;
        this.s = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0367, code lost:
    
        if (r0.u == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0369, code lost:
    
        r1 = r0.T0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x036d, code lost:
    
        if (r1 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0375, code lost:
    
        if (r0.U0(r1, r0.w) != true) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0379, code lost:
    
        if (r2 == 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x037b, code lost:
    
        r0.u = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0378, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x037d, code lost:
    
        ((defpackage.wmt) r10.u).e = defpackage.dc6.S0(r0, (defpackage.sh3) r10.s);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x038d, code lost:
    
        return kotlin.Unit.a;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        List F;
        f23 f23Var;
        HashSet u0;
        Object t7oVar;
        HashSet u02;
        Object t7oVar2;
        int i = 4;
        int i2 = 1;
        int i3 = 3;
        int i4 = 0;
        Continuation continuation = null;
        switch (this.r) {
            case 0:
                ((uif) this.t).invoke(new cro(((ft7) this.u).a, (String) this.s));
                return Unit.a;
            case 1:
                return ((t23) this.t).f.a.C(new bj4((String) this.s, (String) this.u, 0), vsf.Z, p1j.b);
            case 2:
                ph3 ph3Var = (ph3) this.t;
                ynn S0 = ph3.S0(ph3Var, (f8j) this.u, (ha0) this.s);
                if (S0 == null) {
                    return null;
                }
                dc6 dc6Var = ph3Var.o;
                if (hqe.a(dc6Var.w, 0L)) {
                    vme.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return S0.l(dc6Var.W0(S0, dc6Var.w) ^ (-9223372034707292160L));
            case 3:
                List list = (List) this.u;
                irf irfVar = ((ha4) this.t).b;
                if (irfVar != null && (F = irfVar.F(list, (String) this.s)) != null) {
                    list = F;
                }
                List<Certificate> list2 = list;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                for (Certificate certificate : list2) {
                    certificate.getClass();
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 4:
                dc6 dc6Var2 = (dc6) this.t;
                xzi xziVar = dc6Var2.s;
                while (true) {
                    eqi eqiVar = (eqi) xziVar.a;
                    int i5 = eqiVar.c;
                    if (i5 == 0) {
                        break;
                    } else {
                        if (i5 == 0) {
                            wvs.h("MutableVector is empty.");
                            return null;
                        }
                        ynn ynnVar = (ynn) ((cc6) eqiVar.a[i5 - 1]).a.invoke();
                        if (!(ynnVar == null ? true : dc6Var2.U0(ynnVar, dc6Var2.w))) {
                            break;
                        } else {
                            eqi eqiVar2 = (eqi) xziVar.a;
                            zt3 zt3Var = ((cc6) eqiVar2.m(eqiVar2.c - 1)).b;
                            Unit unit = Unit.a;
                            r7o r7oVar = z7o.b;
                            zt3Var.resumeWith(unit);
                        }
                    }
                }
            case 5:
                x97.y((mm6) this.t, null, pm6.d, new rc4((aqi) this.u, (qbs) this.s, continuation, 19), 1);
                return Unit.a;
            case 6:
                ((Executor) this.t).execute(new qf0(26, (ls6) this.u, this.s));
                return Unit.a;
            case 7:
                ((Executor) this.t).execute(new jt6(i4, (ls6) this.u, (xqn) this.s));
                return Unit.a;
            case 8:
                StringBuilder sb = new StringBuilder("During clear credential sign out failed with ");
                Exception exc = (Exception) this.t;
                sb.append(exc);
                Log.w("PlayServicesImpl", sb.toString());
                ((Executor) this.u).execute(new jt6(i2, (ls6) this.s, exc));
                return Unit.a;
            case 9:
                gl7 gl7Var = (gl7) this.t;
                so3 so3Var = (so3) this.u;
                db7 a = ((vdg) this.s).a();
                return (!gl7Var.a.a || so3Var == null) ? a : new al7(so3Var, a);
            case 10:
                f23Var = (f23) this.u;
                ((g23) this.t).d();
                try {
                    ((hp8) this.s).s.a();
                    g23.b(f23Var);
                    return Unit.a;
                } finally {
                    g23.b(f23Var);
                }
            case 11:
                efb efbVar = ((gm9) this.t).j;
                gc8 gc8Var = (gc8) this.u;
                dfb a2 = efbVar.a(gc8Var.getDivData(), gc8Var.getDataTag());
                String c = ((pm9) this.s).c();
                z7k z7kVar = a8k.a;
                a2.d(new z7k(b8k.b, hrg.q("Value for key 'id' at path '", c, "' is missing"), null, null, null, 28));
                return Unit.a;
            case 12:
                f23Var = (f23) this.u;
                ygb ygbVar = (ygb) this.s;
                ((g23) this.t).d();
                try {
                    if (ygb.a(ygbVar)) {
                        fdu fduVar = ygbVar.c;
                        kma kmaVar = new kma(i, ygbVar);
                        kmaVar.invoke(fduVar.a);
                        fduVar.b.add(kmaVar);
                        ViewGroup viewGroup = ygbVar.h;
                        if (viewGroup != null) {
                            ygbVar.b(viewGroup);
                        }
                    } else {
                        if7 if7Var = ygbVar.i;
                        if (if7Var != null) {
                            if7Var.close();
                        }
                        ygbVar.i = null;
                    }
                    g23.b(f23Var);
                    return Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            case 13:
                if (((tqb) this.t).d) {
                    crb crbVar = (crb) this.u;
                    yjj yjjVar = crbVar.m;
                    synchronized (yjjVar.a) {
                        u02 = CollectionsKt.u0(yjjVar.a);
                    }
                    Iterator it = u02.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        try {
                            r7o r7oVar2 = z7o.b;
                            ((zbl) next).Q(crbVar.B.b);
                            t7oVar2 = Unit.a;
                        } catch (Throwable th2) {
                            r7o r7oVar3 = z7o.b;
                            t7oVar2 = new t7o(th2);
                        }
                        Throwable a3 = z7o.a(t7oVar2);
                        if (a3 != null) {
                            Timber.INSTANCE.e(a3, "notifyObservers", new Object[0]);
                        }
                    }
                }
                long j = ((vqb) this.s).b;
                tqb tqbVar = (tqb) this.t;
                if (j != tqbVar.c) {
                    yjj yjjVar2 = ((crb) this.u).m;
                    synchronized (yjjVar2.a) {
                        u0 = CollectionsKt.u0(yjjVar2.a);
                    }
                    Iterator it2 = u0.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        try {
                            r7o r7oVar4 = z7o.b;
                            ((zbl) next2).z(tqbVar.c);
                            t7oVar = Unit.a;
                        } catch (Throwable th3) {
                            r7o r7oVar5 = z7o.b;
                            t7oVar = new t7o(th3);
                        }
                        Throwable a4 = z7o.a(t7oVar);
                        if (a4 != null) {
                            Timber.INSTANCE.e(a4, "notifyObservers", new Object[0]);
                        }
                    }
                    ((vqb) this.s).b = ((tqb) this.t).c;
                }
                return Unit.a;
            case 14:
                ((Function1) this.t).invoke(((pzb) this.u).a((xzb) this.s));
                return Unit.a;
            case 15:
                return new u2k((ryc) ((aqi) this.t).getValue(), (Function1) ((aqi) this.u).getValue(), ((Number) ((Function0) this.s).invoke()).intValue());
            case 16:
                vuf vufVar = (vuf) ((zx7) this.t).getValue();
                fvf fvfVar = (fvf) this.u;
                return new wuf(fvfVar, vufVar, (atf) this.s, new x0((IntRange) fvfVar.d.f.getValue(), vufVar));
            case 17:
                zcq zcqVar = (zcq) this.t;
                if (((Boolean) ((Function1) zcqVar.b.d).invoke(gdq.a)).booleanValue()) {
                    x97.y((mm6) this.u, null, null, new bbi(zcqVar, continuation, i3), 3).R(new gbi(zcqVar, (Function0) this.s, i4));
                }
                return Unit.a;
            case 18:
                if (((Boolean) ((Function1) ((zcq) this.t).b.d).invoke(gdq.b)).booleanValue()) {
                    x97.y((mm6) this.u, null, null, new bbi((zcq) this.s, continuation, i), 3);
                }
                return Boolean.TRUE;
            case 19:
                d3k d3kVar = (d3k) this.t;
                qg8.c(d3kVar.c, d3kVar.a, ((k79) this.u).b, (List) this.s, "selection");
                return Unit.a;
            case 20:
                ((mgk) this.t).j = (mek) this.u;
                ime imeVar = (ime) this.s;
                Unit unit2 = Unit.a;
                imeVar.onSuccess(unit2);
                return unit2;
            case 21:
                irf irfVar2 = ((ha4) this.t).b;
                irfVar2.getClass();
                return irfVar2.F(((hsd) this.u).a(), ((mn) this.s).h.d);
            default:
                z5 z5Var = (z5) this.t;
                z5Var.removeOnAttachStateChangeListener((xdu) this.u);
                tyf.w(z5Var).a.remove((ydu) this.s);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t03(t23 t23Var, String str, String str2) {
        super(0);
        this.r = 1;
        this.t = t23Var;
        this.s = str;
        this.u = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t03(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.s = obj3;
    }
}
