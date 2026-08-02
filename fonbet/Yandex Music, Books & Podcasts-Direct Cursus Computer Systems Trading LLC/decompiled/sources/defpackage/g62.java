package defpackage;

import com.yandex.passport.api.i2;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g62 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;

    public /* synthetic */ g62(rjc rjcVar, int i) {
        this.a = i;
        this.b = rjcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x08cc  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019c  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        f62 f62Var;
        int i;
        i62 i62Var;
        int i2;
        q62 q62Var;
        int i3;
        r62 r62Var;
        int i4;
        t62 t62Var;
        int i5;
        v62 v62Var;
        int i6;
        oe2 oe2Var;
        int i7;
        pe2 pe2Var;
        int i8;
        re2 re2Var;
        int i9;
        se2 se2Var;
        int i10;
        ye2 ye2Var;
        int i11;
        mf2 mf2Var;
        int i12;
        yf2 yf2Var;
        int i13;
        wo2 wo2Var;
        int i14;
        jp2 jp2Var;
        int i15;
        lp2 lp2Var;
        int i16;
        ht2 ht2Var;
        int i17;
        boolean z;
        Boolean valueOf;
        it2 it2Var;
        int i18;
        v93 v93Var;
        int i19;
        x93 x93Var;
        int i20;
        oa3 oa3Var;
        int i21;
        ra3 ra3Var;
        int i22;
        if3 if3Var;
        int i23;
        ff3 ff3Var;
        jf3 jf3Var;
        int i24;
        nk3 nk3Var;
        int i25;
        fku fkuVar;
        pk3 pk3Var;
        int i26;
        jr3 jr3Var;
        int i27;
        du3 du3Var;
        int i28;
        e04 e04Var;
        int i29;
        g34 g34Var;
        int i30;
        switch (this.a) {
            case 0:
                if (continuation instanceof f62) {
                    f62Var = (f62) continuation;
                    int i31 = f62Var.k;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        f62Var.k = i31 - Integer.MIN_VALUE;
                        Object obj2 = f62Var.j;
                        nm6 nm6Var = nm6.a;
                        i = f62Var.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            Pair pair = (Pair) obj;
                            if (Intrinsics.d(((rr5) pair.b).a, ((mqs) pair.a).a)) {
                                f62Var.k = 1;
                                if (this.b.emit(obj, f62Var) == nm6Var) {
                                }
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
                f62Var = new f62(this, continuation);
                Object obj22 = f62Var.j;
                nm6 nm6Var2 = nm6.a;
                i = f62Var.k;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof i62) {
                    i62Var = (i62) continuation;
                    int i32 = i62Var.k;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        i62Var.k = i32 - Integer.MIN_VALUE;
                        Object obj3 = i62Var.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = i62Var.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            mqs mqsVar = (mqs) ((Pair) obj).a;
                            i62Var.k = 1;
                            if (this.b.emit(mqsVar, i62Var) == nm6Var3) {
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
                i62Var = new i62(this, continuation);
                Object obj32 = i62Var.j;
                nm6 nm6Var32 = nm6.a;
                i2 = i62Var.k;
                if (i2 != 0) {
                }
                break;
            case 2:
                if (continuation instanceof q62) {
                    q62Var = (q62) continuation;
                    int i33 = q62Var.k;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        q62Var.k = i33 - Integer.MIN_VALUE;
                        Object obj4 = q62Var.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = q62Var.k;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            if (((xws) obj).b == j1g.a) {
                                q62Var.k = 1;
                                if (this.b.emit(obj, q62Var) == nm6Var4) {
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
                q62Var = new q62(this, continuation);
                Object obj42 = q62Var.j;
                nm6 nm6Var42 = nm6.a;
                i3 = q62Var.k;
                if (i3 != 0) {
                }
                break;
            case 3:
                if (continuation instanceof r62) {
                    r62Var = (r62) continuation;
                    int i34 = r62Var.k;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        r62Var.k = i34 - Integer.MIN_VALUE;
                        Object obj5 = r62Var.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = r62Var.k;
                        if (i4 != 0) {
                            qgg.h0(obj5);
                            rr5 rr5Var = ((xws) obj).a;
                            r62Var.k = 1;
                            if (this.b.emit(rr5Var, r62Var) == nm6Var5) {
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
                r62Var = new r62(this, continuation);
                Object obj52 = r62Var.j;
                nm6 nm6Var52 = nm6.a;
                i4 = r62Var.k;
                if (i4 != 0) {
                }
                break;
            case 4:
                if (continuation instanceof t62) {
                    t62Var = (t62) continuation;
                    int i35 = t62Var.k;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        t62Var.k = i35 - Integer.MIN_VALUE;
                        Object obj6 = t62Var.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = t62Var.k;
                        if (i5 != 0) {
                            qgg.h0(obj6);
                            ArrayList c = w62.c((List) obj);
                            t62Var.k = 1;
                            if (this.b.emit(c, t62Var) == nm6Var6) {
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
                t62Var = new t62(this, continuation);
                Object obj62 = t62Var.j;
                nm6 nm6Var62 = nm6.a;
                i5 = t62Var.k;
                if (i5 != 0) {
                }
                break;
            case 5:
                if (continuation instanceof v62) {
                    v62Var = (v62) continuation;
                    int i36 = v62Var.k;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        v62Var.k = i36 - Integer.MIN_VALUE;
                        Object obj7 = v62Var.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = v62Var.k;
                        if (i6 != 0) {
                            qgg.h0(obj7);
                            ArrayList c2 = w62.c((List) obj);
                            v62Var.k = 1;
                            if (this.b.emit(c2, v62Var) == nm6Var7) {
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
                v62Var = new v62(this, continuation);
                Object obj72 = v62Var.j;
                nm6 nm6Var72 = nm6.a;
                i6 = v62Var.k;
                if (i6 != 0) {
                }
                break;
            case 6:
                if (continuation instanceof oe2) {
                    oe2Var = (oe2) continuation;
                    int i37 = oe2Var.k;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        oe2Var.k = i37 - Integer.MIN_VALUE;
                        Object obj8 = oe2Var.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = oe2Var.k;
                        if (i7 != 0) {
                            qgg.h0(obj8);
                            Boolean valueOf2 = Boolean.valueOf(((x66) obj).a);
                            oe2Var.k = 1;
                            if (this.b.emit(valueOf2, oe2Var) == nm6Var8) {
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
                oe2Var = new oe2(this, continuation);
                Object obj82 = oe2Var.j;
                nm6 nm6Var82 = nm6.a;
                i7 = oe2Var.k;
                if (i7 != 0) {
                }
                break;
            case 7:
                if (continuation instanceof pe2) {
                    pe2Var = (pe2) continuation;
                    int i38 = pe2Var.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        pe2Var.k = i38 - Integer.MIN_VALUE;
                        Object obj9 = pe2Var.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = pe2Var.k;
                        if (i8 != 0) {
                            qgg.h0(obj9);
                            String str = ((Boolean) obj).booleanValue() ? "the Internet is restored" : null;
                            if (str != null) {
                                pe2Var.k = 1;
                                if (this.b.emit(str, pe2Var) == nm6Var9) {
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
                pe2Var = new pe2(this, continuation);
                Object obj92 = pe2Var.j;
                nm6 nm6Var92 = nm6.a;
                i8 = pe2Var.k;
                if (i8 != 0) {
                }
                break;
            case 8:
                if (continuation instanceof re2) {
                    re2Var = (re2) continuation;
                    int i39 = re2Var.k;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        re2Var.k = i39 - Integer.MIN_VALUE;
                        Object obj10 = re2Var.j;
                        nm6 nm6Var10 = nm6.a;
                        i9 = re2Var.k;
                        if (i9 != 0) {
                            qgg.h0(obj10);
                            Unit unit = Unit.a;
                            re2Var.k = 1;
                            if (this.b.emit(unit, re2Var) == nm6Var10) {
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
                re2Var = new re2(this, continuation);
                Object obj102 = re2Var.j;
                nm6 nm6Var102 = nm6.a;
                i9 = re2Var.k;
                if (i9 != 0) {
                }
                break;
            case 9:
                if (continuation instanceof se2) {
                    se2Var = (se2) continuation;
                    int i40 = se2Var.k;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        se2Var.k = i40 - Integer.MIN_VALUE;
                        Object obj11 = se2Var.j;
                        nm6 nm6Var11 = nm6.a;
                        i10 = se2Var.k;
                        if (i10 != 0) {
                            qgg.h0(obj11);
                            String str2 = ((Boolean) obj).booleanValue() ? "the app is in foreground" : null;
                            if (str2 != null) {
                                se2Var.k = 1;
                                if (this.b.emit(str2, se2Var) == nm6Var11) {
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
                se2Var = new se2(this, continuation);
                Object obj112 = se2Var.j;
                nm6 nm6Var112 = nm6.a;
                i10 = se2Var.k;
                if (i10 != 0) {
                }
                break;
            case 10:
                if (continuation instanceof ye2) {
                    ye2Var = (ye2) continuation;
                    int i41 = ye2Var.k;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        ye2Var.k = i41 - Integer.MIN_VALUE;
                        Object obj12 = ye2Var.j;
                        nm6 nm6Var12 = nm6.a;
                        i11 = ye2Var.k;
                        if (i11 != 0) {
                            qgg.h0(obj12);
                            tg5 tg5Var = (tg5) obj;
                            boolean z2 = tg5Var instanceof rg5;
                            Object obj13 = cf2.a;
                            if (!z2) {
                                if (!(tg5Var instanceof sg5)) {
                                    b6e.s();
                                    break;
                                }
                            } else {
                                rg5 rg5Var = (rg5) tg5Var;
                                LinkedHashSet linkedHashSet = rg5Var.b;
                                Set set = rg5Var.a;
                                LinkedHashSet i42 = wop.i(set, linkedHashSet);
                                if (!i42.isEmpty()) {
                                    Iterator it = i42.iterator();
                                    while (it.hasNext()) {
                                        if (((xh5) it.next()) instanceof lh5) {
                                            obj13 = af2.a;
                                        }
                                    }
                                }
                                LinkedHashSet i43 = wop.i(set, linkedHashSet);
                                if (!i43.isEmpty()) {
                                    Iterator it2 = i43.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (((xh5) it2.next()) instanceof mh5) {
                                                obj13 = bf2.a;
                                            }
                                        }
                                    }
                                }
                            }
                            ye2Var.k = 1;
                            if (this.b.emit(obj13, ye2Var) == nm6Var12) {
                            }
                        } else if (i11 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj12);
                            break;
                        }
                    }
                }
                ye2Var = new ye2(this, continuation);
                Object obj122 = ye2Var.j;
                nm6 nm6Var122 = nm6.a;
                i11 = ye2Var.k;
                if (i11 != 0) {
                }
                break;
            case 11:
                if (continuation instanceof mf2) {
                    mf2Var = (mf2) continuation;
                    int i44 = mf2Var.k;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        mf2Var.k = i44 - Integer.MIN_VALUE;
                        Object obj14 = mf2Var.j;
                        nm6 nm6Var13 = nm6.a;
                        i12 = mf2Var.k;
                        if (i12 != 0) {
                            qgg.h0(obj14);
                            Boolean valueOf3 = Boolean.valueOf(!((Set) obj).isEmpty());
                            mf2Var.k = 1;
                            if (this.b.emit(valueOf3, mf2Var) == nm6Var13) {
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
                mf2Var = new mf2(this, continuation);
                Object obj142 = mf2Var.j;
                nm6 nm6Var132 = nm6.a;
                i12 = mf2Var.k;
                if (i12 != 0) {
                }
                break;
            case 12:
                if (continuation instanceof yf2) {
                    yf2Var = (yf2) continuation;
                    int i45 = yf2Var.k;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        yf2Var.k = i45 - Integer.MIN_VALUE;
                        Object obj15 = yf2Var.j;
                        nm6 nm6Var14 = nm6.a;
                        i13 = yf2Var.k;
                        if (i13 != 0) {
                            qgg.h0(obj15);
                            if (Intrinsics.d((y7q) obj, u7q.a)) {
                                yf2Var.k = 1;
                                if (this.b.emit(obj, yf2Var) == nm6Var14) {
                                }
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
                yf2Var = new yf2(this, continuation);
                Object obj152 = yf2Var.j;
                nm6 nm6Var142 = nm6.a;
                i13 = yf2Var.k;
                if (i13 != 0) {
                }
                break;
            case 13:
                if (continuation instanceof wo2) {
                    wo2Var = (wo2) continuation;
                    int i46 = wo2Var.k;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        wo2Var.k = i46 - Integer.MIN_VALUE;
                        Object obj16 = wo2Var.j;
                        nm6 nm6Var15 = nm6.a;
                        i14 = wo2Var.k;
                        if (i14 != 0) {
                            qgg.h0(obj16);
                            mo2 mo2Var = (mo2) obj;
                            Object so2Var = mo2Var == null ? to2.a : new so2(mo2Var);
                            wo2Var.k = 1;
                            if (this.b.emit(so2Var, wo2Var) == nm6Var15) {
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
                wo2Var = new wo2(this, continuation);
                Object obj162 = wo2Var.j;
                nm6 nm6Var152 = nm6.a;
                i14 = wo2Var.k;
                if (i14 != 0) {
                }
                break;
            case 14:
                if (continuation instanceof jp2) {
                    jp2Var = (jp2) continuation;
                    int i47 = jp2Var.k;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        jp2Var.k = i47 - Integer.MIN_VALUE;
                        Object obj17 = jp2Var.j;
                        nm6 nm6Var16 = nm6.a;
                        i15 = jp2Var.k;
                        if (i15 != 0) {
                            qgg.h0(obj17);
                            if (((yxc) obj).d().a()) {
                                jp2Var.k = 1;
                                if (this.b.emit(obj, jp2Var) == nm6Var16) {
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
                jp2Var = new jp2(this, continuation);
                Object obj172 = jp2Var.j;
                nm6 nm6Var162 = nm6.a;
                i15 = jp2Var.k;
                if (i15 != 0) {
                }
                break;
            case 15:
                if (continuation instanceof lp2) {
                    lp2Var = (lp2) continuation;
                    int i48 = lp2Var.k;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        lp2Var.k = i48 - Integer.MIN_VALUE;
                        Object obj18 = lp2Var.j;
                        nm6 nm6Var17 = nm6.a;
                        i16 = lp2Var.k;
                        if (i16 != 0) {
                            qgg.h0(obj18);
                            if (!((Boolean) obj).booleanValue()) {
                                lp2Var.k = 1;
                                if (this.b.emit(obj, lp2Var) == nm6Var17) {
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
                lp2Var = new lp2(this, continuation);
                Object obj182 = lp2Var.j;
                nm6 nm6Var172 = nm6.a;
                i16 = lp2Var.k;
                if (i16 != 0) {
                }
                break;
            case 16:
                if (continuation instanceof ht2) {
                    ht2Var = (ht2) continuation;
                    int i49 = ht2Var.k;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        ht2Var.k = i49 - Integer.MIN_VALUE;
                        Object obj19 = ht2Var.j;
                        nm6 nm6Var18 = nm6.a;
                        i17 = ht2Var.k;
                        if (i17 != 0) {
                            qgg.h0(obj19);
                            int ordinal = ((zzi) obj).b.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    z = true;
                                    valueOf = Boolean.valueOf(z);
                                    ht2Var.k = 1;
                                    if (this.b.emit(valueOf, ht2Var) == nm6Var18) {
                                    }
                                } else if (ordinal != 2 && ordinal != 3) {
                                    b6e.s();
                                    break;
                                }
                            }
                            z = false;
                            valueOf = Boolean.valueOf(z);
                            ht2Var.k = 1;
                            if (this.b.emit(valueOf, ht2Var) == nm6Var18) {
                            }
                        } else if (i17 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj19);
                            break;
                        }
                    }
                }
                ht2Var = new ht2(this, continuation);
                Object obj192 = ht2Var.j;
                nm6 nm6Var182 = nm6.a;
                i17 = ht2Var.k;
                if (i17 != 0) {
                }
                break;
            case 17:
                if (continuation instanceof it2) {
                    it2Var = (it2) continuation;
                    int i50 = it2Var.k;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        it2Var.k = i50 - Integer.MIN_VALUE;
                        Object obj20 = it2Var.j;
                        nm6 nm6Var19 = nm6.a;
                        i18 = it2Var.k;
                        if (i18 != 0) {
                            qgg.h0(obj20);
                            Boolean valueOf4 = Boolean.valueOf(p6g.C((e6l) obj));
                            it2Var.k = 1;
                            if (this.b.emit(valueOf4, it2Var) == nm6Var19) {
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
                it2Var = new it2(this, continuation);
                Object obj202 = it2Var.j;
                nm6 nm6Var192 = nm6.a;
                i18 = it2Var.k;
                if (i18 != 0) {
                }
                break;
            case 18:
                if (continuation instanceof v93) {
                    v93Var = (v93) continuation;
                    int i51 = v93Var.k;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        v93Var.k = i51 - Integer.MIN_VALUE;
                        Object obj21 = v93Var.j;
                        nm6 nm6Var20 = nm6.a;
                        i19 = v93Var.k;
                        if (i19 != 0) {
                            qgg.h0(obj21);
                            cb3 cb3Var = (cb3) obj;
                            ab3 ab3Var = cb3Var instanceof ab3 ? (ab3) cb3Var : null;
                            oq oqVar = ab3Var != null ? ab3Var.a.a : null;
                            if (oqVar != null) {
                                v93Var.k = 1;
                                if (this.b.emit(oqVar, v93Var) == nm6Var20) {
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
                v93Var = new v93(this, continuation);
                Object obj212 = v93Var.j;
                nm6 nm6Var202 = nm6.a;
                i19 = v93Var.k;
                if (i19 != 0) {
                }
                break;
            case 19:
                if (continuation instanceof x93) {
                    x93Var = (x93) continuation;
                    int i52 = x93Var.k;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        x93Var.k = i52 - Integer.MIN_VALUE;
                        Object obj23 = x93Var.j;
                        nm6 nm6Var21 = nm6.a;
                        i20 = x93Var.k;
                        if (i20 != 0) {
                            qgg.h0(obj23);
                            cb3 cb3Var2 = (cb3) obj;
                            za3 za3Var = cb3Var2 instanceof za3 ? (za3) cb3Var2 : null;
                            oq oqVar2 = za3Var != null ? za3Var.c.a : null;
                            if (oqVar2 != null) {
                                x93Var.k = 1;
                                if (this.b.emit(oqVar2, x93Var) == nm6Var21) {
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
                x93Var = new x93(this, continuation);
                Object obj232 = x93Var.j;
                nm6 nm6Var212 = nm6.a;
                i20 = x93Var.k;
                if (i20 != 0) {
                }
                break;
            case 20:
                if (continuation instanceof oa3) {
                    oa3Var = (oa3) continuation;
                    int i53 = oa3Var.k;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        oa3Var.k = i53 - Integer.MIN_VALUE;
                        Object obj24 = oa3Var.j;
                        nm6 nm6Var22 = nm6.a;
                        i21 = oa3Var.k;
                        if (i21 != 0) {
                            qgg.h0(obj24);
                            d6l x = p6g.x((e6l) obj);
                            n7q n7qVar = x != null ? x.a : null;
                            oa3Var.k = 1;
                            if (this.b.emit(n7qVar, oa3Var) == nm6Var22) {
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
                oa3Var = new oa3(this, continuation);
                Object obj242 = oa3Var.j;
                nm6 nm6Var222 = nm6.a;
                i21 = oa3Var.k;
                if (i21 != 0) {
                }
                break;
            case 21:
                if (continuation instanceof ra3) {
                    ra3Var = (ra3) continuation;
                    int i54 = ra3Var.k;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        ra3Var.k = i54 - Integer.MIN_VALUE;
                        Object obj25 = ra3Var.j;
                        nm6 nm6Var23 = nm6.a;
                        i22 = ra3Var.k;
                        if (i22 != 0) {
                            qgg.h0(obj25);
                            if (!((Boolean) obj).booleanValue()) {
                                ra3Var.k = 1;
                                if (this.b.emit(obj, ra3Var) == nm6Var23) {
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
                ra3Var = new ra3(this, continuation);
                Object obj252 = ra3Var.j;
                nm6 nm6Var232 = nm6.a;
                i22 = ra3Var.k;
                if (i22 != 0) {
                }
                break;
            case 22:
                if (continuation instanceof if3) {
                    if3Var = (if3) continuation;
                    int i55 = if3Var.k;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        if3Var.k = i55 - Integer.MIN_VALUE;
                        Object obj26 = if3Var.j;
                        nm6 nm6Var24 = nm6.a;
                        i23 = if3Var.k;
                        if (i23 != 0) {
                            qgg.h0(obj26);
                            y7q y7qVar = (y7q) obj;
                            if (!Intrinsics.d(y7qVar, v7q.a)) {
                                if (!Intrinsics.d(y7qVar, w7q.a) && !Intrinsics.d(y7qVar, u7q.a) && !(y7qVar instanceof x7q)) {
                                    b6e.s();
                                    break;
                                } else {
                                    ff3Var = ff3.b;
                                }
                            } else {
                                ff3Var = ff3.a;
                            }
                            if3Var.k = 1;
                            if (this.b.emit(ff3Var, if3Var) == nm6Var24) {
                            }
                        } else if (i23 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj26);
                            break;
                        }
                    }
                }
                if3Var = new if3(this, continuation);
                Object obj262 = if3Var.j;
                nm6 nm6Var242 = nm6.a;
                i23 = if3Var.k;
                if (i23 != 0) {
                }
                break;
            case 23:
                if (continuation instanceof jf3) {
                    jf3Var = (jf3) continuation;
                    int i56 = jf3Var.k;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        jf3Var.k = i56 - Integer.MIN_VALUE;
                        Object obj27 = jf3Var.j;
                        nm6 nm6Var25 = nm6.a;
                        i24 = jf3Var.k;
                        if (i24 != 0) {
                            qgg.h0(obj27);
                            hql hqlVar = (hql) obj;
                            if (hqlVar == null) {
                                hqlVar = null;
                            }
                            jf3Var.k = 1;
                            if (this.b.emit(hqlVar, jf3Var) == nm6Var25) {
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
                jf3Var = new jf3(this, continuation);
                Object obj272 = jf3Var.j;
                nm6 nm6Var252 = nm6.a;
                i24 = jf3Var.k;
                if (i24 != 0) {
                }
                break;
            case 24:
                if (continuation instanceof nk3) {
                    nk3Var = (nk3) continuation;
                    int i57 = nk3Var.k;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        nk3Var.k = i57 - Integer.MIN_VALUE;
                        Object obj28 = nk3Var.j;
                        nm6 nm6Var26 = nm6.a;
                        i25 = nk3Var.k;
                        if (i25 != 0) {
                            qgg.h0(obj28);
                            int ordinal2 = ((i2) obj).ordinal();
                            if (ordinal2 == 0) {
                                fkuVar = fku.b;
                            } else if (ordinal2 != 1) {
                                b6e.s();
                                break;
                            } else {
                                fkuVar = fku.a;
                            }
                            nk3Var.k = 1;
                            if (this.b.emit(fkuVar, nk3Var) == nm6Var26) {
                            }
                        } else if (i25 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj28);
                            break;
                        }
                    }
                }
                nk3Var = new nk3(this, continuation);
                Object obj282 = nk3Var.j;
                nm6 nm6Var262 = nm6.a;
                i25 = nk3Var.k;
                if (i25 != 0) {
                }
                break;
            case 25:
                if (continuation instanceof pk3) {
                    pk3Var = (pk3) continuation;
                    int i58 = pk3Var.k;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        pk3Var.k = i58 - Integer.MIN_VALUE;
                        Object obj29 = pk3Var.j;
                        nm6 nm6Var27 = nm6.a;
                        i26 = pk3Var.k;
                        if (i26 != 0) {
                            qgg.h0(obj29);
                            Pair pair2 = (Pair) obj;
                            fku fkuVar2 = (fku) pair2.a;
                            fku fkuVar3 = (fku) pair2.b;
                            if (fkuVar2 == fku.a && fkuVar3 == fku.b) {
                                pk3Var.k = 1;
                                if (this.b.emit(obj, pk3Var) == nm6Var27) {
                                }
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
                pk3Var = new pk3(this, continuation);
                Object obj292 = pk3Var.j;
                nm6 nm6Var272 = nm6.a;
                i26 = pk3Var.k;
                if (i26 != 0) {
                }
                break;
            case 26:
                if (continuation instanceof jr3) {
                    jr3Var = (jr3) continuation;
                    int i59 = jr3Var.k;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        jr3Var.k = i59 - Integer.MIN_VALUE;
                        Object obj30 = jr3Var.j;
                        nm6 nm6Var28 = nm6.a;
                        i27 = jr3Var.k;
                        if (i27 != 0) {
                            qgg.h0(obj30);
                            vgi vgiVar = (vgi) obj;
                            Continuation continuation2 = null;
                            alc alcVar = new alc(new clc((eno) vgiVar.b.e, new d7i(vgiVar, continuation2, 1)), new ow1(vgiVar, continuation2, 2));
                            v3k v3kVar = vgiVar.a;
                            v3k v3kVar2 = new v3k(alcVar, v3kVar.b, v3kVar.c, new ypb(19, vgiVar));
                            jr3Var.k = 1;
                            if (this.b.emit(v3kVar2, jr3Var) == nm6Var28) {
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
                jr3Var = new jr3(this, continuation);
                Object obj302 = jr3Var.j;
                nm6 nm6Var282 = nm6.a;
                i27 = jr3Var.k;
                if (i27 != 0) {
                }
                break;
            case 27:
                if (continuation instanceof du3) {
                    du3Var = (du3) continuation;
                    int i60 = du3Var.l;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        du3Var.l = i60 - Integer.MIN_VALUE;
                        Object obj31 = du3Var.j;
                        nm6 nm6Var29 = nm6.a;
                        i28 = du3Var.l;
                        if (i28 != 0) {
                            qgg.h0(obj31);
                            saf.K(du3Var.getContext());
                            du3Var.l = 1;
                            if (this.b.emit(obj, du3Var) == nm6Var29) {
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
                du3Var = new du3(this, continuation);
                Object obj312 = du3Var.j;
                nm6 nm6Var292 = nm6.a;
                i28 = du3Var.l;
                if (i28 != 0) {
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                if (continuation instanceof e04) {
                    e04Var = (e04) continuation;
                    int i61 = e04Var.k;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        e04Var.k = i61 - Integer.MIN_VALUE;
                        Object obj33 = e04Var.j;
                        nm6 nm6Var30 = nm6.a;
                        i29 = e04Var.k;
                        if (i29 != 0) {
                            qgg.h0(obj33);
                            List list = ((wgg) obj).a;
                            ArrayList arrayList = new ArrayList(v75.o(list, 10));
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(new ez3((c01) it3.next(), 0));
                            }
                            sz3 sz3Var = new sz3(arrayList, null, null);
                            e04Var.k = 1;
                            if (this.b.emit(sz3Var, e04Var) == nm6Var30) {
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
                e04Var = new e04(this, continuation);
                Object obj332 = e04Var.j;
                nm6 nm6Var302 = nm6.a;
                i29 = e04Var.k;
                if (i29 != 0) {
                }
                break;
            default:
                if (continuation instanceof g34) {
                    g34Var = (g34) continuation;
                    int i62 = g34Var.k;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        g34Var.k = i62 - Integer.MIN_VALUE;
                        Object obj34 = g34Var.j;
                        nm6 nm6Var31 = nm6.a;
                        i30 = g34Var.k;
                        if (i30 != 0) {
                            qgg.h0(obj34);
                            f24 f24Var = f24.f;
                            g34Var.k = 1;
                            if (this.b.emit(f24Var, g34Var) == nm6Var31) {
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
                g34Var = new g34(this, continuation);
                Object obj342 = g34Var.j;
                nm6 nm6Var312 = nm6.a;
                i30 = g34Var.k;
                if (i30 != 0) {
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ g62(rjc rjcVar, Object obj, int i) {
        this.a = i;
        this.b = rjcVar;
    }
}
