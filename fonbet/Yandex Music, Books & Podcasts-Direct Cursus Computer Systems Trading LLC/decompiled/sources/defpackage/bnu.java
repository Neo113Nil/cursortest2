package defpackage;

import com.yandex.pulse.metrics.o;
import defpackage.hmm;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bnu implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;

    public /* synthetic */ bnu(rjc rjcVar, int i) {
        this.a = i;
        this.b = rjcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0154  */
    /* JADX WARN: Type inference failed for: r6v126, types: [arf, java.lang.Object] */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        anu anuVar;
        int i;
        dqu dquVar;
        int i2;
        ktu ktuVar;
        int i3;
        quu quuVar;
        int i4;
        ruu ruuVar;
        int i5;
        yuu yuuVar;
        int i6;
        gvu gvuVar;
        int i7;
        hvu hvuVar;
        int i8;
        i0v i0vVar;
        int i9;
        k0v k0vVar;
        int i10;
        n0v n0vVar;
        int i11;
        n7q n7qVar;
        e3v e3vVar;
        int i12;
        n4v n4vVar;
        int i13;
        o4v o4vVar;
        int i14;
        p4v p4vVar;
        int i15;
        q4v q4vVar;
        int i16;
        fav favVar;
        int i17;
        w6v w6vVar;
        int i18;
        x6v x6vVar;
        int i19;
        c7v c7vVar;
        int i20;
        d7v d7vVar;
        int i21;
        f7v f7vVar;
        int i22;
        k8v k8vVar;
        int i23;
        nhv nhvVar;
        int i24;
        ohv ohvVar;
        int i25;
        phv phvVar;
        int i26;
        rhv rhvVar;
        int i27;
        n7q n7qVar2;
        shv shvVar;
        int i28;
        Object obj2;
        znv znvVar;
        int i29;
        uht uhtVar;
        fov fovVar;
        int i30;
        l9q l9qVar;
        lov lovVar;
        int i31;
        switch (this.a) {
            case 0:
                if (continuation instanceof anu) {
                    anuVar = (anu) continuation;
                    int i32 = anuVar.k;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        anuVar.k = i32 - Integer.MIN_VALUE;
                        Object obj3 = anuVar.j;
                        nm6 nm6Var = nm6.a;
                        i = anuVar.k;
                        if (i != 0) {
                            qgg.h0(obj3);
                            d6l x = p6g.x((e6l) obj);
                            n7q n7qVar3 = x != null ? x.a : null;
                            anuVar.k = 1;
                            if (this.b.emit(n7qVar3, anuVar) == nm6Var) {
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
                anuVar = new anu(this, continuation);
                Object obj32 = anuVar.j;
                nm6 nm6Var2 = nm6.a;
                i = anuVar.k;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof dqu) {
                    dquVar = (dqu) continuation;
                    int i33 = dquVar.k;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        dquVar.k = i33 - Integer.MIN_VALUE;
                        Object obj4 = dquVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = dquVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj4);
                            cqu cquVar = (cqu) obj;
                            wjb E = cquVar instanceof bqu ? asq.E(cquVar) : null;
                            dquVar.k = 1;
                            if (this.b.emit(E, dquVar) == nm6Var3) {
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
                dquVar = new dqu(this, continuation);
                Object obj42 = dquVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = dquVar.k;
                if (i2 != 0) {
                }
                break;
            case 2:
                if (continuation instanceof ktu) {
                    ktuVar = (ktu) continuation;
                    int i34 = ktuVar.k;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        ktuVar.k = i34 - Integer.MIN_VALUE;
                        Object obj5 = ktuVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = ktuVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj5);
                            Boolean valueOf = Boolean.valueOf(Intrinsics.d((d9m) obj, b9m.a));
                            ktuVar.k = 1;
                            if (this.b.emit(valueOf, ktuVar) == nm6Var4) {
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
                ktuVar = new ktu(this, continuation);
                Object obj52 = ktuVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = ktuVar.k;
                if (i3 != 0) {
                }
                break;
            case 3:
                if (continuation instanceof quu) {
                    quuVar = (quu) continuation;
                    int i35 = quuVar.k;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        quuVar.k = i35 - Integer.MIN_VALUE;
                        Object obj6 = quuVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = quuVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj6);
                            n7q n7qVar4 = (n7q) obj;
                            Boolean valueOf2 = Boolean.valueOf((n7qVar4 != null ? (mwk) wdg.A(n7qVar4, new kjn(25)) : null) != null);
                            quuVar.k = 1;
                            if (this.b.emit(valueOf2, quuVar) == nm6Var5) {
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
                quuVar = new quu(this, continuation);
                Object obj62 = quuVar.j;
                nm6 nm6Var52 = nm6.a;
                i4 = quuVar.k;
                if (i4 != 0) {
                }
                break;
            case 4:
                if (continuation instanceof ruu) {
                    ruuVar = (ruu) continuation;
                    int i36 = ruuVar.k;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        ruuVar.k = i36 - Integer.MIN_VALUE;
                        Object obj7 = ruuVar.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = ruuVar.k;
                        if (i5 != 0) {
                            qgg.h0(obj7);
                            n7q n7qVar5 = ((d6l) obj).a;
                            ruuVar.k = 1;
                            if (this.b.emit(n7qVar5, ruuVar) == nm6Var6) {
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
                ruuVar = new ruu(this, continuation);
                Object obj72 = ruuVar.j;
                nm6 nm6Var62 = nm6.a;
                i5 = ruuVar.k;
                if (i5 != 0) {
                }
                break;
            case 5:
                if (continuation instanceof yuu) {
                    yuuVar = (yuu) continuation;
                    int i37 = yuuVar.k;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        yuuVar.k = i37 - Integer.MIN_VALUE;
                        Object obj8 = yuuVar.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = yuuVar.k;
                        if (i6 != 0) {
                            qgg.h0(obj8);
                            Boolean valueOf3 = Boolean.valueOf(p6g.C((e6l) obj));
                            yuuVar.k = 1;
                            if (this.b.emit(valueOf3, yuuVar) == nm6Var7) {
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
                yuuVar = new yuu(this, continuation);
                Object obj82 = yuuVar.j;
                nm6 nm6Var72 = nm6.a;
                i6 = yuuVar.k;
                if (i6 != 0) {
                }
                break;
            case 6:
                if (continuation instanceof gvu) {
                    gvuVar = (gvu) continuation;
                    int i38 = gvuVar.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        gvuVar.k = i38 - Integer.MIN_VALUE;
                        Object obj9 = gvuVar.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = gvuVar.k;
                        if (i7 != 0) {
                            qgg.h0(obj9);
                            n7q n7qVar6 = (n7q) obj;
                            Boolean valueOf4 = Boolean.valueOf((n7qVar6 != null ? (mwk) wdg.A(n7qVar6, new kjn(25)) : null) != null);
                            gvuVar.k = 1;
                            if (this.b.emit(valueOf4, gvuVar) == nm6Var8) {
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
                gvuVar = new gvu(this, continuation);
                Object obj92 = gvuVar.j;
                nm6 nm6Var82 = nm6.a;
                i7 = gvuVar.k;
                if (i7 != 0) {
                }
                break;
            case 7:
                if (continuation instanceof hvu) {
                    hvuVar = (hvu) continuation;
                    int i39 = hvuVar.k;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        hvuVar.k = i39 - Integer.MIN_VALUE;
                        Object obj10 = hvuVar.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = hvuVar.k;
                        if (i8 != 0) {
                            qgg.h0(obj10);
                            n7q n7qVar7 = ((d6l) obj).a;
                            hvuVar.k = 1;
                            if (this.b.emit(n7qVar7, hvuVar) == nm6Var9) {
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
                hvuVar = new hvu(this, continuation);
                Object obj102 = hvuVar.j;
                nm6 nm6Var92 = nm6.a;
                i8 = hvuVar.k;
                if (i8 != 0) {
                }
                break;
            case 8:
                if (continuation instanceof i0v) {
                    i0vVar = (i0v) continuation;
                    int i40 = i0vVar.k;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        i0vVar.k = i40 - Integer.MIN_VALUE;
                        Object obj11 = i0vVar.j;
                        nm6 nm6Var10 = nm6.a;
                        i9 = i0vVar.k;
                        if (i9 != 0) {
                            qgg.h0(obj11);
                            if (((Boolean) obj).booleanValue()) {
                                i0vVar.k = 1;
                                if (this.b.emit(obj, i0vVar) == nm6Var10) {
                                }
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
                i0vVar = new i0v(this, continuation);
                Object obj112 = i0vVar.j;
                nm6 nm6Var102 = nm6.a;
                i9 = i0vVar.k;
                if (i9 != 0) {
                }
                break;
            case 9:
                if (continuation instanceof k0v) {
                    k0vVar = (k0v) continuation;
                    int i41 = k0vVar.k;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        k0vVar.k = i41 - Integer.MIN_VALUE;
                        Object obj12 = k0vVar.j;
                        nm6 nm6Var11 = nm6.a;
                        i10 = k0vVar.k;
                        if (i10 != 0) {
                            qgg.h0(obj12);
                            Boolean valueOf5 = Boolean.valueOf(p6g.C((e6l) obj));
                            k0vVar.k = 1;
                            if (this.b.emit(valueOf5, k0vVar) == nm6Var11) {
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
                k0vVar = new k0v(this, continuation);
                Object obj122 = k0vVar.j;
                nm6 nm6Var112 = nm6.a;
                i10 = k0vVar.k;
                if (i10 != 0) {
                }
                break;
            case 10:
                if (continuation instanceof n0v) {
                    n0vVar = (n0v) continuation;
                    int i42 = n0vVar.k;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        n0vVar.k = i42 - Integer.MIN_VALUE;
                        Object obj13 = n0vVar.j;
                        nm6 nm6Var12 = nm6.a;
                        i11 = n0vVar.k;
                        if (i11 != 0) {
                            qgg.h0(obj13);
                            d6l x2 = p6g.x((e6l) obj);
                            mwk mwkVar = (x2 == null || (n7qVar = x2.a) == null) ? null : (mwk) wdg.A(n7qVar, mvn.d);
                            if (mwkVar != null) {
                                n0vVar.k = 1;
                                if (this.b.emit(mwkVar, n0vVar) == nm6Var12) {
                                }
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
                n0vVar = new n0v(this, continuation);
                Object obj132 = n0vVar.j;
                nm6 nm6Var122 = nm6.a;
                i11 = n0vVar.k;
                if (i11 != 0) {
                }
                break;
            case 11:
                if (continuation instanceof e3v) {
                    e3vVar = (e3v) continuation;
                    int i43 = e3vVar.k;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        e3vVar.k = i43 - Integer.MIN_VALUE;
                        Object obj14 = e3vVar.j;
                        nm6 nm6Var13 = nm6.a;
                        i12 = e3vVar.k;
                        if (i12 != 0) {
                            qgg.h0(obj14);
                            g3v g3vVar = (g3v) obj;
                            c3v c3vVar = g3vVar == null ? null : new c3v(g3vVar.c, g3vVar.a, g3vVar.b);
                            e3vVar.k = 1;
                            if (this.b.emit(c3vVar, e3vVar) == nm6Var13) {
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
                e3vVar = new e3v(this, continuation);
                Object obj142 = e3vVar.j;
                nm6 nm6Var132 = nm6.a;
                i12 = e3vVar.k;
                if (i12 != 0) {
                }
                break;
            case 12:
                if (continuation instanceof n4v) {
                    n4vVar = (n4v) continuation;
                    int i44 = n4vVar.k;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        n4vVar.k = i44 - Integer.MIN_VALUE;
                        Object obj15 = n4vVar.j;
                        nm6 nm6Var14 = nm6.a;
                        i13 = n4vVar.k;
                        if (i13 != 0) {
                            qgg.h0(obj15);
                            Boolean valueOf6 = Boolean.valueOf(((x66) obj).a);
                            n4vVar.k = 1;
                            if (this.b.emit(valueOf6, n4vVar) == nm6Var14) {
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
                n4vVar = new n4v(this, continuation);
                Object obj152 = n4vVar.j;
                nm6 nm6Var142 = nm6.a;
                i13 = n4vVar.k;
                if (i13 != 0) {
                }
                break;
            case 13:
                if (continuation instanceof o4v) {
                    o4vVar = (o4v) continuation;
                    int i45 = o4vVar.k;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        o4vVar.k = i45 - Integer.MIN_VALUE;
                        Object obj16 = o4vVar.j;
                        nm6 nm6Var15 = nm6.a;
                        i14 = o4vVar.k;
                        if (i14 != 0) {
                            qgg.h0(obj16);
                            fav O = vq2.O((n9v) obj);
                            o4vVar.k = 1;
                            if (this.b.emit(O, o4vVar) == nm6Var15) {
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
                o4vVar = new o4v(this, continuation);
                Object obj162 = o4vVar.j;
                nm6 nm6Var152 = nm6.a;
                i14 = o4vVar.k;
                if (i14 != 0) {
                }
                break;
            case 14:
                if (continuation instanceof p4v) {
                    p4vVar = (p4v) continuation;
                    int i46 = p4vVar.k;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        p4vVar.k = i46 - Integer.MIN_VALUE;
                        Object obj17 = p4vVar.j;
                        nm6 nm6Var16 = nm6.a;
                        i15 = p4vVar.k;
                        if (i15 != 0) {
                            qgg.h0(obj17);
                            p4vVar.k = 1;
                            if (this.b.emit((k7v) obj, p4vVar) == nm6Var16) {
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
                p4vVar = new p4v(this, continuation);
                Object obj172 = p4vVar.j;
                nm6 nm6Var162 = nm6.a;
                i15 = p4vVar.k;
                if (i15 != 0) {
                }
                break;
            case 15:
                if (continuation instanceof q4v) {
                    q4vVar = (q4v) continuation;
                    int i47 = q4vVar.k;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        q4vVar.k = i47 - Integer.MIN_VALUE;
                        Object obj18 = q4vVar.j;
                        nm6 nm6Var17 = nm6.a;
                        i16 = q4vVar.k;
                        if (i16 != 0) {
                            qgg.h0(obj18);
                            favVar = (fav) obj;
                            q4vVar.m = favVar;
                            i17 = 0;
                            q4vVar.n = 0;
                            q4vVar.k = 1;
                            if (this.b.emit(favVar, q4vVar) == nm6Var17) {
                            }
                        } else if (i16 == 1) {
                            i17 = q4vVar.n;
                            favVar = q4vVar.m;
                            qgg.h0(obj18);
                        } else if (i16 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj18);
                            break;
                        }
                        if (favVar instanceof bav) {
                            q4vVar.m = null;
                            q4vVar.n = i17;
                            q4vVar.k = 2;
                            if (y2x.o(2400L, q4vVar) == nm6Var17) {
                            }
                        }
                    }
                }
                q4vVar = new q4v(this, continuation);
                Object obj182 = q4vVar.j;
                nm6 nm6Var172 = nm6.a;
                i16 = q4vVar.k;
                if (i16 != 0) {
                }
                if (favVar instanceof bav) {
                }
                break;
            case 16:
                if (continuation instanceof w6v) {
                    w6vVar = (w6v) continuation;
                    int i48 = w6vVar.k;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        w6vVar.k = i48 - Integer.MIN_VALUE;
                        Object obj19 = w6vVar.j;
                        nm6 nm6Var18 = nm6.a;
                        i18 = w6vVar.k;
                        if (i18 != 0) {
                            qgg.h0(obj19);
                            n7q n7qVar8 = ((d6l) obj).a;
                            w6vVar.k = 1;
                            if (this.b.emit(n7qVar8, w6vVar) == nm6Var18) {
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
                w6vVar = new w6v(this, continuation);
                Object obj192 = w6vVar.j;
                nm6 nm6Var182 = nm6.a;
                i18 = w6vVar.k;
                if (i18 != 0) {
                }
                break;
            case 17:
                if (continuation instanceof x6v) {
                    x6vVar = (x6v) continuation;
                    int i49 = x6vVar.k;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        x6vVar.k = i49 - Integer.MIN_VALUE;
                        Object obj20 = x6vVar.j;
                        nm6 nm6Var19 = nm6.a;
                        i19 = x6vVar.k;
                        if (i19 != 0) {
                            qgg.h0(obj20);
                            n7q n7qVar9 = (n7q) obj;
                            san sanVar = san.j;
                            n7qVar9.getClass();
                            vbn vbnVar = (vbn) wdg.A(n7qVar9, new qzc(26, sanVar));
                            x6vVar.k = 1;
                            if (this.b.emit(vbnVar, x6vVar) == nm6Var19) {
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
                x6vVar = new x6v(this, continuation);
                Object obj202 = x6vVar.j;
                nm6 nm6Var192 = nm6.a;
                i19 = x6vVar.k;
                if (i19 != 0) {
                }
                break;
            case 18:
                if (continuation instanceof c7v) {
                    c7vVar = (c7v) continuation;
                    int i50 = c7vVar.k;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        c7vVar.k = i50 - Integer.MIN_VALUE;
                        Object obj21 = c7vVar.j;
                        nm6 nm6Var20 = nm6.a;
                        i20 = c7vVar.k;
                        if (i20 != 0) {
                            qgg.h0(obj21);
                            Boolean valueOf7 = Boolean.valueOf(((a7v) obj).l);
                            c7vVar.k = 1;
                            if (this.b.emit(valueOf7, c7vVar) == nm6Var20) {
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
                c7vVar = new c7v(this, continuation);
                Object obj212 = c7vVar.j;
                nm6 nm6Var202 = nm6.a;
                i20 = c7vVar.k;
                if (i20 != 0) {
                }
                break;
            case 19:
                if (continuation instanceof d7v) {
                    d7vVar = (d7v) continuation;
                    int i51 = d7vVar.k;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        d7vVar.k = i51 - Integer.MIN_VALUE;
                        Object obj22 = d7vVar.j;
                        nm6 nm6Var21 = nm6.a;
                        i21 = d7vVar.k;
                        if (i21 != 0) {
                            qgg.h0(obj22);
                            Boolean valueOf8 = Boolean.valueOf(((a7v) obj).k);
                            d7vVar.k = 1;
                            if (this.b.emit(valueOf8, d7vVar) == nm6Var21) {
                            }
                        } else if (i21 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj22);
                        }
                        break;
                    }
                }
                d7vVar = new d7v(this, continuation);
                Object obj222 = d7vVar.j;
                nm6 nm6Var212 = nm6.a;
                i21 = d7vVar.k;
                if (i21 != 0) {
                }
                break;
            case 20:
                if (continuation instanceof f7v) {
                    f7vVar = (f7v) continuation;
                    int i52 = f7vVar.k;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        f7vVar.k = i52 - Integer.MIN_VALUE;
                        Object obj23 = f7vVar.j;
                        nm6 nm6Var22 = nm6.a;
                        i22 = f7vVar.k;
                        if (i22 != 0) {
                            qgg.h0(obj23);
                            a7v a7vVar = (a7v) obj;
                            a7vVar.getClass();
                            x7v x7vVar = a7vVar.j ? x7v.a : x7v.b;
                            f7vVar.k = 1;
                            if (this.b.emit(x7vVar, f7vVar) == nm6Var22) {
                            }
                        } else if (i22 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj23);
                        }
                        break;
                    }
                }
                f7vVar = new f7v(this, continuation);
                Object obj232 = f7vVar.j;
                nm6 nm6Var222 = nm6.a;
                i22 = f7vVar.k;
                if (i22 != 0) {
                }
                break;
            case 21:
                if (continuation instanceof k8v) {
                    k8vVar = (k8v) continuation;
                    int i53 = k8vVar.k;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        k8vVar.k = i53 - Integer.MIN_VALUE;
                        Object obj24 = k8vVar.j;
                        nm6 nm6Var23 = nm6.a;
                        i23 = k8vVar.k;
                        if (i23 != 0) {
                            qgg.h0(obj24);
                            yxc yxcVar = (yxc) obj;
                            w8v w8vVar = new w8v(yxcVar != null ? ((List) yxcVar.j.getValue()).contains(vc6.a) : false);
                            k8vVar.k = 1;
                            if (this.b.emit(w8vVar, k8vVar) == nm6Var23) {
                            }
                        } else if (i23 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj24);
                        }
                        break;
                    }
                }
                k8vVar = new k8v(this, continuation);
                Object obj242 = k8vVar.j;
                nm6 nm6Var232 = nm6.a;
                i23 = k8vVar.k;
                if (i23 != 0) {
                }
                break;
            case 22:
                if (continuation instanceof nhv) {
                    nhvVar = (nhv) continuation;
                    int i54 = nhvVar.k;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        nhvVar.k = i54 - Integer.MIN_VALUE;
                        Object obj25 = nhvVar.j;
                        nm6 nm6Var24 = nm6.a;
                        i24 = nhvVar.k;
                        if (i24 != 0) {
                            qgg.h0(obj25);
                            Boolean valueOf9 = Boolean.valueOf(((Number) obj).intValue() > 0);
                            nhvVar.k = 1;
                            if (this.b.emit(valueOf9, nhvVar) == nm6Var24) {
                            }
                        } else if (i24 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj25);
                        }
                        break;
                    }
                }
                nhvVar = new nhv(this, continuation);
                Object obj252 = nhvVar.j;
                nm6 nm6Var242 = nm6.a;
                i24 = nhvVar.k;
                if (i24 != 0) {
                }
                break;
            case 23:
                if (continuation instanceof ohv) {
                    ohvVar = (ohv) continuation;
                    int i55 = ohvVar.k;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        ohvVar.k = i55 - Integer.MIN_VALUE;
                        Object obj26 = ohvVar.j;
                        nm6 nm6Var25 = nm6.a;
                        i25 = ohvVar.k;
                        if (i25 != 0) {
                            qgg.h0(obj26);
                            mwk b = ((d6l) obj).a.b();
                            ohvVar.k = 1;
                            if (this.b.emit(b, ohvVar) == nm6Var25) {
                            }
                        } else if (i25 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj26);
                        }
                        break;
                    }
                }
                ohvVar = new ohv(this, continuation);
                Object obj262 = ohvVar.j;
                nm6 nm6Var252 = nm6.a;
                i25 = ohvVar.k;
                if (i25 != 0) {
                }
                break;
            case 24:
                if (continuation instanceof phv) {
                    phvVar = (phv) continuation;
                    int i56 = phvVar.k;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        phvVar.k = i56 - Integer.MIN_VALUE;
                        Object obj27 = phvVar.j;
                        nm6 nm6Var26 = nm6.a;
                        i26 = phvVar.k;
                        if (i26 != 0) {
                            qgg.h0(obj27);
                            mwk mwkVar2 = (mwk) obj;
                            m6l m6lVar = new m6l(new u5j(o2g.d0(mwkVar2), mwkVar2.a() != null ? !wyf.O(r6) : true));
                            phvVar.k = 1;
                            if (this.b.emit(m6lVar, phvVar) == nm6Var26) {
                            }
                        } else if (i26 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj27);
                        }
                        break;
                    }
                }
                phvVar = new phv(this, continuation);
                Object obj272 = phvVar.j;
                nm6 nm6Var262 = nm6.a;
                i26 = phvVar.k;
                if (i26 != 0) {
                }
                break;
            case 25:
                if (continuation instanceof rhv) {
                    rhvVar = (rhv) continuation;
                    int i57 = rhvVar.k;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        rhvVar.k = i57 - Integer.MIN_VALUE;
                        Object obj28 = rhvVar.j;
                        nm6 nm6Var27 = nm6.a;
                        i27 = rhvVar.k;
                        if (i27 != 0) {
                            qgg.h0(obj28);
                            d6l x3 = p6g.x((e6l) obj);
                            mwk b2 = (x3 == null || (n7qVar2 = x3.a) == null) ? null : n7qVar2.b();
                            rhvVar.k = 1;
                            if (this.b.emit(b2, rhvVar) == nm6Var27) {
                            }
                        } else if (i27 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj28);
                        }
                        break;
                    }
                }
                rhvVar = new rhv(this, continuation);
                Object obj282 = rhvVar.j;
                nm6 nm6Var272 = nm6.a;
                i27 = rhvVar.k;
                if (i27 != 0) {
                }
                break;
            case 26:
                if (continuation instanceof shv) {
                    shvVar = (shv) continuation;
                    int i58 = shvVar.k;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        shvVar.k = i58 - Integer.MIN_VALUE;
                        Object obj29 = shvVar.j;
                        nm6 nm6Var28 = nm6.a;
                        i28 = shvVar.k;
                        if (i28 != 0) {
                            qgg.h0(obj29);
                            mwk mwkVar3 = (mwk) obj;
                            if (mwkVar3 != null) {
                                obj2 = new m6l(new u5j(o2g.d0(mwkVar3), mwkVar3.a() != null ? !wyf.O(r6) : true));
                            } else {
                                obj2 = l6l.a;
                            }
                            shvVar.k = 1;
                            if (this.b.emit(obj2, shvVar) == nm6Var28) {
                            }
                        } else if (i28 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj29);
                        }
                        break;
                    }
                }
                shvVar = new shv(this, continuation);
                Object obj292 = shvVar.j;
                nm6 nm6Var282 = nm6.a;
                i28 = shvVar.k;
                if (i28 != 0) {
                }
                break;
            case 27:
                if (continuation instanceof znv) {
                    znvVar = (znv) continuation;
                    int i59 = znvVar.k;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        znvVar.k = i59 - Integer.MIN_VALUE;
                        Object obj30 = znvVar.j;
                        nm6 nm6Var29 = nm6.a;
                        i29 = znvVar.k;
                        if (i29 != 0) {
                            qgg.h0(obj30);
                            int ordinal = ((l9q) obj).ordinal();
                            if (ordinal == 0) {
                                uhtVar = uht.f;
                            } else if (ordinal != 1) {
                                b6e.s();
                                break;
                            } else {
                                uhtVar = uht.g;
                            }
                            znvVar.k = 1;
                            if (this.b.emit(uhtVar, znvVar) == nm6Var29) {
                            }
                        } else if (i29 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj30);
                            break;
                        }
                    }
                }
                znvVar = new znv(this, continuation);
                Object obj302 = znvVar.j;
                nm6 nm6Var292 = nm6.a;
                i29 = znvVar.k;
                if (i29 != 0) {
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                if (continuation instanceof fov) {
                    fovVar = (fov) continuation;
                    int i60 = fovVar.k;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        fovVar.k = i60 - Integer.MIN_VALUE;
                        Object obj31 = fovVar.j;
                        nm6 nm6Var30 = nm6.a;
                        i30 = fovVar.k;
                        if (i30 != 0) {
                            qgg.h0(obj31);
                            hmm.a aVar = new hmm.a("widget_color_setting");
                            lpi lpiVar = (lpi) ((hmm) obj);
                            lpiVar.getClass();
                            String str = (String) lpiVar.a.get(aVar);
                            if (str != null) {
                                l9q.b.getClass();
                                if (!str.equals("system")) {
                                    if (!str.equals("cover_based")) {
                                        e7o.f(new h2q(4));
                                        break;
                                    } else {
                                        l9qVar = l9q.CoverBased;
                                    }
                                } else {
                                    l9qVar = l9q.System;
                                }
                            } else {
                                l9qVar = null;
                            }
                            fovVar.k = 1;
                            if (this.b.emit(l9qVar, fovVar) == nm6Var30) {
                            }
                        } else if (i30 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj31);
                            break;
                        }
                    }
                }
                fovVar = new fov(this, continuation);
                Object obj312 = fovVar.j;
                nm6 nm6Var302 = nm6.a;
                i30 = fovVar.k;
                if (i30 != 0) {
                }
                break;
            default:
                if (continuation instanceof lov) {
                    lovVar = (lov) continuation;
                    int i61 = lovVar.k;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        lovVar.k = i61 - Integer.MIN_VALUE;
                        Object obj33 = lovVar.j;
                        nm6 nm6Var31 = nm6.a;
                        i31 = lovVar.k;
                        if (i31 != 0) {
                            qgg.h0(obj33);
                            y7q y7qVar = (y7q) obj;
                            Boolean valueOf10 = Boolean.valueOf((y7qVar instanceof w7q) || (y7qVar instanceof x7q));
                            lovVar.k = 1;
                            if (this.b.emit(valueOf10, lovVar) == nm6Var31) {
                            }
                        } else if (i31 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj33);
                        }
                        break;
                    }
                }
                lovVar = new lov(this, continuation);
                Object obj332 = lovVar.j;
                nm6 nm6Var312 = nm6.a;
                i31 = lovVar.k;
                if (i31 != 0) {
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ bnu(rjc rjcVar, Object obj, int i) {
        this.a = i;
        this.b = rjcVar;
    }
}
