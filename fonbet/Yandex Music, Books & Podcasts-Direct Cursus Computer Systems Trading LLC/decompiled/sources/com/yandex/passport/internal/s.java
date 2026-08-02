package com.yandex.passport.internal;

import android.app.Activity;
import com.yandex.passport.api.i2;
import com.yandex.passport.internal.ui.bouncer.model.c0;
import com.yandex.passport.internal.ui.bouncer.model.f0;
import com.yandex.passport.internal.ui.bouncer.model.g0;
import com.yandex.passport.internal.ui.bouncer.model.j0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.a1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.d0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.d1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.h1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.i0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.k1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.m0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.o0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.o1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.s0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.u0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.u1;
import com.yandex.passport.internal.ui.bouncer.model.middleware.w0;
import com.yandex.passport.internal.ui.bouncer.model.middleware.y0;
import com.yandex.passport.internal.ui.bouncer.model.t1;
import com.yandex.passport.internal.ui.challenge.delete.z0;
import com.yandex.plus.core.activity.result.internal.PlusProxyActivity;
import defpackage.b6e;
import defpackage.fbr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.x0q;
import defpackage.xq0;
import defpackage.y0q;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;

    public /* synthetic */ s(rjc rjcVar, int i) {
        this.a = i;
        this.b = rjcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0157  */
    /* JADX WARN: Type inference failed for: r9v88 */
    /* JADX WARN: Type inference failed for: r9v89 */
    /* JADX WARN: Type inference failed for: r9v90, types: [java.lang.Object] */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        r rVar;
        int i;
        com.yandex.passport.internal.impl.w wVar;
        int i2;
        i2 i2Var;
        com.yandex.passport.internal.ui.bouncer.model.middleware.e eVar;
        int i3;
        com.yandex.passport.internal.ui.bouncer.model.middleware.f fVar;
        int i4;
        com.yandex.passport.internal.ui.bouncer.model.middleware.i iVar;
        int i5;
        com.yandex.passport.internal.ui.bouncer.model.middleware.m mVar;
        int i6;
        com.yandex.passport.internal.ui.bouncer.model.middleware.n nVar;
        int i7;
        com.yandex.passport.internal.ui.bouncer.model.middleware.q qVar;
        int i8;
        com.yandex.passport.internal.ui.bouncer.model.middleware.t tVar;
        int i9;
        com.yandex.passport.internal.ui.bouncer.model.middleware.v vVar;
        int i10;
        com.yandex.passport.internal.ui.bouncer.model.middleware.z zVar;
        int i11;
        d0 d0Var;
        int i12;
        i0 i0Var;
        int i13;
        m0 m0Var;
        int i14;
        o0 o0Var;
        int i15;
        s0 s0Var;
        int i16;
        u0 u0Var;
        int i17;
        w0 w0Var;
        int i18;
        y0 y0Var;
        int i19;
        a1 a1Var;
        int i20;
        d1 d1Var;
        int i21;
        h1 h1Var;
        int i22;
        k1 k1Var;
        int i23;
        o1 o1Var;
        int i24;
        u1 u1Var;
        int i25;
        com.yandex.passport.internal.ui.challenge.c cVar;
        int i26;
        com.yandex.passport.internal.ui.challenge.delete.m0 m0Var2;
        int i27;
        com.yandex.plus.core.activity.result.internal.f fVar2;
        int i28;
        com.yandex.plus.core.activity.result.internal.g gVar;
        int i29;
        PlusProxyActivity plusProxyActivity;
        com.yandex.plus.core.data.pay.e eVar2;
        int i30;
        switch (this.a) {
            case 0:
                if (continuation instanceof r) {
                    rVar = (r) continuation;
                    int i31 = rVar.k;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        rVar.k = i31 - Integer.MIN_VALUE;
                        Object obj2 = rVar.j;
                        nm6 nm6Var = nm6.a;
                        i = rVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            Boolean valueOf = Boolean.valueOf(((Activity) obj) == null);
                            rVar.k = 1;
                            if (this.b.emit(valueOf, rVar) == nm6Var) {
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
                rVar = new r(this, continuation);
                Object obj22 = rVar.j;
                nm6 nm6Var2 = nm6.a;
                i = rVar.k;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof com.yandex.passport.internal.impl.w) {
                    wVar = (com.yandex.passport.internal.impl.w) continuation;
                    int i32 = wVar.k;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        wVar.k = i32 - Integer.MIN_VALUE;
                        Object obj3 = wVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = wVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            com.yandex.passport.internal.entities.a0 a0Var = (com.yandex.passport.internal.entities.a0) obj;
                            if (!(a0Var instanceof com.yandex.passport.internal.entities.y)) {
                                if (!Intrinsics.d(a0Var, com.yandex.passport.internal.entities.x.a)) {
                                    if (!Intrinsics.d(a0Var, com.yandex.passport.internal.entities.z.a)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        i2Var = null;
                                    }
                                } else {
                                    i2Var = i2.a;
                                }
                            } else {
                                i2Var = i2.b;
                            }
                            if (i2Var != null) {
                                wVar.k = 1;
                                if (this.b.emit(i2Var, wVar) == nm6Var3) {
                                }
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                            break;
                        }
                    }
                }
                wVar = new com.yandex.passport.internal.impl.w(this, continuation);
                Object obj32 = wVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = wVar.k;
                if (i2 != 0) {
                }
                break;
            case 2:
                if (continuation instanceof com.yandex.passport.internal.ui.bouncer.model.middleware.e) {
                    eVar = (com.yandex.passport.internal.ui.bouncer.model.middleware.e) continuation;
                    int i33 = eVar.k;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        eVar.k = i33 - Integer.MIN_VALUE;
                        Object obj4 = eVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = eVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.e) {
                                eVar.k = 1;
                                if (this.b.emit(obj, eVar) == nm6Var4) {
                                }
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
                eVar = new com.yandex.passport.internal.ui.bouncer.model.middleware.e(this, continuation);
                Object obj42 = eVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = eVar.k;
                if (i3 != 0) {
                }
                break;
            case 3:
                if (continuation instanceof com.yandex.passport.internal.ui.bouncer.model.middleware.f) {
                    fVar = (com.yandex.passport.internal.ui.bouncer.model.middleware.f) continuation;
                    int i34 = fVar.k;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        fVar.k = i34 - Integer.MIN_VALUE;
                        Object obj5 = fVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = fVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj5);
                            com.yandex.passport.internal.ui.bouncer.model.e eVar3 = (com.yandex.passport.internal.ui.bouncer.model.e) obj;
                            eVar3.getClass();
                            com.yandex.passport.internal.ui.bouncer.model.x xVar = new com.yandex.passport.internal.ui.bouncer.model.x(eVar3.a);
                            fVar.k = 1;
                            if (this.b.emit(xVar, fVar) == nm6Var5) {
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
                fVar = new com.yandex.passport.internal.ui.bouncer.model.middleware.f(this, continuation);
                Object obj52 = fVar.j;
                nm6 nm6Var52 = nm6.a;
                i4 = fVar.k;
                if (i4 != 0) {
                }
                break;
            case 4:
                if (continuation instanceof com.yandex.passport.internal.ui.bouncer.model.middleware.i) {
                    iVar = (com.yandex.passport.internal.ui.bouncer.model.middleware.i) continuation;
                    int i35 = iVar.k;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        iVar.k = i35 - Integer.MIN_VALUE;
                        Object obj6 = iVar.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = iVar.k;
                        if (i5 != 0) {
                            qgg.h0(obj6);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.f) {
                                iVar.k = 1;
                                if (this.b.emit(obj, iVar) == nm6Var6) {
                                }
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
                iVar = new com.yandex.passport.internal.ui.bouncer.model.middleware.i(this, continuation);
                Object obj62 = iVar.j;
                nm6 nm6Var62 = nm6.a;
                i5 = iVar.k;
                if (i5 != 0) {
                }
                break;
            case 5:
                if (continuation instanceof com.yandex.passport.internal.ui.bouncer.model.middleware.m) {
                    mVar = (com.yandex.passport.internal.ui.bouncer.model.middleware.m) continuation;
                    int i36 = mVar.k;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        mVar.k = i36 - Integer.MIN_VALUE;
                        Object obj7 = mVar.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = mVar.k;
                        if (i6 != 0) {
                            qgg.h0(obj7);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.g) {
                                mVar.k = 1;
                                if (this.b.emit(obj, mVar) == nm6Var7) {
                                }
                            }
                        } else if (i6 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj7);
                        }
                        break;
                    }
                }
                mVar = new com.yandex.passport.internal.ui.bouncer.model.middleware.m(this, continuation);
                Object obj72 = mVar.j;
                nm6 nm6Var72 = nm6.a;
                i6 = mVar.k;
                if (i6 != 0) {
                }
                break;
            case 6:
                if (continuation instanceof com.yandex.passport.internal.ui.bouncer.model.middleware.n) {
                    nVar = (com.yandex.passport.internal.ui.bouncer.model.middleware.n) continuation;
                    int i37 = nVar.k;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        nVar.k = i37 - Integer.MIN_VALUE;
                        Object obj8 = nVar.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = nVar.k;
                        if (i7 != 0) {
                            qgg.h0(obj8);
                            x0q b = y0q.b(1, 0, null, 6);
                            new Timer().schedule(new fbr(2, b), 5000L);
                            j0 j0Var = new j0(new t1(((com.yandex.passport.internal.ui.bouncer.model.g) obj).a, new com.yandex.passport.internal.ui.bouncer.model.middleware.o(b)));
                            nVar.k = 1;
                            if (this.b.emit(j0Var, nVar) == nm6Var8) {
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
                nVar = new com.yandex.passport.internal.ui.bouncer.model.middleware.n(this, continuation);
                Object obj82 = nVar.j;
                nm6 nm6Var82 = nm6.a;
                i7 = nVar.k;
                if (i7 != 0) {
                }
                break;
            case 7:
                if (continuation instanceof com.yandex.passport.internal.ui.bouncer.model.middleware.q) {
                    qVar = (com.yandex.passport.internal.ui.bouncer.model.middleware.q) continuation;
                    int i38 = qVar.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        qVar.k = i38 - Integer.MIN_VALUE;
                        Object obj9 = qVar.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = qVar.k;
                        if (i8 != 0) {
                            qgg.h0(obj9);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.k) {
                                qVar.k = 1;
                                if (this.b.emit(obj, qVar) == nm6Var9) {
                                }
                            }
                        } else if (i8 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj9);
                        }
                        break;
                    }
                }
                qVar = new com.yandex.passport.internal.ui.bouncer.model.middleware.q(this, continuation);
                Object obj92 = qVar.j;
                nm6 nm6Var92 = nm6.a;
                i8 = qVar.k;
                if (i8 != 0) {
                }
                break;
            case 8:
                if (continuation instanceof com.yandex.passport.internal.ui.bouncer.model.middleware.t) {
                    tVar = (com.yandex.passport.internal.ui.bouncer.model.middleware.t) continuation;
                    int i39 = tVar.k;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        tVar.k = i39 - Integer.MIN_VALUE;
                        Object obj10 = tVar.j;
                        nm6 nm6Var10 = nm6.a;
                        i9 = tVar.k;
                        if (i9 != 0) {
                            qgg.h0(obj10);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.m) {
                                tVar.k = 1;
                                if (this.b.emit(obj, tVar) == nm6Var10) {
                                }
                            }
                        } else if (i9 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj10);
                        }
                        break;
                    }
                }
                tVar = new com.yandex.passport.internal.ui.bouncer.model.middleware.t(this, continuation);
                Object obj102 = tVar.j;
                nm6 nm6Var102 = nm6.a;
                i9 = tVar.k;
                if (i9 != 0) {
                }
                break;
            case 9:
                if (continuation instanceof com.yandex.passport.internal.ui.bouncer.model.middleware.v) {
                    vVar = (com.yandex.passport.internal.ui.bouncer.model.middleware.v) continuation;
                    int i40 = vVar.k;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        vVar.k = i40 - Integer.MIN_VALUE;
                        Object obj11 = vVar.j;
                        nm6 nm6Var11 = nm6.a;
                        i10 = vVar.k;
                        if (i10 != 0) {
                            qgg.h0(obj11);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.n) {
                                vVar.k = 1;
                                if (this.b.emit(obj, vVar) == nm6Var11) {
                                }
                            }
                        } else if (i10 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj11);
                        }
                        break;
                    }
                }
                vVar = new com.yandex.passport.internal.ui.bouncer.model.middleware.v(this, continuation);
                Object obj112 = vVar.j;
                nm6 nm6Var112 = nm6.a;
                i10 = vVar.k;
                if (i10 != 0) {
                }
                break;
            case 10:
                if (continuation instanceof com.yandex.passport.internal.ui.bouncer.model.middleware.z) {
                    zVar = (com.yandex.passport.internal.ui.bouncer.model.middleware.z) continuation;
                    int i41 = zVar.k;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        zVar.k = i41 - Integer.MIN_VALUE;
                        Object obj12 = zVar.j;
                        nm6 nm6Var12 = nm6.a;
                        i11 = zVar.k;
                        if (i11 != 0) {
                            qgg.h0(obj12);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.q) {
                                zVar.k = 1;
                                if (this.b.emit(obj, zVar) == nm6Var12) {
                                }
                            }
                        } else if (i11 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj12);
                        }
                        break;
                    }
                }
                zVar = new com.yandex.passport.internal.ui.bouncer.model.middleware.z(this, continuation);
                Object obj122 = zVar.j;
                nm6 nm6Var122 = nm6.a;
                i11 = zVar.k;
                if (i11 != 0) {
                }
                break;
            case 11:
                if (continuation instanceof d0) {
                    d0Var = (d0) continuation;
                    int i42 = d0Var.k;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        d0Var.k = i42 - Integer.MIN_VALUE;
                        Object obj13 = d0Var.j;
                        nm6 nm6Var13 = nm6.a;
                        i12 = d0Var.k;
                        if (i12 != 0) {
                            qgg.h0(obj13);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.j) {
                                d0Var.k = 1;
                                if (this.b.emit(obj, d0Var) == nm6Var13) {
                                }
                            }
                        } else if (i12 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj13);
                        }
                        break;
                    }
                }
                d0Var = new d0(this, continuation);
                Object obj132 = d0Var.j;
                nm6 nm6Var132 = nm6.a;
                i12 = d0Var.k;
                if (i12 != 0) {
                }
                break;
            case 12:
                if (continuation instanceof i0) {
                    i0Var = (i0) continuation;
                    int i43 = i0Var.k;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        i0Var.k = i43 - Integer.MIN_VALUE;
                        Object obj14 = i0Var.j;
                        nm6 nm6Var14 = nm6.a;
                        i13 = i0Var.k;
                        if (i13 != 0) {
                            qgg.h0(obj14);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.r) {
                                i0Var.k = 1;
                                if (this.b.emit(obj, i0Var) == nm6Var14) {
                                }
                            }
                        } else if (i13 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj14);
                        }
                        break;
                    }
                }
                i0Var = new i0(this, continuation);
                Object obj142 = i0Var.j;
                nm6 nm6Var142 = nm6.a;
                i13 = i0Var.k;
                if (i13 != 0) {
                }
                break;
            case 13:
                if (continuation instanceof m0) {
                    m0Var = (m0) continuation;
                    int i44 = m0Var.k;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        m0Var.k = i44 - Integer.MIN_VALUE;
                        Object obj15 = m0Var.j;
                        nm6 nm6Var15 = nm6.a;
                        i14 = m0Var.k;
                        if (i14 != 0) {
                            qgg.h0(obj15);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.t) {
                                m0Var.k = 1;
                                if (this.b.emit(obj, m0Var) == nm6Var15) {
                                }
                            }
                        } else if (i14 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj15);
                        }
                        break;
                    }
                }
                m0Var = new m0(this, continuation);
                Object obj152 = m0Var.j;
                nm6 nm6Var152 = nm6.a;
                i14 = m0Var.k;
                if (i14 != 0) {
                }
                break;
            case 14:
                if (continuation instanceof o0) {
                    o0Var = (o0) continuation;
                    int i45 = o0Var.k;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        o0Var.k = i45 - Integer.MIN_VALUE;
                        Object obj16 = o0Var.j;
                        nm6 nm6Var16 = nm6.a;
                        i15 = o0Var.k;
                        if (i15 != 0) {
                            qgg.h0(obj16);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.u) {
                                o0Var.k = 1;
                                if (this.b.emit(obj, o0Var) == nm6Var16) {
                                }
                            }
                        } else if (i15 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj16);
                        }
                        break;
                    }
                }
                o0Var = new o0(this, continuation);
                Object obj162 = o0Var.j;
                nm6 nm6Var162 = nm6.a;
                i15 = o0Var.k;
                if (i15 != 0) {
                }
                break;
            case 15:
                if (continuation instanceof s0) {
                    s0Var = (s0) continuation;
                    int i46 = s0Var.k;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        s0Var.k = i46 - Integer.MIN_VALUE;
                        Object obj17 = s0Var.j;
                        nm6 nm6Var17 = nm6.a;
                        i16 = s0Var.k;
                        if (i16 != 0) {
                            qgg.h0(obj17);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.v) {
                                s0Var.k = 1;
                                if (this.b.emit(obj, s0Var) == nm6Var17) {
                                }
                            }
                        } else if (i16 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj17);
                        }
                        break;
                    }
                }
                s0Var = new s0(this, continuation);
                Object obj172 = s0Var.j;
                nm6 nm6Var172 = nm6.a;
                i16 = s0Var.k;
                if (i16 != 0) {
                }
                break;
            case 16:
                if (continuation instanceof u0) {
                    u0Var = (u0) continuation;
                    int i47 = u0Var.k;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        u0Var.k = i47 - Integer.MIN_VALUE;
                        Object obj18 = u0Var.j;
                        nm6 nm6Var18 = nm6.a;
                        i17 = u0Var.k;
                        if (i17 != 0) {
                            qgg.h0(obj18);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.w) {
                                u0Var.k = 1;
                                if (this.b.emit(obj, u0Var) == nm6Var18) {
                                }
                            }
                        } else if (i17 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj18);
                        }
                        break;
                    }
                }
                u0Var = new u0(this, continuation);
                Object obj182 = u0Var.j;
                nm6 nm6Var182 = nm6.a;
                i17 = u0Var.k;
                if (i17 != 0) {
                }
                break;
            case 17:
                if (continuation instanceof w0) {
                    w0Var = (w0) continuation;
                    int i48 = w0Var.k;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        w0Var.k = i48 - Integer.MIN_VALUE;
                        Object obj19 = w0Var.j;
                        nm6 nm6Var19 = nm6.a;
                        i18 = w0Var.k;
                        if (i18 != 0) {
                            qgg.h0(obj19);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.x) {
                                w0Var.k = 1;
                                if (this.b.emit(obj, w0Var) == nm6Var19) {
                                }
                            }
                        } else if (i18 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj19);
                        }
                        break;
                    }
                }
                w0Var = new w0(this, continuation);
                Object obj192 = w0Var.j;
                nm6 nm6Var192 = nm6.a;
                i18 = w0Var.k;
                if (i18 != 0) {
                }
                break;
            case 18:
                if (continuation instanceof y0) {
                    y0Var = (y0) continuation;
                    int i49 = y0Var.k;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        y0Var.k = i49 - Integer.MIN_VALUE;
                        Object obj20 = y0Var.j;
                        nm6 nm6Var20 = nm6.a;
                        i19 = y0Var.k;
                        if (i19 != 0) {
                            qgg.h0(obj20);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.y) {
                                y0Var.k = 1;
                                if (this.b.emit(obj, y0Var) == nm6Var20) {
                                }
                            }
                        } else if (i19 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj20);
                        }
                        break;
                    }
                }
                y0Var = new y0(this, continuation);
                Object obj202 = y0Var.j;
                nm6 nm6Var202 = nm6.a;
                i19 = y0Var.k;
                if (i19 != 0) {
                }
                break;
            case 19:
                if (continuation instanceof a1) {
                    a1Var = (a1) continuation;
                    int i50 = a1Var.k;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        a1Var.k = i50 - Integer.MIN_VALUE;
                        Object obj21 = a1Var.j;
                        nm6 nm6Var21 = nm6.a;
                        i20 = a1Var.k;
                        if (i20 != 0) {
                            qgg.h0(obj21);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.d) {
                                a1Var.k = 1;
                                if (this.b.emit(obj, a1Var) == nm6Var21) {
                                }
                            }
                        } else if (i20 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj21);
                        }
                        break;
                    }
                }
                a1Var = new a1(this, continuation);
                Object obj212 = a1Var.j;
                nm6 nm6Var212 = nm6.a;
                i20 = a1Var.k;
                if (i20 != 0) {
                }
                break;
            case 20:
                if (continuation instanceof d1) {
                    d1Var = (d1) continuation;
                    int i51 = d1Var.k;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        d1Var.k = i51 - Integer.MIN_VALUE;
                        Object obj23 = d1Var.j;
                        nm6 nm6Var22 = nm6.a;
                        i21 = d1Var.k;
                        if (i21 != 0) {
                            qgg.h0(obj23);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.z) {
                                d1Var.k = 1;
                                if (this.b.emit(obj, d1Var) == nm6Var22) {
                                }
                            }
                        } else if (i21 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj23);
                        }
                        break;
                    }
                }
                d1Var = new d1(this, continuation);
                Object obj232 = d1Var.j;
                nm6 nm6Var222 = nm6.a;
                i21 = d1Var.k;
                if (i21 != 0) {
                }
                break;
            case 21:
                if (continuation instanceof h1) {
                    h1Var = (h1) continuation;
                    int i52 = h1Var.k;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        h1Var.k = i52 - Integer.MIN_VALUE;
                        Object obj24 = h1Var.j;
                        nm6 nm6Var23 = nm6.a;
                        i22 = h1Var.k;
                        if (i22 != 0) {
                            qgg.h0(obj24);
                            if (obj instanceof c0) {
                                h1Var.k = 1;
                                if (this.b.emit(obj, h1Var) == nm6Var23) {
                                }
                            }
                        } else if (i22 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj24);
                        }
                        break;
                    }
                }
                h1Var = new h1(this, continuation);
                Object obj242 = h1Var.j;
                nm6 nm6Var232 = nm6.a;
                i22 = h1Var.k;
                if (i22 != 0) {
                }
                break;
            case 22:
                if (continuation instanceof k1) {
                    k1Var = (k1) continuation;
                    int i53 = k1Var.k;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        k1Var.k = i53 - Integer.MIN_VALUE;
                        Object obj25 = k1Var.j;
                        nm6 nm6Var24 = nm6.a;
                        i23 = k1Var.k;
                        if (i23 != 0) {
                            qgg.h0(obj25);
                            if (obj instanceof f0) {
                                k1Var.k = 1;
                                if (this.b.emit(obj, k1Var) == nm6Var24) {
                                }
                            }
                        } else if (i23 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj25);
                        }
                        break;
                    }
                }
                k1Var = new k1(this, continuation);
                Object obj252 = k1Var.j;
                nm6 nm6Var242 = nm6.a;
                i23 = k1Var.k;
                if (i23 != 0) {
                }
                break;
            case 23:
                if (continuation instanceof o1) {
                    o1Var = (o1) continuation;
                    int i54 = o1Var.k;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        o1Var.k = i54 - Integer.MIN_VALUE;
                        Object obj26 = o1Var.j;
                        nm6 nm6Var25 = nm6.a;
                        i24 = o1Var.k;
                        if (i24 != 0) {
                            qgg.h0(obj26);
                            if (obj instanceof g0) {
                                o1Var.k = 1;
                                if (this.b.emit(obj, o1Var) == nm6Var25) {
                                }
                            }
                        } else if (i24 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj26);
                        }
                        break;
                    }
                }
                o1Var = new o1(this, continuation);
                Object obj262 = o1Var.j;
                nm6 nm6Var252 = nm6.a;
                i24 = o1Var.k;
                if (i24 != 0) {
                }
                break;
            case 24:
                if (continuation instanceof u1) {
                    u1Var = (u1) continuation;
                    int i55 = u1Var.k;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        u1Var.k = i55 - Integer.MIN_VALUE;
                        Object obj27 = u1Var.j;
                        nm6 nm6Var26 = nm6.a;
                        i25 = u1Var.k;
                        if (i25 != 0) {
                            qgg.h0(obj27);
                            if (obj instanceof com.yandex.passport.internal.ui.bouncer.model.i0) {
                                u1Var.k = 1;
                                if (this.b.emit(obj, u1Var) == nm6Var26) {
                                }
                            }
                        } else if (i25 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj27);
                        }
                        break;
                    }
                }
                u1Var = new u1(this, continuation);
                Object obj272 = u1Var.j;
                nm6 nm6Var262 = nm6.a;
                i25 = u1Var.k;
                if (i25 != 0) {
                }
                break;
            case 25:
                if (continuation instanceof com.yandex.passport.internal.ui.challenge.c) {
                    cVar = (com.yandex.passport.internal.ui.challenge.c) continuation;
                    int i56 = cVar.k;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        cVar.k = i56 - Integer.MIN_VALUE;
                        Object obj28 = cVar.j;
                        nm6 nm6Var27 = nm6.a;
                        i26 = cVar.k;
                        if (i26 != 0) {
                            qgg.h0(obj28);
                            if (obj instanceof com.yandex.passport.internal.ui.challenge.y) {
                                cVar.k = 1;
                                if (this.b.emit(obj, cVar) == nm6Var27) {
                                }
                            }
                        } else if (i26 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj28);
                        }
                        break;
                    }
                }
                cVar = new com.yandex.passport.internal.ui.challenge.c(this, continuation);
                Object obj282 = cVar.j;
                nm6 nm6Var272 = nm6.a;
                i26 = cVar.k;
                if (i26 != 0) {
                }
                break;
            case 26:
                if (continuation instanceof com.yandex.passport.internal.ui.challenge.delete.m0) {
                    m0Var2 = (com.yandex.passport.internal.ui.challenge.delete.m0) continuation;
                    int i57 = m0Var2.k;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        m0Var2.k = i57 - Integer.MIN_VALUE;
                        Object obj29 = m0Var2.j;
                        nm6 nm6Var28 = nm6.a;
                        i27 = m0Var2.k;
                        if (i27 != 0) {
                            qgg.h0(obj29);
                            if (obj instanceof z0) {
                                m0Var2.k = 1;
                                if (this.b.emit(obj, m0Var2) == nm6Var28) {
                                }
                            }
                        } else if (i27 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj29);
                        }
                        break;
                    }
                }
                m0Var2 = new com.yandex.passport.internal.ui.challenge.delete.m0(this, continuation);
                Object obj292 = m0Var2.j;
                nm6 nm6Var282 = nm6.a;
                i27 = m0Var2.k;
                if (i27 != 0) {
                }
                break;
            case 27:
                if (continuation instanceof com.yandex.plus.core.activity.result.internal.f) {
                    fVar2 = (com.yandex.plus.core.activity.result.internal.f) continuation;
                    int i58 = fVar2.k;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        fVar2.k = i58 - Integer.MIN_VALUE;
                        Object obj30 = fVar2.j;
                        nm6 nm6Var29 = nm6.a;
                        i28 = fVar2.k;
                        if (i28 != 0) {
                            qgg.h0(obj30);
                            Object firstOrNull = CollectionsKt.firstOrNull((List) obj);
                            if (firstOrNull != null) {
                                fVar2.k = 1;
                                if (this.b.emit(firstOrNull, fVar2) == nm6Var29) {
                                }
                            }
                        } else if (i28 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj30);
                        }
                        break;
                    }
                }
                fVar2 = new com.yandex.plus.core.activity.result.internal.f(this, continuation);
                Object obj302 = fVar2.j;
                nm6 nm6Var292 = nm6.a;
                i28 = fVar2.k;
                if (i28 != 0) {
                }
                break;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                if (continuation instanceof com.yandex.plus.core.activity.result.internal.g) {
                    gVar = (com.yandex.plus.core.activity.result.internal.g) continuation;
                    int i59 = gVar.k;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        gVar.k = i59 - Integer.MIN_VALUE;
                        Object obj31 = gVar.j;
                        nm6 nm6Var30 = nm6.a;
                        i29 = gVar.k;
                        if (i29 != 0) {
                            qgg.h0(obj31);
                            Iterator it = ((List) obj).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    plusProxyActivity = it.next();
                                    if (((Activity) plusProxyActivity) instanceof PlusProxyActivity) {
                                    }
                                } else {
                                    plusProxyActivity = 0;
                                }
                            }
                            PlusProxyActivity plusProxyActivity2 = plusProxyActivity instanceof PlusProxyActivity ? plusProxyActivity : null;
                            if (plusProxyActivity2 != null) {
                                gVar.k = 1;
                                if (this.b.emit(plusProxyActivity2, gVar) == nm6Var30) {
                                }
                            }
                        } else if (i29 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj31);
                        }
                        break;
                    }
                }
                gVar = new com.yandex.plus.core.activity.result.internal.g(this, continuation);
                Object obj312 = gVar.j;
                nm6 nm6Var302 = nm6.a;
                i29 = gVar.k;
                if (i29 != 0) {
                }
                break;
            default:
                if (continuation instanceof com.yandex.plus.core.data.pay.e) {
                    eVar2 = (com.yandex.plus.core.data.pay.e) continuation;
                    int i60 = eVar2.k;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        eVar2.k = i60 - Integer.MIN_VALUE;
                        Object obj33 = eVar2.j;
                        nm6 nm6Var31 = nm6.a;
                        i30 = eVar2.k;
                        if (i30 != 0) {
                            qgg.h0(obj33);
                            if (obj instanceof com.yandex.plus.core.data.pay.l) {
                                eVar2.k = 1;
                                if (this.b.emit(obj, eVar2) == nm6Var31) {
                                }
                            }
                        } else if (i30 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj33);
                        }
                        break;
                    }
                }
                eVar2 = new com.yandex.plus.core.data.pay.e(this, continuation);
                Object obj332 = eVar2.j;
                nm6 nm6Var312 = nm6.a;
                i30 = eVar2.k;
                if (i30 != 0) {
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ s(rjc rjcVar, com.yandex.passport.common.mvi.e eVar, int i) {
        this.a = i;
        this.b = rjcVar;
    }
}
