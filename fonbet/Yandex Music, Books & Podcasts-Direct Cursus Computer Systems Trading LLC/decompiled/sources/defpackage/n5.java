package defpackage;

import android.content.SharedPreferences;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.media.ynison.service.e0;
import com.yandex.passport.api.h;
import com.yandex.passport.api.impl.b;
import com.yandex.passport.api.q;
import com.yandex.passport.api.z1;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n5 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public long l;
    public Object m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(o oVar, long j, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.j = 1;
        this.m = oVar;
        this.l = j;
        this.n = str;
        this.o = str2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new n5((s5) this.n, this.l, (uoi) this.o, continuation, 0);
            case 1:
                return new n5((o) this.m, this.l, (String) this.n, (String) this.o, continuation);
            case 2:
                n5 n5Var = new n5((pjc) this.n, (Function2) this.o, this.l, continuation, 2);
                n5Var.m = obj;
                return n5Var;
            case 3:
                return new n5((wqn) this.m, (wqn) this.n, (ase) this.o, this.l, continuation);
            case 4:
                return new n5((ltf) this.n, (wdc) this.o, this.l, continuation, 4);
            case 5:
                return new n5((ocn) this.n, (String) this.o, this.l, continuation, 5);
            case 6:
                return new n5((wbo) this.o, continuation);
            case 7:
                n5 n5Var2 = new n5((iyo) this.n, this.l, (uqn) this.o, continuation, 7);
                n5Var2.m = obj;
                return n5Var2;
            case 8:
                n5 n5Var3 = new n5((sdr) this.n, this.l, (z2h) this.o, continuation, 8);
                n5Var3.m = obj;
                return n5Var3;
            default:
                return new n5((aqi) this.n, this.l, (uoi) this.o, continuation, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((n5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((n5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((n5) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((n5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((n5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((n5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((n5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((n5) create((hyo) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((n5) create((jtm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((n5) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0344, code lost:
    
        if (defpackage.fk0.c(r8, r11, r10, r12, r17, 4) != r9) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0387, code lost:
    
        if (defpackage.a4g.T(r17) == r1) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03a6, code lost:
    
        if (defpackage.y2x.o((r7 - r5) / 1000000, r17) == r1) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x05af, code lost:
    
        if (r3.a(r1, r17) == r7) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0599, code lost:
    
        if (defpackage.y2x.o(r5, r17) == r7) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r0.a(r8, r17) == r6) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0591  */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [xci] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [eqi] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [eqi] */
    /* JADX WARN: Type inference failed for: r3v21, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [arf, java.lang.Object] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        cr crVar;
        ?? r15;
        int i;
        rqm rqmVar;
        wdc wdcVar;
        Object V;
        e0 e0Var;
        String string;
        Pair pair;
        long currentTimeMillis;
        Object t;
        arf arfVar;
        aqi aqiVar;
        rqm rqmVar2;
        rqm rqmVar3;
        int i2 = 0;
        int i3 = 1;
        Object obj2 = null;
        switch (this.j) {
            case 0:
                s5 s5Var = (s5) this.n;
                nm6 nm6Var = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    tqn tqnVar = new tqn();
                    zfm zfmVar = bxo.p;
                    ln4 ln4Var = new ln4(tqnVar, i2);
                    if (!s5Var.a.n) {
                        sme.b("visitAncestors called on an unattached node");
                    }
                    xci xciVar = s5Var.a.e;
                    mpf F = bcx.F(s5Var);
                    while (F != null) {
                        int i5 = ((xci) F.F.f).d;
                        int i6 = SQLiteDatabase.OPEN_PRIVATECACHE;
                        if ((i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                            while (xciVar != null) {
                                if ((xciVar.c & i6) != 0) {
                                    Object obj3 = obj2;
                                    cw7 cw7Var = xciVar;
                                    while (cw7Var != 0) {
                                        if (cw7Var instanceof w9t) {
                                            w9t w9tVar = (w9t) cw7Var;
                                            if (!(zfmVar.equals(w9tVar.h()) ? ((Boolean) ln4Var.invoke(w9tVar)).booleanValue() : true)) {
                                                if (!tqnVar.a) {
                                                    int i7 = qn4.b;
                                                    ViewParent parent = kg5.I(s5Var).getParent();
                                                    while (parent != null && (parent instanceof ViewGroup)) {
                                                        ViewGroup viewGroup = (ViewGroup) parent;
                                                        if (viewGroup.shouldDelayChildPressedState()) {
                                                            z2 = true;
                                                            if (!z2) {
                                                                z = false;
                                                                if (z) {
                                                                    long j = qn4.a;
                                                                    this.k = 1;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            parent = viewGroup.getParent();
                                                        }
                                                    }
                                                    z2 = false;
                                                    if (!z2) {
                                                    }
                                                }
                                                z = true;
                                                if (z) {
                                                }
                                            }
                                        } else {
                                            if (((cw7Var.c & i6) != 0 ? 1 : i2) != 0 && (cw7Var instanceof cw7)) {
                                                xci xciVar2 = cw7Var.p;
                                                xci xciVar3 = cw7Var;
                                                r15 = obj3;
                                                while (xciVar2 != null) {
                                                    int i8 = i6;
                                                    if ((xciVar2.c & i8) != 0) {
                                                        i2++;
                                                        r15 = r15;
                                                        if (i2 == 1) {
                                                            xciVar3 = xciVar2;
                                                        } else {
                                                            if (r15 == 0) {
                                                                r15 = new eqi(new xci[16]);
                                                            }
                                                            if (xciVar3 != null) {
                                                                r15.d(xciVar3);
                                                                xciVar3 = null;
                                                            }
                                                            r15.d(xciVar2);
                                                        }
                                                    }
                                                    xciVar2 = xciVar2.f;
                                                    i6 = i8;
                                                    xciVar3 = xciVar3;
                                                    r15 = r15;
                                                }
                                                i = i6;
                                                r15 = r15;
                                                if (i2 == 1) {
                                                    i6 = i;
                                                    i2 = 0;
                                                    cw7Var = xciVar3;
                                                    obj3 = r15;
                                                }
                                                xciVar3 = bcx.p(r15);
                                                i6 = i;
                                                i2 = 0;
                                                cw7Var = xciVar3;
                                                obj3 = r15;
                                            }
                                        }
                                        i = i6;
                                        r15 = obj3;
                                        xciVar3 = bcx.p(r15);
                                        i6 = i;
                                        i2 = 0;
                                        cw7Var = xciVar3;
                                        obj3 = r15;
                                    }
                                }
                                xciVar = xciVar.e;
                                i6 = i6;
                                obj2 = null;
                                i2 = 0;
                            }
                        }
                        F = F.u();
                        xciVar = (F == null || (crVar = F.F) == null) ? null : (i4s) crVar.e;
                        obj2 = null;
                        i2 = 0;
                    }
                    if (!tqnVar.a) {
                    }
                    z = true;
                    if (z) {
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        rqmVar = (rqm) this.m;
                        qgg.h0(obj);
                        s5Var.z = rqmVar;
                        return Unit.a;
                    }
                    qgg.h0(obj);
                }
                rqmVar = new rqm(this.l);
                uoi uoiVar = (uoi) this.o;
                this.m = rqmVar;
                this.k = 2;
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    av0 av0Var = (av0) ((o) this.m).a.getValue();
                    long j2 = this.l;
                    String str = (String) this.n;
                    String str2 = (String) this.o;
                    this.k = 1;
                    c9k c9kVar = ((iv0) av0Var).b;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(le7.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str3 = r9k.PRODUCTION.a;
                    q qVar = h.b;
                    int parseInt = Integer.parseInt(str3);
                    qVar.getClass();
                    h a = q.a(parseInt);
                    if (a == null) {
                        xq0.x("Required value was null.");
                        return null;
                    }
                    b a2 = b.a(a.d());
                    a2.getClass();
                    Object a3 = c9kVar.a(new z1(a2, j2), str, str2, this);
                    if (a3 != nm6Var2) {
                        a3 = Unit.a;
                    }
                    if (a3 == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                ltm ltmVar = (ltm) this.m;
                nm6 nm6Var3 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    xqn i11 = hrg.i(obj);
                    pjc pjcVar = (pjc) this.n;
                    hkc hkcVar = new hkc(i11, ltmVar, (Function2) this.o, this.l, null);
                    this.m = null;
                    this.k = 1;
                    if (zsd.O(pjcVar, hkcVar, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                ase aseVar = (ase) this.o;
                nm6 nm6Var4 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    long j3 = ((wqn) this.m).a;
                    long j4 = ((wqn) this.n).a;
                    if (j3 < j4) {
                        this.k = 2;
                        break;
                    } else {
                        this.k = 1;
                        break;
                    }
                    return nm6Var4;
                }
                if (i12 == 1) {
                    qgg.h0(obj);
                    long j5 = this.l;
                    aseVar.b.c(j5);
                    synchronized (aseVar.c) {
                        aseVar.e = j5;
                    }
                } else {
                    if (i12 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    long nanoTime = System.nanoTime();
                    aseVar.b.c(nanoTime);
                    synchronized (aseVar.c) {
                        aseVar.e = nanoTime;
                    }
                }
                return Unit.a;
            case 4:
                long j6 = this.l;
                ltf ltfVar = (ltf) this.n;
                fk0 fk0Var = ltfVar.o;
                nm6 nm6Var5 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    boolean booleanValue = ((Boolean) fk0Var.d.getValue()).booleanValue();
                    wdc wdcVar2 = (wdc) this.o;
                    if (booleanValue) {
                        wdcVar2 = wdcVar2 instanceof b9r ? (b9r) wdcVar2 : mtf.a;
                    }
                    wdcVar = wdcVar2;
                    if (!((Boolean) fk0Var.d.getValue()).booleanValue()) {
                        wpe wpeVar = new wpe(j6);
                        this.m = wdcVar;
                        this.k = 1;
                        if (fk0Var.f(wpeVar, this) == nm6Var5) {
                            return nm6Var5;
                        }
                    }
                    long c = wpe.c(((wpe) fk0Var.e()).a, j6);
                    fk0 fk0Var2 = ltfVar.o;
                    wpe wpeVar2 = new wpe(c);
                    ol6 ol6Var = new ol6(ltfVar, c, i3);
                    this.m = null;
                    this.k = 2;
                    break;
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        int i14 = ltf.t;
                        ltfVar.f(false);
                        ltfVar.g = false;
                        return Unit.a;
                    }
                    wdcVar = (wdc) this.m;
                    qgg.h0(obj);
                }
                ltfVar.c.invoke();
                long c2 = wpe.c(((wpe) fk0Var.e()).a, j6);
                fk0 fk0Var22 = ltfVar.o;
                wpe wpeVar22 = new wpe(c2);
                ol6 ol6Var2 = new ol6(ltfVar, c2, i3);
                this.m = null;
                this.k = 2;
            case 5:
                String str4 = (String) this.o;
                ocn ocnVar = (ocn) this.n;
                nm6 nm6Var6 = nm6.a;
                int i15 = this.k;
                Continuation continuation = null;
                try {
                    if (i15 == 0) {
                        qgg.h0(obj);
                        this.k = 1;
                        ocnVar.getClass();
                        V = x97.V(dm6.b, new gcn(ocnVar, str4, continuation, i3), this);
                        if (V == nm6Var6) {
                            return nm6Var6;
                        }
                    } else {
                        if (i15 != 1) {
                            if (i15 != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            e0Var = (e0) this.m;
                            qgg.h0(obj);
                            return new z7o(e0Var);
                        }
                        qgg.h0(obj);
                        V = obj;
                    }
                    e0 e0Var2 = (e0) V;
                    if (e0Var2 == null) {
                        r7o r7oVar = z7o.b;
                        return new z7o(new t7o(new IllegalArgumentException("no saved state")));
                    }
                    long j7 = this.l;
                    ocnVar.getClass();
                    e0 i16 = ocn.i(e0Var2, j7);
                    this.m = e0Var2;
                    this.k = 2;
                    if (x97.V(dm6.b, new c5l(ocnVar, i16, str4, continuation, 24), this) != nm6Var6) {
                        e0Var = e0Var2;
                        return new z7o(e0Var);
                    }
                    return nm6Var6;
                } catch (IOException e) {
                    r7o r7oVar2 = z7o.b;
                    return new z7o(new t7o(e));
                }
            case 6:
                wbo wboVar = (wbo) this.o;
                lwj lwjVar = wboVar.d;
                AtomicReference atomicReference = wboVar.a;
                nm6 nm6Var7 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    long j8 = ((SharedPreferences) lwjVar.a.getValue()).getLong("LAST_UPDATE_DATE", 0L);
                    pair = (j8 > 0 && (string = ((SharedPreferences) lwjVar.a.getValue()).getString("RAW_JSON_RESPONSE", null)) != null) ? new Pair(Long.valueOf(j8), string) : null;
                    arf a4 = btf.a(bwf.c, new rln(5, pair, wboVar));
                    currentTimeMillis = System.currentTimeMillis();
                    if (pair != null) {
                        long longValue = currentTimeMillis - ((Number) pair.a).longValue();
                        msa msaVar = nsa.b;
                        if (longValue <= nsa.f(yd5.M(1, ssa.DAYS))) {
                            if (((Map) a4.getValue()) == null) {
                                ssg.a(7, "TAG", "Unexpected null parsedRetryPolice, rawJson=" + pair.b, null);
                            }
                            atomicReference.set((Map) a4.getValue());
                            return Unit.a;
                        }
                    }
                    f4m f4mVar = wboVar.c;
                    this.m = pair;
                    this.n = a4;
                    this.l = currentTimeMillis;
                    this.k = 1;
                    t = f4mVar.t(this);
                    if (t == nm6Var7) {
                        return nm6Var7;
                    }
                    arfVar = a4;
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j9 = this.l;
                    arfVar = (arf) this.n;
                    pair = (Pair) this.m;
                    qgg.h0(obj);
                    currentTimeMillis = j9;
                    t = obj;
                }
                rj6 rj6Var = (rj6) t;
                if (rj6Var instanceof qj6) {
                    ubo uboVar = (ubo) ((qj6) rj6Var).a;
                    atomicReference.set(uboVar.a);
                    String str5 = uboVar.b;
                    lwjVar.getClass();
                    SharedPreferences.Editor edit = ((SharedPreferences) lwjVar.a.getValue()).edit();
                    edit.putString("RAW_JSON_RESPONSE", str5);
                    edit.putLong("LAST_UPDATE_DATE", currentTimeMillis);
                    edit.apply();
                } else if (rj6Var instanceof nj6) {
                    atomicReference.set((Map) arfVar.getValue());
                    if (pair != null) {
                        String str6 = (String) pair.b;
                        lwjVar.getClass();
                        str6.getClass();
                        SharedPreferences.Editor edit2 = ((SharedPreferences) lwjVar.a.getValue()).edit();
                        edit2.putString("RAW_JSON_RESPONSE", str6);
                        edit2.putLong("LAST_UPDATE_DATE", currentTimeMillis);
                        edit2.apply();
                    }
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    atomicReference.set((Map) arfVar.getValue());
                }
                return Unit.a;
            case 7:
                iyo iyoVar = (iyo) this.n;
                nm6 nm6Var8 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    hyo hyoVar = (hyo) this.m;
                    float f = iyoVar.f(this.l);
                    lf0 lf0Var = new lf0(8, (uqn) this.o, iyoVar, hyoVar);
                    this.k = 1;
                    if (v5g.p(0.0f, f, null, lf0Var, this, 12) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                jtm jtmVar = (jtm) this.m;
                nm6 nm6Var9 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new a9q((sdr) this.n, 16));
                    fkc fkcVar = new fkc(1, this.l, jtmVar, (z2h) this.o);
                    this.m = null;
                    this.k = 1;
                    if (s0.collect(fkcVar, this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                uoi uoiVar2 = (uoi) this.o;
                aqi aqiVar2 = (aqi) this.n;
                nm6 nm6Var10 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    rqm rqmVar4 = (rqm) aqiVar2.getValue();
                    if (rqmVar4 != null) {
                        qqm qqmVar = new qqm(rqmVar4);
                        if (uoiVar2 != null) {
                            this.m = aqiVar2;
                            this.k = 1;
                            break;
                        }
                        aqiVar = aqiVar2;
                    }
                    rqmVar2 = new rqm(this.l);
                    if (uoiVar2 != null) {
                        this.m = rqmVar2;
                        this.k = 2;
                        if (uoiVar2.a(rqmVar2, this) != nm6Var10) {
                            rqmVar3 = rqmVar2;
                            rqmVar2 = rqmVar3;
                        }
                        return nm6Var10;
                    }
                    aqiVar2.setValue(rqmVar2);
                    return Unit.a;
                }
                if (i20 != 1) {
                    if (i20 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rqmVar3 = (rqm) this.m;
                    qgg.h0(obj);
                    rqmVar2 = rqmVar3;
                    aqiVar2.setValue(rqmVar2);
                    return Unit.a;
                }
                aqiVar = (aqi) this.m;
                qgg.h0(obj);
                aqiVar.setValue(null);
                rqmVar2 = new rqm(this.l);
                if (uoiVar2 != null) {
                }
                aqiVar2.setValue(rqmVar2);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(wqn wqnVar, wqn wqnVar2, ase aseVar, long j, Continuation continuation) {
        super(2, continuation);
        this.j = 3;
        this.m = wqnVar;
        this.n = wqnVar2;
        this.o = aseVar;
        this.l = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(wbo wboVar, Continuation continuation) {
        super(2, continuation);
        this.j = 6;
        this.o = wboVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5(Object obj, long j, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
        this.l = j;
        this.o = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5(Object obj, Object obj2, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
        this.o = obj2;
        this.l = j;
    }
}
