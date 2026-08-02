package defpackage;

import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.api.exception.j;
import com.yandex.passport.api.f1;
import com.yandex.passport.api.g1;
import com.yandex.passport.api.h1;
import com.yandex.pulse.metrics.o;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class fgf implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;

    public /* synthetic */ fgf(rjc rjcVar, int i) {
        this.a = i;
        this.b = rjcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0198  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        egf egfVar;
        int i;
        mjf mjfVar;
        int i2;
        n7q n7qVar;
        pjf pjfVar;
        int i3;
        dlf dlfVar;
        int i4;
        wlf wlfVar;
        int i5;
        omf omfVar;
        int i6;
        qmf qmfVar;
        int i7;
        yzf yzfVar;
        int i8;
        j3g j3gVar;
        int i9;
        k3g k3gVar;
        int i10;
        l3g l3gVar;
        int i11;
        m3g m3gVar;
        int i12;
        h4g h4gVar;
        int i13;
        wzf wzfVar;
        boolean z;
        l4g l4gVar;
        int i14;
        k9g k9gVar;
        int i15;
        l9g l9gVar;
        int i16;
        m9g m9gVar;
        int i17;
        pmg pmgVar;
        int i18;
        aug augVar;
        int i19;
        bug bugVar;
        int i20;
        cug cugVar;
        int i21;
        eug eugVar;
        int i22;
        mug mugVar;
        int i23;
        k2h k2hVar;
        int i24;
        l2h l2hVar;
        int i25;
        m2h m2hVar;
        int i26;
        hqs hqsVar;
        b3h b3hVar;
        int i27;
        d3h d3hVar;
        int i28;
        t8h t8hVar;
        int i29;
        Object obj2;
        poh pohVar;
        int i30;
        switch (this.a) {
            case 0:
                if (continuation instanceof egf) {
                    egfVar = (egf) continuation;
                    int i31 = egfVar.k;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        egfVar.k = i31 - Integer.MIN_VALUE;
                        Object obj3 = egfVar.j;
                        nm6 nm6Var = nm6.a;
                        i = egfVar.k;
                        if (i != 0) {
                            qgg.h0(obj3);
                            String str = ((xxq) obj).a;
                            egfVar.k = 1;
                            if (this.b.emit(str, egfVar) == nm6Var) {
                            }
                        } else if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                        }
                        break;
                    }
                }
                egfVar = new egf(this, continuation);
                Object obj32 = egfVar.j;
                nm6 nm6Var2 = nm6.a;
                i = egfVar.k;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof mjf) {
                    mjfVar = (mjf) continuation;
                    int i32 = mjfVar.k;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        mjfVar.k = i32 - Integer.MIN_VALUE;
                        Object obj4 = mjfVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = mjfVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj4);
                            d6l x = p6g.x((e6l) obj);
                            mwk mwkVar = (x == null || (n7qVar = x.a) == null) ? null : (mwk) wdg.A(n7qVar, mvn.d);
                            if (mwkVar != null) {
                                mjfVar.k = 1;
                                if (this.b.emit(mwkVar, mjfVar) == nm6Var3) {
                                }
                            }
                        } else if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                        }
                        break;
                    }
                }
                mjfVar = new mjf(this, continuation);
                Object obj42 = mjfVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = mjfVar.k;
                if (i2 != 0) {
                }
                break;
            case 2:
                if (continuation instanceof pjf) {
                    pjfVar = (pjf) continuation;
                    int i33 = pjfVar.k;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        pjfVar.k = i33 - Integer.MIN_VALUE;
                        Object obj5 = pjfVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = pjfVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj5);
                            Boolean valueOf = Boolean.valueOf(((Number) obj).floatValue() == 1.0f);
                            pjfVar.k = 1;
                            if (this.b.emit(valueOf, pjfVar) == nm6Var4) {
                            }
                        } else if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj5);
                        }
                        break;
                    }
                }
                pjfVar = new pjf(this, continuation);
                Object obj52 = pjfVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = pjfVar.k;
                if (i3 != 0) {
                }
                break;
            case 3:
                if (continuation instanceof dlf) {
                    dlfVar = (dlf) continuation;
                    int i34 = dlfVar.k;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        dlfVar.k = i34 - Integer.MIN_VALUE;
                        Object obj6 = dlfVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = dlfVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj6);
                            if (((lwu) obj) instanceof ewu) {
                                dlfVar.k = 1;
                                if (this.b.emit(obj, dlfVar) == nm6Var5) {
                                }
                            }
                        } else if (i4 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj6);
                        }
                        break;
                    }
                }
                dlfVar = new dlf(this, continuation);
                Object obj62 = dlfVar.j;
                nm6 nm6Var52 = nm6.a;
                i4 = dlfVar.k;
                if (i4 != 0) {
                }
                break;
            case 4:
                if (continuation instanceof wlf) {
                    wlfVar = (wlf) continuation;
                    int i35 = wlfVar.k;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        wlfVar.k = i35 - Integer.MIN_VALUE;
                        Object obj7 = wlfVar.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = wlfVar.k;
                        if (i5 != 0) {
                            qgg.h0(obj7);
                            Boolean valueOf2 = Boolean.valueOf(((xxu) obj) != null);
                            wlfVar.k = 1;
                            if (this.b.emit(valueOf2, wlfVar) == nm6Var6) {
                            }
                        } else if (i5 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj7);
                        }
                        break;
                    }
                }
                wlfVar = new wlf(this, continuation);
                Object obj72 = wlfVar.j;
                nm6 nm6Var62 = nm6.a;
                i5 = wlfVar.k;
                if (i5 != 0) {
                }
                break;
            case 5:
                if (continuation instanceof omf) {
                    omfVar = (omf) continuation;
                    int i36 = omfVar.k;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        omfVar.k = i36 - Integer.MIN_VALUE;
                        Object obj8 = omfVar.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = omfVar.k;
                        if (i6 != 0) {
                            qgg.h0(obj8);
                            y7q y7qVar = (y7q) obj;
                            x7q x7qVar = y7qVar instanceof x7q ? (x7q) y7qVar : null;
                            omfVar.k = 1;
                            if (this.b.emit(x7qVar, omfVar) == nm6Var7) {
                            }
                        } else if (i6 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj8);
                        }
                        break;
                    }
                }
                omfVar = new omf(this, continuation);
                Object obj82 = omfVar.j;
                nm6 nm6Var72 = nm6.a;
                i6 = omfVar.k;
                if (i6 != 0) {
                }
                break;
            case 6:
                if (continuation instanceof qmf) {
                    qmfVar = (qmf) continuation;
                    int i37 = qmfVar.k;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        qmfVar.k = i37 - Integer.MIN_VALUE;
                        Object obj9 = qmfVar.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = qmfVar.k;
                        if (i7 != 0) {
                            qgg.h0(obj9);
                            if (obj instanceof jwu) {
                                qmfVar.k = 1;
                                if (this.b.emit(obj, qmfVar) == nm6Var8) {
                                }
                            }
                        } else if (i7 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj9);
                        }
                        break;
                    }
                }
                qmfVar = new qmf(this, continuation);
                Object obj92 = qmfVar.j;
                nm6 nm6Var82 = nm6.a;
                i7 = qmfVar.k;
                if (i7 != 0) {
                }
                break;
            case 7:
                if (continuation instanceof yzf) {
                    yzfVar = (yzf) continuation;
                    int i38 = yzfVar.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        yzfVar.k = i38 - Integer.MIN_VALUE;
                        Object obj10 = yzfVar.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = yzfVar.k;
                        if (i8 != 0) {
                            qgg.h0(obj10);
                            switch (((c3g) obj).a.ordinal()) {
                                case 0:
                                case 5:
                                case 8:
                                case 9:
                                    yzfVar.k = 1;
                                    if (this.b.emit(obj, yzfVar) == nm6Var9) {
                                    }
                                    break;
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 6:
                                case 7:
                                    break;
                                default:
                                    b6e.s();
                                    break;
                            }
                        } else if (i8 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj10);
                            break;
                        }
                    }
                }
                yzfVar = new yzf(this, continuation);
                Object obj102 = yzfVar.j;
                nm6 nm6Var92 = nm6.a;
                i8 = yzfVar.k;
                if (i8 != 0) {
                }
                break;
            case 8:
                if (continuation instanceof j3g) {
                    j3gVar = (j3g) continuation;
                    int i39 = j3gVar.k;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        j3gVar.k = i39 - Integer.MIN_VALUE;
                        Object obj11 = j3gVar.j;
                        nm6 nm6Var10 = nm6.a;
                        i9 = j3gVar.k;
                        if (i9 != 0) {
                            qgg.h0(obj11);
                            Boolean valueOf3 = Boolean.valueOf(((j1g) obj) == j1g.a);
                            j3gVar.k = 1;
                            if (this.b.emit(valueOf3, j3gVar) == nm6Var10) {
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
                j3gVar = new j3g(this, continuation);
                Object obj112 = j3gVar.j;
                nm6 nm6Var102 = nm6.a;
                i9 = j3gVar.k;
                if (i9 != 0) {
                }
                break;
            case 9:
                if (continuation instanceof k3g) {
                    k3gVar = (k3g) continuation;
                    int i40 = k3gVar.k;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        k3gVar.k = i40 - Integer.MIN_VALUE;
                        Object obj12 = k3gVar.j;
                        nm6 nm6Var11 = nm6.a;
                        i10 = k3gVar.k;
                        if (i10 != 0) {
                            qgg.h0(obj12);
                            Boolean valueOf4 = Boolean.valueOf(((j1g) obj) == j1g.a);
                            k3gVar.k = 1;
                            if (this.b.emit(valueOf4, k3gVar) == nm6Var11) {
                            }
                        } else if (i10 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj12);
                        }
                        break;
                    }
                }
                k3gVar = new k3g(this, continuation);
                Object obj122 = k3gVar.j;
                nm6 nm6Var112 = nm6.a;
                i10 = k3gVar.k;
                if (i10 != 0) {
                }
                break;
            case 10:
                if (continuation instanceof l3g) {
                    l3gVar = (l3g) continuation;
                    int i41 = l3gVar.k;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        l3gVar.k = i41 - Integer.MIN_VALUE;
                        Object obj13 = l3gVar.j;
                        nm6 nm6Var12 = nm6.a;
                        i11 = l3gVar.k;
                        if (i11 != 0) {
                            qgg.h0(obj13);
                            Boolean valueOf5 = Boolean.valueOf(((j1g) obj) == j1g.a);
                            l3gVar.k = 1;
                            if (this.b.emit(valueOf5, l3gVar) == nm6Var12) {
                            }
                        } else if (i11 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj13);
                        }
                        break;
                    }
                }
                l3gVar = new l3g(this, continuation);
                Object obj132 = l3gVar.j;
                nm6 nm6Var122 = nm6.a;
                i11 = l3gVar.k;
                if (i11 != 0) {
                }
                break;
            case 11:
                if (continuation instanceof m3g) {
                    m3gVar = (m3g) continuation;
                    int i42 = m3gVar.k;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        m3gVar.k = i42 - Integer.MIN_VALUE;
                        Object obj14 = m3gVar.j;
                        nm6 nm6Var13 = nm6.a;
                        i12 = m3gVar.k;
                        if (i12 != 0) {
                            qgg.h0(obj14);
                            Boolean valueOf6 = Boolean.valueOf(((j1g) obj) == j1g.a);
                            m3gVar.k = 1;
                            if (this.b.emit(valueOf6, m3gVar) == nm6Var13) {
                            }
                        } else if (i12 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj14);
                        }
                        break;
                    }
                }
                m3gVar = new m3g(this, continuation);
                Object obj142 = m3gVar.j;
                nm6 nm6Var132 = nm6.a;
                i12 = m3gVar.k;
                if (i12 != 0) {
                }
                break;
            case 12:
                if (continuation instanceof h4g) {
                    h4gVar = (h4g) continuation;
                    int i43 = h4gVar.k;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        h4gVar.k = i43 - Integer.MIN_VALUE;
                        Object obj15 = h4gVar.j;
                        nm6 nm6Var14 = nm6.a;
                        i13 = h4gVar.k;
                        if (i13 != 0) {
                            qgg.h0(obj15);
                            switch (((c3g) obj).a.ordinal()) {
                                case 0:
                                case 5:
                                case 8:
                                case 9:
                                    z = true;
                                    wzfVar = new wzf(z);
                                    h4gVar.k = 1;
                                    if (this.b.emit(wzfVar, h4gVar) == nm6Var14) {
                                    }
                                    break;
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 6:
                                case 7:
                                    z = false;
                                    wzfVar = new wzf(z);
                                    h4gVar.k = 1;
                                    if (this.b.emit(wzfVar, h4gVar) == nm6Var14) {
                                    }
                                    break;
                                default:
                                    b6e.s();
                                    break;
                            }
                        } else if (i13 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj15);
                            break;
                        }
                    }
                }
                h4gVar = new h4g(this, continuation);
                Object obj152 = h4gVar.j;
                nm6 nm6Var142 = nm6.a;
                i13 = h4gVar.k;
                if (i13 != 0) {
                }
                break;
            case 13:
                if (continuation instanceof l4g) {
                    l4gVar = (l4g) continuation;
                    int i44 = l4gVar.k;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        l4gVar.k = i44 - Integer.MIN_VALUE;
                        Object obj16 = l4gVar.j;
                        nm6 nm6Var15 = nm6.a;
                        i14 = l4gVar.k;
                        if (i14 != 0) {
                            qgg.h0(obj16);
                            if (((wzf) obj).a) {
                                l4gVar.k = 1;
                                if (this.b.emit(obj, l4gVar) == nm6Var15) {
                                }
                            }
                        } else if (i14 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj16);
                        }
                        break;
                    }
                }
                l4gVar = new l4g(this, continuation);
                Object obj162 = l4gVar.j;
                nm6 nm6Var152 = nm6.a;
                i14 = l4gVar.k;
                if (i14 != 0) {
                }
                break;
            case 14:
                if (continuation instanceof k9g) {
                    k9gVar = (k9g) continuation;
                    int i45 = k9gVar.k;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        k9gVar.k = i45 - Integer.MIN_VALUE;
                        Object obj17 = k9gVar.j;
                        nm6 nm6Var16 = nm6.a;
                        i15 = k9gVar.k;
                        if (i15 != 0) {
                            qgg.h0(obj17);
                            if (((Boolean) obj).booleanValue()) {
                                k9gVar.k = 1;
                                if (this.b.emit(obj, k9gVar) == nm6Var16) {
                                }
                            }
                        } else if (i15 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj17);
                        }
                        break;
                    }
                }
                k9gVar = new k9g(this, continuation);
                Object obj172 = k9gVar.j;
                nm6 nm6Var162 = nm6.a;
                i15 = k9gVar.k;
                if (i15 != 0) {
                }
                break;
            case 15:
                if (continuation instanceof l9g) {
                    l9gVar = (l9g) continuation;
                    int i46 = l9gVar.k;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        l9gVar.k = i46 - Integer.MIN_VALUE;
                        Object obj18 = l9gVar.j;
                        nm6 nm6Var17 = nm6.a;
                        i16 = l9gVar.k;
                        if (i16 != 0) {
                            qgg.h0(obj18);
                            if (((Boolean) obj).booleanValue()) {
                                l9gVar.k = 1;
                                if (this.b.emit(obj, l9gVar) == nm6Var17) {
                                }
                            }
                        } else if (i16 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj18);
                        }
                        break;
                    }
                }
                l9gVar = new l9g(this, continuation);
                Object obj182 = l9gVar.j;
                nm6 nm6Var172 = nm6.a;
                i16 = l9gVar.k;
                if (i16 != 0) {
                }
                break;
            case 16:
                if (continuation instanceof m9g) {
                    m9gVar = (m9g) continuation;
                    int i47 = m9gVar.k;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        m9gVar.k = i47 - Integer.MIN_VALUE;
                        Object obj19 = m9gVar.j;
                        nm6 nm6Var18 = nm6.a;
                        i17 = m9gVar.k;
                        if (i17 != 0) {
                            qgg.h0(obj19);
                            if (((Boolean) obj).booleanValue()) {
                                m9gVar.k = 1;
                                if (this.b.emit(obj, m9gVar) == nm6Var18) {
                                }
                            }
                        } else if (i17 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj19);
                        }
                        break;
                    }
                }
                m9gVar = new m9g(this, continuation);
                Object obj192 = m9gVar.j;
                nm6 nm6Var182 = nm6.a;
                i17 = m9gVar.k;
                if (i17 != 0) {
                }
                break;
            case 17:
                if (continuation instanceof pmg) {
                    pmgVar = (pmg) continuation;
                    int i48 = pmgVar.k;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        pmgVar.k = i48 - Integer.MIN_VALUE;
                        Object obj20 = pmgVar.j;
                        nm6 nm6Var19 = nm6.a;
                        i18 = pmgVar.k;
                        if (i18 != 0) {
                            qgg.h0(obj20);
                            if (Intrinsics.d((e6l) obj, b6l.a)) {
                                pmgVar.k = 1;
                                if (this.b.emit(obj, pmgVar) == nm6Var19) {
                                }
                            }
                        } else if (i18 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj20);
                        }
                        break;
                    }
                }
                pmgVar = new pmg(this, continuation);
                Object obj202 = pmgVar.j;
                nm6 nm6Var192 = nm6.a;
                i18 = pmgVar.k;
                if (i18 != 0) {
                }
                break;
            case 18:
                if (continuation instanceof aug) {
                    augVar = (aug) continuation;
                    int i49 = augVar.k;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        augVar.k = i49 - Integer.MIN_VALUE;
                        Object obj21 = augVar.j;
                        nm6 nm6Var20 = nm6.a;
                        i19 = augVar.k;
                        if (i19 != 0) {
                            qgg.h0(obj21);
                            if (((Boolean) obj).booleanValue()) {
                                augVar.k = 1;
                                if (this.b.emit(obj, augVar) == nm6Var20) {
                                }
                            }
                        } else if (i19 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj21);
                        }
                        break;
                    }
                }
                augVar = new aug(this, continuation);
                Object obj212 = augVar.j;
                nm6 nm6Var202 = nm6.a;
                i19 = augVar.k;
                if (i19 != 0) {
                }
                break;
            case 19:
                if (continuation instanceof bug) {
                    bugVar = (bug) continuation;
                    int i50 = bugVar.k;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        bugVar.k = i50 - Integer.MIN_VALUE;
                        Object obj22 = bugVar.j;
                        nm6 nm6Var21 = nm6.a;
                        i20 = bugVar.k;
                        if (i20 != 0) {
                            qgg.h0(obj22);
                            Boolean valueOf7 = Boolean.valueOf(((xxq) obj).a());
                            bugVar.k = 1;
                            if (this.b.emit(valueOf7, bugVar) == nm6Var21) {
                            }
                        } else if (i20 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj22);
                        }
                        break;
                    }
                }
                bugVar = new bug(this, continuation);
                Object obj222 = bugVar.j;
                nm6 nm6Var212 = nm6.a;
                i20 = bugVar.k;
                if (i20 != 0) {
                }
                break;
            case 20:
                if (continuation instanceof cug) {
                    cugVar = (cug) continuation;
                    int i51 = cugVar.k;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        cugVar.k = i51 - Integer.MIN_VALUE;
                        Object obj23 = cugVar.j;
                        nm6 nm6Var22 = nm6.a;
                        i21 = cugVar.k;
                        if (i21 != 0) {
                            qgg.h0(obj23);
                            ((Boolean) obj).getClass();
                            cugVar.k = 1;
                            if (this.b.emit(LegacyAccountType.STRING_LOGIN, cugVar) == nm6Var22) {
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
                cugVar = new cug(this, continuation);
                Object obj232 = cugVar.j;
                nm6 nm6Var222 = nm6.a;
                i21 = cugVar.k;
                if (i21 != 0) {
                }
                break;
            case 21:
                if (continuation instanceof eug) {
                    eugVar = (eug) continuation;
                    int i52 = eugVar.k;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        eugVar.k = i52 - Integer.MIN_VALUE;
                        Object obj24 = eugVar.j;
                        nm6 nm6Var23 = nm6.a;
                        i22 = eugVar.k;
                        if (i22 != 0) {
                            qgg.h0(obj24);
                            if (((xxq) obj).a()) {
                                eugVar.k = 1;
                                if (this.b.emit(obj, eugVar) == nm6Var23) {
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
                eugVar = new eug(this, continuation);
                Object obj242 = eugVar.j;
                nm6 nm6Var232 = nm6.a;
                i22 = eugVar.k;
                if (i22 != 0) {
                }
                break;
            case 22:
                if (continuation instanceof mug) {
                    mugVar = (mug) continuation;
                    int i53 = mugVar.k;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        mugVar.k = i53 - Integer.MIN_VALUE;
                        Object obj25 = mugVar.j;
                        nm6 nm6Var24 = nm6.a;
                        i23 = mugVar.k;
                        if (i23 != 0) {
                            qgg.h0(obj25);
                            if (!((xxq) obj).a()) {
                                mugVar.k = 1;
                                if (this.b.emit(obj, mugVar) == nm6Var24) {
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
                mugVar = new mug(this, continuation);
                Object obj252 = mugVar.j;
                nm6 nm6Var242 = nm6.a;
                i23 = mugVar.k;
                if (i23 != 0) {
                }
                break;
            case 23:
                if (continuation instanceof k2h) {
                    k2hVar = (k2h) continuation;
                    int i54 = k2hVar.k;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        k2hVar.k = i54 - Integer.MIN_VALUE;
                        Object obj26 = k2hVar.j;
                        nm6 nm6Var25 = nm6.a;
                        i24 = k2hVar.k;
                        if (i24 != 0) {
                            qgg.h0(obj26);
                            if (((Boolean) ((Pair) obj).b).booleanValue()) {
                                k2hVar.k = 1;
                                if (this.b.emit(obj, k2hVar) == nm6Var25) {
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
                k2hVar = new k2h(this, continuation);
                Object obj262 = k2hVar.j;
                nm6 nm6Var252 = nm6.a;
                i24 = k2hVar.k;
                if (i24 != 0) {
                }
                break;
            case 24:
                if (continuation instanceof l2h) {
                    l2hVar = (l2h) continuation;
                    int i55 = l2hVar.k;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        l2hVar.k = i55 - Integer.MIN_VALUE;
                        Object obj27 = l2hVar.j;
                        nm6 nm6Var26 = nm6.a;
                        i25 = l2hVar.k;
                        if (i25 != 0) {
                            qgg.h0(obj27);
                            Boolean valueOf8 = Boolean.valueOf(((x66) obj).a);
                            l2hVar.k = 1;
                            if (this.b.emit(valueOf8, l2hVar) == nm6Var26) {
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
                l2hVar = new l2h(this, continuation);
                Object obj272 = l2hVar.j;
                nm6 nm6Var262 = nm6.a;
                i25 = l2hVar.k;
                if (i25 != 0) {
                }
                break;
            case 25:
                if (continuation instanceof m2h) {
                    m2hVar = (m2h) continuation;
                    int i56 = m2hVar.k;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        m2hVar.k = i56 - Integer.MIN_VALUE;
                        Object obj28 = m2hVar.j;
                        nm6 nm6Var27 = nm6.a;
                        i26 = m2hVar.k;
                        if (i26 != 0) {
                            qgg.h0(obj28);
                            mqs mqsVar = (mqs) ((Pair) obj).a;
                            mqsVar.getClass();
                            Pair pair = new Pair(mqsVar, Boolean.valueOf((a4g.D(gys.NonMusicHolder, mqsVar) || mqsVar.C() || (((hqsVar = mqsVar.o) == null || !hqsVar.b) && (hqsVar == null || !hqsVar.a))) ? false : true));
                            m2hVar.k = 1;
                            if (this.b.emit(pair, m2hVar) == nm6Var27) {
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
                m2hVar = new m2h(this, continuation);
                Object obj282 = m2hVar.j;
                nm6 nm6Var272 = nm6.a;
                i26 = m2hVar.k;
                if (i26 != 0) {
                }
                break;
            case 26:
                if (continuation instanceof b3h) {
                    b3hVar = (b3h) continuation;
                    int i57 = b3hVar.k;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        b3hVar.k = i57 - Integer.MIN_VALUE;
                        Object obj29 = b3hVar.j;
                        nm6 nm6Var28 = nm6.a;
                        i27 = b3hVar.k;
                        if (i27 != 0) {
                            qgg.h0(obj29);
                            Boolean valueOf9 = Boolean.valueOf(p6g.C((e6l) obj));
                            b3hVar.k = 1;
                            if (this.b.emit(valueOf9, b3hVar) == nm6Var28) {
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
                b3hVar = new b3h(this, continuation);
                Object obj292 = b3hVar.j;
                nm6 nm6Var282 = nm6.a;
                i27 = b3hVar.k;
                if (i27 != 0) {
                }
                break;
            case 27:
                if (continuation instanceof d3h) {
                    d3hVar = (d3h) continuation;
                    int i58 = d3hVar.k;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        d3hVar.k = i58 - Integer.MIN_VALUE;
                        Object obj30 = d3hVar.j;
                        nm6 nm6Var29 = nm6.a;
                        i28 = d3hVar.k;
                        if (i28 != 0) {
                            qgg.h0(obj30);
                            Long l = new Long(((nvm) obj).b);
                            d3hVar.k = 1;
                            if (this.b.emit(l, d3hVar) == nm6Var29) {
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
                d3hVar = new d3h(this, continuation);
                Object obj302 = d3hVar.j;
                nm6 nm6Var292 = nm6.a;
                i28 = d3hVar.k;
                if (i28 != 0) {
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                if (continuation instanceof t8h) {
                    t8hVar = (t8h) continuation;
                    int i59 = t8hVar.k;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        t8hVar.k = i59 - Integer.MIN_VALUE;
                        Object obj31 = t8hVar.j;
                        nm6 nm6Var30 = nm6.a;
                        i29 = t8hVar.k;
                        if (i29 != 0) {
                            qgg.h0(obj31);
                            h1 h1Var = (h1) obj;
                            if (!Intrinsics.d(h1Var, f1.a)) {
                                if (!(h1Var instanceof g1)) {
                                    if (!Intrinsics.d(h1Var, f1.b)) {
                                        b6e.s();
                                        break;
                                    } else {
                                        ssg.a(3, null, "managing plus device registered successfully", null);
                                        obj2 = uk.a;
                                    }
                                } else {
                                    j jVar = ((g1) h1Var).a;
                                    ssg.a(5, null, "managing plus device register failed, " + jVar, null);
                                    obj2 = new tk(jVar);
                                }
                            } else {
                                ssg.a(3, null, "managing plus device register cancelled, user has not released the device slot", null);
                                obj2 = sk.a;
                            }
                            t8hVar.k = 1;
                            if (this.b.emit(obj2, t8hVar) == nm6Var30) {
                            }
                        } else if (i29 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj31);
                            break;
                        }
                    }
                }
                t8hVar = new t8h(this, continuation);
                Object obj312 = t8hVar.j;
                nm6 nm6Var302 = nm6.a;
                i29 = t8hVar.k;
                if (i29 != 0) {
                }
                break;
            default:
                if (continuation instanceof poh) {
                    pohVar = (poh) continuation;
                    int i60 = pohVar.k;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        pohVar.k = i60 - Integer.MIN_VALUE;
                        Object obj33 = pohVar.j;
                        nm6 nm6Var31 = nm6.a;
                        i30 = pohVar.k;
                        if (i30 != 0) {
                            qgg.h0(obj33);
                            s84 s84Var = ((hxc) obj).a;
                            if (s84Var == s84.b || s84Var == s84.f) {
                                pohVar.k = 1;
                                if (this.b.emit(obj, pohVar) == nm6Var31) {
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
                pohVar = new poh(this, continuation);
                Object obj332 = pohVar.j;
                nm6 nm6Var312 = nm6.a;
                i30 = pohVar.k;
                if (i30 != 0) {
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ fgf(rjc rjcVar, Object obj, int i) {
        this.a = i;
        this.b = rjcVar;
    }
}
