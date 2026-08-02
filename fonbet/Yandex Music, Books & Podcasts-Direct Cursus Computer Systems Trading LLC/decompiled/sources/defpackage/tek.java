package defpackage;

import android.animation.ObjectAnimator;
import android.content.SharedPreferences;
import android.view.View;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.AppMetrica;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.YMApplication;

/* loaded from: classes3.dex */
public final class tek implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public tek(rjc rjcVar, Function2 function2) {
        this.a = 28;
        this.b = rjcVar;
        this.c = (ezc) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(wkk wkkVar, Continuation continuation) {
        skk skkVar;
        int i;
        if (continuation instanceof skk) {
            skkVar = (skk) continuation;
            int i2 = skkVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                skkVar.m = i2 - Integer.MIN_VALUE;
                Object obj = skkVar.k;
                nm6 nm6Var = nm6.a;
                i = skkVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    wkkVar.getClass();
                    ((zh) this.b).a("android.permission.CAMERA");
                    zi3 zi3Var = (zi3) this.c;
                    skkVar.j = wkkVar;
                    skkVar.m = 1;
                    obj = zi3Var.l(skkVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wkkVar = skkVar.j;
                    qgg.h0(obj);
                }
                wkkVar.a.invoke(!((Boolean) obj).booleanValue() ? ykk.a : xkk.a);
                return Unit.a;
            }
        }
        skkVar = new skk(this, continuation);
        Object obj2 = skkVar.k;
        nm6 nm6Var2 = nm6.a;
        i = skkVar.m;
        if (i != 0) {
        }
        wkkVar.a.invoke(!((Boolean) obj2).booleanValue() ? ykk.a : xkk.a);
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:292:0x0592, code lost:
    
        if (r11.emit(r1, r13) == r8) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0523, code lost:
    
        if (r10.d.a(r1 instanceof defpackage.pw, r13) == r8) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x065c, code lost:
    
        if (r7.emit(r2, r3) == r4) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0717, code lost:
    
        if (r2.emit(r7, r3) != r4) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x070a, code lost:
    
        if (r7 == r4) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0790, code lost:
    
        if (r2.emit(r1, r3) == r4) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0777, code lost:
    
        if (r7 == r4) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00eb, code lost:
    
