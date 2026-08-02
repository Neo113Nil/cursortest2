package defpackage;

import com.yandex.pulse.metrics.o;
import defpackage.hmm;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k4q implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;

    public /* synthetic */ k4q(rjc rjcVar, int i) {
        this.a = i;
        this.b = rjcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0149  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        j4q j4qVar;
        int i;
        c6q c6qVar;
        int i2;
        s6q s6qVar;
        int i3;
        kgq kgqVar;
        int i4;
        tjq tjqVar;
        int i5;
        noq noqVar;
        int i6;
        woq woqVar;
        int i7;
        yoq yoqVar;
        int i8;
        ipq ipqVar;
        int i9;
        ppq ppqVar;
        int i10;
        pqq pqqVar;
        int i11;
        bvq bvqVar;
        int i12;
        n0r n0rVar;
        int i13;
        mbr mbrVar;
        int i14;
        fjr fjrVar;
        int i15;
        snr snrVar;
        int i16;
        xor xorVar;
        int i17;
        yor yorVar;
        int i18;
        bpr bprVar;
        int i19;
        mvr mvrVar;
        int i20;
        uxr uxrVar;
        int i21;
        Object obj2;
        u4s u4sVar;
        int i22;
        x4s x4sVar;
        int i23;
        a5s a5sVar;
        int i24;
        b5s b5sVar;
        int i25;
        e5s e5sVar;
        int i26;
        dos dosVar;
        int i27;
        eos eosVar;
        int i28;
        pzs pzsVar;
        int i29;
        xzs xzsVar;
        int i30;
        switch (this.a) {
            case 0:
                if (continuation instanceof j4q) {
                    j4qVar = (j4q) continuation;
                    int i31 = j4qVar.k;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        j4qVar.k = i31 - Integer.MIN_VALUE;
                        Object obj3 = j4qVar.j;
                        nm6 nm6Var = nm6.a;
                        i = j4qVar.k;
                        if (i != 0) {
                            qgg.h0(obj3);
                            p8l p8lVar = (p8l) obj;
                            if (!gdg.u(p8lVar.a.f(), p8lVar.b)) {
                                j4qVar.k = 1;
                                if (this.b.emit(obj, j4qVar) == nm6Var) {
                                }
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
                j4qVar = new j4q(this, continuation);
                Object obj32 = j4qVar.j;
                nm6 nm6Var2 = nm6.a;
                i = j4qVar.k;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof c6q) {
                    c6qVar = (c6q) continuation;
                    int i32 = c6qVar.k;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        c6qVar.k = i32 - Integer.MIN_VALUE;
                        Object obj4 = c6qVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = c6qVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj4);
                            if (((xxq) obj).a()) {
                                c6qVar.k = 1;
                                if (this.b.emit(obj, c6qVar) == nm6Var3) {
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
                c6qVar = new c6q(this, continuation);
                Object obj42 = c6qVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = c6qVar.k;
                if (i2 != 0) {
                }
                break;
            case 2:
                if (continuation instanceof s6q) {
                    s6qVar = (s6q) continuation;
                    int i33 = s6qVar.k;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        s6qVar.k = i33 - Integer.MIN_VALUE;
                        Object obj5 = s6qVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = s6qVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj5);
                            if (obj instanceof u2q) {
                                s6qVar.k = 1;
                                if (this.b.emit(obj, s6qVar) == nm6Var4) {
                                }
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
                s6qVar = new s6q(this, continuation);
                Object obj52 = s6qVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = s6qVar.k;
                if (i3 != 0) {
                }
                break;
            case 3:
                if (continuation instanceof kgq) {
                    kgqVar = (kgq) continuation;
                    int i34 = kgqVar.k;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        kgqVar.k = i34 - Integer.MIN_VALUE;
                        Object obj6 = kgqVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = kgqVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj6);
                            List list = (List) obj;
                            d51 d51Var = v3k.f;
                            fs7 fs7Var = v3k.e;
                            v3k v3kVar = list != null ? new v3k(new fs(15, new f1k(list)), fs7Var, d51Var, new ep7(list, 3)) : new v3k(new fs(15, new f1k(c5b.a)), fs7Var, d51Var, xuj.v);
                            kgqVar.k = 1;
                            if (this.b.emit(v3kVar, kgqVar) == nm6Var5) {
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
                kgqVar = new kgq(this, continuation);
                Object obj62 = kgqVar.j;
                nm6 nm6Var52 = nm6.a;
                i4 = kgqVar.k;
                if (i4 != 0) {
                }
                break;
            case 4:
                if (continuation instanceof tjq) {
                    tjqVar = (tjq) continuation;
                    int i35 = tjqVar.k;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        tjqVar.k = i35 - Integer.MIN_VALUE;
                        Object obj7 = tjqVar.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = tjqVar.k;
                        if (i5 != 0) {
                            qgg.h0(obj7);
                            yxc yxcVar = (yxc) obj;
                            Boolean valueOf = Boolean.valueOf(yxcVar.a.d && yxcVar.h);
                            tjqVar.k = 1;
                            if (this.b.emit(valueOf, tjqVar) == nm6Var6) {
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
                tjqVar = new tjq(this, continuation);
                Object obj72 = tjqVar.j;
                nm6 nm6Var62 = nm6.a;
                i5 = tjqVar.k;
                if (i5 != 0) {
                }
                break;
            case 5:
                if (continuation instanceof noq) {
                    noqVar = (noq) continuation;
                    int i36 = noqVar.k;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        noqVar.k = i36 - Integer.MIN_VALUE;
                        Object obj8 = noqVar.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = noqVar.k;
                        if (i6 != 0) {
                            qgg.h0(obj8);
                            rrl rrlVar = (rrl) obj;
                            cvl cvlVar = rrlVar != null ? rrlVar.a : null;
                            noqVar.k = 1;
                            if (this.b.emit(cvlVar, noqVar) == nm6Var7) {
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
                noqVar = new noq(this, continuation);
                Object obj82 = noqVar.j;
                nm6 nm6Var72 = nm6.a;
                i6 = noqVar.k;
                if (i6 != 0) {
                }
                break;
            case 6:
                if (continuation instanceof woq) {
                    woqVar = (woq) continuation;
                    int i37 = woqVar.k;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        woqVar.k = i37 - Integer.MIN_VALUE;
                        Object obj9 = woqVar.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = woqVar.k;
                        if (i7 != 0) {
                            qgg.h0(obj9);
                            if (!Intrinsics.d((cpq) obj, apq.a)) {
                                woqVar.k = 1;
                                if (this.b.emit(obj, woqVar) == nm6Var8) {
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
                woqVar = new woq(this, continuation);
                Object obj92 = woqVar.j;
                nm6 nm6Var82 = nm6.a;
                i7 = woqVar.k;
                if (i7 != 0) {
                }
                break;
            case 7:
                if (continuation instanceof yoq) {
                    yoqVar = (yoq) continuation;
                    int i38 = yoqVar.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        yoqVar.k = i38 - Integer.MIN_VALUE;
                        Object obj10 = yoqVar.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = yoqVar.k;
                        if (i8 != 0) {
                            qgg.h0(obj10);
                            e73 e73Var = (e73) obj;
                            e73Var.getClass();
                            if (!(e73Var instanceof c73)) {
                                yoqVar.k = 1;
                                if (this.b.emit(obj, yoqVar) == nm6Var9) {
                                }
                            }
                        } else if (i8 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj10);
                        }
                        break;
                    }
                }
                yoqVar = new yoq(this, continuation);
                Object obj102 = yoqVar.j;
                nm6 nm6Var92 = nm6.a;
                i8 = yoqVar.k;
                if (i8 != 0) {
                }
                break;
            case 8:
                if (continuation instanceof ipq) {
                    ipqVar = (ipq) continuation;
                    int i39 = ipqVar.k;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        ipqVar.k = i39 - Integer.MIN_VALUE;
                        Object obj11 = ipqVar.j;
                        nm6 nm6Var10 = nm6.a;
                        i9 = ipqVar.k;
                        if (i9 != 0) {
                            qgg.h0(obj11);
                            Boolean valueOf2 = Boolean.valueOf(((cpq) obj) instanceof bpq);
                            ipqVar.k = 1;
                            if (this.b.emit(valueOf2, ipqVar) == nm6Var10) {
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
                ipqVar = new ipq(this, continuation);
                Object obj112 = ipqVar.j;
                nm6 nm6Var102 = nm6.a;
                i9 = ipqVar.k;
                if (i9 != 0) {
                }
                break;
            case 9:
                if (continuation instanceof ppq) {
                    ppqVar = (ppq) continuation;
                    int i40 = ppqVar.k;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        ppqVar.k = i40 - Integer.MIN_VALUE;
                        Object obj12 = ppqVar.j;
                        nm6 nm6Var11 = nm6.a;
                        i10 = ppqVar.k;
                        if (i10 != 0) {
                            qgg.h0(obj12);
                            if (obj instanceof le5) {
                                ppqVar.k = 1;
                                if (this.b.emit(obj, ppqVar) == nm6Var11) {
                                }
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
                ppqVar = new ppq(this, continuation);
                Object obj122 = ppqVar.j;
                nm6 nm6Var112 = nm6.a;
                i10 = ppqVar.k;
                if (i10 != 0) {
                }
                break;
            case 10:
                if (continuation instanceof pqq) {
                    pqqVar = (pqq) continuation;
                    int i41 = pqqVar.k;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        pqqVar.k = i41 - Integer.MIN_VALUE;
                        Object obj13 = pqqVar.j;
                        nm6 nm6Var12 = nm6.a;
                        i11 = pqqVar.k;
                        if (i11 != 0) {
                            qgg.h0(obj13);
                            k2s a = l2s.a((v2s) obj);
                            pqqVar.k = 1;
                            if (this.b.emit(a, pqqVar) == nm6Var12) {
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
                pqqVar = new pqq(this, continuation);
                Object obj132 = pqqVar.j;
                nm6 nm6Var122 = nm6.a;
                i11 = pqqVar.k;
                if (i11 != 0) {
                }
                break;
            case 11:
                if (continuation instanceof bvq) {
                    bvqVar = (bvq) continuation;
                    int i42 = bvqVar.k;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        bvqVar.k = i42 - Integer.MIN_VALUE;
                        Object obj14 = bvqVar.j;
                        nm6 nm6Var13 = nm6.a;
                        i12 = bvqVar.k;
                        if (i12 != 0) {
                            qgg.h0(obj14);
                            e6l e6lVar = (e6l) obj;
                            v5t v5tVar = new v5t(p6g.C(e6lVar), p6g.A(e6lVar));
                            bvqVar.k = 1;
                            if (this.b.emit(v5tVar, bvqVar) == nm6Var13) {
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
                bvqVar = new bvq(this, continuation);
                Object obj142 = bvqVar.j;
                nm6 nm6Var132 = nm6.a;
                i12 = bvqVar.k;
                if (i12 != 0) {
                }
                break;
            case 12:
                if (continuation instanceof n0r) {
                    n0rVar = (n0r) continuation;
                    int i43 = n0rVar.k;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        n0rVar.k = i43 - Integer.MIN_VALUE;
                        Object obj15 = n0rVar.j;
                        nm6 nm6Var14 = nm6.a;
                        i13 = n0rVar.k;
                        if (i13 != 0) {
                            qgg.h0(obj15);
                            Object obj16 = ((Boolean) obj).booleanValue() ? b2g.a : d2g.a;
                            n0rVar.k = 1;
                            if (this.b.emit(obj16, n0rVar) == nm6Var14) {
                            }
                        } else if (i13 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj15);
                        }
                        break;
                    }
                }
                n0rVar = new n0r(this, continuation);
                Object obj152 = n0rVar.j;
                nm6 nm6Var142 = nm6.a;
                i13 = n0rVar.k;
                if (i13 != 0) {
                }
                break;
            case 13:
                if (continuation instanceof mbr) {
                    mbrVar = (mbr) continuation;
                    int i44 = mbrVar.k;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        mbrVar.k = i44 - Integer.MIN_VALUE;
                        Object obj17 = mbrVar.j;
                        nm6 nm6Var15 = nm6.a;
                        i14 = mbrVar.k;
                        if (i14 != 0) {
                            qgg.h0(obj17);
                            if (((d6l) obj).c == v0l.d) {
                                mbrVar.k = 1;
                                if (this.b.emit(obj, mbrVar) == nm6Var15) {
                                }
                            }
                        } else if (i14 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj17);
                        }
                        break;
                    }
                }
                mbrVar = new mbr(this, continuation);
                Object obj172 = mbrVar.j;
                nm6 nm6Var152 = nm6.a;
                i14 = mbrVar.k;
                if (i14 != 0) {
                }
                break;
            case 14:
                if (continuation instanceof fjr) {
                    fjrVar = (fjr) continuation;
                    int i45 = fjrVar.k;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        fjrVar.k = i45 - Integer.MIN_VALUE;
                        Object obj18 = fjrVar.j;
                        nm6 nm6Var16 = nm6.a;
                        i15 = fjrVar.k;
                        if (i15 != 0) {
                            qgg.h0(obj18);
                            hmm hmmVar = (hmm) obj;
                            hmmVar.getClass();
                            Integer num = (Integer) ((lpi) hmmVar).a.get(new hmm.a("stream_bitrate_preference"));
                            int intValue = num != null ? num.intValue() : -1;
                            Object djrVar = intValue == -1 ? cjr.a : new djr(intValue);
                            fjrVar.k = 1;
                            if (this.b.emit(djrVar, fjrVar) == nm6Var16) {
                            }
                        } else if (i15 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj18);
                        }
                        break;
                    }
                }
                fjrVar = new fjr(this, continuation);
                Object obj182 = fjrVar.j;
                nm6 nm6Var162 = nm6.a;
                i15 = fjrVar.k;
                if (i15 != 0) {
                }
                break;
            case 15:
                if (continuation instanceof snr) {
                    snrVar = (snr) continuation;
                    int i46 = snrVar.k;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        snrVar.k = i46 - Integer.MIN_VALUE;
                        Object obj19 = snrVar.j;
                        nm6 nm6Var17 = nm6.a;
                        i16 = snrVar.k;
                        if (i16 != 0) {
                            qgg.h0(obj19);
                            Boolean valueOf3 = Boolean.valueOf(((x66) obj).a);
                            snrVar.k = 1;
                            if (this.b.emit(valueOf3, snrVar) == nm6Var17) {
                            }
                        } else if (i16 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj19);
                        }
                        break;
                    }
                }
                snrVar = new snr(this, continuation);
                Object obj192 = snrVar.j;
                nm6 nm6Var172 = nm6.a;
                i16 = snrVar.k;
                if (i16 != 0) {
                }
                break;
            case 16:
                if (continuation instanceof xor) {
                    xorVar = (xor) continuation;
                    int i47 = xorVar.k;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        xorVar.k = i47 - Integer.MIN_VALUE;
                        Object obj20 = xorVar.j;
                        nm6 nm6Var18 = nm6.a;
                        i17 = xorVar.k;
                        if (i17 != 0) {
                            qgg.h0(obj20);
                            yxc yxcVar2 = (yxc) obj;
                            if (!yxcVar2.a.d || !yxcVar2.h) {
                                xorVar.k = 1;
                                if (this.b.emit(obj, xorVar) == nm6Var18) {
                                }
                            }
                        } else if (i17 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj20);
                        }
                        break;
                    }
                }
                xorVar = new xor(this, continuation);
                Object obj202 = xorVar.j;
                nm6 nm6Var182 = nm6.a;
                i17 = xorVar.k;
                if (i17 != 0) {
                }
                break;
            case 17:
                if (continuation instanceof yor) {
                    yorVar = (yor) continuation;
                    int i48 = yorVar.k;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        yorVar.k = i48 - Integer.MIN_VALUE;
                        Object obj21 = yorVar.j;
                        nm6 nm6Var19 = nm6.a;
                        i18 = yorVar.k;
                        if (i18 != 0) {
                            qgg.h0(obj21);
                            Pair pair = (Pair) obj;
                            boolean booleanValue = ((Boolean) pair.a).booleanValue();
                            u6m u6mVar = (u6m) pair.b;
                            if (booleanValue) {
                                ssg.a(4, "SubscriptionGuardPlugin", "User is inactive", null);
                            }
                            r6m r6mVar = r6m.a;
                            if (Intrinsics.d(u6mVar, r6mVar)) {
                                ssg.a(4, "SubscriptionGuardPlugin", "Device status is not registered", null);
                            }
                            if (booleanValue || Intrinsics.d(u6mVar, r6mVar)) {
                                yorVar.k = 1;
                                if (this.b.emit(obj, yorVar) == nm6Var19) {
                                }
                            }
                        } else if (i18 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj21);
                        }
                        break;
                    }
                }
                yorVar = new yor(this, continuation);
                Object obj212 = yorVar.j;
                nm6 nm6Var192 = nm6.a;
                i18 = yorVar.k;
                if (i18 != 0) {
                }
                break;
            case 18:
                if (continuation instanceof bpr) {
                    bprVar = (bpr) continuation;
                    int i49 = bprVar.k;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        bprVar.k = i49 - Integer.MIN_VALUE;
                        Object obj22 = bprVar.j;
                        nm6 nm6Var20 = nm6.a;
                        i19 = bprVar.k;
                        if (i19 != 0) {
                            qgg.h0(obj22);
                            Boolean valueOf4 = Boolean.valueOf(((yxc) obj).g);
                            bprVar.k = 1;
                            if (this.b.emit(valueOf4, bprVar) == nm6Var20) {
                            }
                        } else if (i19 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj22);
                        }
                        break;
                    }
                }
                bprVar = new bpr(this, continuation);
                Object obj222 = bprVar.j;
                nm6 nm6Var202 = nm6.a;
                i19 = bprVar.k;
                if (i19 != 0) {
                }
                break;
            case 19:
                if (continuation instanceof mvr) {
                    mvrVar = (mvr) continuation;
                    int i50 = mvrVar.k;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        mvrVar.k = i50 - Integer.MIN_VALUE;
                        Object obj23 = mvrVar.j;
                        nm6 nm6Var21 = nm6.a;
                        i20 = mvrVar.k;
                        if (i20 != 0) {
                            qgg.h0(obj23);
                            if (!((Map) obj).isEmpty()) {
                                mvrVar.k = 1;
                                if (this.b.emit(obj, mvrVar) == nm6Var21) {
                                }
                            }
                        } else if (i20 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj23);
                        }
                        break;
                    }
                }
                mvrVar = new mvr(this, continuation);
                Object obj232 = mvrVar.j;
                nm6 nm6Var212 = nm6.a;
                i20 = mvrVar.k;
                if (i20 != 0) {
                }
                break;
            case 20:
                if (continuation instanceof uxr) {
                    uxrVar = (uxr) continuation;
                    int i51 = uxrVar.k;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        uxrVar.k = i51 - Integer.MIN_VALUE;
                        Object obj24 = uxrVar.j;
                        nm6 nm6Var22 = nm6.a;
                        i21 = uxrVar.k;
                        if (i21 != 0) {
                            qgg.h0(obj24);
                            int ordinal = ((oxr) obj).ordinal();
                            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                obj2 = null;
                            } else if (ordinal == 3) {
                                obj2 = sxr.a;
                            } else if (ordinal != 4) {
                                b6e.s();
                                break;
                            } else {
                                obj2 = rxr.a;
                            }
                            if (obj2 != null) {
                                uxrVar.k = 1;
                                if (this.b.emit(obj2, uxrVar) == nm6Var22) {
                                }
                            }
                        } else if (i21 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj24);
                            break;
                        }
                    }
                }
                uxrVar = new uxr(this, continuation);
                Object obj242 = uxrVar.j;
                nm6 nm6Var222 = nm6.a;
                i21 = uxrVar.k;
                if (i21 != 0) {
                }
                break;
            case 21:
                if (continuation instanceof u4s) {
                    u4sVar = (u4s) continuation;
                    int i52 = u4sVar.k;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        u4sVar.k = i52 - Integer.MIN_VALUE;
                        Object obj25 = u4sVar.j;
                        nm6 nm6Var23 = nm6.a;
                        i22 = u4sVar.k;
                        if (i22 != 0) {
                            qgg.h0(obj25);
                            if (((Boolean) obj).booleanValue()) {
                                u4sVar.k = 1;
                                if (this.b.emit(obj, u4sVar) == nm6Var23) {
                                }
                            }
                        } else if (i22 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj25);
                        }
                        break;
                    }
                }
                u4sVar = new u4s(this, continuation);
                Object obj252 = u4sVar.j;
                nm6 nm6Var232 = nm6.a;
                i22 = u4sVar.k;
                if (i22 != 0) {
                }
                break;
            case 22:
                if (continuation instanceof x4s) {
                    x4sVar = (x4s) continuation;
                    int i53 = x4sVar.k;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        x4sVar.k = i53 - Integer.MIN_VALUE;
                        Object obj26 = x4sVar.j;
                        nm6 nm6Var24 = nm6.a;
                        i23 = x4sVar.k;
                        if (i23 != 0) {
                            qgg.h0(obj26);
                            if (((Boolean) obj).booleanValue()) {
                                x4sVar.k = 1;
                                if (this.b.emit(obj, x4sVar) == nm6Var24) {
                                }
                            }
                        } else if (i23 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj26);
                        }
                        break;
                    }
                }
                x4sVar = new x4s(this, continuation);
                Object obj262 = x4sVar.j;
                nm6 nm6Var242 = nm6.a;
                i23 = x4sVar.k;
                if (i23 != 0) {
                }
                break;
            case 23:
                if (continuation instanceof a5s) {
                    a5sVar = (a5s) continuation;
                    int i54 = a5sVar.k;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        a5sVar.k = i54 - Integer.MIN_VALUE;
                        Object obj27 = a5sVar.j;
                        nm6 nm6Var25 = nm6.a;
                        i24 = a5sVar.k;
                        if (i24 != 0) {
                            qgg.h0(obj27);
                            if (((Boolean) obj).booleanValue()) {
                                a5sVar.k = 1;
                                if (this.b.emit(obj, a5sVar) == nm6Var25) {
                                }
                            }
                        } else if (i24 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj27);
                        }
                        break;
                    }
                }
                a5sVar = new a5s(this, continuation);
                Object obj272 = a5sVar.j;
                nm6 nm6Var252 = nm6.a;
                i24 = a5sVar.k;
                if (i24 != 0) {
                }
                break;
            case 24:
                if (continuation instanceof b5s) {
                    b5sVar = (b5s) continuation;
                    int i55 = b5sVar.k;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        b5sVar.k = i55 - Integer.MIN_VALUE;
                        Object obj28 = b5sVar.j;
                        nm6 nm6Var26 = nm6.a;
                        i25 = b5sVar.k;
                        if (i25 != 0) {
                            qgg.h0(obj28);
                            if (((Boolean) obj).booleanValue()) {
                                b5sVar.k = 1;
                                if (this.b.emit(obj, b5sVar) == nm6Var26) {
                                }
                            }
                        } else if (i25 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj28);
                        }
                        break;
                    }
                }
                b5sVar = new b5s(this, continuation);
                Object obj282 = b5sVar.j;
                nm6 nm6Var262 = nm6.a;
                i25 = b5sVar.k;
                if (i25 != 0) {
                }
                break;
            case 25:
                if (continuation instanceof e5s) {
                    e5sVar = (e5s) continuation;
                    int i56 = e5sVar.k;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        e5sVar.k = i56 - Integer.MIN_VALUE;
                        Object obj29 = e5sVar.j;
                        nm6 nm6Var27 = nm6.a;
                        i26 = e5sVar.k;
                        if (i26 != 0) {
                            qgg.h0(obj29);
                            Boolean valueOf5 = Boolean.valueOf(((drc) obj).a);
                            e5sVar.k = 1;
                            if (this.b.emit(valueOf5, e5sVar) == nm6Var27) {
                            }
                        } else if (i26 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj29);
                        }
                        break;
                    }
                }
                e5sVar = new e5s(this, continuation);
                Object obj292 = e5sVar.j;
                nm6 nm6Var272 = nm6.a;
                i26 = e5sVar.k;
                if (i26 != 0) {
                }
                break;
            case 26:
                if (continuation instanceof dos) {
                    dosVar = (dos) continuation;
                    int i57 = dosVar.k;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        dosVar.k = i57 - Integer.MIN_VALUE;
                        Object obj30 = dosVar.j;
                        nm6 nm6Var28 = nm6.a;
                        i27 = dosVar.k;
                        if (i27 != 0) {
                            qgg.h0(obj30);
                            if (obj instanceof bos) {
                                dosVar.k = 1;
                                if (this.b.emit(obj, dosVar) == nm6Var28) {
                                }
                            }
                        } else if (i27 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj30);
                        }
                        break;
                    }
                }
                dosVar = new dos(this, continuation);
                Object obj302 = dosVar.j;
                nm6 nm6Var282 = nm6.a;
                i27 = dosVar.k;
                if (i27 != 0) {
                }
                break;
            case 27:
                if (continuation instanceof eos) {
                    eosVar = (eos) continuation;
                    int i58 = eosVar.k;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        eosVar.k = i58 - Integer.MIN_VALUE;
                        Object obj31 = eosVar.j;
                        nm6 nm6Var29 = nm6.a;
                        i28 = eosVar.k;
                        if (i28 != 0) {
                            qgg.h0(obj31);
                            mns mnsVar = ((bos) obj).a;
                            eosVar.k = 1;
                            if (this.b.emit(mnsVar, eosVar) == nm6Var29) {
                            }
                        } else if (i28 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj31);
                        }
                        break;
                    }
                }
                eosVar = new eos(this, continuation);
                Object obj312 = eosVar.j;
                nm6 nm6Var292 = nm6.a;
                i28 = eosVar.k;
                if (i28 != 0) {
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                if (continuation instanceof pzs) {
                    pzsVar = (pzs) continuation;
                    int i59 = pzsVar.k;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        pzsVar.k = i59 - Integer.MIN_VALUE;
                        Object obj33 = pzsVar.j;
                        nm6 nm6Var30 = nm6.a;
                        i29 = pzsVar.k;
                        if (i29 != 0) {
                            qgg.h0(obj33);
                            if (obj instanceof d6l) {
                                pzsVar.k = 1;
                                if (this.b.emit(obj, pzsVar) == nm6Var30) {
                                }
                            }
                        } else if (i29 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj33);
                        }
                        break;
                    }
                }
                pzsVar = new pzs(this, continuation);
                Object obj332 = pzsVar.j;
                nm6 nm6Var302 = nm6.a;
                i29 = pzsVar.k;
                if (i29 != 0) {
                }
                break;
            default:
                if (continuation instanceof xzs) {
                    xzsVar = (xzs) continuation;
                    int i60 = xzsVar.k;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        xzsVar.k = i60 - Integer.MIN_VALUE;
                        Object obj34 = xzsVar.j;
                        nm6 nm6Var31 = nm6.a;
                        i30 = xzsVar.k;
                        if (i30 != 0) {
                            qgg.h0(obj34);
                            mqs a2 = ((d6l) obj).a.b().a();
                            if (a2 != null) {
                                xzsVar.k = 1;
                                if (this.b.emit(a2, xzsVar) == nm6Var31) {
                                }
                            }
                        } else if (i30 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj34);
                        }
                        break;
                    }
                }
                xzsVar = new xzs(this, continuation);
                Object obj342 = xzsVar.j;
                nm6 nm6Var312 = nm6.a;
                i30 = xzsVar.k;
                if (i30 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
