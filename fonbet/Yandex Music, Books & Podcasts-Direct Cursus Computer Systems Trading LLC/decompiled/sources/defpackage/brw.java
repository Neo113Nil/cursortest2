package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class brw implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;

    public /* synthetic */ brw(rjc rjcVar, int i) {
        this.a = i;
        this.b = rjcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015a  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        arw arwVar;
        int i;
        crw crwVar;
        int i2;
        drw drwVar;
        int i3;
        erw erwVar;
        int i4;
        frw frwVar;
        int i5;
        grw grwVar;
        int i6;
        irw irwVar;
        int i7;
        jrw jrwVar;
        int i8;
        krw krwVar;
        int i9;
        lrw lrwVar;
        int i10;
        isw iswVar;
        int i11;
        tsw tswVar;
        int i12;
        wsw wswVar;
        int i13;
        switch (this.a) {
            case 0:
                if (continuation instanceof arw) {
                    arwVar = (arw) continuation;
                    int i14 = arwVar.k;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        arwVar.k = i14 - Integer.MIN_VALUE;
                        Object obj2 = arwVar.j;
                        nm6 nm6Var = nm6.a;
                        i = arwVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            Boolean valueOf = Boolean.valueOf(((mns) obj) != null);
                            arwVar.k = 1;
                            if (this.b.emit(valueOf, arwVar) == nm6Var) {
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
                arwVar = new arw(this, continuation);
                Object obj22 = arwVar.j;
                nm6 nm6Var2 = nm6.a;
                i = arwVar.k;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof crw) {
                    crwVar = (crw) continuation;
                    int i15 = crwVar.k;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        crwVar.k = i15 - Integer.MIN_VALUE;
                        Object obj3 = crwVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = crwVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            Boolean valueOf2 = Boolean.valueOf(((x66) obj).a);
                            crwVar.k = 1;
                            if (this.b.emit(valueOf2, crwVar) == nm6Var3) {
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
                crwVar = new crw(this, continuation);
                Object obj32 = crwVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = crwVar.k;
                if (i2 != 0) {
                }
                break;
            case 2:
                if (continuation instanceof drw) {
                    drwVar = (drw) continuation;
                    int i16 = drwVar.k;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        drwVar.k = i16 - Integer.MIN_VALUE;
                        Object obj4 = drwVar.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = drwVar.k;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            String str = (String) obj;
                            Boolean valueOf3 = Boolean.valueOf(!(str == null || str.length() == 0));
                            drwVar.k = 1;
                            if (this.b.emit(valueOf3, drwVar) == nm6Var4) {
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
                drwVar = new drw(this, continuation);
                Object obj42 = drwVar.j;
                nm6 nm6Var42 = nm6.a;
                i3 = drwVar.k;
                if (i3 != 0) {
                }
                break;
            case 3:
                if (continuation instanceof erw) {
                    erwVar = (erw) continuation;
                    int i17 = erwVar.k;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        erwVar.k = i17 - Integer.MIN_VALUE;
                        Object obj5 = erwVar.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = erwVar.k;
                        if (i4 != 0) {
                            qgg.h0(obj5);
                            Boolean valueOf4 = Boolean.valueOf(((yxc) obj).a.d);
                            erwVar.k = 1;
                            if (this.b.emit(valueOf4, erwVar) == nm6Var5) {
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
                erwVar = new erw(this, continuation);
                Object obj52 = erwVar.j;
                nm6 nm6Var52 = nm6.a;
                i4 = erwVar.k;
                if (i4 != 0) {
                }
                break;
            case 4:
                if (continuation instanceof frw) {
                    frwVar = (frw) continuation;
                    int i18 = frwVar.k;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        frwVar.k = i18 - Integer.MIN_VALUE;
                        Object obj6 = frwVar.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = frwVar.k;
                        if (i5 != 0) {
                            qgg.h0(obj6);
                            Boolean valueOf5 = Boolean.valueOf(((yxc) obj).g);
                            frwVar.k = 1;
                            if (this.b.emit(valueOf5, frwVar) == nm6Var6) {
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
                frwVar = new frw(this, continuation);
                Object obj62 = frwVar.j;
                nm6 nm6Var62 = nm6.a;
                i5 = frwVar.k;
                if (i5 != 0) {
                }
                break;
            case 5:
                if (continuation instanceof grw) {
                    grwVar = (grw) continuation;
                    int i19 = grwVar.k;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        grwVar.k = i19 - Integer.MIN_VALUE;
                        Object obj7 = grwVar.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = grwVar.k;
                        if (i6 != 0) {
                            qgg.h0(obj7);
                            Boolean valueOf6 = Boolean.valueOf(!Intrinsics.d((u6m) obj, r6m.a));
                            grwVar.k = 1;
                            if (this.b.emit(valueOf6, grwVar) == nm6Var7) {
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
                grwVar = new grw(this, continuation);
                Object obj72 = grwVar.j;
                nm6 nm6Var72 = nm6.a;
                i6 = grwVar.k;
                if (i6 != 0) {
                }
                break;
            case 6:
                if (continuation instanceof irw) {
                    irwVar = (irw) continuation;
                    int i20 = irwVar.k;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        irwVar.k = i20 - Integer.MIN_VALUE;
                        Object obj8 = irwVar.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = irwVar.k;
                        if (i7 != 0) {
                            qgg.h0(obj8);
                            if (((Boolean) obj).booleanValue()) {
                                irwVar.k = 1;
                                if (this.b.emit(obj, irwVar) == nm6Var8) {
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
                irwVar = new irw(this, continuation);
                Object obj82 = irwVar.j;
                nm6 nm6Var82 = nm6.a;
                i7 = irwVar.k;
                if (i7 != 0) {
                }
                break;
            case 7:
                if (continuation instanceof jrw) {
                    jrwVar = (jrw) continuation;
                    int i21 = jrwVar.k;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        jrwVar.k = i21 - Integer.MIN_VALUE;
                        Object obj9 = jrwVar.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = jrwVar.k;
                        if (i8 != 0) {
                            qgg.h0(obj9);
                            drc drcVar = (drc) obj;
                            Boolean valueOf7 = Boolean.valueOf(drcVar.b || drcVar.c);
                            jrwVar.k = 1;
                            if (this.b.emit(valueOf7, jrwVar) == nm6Var9) {
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
                jrwVar = new jrw(this, continuation);
                Object obj92 = jrwVar.j;
                nm6 nm6Var92 = nm6.a;
                i8 = jrwVar.k;
                if (i8 != 0) {
                }
                break;
            case 8:
                if (continuation instanceof krw) {
                    krwVar = (krw) continuation;
                    int i22 = krwVar.k;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        krwVar.k = i22 - Integer.MIN_VALUE;
                        Object obj10 = krwVar.j;
                        nm6 nm6Var10 = nm6.a;
                        i9 = krwVar.k;
                        if (i9 != 0) {
                            qgg.h0(obj10);
                            if (((Boolean) obj).booleanValue()) {
                                krwVar.k = 1;
                                if (this.b.emit(obj, krwVar) == nm6Var10) {
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
                krwVar = new krw(this, continuation);
                Object obj102 = krwVar.j;
                nm6 nm6Var102 = nm6.a;
                i9 = krwVar.k;
                if (i9 != 0) {
                }
                break;
            case 9:
                if (continuation instanceof lrw) {
                    lrwVar = (lrw) continuation;
                    int i23 = lrwVar.k;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        lrwVar.k = i23 - Integer.MIN_VALUE;
                        Object obj11 = lrwVar.j;
                        nm6 nm6Var11 = nm6.a;
                        i10 = lrwVar.k;
                        if (i10 != 0) {
                            qgg.h0(obj11);
                            Boolean valueOf8 = Boolean.valueOf(((e6l) obj) instanceof d6l);
                            lrwVar.k = 1;
                            if (this.b.emit(valueOf8, lrwVar) == nm6Var11) {
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
                lrwVar = new lrw(this, continuation);
                Object obj112 = lrwVar.j;
                nm6 nm6Var112 = nm6.a;
                i10 = lrwVar.k;
                if (i10 != 0) {
                }
                break;
            case 10:
                if (continuation instanceof isw) {
                    iswVar = (isw) continuation;
                    int i24 = iswVar.k;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        iswVar.k = i24 - Integer.MIN_VALUE;
                        Object obj12 = iswVar.j;
                        nm6 nm6Var12 = nm6.a;
                        i11 = iswVar.k;
                        if (i11 != 0) {
                            qgg.h0(obj12);
                            Boolean valueOf9 = Boolean.valueOf(((ohw) obj) != null);
                            iswVar.k = 1;
                            if (this.b.emit(valueOf9, iswVar) == nm6Var12) {
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
                iswVar = new isw(this, continuation);
                Object obj122 = iswVar.j;
                nm6 nm6Var122 = nm6.a;
                i11 = iswVar.k;
                if (i11 != 0) {
                }
                break;
            case 11:
                if (continuation instanceof tsw) {
                    tswVar = (tsw) continuation;
                    int i25 = tswVar.k;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        tswVar.k = i25 - Integer.MIN_VALUE;
                        Object obj13 = tswVar.j;
                        nm6 nm6Var13 = nm6.a;
                        i12 = tswVar.k;
                        if (i12 != 0) {
                            qgg.h0(obj13);
                            sqw sqwVar = (sqw) obj;
                            pqw t = sqwVar != null ? s7g.t(sqwVar) : null;
                            if (t != null) {
                                tswVar.k = 1;
                                if (this.b.emit(t, tswVar) == nm6Var13) {
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
                tswVar = new tsw(this, continuation);
                Object obj132 = tswVar.j;
                nm6 nm6Var132 = nm6.a;
                i12 = tswVar.k;
                if (i12 != 0) {
                }
                break;
            default:
                if (continuation instanceof wsw) {
                    wswVar = (wsw) continuation;
                    int i26 = wswVar.k;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        wswVar.k = i26 - Integer.MIN_VALUE;
                        Object obj14 = wswVar.j;
                        nm6 nm6Var14 = nm6.a;
                        i13 = wswVar.k;
                        if (i13 != 0) {
                            qgg.h0(obj14);
                            sqw sqwVar2 = (sqw) obj;
                            pqw t2 = sqwVar2 != null ? s7g.t(sqwVar2) : null;
                            if (t2 != null) {
                                wswVar.k = 1;
                                if (this.b.emit(t2, wswVar) == nm6Var14) {
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
                wswVar = new wsw(this, continuation);
                Object obj142 = wswVar.j;
                nm6 nm6Var142 = nm6.a;
                i13 = wswVar.k;
                if (i13 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