        if (r1.emit(r2, r3) != r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0161, code lost:
    
        if (r1.emit(r2, r3) != r4) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0190  */
    /* JADX WARN: Type inference failed for: r10v29, types: [ezc, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r12v25, types: [wb7] */
    /* JADX WARN: Type inference failed for: r4v52, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        cxk cxkVar;
        int i;
        Object obj2;
        cfl cflVar;
        int i2;
        wvl wvlVar;
        int i3;
        l4m l4mVar;
        int i4;
        Object d73Var;
        g6m g6mVar;
        int i5;
        rjc rjcVar;
        Object obj3;
        sam samVar;
        int i6;
        rjc rjcVar2;
        rjc rjcVar3;
        Object V;
        dfm dfmVar;
        int i7;
        jkm jkmVar;
        int i8;
        rjc rjcVar4;
        int i9;
        kjm kjmVar;
        mwm mwmVar;
        int i10;
        rjc rjcVar5;
        zw zwVar;
        sw swVar;
        Object d73Var2;
        v1n v1nVar;
        int i11;
        u3n u3nVar;
        int i12;
        m6n m6nVar;
        int i13;
        edn ednVar;
        int i14;
        n7q n7qVar;
        mwk b;
        o6p o6pVar;
        int i15;
        vgp vgpVar;
        int i16;
        rjc rjcVar6;
        bjp bjpVar;
        int i17;
        rjc rjcVar7;
        bqp bqpVar;
        int i18;
        Object obj4 = obj;
        int i19 = this.a;
        int i20 = 5;
        int i21 = 0;
        r6 = false;
        boolean z = false;
        r6 = 0;
        int i22 = 0;
        int i23 = 0;
        i21 = 0;
        Object obj5 = this.c;
        Object obj6 = this.b;
        r12 = null;
        r12 = null;
        mqs mqsVar = null;
        switch (i19) {
            case 0:
                drc drcVar = (drc) obj4;
                xqn xqnVar = (xqn) obj6;
                drc drcVar2 = (drc) xqnVar.a;
                if (drcVar2 == null || drcVar.b != drcVar2.b) {
                    vek.b((vek) obj5, xgr.f, null, 6);
                }
                xqnVar.a = drcVar;
                break;
            case 1:
                break;
            case 2:
                if (continuation instanceof cxk) {
                    cxkVar = (cxk) continuation;
                    int i24 = cxkVar.k;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        cxkVar.k = i24 - Integer.MIN_VALUE;
                        Object obj7 = cxkVar.j;
                        nm6 nm6Var = nm6.a;
                        i = cxkVar.k;
                        if (i != 0) {
                            qgg.h0(obj7);
                            rjc rjcVar8 = (rjc) obj6;
                            mjs mjsVar = (mjs) obj4;
                            if (mjsVar instanceof kjs) {
                                obj2 = new xqp(nsa.f(r1.b()) / nsa.f(r1.a()), nsa.f(((kjs) mjsVar).b()), ((irp) obj5).b);
                            } else if (!Intrinsics.d(mjsVar, ljs.a)) {
                                b6e.s();
                                break;
                            } else {
                                obj2 = yqp.a;
                            }
                            cxkVar.k = 1;
                            if (rjcVar8.emit(obj2, cxkVar) == nm6Var) {
                                break;
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj7);
                        }
                        break;
                    }
                }
                cxkVar = new cxk(this, continuation);
                Object obj72 = cxkVar.j;
                nm6 nm6Var2 = nm6.a;
                i = cxkVar.k;
                if (i != 0) {
                }
            case 3:
                adl adlVar = (adl) obj6;
                ObjectAnimator objectAnimator = adlVar.r;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                adlVar.r = o2g.i0((View) obj5);
                break;
            case 4:
                if (continuation instanceof cfl) {
                    cflVar = (cfl) continuation;
                    int i25 = cflVar.k;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        cflVar.k = i25 - Integer.MIN_VALUE;
                        Object obj8 = cflVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = cflVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj8);
                            rjc rjcVar9 = (rjc) obj6;
                            n7q n7qVar2 = (n7q) obj4;
                            ((efl) obj5).a.getClass();
                            h01 h01Var = h01.r;
                            n7qVar2.getClass();
                            vbn vbnVar = (vbn) wdg.A(n7qVar2, new qzc(26, h01Var));
                            if (vbnVar != null) {
                                cflVar.k = 1;
                                if (rjcVar9.emit(vbnVar, cflVar) == nm6Var3) {
                                    break;
                                }
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj8);
                        }
                        break;
                    }
                }
                cflVar = new cfl(this, continuation);
                Object obj82 = cflVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = cflVar.k;
                if (i2 != 0) {
                }
            case 5:
                if (continuation instanceof wvl) {
                    wvlVar = (wvl) continuation;
                    int i26 = wvlVar.k;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        wvlVar.k = i26 - Integer.MIN_VALUE;
                        Object obj9 = wvlVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = wvlVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj9);
                            rjc rjcVar10 = (rjc) obj6;
                            j1g j1gVar = (j1g) ((Map) obj4).get((nvl) obj5);
                            if (j1gVar == null) {
                                j1gVar = j1g.b;
                            }
                            wvlVar.k = 1;
                            if (rjcVar10.emit(j1gVar, wvlVar) == nm6Var4) {
                                break;
                            }
                        } else if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj9);
                        }
                        break;
                    }
                }
                wvlVar = new wvl(this, continuation);
                Object obj92 = wvlVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = wvlVar.k;
                if (i3 != 0) {
                }
            case 6:
                n0m n0mVar = (n0m) obj5;
                String str = (String) n0mVar.C0.getValue();
                xqn xqnVar2 = (xqn) obj6;
                if (Intrinsics.d(str, xqnVar2.a)) {
                    break;
                } else {
                    xqnVar2.a = str;
                    j0q j0qVar = n0mVar.G0;
                    Unit unit = Unit.a;
                    Object emit = j0qVar.emit(unit, continuation);
                    if (emit != nm6.a) {
                        break;
                    }
                }
                break;
            case 7:
                a1m a1mVar = (a1m) obj4;
                n0m n0mVar2 = (n0m) obj5;
                tqn tqnVar = (tqn) obj6;
                if (tqnVar.a && (n0mVar2.X.getValue() instanceof x0m)) {
                    n0mVar2.X.l(null);
                }
                if (!tqnVar.a) {
                    tqnVar.a = true;
                    if (a1mVar instanceof z0m) {
                        x97.y(ot0.F(n0mVar2), null, null, new d0m(n0mVar2, r12, i20), 3);
                    } else {
                        n0mVar2.J();
                    }
                }
                n0mVar2.X.l(a1mVar);
                break;
            case 8:
                m4m m4mVar = (m4m) obj5;
                xdr xdrVar = m4mVar.h;
                i4m i4mVar = m4mVar.g;
                if (continuation instanceof l4m) {
                    l4mVar = (l4m) continuation;
                    int i27 = l4mVar.k;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        l4mVar.k = i27 - Integer.MIN_VALUE;
                        Object obj10 = l4mVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = l4mVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj10);
                            rjc rjcVar11 = (rjc) obj6;
                            cvl cvlVar = (cvl) obj4;
                            if (cvlVar != null) {
                                ngt ngtVar = new ngt(cvlVar.b, vz1.w(op7.c(cvlVar).a), cvlVar.g);
                                xdrVar.getClass();
                                xdrVar.m(null, ngtVar);
                                m4mVar.i = cvlVar;
                                q43 q43Var = m4mVar.f;
                                q43Var.b(q43Var.a, 1, null, null);
                                d73Var = new d73(i4mVar);
                            } else if (xdrVar.getValue() instanceof ngt) {
                                d73Var = new d73(i4mVar);
                            } else {
                                bgt bgtVar = new bgt(false);
                                xdrVar.getClass();
                                xdrVar.m(null, bgtVar);
                                d73Var = new c73(i4mVar);
                            }
                            l4mVar.k = 1;
                            if (rjcVar11.emit(d73Var, l4mVar) == nm6Var5) {
                                break;
                            }
                        } else if (i4 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj10);
                        }
                        break;
                    }
                }
                l4mVar = new l4m(this, continuation);
                Object obj102 = l4mVar.j;
                nm6 nm6Var52 = nm6.a;
                i4 = l4mVar.k;
                if (i4 != 0) {
                }
            case 9:
                if (continuation instanceof g6m) {
                    g6mVar = (g6m) continuation;
                    int i28 = g6mVar.k;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        g6mVar.k = i28 - Integer.MIN_VALUE;
                        Object obj11 = g6mVar.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = g6mVar.k;
                        if (i5 == 0) {
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    qgg.h0(obj11);
                                    break;
                                } else {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                i21 = g6mVar.o;
                                rjc rjcVar12 = g6mVar.n;
                                Object obj12 = g6mVar.m;
                                qgg.h0(obj11);
                                rjcVar = rjcVar12;
                                obj4 = obj12;
                                obj3 = obj11;
                            }
                        } else {
                            qgg.h0(obj11);
                            rjcVar = (rjc) obj6;
                            if (((xxq) obj4).a()) {
                                hv0 hv0Var = ((j6m) obj5).c;
                                g6mVar.m = obj4;
                                g6mVar.n = rjcVar;
                                g6mVar.o = 0;
                                g6mVar.k = 1;
                                obj3 = hv0Var.invoke(g6mVar);
                                break;
                            } else {
                                obj3 = Boolean.FALSE;
                            }
                        }
                        if (((Boolean) obj3).booleanValue()) {
                            g6mVar.m = null;
                            g6mVar.n = null;
                            g6mVar.o = i21;
                            g6mVar.k = 2;
                            break;
                        }
                    }
                }
                g6mVar = new g6m(this, continuation);
                Object obj112 = g6mVar.j;
                nm6 nm6Var62 = nm6.a;
                i5 = g6mVar.k;
                if (i5 == 0) {
                }
                if (((Boolean) obj3).booleanValue()) {
                }
            case 10:
                if (continuation instanceof sam) {
                    samVar = (sam) continuation;
                    int i29 = samVar.k;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        samVar.k = i29 - Integer.MIN_VALUE;
                        Object obj13 = samVar.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = samVar.k;
                        Continuation continuation2 = null;
                        if (i6 == 0) {
                            if (i6 != 1) {
                                if (i6 == 2) {
                                    qgg.h0(obj13);
                                    break;
                                } else {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                i23 = samVar.n;
                                rjc rjcVar13 = samVar.m;
                                qgg.h0(obj13);
                                V = obj13;
                                rjcVar2 = rjcVar13;
                                rjcVar3 = null;
                            }
                        } else {
                            qgg.h0(obj13);
                            rjcVar2 = (rjc) obj6;
                            h35 h35Var = (h35) obj4;
                            List list = h35Var.a;
                            List list2 = h35Var.b;
                            samVar.m = rjcVar2;
                            samVar.n = 0;
                            samVar.k = 1;
                            n71 n71Var = new n71((tam) obj5, list, list2, continuation2, 26);
                            rjcVar3 = null;
                            V = x97.V(dm6.b, n71Var, samVar);
                            break;
                        }
                        samVar.m = rjcVar3;
                        samVar.n = i23;
                        samVar.k = 2;
                        break;
                    }
                }
                samVar = new sam(this, continuation);
                Object obj132 = samVar.j;
                nm6 nm6Var72 = nm6.a;
                i6 = samVar.k;
                Continuation continuation22 = null;
                if (i6 == 0) {
                }
                samVar.m = rjcVar3;
                samVar.n = i23;
                samVar.k = 2;
            case 11:
                if (continuation instanceof dfm) {
                    dfmVar = (dfm) continuation;
                    int i30 = dfmVar.k;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        dfmVar.k = i30 - Integer.MIN_VALUE;
                        Object obj14 = dfmVar.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = dfmVar.k;
                        if (i7 != 0) {
                            qgg.h0(obj14);
                            v3k E = wxf.E((v3k) obj4, new c5l((efm) obj5, r12, 14));
                            dfmVar.k = 1;
                            if (((rjc) obj6).emit(E, dfmVar) == nm6Var8) {
                                break;
                            }
                        } else if (i7 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj14);
                        }
                        break;
                    }
                }
                dfmVar = new dfm(this, continuation);
                Object obj142 = dfmVar.j;
                nm6 nm6Var82 = nm6.a;
                i7 = dfmVar.k;
                if (i7 != 0) {
                }
            case 12:
                lkm lkmVar = (lkm) obj5;
                if (continuation instanceof jkm) {
                    jkmVar = (jkm) continuation;
                    int i31 = jkmVar.k;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        jkmVar.k = i31 - Integer.MIN_VALUE;
                        Object obj15 = jkmVar.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = jkmVar.k;
                        if (i8 == 0) {
                            if (i8 != 1) {
                                if (i8 == 2) {
                                    qgg.h0(obj15);
                                    break;
                                } else {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                i9 = jkmVar.n;
                                rjcVar4 = jkmVar.m;
                                qgg.h0(obj15);
                            }
                        } else {
                            qgg.h0(obj15);
                            rjcVar4 = (rjc) obj6;
                            String str2 = (String) lkmVar.b.getValue();
                            if (str2 != null) {
                                xjm a = lkmVar.a();
                                jkmVar.m = rjcVar4;
                                jkmVar.n = 0;
                                jkmVar.k = 1;
                                obj15 = a.a(str2, jkmVar);
                                if (obj15 != nm6Var9) {
                                    i9 = 0;
                                }
                                break;
                            } else {
                                i9 = 0;
                                kjmVar = null;
                                Boolean valueOf = Boolean.valueOf(kjmVar != null ? kjmVar.j : false);
                                jkmVar.m = null;
                                jkmVar.n = i9;
                                jkmVar.k = 2;
                                break;
                            }
                        }
                        kjmVar = (kjm) obj15;
                        Boolean valueOf2 = Boolean.valueOf(kjmVar != null ? kjmVar.j : false);
                        jkmVar.m = null;
                        jkmVar.n = i9;
                        jkmVar.k = 2;
                    }
                }
                jkmVar = new jkm(this, continuation);
                Object obj152 = jkmVar.j;
                nm6 nm6Var92 = nm6.a;
                i8 = jkmVar.k;
                if (i8 == 0) {
                }
                kjmVar = (kjm) obj152;
                Boolean valueOf22 = Boolean.valueOf(kjmVar != null ? kjmVar.j : false);
                jkmVar.m = null;
                jkmVar.n = i9;
                jkmVar.k = 2;
            case 13:
                float floatValue = ((Number) obj4).floatValue();
                aqi aqiVar = (aqi) obj5;
                jap japVar = (jap) obj6;
                Float f = (Float) japVar.e.getValue();
                if (f != null) {
                    float floatValue2 = f.floatValue();
                    if (!japVar.a() && ((Number) aqiVar.getValue()).longValue() != 0) {
                        float floatValue3 = 500 / ((Number) aqiVar.getValue()).floatValue();
                        if (floatValue2 <= floatValue && floatValue <= floatValue2 + floatValue3) {
                            japVar.e.setValue(null);
                        }
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 14:
                nwm nwmVar = (nwm) obj5;
                fwm fwmVar = nwmVar.h;
                xdr xdrVar2 = nwmVar.k;
                if (continuation instanceof mwm) {
                    mwmVar = (mwm) continuation;
                    int i32 = mwmVar.k;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        mwmVar.k = i32 - Integer.MIN_VALUE;
                        Object obj16 = mwmVar.j;
                        nm6 nm6Var10 = nm6.a;
                        i10 = mwmVar.k;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    qgg.h0(obj16);
                                    break;
                                } else {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                i22 = mwmVar.p;
                                swVar = mwmVar.o;
                                zwVar = mwmVar.n;
                                rjcVar5 = mwmVar.m;
                                qgg.h0(obj16);
                            }
                        } else {
                            qgg.h0(obj16);
                            rjcVar5 = (rjc) obj6;
                            Pair pair = (Pair) obj4;
                            zwVar = (zw) pair.a;
                            swVar = (sw) pair.b;
                            if (!(swVar instanceof rw)) {
                                mwmVar.m = rjcVar5;
                                mwmVar.n = zwVar;
                                mwmVar.o = swVar;
                                mwmVar.p = 0;
                                mwmVar.k = 1;
                                break;
                            }
                            if (!Intrinsics.d(xdrVar2.getValue(), swVar)) {
                                if (swVar instanceof qw) {
                                    rmb.h(nwmVar.g, 1, 2);
                                } else if (!Intrinsics.d(swVar, pw.a) && !Intrinsics.d(swVar, rw.a)) {
                                    b6e.s();
                                    break;
                                }
                            }
                            xdrVar2.l(swVar);
                            if (!Intrinsics.d(zwVar, vw.a) || Intrinsics.d(zwVar, ww.a) || (zwVar instanceof xw) || (zwVar instanceof yw)) {
                                d73Var2 = new d73(fwmVar);
                            } else if (!(zwVar instanceof uw)) {
                                b6e.s();
                                break;
                            } else {
                                d73Var2 = new c73(fwmVar);
                            }
                            mwmVar.m = null;
                            mwmVar.n = null;
                            mwmVar.o = null;
                            mwmVar.p = i22;
                            mwmVar.k = 2;
                            break;
                        }
                        nwmVar.b(swVar instanceof pw);
                        if (!Intrinsics.d(xdrVar2.getValue(), swVar)) {
                        }
                        xdrVar2.l(swVar);
                        if (!Intrinsics.d(zwVar, vw.a)) {
                        }
                        d73Var2 = new d73(fwmVar);
                        mwmVar.m = null;
                        mwmVar.n = null;
                        mwmVar.o = null;
                        mwmVar.p = i22;
                        mwmVar.k = 2;
                    }
                }
                mwmVar = new mwm(this, continuation);
                Object obj162 = mwmVar.j;
                nm6 nm6Var102 = nm6.a;
                i10 = mwmVar.k;
                if (i10 == 0) {
                }
                nwmVar.b(swVar instanceof pw);
                if (!Intrinsics.d(xdrVar2.getValue(), swVar)) {
                }
                xdrVar2.l(swVar);
                if (!Intrinsics.d(zwVar, vw.a)) {
                }
                d73Var2 = new d73(fwmVar);
                mwmVar.m = null;
                mwmVar.n = null;
                mwmVar.o = null;
                mwmVar.p = i22;
                mwmVar.k = 2;
                break;
            case 15:
                if (continuation instanceof v1n) {
                    v1nVar = (v1n) continuation;
                    int i33 = v1nVar.k;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        v1nVar.k = i33 - Integer.MIN_VALUE;
                        Object obj17 = v1nVar.j;
                        nm6 nm6Var11 = nm6.a;
                        i11 = v1nVar.k;
                        if (i11 != 0) {
                            qgg.h0(obj17);
                            Boolean bool = (Boolean) obj4;
                            bool.getClass();
                            Pair pair2 = new Pair((x74) obj5, bool);
                            v1nVar.k = 1;
                            if (((rjc) obj6).emit(pair2, v1nVar) == nm6Var11) {
                                break;
                            }
                        } else if (i11 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj17);
                        }
                        break;
                    }
                }
                v1nVar = new v1n(this, continuation);
                Object obj172 = v1nVar.j;
                nm6 nm6Var112 = nm6.a;
                i11 = v1nVar.k;
                if (i11 != 0) {
                }
            case 16:
                if (continuation instanceof u3n) {
                    u3nVar = (u3n) continuation;
                    int i34 = u3nVar.k;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        u3nVar.k = i34 - Integer.MIN_VALUE;
                        Object obj18 = u3nVar.j;
                        nm6 nm6Var12 = nm6.a;
                        i12 = u3nVar.k;
                        if (i12 != 0) {
                            qgg.h0(obj18);
                            rjc rjcVar14 = (rjc) obj6;
                            v02 v02Var = (v02) obj4;
                            r12 = v02Var != null ? ((dc7) ((cc7) obj5)).c(String.valueOf(v02Var.a), "purchase_communication_funnel_tracker") : null;
                            u3nVar.k = 1;
                            if (rjcVar14.emit(r12, u3nVar) == nm6Var12) {
                                break;
                            }
                        } else if (i12 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj18);
                        }
                        break;
                    }
                }
                u3nVar = new u3n(this, continuation);
                Object obj182 = u3nVar.j;
                nm6 nm6Var122 = nm6.a;
                i12 = u3nVar.k;
                if (i12 != 0) {
                }
            case 17:
                if (continuation instanceof m6n) {
                    m6nVar = (m6n) continuation;
                    int i35 = m6nVar.k;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        m6nVar.k = i35 - Integer.MIN_VALUE;
                        Object obj19 = m6nVar.j;
                        nm6 nm6Var13 = nm6.a;
                        i13 = m6nVar.k;
                        if (i13 != 0) {
                            qgg.h0(obj19);
                            k6n k6nVar = new k6n((uft) obj4, ((n6n) obj5).l);
                            m6nVar.k = 1;
                            if (((rjc) obj6).emit(k6nVar, m6nVar) == nm6Var13) {
                                break;
                            }
                        } else if (i13 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj19);
                        }
                        break;
                    }
                }
                m6nVar = new m6n(this, continuation);
                Object obj192 = m6nVar.j;
                nm6 nm6Var132 = nm6.a;
                i13 = m6nVar.k;
                if (i13 != 0) {
                }
            case 18:
                if (continuation instanceof edn) {
                    ednVar = (edn) continuation;
                    int i36 = ednVar.k;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        ednVar.k = i36 - Integer.MIN_VALUE;
                        Object obj20 = ednVar.j;
                        nm6 nm6Var14 = nm6.a;
                        i14 = ednVar.k;
                        if (i14 != 0) {
                            qgg.h0(obj20);
                            n7q n7qVar3 = ((d6l) obj4).a;
                            a2t a2tVar = ((fdn) obj5).a;
                            n7qVar3.getClass();
                            idn idnVar = (idn) wdg.A(n7qVar3, new bm1(a2tVar, 1));
                            ednVar.k = 1;
                            if (((rjc) obj6).emit(idnVar, ednVar) == nm6Var14) {
                                break;
                            }
                        } else if (i14 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj20);
                        }
                        break;
                    }
                }
                ednVar = new edn(this, continuation);
                Object obj202 = ednVar.j;
                nm6 nm6Var142 = nm6.a;
                i14 = ednVar.k;
                if (i14 != 0) {
                }
            case 19:
                ein einVar = (ein) obj6;
                lja ljaVar = (lja) ((e6q) einVar.e).e.getValue();
                d6l x = p6g.x((e6l) ((f7l) obj5).c.getValue());
                if (x != null && (n7qVar = x.a) != null && (b = n7qVar.b()) != null) {
                    mqsVar = b.a();
                }
                zhn zhnVar = (mqsVar == null || !ljaVar.a.contains(mqsVar.a)) ? zhn.TRACK_PLAYED : zhn.CACHED_TRACK_PLAYED;
                int i37 = einVar.a().a.getInt("user_score", 0);
                if (i37 < 100) {
                    SharedPreferences.Editor edit = einVar.a().edit();
                    edit.putInt("user_score", i37 + zhnVar.a);
                    edit.apply();
                }
                break;
            case 20:
                float floatValue4 = ((Number) obj4).floatValue();
                if (!((tqn) obj6).a) {
                    ((oc4) ((ltm) obj5)).c(new zln(floatValue4 <= 0.0f, floatValue4));
                }
                break;
            case 21:
                yxc yxcVar = (yxc) obj4;
                cmd cmdVar = cmd.a;
                if (yxcVar == null) {
                    AppMetrica.setUserProfileID(null);
                    vm7 vm7Var = y3i.d;
                    if (vm7Var == null) {
                        ssg.a(7, "MetricaInitializer", "Metrica is not initialized yet", null);
                    } else {
                        x97.y(cmdVar, dm6.a(), null, new seg(vm7Var, r12, r12, i20), 2);
                    }
                } else {
                    drt drtVar = yxcVar.a;
                    String str3 = drtVar.a;
                    AppMetrica.setUserProfileID(str3);
                    vm7 vm7Var2 = y3i.d;
                    if (vm7Var2 == null) {
                        ssg.a(7, "MetricaInitializer", "Metrica is not initialized yet", null);
                    } else {
                        x97.y(cmdVar, dm6.a(), null, new seg(vm7Var2, str3, r12, i20), 2);
                    }
                    bow.z("UserName", drtVar.a);
                    String str4 = (String) ((d4i) obj6).b.getValue();
                    str4.getClass();
                    kp6 kp6Var = bec.a().a;
                    ((vq6) kp6Var.o.a).d(new qf0(20, kp6Var, str4));
                    bow.z("hasSubscription", String.valueOf(yxcVar.h));
                    YMApplication yMApplication = (YMApplication) ((vtm) obj5).a;
                    a40[] a40VarArr = a40.a;
                    bow.z("signature", CollectionsKt.X(jo0.a(yMApplication), null, null, null, null, 63));
                }
                break;
            case 22:
                tre treVar = (tre) obj4;
                ii0 ii0Var = (ii0) obj6;
                if (treVar instanceof rqm) {
                    rqm rqmVar = (rqm) treVar;
                    ydo ydoVar = ii0Var.h;
                    if (ydoVar == null) {
                        ydoVar = wxf.h(ii0Var.g);
                        ii0Var.h = ydoVar;
                    }
                    beo a2 = ydoVar.a(ii0Var);
                    a2.b(rqmVar, ii0Var.c, ii0Var.k, ii0Var.l, ((d85) ii0Var.e.getValue()).a, ((udo) ii0Var.f.getValue()).d, ii0Var.m);
                    ii0Var.i.setValue(a2);
                } else if (treVar instanceof sqm) {
                    beo beoVar = (beo) ii0Var.i.getValue();
                    if (beoVar != null) {
                        beoVar.d();
                    }
                } else if (treVar instanceof qqm) {
                    beo beoVar2 = (beo) ii0Var.i.getValue();
                    if (beoVar2 != null) {
                        beoVar2.d();
                    }
                } else {
                    ii0Var.b.q(treVar, (mm6) obj5);
                }
                break;
            case 23:
                tre treVar2 = (tre) obj4;
                ji0 ji0Var = (ji0) obj6;
                if (!(treVar2 instanceof tqm)) {
                    mm6 mm6Var = (mm6) obj5;
                    yk3 yk3Var = ji0Var.t;
                    if (yk3Var == null) {
                        yk3Var = new yk3(ji0Var.s, ji0Var.p);
                        vq1.Z(ji0Var);
                        ji0Var.t = yk3Var;
                    }
                    yk3Var.q(treVar2, mm6Var);
                } else if (ji0Var.w) {
                    ji0Var.S0((tqm) treVar2);
                } else {
                    ji0Var.x.a(treVar2);
                }
                break;
            case 24:
                if (((tre) obj4) instanceof sqm) {
                    Function0 function0 = (Function0) obj6;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    yoc.b((yoc) obj5);
                }
                break;
            case 25:
                if (continuation instanceof o6p) {
                    o6pVar = (o6p) continuation;
                    int i38 = o6pVar.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        o6pVar.k = i38 - Integer.MIN_VALUE;
                        Object obj21 = o6pVar.j;
                        nm6 nm6Var15 = nm6.a;
                        i15 = o6pVar.k;
                        if (i15 != 0) {
                            qgg.h0(obj21);
                            rjc rjcVar15 = (rjc) obj6;
                            if (((x66) obj4).a && ((z66) ((p6p) obj5).k.getValue()).f()) {
                                z = true;
                            }
                            Boolean valueOf3 = Boolean.valueOf(z);
                            o6pVar.k = 1;
                            if (rjcVar15.emit(valueOf3, o6pVar) == nm6Var15) {
                                break;
                            }
                        } else if (i15 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj21);
                        }
                        break;
                    }
                }
                o6pVar = new o6p(this, continuation);
                Object obj212 = o6pVar.j;
                nm6 nm6Var152 = nm6.a;
                i15 = o6pVar.k;
                if (i15 != 0) {
                }
                break;
            case 26:
                if (continuation instanceof vgp) {
                    vgpVar = (vgp) continuation;
                    int i39 = vgpVar.k;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        vgpVar.k = i39 - Integer.MIN_VALUE;
                        Object obj22 = vgpVar.j;
                        nm6 nm6Var16 = nm6.a;
                        i16 = vgpVar.k;
                        if (i16 == 0) {
                            if (i16 != 1) {
                                if (i16 == 2) {
                                    qgg.h0(obj22);
                                    break;
                                } else {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                rjcVar6 = vgpVar.l;
                                qgg.h0(obj22);
                            }
                        } else {
                            qgg.h0(obj22);
                            rjc rjcVar16 = (rjc) obj6;
                            vgpVar.l = rjcVar16;
                            vgpVar.k = 1;
                            Object a3 = ((tgp) obj5).a((g1k) obj4, vgpVar);
                            if (a3 != nm6Var16) {
                                obj22 = a3;
                                rjcVar6 = rjcVar16;
                            }
                            break;
                        }
                        vgpVar.l = null;
                        vgpVar.k = 2;
                        break;
                    }
                }
                vgpVar = new vgp(this, continuation);
                Object obj222 = vgpVar.j;
                nm6 nm6Var162 = nm6.a;
                i16 = vgpVar.k;
                if (i16 == 0) {
                }
                vgpVar.l = null;
                vgpVar.k = 2;
            case 27:
                Object collect = ((pjc) ((bml) obj6).invoke(obj4)).collect(new o0o((rjc) obj5, 9), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                if (continuation instanceof bjp) {
                    bjpVar = (bjp) continuation;
                    int i40 = bjpVar.k;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        bjpVar.k = i40 - Integer.MIN_VALUE;
                        Object obj23 = bjpVar.j;
                        nm6 nm6Var17 = nm6.a;
                        i17 = bjpVar.k;
                        if (i17 == 0) {
                            if (i17 != 1) {
                                if (i17 == 2) {
                                    qgg.h0(obj23);
                                    break;
                                } else {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                }
                            } else {
                                rjcVar7 = bjpVar.l;
                                qgg.h0(obj23);
                            }
                        } else {
                            qgg.h0(obj23);
                            rjc rjcVar17 = (rjc) obj6;
                            bjpVar.l = rjcVar17;
                            bjpVar.k = 1;
                            Object invoke = ((ezc) obj5).invoke(obj4, bjpVar);
                            if (invoke != nm6Var17) {
                                obj23 = invoke;
                                rjcVar7 = rjcVar17;
                            }
                            break;
                        }
                        bjpVar.l = null;
                        bjpVar.k = 2;
                        break;
                    }
                }
                bjpVar = new bjp(this, continuation);
                Object obj232 = bjpVar.j;
                nm6 nm6Var172 = nm6.a;
                i17 = bjpVar.k;
                if (i17 == 0) {
                }
                bjpVar.l = null;
                bjpVar.k = 2;
            default:
                if (continuation instanceof bqp) {
                    bqpVar = (bqp) continuation;
                    int i41 = bqpVar.k;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        bqpVar.k = i41 - Integer.MIN_VALUE;
                        Object obj24 = bqpVar.j;
                        nm6 nm6Var18 = nm6.a;
                        i18 = bqpVar.k;
                        if (i18 != 0) {
                            qgg.h0(obj24);
                            rjc rjcVar18 = (rjc) obj6;
                            List<fgd> list3 = (List) obj4;
                            ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                            for (fgd fgdVar : list3) {
                                akd akdVar = (akd) ((cqp) obj5).b.getValue();
                                String str5 = fgdVar.b;
                                akdVar.getClass();
                                str5.getClass();
                                arrayList.add(new xft(fgdVar.b, fgdVar.c, akdVar.c.b().getBoolean(str5, true)));
                            }
                            bqpVar.k = 1;
                            if (rjcVar18.emit(arrayList, bqpVar) == nm6Var18) {
                                break;
                            }
                        } else if (i18 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj24);
                        }
                        break;
                    }
                }
                bqpVar = new bqp(this, continuation);
                Object obj242 = bqpVar.j;
                nm6 nm6Var182 = nm6.a;
                i18 = bqpVar.k;
                if (i18 != 0) {
                }
        }
        return Unit.a;
    }

    public tek(hn5 hn5Var, zh zhVar, zi3 zi3Var) {
        this.a = 1;
        this.b = zhVar;
        this.c = zi3Var;
    }

    public /* synthetic */ tek(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public tek(n0m n0mVar, xqn xqnVar) {
        this.a = 6;
        this.c = n0mVar;
        this.b = xqnVar;
    }
}
