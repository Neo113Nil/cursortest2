package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class cs implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ String c;

    public /* synthetic */ cs(rjc rjcVar, String str, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0169  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        bs bsVar;
        int i;
        fu fuVar;
        int i2;
        gc1 gc1Var;
        int i3;
        yb5 yb5Var;
        int i4;
        l87 l87Var;
        int i5;
        c3m c3mVar;
        int i6;
        x4u x4uVar;
        int i7;
        lcw lcwVar;
        int i8;
        ncw ncwVar;
        int i9;
        ocw ocwVar;
        int i10;
        pcw pcwVar;
        int i11;
        rew rewVar;
        int i12;
        gow gowVar;
        switch (this.a) {
            case 0:
                if (continuation instanceof bs) {
                    bsVar = (bs) continuation;
                    int i13 = bsVar.k;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        bsVar.k = i13 - Integer.MIN_VALUE;
                        Object obj2 = bsVar.j;
                        nm6 nm6Var = nm6.a;
                        i = bsVar.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            if (Intrinsics.d(this.c, (String) ((Pair) obj).a)) {
                                bsVar.k = 1;
                                if (this.b.emit(obj, bsVar) == nm6Var) {
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
                bsVar = new bs(this, continuation);
                Object obj22 = bsVar.j;
                nm6 nm6Var2 = nm6.a;
                i = bsVar.k;
                if (i != 0) {
                }
                break;
            case 1:
                if (continuation instanceof fu) {
                    fuVar = (fu) continuation;
                    int i14 = fuVar.k;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        fuVar.k = i14 - Integer.MIN_VALUE;
                        Object obj3 = fuVar.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = fuVar.k;
                        if (i2 != 0) {
                            qgg.h0(obj3);
                            j1g j1gVar = (j1g) ((Map) obj).get(this.c);
                            if (j1gVar == null) {
                                j1gVar = j1g.b;
                            }
                            fuVar.k = 1;
                            if (this.b.emit(j1gVar, fuVar) == nm6Var3) {
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
                fuVar = new fu(this, continuation);
                Object obj32 = fuVar.j;
                nm6 nm6Var32 = nm6.a;
                i2 = fuVar.k;
                if (i2 != 0) {
                }
                break;
            case 2:
                if (continuation instanceof gc1) {
                    gc1Var = (gc1) continuation;
                    int i15 = gc1Var.k;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        gc1Var.k = i15 - Integer.MIN_VALUE;
                        Object obj4 = gc1Var.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = gc1Var.k;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            j1g j1gVar2 = (j1g) ((Map) obj).get(this.c);
                            if (j1gVar2 == null) {
                                j1gVar2 = j1g.b;
                            }
                            gc1Var.k = 1;
                            if (this.b.emit(j1gVar2, gc1Var) == nm6Var4) {
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
                gc1Var = new gc1(this, continuation);
                Object obj42 = gc1Var.j;
                nm6 nm6Var42 = nm6.a;
                i3 = gc1Var.k;
                if (i3 != 0) {
                }
                break;
            case 3:
                if (continuation instanceof yb5) {
                    yb5Var = (yb5) continuation;
                    int i16 = yb5Var.k;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        yb5Var.k = i16 - Integer.MIN_VALUE;
                        Object obj5 = yb5Var.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = yb5Var.k;
                        if (i4 != 0) {
                            qgg.h0(obj5);
                            e6l e6lVar = (e6l) obj;
                            d6l x = p6g.x(e6lVar);
                            n7q n7qVar = x != null ? x.a : null;
                            kw kwVar = (n7qVar == null || !up6.B(n7qVar, this.c)) ? kw.a : p6g.C(e6lVar) ? kw.b : kw.c;
                            yb5Var.k = 1;
                            if (this.b.emit(kwVar, yb5Var) == nm6Var5) {
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
                yb5Var = new yb5(this, continuation);
                Object obj52 = yb5Var.j;
                nm6 nm6Var52 = nm6.a;
                i4 = yb5Var.k;
                if (i4 != 0) {
                }
                break;
            case 4:
                if (continuation instanceof l87) {
                    l87Var = (l87) continuation;
                    int i17 = l87Var.k;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        l87Var.k = i17 - Integer.MIN_VALUE;
                        Object obj6 = l87Var.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = l87Var.k;
                        if (i5 != 0) {
                            qgg.h0(obj6);
                            String str = (String) obj;
                            if (str == null) {
                                str = this.c;
                            }
                            l87Var.k = 1;
                            if (this.b.emit(str, l87Var) == nm6Var6) {
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
                l87Var = new l87(this, continuation);
                Object obj62 = l87Var.j;
                nm6 nm6Var62 = nm6.a;
                i5 = l87Var.k;
                if (i5 != 0) {
                }
                break;
            case 5:
                if (continuation instanceof c3m) {
                    c3mVar = (c3m) continuation;
                    int i18 = c3mVar.k;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        c3mVar.k = i18 - Integer.MIN_VALUE;
                        Object obj7 = c3mVar.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = c3mVar.k;
                        if (i6 != 0) {
                            qgg.h0(obj7);
                            c3mVar.k = 1;
                            if (this.b.emit(this.c, c3mVar) == nm6Var7) {
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
                c3mVar = new c3m(this, continuation);
                Object obj72 = c3mVar.j;
                nm6 nm6Var72 = nm6.a;
                i6 = c3mVar.k;
                if (i6 != 0) {
                }
                break;
            case 6:
                if (continuation instanceof x4u) {
                    x4uVar = (x4u) continuation;
                    int i19 = x4uVar.k;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        x4uVar.k = i19 - Integer.MIN_VALUE;
                        Object obj8 = x4uVar.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = x4uVar.k;
                        if (i7 != 0) {
                            qgg.h0(obj8);
                            j1g j1gVar3 = (j1g) ((Map) obj).get(this.c);
                            if (j1gVar3 == null) {
                                j1gVar3 = j1g.b;
                            }
                            x4uVar.k = 1;
                            if (this.b.emit(j1gVar3, x4uVar) == nm6Var8) {
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
                x4uVar = new x4u(this, continuation);
                Object obj82 = x4uVar.j;
                nm6 nm6Var82 = nm6.a;
                i7 = x4uVar.k;
                if (i7 != 0) {
                }
                break;
            case 7:
                if (continuation instanceof lcw) {
                    lcwVar = (lcw) continuation;
                    int i20 = lcwVar.k;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        lcwVar.k = i20 - Integer.MIN_VALUE;
                        Object obj9 = lcwVar.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = lcwVar.k;
                        if (i8 != 0) {
                            qgg.h0(obj9);
                            if (((jcw) obj).b(this.c)) {
                                lcwVar.k = 1;
                                if (this.b.emit(obj, lcwVar) == nm6Var9) {
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
                lcwVar = new lcw(this, continuation);
                Object obj92 = lcwVar.j;
                nm6 nm6Var92 = nm6.a;
                i8 = lcwVar.k;
                if (i8 != 0) {
                }
                break;
            case 8:
                if (continuation instanceof ncw) {
                    ncwVar = (ncw) continuation;
                    int i21 = ncwVar.k;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        ncwVar.k = i21 - Integer.MIN_VALUE;
                        Object obj10 = ncwVar.j;
                        nm6 nm6Var10 = nm6.a;
                        i9 = ncwVar.k;
                        if (i9 != 0) {
                            qgg.h0(obj10);
                            if (((jcw) obj).b(this.c)) {
                                ncwVar.k = 1;
                                if (this.b.emit(obj, ncwVar) == nm6Var10) {
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
                ncwVar = new ncw(this, continuation);
                Object obj102 = ncwVar.j;
                nm6 nm6Var102 = nm6.a;
                i9 = ncwVar.k;
                if (i9 != 0) {
                }
                break;
            case 9:
                if (continuation instanceof ocw) {
                    ocwVar = (ocw) continuation;
                    int i22 = ocwVar.k;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        ocwVar.k = i22 - Integer.MIN_VALUE;
                        Object obj11 = ocwVar.j;
                        nm6 nm6Var11 = nm6.a;
                        i10 = ocwVar.k;
                        if (i10 != 0) {
                            qgg.h0(obj11);
                            if (((jcw) obj).b(this.c)) {
                                ocwVar.k = 1;
                                if (this.b.emit(obj, ocwVar) == nm6Var11) {
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
                ocwVar = new ocw(this, continuation);
                Object obj112 = ocwVar.j;
                nm6 nm6Var112 = nm6.a;
                i10 = ocwVar.k;
                if (i10 != 0) {
                }
                break;
            case 10:
                if (continuation instanceof pcw) {
                    pcwVar = (pcw) continuation;
                    int i23 = pcwVar.k;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        pcwVar.k = i23 - Integer.MIN_VALUE;
                        Object obj12 = pcwVar.j;
                        nm6 nm6Var12 = nm6.a;
                        i11 = pcwVar.k;
                        if (i11 != 0) {
                            qgg.h0(obj12);
                            if (((jcw) obj).b(this.c)) {
                                pcwVar.k = 1;
                                if (this.b.emit(obj, pcwVar) == nm6Var12) {
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
                pcwVar = new pcw(this, continuation);
                Object obj122 = pcwVar.j;
                nm6 nm6Var122 = nm6.a;
                i11 = pcwVar.k;
                if (i11 != 0) {
                }
                break;
            default:
                if (continuation instanceof rew) {
                    rewVar = (rew) continuation;
                    int i24 = rewVar.k;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        rewVar.k = i24 - Integer.MIN_VALUE;
                        Object obj13 = rewVar.j;
                        nm6 nm6Var13 = nm6.a;
                        i12 = rewVar.k;
                        if (i12 != 0) {
                            qgg.h0(obj13);
                            how howVar = (how) ((Pair) obj).b;
                            if (Intrinsics.d((howVar == null || (gowVar = howVar.c) == null) ? null : gowVar.a, this.c)) {
                                rewVar.k = 1;
                                if (this.b.emit(obj, rewVar) == nm6Var13) {
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
                rewVar = new rew(this, continuation);
                Object obj132 = rewVar.j;
                nm6 nm6Var132 = nm6.a;
                i12 = rewVar.k;
                if (i12 != 0) {
                }
                break;
        }
        return Unit.a;
    }
}
