package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.music.screen.landing.api.header.ui.view.HeaderContentViewFrameLayout;
import com.yandex.music.screen.landing.api.header.ui.view.SpecialHeaderBackgroundView;
import com.yandex.plus.bdui.plus.checkout.webview.contract.b;
import com.yandex.plus.pay.ui.core.api.domain.a;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.k;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class cg1 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ boolean l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg1(mm6 mm6Var, cvu cvuVar, Continuation continuation) {
        super(2, continuation);
        this.j = 24;
        this.m = mm6Var;
        this.n = cvuVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new cg1((dg1) this.n, this.l, continuation, 0);
            case 1:
                return new cg1((mj1) this.m, this.l, (String) this.n, continuation, 1);
            case 2:
                return new cg1(this.l, (u0s) this.m, (va3) this.n, continuation, 2);
            case 3:
                return new cg1(this.l, (n14) this.m, (f24) this.n, continuation, 3);
            case 4:
                return new cg1((tg4) this.m, (String) this.n, this.l, continuation, 4);
            case 5:
                return new cg1((rfk) this.m, (h37) this.n, this.l, continuation, 5);
            case 6:
                return new cg1((n87) this.n, this.l, continuation, 6);
            case 7:
                return new cg1((u1e) this.m, this.l, (b6d) this.n, continuation, 7);
            case 8:
                return new cg1((u2f) this.m, (v2f) this.n, this.l, continuation, 8);
            case 9:
                return new cg1(this.l, (poi) this.m, (aqi) this.n, continuation, 9);
            case 10:
                return new cg1((t3g) this.m, (c01) this.n, this.l, continuation, 10);
            case 11:
                return new cg1((cvl) this.m, (xlg) this.n, this.l, continuation, 11);
            case 12:
                return new cg1((lhk) this.m, (bve) this.n, this.l, continuation, 12);
            case 13:
                return new cg1((yuk) this.m, (ruk) this.n, this.l, continuation, 13);
            case 14:
                return new cg1((btl) this.m, (cvl) this.n, this.l, continuation, 14);
            case 15:
                cg1 cg1Var = new cg1((mmo) this.n, this.l, continuation, 15);
                cg1Var.m = obj;
                return cg1Var;
            case 16:
                return new cg1(this.l, (u0s) this.m, (rbm) this.n, continuation, 16);
            case 17:
                return new cg1((kbn) this.m, (String) this.n, this.l, continuation, 17);
            case 18:
                return new cg1((d0q) this.n, this.l, continuation, 18);
            case 19:
                return new cg1((n5q) this.n, this.l, continuation, 19);
            case 20:
                return new cg1((m8q) this.n, this.l, continuation, 20);
            case 21:
                return new cg1((fk0) this.m, this.l, (act) this.n, continuation, 21);
            case 22:
                return new cg1((jcu) this.n, this.l, continuation, 22);
            case 23:
                return new cg1(this.l, (Function1) this.m, (u3v) this.n, continuation, 23);
            case 24:
                cg1 cg1Var2 = new cg1((mm6) this.m, (cvu) this.n, continuation);
                cg1Var2.l = ((Boolean) obj).booleanValue();
                return cg1Var2;
            case 25:
                return new cg1(this.l, (b) this.m, (String) this.n, continuation, 25);
            default:
                return new cg1(this.l, (k) this.m, (String) this.n, continuation, 26);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 24:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
        }
        return ((cg1) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0200, code lost:
    
        if (((defpackage.cup) r2).b(r1, r3, r17) == r0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ed, code lost:
    
        if (r1 == r0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x023c, code lost:
    
        if (r2 == r1) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02e7, code lost:
    
        if (r1 == r0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03aa, code lost:
    
        if (r0.emit(r2, r17) == r1) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03c4, code lost:
    
        if (r0.emit(r3, r17) == r1) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0397, code lost:
    
        if (r2 == r1) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04f4, code lost:
    
        if (r0 == r2) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04da, code lost:
    
        if (r3.c(r1, r17) == r2) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x07a2, code lost:
    
        if (r0 == r1) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x0795, code lost:
    
        if (defpackage.ime.I(r3, r5, "Widget update requested", r17) == r1) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0782, code lost:
    
        if (r2 == r1) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x07e1, code lost:
    
        if (r3.emit(r0, r17) == r1) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x07ef, code lost:
    
        if (r3.emit(r2, r17) == r1) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0840, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0858, code lost:
    
        if (r1.emit(r3, r17) == r2) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0828, code lost:
    
        if (r0 == r2) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x08a2, code lost:
    
        if (r0 == r1) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x08c0, code lost:
    
        if (r0 == r1) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0a0c, code lost:
    
        if (r5.y(r3, r17) == r2) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x09b0, code lost:
    
        if (r3 == r2) goto L471;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00ad -> B:34:0x00b1). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Pair pair;
        e73 e73Var;
        Object a2;
        Object b;
        Object g0;
        e87 e87Var;
        Object a3;
        Object a4;
        String str;
        Object d;
        Object d2;
        Object b2;
        Object f;
        tu6 tu6Var;
        Object V;
        ytp ytpVar;
        Object g02;
        Object g03;
        Object a5;
        Object a6;
        int i = 25;
        int i2 = 0;
        int i3 = 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        switch (this.j) {
            case 0:
                dg1 dg1Var = (dg1) this.n;
                mf1 mf1Var = dg1Var.i;
                nm6 nm6Var = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    fg1 fg1Var = dg1Var.f;
                    String str2 = dg1Var.d.a;
                    boolean z7 = this.l;
                    this.k = 1;
                    a = fg1Var.a(mf1Var, z7, this);
                    break;
                } else if (i4 == 1) {
                    qgg.h0(obj);
                    a = obj;
                } else if (i4 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    e73Var = (e73) this.m;
                    qgg.h0(obj);
                    dg1Var.l.l(e73Var);
                    break;
                }
                rj6 rj6Var = (rj6) a;
                if (!(rj6Var instanceof qj6)) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        break;
                    } else {
                        ((pj6) rj6Var).a();
                        pair = new Pair(null, new c73(mf1Var));
                    }
                } else {
                    pair = new Pair(((qj6) rj6Var).a, new d73(mf1Var));
                }
                nf1 nf1Var = (nf1) pair.a;
                e73Var = (e73) pair.b;
                if (nf1Var != null) {
                    if (!dg1Var.j) {
                        dg1Var.j = true;
                        rmb rmbVar = dg1Var.e;
                        p43 p43Var = nf1Var.c;
                        rmbVar.g(1, p43Var != null ? p43Var.a : null);
                    }
                    xdr xdrVar = dg1Var.k;
                    xdrVar.getClass();
                    xdrVar.m(null, nf1Var);
                    kkp kkpVar = dg1Var.g;
                    boolean z8 = nf1Var.b;
                    this.m = e73Var;
                    this.k = 2;
                    break;
                }
                dg1Var.l.l(e73Var);
            case 1:
                boolean z9 = this.l;
                mj1 mj1Var = (mj1) this.m;
                nm6 nm6Var2 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    ab1 ab1Var = (ab1) mj1Var.p.getValue();
                    String str3 = mj1Var.D.a;
                    this.k = 1;
                    a2 = ab1Var.a(str3, z9, this);
                    if (a2 == nm6Var2) {
                        break;
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    a2 = obj;
                }
                dnk dnkVar = (dnk) a2;
                if (dnkVar != null) {
                    s9f[] s9fVarArr = mj1.I;
                    ((yzk) mj1Var.w.getValue()).f(mj1Var.D, dnkVar.c);
                }
                s9f[] s9fVarArr2 = mj1.I;
                mj1Var.getClass();
                mj1Var.G.setValue(mj1Var, mj1.I[1], x97.y(ot0.F(mj1Var), null, null, new kj1(mj1Var, z9, z ? 1 : 0, i2), 3));
                mj1Var.k.G(mj1Var.H, (String) this.n, z9);
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    if (this.l) {
                        pjc b0 = zsd.b0(new bca(szf.s0(new r93(i3, (u0s) this.m)), 18));
                        ri riVar = new ri(23, (va3) this.n);
                        this.k = 1;
                        if (b0.collect(riVar, this) == nm6Var3) {
                            break;
                        }
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                f24 f24Var = (f24) this.n;
                Object obj2 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    boolean z10 = this.l;
                    jyr jyrVar = ((n14) this.m).d;
                    if (!z10) {
                        p44 p44Var = (p44) jyrVar.getValue();
                        this.k = 2;
                        p44Var.getClass();
                        Object V2 = x97.V(dm6.b, new m44(p44Var, f24Var, z2 ? 1 : 0, i3), this);
                        Object obj3 = V2;
                        if (V2 != obj2) {
                            obj3 = Unit.a;
                            break;
                        }
                    } else {
                        p44 p44Var2 = (p44) jyrVar.getValue();
                        this.k = 1;
                        p44Var2.getClass();
                        Object V3 = x97.V(dm6.b, new m44(p44Var2, f24Var, z3 ? 1 : 0, i2), this);
                        Object obj4 = V3;
                        if (V3 != obj2) {
                            obj4 = Unit.a;
                            break;
                        }
                    }
                } else if (i7 != 1 && i7 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 4:
                tg4 tg4Var = (tg4) this.m;
                x0q x0qVar = tg4Var.f;
                nm6 nm6Var4 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    yg4 yg4Var = tg4Var.a;
                    String str4 = (String) this.n;
                    boolean z11 = this.l;
                    this.k = 1;
                    b = yg4Var.b(str4, z11, this);
                    break;
                } else if (i8 == 1) {
                    qgg.h0(obj);
                    b = obj;
                } else if (i8 != 2 && i8 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                rj6 rj6Var2 = (rj6) b;
                if (!(rj6Var2 instanceof qj6)) {
                    if (!(rj6Var2 instanceof pj6)) {
                        b6e.s();
                        break;
                    } else {
                        t2i t2iVar = new t2i((Throwable) ((pj6) rj6Var2).a());
                        this.k = 3;
                        break;
                    }
                } else {
                    t2i t2iVar2 = new t2i(((qj6) rj6Var2).a);
                    this.k = 2;
                    break;
                }
            case 5:
                rfk rfkVar = (rfk) this.m;
                nm6 nm6Var5 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    boolean d3 = Intrinsics.d(rfkVar, jfk.a);
                    x0q x0qVar2 = ((h37) this.n).v;
                    if (!d3) {
                        mpm mpmVar = new mpm(rfkVar);
                        this.k = 2;
                        break;
                    } else {
                        npm npmVar = new npm(this.l);
                        this.k = 1;
                        break;
                    }
                } else if (i9 != 1 && i9 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 6:
                n87 n87Var = (n87) this.n;
                nm6 nm6Var6 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    bca bcaVar = new bca(n87Var.o, 18);
                    this.k = 1;
                    g0 = zsd.g0(bcaVar, this);
                    break;
                } else if (i10 == 1) {
                    qgg.h0(obj);
                    g0 = obj;
                } else if (i10 == 2) {
                    e87Var = (e87) this.m;
                    qgg.h0(obj);
                    boolean z12 = this.l;
                    this.m = null;
                    this.k = 3;
                    a3 = n87.a(n87Var, z12, e87Var, this);
                    break;
                } else if (i10 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    a3 = ((z7o) obj).a;
                    break;
                }
                e87Var = (e87) g0;
                ime imeVar = n87Var.f;
                z77 z77Var = e87Var.b;
                this.m = e87Var;
                this.k = 2;
                break;
            case 7:
                b6d b6dVar = (b6d) this.n;
                u1e u1eVar = (u1e) this.m;
                jyr jyrVar2 = u1eVar.M;
                nm6 nm6Var7 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    w5r w5rVar = (w5r) u1eVar.F.getValue();
                    boolean z13 = this.l;
                    this.k = 1;
                    a4 = w5rVar.a(z13, this);
                    if (a4 == nm6Var7) {
                        break;
                    }
                } else if (i11 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    a4 = obj;
                }
                u5r u5rVar = (u5r) a4;
                boolean booleanValue = ((Boolean) tes.e.getValue()).booleanValue();
                z5r z5rVar = u1eVar.y;
                if (booleanValue) {
                    s2e s2eVar = u1eVar.C;
                    if (s2eVar != null) {
                        if (z5rVar.h == null) {
                            q13 q13Var = s2eVar.b;
                            s9f[] s9fVarArr3 = s2e.G;
                            z5rVar.a(new e6r((HeaderContentViewFrameLayout) q13Var.a(s9fVarArr3[1]), (SpecialHeaderBackgroundView) s2eVar.c.a(s9fVarArr3[2])));
                        }
                        boolean booleanValue2 = ((Boolean) ((ses) jyrVar2.getValue()).b.getValue()).booleanValue();
                        boolean z14 = !booleanValue2;
                        if (!booleanValue2) {
                            xdr xdrVar2 = ((ses) jyrVar2.getValue()).a;
                            Boolean bool = Boolean.TRUE;
                            xdrVar2.getClass();
                            xdrVar2.m(null, bool);
                        }
                        boolean T = swf.T(b6dVar);
                        e6r e6rVar = z5rVar.h;
                        if (e6rVar != null) {
                            e6rVar.a.setState(u5rVar != null ? u5rVar.a(T, new wud(z14)) : new cvd(new avd(T), null, null, null));
                            e6rVar.b.setState(u5rVar != null ? u5rVar.b() : null);
                        }
                    }
                } else {
                    s2e s2eVar2 = u1eVar.C;
                    if (s2eVar2 != null) {
                        if (z5rVar.h == null) {
                            q13 q13Var2 = s2eVar2.b;
                            s9f[] s9fVarArr4 = s2e.G;
                            z5rVar.a(new e6r((HeaderContentViewFrameLayout) q13Var2.a(s9fVarArr4[1]), (SpecialHeaderBackgroundView) s2eVar2.c.a(s9fVarArr4[2])));
                        }
                        boolean T2 = swf.T(b6dVar);
                        kj3 kj3Var = z5rVar.c;
                        if (u5rVar != null) {
                            p5r p5rVar = u5rVar.c;
                            if (p5rVar == null || (str = p5rVar.a) == null) {
                                str = "null";
                            }
                            kj3Var.getClass();
                            kj3Var.e = str;
                            if (!kj3Var.c) {
                                kj3Var.c = true;
                                nmb nmbVar = f6r.a;
                                String G = ((fnb) kj3Var.d).G();
                                G.getClass();
                                nmb nmbVar2 = f6r.a;
                                nmbVar2.getClass();
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("page_type", "landing");
                                linkedHashMap.put("page_id", "main");
                                linkedHashMap.put("hash", G);
                                linkedHashMap.put("entity_id", "SpecialProjectButton");
                                linkedHashMap.put("entity_name", str);
                                linkedHashMap.put("entity_pos", CommonUrlParts.Values.FALSE_INTEGER);
                                dfi.p(1, "entity_type", "special_project", "_meta", linkedHashMap);
                                nmbVar2.C("Home.SpecialProjectButton.Loaded", linkedHashMap);
                            }
                        }
                        e6r e6rVar2 = z5rVar.h;
                        if (e6rVar2 != null) {
                            HeaderContentViewFrameLayout headerContentViewFrameLayout = e6rVar2.a;
                            if (u5rVar != null) {
                                headerContentViewFrameLayout.setState(u5rVar.a(T2, null));
                                e6rVar2.b.setState(u5rVar.b());
                            } else {
                                headerContentViewFrameLayout.setState(new cvd(new avd(T2), null, null, null));
                            }
                        }
                    }
                }
                break;
            case 8:
                Object obj5 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    u2f u2fVar = (u2f) this.m;
                    v2f v2fVar = (v2f) this.n;
                    boolean z15 = this.l;
                    this.k = 1;
                    dq7 dq7Var = ca8.a;
                    Object V4 = x97.V(mn7.d, new qk(u2fVar, v2fVar, z15, null, 5), this);
                    Object obj6 = V4;
                    if (V4 != obj5) {
                        obj6 = Unit.a;
                    }
                    if (obj6 == obj5) {
                        break;
                    }
                } else if (i12 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 9:
                aqi aqiVar = (aqi) this.n;
                poi poiVar = (poi) this.m;
                boolean z16 = this.l;
                nm6 nm6Var8 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    if (z16) {
                        b9r Q = weo.Q(0.3f, 400.0f, null, 4);
                        float e = ((t6k) poiVar).e();
                        t1b t1bVar = new t1b(i, aqiVar, poiVar);
                        this.k = 1;
                        if (v5g.p(e, 1.0f, Q, t1bVar, this, 4) == nm6Var8) {
                            break;
                        }
                    } else {
                        ((t6k) poiVar).h(0.0f);
                    }
                } else if (i13 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                aqiVar.setValue(Boolean.valueOf(!z16));
                break;
            case 10:
                nm6 nm6Var9 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    mc1 mc1Var = ((t3g) this.m).c().c;
                    c01 c01Var = (c01) this.n;
                    j1g j1gVar = this.l ? j1g.b : j1g.c;
                    this.k = 1;
                    if (dc1.a(mc1Var, c01Var, j1gVar, this) == nm6Var9) {
                        break;
                    }
                } else if (i14 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 11:
                xlg xlgVar = (xlg) this.n;
                cvl cvlVar = (cvl) this.m;
                nm6 nm6Var10 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    if (Intrinsics.d(cvlVar.l, xxr.b)) {
                        pi4 pi4Var = xlgVar.d;
                        this.k = 1;
                        break;
                    }
                } else if (i15 == 1) {
                    qgg.h0(obj);
                } else if (i15 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    d = obj;
                    break;
                }
                boolean z17 = this.l;
                String str5 = xlgVar.e.c().a;
                str5.getClass();
                rtl rtlVar = xlgVar.a;
                this.k = 2;
                d = rtlVar.a.d(str5, cvlVar, z17, this);
                break;
            case 12:
                nm6 nm6Var11 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    lhk lhkVar = (lhk) this.m;
                    bve bveVar = (bve) this.n;
                    boolean z18 = this.l;
                    this.k = 1;
                    if (lhk.a(lhkVar, bveVar, z18, this) == nm6Var11) {
                        break;
                    }
                } else if (i16 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 13:
                yuk yukVar = (yuk) this.m;
                nm6 nm6Var12 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    ivk ivkVar = (ivk) yukVar.d.getValue();
                    ruk rukVar = (ruk) this.n;
                    this.k = 1;
                    if (ivkVar.a(rukVar, this) == nm6Var12) {
                        break;
                    }
                } else if (i17 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                boolean z19 = this.l;
                jyr jyrVar3 = yukVar.e;
                if (z19) {
                    wot wotVar = (wot) jyrVar3.getValue();
                    ssg.a(4, wotVar.a, "upload immediately request", null);
                    wotVar.f.c(Unit.a);
                } else {
                    wot wotVar2 = (wot) jyrVar3.getValue();
                    ssg.a(4, wotVar2.a, "upload request", null);
                    wotVar2.f.c(Unit.a);
                }
                break;
            case 14:
                nm6 nm6Var13 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    btl btlVar = (btl) this.m;
                    cvl cvlVar2 = (cvl) this.n;
                    boolean z20 = this.l;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str6 = ((frt) qdcVar.C(I)).c().a;
                    str6.getClass();
                    rtl rtlVar2 = btlVar.c;
                    this.k = 1;
                    d2 = rtlVar2.a.d(str6, cvlVar2, z20, this);
                    if (d2 == nm6Var13) {
                        break;
                    }
                } else if (i18 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    d2 = obj;
                }
                break;
            case 15:
                rjc rjcVar = (rjc) this.m;
                nm6 nm6Var14 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    pf4 pf4Var = (pf4) ((jyr) ((mmo) this.n).b).getValue();
                    boolean z21 = this.l;
                    this.m = rjcVar;
                    this.k = 1;
                    b2 = pf4Var.b(z21, this);
                    break;
                } else if (i19 == 1) {
                    qgg.h0(obj);
                    b2 = obj;
                } else if (i19 != 2 && i19 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                rj6 rj6Var3 = (rj6) b2;
                if (!(rj6Var3 instanceof pj6)) {
                    if (!(rj6Var3 instanceof qj6)) {
                        b6e.s();
                        break;
                    } else {
                        t0m t0mVar = new t0m((gf4) ((qj6) rj6Var3).a);
                        this.m = null;
                        this.k = 3;
                        break;
                    }
                } else {
                    u0m u0mVar = u0m.a;
                    this.m = null;
                    this.k = 2;
                    break;
                }
            case 16:
                nm6 nm6Var15 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    if (this.l) {
                        pjc b02 = zsd.b0(new bca(szf.s0(new r93(i3, (u0s) this.m)), 18));
                        gfl gflVar = new gfl(12, (rbm) this.n);
                        this.k = 1;
                        if (b02.collect(gflVar, this) == nm6Var15) {
                            break;
                        }
                    }
                } else if (i20 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 17:
                nm6 nm6Var16 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    kbn kbnVar = (kbn) this.m;
                    String str7 = (String) this.n;
                    boolean z22 = this.l;
                    this.k = 1;
                    if (kbnVar.f(str7, z22, this) == nm6Var16) {
                        break;
                    }
                } else if (i21 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 18:
                nm6 nm6Var17 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    d0q d0qVar = (d0q) this.n;
                    tu6 tu6Var2 = d0qVar.b;
                    frt frtVar = d0qVar.a;
                    this.m = tu6Var2;
                    this.k = 1;
                    f = frtVar.f(this);
                    if (f != nm6Var17) {
                        tu6Var = tu6Var2;
                    }
                    break;
                } else if (i22 == 1) {
                    tu6 tu6Var3 = (tu6) this.m;
                    qgg.h0(obj);
                    tu6Var = tu6Var3;
                    f = obj;
                } else if (i22 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                this.m = null;
                this.k = 2;
                tu6Var.getClass();
                Object V5 = x97.V(dm6.b, new qk(tu6Var, (xxq) f, this.l, null, 4), this);
                if (V5 != nm6Var17) {
                    V5 = Unit.a;
                    break;
                }
                break;
            case 19:
                n5q n5qVar = (n5q) this.n;
                nm6 nm6Var18 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    V = x97.V(dm6.b(), new l5q(n5qVar, z4 ? 1 : 0, i3), this);
                    break;
                } else if (i23 == 1) {
                    qgg.h0(obj);
                    V = obj;
                } else if (i23 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    q5d q5dVar = (q5d) this.m;
                    qgg.h0(obj);
                    break;
                }
                q5d q5dVar2 = new q5d(((Boolean) V).booleanValue());
                gld.L(n5qVar.e, null);
                ssg.a(4, null, "release", null);
                n5qVar.f.getClass();
                n5qVar.f = new i5q(null);
                if (this.l) {
                    n5qVar.b.Q(new gzk(h1b.e, tnl.a, false, false));
                }
                a7q a7qVar = n5qVar.a;
                this.m = q5dVar2;
                this.k = 2;
                a7qVar.getClass();
                Object V6 = x97.V(mal.b(), new x6q(a7qVar, z5 ? 1 : 0, 9), this);
                if (V6 != nm6Var18) {
                    V6 = Unit.a;
                }
                if (V6 != nm6Var18) {
                    break;
                }
                break;
            case 20:
                nm6 nm6Var19 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    m8q m8qVar = (m8q) this.n;
                    ytpVar = m8qVar.b;
                    pjc g = m8qVar.a.g();
                    this.m = ytpVar;
                    this.k = 1;
                    g02 = zsd.g0(g, this);
                    break;
                } else if (i24 == 1) {
                    ytp ytpVar2 = (ytp) this.m;
                    qgg.h0(obj);
                    ytpVar = ytpVar2;
                    g02 = obj;
                } else if (i24 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                String str8 = ((xxq) g02).a;
                boolean z23 = this.l;
                this.m = null;
                this.k = 2;
                break;
            case 21:
                nm6 nm6Var20 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var = (fk0) this.m;
                    Float f2 = new Float(this.l ? 1.0f : 0.8f);
                    act actVar = (act) this.n;
                    this.k = 1;
                    if (fk0.c(fk0Var, f2, actVar, null, this, 12) == nm6Var20) {
                        break;
                    }
                } else if (i25 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 22:
                jcu jcuVar = (jcu) this.n;
                nm6 nm6Var21 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    if (!((Boolean) jcuVar.c.getValue()).booleanValue()) {
                        pjc g2 = ((frt) jcuVar.b.getValue()).g();
                        this.m = jcuVar;
                        this.k = 1;
                        g03 = zsd.g0(g2, this);
                        if (g03 == nm6Var21) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (i26 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    jcuVar = (jcu) this.m;
                    qgg.h0(obj);
                    g03 = obj;
                }
                xxq xxqVar = (xxq) g03;
                Context context = jcuVar.a;
                xxqVar.getClass();
                SharedPreferences sharedPreferences = context.getSharedPreferences("PLAYER_VIDEO_PREFERENCES" + xxqVar.a, 0);
                sharedPreferences.getClass();
                boolean z24 = this.l;
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.getClass();
                edit.putBoolean("KEY_PLAYER_VIDEO", z24);
                edit.apply();
                break;
            case 23:
                nm6 nm6Var22 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    if (this.l) {
                        Function1 function1 = (Function1) this.m;
                        this.k = 1;
                        if (function1.invoke(this) == nm6Var22) {
                            break;
                        }
                    }
                } else if (i27 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                u3v u3vVar = (u3v) this.n;
                x97.y(u3vVar.i, null, null, new npt(u3vVar, z6 ? 1 : 0, i), 3);
                break;
            case 24:
                boolean z25 = this.l;
                nm6 nm6Var23 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    if (z25) {
                    }
                } else if (i28 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    ssg.a(3, "WaveOfflineEngine", "Call for periodic save of recommender state", null);
                    dlj c = ((cvu) this.n).c();
                    if (c != null) {
                        c.a();
                    }
                    if (z25 || !gld.T((mm6) this.m)) {
                        break;
                    } else {
                        this.l = z25;
                        this.k = 1;
                        if (y2x.o(600000L, this) == nm6Var23) {
                            break;
                        }
                        ssg.a(3, "WaveOfflineEngine", "Call for periodic save of recommender state", null);
                        dlj c2 = ((cvu) this.n).c();
                        if (c2 != null) {
                        }
                        if (z25) {
                        }
                    }
                }
            case 25:
                String str9 = (String) this.n;
                b bVar = (b) this.m;
                nm6 nm6Var24 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    if (this.l) {
                        a aVar = bVar.b;
                        this.k = 1;
                        a5 = aVar.a(str9, this);
                        if (a5 == nm6Var24) {
                            break;
                        }
                    }
                    bVar.c.i(str9);
                    break;
                } else if (i29 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    a5 = obj;
                }
                str9 = (String) a5;
                bVar.c.i(str9);
            default:
                String str10 = (String) this.n;
                k kVar = (k) this.m;
                nm6 nm6Var25 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    if (this.l) {
                        a aVar2 = kVar.n;
                        this.k = 1;
                        a6 = aVar2.a(str10, this);
                        if (a6 == nm6Var25) {
                            break;
                        }
                    }
                    kVar.r.i(str10);
                    break;
                } else if (i30 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    a6 = obj;
                }
                str10 = (String) a6;
                kVar.r.i(str10);
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cg1(Object obj, Object obj2, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
        this.l = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cg1(Object obj, boolean z, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.l = z;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cg1(Object obj, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
        this.l = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cg1(boolean z, Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = z;
        this.m = obj;
        this.n = obj2;
    }
}
