package defpackage;

import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class roh implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;

    public /* synthetic */ roh(rjc rjcVar, int i) {
        this.a = i;
        this.b = rjcVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0121, code lost:
    
        if (r7.equals("music-kids-tab") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013c, code lost:
    
        r7 = defpackage.rf3.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0128, code lost:
    
        if (r7.equals("music-podcast-tab") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012f, code lost:
    
        if (r7.equals("music-book-tab") != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0138, code lost:
    
        if (r7.equals("music-trends-tab") == false) goto L68;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x09ff  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x0a0a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018c  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        qoh qohVar;
        int i;
        hvh hvhVar;
        int i2;
        jvh jvhVar;
        int i3;
        lvh lvhVar;
        int i4;
        nvh nvhVar;
        int i5;
        a1i a1iVar;
        int i6;
        n1i n1iVar;
        int i7;
        f2i f2iVar;
        int i8;
        w6i w6iVar;
        int i9;
        a7i a7iVar;
        int i10;
        foi foiVar;
        int i11;
        ori oriVar;
        int i12;
        pri priVar;
        int i13;
        qri qriVar;
        int i14;
        rri rriVar;
        int i15;
        sri sriVar;
        int i16;
        uri uriVar;
        int i17;
        wri wriVar;
        int i18;
        Object jriVar;
        Object hriVar;
        xri xriVar;
        int i19;
        fsi fsiVar;
        int i20;
        lzs lzsVar;
        pvi pviVar;
        int i21;
        zyi zyiVar;
        int i22;
        dzi dziVar;
        int i23;
        r3j r3jVar;
        int i24;
        v6j v6jVar;
        int i25;
        h7j h7jVar;
        int i26;
        cbj cbjVar;
        int i27;
        dbj dbjVar;
        int i28;
        xdj xdjVar;
        int i29;
        zfj zfjVar;
        int i30;
        rf3 rf3Var;
        int i31 = 2;
        boolean z = false;
        z = false;
        int i32 = 1;
        switch (this.a) {
            case 0:
                if (continuation instanceof qoh) {
                    qohVar = (qoh) continuation;
                    int i33 = qohVar.k;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        qohVar.k = i33 - Integer.MIN_VALUE;
                        Object obj2 = qohVar.j;
                        nm6 nm6Var = nm6.a;
                        i = qohVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            rjc rjcVar = this.b;
                            Boolean valueOf = Boolean.valueOf(((e6l) obj) instanceof d6l);
                            qohVar.k = 1;
                            if (rjcVar.emit(valueOf, qohVar) == nm6Var) {
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
                qohVar = new qoh(this, continuation);
                Object obj22 = qohVar.j;
                nm6 nm6Var2 = nm6.a;
                i = qohVar.k;
                if (i != 0) {
                }
            case 1:
                if (continuation instanceof hvh) {
                    hvhVar = (hvh) continuation;
                    int i34 = hvhVar.k;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        hvhVar.k = i34 - Integer.MIN_VALUE;
                        Object obj3 = hvhVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = hvhVar.k;
                        if (i2 == 0) {
                            if (i2 == 1) {
                                qgg.h0(obj3);
                                break;
                            } else {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            qgg.h0(obj3);
                            rjc rjcVar2 = this.b;
                            e6l e6lVar = (e6l) obj;
                            if (!Intrinsics.d(e6lVar, b6l.a) && !(e6lVar instanceof c6l)) {
                                if (e6lVar instanceof d6l) {
                                    z = true;
                                } else {
                                    b6e.s();
                                }
                            }
                            Boolean valueOf2 = Boolean.valueOf(z);
                            hvhVar.k = 1;
                            if (rjcVar2.emit(valueOf2, hvhVar) == nm6Var3) {
                                break;
                            }
                        }
                    }
                }
                hvhVar = new hvh(this, continuation);
                Object obj32 = hvhVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = hvhVar.k;
                if (i2 == 0) {
                }
                break;
            case 2:
                if (continuation instanceof jvh) {
                    jvhVar = (jvh) continuation;
                    int i35 = jvhVar.k;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        jvhVar.k = i35 - Integer.MIN_VALUE;
                        Object obj4 = jvhVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = jvhVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            rjc rjcVar3 = this.b;
                            if (((Boolean) obj).booleanValue()) {
                                jvhVar.k = 1;
                                if (rjcVar3.emit(obj, jvhVar) == nm6Var4) {
                                    break;
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
                jvhVar = new jvh(this, continuation);
                Object obj42 = jvhVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = jvhVar.k;
                if (i3 != 0) {
                }
            case 3:
                if (continuation instanceof lvh) {
                    lvhVar = (lvh) continuation;
                    int i36 = lvhVar.k;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        lvhVar.k = i36 - Integer.MIN_VALUE;
                        Object obj5 = lvhVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = lvhVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj5);
                            rjc rjcVar4 = this.b;
                            Pair pair = (Pair) obj;
                            e6l e6lVar2 = (e6l) pair.a;
                            e6l e6lVar3 = (e6l) pair.b;
                            Boolean valueOf3 = Boolean.valueOf((!(e6lVar2 instanceof d6l) && (e6lVar3 instanceof d6l)) || ((e6lVar3 instanceof d6l) && p6g.C(e6lVar3)));
                            lvhVar.k = 1;
                            if (rjcVar4.emit(valueOf3, lvhVar) == nm6Var5) {
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
                lvhVar = new lvh(this, continuation);
                Object obj52 = lvhVar.j;
                nm6 nm6Var52 = nm6.a;
                i4 = lvhVar.k;
                if (i4 != 0) {
                }
                break;
            case 4:
                if (continuation instanceof nvh) {
                    nvhVar = (nvh) continuation;
                    int i37 = nvhVar.k;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        nvhVar.k = i37 - Integer.MIN_VALUE;
                        Object obj6 = nvhVar.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = nvhVar.k;
                        if (i5 != 0) {
                            qgg.h0(obj6);
                            rjc rjcVar5 = this.b;
                            Boolean valueOf4 = Boolean.valueOf(p6g.C((e6l) obj));
                            nvhVar.k = 1;
                            if (rjcVar5.emit(valueOf4, nvhVar) == nm6Var6) {
                                break;
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
                nvhVar = new nvh(this, continuation);
                Object obj62 = nvhVar.j;
                nm6 nm6Var62 = nm6.a;
                i5 = nvhVar.k;
                if (i5 != 0) {
                }
            case 5:
                if (continuation instanceof a1i) {
                    a1iVar = (a1i) continuation;
                    int i38 = a1iVar.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        a1iVar.k = i38 - Integer.MIN_VALUE;
                        Object obj7 = a1iVar.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = a1iVar.k;
                        if (i6 != 0) {
                            qgg.h0(obj7);
                            rjc rjcVar6 = this.b;
                            v3k E = wxf.E((v3k) obj, new z0i(i31, z ? 1 : 0, null));
                            a1iVar.k = 1;
                            if (rjcVar6.emit(E, a1iVar) == nm6Var7) {
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
                a1iVar = new a1i(this, continuation);
                Object obj72 = a1iVar.j;
                nm6 nm6Var72 = nm6.a;
                i6 = a1iVar.k;
                if (i6 != 0) {
                }
            case 6:
                if (continuation instanceof n1i) {
                    n1iVar = (n1i) continuation;
                    int i39 = n1iVar.k;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        n1iVar.k = i39 - Integer.MIN_VALUE;
                        Object obj8 = n1iVar.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = n1iVar.k;
                        int i40 = 1;
                        if (i7 != 0) {
                            qgg.h0(obj8);
                            rjc rjcVar7 = this.b;
                            v3k E2 = wxf.E((v3k) obj, new z0i(i31, i40, null));
                            n1iVar.k = 1;
                            if (rjcVar7.emit(E2, n1iVar) == nm6Var8) {
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
                n1iVar = new n1i(this, continuation);
                Object obj82 = n1iVar.j;
                nm6 nm6Var82 = nm6.a;
                i7 = n1iVar.k;
                int i402 = 1;
                if (i7 != 0) {
                }
            case 7:
                if (continuation instanceof f2i) {
                    f2iVar = (f2i) continuation;
                    int i41 = f2iVar.k;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        f2iVar.k = i41 - Integer.MIN_VALUE;
                        Object obj9 = f2iVar.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = f2iVar.k;
                        if (i8 != 0) {
                            qgg.h0(obj9);
                            rjc rjcVar8 = this.b;
                            v3k E3 = wxf.E((v3k) obj, new z0i(i31, i31, null));
                            f2iVar.k = 1;
                            if (rjcVar8.emit(E3, f2iVar) == nm6Var9) {
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
                f2iVar = new f2i(this, continuation);
                Object obj92 = f2iVar.j;
                nm6 nm6Var92 = nm6.a;
                i8 = f2iVar.k;
                if (i8 != 0) {
                }
            case 8:
                if (continuation instanceof w6i) {
                    w6iVar = (w6i) continuation;
                    int i42 = w6iVar.k;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        w6iVar.k = i42 - Integer.MIN_VALUE;
                        Object obj10 = w6iVar.j;
                        nm6 nm6Var10 = nm6.a;
                        i9 = w6iVar.k;
                        if (i9 != 0) {
                            qgg.h0(obj10);
                            rjc rjcVar9 = this.b;
                            Boolean valueOf5 = Boolean.valueOf(((x66) obj).b == u0j.a);
                            w6iVar.k = 1;
                            if (rjcVar9.emit(valueOf5, w6iVar) == nm6Var10) {
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
                w6iVar = new w6i(this, continuation);
                Object obj102 = w6iVar.j;
                nm6 nm6Var102 = nm6.a;
                i9 = w6iVar.k;
                if (i9 != 0) {
                }
            case 9:
                if (continuation instanceof a7i) {
                    a7iVar = (a7i) continuation;
                    int i43 = a7iVar.k;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        a7iVar.k = i43 - Integer.MIN_VALUE;
                        Object obj11 = a7iVar.j;
                        nm6 nm6Var11 = nm6.a;
                        i10 = a7iVar.k;
                        if (i10 != 0) {
                            qgg.h0(obj11);
                            rjc rjcVar10 = this.b;
                            v3k v3kVar = (v3k) obj;
                            t81 t81Var = new t81(3, 11, (Continuation) null);
                            v3kVar.getClass();
                            pjc pjcVar = v3kVar.a;
                            pjcVar.getClass();
                            v3k v3kVar2 = new v3k(new ail(18, pjcVar, new tgp(1, new cle((pyc) t81Var, (Continuation) null, 17))), v3kVar.b, v3kVar.c, xuj.v);
                            a7iVar.k = 1;
                            if (rjcVar10.emit(v3kVar2, a7iVar) == nm6Var11) {
                                break;
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
                a7iVar = new a7i(this, continuation);
                Object obj112 = a7iVar.j;
                nm6 nm6Var112 = nm6.a;
                i10 = a7iVar.k;
                if (i10 != 0) {
                }
            case 10:
                if (continuation instanceof foi) {
                    foiVar = (foi) continuation;
                    int i44 = foiVar.k;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        foiVar.k = i44 - Integer.MIN_VALUE;
                        Object obj12 = foiVar.j;
                        nm6 nm6Var12 = nm6.a;
                        i11 = foiVar.k;
                        if (i11 != 0) {
                            qgg.h0(obj12);
                            rjc rjcVar11 = this.b;
                            Boolean bool = (Boolean) obj;
                            bool.getClass();
                            foiVar.k = 1;
                            if (rjcVar11.emit(bool, foiVar) == nm6Var12) {
                                break;
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
                foiVar = new foi(this, continuation);
                Object obj122 = foiVar.j;
                nm6 nm6Var122 = nm6.a;
                i11 = foiVar.k;
                if (i11 != 0) {
                }
            case 11:
                if (continuation instanceof ori) {
                    oriVar = (ori) continuation;
                    int i45 = oriVar.k;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        oriVar.k = i45 - Integer.MIN_VALUE;
                        Object obj13 = oriVar.j;
                        nm6 nm6Var13 = nm6.a;
                        i12 = oriVar.k;
                        if (i12 != 0) {
                            qgg.h0(obj13);
                            rjc rjcVar12 = this.b;
                            mqs a = ((d6l) obj).a.b().a();
                            if (a != null) {
                                oriVar.k = 1;
                                if (rjcVar12.emit(a, oriVar) == nm6Var13) {
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
                oriVar = new ori(this, continuation);
                Object obj132 = oriVar.j;
                nm6 nm6Var132 = nm6.a;
                i12 = oriVar.k;
                if (i12 != 0) {
                }
            case 12:
                if (continuation instanceof pri) {
                    priVar = (pri) continuation;
                    int i46 = priVar.k;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        priVar.k = i46 - Integer.MIN_VALUE;
                        Object obj14 = priVar.j;
                        nm6 nm6Var14 = nm6.a;
                        i13 = priVar.k;
                        if (i13 != 0) {
                            qgg.h0(obj14);
                            rjc rjcVar13 = this.b;
                            n7q n7qVar = (n7q) obj;
                            n7qVar.getClass();
                            mqs a2 = n7qVar.b().a();
                            if (a2 != null && a4g.D(gys.MyMusic, a2) && !a2.A) {
                                priVar.k = 1;
                                if (rjcVar13.emit(obj, priVar) == nm6Var14) {
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
                priVar = new pri(this, continuation);
                Object obj142 = priVar.j;
                nm6 nm6Var142 = nm6.a;
                i13 = priVar.k;
                if (i13 != 0) {
                }
                break;
            case 13:
                if (continuation instanceof qri) {
                    qriVar = (qri) continuation;
                    int i47 = qriVar.k;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        qriVar.k = i47 - Integer.MIN_VALUE;
                        Object obj15 = qriVar.j;
                        nm6 nm6Var15 = nm6.a;
                        i14 = qriVar.k;
                        if (i14 != 0) {
                            qgg.h0(obj15);
                            rjc rjcVar14 = this.b;
                            n7q n7qVar2 = ((d6l) obj).a;
                            qriVar.k = 1;
                            if (rjcVar14.emit(n7qVar2, qriVar) == nm6Var15) {
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
                qriVar = new qri(this, continuation);
                Object obj152 = qriVar.j;
                nm6 nm6Var152 = nm6.a;
                i14 = qriVar.k;
                if (i14 != 0) {
                }
            case 14:
                if (continuation instanceof rri) {
                    rriVar = (rri) continuation;
                    int i48 = rriVar.k;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        rriVar.k = i48 - Integer.MIN_VALUE;
                        Object obj16 = rriVar.j;
                        nm6 nm6Var16 = nm6.a;
                        i15 = rriVar.k;
                        if (i15 != 0) {
                            qgg.h0(obj16);
                            rjc rjcVar15 = this.b;
                            n7q n7qVar3 = (n7q) obj;
                            n7qVar3.getClass();
                            pbj pbjVar = (pbj) wdg.A(n7qVar3, new o6m(5));
                            rriVar.k = 1;
                            if (rjcVar15.emit(pbjVar, rriVar) == nm6Var16) {
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
                rriVar = new rri(this, continuation);
                Object obj162 = rriVar.j;
                nm6 nm6Var162 = nm6.a;
                i15 = rriVar.k;
                if (i15 != 0) {
                }
            case 15:
                if (continuation instanceof sri) {
                    sriVar = (sri) continuation;
                    int i49 = sriVar.k;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        sriVar.k = i49 - Integer.MIN_VALUE;
                        Object obj17 = sriVar.j;
                        Object obj18 = nm6.a;
                        i16 = sriVar.k;
                        if (i16 != 0) {
                            qgg.h0(obj17);
                            rjc rjcVar16 = this.b;
                            d6l x = p6g.x((e6l) obj);
                            Object obj19 = x != null ? x.a : null;
                            sriVar.k = 1;
                            if (rjcVar16.emit(obj19, sriVar) == obj18) {
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
                sriVar = new sri(this, continuation);
                Object obj172 = sriVar.j;
                Object obj182 = nm6.a;
                i16 = sriVar.k;
                if (i16 != 0) {
                }
            case 16:
                if (continuation instanceof uri) {
                    uriVar = (uri) continuation;
                    int i50 = uriVar.k;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        uriVar.k = i50 - Integer.MIN_VALUE;
                        Object obj20 = uriVar.j;
                        nm6 nm6Var17 = nm6.a;
                        i17 = uriVar.k;
                        if (i17 != 0) {
                            qgg.h0(obj20);
                            rjc rjcVar17 = this.b;
                            vri vriVar = new vri(z ? 1 : 0, (Throwable) obj);
                            uriVar.k = 1;
                            if (rjcVar17.emit(vriVar, uriVar) == nm6Var17) {
                                break;
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
                uriVar = new uri(this, continuation);
                Object obj202 = uriVar.j;
                nm6 nm6Var172 = nm6.a;
                i17 = uriVar.k;
                if (i17 != 0) {
                }
            case 17:
                if (continuation instanceof wri) {
                    wriVar = (wri) continuation;
                    int i51 = wriVar.k;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        wriVar.k = i51 - Integer.MIN_VALUE;
                        Object obj21 = wriVar.j;
                        nm6 nm6Var18 = nm6.a;
                        i18 = wriVar.k;
                        if (i18 == 0) {
                            if (i18 == 1) {
                                qgg.h0(obj21);
                                break;
                            } else {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            qgg.h0(obj21);
                            rjc rjcVar18 = this.b;
                            pbj pbjVar2 = (pbj) obj;
                            if (Intrinsics.d(pbjVar2, nbj.a)) {
                                jriVar = gri.a;
                            } else {
                                if (pbjVar2 instanceof lbj) {
                                    lbj lbjVar = (lbj) pbjVar2;
                                    hriVar = new fri(lbjVar.a, lbjVar.b);
                                } else if (pbjVar2 instanceof obj) {
                                    obj objVar = (obj) pbjVar2;
                                    hriVar = new hri(objVar.a, objVar.b);
                                } else if (!(pbjVar2 instanceof mbj)) {
                                    b6e.s();
                                    break;
                                } else {
                                    mbj mbjVar = (mbj) pbjVar2;
                                    mqs mqsVar = mbjVar.b;
                                    if (mbjVar.a instanceof xc5) {
                                        k10 k10Var = mqsVar.d;
                                        k10Var.getClass();
                                        if (u2x.z(m20.AudioBook, k10Var.b)) {
                                            jriVar = new iri(mqsVar.d, mqsVar);
                                        }
                                    }
                                    jriVar = new jri(mqsVar);
                                }
                                jriVar = hriVar;
                            }
                            wriVar.k = 1;
                            if (rjcVar18.emit(jriVar, wriVar) == nm6Var18) {
                                break;
                            }
                        }
                    }
                }
                wriVar = new wri(this, continuation);
                Object obj212 = wriVar.j;
                nm6 nm6Var182 = nm6.a;
                i18 = wriVar.k;
                if (i18 == 0) {
                }
            case 18:
                if (continuation instanceof xri) {
                    xriVar = (xri) continuation;
                    int i52 = xriVar.k;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        xriVar.k = i52 - Integer.MIN_VALUE;
                        Object obj23 = xriVar.j;
                        nm6 nm6Var19 = nm6.a;
                        i19 = xriVar.k;
                        if (i19 != 0) {
                            qgg.h0(obj23);
                            rjc rjcVar19 = this.b;
                            Boolean valueOf6 = Boolean.valueOf(((a8l) obj) == a8l.c);
                            xriVar.k = 1;
                            if (rjcVar19.emit(valueOf6, xriVar) == nm6Var19) {
                                break;
                            }
                        } else if (i19 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj23);
                        }
                        break;
                    }
                }
                xriVar = new xri(this, continuation);
                Object obj232 = xriVar.j;
                nm6 nm6Var192 = nm6.a;
                i19 = xriVar.k;
                if (i19 != 0) {
                }
            case 19:
                if (continuation instanceof fsi) {
                    fsiVar = (fsi) continuation;
                    int i53 = fsiVar.k;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        fsiVar.k = i53 - Integer.MIN_VALUE;
                        Object obj24 = fsiVar.j;
                        nm6 nm6Var20 = nm6.a;
                        i20 = fsiVar.k;
                        if (i20 == 0) {
                            if (i20 == 1) {
                                qgg.h0(obj24);
                                break;
                            } else {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            qgg.h0(obj24);
                            rjc rjcVar20 = this.b;
                            int ordinal = ((lri) obj).ordinal();
                            if (ordinal == 0) {
                                lzsVar = lzs.a;
                            } else if (ordinal == 1) {
                                lzsVar = lzs.b;
                            } else if (ordinal != 2) {
                                b6e.s();
                                break;
                            } else {
                                lzsVar = lzs.c;
                            }
                            fsiVar.k = 1;
                            if (rjcVar20.emit(lzsVar, fsiVar) == nm6Var20) {
                                break;
                            }
                        }
                    }
                }
                fsiVar = new fsi(this, continuation);
                Object obj242 = fsiVar.j;
                nm6 nm6Var202 = nm6.a;
                i20 = fsiVar.k;
                if (i20 == 0) {
                }
            case 20:
                if (continuation instanceof pvi) {
                    pviVar = (pvi) continuation;
                    int i54 = pviVar.k;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        pviVar.k = i54 - Integer.MIN_VALUE;
                        Object obj25 = pviVar.j;
                        nm6 nm6Var21 = nm6.a;
                        i21 = pviVar.k;
                        if (i21 != 0) {
                            qgg.h0(obj25);
                            rjc rjcVar21 = this.b;
                            if (((Boolean) obj).booleanValue()) {
                                pviVar.k = 1;
                                if (rjcVar21.emit(obj, pviVar) == nm6Var21) {
                                    break;
                                }
                            }
                        } else if (i21 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj25);
                        }
                        break;
                    }
                }
                pviVar = new pvi(this, continuation);
                Object obj252 = pviVar.j;
                nm6 nm6Var212 = nm6.a;
                i21 = pviVar.k;
                if (i21 != 0) {
                }
            case 21:
                if (continuation instanceof zyi) {
                    zyiVar = (zyi) continuation;
                    int i55 = zyiVar.k;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        zyiVar.k = i55 - Integer.MIN_VALUE;
                        Object obj26 = zyiVar.j;
                        nm6 nm6Var22 = nm6.a;
                        i22 = zyiVar.k;
                        if (i22 != 0) {
                            qgg.h0(obj26);
                            rjc rjcVar22 = this.b;
                            Boolean valueOf7 = Boolean.valueOf(!((x66) obj).a);
                            zyiVar.k = 1;
                            if (rjcVar22.emit(valueOf7, zyiVar) == nm6Var22) {
                                break;
                            }
                        } else if (i22 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj26);
                        }
                        break;
                    }
                }
                zyiVar = new zyi(this, continuation);
                Object obj262 = zyiVar.j;
                nm6 nm6Var222 = nm6.a;
                i22 = zyiVar.k;
                if (i22 != 0) {
                }
            case 22:
                if (continuation instanceof dzi) {
                    dziVar = (dzi) continuation;
                    int i56 = dziVar.k;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        dziVar.k = i56 - Integer.MIN_VALUE;
                        Object obj27 = dziVar.j;
                        nm6 nm6Var23 = nm6.a;
                        i23 = dziVar.k;
                        if (i23 != 0) {
                            qgg.h0(obj27);
                            rjc rjcVar23 = this.b;
                            u0j u0jVar = ((x66) obj).b;
                            dziVar.k = 1;
                            if (rjcVar23.emit(u0jVar, dziVar) == nm6Var23) {
                                break;
                            }
                        } else if (i23 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj27);
                        }
                        break;
                    }
                }
                dziVar = new dzi(this, continuation);
                Object obj272 = dziVar.j;
                nm6 nm6Var232 = nm6.a;
                i23 = dziVar.k;
                if (i23 != 0) {
                }
            case 23:
                if (continuation instanceof r3j) {
                    r3jVar = (r3j) continuation;
                    int i57 = r3jVar.k;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        r3jVar.k = i57 - Integer.MIN_VALUE;
                        Object obj28 = r3jVar.j;
                        nm6 nm6Var24 = nm6.a;
                        i24 = r3jVar.k;
                        if (i24 != 0) {
                            qgg.h0(obj28);
                            rjc rjcVar24 = this.b;
                            if (obj instanceof w3j) {
                                r3jVar.k = 1;
                                if (rjcVar24.emit(obj, r3jVar) == nm6Var24) {
                                    break;
                                }
                            }
                        } else if (i24 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj28);
                        }
                        break;
                    }
                }
                r3jVar = new r3j(this, continuation);
                Object obj282 = r3jVar.j;
                nm6 nm6Var242 = nm6.a;
                i24 = r3jVar.k;
                if (i24 != 0) {
                }
            case 24:
                if (continuation instanceof v6j) {
                    v6jVar = (v6j) continuation;
                    int i58 = v6jVar.k;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        v6jVar.k = i58 - Integer.MIN_VALUE;
                        Object obj29 = v6jVar.j;
                        nm6 nm6Var25 = nm6.a;
                        i25 = v6jVar.k;
                        if (i25 != 0) {
                            qgg.h0(obj29);
                            rjc rjcVar25 = this.b;
                            u0j u0jVar2 = ((x66) obj).b;
                            v6jVar.k = 1;
                            if (rjcVar25.emit(u0jVar2, v6jVar) == nm6Var25) {
                                break;
                            }
                        } else if (i25 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj29);
                        }
                        break;
                    }
                }
                v6jVar = new v6j(this, continuation);
                Object obj292 = v6jVar.j;
                nm6 nm6Var252 = nm6.a;
                i25 = v6jVar.k;
                if (i25 != 0) {
                }
            case 25:
                if (continuation instanceof h7j) {
                    h7jVar = (h7j) continuation;
                    int i59 = h7jVar.k;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        h7jVar.k = i59 - Integer.MIN_VALUE;
                        Object obj30 = h7jVar.j;
                        nm6 nm6Var26 = nm6.a;
                        i26 = h7jVar.k;
                        if (i26 != 0) {
                            qgg.h0(obj30);
                            rjc rjcVar26 = this.b;
                            Boolean valueOf8 = Boolean.valueOf(!((x66) obj).a);
                            h7jVar.k = 1;
                            if (rjcVar26.emit(valueOf8, h7jVar) == nm6Var26) {
                                break;
                            }
                        } else if (i26 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj30);
                        }
                        break;
                    }
                }
                h7jVar = new h7j(this, continuation);
                Object obj302 = h7jVar.j;
                nm6 nm6Var262 = nm6.a;
                i26 = h7jVar.k;
                if (i26 != 0) {
                }
            case 26:
                if (continuation instanceof cbj) {
                    cbjVar = (cbj) continuation;
                    int i60 = cbjVar.k;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        cbjVar.k = i60 - Integer.MIN_VALUE;
                        Object obj31 = cbjVar.j;
                        nm6 nm6Var27 = nm6.a;
                        i27 = cbjVar.k;
                        if (i27 != 0) {
                            qgg.h0(obj31);
                            rjc rjcVar27 = this.b;
                            if (!Intrinsics.d((cpq) obj, apq.a)) {
                                cbjVar.k = 1;
                                if (rjcVar27.emit(obj, cbjVar) == nm6Var27) {
                                    break;
                                }
                            }
                        } else if (i27 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj31);
                        }
                        break;
                    }
                }
                cbjVar = new cbj(this, continuation);
                Object obj312 = cbjVar.j;
                nm6 nm6Var272 = nm6.a;
                i27 = cbjVar.k;
                if (i27 != 0) {
                }
            case 27:
                if (continuation instanceof dbj) {
                    dbjVar = (dbj) continuation;
                    int i61 = dbjVar.k;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        dbjVar.k = i61 - Integer.MIN_VALUE;
                        Object obj33 = dbjVar.j;
                        nm6 nm6Var28 = nm6.a;
                        i28 = dbjVar.k;
                        if (i28 != 0) {
                            qgg.h0(obj33);
                            rjc rjcVar28 = this.b;
                            k2s a3 = l2s.a((v2s) obj);
                            dbjVar.k = 1;
                            if (rjcVar28.emit(a3, dbjVar) == nm6Var28) {
                                break;
                            }
                        } else if (i28 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj33);
                        }
                        break;
                    }
                }
                dbjVar = new dbj(this, continuation);
                Object obj332 = dbjVar.j;
                nm6 nm6Var282 = nm6.a;
                i28 = dbjVar.k;
                if (i28 != 0) {
                }
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                if (continuation instanceof xdj) {
                    xdjVar = (xdj) continuation;
                    int i62 = xdjVar.k;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        xdjVar.k = i62 - Integer.MIN_VALUE;
                        Object obj34 = xdjVar.j;
                        nm6 nm6Var29 = nm6.a;
                        i29 = xdjVar.k;
                        if (i29 != 0) {
                            qgg.h0(obj34);
                            rjc rjcVar29 = this.b;
                            j1g j1gVar = ((Boolean) obj).booleanValue() ? j1g.a : j1g.b;
                            xdjVar.k = 1;
                            if (rjcVar29.emit(j1gVar, xdjVar) == nm6Var29) {
                                break;
                            }
                        } else if (i29 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj34);
                        }
                        break;
                    }
                }
                xdjVar = new xdj(this, continuation);
                Object obj342 = xdjVar.j;
                nm6 nm6Var292 = nm6.a;
                i29 = xdjVar.k;
                if (i29 != 0) {
                }
            default:
                if (continuation instanceof zfj) {
                    zfjVar = (zfj) continuation;
                    int i63 = zfjVar.k;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        zfjVar.k = i63 - Integer.MIN_VALUE;
                        Object obj35 = zfjVar.j;
                        Object obj36 = nm6.a;
                        i30 = zfjVar.k;
                        if (i30 != 0) {
                            qgg.h0(obj35);
                            rjc rjcVar30 = this.b;
                            ArrayList arrayList = new ArrayList();
                            for (Map.Entry entry : ((Map) obj).entrySet()) {
                                String str = (String) entry.getKey();
                                mk5 mk5Var = (mk5) entry.getValue();
                                l18 l18Var = l18.b;
                                jyr jyrVar = t5j.e;
                                if (wyf.M()) {
                                    switch (str.hashCode()) {
                                        case -1405296538:
                                            break;
                                        case -1278967463:
                                            break;
                                        case 85231012:
                                            break;
                                        case 183836381:
                                            break;
                                        case 302505030:
                                            if (str.equals("music-concert-tab")) {
                                                bdt I = hag.I(byb.class);
                                                qdc qdcVar = l18Var.a;
                                                qdcVar.getClass();
                                                if (((u36) ((byb) qdcVar.C(I)).c(ern.a(u36.class))).h()) {
                                                    rf3Var = rf3.j;
                                                    break;
                                                }
                                            }
                                            rf3Var = null;
                                            break;
                                        case 460158094:
                                            if (str.equals("music-collection-tab")) {
                                                rf3Var = rf3.l;
                                                break;
                                            }
                                            rf3Var = null;
                                            break;
                                    }
                                } else {
                                    switch (str.hashCode()) {
                                        case -1278967463:
                                            if (str.equals("music-book-tab")) {
                                                rf3Var = rf3.i;
                                                break;
                                            }
                                            rf3Var = null;
                                            break;
                                        case 85231012:
                                            if (str.equals("music-podcast-tab")) {
                                                rf3Var = rf3.i;
                                                break;
                                            }
                                            rf3Var = null;
                                            break;
                                        case 183836381:
                                            if (str.equals("music-kids-tab")) {
                                                rf3Var = rf3.k;
                                                break;
                                            }
                                            rf3Var = null;
                                            break;
                                        case 302505030:
                                            if (str.equals("music-concert-tab")) {
                                                bdt I2 = hag.I(byb.class);
                                                qdc qdcVar2 = l18Var.a;
                                                qdcVar2.getClass();
                                                if (((u36) ((byb) qdcVar2.C(I2)).c(ern.a(u36.class))).h()) {
                                                    rf3Var = rf3.j;
                                                    break;
                                                }
                                            }
                                            rf3Var = null;
                                            break;
                                        case 460158094:
                                            if (str.equals("music-collection-tab")) {
                                                rf3Var = rf3.l;
                                                break;
                                            }
                                            rf3Var = null;
                                            break;
                                        default:
                                            rf3Var = null;
                                            break;
                                    }
                                }
                                ufj ufjVar = (rf3Var != null && mk5Var.a) ? new ufj(rf3Var) : null;
                                if (ufjVar != null) {
                                    arrayList.add(ufjVar);
                                }
                                i32 = 1;
                            }
                            zfjVar.k = i32;
                            if (rjcVar30.emit(arrayList, zfjVar) == obj36) {
                                break;
                            }
                        } else if (i30 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj35);
                        }
                        break;
                    }
                }
                zfjVar = new zfj(this, continuation);
                Object obj352 = zfjVar.j;
                Object obj362 = nm6.a;
                i30 = zfjVar.k;
                if (i30 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
