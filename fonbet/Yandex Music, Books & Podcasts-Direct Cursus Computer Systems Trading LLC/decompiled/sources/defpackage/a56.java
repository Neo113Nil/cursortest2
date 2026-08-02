package defpackage;

import android.net.Uri;
import com.yandex.passport.api.h0;
import com.yandex.passport.api.i0;
import com.yandex.passport.api.j0;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a56 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;

    public /* synthetic */ a56(rjc rjcVar, int i) {
        this.a = i;
        this.b = rjcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0982  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x09e6  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x0a2c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01be  */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        z46 z46Var;
        int i;
        w96 w96Var;
        int i2;
        ja6 ja6Var;
        int i3;
        rh6 rh6Var;
        int i4;
        xh6 wh6Var;
        xh6 xh6Var;
        bl6 bl6Var;
        int i5;
        Object cnVar;
        Object u7oVar;
        uu6 uu6Var;
        int i6;
        i87 i87Var;
        int i7;
        k87 k87Var;
        int i8;
        tb7 tb7Var;
        int i9;
        jq7 jq7Var;
        int i10;
        lq7 lq7Var;
        int i11;
        mq7 mq7Var;
        int i12;
        uw7 uw7Var;
        int i13;
        vw7 vw7Var;
        w78 w78Var;
        int i14;
        y78 y78Var;
        int i15;
        a88 a88Var;
        int i16;
        at8 at8Var;
        int i17;
        z9a z9aVar;
        int i18;
        bba bbaVar;
        int i19;
        pba pbaVar;
        int i20;
        aca acaVar;
        int i21;
        hea heaVar;
        int i22;
        iea ieaVar;
        int i23;
        nfa nfaVar;
        int i24;
        ofa ofaVar;
        int i25;
        pfa pfaVar;
        int i26;
        aga agaVar;
        int i27;
        uha uhaVar;
        int i28;
        vha vhaVar;
        int i29;
        qia qiaVar;
        int i30;
        int i31 = this.a;
        rjc rjcVar = this.b;
        switch (i31) {
            case 0:
                if (continuation instanceof z46) {
                    z46Var = (z46) continuation;
                    int i32 = z46Var.k;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        z46Var.k = i32 - Integer.MIN_VALUE;
                        Object obj2 = z46Var.j;
                        nm6 nm6Var = nm6.a;
                        i = z46Var.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            Object obj3 = ((Pair) obj).b;
                            if (obj3 != null) {
                                z46Var.k = 1;
                                if (rjcVar.emit(obj3, z46Var) == nm6Var) {
                                    break;
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
                z46Var = new z46(this, continuation);
                Object obj22 = z46Var.j;
                nm6 nm6Var2 = nm6.a;
                i = z46Var.k;
                if (i != 0) {
                }
            case 1:
                if (continuation instanceof w96) {
                    w96Var = (w96) continuation;
                    int i33 = w96Var.k;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        w96Var.k = i33 - Integer.MIN_VALUE;
                        Object obj4 = w96Var.j;
                        nm6 nm6Var3 = nm6.a;
                        i2 = w96Var.k;
                        if (i2 != 0) {
                            qgg.h0(obj4);
                            if (obj instanceof ma6) {
                                w96Var.k = 1;
                                if (rjcVar.emit(obj, w96Var) == nm6Var3) {
                                    break;
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
                w96Var = new w96(this, continuation);
                Object obj42 = w96Var.j;
                nm6 nm6Var32 = nm6.a;
                i2 = w96Var.k;
                if (i2 != 0) {
                }
            case 2:
                if (continuation instanceof ja6) {
                    ja6Var = (ja6) continuation;
                    int i34 = ja6Var.k;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        ja6Var.k = i34 - Integer.MIN_VALUE;
                        Object obj5 = ja6Var.j;
                        nm6 nm6Var4 = nm6.a;
                        i3 = ja6Var.k;
                        if (i3 != 0) {
                            qgg.h0(obj5);
                            long j = ((ga6) obj).a;
                            xkn xknVar = zvt.b;
                            x97 x97Var = r38.n;
                            if (!ga6.l(j)) {
                                x97 q38Var = ga6.e(j) ? new q38(ga6.i(j)) : x97Var;
                                if (ga6.d(j)) {
                                    x97Var = new q38(ga6.h(j));
                                }
                                r10 = new lmq(q38Var, x97Var);
                            }
                            if (r10 != null) {
                                ja6Var.k = 1;
                                if (rjcVar.emit(r10, ja6Var) == nm6Var4) {
                                    break;
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
                ja6Var = new ja6(this, continuation);
                Object obj52 = ja6Var.j;
                nm6 nm6Var42 = nm6.a;
                i3 = ja6Var.k;
                if (i3 != 0) {
                }
            case 3:
                if (continuation instanceof rh6) {
                    rh6Var = (rh6) continuation;
                    int i35 = rh6Var.k;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        rh6Var.k = i35 - Integer.MIN_VALUE;
                        Object obj6 = rh6Var.j;
                        nm6 nm6Var5 = nm6.a;
                        i4 = rh6Var.k;
                        if (i4 != 0) {
                            qgg.h0(obj6);
                            kri kriVar = (kri) obj;
                            if (Intrinsics.d(kriVar, gri.a)) {
                                xh6Var = th6.a;
                            } else {
                                if (!(kriVar instanceof fri)) {
                                    if (!(kriVar instanceof hri)) {
                                        if (!(kriVar instanceof iri)) {
                                            if (!(kriVar instanceof jri)) {
                                                b6e.s();
                                                break;
                                            } else {
                                                wh6Var = new wh6(((jri) kriVar).a);
                                            }
                                        } else {
                                            iri iriVar = (iri) kriVar;
                                            wh6Var = new vh6(iriVar.a, iriVar.b);
                                        }
                                    } else {
                                        hri hriVar = (hri) kriVar;
                                        wh6Var = new uh6(hriVar.a, hriVar.b);
                                    }
                                } else {
                                    fri friVar = (fri) kriVar;
                                    wh6Var = new sh6(friVar.a, friVar.b);
                                }
                                xh6Var = wh6Var;
                            }
                            rh6Var.k = 1;
                            if (rjcVar.emit(xh6Var, rh6Var) == nm6Var5) {
                                break;
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
                rh6Var = new rh6(this, continuation);
                Object obj62 = rh6Var.j;
                nm6 nm6Var52 = nm6.a;
                i4 = rh6Var.k;
                if (i4 != 0) {
                }
            case 4:
                if (continuation instanceof bl6) {
                    bl6Var = (bl6) continuation;
                    int i36 = bl6Var.k;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        bl6Var.k = i36 - Integer.MIN_VALUE;
                        Object obj7 = bl6Var.j;
                        nm6 nm6Var6 = nm6.a;
                        i5 = bl6Var.k;
                        if (i5 != 0) {
                            qgg.h0(obj7);
                            w7o w7oVar = (w7o) obj;
                            if (!(w7oVar instanceof s7o)) {
                                if (w7oVar instanceof u7o) {
                                    fgm fgmVar = (fgm) ((u7o) w7oVar).a;
                                    if (fgmVar instanceof cgm) {
                                        u7oVar = new u7o(new ym(((cgm) fgmVar).a));
                                    } else if (fgmVar instanceof egm) {
                                        u7oVar = new u7o(new zm(ggk.a));
                                    } else if (fgmVar instanceof dgm) {
                                        t9i t9iVar = ((dgm) fgmVar).a;
                                        if (t9iVar instanceof va4) {
                                            va4 va4Var = (va4) t9iVar;
                                            cnVar = new bn(va4Var.b, va4Var.c);
                                        } else if (t9iVar instanceof cb4) {
                                            cb4 cb4Var = (cb4) t9iVar;
                                            Uri parse = Uri.parse(cb4Var.b);
                                            parse.getClass();
                                            cnVar = new dn(parse, cb4Var.c);
                                        } else {
                                            cnVar = t9iVar instanceof xa4 ? true : t9iVar instanceof db4 ? true : t9iVar instanceof ab4 ? true : t9iVar instanceof fb4 ? new cn(t9iVar) : t9iVar instanceof bb4 ? new an(((bb4) t9iVar).b) : new zm(ggk.b);
                                        }
                                        u7oVar = new u7o(cnVar);
                                    }
                                }
                                b6e.s();
                                break;
                            } else {
                                u7oVar = new s7o(((s7o) w7oVar).a);
                            }
                            bl6Var.k = 1;
                            if (rjcVar.emit(u7oVar, bl6Var) == nm6Var6) {
                                break;
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
                bl6Var = new bl6(this, continuation);
                Object obj72 = bl6Var.j;
                nm6 nm6Var62 = nm6.a;
                i5 = bl6Var.k;
                if (i5 != 0) {
                }
            case 5:
                if (continuation instanceof uu6) {
                    uu6Var = (uu6) continuation;
                    int i37 = uu6Var.k;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        uu6Var.k = i37 - Integer.MIN_VALUE;
                        Object obj8 = uu6Var.j;
                        nm6 nm6Var7 = nm6.a;
                        i6 = uu6Var.k;
                        if (i6 != 0) {
                            qgg.h0(obj8);
                            Boolean valueOf = Boolean.valueOf(!(((mjs) obj) instanceof ijs));
                            uu6Var.k = 1;
                            if (rjcVar.emit(valueOf, uu6Var) == nm6Var7) {
                                break;
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
                uu6Var = new uu6(this, continuation);
                Object obj82 = uu6Var.j;
                nm6 nm6Var72 = nm6.a;
                i6 = uu6Var.k;
                if (i6 != 0) {
                }
            case 6:
                if (continuation instanceof i87) {
                    i87Var = (i87) continuation;
                    int i38 = i87Var.k;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        i87Var.k = i38 - Integer.MIN_VALUE;
                        Object obj9 = i87Var.j;
                        nm6 nm6Var8 = nm6.a;
                        i7 = i87Var.k;
                        if (i7 != 0) {
                            qgg.h0(obj9);
                            Boolean bool = (Boolean) obj;
                            Boolean valueOf2 = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                            i87Var.k = 1;
                            if (rjcVar.emit(valueOf2, i87Var) == nm6Var8) {
                                break;
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
                i87Var = new i87(this, continuation);
                Object obj92 = i87Var.j;
                nm6 nm6Var82 = nm6.a;
                i7 = i87Var.k;
                if (i7 != 0) {
                }
            case 7:
                if (continuation instanceof k87) {
                    k87Var = (k87) continuation;
                    int i39 = k87Var.k;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        k87Var.k = i39 - Integer.MIN_VALUE;
                        Object obj10 = k87Var.j;
                        nm6 nm6Var9 = nm6.a;
                        i8 = k87Var.k;
                        if (i8 != 0) {
                            qgg.h0(obj10);
                            Object obj11 = (z77) obj;
                            if (obj11 == null) {
                                obj11 = xdb.a;
                            }
                            k87Var.k = 1;
                            if (rjcVar.emit(obj11, k87Var) == nm6Var9) {
                                break;
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
                k87Var = new k87(this, continuation);
                Object obj102 = k87Var.j;
                nm6 nm6Var92 = nm6.a;
                i8 = k87Var.k;
                if (i8 != 0) {
                }
            case 8:
                if (continuation instanceof tb7) {
                    tb7Var = (tb7) continuation;
                    int i40 = tb7Var.k;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        tb7Var.k = i40 - Integer.MIN_VALUE;
                        Object obj12 = tb7Var.j;
                        nm6 nm6Var10 = nm6.a;
                        i9 = tb7Var.k;
                        if (i9 != 0) {
                            qgg.h0(obj12);
                            sb7 sb7Var = (sb7) obj;
                            if (!(sb7Var instanceof pb7)) {
                                if (!(sb7Var instanceof qb7)) {
                                    if (!(sb7Var instanceof rb7)) {
                                        if (!(sb7Var instanceof ob7)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            xq0.q("Cannot read from closed storage");
                                            break;
                                        }
                                    }
                                } else {
                                    r10 = ((qb7) sb7Var).a;
                                }
                            }
                            tb7Var.k = 1;
                            if (rjcVar.emit(r10, tb7Var) == nm6Var10) {
                                break;
                            }
                        } else if (i9 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj12);
                        }
                        break;
                    }
                }
                tb7Var = new tb7(this, continuation);
                Object obj122 = tb7Var.j;
                nm6 nm6Var102 = nm6.a;
                i9 = tb7Var.k;
                if (i9 != 0) {
                }
            case 9:
                if (continuation instanceof jq7) {
                    jq7Var = (jq7) continuation;
                    int i41 = jq7Var.k;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        jq7Var.k = i41 - Integer.MIN_VALUE;
                        Object obj13 = jq7Var.j;
                        nm6 nm6Var11 = nm6.a;
                        i10 = jq7Var.k;
                        if (i10 != 0) {
                            qgg.h0(obj13);
                            kq7 c = nq7.c((e6l) obj);
                            Boolean bool2 = c.a;
                            if (bool2 != null) {
                                String str = c.b;
                                if (str == null) {
                                    ssg.a(3, "DefaultSharedGenerativePlaybackQueue", "watchPlaybackState: skip feedback – no active generative stream", null);
                                } else {
                                    r10 = new Pair(bool2, str);
                                }
                            }
                            if (r10 != null) {
                                jq7Var.k = 1;
                                if (rjcVar.emit(r10, jq7Var) == nm6Var11) {
                                    break;
                                }
                            }
                        } else if (i10 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj13);
                        }
                        break;
                    }
                }
                jq7Var = new jq7(this, continuation);
                Object obj132 = jq7Var.j;
                nm6 nm6Var112 = nm6.a;
                i10 = jq7Var.k;
                if (i10 != 0) {
                }
            case 10:
                if (continuation instanceof lq7) {
                    lq7Var = (lq7) continuation;
                    int i42 = lq7Var.k;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        lq7Var.k = i42 - Integer.MIN_VALUE;
                        Object obj14 = lq7Var.j;
                        nm6 nm6Var12 = nm6.a;
                        i11 = lq7Var.k;
                        if (i11 != 0) {
                            qgg.h0(obj14);
                            d6l d6lVar = (d6l) obj;
                            if ((d6lVar.a.b() instanceof k4d) && d6lVar.c == v0l.d) {
                                lq7Var.k = 1;
                                if (rjcVar.emit(obj, lq7Var) == nm6Var12) {
                                    break;
                                }
                            }
                        } else if (i11 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj14);
                        }
                        break;
                    }
                }
                lq7Var = new lq7(this, continuation);
                Object obj142 = lq7Var.j;
                nm6 nm6Var122 = nm6.a;
                i11 = lq7Var.k;
                if (i11 != 0) {
                }
                break;
            case 11:
                if (continuation instanceof mq7) {
                    mq7Var = (mq7) continuation;
                    int i43 = mq7Var.k;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        mq7Var.k = i43 - Integer.MIN_VALUE;
                        Object obj15 = mq7Var.j;
                        nm6 nm6Var13 = nm6.a;
                        i12 = mq7Var.k;
                        if (i12 != 0) {
                            qgg.h0(obj15);
                            if (obj instanceof d6l) {
                                mq7Var.k = 1;
                                if (rjcVar.emit(obj, mq7Var) == nm6Var13) {
                                    break;
                                }
                            }
                        } else if (i12 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj15);
                        }
                        break;
                    }
                }
                mq7Var = new mq7(this, continuation);
                Object obj152 = mq7Var.j;
                nm6 nm6Var132 = nm6.a;
                i12 = mq7Var.k;
                if (i12 != 0) {
                }
            case 12:
                if (continuation instanceof uw7) {
                    uw7Var = (uw7) continuation;
                    int i44 = uw7Var.k;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        uw7Var.k = i44 - Integer.MIN_VALUE;
                        Object obj16 = uw7Var.j;
                        nm6 nm6Var14 = nm6.a;
                        i13 = uw7Var.k;
                        if (i13 != 0) {
                            qgg.h0(obj16);
                            j0 j0Var = (j0) obj;
                            if (!Intrinsics.d(j0Var, h0.a)) {
                                if (!(j0Var instanceof i0)) {
                                    if (!Intrinsics.d(j0Var, h0.b)) {
                                        if (!Intrinsics.d(j0Var, h0.c)) {
                                            b6e.s();
                                            break;
                                        } else {
                                            vw7Var = vw7.a;
                                        }
                                    } else {
                                        vw7Var = vw7.b;
                                    }
                                } else {
                                    vw7Var = vw7.b;
                                }
                            } else {
                                vw7Var = vw7.c;
                            }
                            uw7Var.k = 1;
                            if (rjcVar.emit(vw7Var, uw7Var) == nm6Var14) {
                                break;
                            }
                        } else if (i13 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj16);
                        }
                        break;
                    }
                }
                uw7Var = new uw7(this, continuation);
                Object obj162 = uw7Var.j;
                nm6 nm6Var142 = nm6.a;
                i13 = uw7Var.k;
                if (i13 != 0) {
                }
            case 13:
                if (continuation instanceof w78) {
                    w78Var = (w78) continuation;
                    int i45 = w78Var.k;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        w78Var.k = i45 - Integer.MIN_VALUE;
                        Object obj17 = w78Var.j;
                        nm6 nm6Var15 = nm6.a;
                        i14 = w78Var.k;
                        if (i14 != 0) {
                            qgg.h0(obj17);
                            if (((drc) obj).a) {
                                w78Var.k = 1;
                                if (rjcVar.emit(obj, w78Var) == nm6Var15) {
                                    break;
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
                w78Var = new w78(this, continuation);
                Object obj172 = w78Var.j;
                nm6 nm6Var152 = nm6.a;
                i14 = w78Var.k;
                if (i14 != 0) {
                }
            case 14:
                if (continuation instanceof y78) {
                    y78Var = (y78) continuation;
                    int i46 = y78Var.k;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        y78Var.k = i46 - Integer.MIN_VALUE;
                        Object obj18 = y78Var.j;
                        nm6 nm6Var16 = nm6.a;
                        i15 = y78Var.k;
                        if (i15 != 0) {
                            qgg.h0(obj18);
                            Long l = new Long(((p78) obj).c);
                            y78Var.k = 1;
                            if (rjcVar.emit(l, y78Var) == nm6Var16) {
                                break;
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
                y78Var = new y78(this, continuation);
                Object obj182 = y78Var.j;
                nm6 nm6Var162 = nm6.a;
                i15 = y78Var.k;
                if (i15 != 0) {
                }
            case 15:
                if (continuation instanceof a88) {
                    a88Var = (a88) continuation;
                    int i47 = a88Var.k;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        a88Var.k = i47 - Integer.MIN_VALUE;
                        Object obj19 = a88Var.j;
                        nm6 nm6Var17 = nm6.a;
                        i16 = a88Var.k;
                        if (i16 != 0) {
                            qgg.h0(obj19);
                            p78 p78Var = (p78) obj;
                            Boolean valueOf3 = Boolean.valueOf(p78Var != null ? p78Var.d : false);
                            a88Var.k = 1;
                            if (rjcVar.emit(valueOf3, a88Var) == nm6Var17) {
                                break;
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
                a88Var = new a88(this, continuation);
                Object obj192 = a88Var.j;
                nm6 nm6Var172 = nm6.a;
                i16 = a88Var.k;
                if (i16 != 0) {
                }
            case 16:
                if (continuation instanceof at8) {
                    at8Var = (at8) continuation;
                    int i48 = at8Var.k;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        at8Var.k = i48 - Integer.MIN_VALUE;
                        Object obj20 = at8Var.j;
                        nm6 nm6Var18 = nm6.a;
                        i17 = at8Var.k;
                        if (i17 != 0) {
                            qgg.h0(obj20);
                            int intValue = ((Number) obj).intValue();
                            if ((intValue >= 0 && intValue < 61) || (300 <= intValue && intValue < 361)) {
                                r4 = true;
                            }
                            Boolean valueOf4 = Boolean.valueOf(r4);
                            at8Var.k = 1;
                            if (rjcVar.emit(valueOf4, at8Var) == nm6Var18) {
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
                at8Var = new at8(this, continuation);
                Object obj202 = at8Var.j;
                nm6 nm6Var182 = nm6.a;
                i17 = at8Var.k;
                if (i17 != 0) {
                }
                break;
            case 17:
                if (continuation instanceof z9a) {
                    z9aVar = (z9a) continuation;
                    int i49 = z9aVar.k;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        z9aVar.k = i49 - Integer.MIN_VALUE;
                        Object obj21 = z9aVar.j;
                        nm6 nm6Var19 = nm6.a;
                        i18 = z9aVar.k;
                        if (i18 != 0) {
                            qgg.h0(obj21);
                            if (((xxq) obj).a()) {
                                z9aVar.k = 1;
                                if (rjcVar.emit(obj, z9aVar) == nm6Var19) {
                                    break;
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
                z9aVar = new z9a(this, continuation);
                Object obj212 = z9aVar.j;
                nm6 nm6Var192 = nm6.a;
                i18 = z9aVar.k;
                if (i18 != 0) {
                }
            case 18:
                if (continuation instanceof bba) {
                    bbaVar = (bba) continuation;
                    int i50 = bbaVar.k;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        bbaVar.k = i50 - Integer.MIN_VALUE;
                        Object obj23 = bbaVar.j;
                        nm6 nm6Var20 = nm6.a;
                        i19 = bbaVar.k;
                        if (i19 != 0) {
                            qgg.h0(obj23);
                            if (((xxq) obj).a()) {
                                bbaVar.k = 1;
                                if (rjcVar.emit(obj, bbaVar) == nm6Var20) {
                                    break;
                                }
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
                bbaVar = new bba(this, continuation);
                Object obj232 = bbaVar.j;
                nm6 nm6Var202 = nm6.a;
                i19 = bbaVar.k;
                if (i19 != 0) {
                }
            case 19:
                if (continuation instanceof pba) {
                    pbaVar = (pba) continuation;
                    int i51 = pbaVar.k;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        pbaVar.k = i51 - Integer.MIN_VALUE;
                        Object obj24 = pbaVar.j;
                        nm6 nm6Var21 = nm6.a;
                        i20 = pbaVar.k;
                        if (i20 != 0) {
                            qgg.h0(obj24);
                            Boolean valueOf5 = Boolean.valueOf(!((fba) obj).a.isEmpty());
                            pbaVar.k = 1;
                            if (rjcVar.emit(valueOf5, pbaVar) == nm6Var21) {
                                break;
                            }
                        } else if (i20 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj24);
                        }
                        break;
                    }
                }
                pbaVar = new pba(this, continuation);
                Object obj242 = pbaVar.j;
                nm6 nm6Var212 = nm6.a;
                i20 = pbaVar.k;
                if (i20 != 0) {
                }
            case 20:
                if (continuation instanceof aca) {
                    acaVar = (aca) continuation;
                    int i52 = acaVar.k;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        acaVar.k = i52 - Integer.MIN_VALUE;
                        Object obj25 = acaVar.j;
                        nm6 nm6Var22 = nm6.a;
                        i21 = acaVar.k;
                        if (i21 != 0) {
                            qgg.h0(obj25);
                            Set entrySet = ((fba) obj).a.entrySet();
                            entrySet.getClass();
                            Map.Entry entry = (Map.Entry) CollectionsKt.R(entrySet);
                            r10 = entry != null ? (gba) entry.getValue() : null;
                            acaVar.k = 1;
                            if (rjcVar.emit(r10, acaVar) == nm6Var22) {
                                break;
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
                acaVar = new aca(this, continuation);
                Object obj252 = acaVar.j;
                nm6 nm6Var222 = nm6.a;
                i21 = acaVar.k;
                if (i21 != 0) {
                }
            case 21:
                if (continuation instanceof hea) {
                    heaVar = (hea) continuation;
                    int i53 = heaVar.k;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        heaVar.k = i53 - Integer.MIN_VALUE;
                        Object obj26 = heaVar.j;
                        nm6 nm6Var23 = nm6.a;
                        i22 = heaVar.k;
                        if (i22 != 0) {
                            qgg.h0(obj26);
                            List list = (List) obj;
                            ArrayList arrayList = new ArrayList(v75.o(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((jja) it.next()).a);
                            }
                            heaVar.k = 1;
                            if (rjcVar.emit(arrayList, heaVar) == nm6Var23) {
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
                heaVar = new hea(this, continuation);
                Object obj262 = heaVar.j;
                nm6 nm6Var232 = nm6.a;
                i22 = heaVar.k;
                if (i22 != 0) {
                }
            case 22:
                if (continuation instanceof iea) {
                    ieaVar = (iea) continuation;
                    int i54 = ieaVar.k;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        ieaVar.k = i54 - Integer.MIN_VALUE;
                        Object obj27 = ieaVar.j;
                        nm6 nm6Var24 = nm6.a;
                        i23 = ieaVar.k;
                        if (i23 != 0) {
                            qgg.h0(obj27);
                            List list2 = (List) obj;
                            ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((kca) it2.next()).a);
                            }
                            ieaVar.k = 1;
                            if (rjcVar.emit(arrayList2, ieaVar) == nm6Var24) {
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
                ieaVar = new iea(this, continuation);
                Object obj272 = ieaVar.j;
                nm6 nm6Var242 = nm6.a;
                i23 = ieaVar.k;
                if (i23 != 0) {
                }
            case 23:
                if (continuation instanceof nfa) {
                    nfaVar = (nfa) continuation;
                    int i55 = nfaVar.k;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        nfaVar.k = i55 - Integer.MIN_VALUE;
                        Object obj28 = nfaVar.j;
                        nm6 nm6Var25 = nm6.a;
                        i24 = nfaVar.k;
                        if (i24 != 0) {
                            qgg.h0(obj28);
                            List list3 = (List) obj;
                            ArrayList arrayList3 = new ArrayList(v75.o(list3, 10));
                            Iterator it3 = list3.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(((kca) it3.next()).a);
                            }
                            nfaVar.k = 1;
                            if (rjcVar.emit(arrayList3, nfaVar) == nm6Var25) {
                                break;
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
                nfaVar = new nfa(this, continuation);
                Object obj282 = nfaVar.j;
                nm6 nm6Var252 = nm6.a;
                i24 = nfaVar.k;
                if (i24 != 0) {
                }
            case 24:
                if (continuation instanceof ofa) {
                    ofaVar = (ofa) continuation;
                    int i56 = ofaVar.k;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        ofaVar.k = i56 - Integer.MIN_VALUE;
                        Object obj29 = ofaVar.j;
                        nm6 nm6Var26 = nm6.a;
                        i25 = ofaVar.k;
                        if (i25 != 0) {
                            qgg.h0(obj29);
                            List list4 = (List) obj;
                            ArrayList arrayList4 = new ArrayList(v75.o(list4, 10));
                            Iterator it4 = list4.iterator();
                            while (it4.hasNext()) {
                                arrayList4.add(((gga) it4.next()).a);
                            }
                            ofaVar.k = 1;
                            if (rjcVar.emit(arrayList4, ofaVar) == nm6Var26) {
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
                ofaVar = new ofa(this, continuation);
                Object obj292 = ofaVar.j;
                nm6 nm6Var262 = nm6.a;
                i25 = ofaVar.k;
                if (i25 != 0) {
                }
            case 25:
                if (continuation instanceof pfa) {
                    pfaVar = (pfa) continuation;
                    int i57 = pfaVar.k;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        pfaVar.k = i57 - Integer.MIN_VALUE;
                        Object obj30 = pfaVar.j;
                        nm6 nm6Var27 = nm6.a;
                        i26 = pfaVar.k;
                        if (i26 != 0) {
                            qgg.h0(obj30);
                            List list5 = (List) obj;
                            ArrayList arrayList5 = new ArrayList(v75.o(list5, 10));
                            Iterator it5 = list5.iterator();
                            while (it5.hasNext()) {
                                arrayList5.add(((jja) it5.next()).a);
                            }
                            pfaVar.k = 1;
                            if (rjcVar.emit(arrayList5, pfaVar) == nm6Var27) {
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
                pfaVar = new pfa(this, continuation);
                Object obj302 = pfaVar.j;
                nm6 nm6Var272 = nm6.a;
                i26 = pfaVar.k;
                if (i26 != 0) {
                }
            case 26:
                if (continuation instanceof aga) {
                    agaVar = (aga) continuation;
                    int i58 = agaVar.k;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        agaVar.k = i58 - Integer.MIN_VALUE;
                        Object obj31 = agaVar.j;
                        nm6 nm6Var28 = nm6.a;
                        i27 = agaVar.k;
                        if (i27 != 0) {
                            qgg.h0(obj31);
                            Boolean valueOf6 = Boolean.valueOf(!((lja) obj).a.isEmpty());
                            agaVar.k = 1;
                            if (rjcVar.emit(valueOf6, agaVar) == nm6Var28) {
                                break;
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
                agaVar = new aga(this, continuation);
                Object obj312 = agaVar.j;
                nm6 nm6Var282 = nm6.a;
                i27 = agaVar.k;
                if (i27 != 0) {
                }
            case 27:
                if (continuation instanceof uha) {
                    uhaVar = (uha) continuation;
                    int i59 = uhaVar.k;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        uhaVar.k = i59 - Integer.MIN_VALUE;
                        Object obj32 = uhaVar.j;
                        nm6 nm6Var29 = nm6.a;
                        i28 = uhaVar.k;
                        if (i28 != 0) {
                            qgg.h0(obj32);
                            List list6 = (List) obj;
                            ArrayList arrayList6 = new ArrayList(v75.o(list6, 10));
                            Iterator it6 = list6.iterator();
                            while (it6.hasNext()) {
                                arrayList6.add(((jja) it6.next()).a);
                            }
                            uhaVar.k = 1;
                            if (rjcVar.emit(arrayList6, uhaVar) == nm6Var29) {
                                break;
                            }
                        } else if (i28 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj32);
                        }
                        break;
                    }
                }
                uhaVar = new uha(this, continuation);
                Object obj322 = uhaVar.j;
                nm6 nm6Var292 = nm6.a;
                i28 = uhaVar.k;
                if (i28 != 0) {
                }
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                if (continuation instanceof vha) {
                    vhaVar = (vha) continuation;
                    int i60 = vhaVar.k;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        vhaVar.k = i60 - Integer.MIN_VALUE;
                        Object obj33 = vhaVar.j;
                        nm6 nm6Var30 = nm6.a;
                        i29 = vhaVar.k;
                        if (i29 != 0) {
                            qgg.h0(obj33);
                            List list7 = (List) obj;
                            ArrayList arrayList7 = new ArrayList(v75.o(list7, 10));
                            Iterator it7 = list7.iterator();
                            while (it7.hasNext()) {
                                arrayList7.add(((kca) it7.next()).a);
                            }
                            vhaVar.k = 1;
                            if (rjcVar.emit(arrayList7, vhaVar) == nm6Var30) {
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
                vhaVar = new vha(this, continuation);
                Object obj332 = vhaVar.j;
                nm6 nm6Var302 = nm6.a;
                i29 = vhaVar.k;
                if (i29 != 0) {
                }
            default:
                if (continuation instanceof qia) {
                    qiaVar = (qia) continuation;
                    int i61 = qiaVar.k;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        qiaVar.k = i61 - Integer.MIN_VALUE;
                        Object obj34 = qiaVar.j;
                        nm6 nm6Var31 = nm6.a;
                        i30 = qiaVar.k;
                        if (i30 != 0) {
                            qgg.h0(obj34);
                            l4t l4tVar = (l4t) obj;
                            k4t k4tVar = l4tVar.a;
                            iia iiaVar = new iia(k4tVar.b, k4tVar.a);
                            k4t k4tVar2 = l4tVar.b;
                            iia iiaVar2 = new iia(k4tVar2.b, k4tVar2.a);
                            k4t k4tVar3 = l4tVar.c;
                            iia iiaVar3 = new iia(k4tVar3.b, k4tVar3.a);
                            k4t k4tVar4 = l4tVar.d;
                            iia iiaVar4 = new iia(k4tVar4.b, k4tVar4.a);
                            k4t k4tVar5 = l4tVar.e;
                            iia iiaVar5 = new iia(k4tVar5.b, k4tVar5.a);
                            k4t k4tVar6 = l4tVar.f;
                            kia kiaVar = new kia(iiaVar, iiaVar2, iiaVar3, iiaVar4, iiaVar5, new iia(k4tVar6.b, k4tVar6.a));
                            qiaVar.k = 1;
                            if (rjcVar.emit(kiaVar, qiaVar) == nm6Var31) {
                                break;
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
                qiaVar = new qia(this, continuation);
                Object obj342 = qiaVar.j;
                nm6 nm6Var312 = nm6.a;
                i30 = qiaVar.k;
                if (i30 != 0) {
                }
        }
        return Unit.a;
    }

    public /* synthetic */ a56(rjc rjcVar, Object obj, int i) {
        this.a = i;
        this.b = rjcVar;
    }
}
