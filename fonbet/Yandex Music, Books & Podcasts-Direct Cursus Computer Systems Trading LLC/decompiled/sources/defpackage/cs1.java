package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.Window;
import com.yandex.pulse.metrics.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cs1 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs1(u21 u21Var, Continuation continuation, o62 o62Var) {
        super(2, continuation);
        this.j = 2;
        this.l = u21Var;
        this.m = o62Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                cs1 cs1Var = new cs1((fs1) this.m, continuation, 0);
                cs1Var.l = obj;
                return cs1Var;
            case 1:
                return new cs1((t32) this.m, continuation, 1);
            case 2:
                return new cs1((u21) this.l, continuation, (o62) this.m);
            case 3:
                cs1 cs1Var2 = new cs1((za2) this.m, continuation, 3);
                cs1Var2.l = obj;
                return cs1Var2;
            case 4:
                return new cs1((ve2) this.l, (ue2) this.m, continuation, 4);
            case 5:
                return new cs1((sdr) this.l, (fk0) this.m, continuation, 5);
            case 6:
                cs1 cs1Var3 = new cs1((jq2) this.m, continuation, 6);
                cs1Var3.l = obj;
                return cs1Var3;
            case 7:
                return new cs1((rx2) this.l, (Intent) this.m, continuation, 7);
            case 8:
                return new cs1((t13) this.m, continuation, 8);
            case 9:
                return new cs1((x83) this.m, continuation, 9);
            case 10:
                return new cs1((x83) this.l, (vbc) this.m, continuation, 10);
            case 11:
                return new cs1((oq) this.l, (dn9) this.m, continuation, 11);
            case 12:
                return new cs1((ob3) this.m, continuation, 12);
            case 13:
                return new cs1((ob3) this.l, (oq) this.m, continuation, 13);
            case 14:
                return new cs1((ph3) this.l, (t03) this.m, continuation, 14);
            case 15:
                cs1 cs1Var4 = new cs1((gs4) this.m, continuation, 15);
                cs1Var4.l = obj;
                return cs1Var4;
            case 16:
                return new cs1((pjc) this.l, (gs4) this.m, continuation, 16);
            case 17:
                return new cs1((fp7) this.l, (vy3) this.m, continuation, 17);
            case 18:
                return new cs1((i44) this.m, continuation, 18);
            case 19:
                return new cs1((Activity) this.l, (ja0) this.m, continuation, 19);
            case 20:
                cs1 cs1Var5 = new cs1((sc4) this.m, continuation, 20);
                cs1Var5.l = obj;
                return cs1Var5;
            case 21:
                cs1 cs1Var6 = new cs1((uc4) this.m, continuation, 21);
                cs1Var6.l = obj;
                return cs1Var6;
            case 22:
                return new cs1((pjc) this.l, (ngp) this.m, continuation, 22);
            case 23:
                return new cs1((u21) this.l, (lk4) this.m, continuation, 23);
            case 24:
                return new cs1((hr4) this.m, continuation, 24);
            case 25:
                return new cs1((as1) this.l, (aqi) this.m, continuation, 25);
            case 26:
                return new cs1((vdr) this.l, (aqi) this.m, continuation, 26);
            case 27:
                cs1 cs1Var7 = new cs1((nu4) this.m, continuation, 27);
                cs1Var7.l = obj;
                return cs1Var7;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new cs1((ru4) this.m, continuation, 28);
            default:
                return new cs1((ru4) this.l, (vbc) this.m, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 26:
                ((cs1) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((cs1) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x0380, code lost:
    
        if (r0 == r2) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0368, code lost:
    
        if (r3 == r2) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0526, code lost:
    
        if (r0 == r3) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x054a, code lost:
    
        if (defpackage.qgg.X(r4, r5, r6, r20) == r3) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012e, code lost:
    
        if (r0 == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x06e7, code lost:
    
        if (defpackage.x97.V(r3, r4, r20) == r2) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x06cf, code lost:
    
        if (r3.c(r20) == r2) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0922, code lost:
    
        if (r3 == r2) goto L399;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0217  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0201 -> B:68:0x0205). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object f;
        t32 t32Var;
        t13 t13Var;
        Object h;
        x83 x83Var;
        Object j;
        xdr xdrVar;
        Object G;
        Object b;
        Map map;
        Object a2;
        si3 si3Var;
        Object c;
        Object a3;
        ru4 ru4Var;
        int i = 18;
        int i2 = 4;
        int i3 = 3;
        int i4 = 27;
        int i5 = 0;
        int i6 = 10;
        int i7 = 6;
        int i8 = 2;
        int i9 = 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        switch (this.j) {
            case 0:
                fs1 fs1Var = (fs1) this.m;
                Object obj2 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    rce rceVar = (rce) this.l;
                    cce cceVar = (cce) fs1Var.s.getValue();
                    pce a4 = rce.a(rceVar);
                    a4.d = new bnd(i7, fs1Var);
                    a4.d();
                    tu7 tu7Var = rceVar.E;
                    if (tu7Var.a == null) {
                        a4.x = new rp7(fs1Var);
                        a4.d();
                    }
                    if (tu7Var.b == null) {
                        jd6 jd6Var = fs1Var.n;
                        xkn xknVar = zvt.b;
                        a4.y = Intrinsics.d(jd6Var, hd6.b) ? true : Intrinsics.d(jd6Var, hd6.e) ? nso.b : nso.a;
                    }
                    if (tu7Var.d != ilm.a) {
                        a4.i = ilm.b;
                    }
                    rce a5 = a4.a();
                    this.l = fs1Var;
                    this.k = 1;
                    a = cceVar.a(a5, this);
                    break;
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fs1Var = (fs1) this.l;
                    qgg.h0(obj);
                    a = obj;
                }
                sce sceVar = (sce) a;
                fs1Var.getClass();
                if (sceVar instanceof bqr) {
                    bqr bqrVar = (bqr) sceVar;
                    return new as1(fs1Var.l(bqrVar.a), bqrVar);
                }
                if (!(sceVar instanceof pgb)) {
                    b6e.s();
                    return null;
                }
                pgb pgbVar = (pgb) sceVar;
                Drawable drawable = pgbVar.a;
                obj2 = new yr1(drawable != null ? fs1Var.l(drawable) : null, pgbVar);
                return obj2;
            case 1:
                nm6 nm6Var = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    t32 t32Var2 = (t32) this.m;
                    q12 q12Var = (q12) t32Var2.q.getValue();
                    this.l = t32Var2;
                    this.k = 1;
                    f = ((z22) ((c72) q12Var.a.getValue())).f(this);
                    if (f == nm6Var) {
                        return nm6Var;
                    }
                    t32Var = t32Var2;
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t32Var = (t32) this.l;
                    qgg.h0(obj);
                    f = obj;
                }
                return t32Var.H((k22) f);
            case 2:
                nm6 nm6Var2 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    u21 u21Var = (u21) this.l;
                    f51 f51Var = new f51(null, (o62) this.m);
                    this.k = 1;
                    if (zsd.O(u21Var, f51Var, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                uvn uvnVar = (uvn) this.l;
                nm6 nm6Var3 = nm6.a;
                int i13 = this.k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                bb2 bb2Var = ((za2) this.m).c;
                this.l = null;
                this.k = 1;
                Object a6 = ((mav) bb2Var.a.d.getValue()).a(uvnVar, true, this);
                return a6 == nm6Var3 ? nm6Var3 : a6;
            case 4:
                nm6 nm6Var4 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(30000L, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ((ve2) this.l).a.getContentResolver().unregisterContentObserver((ue2) this.m);
                ssg.a(3, "AutoplayAnalyticsHelper", "volume tracking stopped after 30000ms", null);
                return Unit.a;
            case 5:
                nm6 nm6Var5 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new oj2((sdr) this.l, i5));
                    ri riVar = new ri(i, (fk0) this.m);
                    this.k = 1;
                    if (s0.collect(riVar, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                nm6 nm6Var6 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    ltm ltmVar = (ltm) this.l;
                    jq2 jq2Var = (jq2) this.m;
                    iq2 iq2Var = new iq2(jq2Var, ltmVar);
                    r96 r96Var = jq2Var.a;
                    r96Var.getClass();
                    synchronized (r96Var.c) {
                        try {
                            if (((LinkedHashSet) r96Var.e).add(iq2Var)) {
                                if (((LinkedHashSet) r96Var.e).size() == 1) {
                                    r96Var.d = r96Var.b();
                                    jsg.j().e(s96.a, r96Var.getClass().getSimpleName() + ": initial state = " + r96Var.d);
                                    r96Var.d();
                                }
                                iq2Var.a(r96Var.d);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ap1 ap1Var = new ap1(7, (jq2) this.m, iq2Var);
                    this.k = 1;
                    if (y7g.q(ltmVar, ap1Var, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 7:
                rx2 rx2Var = (rx2) this.l;
                nm6 nm6Var7 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    lx2 lx2Var = rx2Var.c;
                    this.k = 1;
                    break;
                } else {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                bsd b2 = dm6.b();
                qi qiVar = new qi((Object) rx2Var, this.m, (Continuation) (z ? 1 : 0), 15);
                this.k = 2;
                break;
            case 8:
                nm6 nm6Var8 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    t13 t13Var2 = (t13) this.m;
                    Object obj3 = t13Var2.k;
                    if (obj3 != null) {
                        this.l = t13Var2;
                        this.k = 1;
                        if (t13Var2.p(obj3, this) == nm6Var8) {
                            return nm6Var8;
                        }
                        t13Var = t13Var2;
                    }
                    return Unit.a;
                }
                if (i18 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                t13Var = (t13) this.l;
                qgg.h0(obj);
                t13Var.k = null;
                return Unit.a;
            case 9:
                x83 x83Var2 = (x83) this.m;
                jyr jyrVar = x83Var2.n;
                nm6 nm6Var9 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    u83 u83Var = (u83) jyrVar.getValue();
                    this.l = x83Var2;
                    this.k = 1;
                    h = ((v55) u83Var.b.getValue()).h(this);
                    if (h == nm6Var9) {
                        return nm6Var9;
                    }
                    x83Var = x83Var2;
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x83Var = (x83) this.l;
                    qgg.h0(obj);
                    h = obj;
                }
                x83.a(x83Var, (zea) h);
                ox6.B(new u21(i6, x83Var2.l, ((yx4) ((u83) jyrVar.getValue()).a.getValue()).e(null), new w83(3, x83Var2, x83.class, "prepareState", "prepareState(Ljava/util/List;Ljava/util/List;)Lcom/yandex/music/screen/downloadedmusic/ui/downloadedbooks/bookchapters/BookChaptersState;", 4, 0)), ot0.F(x83Var2), new ri(22, x83Var2));
                return Unit.a;
            case 10:
                x83 x83Var3 = (x83) this.l;
                nm6 nm6Var10 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    y83 y83Var = (y83) x83Var3.o.getValue();
                    vbc vbcVar = (vbc) this.m;
                    y83Var.getClass();
                    zea a7 = y83.a(vbcVar);
                    x83.a(x83Var3, a7);
                    u83 u83Var2 = (u83) x83Var3.n.getValue();
                    this.k = 1;
                    Object a8 = lmm.a(((v55) u83Var2.b.getValue()).r(), new f55(a7, null), this);
                    Object obj4 = a8;
                    if (a8 != nm6Var10) {
                        obj4 = Unit.a;
                    }
                    if (obj4 != nm6Var10) {
                        obj4 = Unit.a;
                    }
                    if (obj4 == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                oq oqVar = (oq) this.l;
                nm6 nm6Var11 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    mvn mvnVar = hof.g;
                    LinkedList linkedList = oqVar.F;
                    this.k = 1;
                    j = mvnVar.j(oqVar, this, linkedList);
                    if (j == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    j = obj;
                }
                mqs mqsVar = (mqs) CollectionsKt.S(oqVar.F, ((Number) j).intValue());
                return mqsVar == null ? qb3.b : ((dn9) this.m).j(oqVar, mqsVar);
            case 12:
                ob3 ob3Var = (ob3) this.m;
                nm6 nm6Var12 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    ubj ubjVar = ob3Var.k.h;
                    if (!Intrinsics.d(ubjVar, tbj.a)) {
                        if (!Intrinsics.d(ubjVar, sbj.a)) {
                            b6e.s();
                            return null;
                        }
                        kb3 kb3Var = new kb3(ob3Var, z3 ? 1 : 0, i5);
                        kb3 kb3Var2 = new kb3(ob3Var, z2 ? 1 : 0, i9);
                        q2 q2Var = new q2(i, ob3Var);
                        this.k = 2;
                        break;
                    } else {
                        xdrVar = ob3Var.C;
                        this.l = xdrVar;
                        this.k = 1;
                        G = ob3.G(ob3Var, this);
                        break;
                    }
                    return nm6Var12;
                }
                if (i22 == 1) {
                    xdr xdrVar2 = (xdr) this.l;
                    qgg.h0(obj);
                    xdrVar = xdrVar2;
                    G = obj;
                    xdrVar.l(G);
                } else {
                    if (i22 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                nm6 nm6Var13 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    ob3 ob3Var2 = (ob3) this.l;
                    oq oqVar2 = (oq) this.m;
                    this.k = 1;
                    if (ob3.H(ob3Var2, oqVar2, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                nm6 nm6Var14 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    ph3 ph3Var = (ph3) this.l;
                    t03 t03Var = (t03) this.m;
                    this.k = 1;
                    if (zc4.q(ph3Var, t03Var, this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                nm6 nm6Var15 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = (rjc) this.l;
                    vqn vqnVar = new vqn();
                    vqnVar.a = Integer.MIN_VALUE;
                    clc clcVar = new clc((mnr) ((gs4) this.m).c, new xc(i8, i7, z4 ? 1 : 0), 4);
                    hr3 hr3Var = new hr3(vqnVar, rjcVar);
                    this.k = 1;
                    if (clcVar.collect(hr3Var, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                nm6 nm6Var16 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.l;
                    ri riVar2 = new ri(i4, (gs4) this.m);
                    this.k = 1;
                    Object collect = pjcVar.collect(new hr3(riVar2, new vqn()), this);
                    if (collect != nm6Var16) {
                        collect = Unit.a;
                    }
                    if (collect == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                fp7 fp7Var = (fp7) this.l;
                nm6 nm6Var17 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    int q = fp7Var.q();
                    int i28 = ((vy3) this.m).b;
                    if (q != i28) {
                        this.k = 1;
                        if (o3k.v(i28, fp7Var, this) == nm6Var17) {
                            return nm6Var17;
                        }
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                jyr jyrVar2 = ((i44) this.m).g;
                nm6 nm6Var18 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    String str = i44.h;
                    p44 p44Var = (p44) jyrVar2.getValue();
                    this.k = 1;
                    b = p44Var.b(this);
                    break;
                } else {
                    if (i29 != 1) {
                        if (i29 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Map map2 = (Map) this.l;
                        qgg.h0(obj);
                        map = map2;
                        a2 = obj;
                        Map map3 = (Map) a2;
                        f24.a.getClass();
                        List<f24> list = f24.c;
                        ArrayList arrayList = new ArrayList(v75.o(list, 10));
                        for (f24 f24Var : list) {
                            arrayList.add(new q44(f24Var, (Long) map3.get(f24Var), (Long) map.get(f24Var)));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            q44 q44Var = (q44) next;
                            if (q44Var.b != null || q44Var.c != null) {
                                arrayList2.add(next);
                            }
                        }
                        return arrayList2;
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                map = (Map) b;
                String str2 = i44.h;
                p44 p44Var2 = (p44) jyrVar2.getValue();
                this.l = map;
                this.k = 2;
                a2 = p44Var2.a(this);
                break;
            case 19:
                Activity activity = (Activity) this.l;
                nm6 nm6Var19 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    Window window = activity.getWindow();
                    xqn xqnVar = new xqn();
                    xqnVar.a = avm.a;
                    tqn tqnVar = new tqn();
                    window.getClass();
                    tqnVar.a = c9g.q(window, vyr.StatusBar);
                    vqn vqnVar2 = new vqn();
                    vqnVar2.a = window.getStatusBarColor();
                    eno s02 = szf.s0(new q90((ja0) this.m, i2));
                    s3 s3Var = new s3(xqnVar, (Serializable) tqnVar, (Object) window, (Serializable) vqnVar2, (Object) activity, 1);
                    this.k = 1;
                    if (s02.collect(s3Var, this) == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 20:
                nm6 nm6Var20 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    ltm ltmVar2 = (ltm) this.l;
                    sc4 sc4Var = (sc4) this.m;
                    this.k = 1;
                    if (sc4Var.e(ltmVar2, this) == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 21:
                nm6 nm6Var21 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar2 = (rjc) this.l;
                    uc4 uc4Var = (uc4) this.m;
                    this.k = 1;
                    if (uc4Var.j(rjcVar2, this) == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i32 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 22:
                nm6 nm6Var22 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar2 = (pjc) this.l;
                    ngp ngpVar = (ngp) this.m;
                    this.k = 1;
                    if (pjcVar2.collect(ngpVar, this) == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i33 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                nm6 nm6Var23 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    u21 u21Var2 = (u21) this.l;
                    i64 i64Var = new i64(i3, (lk4) this.m);
                    this.k = 1;
                    if (u21Var2.collect(i64Var, this) == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 24:
                nm6 nm6Var24 = nm6.a;
                int i35 = this.k;
                if (i35 == 0) {
                    qgg.h0(obj);
                    zi3 zi3Var = ((hr4) this.m).d;
                    zi3Var.getClass();
                    si3Var = new si3(zi3Var);
                    this.l = si3Var;
                    this.k = 1;
                    c = si3Var.c(this);
                    if (c == nm6Var24) {
                    }
                    if (((Boolean) c).booleanValue()) {
                    }
                } else {
                    if (i35 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    si3Var = (si3) this.l;
                    qgg.h0(obj);
                    c = obj;
                    if (((Boolean) c).booleanValue()) {
                        ((Function0) si3Var.d()).invoke();
                        this.l = si3Var;
                        this.k = 1;
                        c = si3Var.c(this);
                        if (c == nm6Var24) {
                            return nm6Var24;
                        }
                        if (((Boolean) c).booleanValue()) {
                            return Unit.a;
                        }
                    }
                }
            case 25:
                nm6 nm6Var25 = nm6.a;
                int i36 = this.k;
                if (i36 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(300L, this) == nm6Var25) {
                        return nm6Var25;
                    }
                } else {
                    if (i36 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ((aqi) this.m).setValue(((as1) this.l).a);
                return Unit.a;
            case 26:
                nm6 nm6Var26 = nm6.a;
                int i37 = this.k;
                if (i37 == 0) {
                    qgg.h0(obj);
                    vdr vdrVar = (vdr) this.l;
                    oc ocVar = new oc((aqi) this.m, i9);
                    this.k = 1;
                    if (vdrVar.collect(ocVar, this) == nm6Var26) {
                        return nm6Var26;
                    }
                } else {
                    if (i37 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            case 27:
                Pair pair = (Pair) this.l;
                nm6 nm6Var27 = nm6.a;
                int i38 = this.k;
                if (i38 != 0) {
                    if (i38 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                List list2 = (List) pair.a;
                List list3 = (List) pair.b;
                this.l = null;
                this.k = 1;
                Object V = x97.V(dm6.b, new qi((Object) list2, (Object) list3, (Continuation) (z5 ? 1 : 0), 24), this);
                return V == nm6Var27 ? nm6Var27 : V;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ru4 ru4Var2 = (ru4) this.m;
                jyr jyrVar3 = ru4Var2.q;
                nm6 nm6Var28 = nm6.a;
                int i39 = this.k;
                if (i39 == 0) {
                    qgg.h0(obj);
                    nu4 nu4Var = (nu4) jyrVar3.getValue();
                    this.l = ru4Var2;
                    this.k = 1;
                    a3 = ((v55) nu4Var.a.getValue()).a(this);
                    if (a3 != nm6Var28) {
                        ru4Var = ru4Var2;
                    }
                    return nm6Var28;
                }
                if (i39 != 1) {
                    if (i39 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ru4 ru4Var3 = (ru4) this.l;
                qgg.h0(obj);
                ru4Var = ru4Var3;
                a3 = obj;
                ru4.a(ru4Var, (i10) a3);
                xdr xdrVar3 = ru4Var2.o;
                nu4 nu4Var2 = (nu4) jyrVar3.getValue();
                pjc b3 = e15.b((e15) nu4Var2.b.getValue(), null, 6);
                e15 e15Var = (e15) nu4Var2.b.getValue();
                yc4 s03 = zsd.s0(new u21(i6, b3, zsd.b0(new w05(e15Var.h("pre_saves"), e15Var, i9)), mu4.a), new cs1((Object) nu4Var2, (Continuation) (z7 ? 1 : 0), i4));
                w83 w83Var = new w83(3, ru4Var2, ru4.class, "prepareState", "prepareState(Ljava/util/List;Ljava/util/List;)Lcom/yandex/music/collection/albums/viewmodel/CollectionAlbumsState;", 4, 1);
                i64 i64Var2 = new i64(i7, ru4Var2);
                this.l = null;
                this.k = 2;
                Object y = tt0.y(i64Var2, new l1((Object) w83Var, (Continuation) (z6 ? 1 : 0), 25), this, wg.s, new pjc[]{xdrVar3, s03});
                if (y != nm6Var28) {
                    y = Unit.a;
                    break;
                }
                break;
            default:
                ru4 ru4Var4 = (ru4) this.l;
                nm6 nm6Var29 = nm6.a;
                int i40 = this.k;
                if (i40 == 0) {
                    qgg.h0(obj);
                    tu4 tu4Var = (tu4) ru4Var4.s.getValue();
                    vbc vbcVar2 = (vbc) this.m;
                    tu4Var.getClass();
                    i10 b4 = tu4.b(vbcVar2);
                    ru4.a(ru4Var4, b4);
                    nu4 nu4Var3 = (nu4) ru4Var4.q.getValue();
                    this.k = 1;
                    Object a9 = lmm.a(((v55) nu4Var3.a.getValue()).r(), new y45(b4, null), this);
                    Object obj5 = a9;
                    if (a9 != nm6Var29) {
                        obj5 = Unit.a;
                    }
                    if (obj5 != nm6Var29) {
                        obj5 = Unit.a;
                    }
                    if (obj5 == nm6Var29) {
                        return nm6Var29;
                    }
                } else {
                    if (i40 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cs1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cs1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
    }
}
