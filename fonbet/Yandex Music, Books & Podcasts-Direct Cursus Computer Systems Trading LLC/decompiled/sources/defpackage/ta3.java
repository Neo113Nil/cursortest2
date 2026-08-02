package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ta3 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ mqs c;

    public /* synthetic */ ta3(rjc rjcVar, mqs mqsVar, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = mqsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0179, code lost:
    
        if (r9.i() == null) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0141  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        sa3 sa3Var;
        int i;
        of5 of5Var;
        int i2;
        n7q n7qVar;
        qf5 qf5Var;
        int i3;
        n7q n7qVar2;
        uf5 uf5Var;
        int i4;
        wf5 wf5Var;
        int i5;
        n7q n7qVar3;
        yf5 yf5Var;
        int i6;
        p1l p1lVar;
        int i7;
        kfl kflVar;
        int i8;
        ars arsVar;
        int i9;
        switch (this.a) {
            case 0:
                if (continuation instanceof sa3) {
                    sa3Var = (sa3) continuation;
                    int i10 = sa3Var.k;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        sa3Var.k = i10 - Integer.MIN_VALUE;
                        Object obj2 = sa3Var.j;
                        nm6 nm6Var = nm6.a;
                        i = sa3Var.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            ((Boolean) obj).getClass();
                            sa3Var.k = 1;
                            if (this.b.emit(this.c, sa3Var) == nm6Var) {
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                        }
                        break;
                    }
                }
                sa3Var = new sa3(this, continuation);
                Object obj22 = sa3Var.j;
                nm6 nm6Var2 = nm6.a;
                i = sa3Var.k;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof of5) {
                    of5Var = (of5) continuation;
                    int i11 = of5Var.k;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        of5Var.k = i11 - Integer.MIN_VALUE;
                        Object obj3 = of5Var.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = of5Var.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            d6l x = p6g.x((e6l) obj);
                            mwk b = (x == null || (n7qVar = x.a) == null) ? null : n7qVar.b();
                            Boolean valueOf = Boolean.valueOf(uwf.u(this.c, b != null ? b.a() : null));
                            of5Var.k = 1;
                            if (this.b.emit(valueOf, of5Var) == nm6Var3) {
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                        }
                        break;
                    }
                }
                of5Var = new of5(this, continuation);
                Object obj32 = of5Var.j;
                nm6 nm6Var32 = nm6.a;
                i2 = of5Var.k;
                if (i2 != 0) {
                }
                break;
            case 2:
                if (continuation instanceof qf5) {
                    qf5Var = (qf5) continuation;
                    int i12 = qf5Var.k;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        qf5Var.k = i12 - Integer.MIN_VALUE;
                        Object obj4 = qf5Var.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = qf5Var.k;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            d6l x2 = p6g.x((e6l) obj);
                            mwk b2 = (x2 == null || (n7qVar2 = x2.a) == null) ? null : n7qVar2.b();
                            Boolean valueOf2 = Boolean.valueOf(uwf.u(this.c, b2 != null ? b2.a() : null));
                            qf5Var.k = 1;
                            if (this.b.emit(valueOf2, qf5Var) == nm6Var4) {
                            }
                        } else if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                        }
                        break;
                    }
                }
                qf5Var = new qf5(this, continuation);
                Object obj42 = qf5Var.j;
                nm6 nm6Var42 = nm6.a;
                i3 = qf5Var.k;
                if (i3 != 0) {
                }
                break;
            case 3:
                if (continuation instanceof uf5) {
                    uf5Var = (uf5) continuation;
                    int i13 = uf5Var.k;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        uf5Var.k = i13 - Integer.MIN_VALUE;
                        Object obj5 = uf5Var.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = uf5Var.k;
                        if (i4 != 0) {
                            qgg.h0(obj5);
                            Boolean valueOf3 = Boolean.valueOf(((lja) obj).a.contains(this.c.a));
                            uf5Var.k = 1;
                            if (this.b.emit(valueOf3, uf5Var) == nm6Var5) {
                            }
                        } else if (i4 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj5);
                        }
                        break;
                    }
                }
                uf5Var = new uf5(this, continuation);
                Object obj52 = uf5Var.j;
                nm6 nm6Var52 = nm6.a;
                i4 = uf5Var.k;
                if (i4 != 0) {
                }
                break;
            case 4:
                if (continuation instanceof wf5) {
                    wf5Var = (wf5) continuation;
                    int i14 = wf5Var.k;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        wf5Var.k = i14 - Integer.MIN_VALUE;
                        Object obj6 = wf5Var.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = wf5Var.k;
                        if (i5 != 0) {
                            qgg.h0(obj6);
                            e6l e6lVar = (e6l) obj;
                            d6l x3 = p6g.x(e6lVar);
                            mwk b3 = (x3 == null || (n7qVar3 = x3.a) == null) ? null : n7qVar3.b();
                            lzs lzsVar = uwf.u(this.c, b3 != null ? b3.a() : null) ? p6g.C(e6lVar) ? lzs.b : lzs.c : lzs.a;
                            wf5Var.k = 1;
                            if (this.b.emit(lzsVar, wf5Var) == nm6Var6) {
                            }
                        } else if (i5 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj6);
                        }
                        break;
                    }
                }
                wf5Var = new wf5(this, continuation);
                Object obj62 = wf5Var.j;
                nm6 nm6Var62 = nm6.a;
                i5 = wf5Var.k;
                if (i5 != 0) {
                }
                break;
            case 5:
                if (continuation instanceof yf5) {
                    yf5Var = (yf5) continuation;
                    int i15 = yf5Var.k;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        yf5Var.k = i15 - Integer.MIN_VALUE;
                        Object obj7 = yf5Var.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = yf5Var.k;
                        if (i6 != 0) {
                            qgg.h0(obj7);
                            mqs mqsVar = this.c;
                            mqsVar.getClass();
                            boolean z = false;
                            boolean z2 = mqsVar.k == dg2.b;
                            int ordinal = ((ezb) l18.b.b(hag.I(ezb.class), true).getValue()).a().ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    b6e.s();
                                    break;
                                } else {
                                    break;
                                }
                            }
                            z = true;
                            jf5 jf5Var = new jf5(z2, z);
                            yf5Var.k = 1;
                            if (this.b.emit(jf5Var, yf5Var) == nm6Var7) {
                            }
                        } else if (i6 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj7);
                            break;
                        }
                    }
                }
                yf5Var = new yf5(this, continuation);
                Object obj72 = yf5Var.j;
                nm6 nm6Var72 = nm6.a;
                i6 = yf5Var.k;
                if (i6 != 0) {
                }
                break;
            case 6:
                if (continuation instanceof p1l) {
                    p1lVar = (p1l) continuation;
                    int i16 = p1lVar.k;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        p1lVar.k = i16 - Integer.MIN_VALUE;
                        Object obj8 = p1lVar.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = p1lVar.k;
                        if (i7 != 0) {
                            qgg.h0(obj8);
                            if (((List) obj).contains(this.c.a)) {
                                p1lVar.k = 1;
                                if (this.b.emit(obj, p1lVar) == nm6Var8) {
                                }
                            }
                        } else if (i7 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj8);
                        }
                        break;
                    }
                }
                p1lVar = new p1l(this, continuation);
                Object obj82 = p1lVar.j;
                nm6 nm6Var82 = nm6.a;
                i7 = p1lVar.k;
                if (i7 != 0) {
                }
                break;
            case 7:
                if (continuation instanceof kfl) {
                    kflVar = (kfl) continuation;
                    int i17 = kflVar.k;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        kflVar.k = i17 - Integer.MIN_VALUE;
                        Object obj9 = kflVar.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = kflVar.k;
                        if (i8 != 0) {
                            qgg.h0(obj9);
                            nel nelVar = (nel) obj;
                            boolean d = Intrinsics.d(nelVar, lel.a);
                            Object obj10 = ifl.a;
                            if (!d) {
                                if (!(nelVar instanceof mel)) {
                                    b6e.s();
                                    break;
                                } else {
                                    wdl wdlVar = ((mel) nelVar).a;
                                    rr5 rr5Var = wdlVar.a().a;
                                    mqs mqsVar2 = this.c;
                                    if (Intrinsics.d(rr5Var, mqsVar2.d())) {
                                        obj10 = new hfl(mqsVar2, wdlVar);
                                    }
                                }
                            }
                            kflVar.k = 1;
                            if (this.b.emit(obj10, kflVar) == nm6Var9) {
                            }
                        } else if (i8 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj9);
                            break;
                        }
                    }
                }
                kflVar = new kfl(this, continuation);
                Object obj92 = kflVar.j;
                nm6 nm6Var92 = nm6.a;
                i8 = kflVar.k;
                if (i8 != 0) {
                }
                break;
            default:
                if (continuation instanceof ars) {
                    arsVar = (ars) continuation;
                    int i18 = arsVar.k;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        arsVar.k = i18 - Integer.MIN_VALUE;
                        Object obj11 = arsVar.j;
                        nm6 nm6Var10 = nm6.a;
                        i9 = arsVar.k;
                        if (i9 != 0) {
                            qgg.h0(obj11);
                            Object obj12 = ((lja) obj).a.contains(this.c.a) ? r1t.a : q1t.a;
                            arsVar.k = 1;
                            if (this.b.emit(obj12, arsVar) == nm6Var10) {
                            }
                        } else if (i9 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj11);
                        }
                        break;
                    }
                }
                arsVar = new ars(this, continuation);
                Object obj112 = arsVar.j;
                nm6 nm6Var102 = nm6.a;
                i9 = arsVar.k;
                if (i9 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
