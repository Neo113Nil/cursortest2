package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import com.yandex.passport.common.core.b;
import com.yandex.passport.internal.config.n;
import com.yandex.passport.internal.usecase.vpn.e;
import defpackage.hmm;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class z11 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ boolean l;
    public /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z11(c3h c3hVar, Continuation continuation) {
        super(2, continuation);
        this.j = 8;
        this.m = c3hVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new z11((b21) this.m, this.l, continuation, 0);
            case 1:
                return new z11((x81) this.m, this.l, continuation, 1);
            case 2:
                return new z11(this.l, (t32) this.m, continuation, 2);
            case 3:
                z11 z11Var = new z11(this.l, continuation);
                z11Var.m = obj;
                return z11Var;
            case 4:
                return new z11((l06) this.m, this.l, continuation, 4);
            case 5:
                return new z11((ju0) this.m, this.l, continuation, 5);
            case 6:
                return new z11(this.l, (bw1) this.m, continuation, 6);
            case 7:
                return new z11(this.l, (z8f) this.m, continuation, 7);
            case 8:
                z11 z11Var2 = new z11((c3h) this.m, continuation);
                z11Var2.l = ((Boolean) obj).booleanValue();
                return z11Var2;
            case 9:
                return new z11((vm0) this.m, this.l, continuation, 9);
            case 10:
                return new z11((jac) this.m, this.l, continuation, 10);
            case 11:
                return new z11((cmj) this.m, this.l, continuation, 11);
            case 12:
                return new z11((g4l) this.m, this.l, continuation, 12);
            case 13:
                return new z11((uol) this.m, this.l, continuation, 13);
            case 14:
                return new z11((grl) this.m, this.l, continuation, 14);
            case 15:
                return new z11((fk0) this.m, this.l, continuation, 15);
            case 16:
                return new z11((dzl) this.m, this.l, continuation, 16);
            case 17:
                return new z11((syp) this.m, this.l, continuation, 17);
            case 18:
                return new z11((r2q) this.m, this.l, continuation, 18);
            case 19:
                return new z11((t8q) this.m, this.l, continuation, 19);
            case 20:
                return new z11(this.l, (ka0) this.m, continuation, 20);
            case 21:
                return new z11((qbs) this.m, this.l, continuation, 21);
            case 22:
                return new z11(this.l, (d9v) this.m, continuation, 22);
            default:
                return new z11((e) this.m, this.l, continuation, 23);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
        }
        return ((z11) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0292, code lost:
    
        if (defpackage.fk0.c(r0, r1, r2, null, r20, 12) == r6) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0265, code lost:
    
        if (r0.f(r1, r20) == r6) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0346, code lost:
    
        if (r0 != r1) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0332, code lost:
    
        if (r2.c0(r20) == r1) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0323, code lost:
    
        if (r2.m(r5, r20) == r1) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x048a, code lost:
    
        if (defpackage.y2x.o(5000, r20) == r3) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0478, code lost:
    
        if (defpackage.y2x.o(500, r20) == r3) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        if (defpackage.y2x.o(5000, r20) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
    
        if (defpackage.y2x.o(1000, r20) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0344  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Pair pair;
        Object a2;
        Object t7oVar;
        Object a3;
        Object D;
        Object a4;
        SharedPreferences.Editor edit;
        int i = 22;
        int i2 = 0;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                boolean z = this.l;
                b21 b21Var = (b21) this.m;
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    w11 w11Var = (w11) ((jyr) b21Var.b.d).getValue();
                    this.k = 1;
                    t3g t3gVar = (t3g) w11Var.b.getValue();
                    c01 c01Var = w11Var.a;
                    t3gVar.getClass();
                    c01Var.getClass();
                    x97.y(t3gVar.a, null, null, new cg1(t3gVar, c01Var, z, (Continuation) null, 10), 3);
                    if (Unit.a == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                x11 x11Var = b21Var.d;
                c01 c01Var2 = b21Var.a;
                Activity activity = x11Var.a;
                c01Var2.getClass();
                qld.I(10L, x11Var.e);
                if (z) {
                    jyr jyrVar = ols.a;
                    int a5 = ols.a("artist_undislike_click_counter");
                    if (ols.b.contains(Integer.valueOf(a5))) {
                        hag.x(activity, R.string.artist_was_removed_from_dislikes, 0);
                    }
                    SharedPreferences.Editor edit2 = ((SharedPreferences) ols.a.getValue()).edit();
                    edit2.putInt("artist_undislike_click_counter", a5);
                    edit2.apply();
                } else {
                    if (z) {
                        b6e.s();
                        return null;
                    }
                    jyr jyrVar2 = ols.a;
                    int a6 = ols.a("artist_dislike_click_counter");
                    if (ols.b.contains(Integer.valueOf(a6))) {
                        hag.x(activity, R.string.artist_added_to_dislikes, 0);
                    }
                    SharedPreferences.Editor edit3 = ((SharedPreferences) ols.a.getValue()).edit();
                    edit3.putInt("artist_dislike_click_counter", a6);
                    edit3.apply();
                }
                return Unit.a;
            case 1:
                x81 x81Var = (x81) this.m;
                f81 f81Var = x81Var.j;
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    a91 a91Var = x81Var.i;
                    boolean z2 = this.l;
                    this.k = 1;
                    a = a91Var.a(f81Var, z2, this);
                    if (a == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                rj6 rj6Var = (rj6) a;
                if (rj6Var instanceof qj6) {
                    pair = new Pair(((qj6) rj6Var).a, new d73(f81Var));
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    ((pj6) rj6Var).a();
                    pair = new Pair(null, new c73(f81Var));
                }
                e91 e91Var = (e91) pair.a;
                e73 e73Var = (e73) pair.b;
                if (e91Var != null) {
                    xdr xdrVar = x81Var.l;
                    xdrVar.getClass();
                    xdrVar.m(null, e91Var);
                }
                x81Var.m.l(e73Var);
                return Unit.a;
            case 2:
                t32 t32Var = (t32) this.m;
                nm6 nm6Var3 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    if (!this.l) {
                        q12 a7 = t32.a(t32Var);
                        this.k = 1;
                        a2 = a7.a(this);
                        if (a2 == nm6Var3) {
                            return nm6Var3;
                        }
                    }
                    return Unit.a;
                }
                if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                a2 = obj;
                if (((Number) a2).intValue() != 0) {
                    if (!((Boolean) t32Var.o.getValue()).booleanValue()) {
                        ((tnb) t32Var.m.c.getValue()).e();
                    }
                    xdr xdrVar2 = t32Var.o;
                    Boolean bool = Boolean.TRUE;
                    xdrVar2.getClass();
                    xdrVar2.m(null, bool);
                }
                return Unit.a;
            case 3:
                ltm ltmVar = (ltm) this.m;
                nm6 nm6Var4 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    qe2 qe2Var = new qe2(i2, ltmVar);
                    frc.a(qe2Var);
                    if (this.l) {
                        ((oc4) ltmVar).c(Boolean.TRUE);
                    }
                    ri1 ri1Var = new ri1(i, qe2Var);
                    this.m = null;
                    this.k = 1;
                    if (y7g.q(ltmVar, ri1Var, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                boolean z3 = this.l;
                l06 l06Var = (l06) this.m;
                nm6 nm6Var5 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    if (!(l06Var.l.getValue() instanceof bpq)) {
                        xdr xdrVar3 = l06Var.l;
                        xdrVar3.getClass();
                        xdrVar3.m(null, apq.a);
                    }
                    if (z3) {
                        l06Var.o.p();
                    }
                    this.k = 1;
                    if (l06.a(l06Var, z3, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (z3) {
                    l06Var.o.o();
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i8 = this.k;
                try {
                    if (i8 == 0) {
                        qgg.h0(obj);
                        ju0 ju0Var = (ju0) this.m;
                        boolean z4 = this.l;
                        r7o r7oVar = z7o.b;
                        this.k = 1;
                        if (ju0.c(ju0Var, z4, this) == nm6Var6) {
                            return nm6Var6;
                        }
                    } else {
                        if (i8 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    t7oVar = Unit.a;
                    r7o r7oVar2 = z7o.b;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th);
                }
                return new z7o(t7oVar);
            case 6:
                bw1 bw1Var = (bw1) this.m;
                nm6 nm6Var7 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    boolean z5 = this.l;
                    y58 y58Var = (y58) bw1Var.j;
                    if (!z5) {
                        if (y58Var != null) {
                            y58Var.b(false, false);
                        }
                        return Unit.a;
                    }
                    if (y58Var != null) {
                        y58Var.b(true, false);
                    }
                    this.k = 1;
                    if (y2x.o(500L, this) == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                y58 y58Var2 = (y58) bw1Var.j;
                if (y58Var2 != null) {
                    y58Var2.b(true, true);
                }
                return Unit.a;
            case 7:
                z8f z8fVar = (z8f) this.m;
                nm6 nm6Var8 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    if (!this.l) {
                        p8f p8fVar = (p8f) z8fVar.e;
                        if (p8fVar != null) {
                            p8fVar.d(false, false);
                        }
                        return Unit.a;
                    }
                    p8f p8fVar2 = (p8f) z8fVar.e;
                    if (p8fVar2 != null) {
                        p8fVar2.d(true, false);
                    }
                    this.k = 1;
                    break;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        p8f p8fVar3 = (p8f) z8fVar.e;
                        if (p8fVar3 != null) {
                            p8fVar3.d(false, false);
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                }
                p8f p8fVar4 = (p8f) z8fVar.e;
                if (p8fVar4 != null) {
                    p8fVar4.d(true, true);
                }
                this.k = 2;
                break;
            case 8:
                c3h c3hVar = (c3h) this.m;
                boolean z6 = this.l;
                nm6 nm6Var9 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    if (z6) {
                        c3hVar.getClass();
                        this.l = z6;
                        this.k = 1;
                        if (y2x.o(5000L, this) == nm6Var9) {
                            return nm6Var9;
                        }
                    }
                    return Unit.a;
                }
                if (i11 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                c3hVar.c.invoke(z2h.a);
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    vm0 vm0Var = (vm0) this.m;
                    Float f = new Float(this.l ? 1.0f : 0.0f);
                    act actVar = rbi.a;
                    this.k = 1;
                    if (v5g.s(vm0Var, f, actVar, false, null, this, 12) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    wb7 wb7Var = (wb7) ((jyr) ((jac) this.m).d).getValue();
                    ze1 ze1Var = new ze1(this.l, null);
                    this.k = 1;
                    a3 = lmm.a(wb7Var, ze1Var, this);
                    if (a3 == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a3 = obj;
                }
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                int i14 = this.k;
                if (i14 != 0) {
                    if (i14 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                cmj cmjVar = (cmj) this.m;
                boolean z7 = this.l;
                this.k = 1;
                Object V = x97.V(dm6.b, new bmj(cmjVar, z7, null), this);
                return V == nm6Var12 ? nm6Var12 : V;
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    x6l x6lVar = ((g4l) this.m).b;
                    boolean z8 = this.l;
                    this.k = 1;
                    if (x6lVar.g(z8, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                uol uolVar = (uol) this.m;
                nm6 nm6Var14 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    x6l x6lVar2 = uolVar.c;
                    pmt pmtVar = pmt.a;
                    this.k = 1;
                    break;
                } else if (i16 == 1) {
                    qgg.h0(obj);
                } else if (i16 == 2) {
                    qgg.h0(obj);
                    xdh xdhVar = uolVar.d;
                    this.k = 3;
                    D = ((b9l) xdhVar.d).D(this);
                    if (D != nm6Var14) {
                        D = Unit.a;
                        break;
                    }
                } else {
                    if (i16 == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (this.l) {
                    lum lumVar = uolVar.a;
                    this.k = 2;
                    break;
                }
                xdh xdhVar2 = uolVar.d;
                this.k = 3;
                D = ((b9l) xdhVar2.d).D(this);
                if (D != nm6Var14) {
                }
                break;
            case 14:
                nm6 nm6Var15 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    yks yksVar = ((grl) this.m).u;
                    boolean z9 = this.l;
                    this.k = 1;
                    yksVar.getClass();
                    Pair pair2 = !z9 ? new Pair(new Integer(R.string.shuffle_on), "SHUFFLE_ENABLED_MESSAGE") : new Pair(new Integer(R.string.shuffle_off), "SHUFFLE_DISABLED_MESSAGE");
                    Object o = yksVar.o(((Number) pair2.a).intValue(), (String) pair2.b, this);
                    if (o != nm6Var15) {
                        o = Unit.a;
                    }
                    if (o == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                nm6 nm6Var16 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var = (fk0) this.m;
                    Float f2 = new Float(1.0f);
                    this.k = 1;
                    break;
                } else {
                    if (i18 != 1) {
                        if (i18 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (this.l) {
                    fk0 fk0Var2 = (fk0) this.m;
                    Float f3 = new Float(0.6f);
                    vje C = weo.C(weo.S(250, 0, orl.a, 2), jyn.b, 0L, 4);
                    this.k = 2;
                    break;
                }
                return Unit.a;
            case 16:
                nm6 nm6Var17 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    dzl dzlVar = (dzl) this.m;
                    hmm.a aVar = dzl.e;
                    wb7 a8 = dzlVar.a();
                    if (a8 != null) {
                        czl czlVar = new czl(this.l, null);
                        this.k = 1;
                        a4 = a8.a(czlVar, this);
                        if (a4 == nm6Var17) {
                            return nm6Var17;
                        }
                    }
                    return Unit.a;
                }
                if (i19 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                a4 = obj;
                return Unit.a;
            case 17:
                Object obj2 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    syp sypVar = (syp) this.m;
                    xf2 xf2Var = sypVar.b;
                    xxq c = sypVar.a.c();
                    boolean z10 = this.l;
                    this.k = 1;
                    Object V2 = x97.V(dm6.b, new qk(xf2Var, c, z10, null, 3), this);
                    if (V2 != obj2) {
                        V2 = Unit.a;
                    }
                    if (V2 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                boolean z11 = this.l;
                r2q r2qVar = (r2q) this.m;
                Object obj3 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    v3w.n(z11, r2qVar.d, null);
                    tfj tfjVar = r2qVar.a;
                    this.k = 1;
                    Object V3 = x97.V(dm6.b, new ze1(tfjVar, z11, continuation, 9), this);
                    if (V3 != obj3) {
                        V3 = Unit.a;
                    }
                    if (V3 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 19:
                boolean z12 = this.l;
                t8q t8qVar = (t8q) this.m;
                Object obj4 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    v3w.n(z12, t8qVar.c, null);
                    jcu jcuVar = t8qVar.a;
                    this.k = 1;
                    Object V4 = x97.V(dm6.b, new cg1(jcuVar, z12, continuation, i), this);
                    if (V4 != obj4) {
                        V4 = Unit.a;
                    }
                    if (V4 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 20:
                ka0 ka0Var = (ka0) this.m;
                boolean z13 = this.l;
                nm6 nm6Var18 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    if (z13 != ((Boolean) ka0Var.g.getValue()).booleanValue()) {
                        Boolean valueOf = Boolean.valueOf(z13);
                        this.k = 1;
                        if (xp3.p(ka0Var, valueOf, ka0Var.k.e(), this) == nm6Var18) {
                            return nm6Var18;
                        }
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 21:
                qbs qbsVar = (qbs) this.m;
                nm6 nm6Var19 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    if (rds.b(qbsVar.k().b)) {
                        return Unit.a;
                    }
                    kp4 kp4Var = qbsVar.h;
                    if (kp4Var != null) {
                        dp4 Z = zc4.Z(g0g.L(qbsVar.k()));
                        this.k = 1;
                        if (((ce0) kp4Var).a(Z) == nm6Var19) {
                            return nm6Var19;
                        }
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (!this.l) {
                    return Unit.a;
                }
                int d = rds.d(qbsVar.k().b);
                qbsVar.c.invoke(qbs.c(qbsVar.k().a, y5g.P(d, d)));
                qbsVar.o(zrd.a);
                return Unit.a;
            case 22:
                aqi aqiVar = ((d9v) this.m).b;
                nm6 nm6Var20 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    if (!this.l) {
                        aqiVar.setValue(Boolean.TRUE);
                        return Unit.a;
                    }
                    this.k = 1;
                    break;
                } else {
                    if (i25 != 1) {
                        if (i25 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        aqiVar.setValue(Boolean.FALSE);
                        return Unit.a;
                    }
                    qgg.h0(obj);
                }
                aqiVar.setValue(Boolean.TRUE);
                this.k = 2;
                break;
            default:
                boolean z14 = this.l;
                e eVar = (e) this.m;
                nm6 nm6Var21 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    n nVar = eVar.e;
                    b bVar = b.c;
                    nVar.getClass();
                    SharedPreferences a9 = nVar.a.a(bVar);
                    if (a9 != null && (edit = a9.edit()) != null) {
                        edit.putBoolean("vpnBlockerUserDisabled", z14);
                        edit.apply();
                    }
                    if (z14) {
                        x0q x0qVar = eVar.m;
                        Unit unit = Unit.a;
                        this.k = 1;
                        if (x0qVar.emit(unit, this) == nm6Var21) {
                            return nm6Var21;
                        }
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z11(Object obj, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.l = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z11(boolean z, Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = z;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z11(boolean z, Continuation continuation) {
        super(2, continuation);
        this.j = 3;
        this.l = z;
    }
}
