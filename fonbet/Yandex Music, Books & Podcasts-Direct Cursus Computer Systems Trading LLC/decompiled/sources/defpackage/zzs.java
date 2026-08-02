package defpackage;

import com.yandex.music.shared.auth.proto.a;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class zzs implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;

    public zzs(rjc rjcVar, s2u s2uVar) {
        this.a = 15;
        this.b = rjcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x0951  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0129  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        yzs yzsVar;
        int i;
        String b;
        krt krtVar;
        int i2;
        lrt lrtVar;
        int i3;
        String str;
        qrt qrtVar;
        int i4;
        kst kstVar;
        int i5;
        lst lstVar;
        int i6;
        mst mstVar;
        int i7;
        vvt vvtVar;
        int i8;
        f2u f2uVar;
        int i9;
        k2u k2uVar;
        int i10;
        l2u l2uVar;
        int i11;
        m2u m2uVar;
        int i12;
        n2u n2uVar;
        int i13;
        o2u o2uVar;
        int i14;
        p2u p2uVar;
        int i15;
        q2u q2uVar;
        int i16;
        n5u n5uVar;
        int i17;
        x1u x1uVar;
        o5u o5uVar;
        int i18;
        p5u p5uVar;
        int i19;
        q5u q5uVar;
        int i20;
        r5u r5uVar;
        int i21;
        s5u s5uVar;
        int i22;
        t5u t5uVar;
        int i23;
        u5u u5uVar;
        int i24;
        v5u v5uVar;
        int i25;
        o6u o6uVar;
        int i26;
        q7q w;
        n7q n7qVar;
        x6u x6uVar;
        int i27;
        Object g7uVar;
        g9u g9uVar;
        int i28;
        d74 d74Var;
        h9u h9uVar;
        int i29;
        aku akuVar;
        int i30;
        r4 = false;
        r4 = false;
        boolean z = false;
        s7u s7uVar = null;
        k6u k6uVar = null;
        r8 = null;
        String str2 = null;
        switch (this.a) {
            case 0:
                if (continuation instanceof yzs) {
                    yzsVar = (yzs) continuation;
                    int i31 = yzsVar.k;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        yzsVar.k = i31 - Integer.MIN_VALUE;
                        Object obj2 = yzsVar.j;
                        nm6 nm6Var = nm6.a;
                        i = yzsVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            rjc rjcVar = this.b;
                            cdj cdjVar = (cdj) obj;
                            if (!Intrinsics.d(cdjVar, ycj.a) && !(cdjVar instanceof zcj) && !Intrinsics.d(cdjVar, adj.a)) {
                                if (!(cdjVar instanceof bdj)) {
                                    b6e.s();
                                    break;
                                } else {
                                    bdj bdjVar = (bdj) cdjVar;
                                    long j = bdjVar.b;
                                    l18 l18Var = l18.b;
                                    bdt I = hag.I(skr.class);
                                    qdc qdcVar = l18Var.a;
                                    qdcVar.getClass();
                                    skr skrVar = (skr) qdcVar.C(I);
                                    long j2 = j / 1000;
                                    if (j2 > 59) {
                                        int i32 = (int) ((j2 / 60) + (((int) j2) % 60 >= 30 ? 1 : 0));
                                        b = skrVar.b(R.plurals.number_of_minutes_rtl_support, i32, Integer.valueOf(i32));
                                    } else {
                                        int i33 = (int) j2;
                                        b = skrVar.b(R.plurals.number_of_seconds_rtl_support, i33, Integer.valueOf(i33));
                                    }
                                    cdjVar = new bdj(b, j, bdjVar.c);
                                }
                            }
                            yzsVar.k = 1;
                            if (rjcVar.emit(cdjVar, yzsVar) == nm6Var) {
                                break;
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
                yzsVar = new yzs(this, continuation);
                Object obj22 = yzsVar.j;
                nm6 nm6Var2 = nm6.a;
                i = yzsVar.k;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof krt) {
                    krtVar = (krt) continuation;
                    int i34 = krtVar.k;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        krtVar.k = i34 - Integer.MIN_VALUE;
                        Object obj3 = krtVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = krtVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            rjc rjcVar2 = this.b;
                            yxc yxcVar = (yxc) obj;
                            if (yxcVar == null) {
                                cuk cukVar = drt.e;
                                yxcVar = new yxc(cuk.B(CommonUrlParts.Values.FALSE_INTEGER, "", ""), 0, null, false, b6d.b, false, false, false, c5b.a);
                            }
                            krtVar.k = 1;
                            if (rjcVar2.emit(yxcVar, krtVar) == nm6Var3) {
                                break;
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
                krtVar = new krt(this, continuation);
                Object obj32 = krtVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = krtVar.k;
                if (i2 != 0) {
                }
            case 2:
                if (continuation instanceof lrt) {
                    lrtVar = (lrt) continuation;
                    int i35 = lrtVar.k;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        lrtVar.k = i35 - Integer.MIN_VALUE;
                        Object obj4 = lrtVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = lrtVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            rjc rjcVar3 = this.b;
                            a aVar = (a) obj;
                            if (aVar == null || (str = aVar.a) == null || str.length() <= 0) {
                                aVar = null;
                            }
                            zxc zxcVar = new zxc(aVar != null ? lsq.F(aVar) : null);
                            lrtVar.k = 1;
                            if (rjcVar3.emit(zxcVar, lrtVar) == nm6Var4) {
                                break;
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
                lrtVar = new lrt(this, continuation);
                Object obj42 = lrtVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = lrtVar.k;
                if (i3 != 0) {
                }
                break;
            case 3:
                if (continuation instanceof qrt) {
                    qrtVar = (qrt) continuation;
                    int i36 = qrtVar.k;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        qrtVar.k = i36 - Integer.MIN_VALUE;
                        Object obj5 = qrtVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = qrtVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj5);
                            rjc rjcVar4 = this.b;
                            yxc F = lsq.F((a) obj);
                            qrtVar.k = 1;
                            if (rjcVar4.emit(F, qrtVar) == nm6Var5) {
                                break;
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
                qrtVar = new qrt(this, continuation);
                Object obj52 = qrtVar.j;
                nm6 nm6Var52 = nm6.a;
                i4 = qrtVar.k;
                if (i4 != 0) {
                }
            case 4:
                if (continuation instanceof kst) {
                    kstVar = (kst) continuation;
                    int i37 = kstVar.k;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        kstVar.k = i37 - Integer.MIN_VALUE;
                        Object obj6 = kstVar.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = kstVar.k;
                        if (i5 != 0) {
                            qgg.h0(obj6);
                            rjc rjcVar5 = this.b;
                            if (!((Boolean) obj).booleanValue()) {
                                kstVar.k = 1;
                                if (rjcVar5.emit(obj, kstVar) == nm6Var6) {
                                    break;
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
                kstVar = new kst(this, continuation);
                Object obj62 = kstVar.j;
                nm6 nm6Var62 = nm6.a;
                i5 = kstVar.k;
                if (i5 != 0) {
                }
            case 5:
                if (continuation instanceof lst) {
                    lstVar = (lst) continuation;
                    int i38 = lstVar.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        lstVar.k = i38 - Integer.MIN_VALUE;
                        Object obj7 = lstVar.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = lstVar.k;
                        if (i6 != 0) {
                            qgg.h0(obj7);
                            rjc rjcVar6 = this.b;
                            Boolean valueOf = Boolean.valueOf(((xxq) obj).a());
                            lstVar.k = 1;
                            if (rjcVar6.emit(valueOf, lstVar) == nm6Var7) {
                                break;
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
                lstVar = new lst(this, continuation);
                Object obj72 = lstVar.j;
                nm6 nm6Var72 = nm6.a;
                i6 = lstVar.k;
                if (i6 != 0) {
                }
            case 6:
                if (continuation instanceof mst) {
                    mstVar = (mst) continuation;
                    int i39 = mstVar.k;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        mstVar.k = i39 - Integer.MIN_VALUE;
                        Object obj8 = mstVar.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = mstVar.k;
                        if (i7 != 0) {
                            qgg.h0(obj8);
                            rjc rjcVar7 = this.b;
                            ((Boolean) obj).getClass();
                            mstVar.k = 1;
                            if (rjcVar7.emit("log out", mstVar) == nm6Var8) {
                                break;
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
                mstVar = new mst(this, continuation);
                Object obj82 = mstVar.j;
                nm6 nm6Var82 = nm6.a;
                i7 = mstVar.k;
                if (i7 != 0) {
                }
            case 7:
                if (continuation instanceof vvt) {
                    vvtVar = (vvt) continuation;
                    int i40 = vvtVar.k;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        vvtVar.k = i40 - Integer.MIN_VALUE;
                        Object obj9 = vvtVar.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = vvtVar.k;
                        if (i8 != 0) {
                            qgg.h0(obj9);
                            rjc rjcVar8 = this.b;
                            v0j v0jVar = (v0j) obj;
                            v0jVar.getClass();
                            u0j u0jVar = v0jVar == v0j.e ? u0j.a : u0j.b;
                            vvtVar.k = 1;
                            if (rjcVar8.emit(u0jVar, vvtVar) == nm6Var9) {
                                break;
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
                vvtVar = new vvt(this, continuation);
                Object obj92 = vvtVar.j;
                nm6 nm6Var92 = nm6.a;
                i8 = vvtVar.k;
                if (i8 != 0) {
                }
            case 8:
                if (continuation instanceof f2u) {
                    f2uVar = (f2u) continuation;
                    int i41 = f2uVar.k;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        f2uVar.k = i41 - Integer.MIN_VALUE;
                        Object obj10 = f2uVar.j;
                        nm6 nm6Var10 = nm6.a;
                        i9 = f2uVar.k;
                        if (i9 != 0) {
                            qgg.h0(obj10);
                            rjc rjcVar9 = this.b;
                            ((Number) obj).intValue();
                            z1u z1uVar = new z1u();
                            f2uVar.k = 1;
                            if (rjcVar9.emit(z1uVar, f2uVar) == nm6Var10) {
                                break;
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
                f2uVar = new f2u(this, continuation);
                Object obj102 = f2uVar.j;
                nm6 nm6Var102 = nm6.a;
                i9 = f2uVar.k;
                if (i9 != 0) {
                }
            case 9:
                if (continuation instanceof k2u) {
                    k2uVar = (k2u) continuation;
                    int i42 = k2uVar.k;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        k2uVar.k = i42 - Integer.MIN_VALUE;
                        Object obj11 = k2uVar.j;
                        nm6 nm6Var11 = nm6.a;
                        i10 = k2uVar.k;
                        if (i10 != 0) {
                            qgg.h0(obj11);
                            rjc rjcVar10 = this.b;
                            if (g0g.O(((d6l) obj).a.b()) instanceof w9u) {
                                k2uVar.k = 1;
                                if (rjcVar10.emit(obj, k2uVar) == nm6Var11) {
                                    break;
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
                k2uVar = new k2u(this, continuation);
                Object obj112 = k2uVar.j;
                nm6 nm6Var112 = nm6.a;
                i10 = k2uVar.k;
                if (i10 != 0) {
                }
            case 10:
                if (continuation instanceof l2u) {
                    l2uVar = (l2u) continuation;
                    int i43 = l2uVar.k;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        l2uVar.k = i43 - Integer.MIN_VALUE;
                        Object obj12 = l2uVar.j;
                        nm6 nm6Var12 = nm6.a;
                        i11 = l2uVar.k;
                        if (i11 != 0) {
                            qgg.h0(obj12);
                            rjc rjcVar11 = this.b;
                            if (g0g.O(((u7u) obj).c) instanceof w9u) {
                                l2uVar.k = 1;
                                if (rjcVar11.emit(obj, l2uVar) == nm6Var12) {
                                    break;
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
                l2uVar = new l2u(this, continuation);
                Object obj122 = l2uVar.j;
                nm6 nm6Var122 = nm6.a;
                i11 = l2uVar.k;
                if (i11 != 0) {
                }
            case 11:
                if (continuation instanceof m2u) {
                    m2uVar = (m2u) continuation;
                    int i44 = m2uVar.k;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        m2uVar.k = i44 - Integer.MIN_VALUE;
                        Object obj13 = m2uVar.j;
                        nm6 nm6Var13 = nm6.a;
                        i12 = m2uVar.k;
                        if (i12 != 0) {
                            qgg.h0(obj13);
                            rjc rjcVar12 = this.b;
                            y7q y7qVar = (y7q) obj;
                            if ((y7qVar instanceof w7q) || (y7qVar instanceof x7q)) {
                                m2uVar.k = 1;
                                if (rjcVar12.emit(obj, m2uVar) == nm6Var13) {
                                    break;
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
                m2uVar = new m2u(this, continuation);
                Object obj132 = m2uVar.j;
                nm6 nm6Var132 = nm6.a;
                i12 = m2uVar.k;
                if (i12 != 0) {
                }
                break;
            case 12:
                if (continuation instanceof n2u) {
                    n2uVar = (n2u) continuation;
                    int i45 = n2uVar.k;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        n2uVar.k = i45 - Integer.MIN_VALUE;
                        Object obj14 = n2uVar.j;
                        nm6 nm6Var14 = nm6.a;
                        i13 = n2uVar.k;
                        if (i13 != 0) {
                            qgg.h0(obj14);
                            rjc rjcVar13 = this.b;
                            if (obj instanceof u7u) {
                                n2uVar.k = 1;
                                if (rjcVar13.emit(obj, n2uVar) == nm6Var14) {
                                    break;
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
                n2uVar = new n2u(this, continuation);
                Object obj142 = n2uVar.j;
                nm6 nm6Var142 = nm6.a;
                i13 = n2uVar.k;
                if (i13 != 0) {
                }
            case 13:
                if (continuation instanceof o2u) {
                    o2uVar = (o2u) continuation;
                    int i46 = o2uVar.k;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        o2uVar.k = i46 - Integer.MIN_VALUE;
                        Object obj15 = o2uVar.j;
                        nm6 nm6Var15 = nm6.a;
                        i14 = o2uVar.k;
                        if (i14 != 0) {
                            qgg.h0(obj15);
                            rjc rjcVar14 = this.b;
                            d6l d6lVar = (d6l) obj;
                            Pair pair = new Pair(Boolean.valueOf(d6lVar.b == w0l.b), g0g.O(d6lVar.a.b()));
                            o2uVar.k = 1;
                            if (rjcVar14.emit(pair, o2uVar) == nm6Var15) {
                                break;
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
                o2uVar = new o2u(this, continuation);
                Object obj152 = o2uVar.j;
                nm6 nm6Var152 = nm6.a;
                i14 = o2uVar.k;
                if (i14 != 0) {
                }
            case 14:
                if (continuation instanceof p2u) {
                    p2uVar = (p2u) continuation;
                    int i47 = p2uVar.k;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        p2uVar.k = i47 - Integer.MIN_VALUE;
                        Object obj16 = p2uVar.j;
                        nm6 nm6Var16 = nm6.a;
                        i15 = p2uVar.k;
                        if (i15 != 0) {
                            qgg.h0(obj16);
                            rjc rjcVar15 = this.b;
                            n7q n7qVar2 = ((d6l) obj).a;
                            p2uVar.k = 1;
                            if (rjcVar15.emit(n7qVar2, p2uVar) == nm6Var16) {
                                break;
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
                p2uVar = new p2u(this, continuation);
                Object obj162 = p2uVar.j;
                nm6 nm6Var162 = nm6.a;
                i15 = p2uVar.k;
                if (i15 != 0) {
                }
            case 15:
                if (continuation instanceof q2u) {
                    q2uVar = (q2u) continuation;
                    int i48 = q2uVar.k;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        q2uVar.k = i48 - Integer.MIN_VALUE;
                        Object obj17 = q2uVar.j;
                        Object obj18 = nm6.a;
                        i16 = q2uVar.k;
                        if (i16 != 0) {
                            qgg.h0(obj17);
                            rjc rjcVar16 = this.b;
                            ArrayList arrayList = ((u7u) obj).g;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                x1u a = s2u.a(g0g.O((i5u) it.next()));
                                if (a != null) {
                                    arrayList2.add(a);
                                }
                            }
                            q2uVar.k = 1;
                            if (rjcVar16.emit(arrayList2, q2uVar) == obj18) {
                                break;
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
                q2uVar = new q2u(this, continuation);
                Object obj172 = q2uVar.j;
                Object obj182 = nm6.a;
                i16 = q2uVar.k;
                if (i16 != 0) {
                }
            case 16:
                if (continuation instanceof n5u) {
                    n5uVar = (n5u) continuation;
                    int i49 = n5uVar.k;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        n5uVar.k = i49 - Integer.MIN_VALUE;
                        Object obj19 = n5uVar.j;
                        nm6 nm6Var17 = nm6.a;
                        i17 = n5uVar.k;
                        if (i17 != 0) {
                            qgg.h0(obj19);
                            rjc rjcVar17 = this.b;
                            nvm nvmVar = (nvm) obj;
                            mwk mwkVar = nvmVar.a;
                            i5u i5uVar = mwkVar instanceof i5u ? (i5u) mwkVar : null;
                            if (i5uVar != null && (x1uVar = i5uVar.a) != null) {
                                str2 = x1uVar.a;
                            }
                            m6u m6uVar = new m6u(str2, nvmVar.b, nvmVar.c.longValue());
                            n5uVar.k = 1;
                            if (rjcVar17.emit(m6uVar, n5uVar) == nm6Var17) {
                                break;
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
                n5uVar = new n5u(this, continuation);
                Object obj192 = n5uVar.j;
                nm6 nm6Var172 = nm6.a;
                i17 = n5uVar.k;
                if (i17 != 0) {
                }
                break;
            case 17:
                if (continuation instanceof o5u) {
                    o5uVar = (o5u) continuation;
                    int i50 = o5uVar.k;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        o5uVar.k = i50 - Integer.MIN_VALUE;
                        Object obj20 = o5uVar.j;
                        nm6 nm6Var18 = nm6.a;
                        i18 = o5uVar.k;
                        if (i18 != 0) {
                            qgg.h0(obj20);
                            rjc rjcVar18 = this.b;
                            Boolean valueOf2 = Boolean.valueOf(p6g.A((e6l) obj));
                            o5uVar.k = 1;
                            if (rjcVar18.emit(valueOf2, o5uVar) == nm6Var18) {
                                break;
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
                o5uVar = new o5u(this, continuation);
                Object obj202 = o5uVar.j;
                nm6 nm6Var182 = nm6.a;
                i18 = o5uVar.k;
                if (i18 != 0) {
                }
            case 18:
                if (continuation instanceof p5u) {
                    p5uVar = (p5u) continuation;
                    int i51 = p5uVar.k;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        p5uVar.k = i51 - Integer.MIN_VALUE;
                        Object obj21 = p5uVar.j;
                        nm6 nm6Var19 = nm6.a;
                        i19 = p5uVar.k;
                        if (i19 != 0) {
                            qgg.h0(obj21);
                            rjc rjcVar19 = this.b;
                            Boolean valueOf3 = Boolean.valueOf(p6g.C((e6l) obj));
                            p5uVar.k = 1;
                            if (rjcVar19.emit(valueOf3, p5uVar) == nm6Var19) {
                                break;
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
                p5uVar = new p5u(this, continuation);
                Object obj212 = p5uVar.j;
                nm6 nm6Var192 = nm6.a;
                i19 = p5uVar.k;
                if (i19 != 0) {
                }
            case 19:
                if (continuation instanceof q5u) {
                    q5uVar = (q5u) continuation;
                    int i52 = q5uVar.k;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        q5uVar.k = i52 - Integer.MIN_VALUE;
                        Object obj23 = q5uVar.j;
                        nm6 nm6Var20 = nm6.a;
                        i20 = q5uVar.k;
                        if (i20 != 0) {
                            qgg.h0(obj23);
                            rjc rjcVar20 = this.b;
                            if (!((List) ((Pair) obj).a).isEmpty()) {
                                q5uVar.k = 1;
                                if (rjcVar20.emit(obj, q5uVar) == nm6Var20) {
                                    break;
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
                q5uVar = new q5u(this, continuation);
                Object obj232 = q5uVar.j;
                nm6 nm6Var202 = nm6.a;
                i20 = q5uVar.k;
                if (i20 != 0) {
                }
            case 20:
                if (continuation instanceof r5u) {
                    r5uVar = (r5u) continuation;
                    int i53 = r5uVar.k;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        r5uVar.k = i53 - Integer.MIN_VALUE;
                        Object obj24 = r5uVar.j;
                        nm6 nm6Var21 = nm6.a;
                        i21 = r5uVar.k;
                        if (i21 != 0) {
                            qgg.h0(obj24);
                            rjc rjcVar21 = this.b;
                            if (obj instanceof u7u) {
                                r5uVar.k = 1;
                                if (rjcVar21.emit(obj, r5uVar) == nm6Var21) {
                                    break;
                                }
                            }
                        } else if (i21 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj24);
                        }
                        break;
                    }
                }
                r5uVar = new r5u(this, continuation);
                Object obj242 = r5uVar.j;
                nm6 nm6Var212 = nm6.a;
                i21 = r5uVar.k;
                if (i21 != 0) {
                }
            case 21:
                if (continuation instanceof s5u) {
                    s5uVar = (s5u) continuation;
                    int i54 = s5uVar.k;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        s5uVar.k = i54 - Integer.MIN_VALUE;
                        Object obj25 = s5uVar.j;
                        nm6 nm6Var22 = nm6.a;
                        i22 = s5uVar.k;
                        if (i22 != 0) {
                            qgg.h0(obj25);
                            rjc rjcVar22 = this.b;
                            n7q n7qVar3 = ((d6l) obj).a;
                            s5uVar.k = 1;
                            if (rjcVar22.emit(n7qVar3, s5uVar) == nm6Var22) {
                                break;
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
                s5uVar = new s5u(this, continuation);
                Object obj252 = s5uVar.j;
                nm6 nm6Var222 = nm6.a;
                i22 = s5uVar.k;
                if (i22 != 0) {
                }
            case 22:
                if (continuation instanceof t5u) {
                    t5uVar = (t5u) continuation;
                    int i55 = t5uVar.k;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        t5uVar.k = i55 - Integer.MIN_VALUE;
                        Object obj26 = t5uVar.j;
                        nm6 nm6Var23 = nm6.a;
                        i23 = t5uVar.k;
                        if (i23 != 0) {
                            qgg.h0(obj26);
                            rjc rjcVar23 = this.b;
                            u7u u7uVar = (u7u) obj;
                            ArrayList arrayList3 = u7uVar.g;
                            ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(((i5u) it2.next()).a);
                            }
                            Pair pair2 = new Pair(arrayList4, new Integer(u7uVar.i));
                            t5uVar.k = 1;
                            if (rjcVar23.emit(pair2, t5uVar) == nm6Var23) {
                                break;
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
                t5uVar = new t5u(this, continuation);
                Object obj262 = t5uVar.j;
                nm6 nm6Var232 = nm6.a;
                i23 = t5uVar.k;
                if (i23 != 0) {
                }
            case 23:
                if (continuation instanceof u5u) {
                    u5uVar = (u5u) continuation;
                    int i56 = u5uVar.k;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        u5uVar.k = i56 - Integer.MIN_VALUE;
                        Object obj27 = u5uVar.j;
                        nm6 nm6Var24 = nm6.a;
                        i24 = u5uVar.k;
                        if (i24 != 0) {
                            qgg.h0(obj27);
                            rjc rjcVar24 = this.b;
                            if (obj instanceof d6l) {
                                u5uVar.k = 1;
                                if (rjcVar24.emit(obj, u5uVar) == nm6Var24) {
                                    break;
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
                u5uVar = new u5u(this, continuation);
                Object obj272 = u5uVar.j;
                nm6 nm6Var242 = nm6.a;
                i24 = u5uVar.k;
                if (i24 != 0) {
                }
            case 24:
                if (continuation instanceof v5u) {
                    v5uVar = (v5u) continuation;
                    int i57 = v5uVar.k;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        v5uVar.k = i57 - Integer.MIN_VALUE;
                        Object obj28 = v5uVar.j;
                        nm6 nm6Var25 = nm6.a;
                        i25 = v5uVar.k;
                        if (i25 != 0) {
                            qgg.h0(obj28);
                            rjc rjcVar25 = this.b;
                            int ordinal = ((d6l) obj).c.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1 && ordinal != 2) {
                                    if (ordinal != 3) {
                                        b6e.s();
                                        break;
                                    } else {
                                        k6uVar = k6u.b;
                                    }
                                } else {
                                    k6uVar = k6u.a;
                                }
                            }
                            if (k6uVar != null) {
                                v5uVar.k = 1;
                                if (rjcVar25.emit(k6uVar, v5uVar) == nm6Var25) {
                                    break;
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
                v5uVar = new v5u(this, continuation);
                Object obj282 = v5uVar.j;
                nm6 nm6Var252 = nm6.a;
                i25 = v5uVar.k;
                if (i25 != 0) {
                }
                break;
            case 25:
                if (continuation instanceof o6u) {
                    o6uVar = (o6u) continuation;
                    int i58 = o6uVar.k;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        o6uVar.k = i58 - Integer.MIN_VALUE;
                        Object obj29 = o6uVar.j;
                        nm6 nm6Var26 = nm6.a;
                        i26 = o6uVar.k;
                        if (i26 != 0) {
                            qgg.h0(obj29);
                            rjc rjcVar26 = this.b;
                            g4q g4qVar = (g4q) obj;
                            if (g4qVar != null && (w = pcg.w(g4qVar)) != null && (n7qVar = w.a) != null) {
                                z = ((Boolean) wdg.A(n7qVar, b2c.s)).booleanValue();
                            }
                            Boolean valueOf4 = Boolean.valueOf(z);
                            o6uVar.k = 1;
                            if (rjcVar26.emit(valueOf4, o6uVar) == nm6Var26) {
                                break;
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
                o6uVar = new o6u(this, continuation);
                Object obj292 = o6uVar.j;
                nm6 nm6Var262 = nm6.a;
                i26 = o6uVar.k;
                if (i26 != 0) {
                }
                break;
            case 26:
                if (continuation instanceof x6u) {
                    x6uVar = (x6u) continuation;
                    int i59 = x6uVar.k;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        x6uVar.k = i59 - Integer.MIN_VALUE;
                        Object obj30 = x6uVar.j;
                        nm6 nm6Var27 = nm6.a;
                        i27 = x6uVar.k;
                        if (i27 != 0) {
                            qgg.h0(obj30);
                            rjc rjcVar27 = this.b;
                            rgn rgnVar = (rgn) obj;
                            rgnVar.getClass();
                            if (!rgnVar.equals(ngn.a)) {
                                if (!(rgnVar instanceof ogn)) {
                                    if (!(rgnVar instanceof pgn)) {
                                        if (!rgnVar.equals(qgn.a)) {
                                            if (!(rgnVar instanceof mgn)) {
                                                b6e.s();
                                                break;
                                            } else {
                                                g7uVar = new g7u(((mgn) rgnVar).a);
                                            }
                                        } else {
                                            g7uVar = k7u.a;
                                        }
                                    } else {
                                        pgn pgnVar = (pgn) rgnVar;
                                        f7u f7uVar = pgnVar.b;
                                        String str3 = pgnVar.a;
                                        f7u f7uVar2 = f7uVar.g() ? f7uVar : null;
                                        s7u d = f7uVar2 != null ? f7uVar2.d() : null;
                                        s7u c = f7uVar.c();
                                        f7u f7uVar3 = f7uVar.f() ? f7uVar : null;
                                        if (f7uVar3 != null) {
                                            if (!f7uVar3.f()) {
                                                xq0.q("Queue does not contain pending item");
                                                break;
                                            } else {
                                                s7uVar = (s7u) f7uVar3.b.get(f7uVar3.c.a + 1);
                                            }
                                        }
                                        g7uVar = new j7u(str3, d, c, s7uVar, f7uVar, pgnVar.d);
                                    }
                                } else {
                                    ogn ognVar = (ogn) rgnVar;
                                    f7u f7uVar4 = ognVar.b;
                                    String str4 = ognVar.a;
                                    f7u f7uVar5 = f7uVar4.g() ? f7uVar4 : null;
                                    g7uVar = new i7u(str4, f7uVar5 != null ? f7uVar5.d() : null, f7uVar4);
                                }
                            } else {
                                g7uVar = h7u.a;
                            }
                            x6uVar.k = 1;
                            if (rjcVar27.emit(g7uVar, x6uVar) == nm6Var27) {
                                break;
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
                x6uVar = new x6u(this, continuation);
                Object obj302 = x6uVar.j;
                nm6 nm6Var272 = nm6.a;
                i27 = x6uVar.k;
                if (i27 != 0) {
                }
            case 27:
                if (continuation instanceof g9u) {
                    g9uVar = (g9u) continuation;
                    int i60 = g9uVar.k;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        g9uVar.k = i60 - Integer.MIN_VALUE;
                        Object obj31 = g9uVar.j;
                        nm6 nm6Var28 = nm6.a;
                        i28 = g9uVar.k;
                        if (i28 != 0) {
                            qgg.h0(obj31);
                            rjc rjcVar28 = this.b;
                            uz7 uz7Var = (uz7) obj;
                            uz7Var.getClass();
                            boolean z2 = uz7Var instanceof tz7;
                            if (!(uz7Var instanceof sz7)) {
                                if (!z2) {
                                    b6e.s();
                                    break;
                                } else {
                                    d74Var = new d74(((tz7) uz7Var).b);
                                }
                            } else {
                                d74Var = new d74(R.drawable.ic_cast_24);
                            }
                            q84 q84Var = new q84(z2, d74Var);
                            g9uVar.k = 1;
                            if (rjcVar28.emit(q84Var, g9uVar) == nm6Var28) {
                                break;
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
                g9uVar = new g9u(this, continuation);
                Object obj312 = g9uVar.j;
                nm6 nm6Var282 = nm6.a;
                i28 = g9uVar.k;
                if (i28 != 0) {
                }
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                if (continuation instanceof h9u) {
                    h9uVar = (h9u) continuation;
                    int i61 = h9uVar.k;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        h9uVar.k = i61 - Integer.MIN_VALUE;
                        Object obj33 = h9uVar.j;
                        nm6 nm6Var29 = nm6.a;
                        i29 = h9uVar.k;
                        if (i29 != 0) {
                            qgg.h0(obj33);
                            rjc rjcVar29 = this.b;
                            Boolean valueOf5 = Boolean.valueOf(((n64) obj).a == v84.a);
                            h9uVar.k = 1;
                            if (rjcVar29.emit(valueOf5, h9uVar) == nm6Var29) {
                                break;
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
                h9uVar = new h9u(this, continuation);
                Object obj332 = h9uVar.j;
                nm6 nm6Var292 = nm6.a;
                i29 = h9uVar.k;
                if (i29 != 0) {
                }
            default:
                if (continuation instanceof aku) {
                    akuVar = (aku) continuation;
                    int i62 = akuVar.k;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        akuVar.k = i62 - Integer.MIN_VALUE;
                        Object obj34 = akuVar.j;
                        nm6 nm6Var30 = nm6.a;
                        i30 = akuVar.k;
                        if (i30 != 0) {
                            qgg.h0(obj34);
                            rjc rjcVar30 = this.b;
                            if (((Boolean) obj).booleanValue()) {
                                akuVar.k = 1;
                                if (rjcVar30.emit(obj, akuVar) == nm6Var30) {
                                    break;
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
                akuVar = new aku(this, continuation);
                Object obj342 = akuVar.j;
                nm6 nm6Var302 = nm6.a;
                i30 = akuVar.k;
                if (i30 != 0) {
                }
        }
        return Unit.a;
    }

    public /* synthetic */ zzs(rjc rjcVar, int i) {
        this.a = i;
        this.b = rjcVar;
    }
}
