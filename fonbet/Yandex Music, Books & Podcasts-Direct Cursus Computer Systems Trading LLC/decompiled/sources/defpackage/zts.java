package defpackage;

import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes3.dex */
public final class zts extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zts(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new zts((bus) this.l, continuation, 0);
            case 1:
                return new zts((wus) this.l, continuation, 1);
            case 2:
                return new zts((eys) this.l, continuation, 2);
            case 3:
                return new zts((mat) this.l, continuation, 3);
            case 4:
                return new zts((njt) this.l, continuation, 4);
            case 5:
                return new zts((crt) this.l, continuation, 5);
            case 6:
                return new zts((frt) this.l, continuation, 6);
            case 7:
                return new zts((urt) this.l, continuation, 7);
            case 8:
                return new zts((wrt) this.l, continuation, 8);
            case 9:
                return new zts((vrt) this.l, continuation, 9);
            case 10:
                return new zts((nst) this.l, continuation, 10);
            case 11:
                return new zts((mmo) this.l, continuation, 11);
            case 12:
                return new zts((dtt) this.l, continuation, 12);
            case 13:
                return new zts((yks) this.l, continuation, 13);
            case 14:
                return new zts((k3u) this.l, continuation, 14);
            case 15:
                return new zts((a6u) this.l, continuation, 15);
            case 16:
                return new zts((d8u) this.l, continuation, 16);
            case 17:
                return new zts((y8u) this.l, continuation, 17);
            case 18:
                return new zts((l8u) this.l, continuation, 18);
            case 19:
                return new zts((qiu) this.l, continuation, 19);
            case 20:
                return new zts((qju) this.l, continuation, 20);
            case 21:
                return new zts((fqu) this.l, continuation, 21);
            case 22:
                return new zts((v5v) this.l, continuation, 22);
            case 23:
                return new zts((n7v) this.l, continuation, 23);
            case 24:
                return new zts((p7v) this.l, continuation, 24);
            case 25:
                return new zts((xqn) this.l, continuation, 25);
            case 26:
                return new zts((idv) this.l, continuation, 26);
            case 27:
                return new zts((thv) this.l, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new zts((eps) this.l, continuation, 28);
            default:
                return new zts((rxv) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((zts) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x03c9, code lost:
    
        if (defpackage.dtt.a(r6, r21) == r1) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x03b8, code lost:
    
        if (r2 == r1) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0467, code lost:
    
        if (r2.collect(r3, r21) == r1) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0437, code lost:
    
        if (r2 == r1) goto L234;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0126  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object g0;
        Object a;
        IOException iOException;
        Object a2;
        IOException iOException2;
        Object V;
        Object e;
        Object a3;
        l6v l6vVar;
        Object c;
        int i = this.j;
        int i2 = 2;
        Object obj2 = this.l;
        int i3 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(500L, this) == nm6Var) {
                        break;
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                bus busVar = (bus) obj2;
                xdr xdrVar = busVar.m;
                st6 st6Var = new st6(busVar.k);
                xdrVar.getClass();
                xdrVar.m(null, st6Var);
                break;
            case 1:
                wus wusVar = (wus) obj2;
                nm6 nm6Var2 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    n3h n3hVar = (n3h) wusVar.m.b.getValue();
                    String str = wusVar.k.a;
                    this.k = 1;
                    b = n3hVar.b(str, this);
                    if (b == nm6Var2) {
                        break;
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    b = obj;
                }
                rj6 rj6Var = (rj6) b;
                if (!(rj6Var instanceof qj6)) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        break;
                    }
                } else {
                    String str2 = ((tus) ((qj6) rj6Var).a).a;
                    if (str2 != null) {
                        xdr xdrVar2 = wusVar.n;
                        gy7 gy7Var = (gy7) xdrVar2.getValue();
                        String str3 = gy7Var.a;
                        CharSequence charSequence = gy7Var.b;
                        str3.getClass();
                        charSequence.getClass();
                        gy7 gy7Var2 = new gy7(str3, charSequence, str2);
                        xdrVar2.getClass();
                        xdrVar2.m(null, gy7Var2);
                    }
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((eys) obj2).a(this) == nm6Var3) {
                        break;
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((mat) obj2).f(this) == nm6Var4) {
                        break;
                    }
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 4:
                njt njtVar = (njt) obj2;
                nm6 nm6Var5 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar3 = njtVar.g;
                    d4t d4tVar = new d4t(i2, i3, continuation);
                    this.k = 1;
                    if (zsd.h0(xdrVar3, d4tVar, this) == nm6Var5) {
                        break;
                    }
                } else if (i8 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                suc.c(((ckt) njtVar.e.b).k);
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object a4 = crt.a((crt) obj2, this);
                    if (a4 != nm6Var6) {
                        break;
                    }
                } else if (i9 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    pjc j = ((frt) obj2).j();
                    this.k = 1;
                    g0 = zsd.g0(j, this);
                    if (g0 == nm6Var7) {
                        break;
                    }
                } else if (i10 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    g0 = obj;
                }
                yxc yxcVar = (yxc) g0;
                if (yxcVar == null) {
                    cuk cukVar = drt.e;
                    break;
                }
                break;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    bca bcaVar = ((urt) obj2).g;
                    this.k = 1;
                    Object g02 = zsd.g0(bcaVar, this);
                    if (g02 != nm6Var8) {
                        break;
                    }
                } else if (i11 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                break;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    dqi dqiVar = ((wrt) obj2).a;
                    this.k = 1;
                    a = dqiVar.a(this);
                    if (a == nm6Var9) {
                        break;
                    }
                } else if (i12 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    a = obj;
                }
                hot hotVar = (hot) a;
                if (!(hotVar instanceof got)) {
                    if (!(hotVar instanceof fot)) {
                        b6e.s();
                        break;
                    } else {
                        fot fotVar = (fot) hotVar;
                        if (!(fotVar instanceof cot)) {
                            if (!(fotVar instanceof dot)) {
                                if (!(fotVar instanceof eot)) {
                                    b6e.s();
                                    break;
                                } else {
                                    iOException = new IOException("Transport error");
                                }
                            } else {
                                iOException = ((dot) hotVar).a;
                            }
                        } else {
                            iOException = new IOException(k5r.i(((cot) hotVar).a, "HTTP error: "));
                        }
                        break;
                    }
                } else {
                    yxc yxcVar2 = ((got) hotVar).a;
                    drt drtVar = yxcVar2.a;
                    break;
                }
            case 9:
                nm6 nm6Var10 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    dqi dqiVar2 = (dqi) ((vrt) obj2).a.getValue();
                    this.k = 1;
                    a2 = dqiVar2.a(this);
                    if (a2 == nm6Var10) {
                        break;
                    }
                } else if (i13 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    a2 = obj;
                }
                hot hotVar2 = (hot) a2;
                if (!(hotVar2 instanceof got)) {
                    if (!(hotVar2 instanceof fot)) {
                        b6e.s();
                        break;
                    } else {
                        fot fotVar2 = (fot) hotVar2;
                        if (!(fotVar2 instanceof cot)) {
                            if (!(fotVar2 instanceof dot)) {
                                if (!(fotVar2 instanceof eot)) {
                                    b6e.s();
                                    break;
                                } else {
                                    iOException2 = new IOException("Network error");
                                }
                            } else {
                                iOException2 = ((dot) hotVar2).a;
                            }
                        } else {
                            iOException2 = new IOException(k5r.i(((cot) hotVar2).a, "HTTP error: "));
                        }
                        iOException2.getClass();
                        break;
                    }
                } else {
                    yxc yxcVar3 = ((got) hotVar2).a;
                    break;
                }
            case 10:
                nst nstVar = (nst) obj2;
                nm6 nm6Var11 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    mn7 mn7Var = dm6.b;
                    pjt pjtVar = new pjt(nstVar, continuation, 3);
                    this.k = 1;
                    V = x97.V(mn7Var, pjtVar, this);
                    break;
                } else if (i14 == 1) {
                    qgg.h0(obj);
                    V = obj;
                } else if (i14 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                if (!((Boolean) V).booleanValue()) {
                    za8 m = q6k.m(((iv0) nstVar.c).a.j(), new grt(20), q6k.g);
                    lot lotVar = new lot(i2, nstVar);
                    this.k = 2;
                    break;
                } else {
                    break;
                }
            case 11:
                Object obj3 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    hjp hjpVar = (hjp) ((mmo) obj2).b;
                    this.k = 1;
                    Object V2 = x97.V(dm6.b, new btt((dtt) hjpVar.b, continuation, 0), this);
                    if (V2 != obj3) {
                        V2 = Unit.a;
                    }
                    if (V2 != obj3) {
                        V2 = Unit.a;
                    }
                    if (V2 == obj3) {
                        break;
                    }
                } else if (i15 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 12:
                dtt dttVar = (dtt) obj2;
                nm6 nm6Var12 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    if (!dttVar.d) {
                        this.k = 1;
                        e = dtt.e(dttVar, this);
                        break;
                    } else {
                        break;
                    }
                } else if (i16 == 1) {
                    qgg.h0(obj);
                    e = obj;
                } else if (i16 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                if (((Boolean) e).booleanValue()) {
                    this.k = 2;
                    break;
                }
            case 13:
                nm6 nm6Var13 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    dy6 dy6Var = (dy6) ((jyr) ((yks) obj2).c).getValue();
                    this.k = 1;
                    a3 = dy6Var.a(this);
                    if (a3 == nm6Var13) {
                        break;
                    }
                } else if (i17 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    a3 = obj;
                }
                amu amuVar = (amu) a3;
                if (amuVar != null) {
                    break;
                }
                break;
            case 14:
                nm6 nm6Var14 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(500L, this) == nm6Var14) {
                        break;
                    }
                } else if (i18 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                k3u k3uVar = (k3u) obj2;
                xdr xdrVar4 = k3uVar.m;
                st6 st6Var2 = new st6(k3uVar.k);
                xdrVar4.getClass();
                xdrVar4.m(null, st6Var2);
                break;
            case 15:
                nm6 nm6Var15 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (((a6u) obj2).o(0L, this) == nm6Var15) {
                        break;
                    }
                } else if (i19 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 16:
                d8u d8uVar = (d8u) obj2;
                VideoClipActivity videoClipActivity = d8uVar.a;
                nm6 nm6Var16 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    mza mzaVar = d8uVar.b;
                    String G = videoClipActivity.a.m().G();
                    G.getClass();
                    oza ozaVar = new oza(G);
                    this.k = 1;
                    if (mzaVar.a(ozaVar, videoClipActivity, null, this) == nm6Var16) {
                        break;
                    }
                } else if (i20 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 17:
                nm6 nm6Var17 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(100L, this) == nm6Var17) {
                        break;
                    }
                } else if (i21 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                ((y8u) obj2).w();
                break;
            case 18:
                l8u l8uVar = (l8u) obj2;
                nm6 nm6Var18 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar = l8uVar.B().I;
                    lot lotVar2 = new lot(7, l8uVar);
                    this.k = 1;
                    j0qVar.collect(lotVar2, this);
                    break;
                } else if (i22 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
            case 19:
                qiu qiuVar = (qiu) obj2;
                nm6 nm6Var19 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    long j2 = qiuVar.s;
                    this.k = 1;
                    if (y2x.o(j2, this) == nm6Var19) {
                        break;
                    }
                } else if (i23 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                qiuVar.v = true;
                String e2 = eta.e();
                qiuVar.w = e2;
                qiuVar.p.invoke(Boolean.TRUE, e2, qiuVar.o);
                break;
            case 20:
                qju qjuVar = (qju) obj2;
                nm6 nm6Var20 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    eno S = ox6.S((vdr) qjuVar.c.getValue());
                    lot lotVar3 = new lot(8, qjuVar);
                    this.k = 1;
                    if (S.collect(lotVar3, this) == nm6Var20) {
                        break;
                    }
                } else if (i24 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 21:
                fqu fquVar = (fqu) obj2;
                nm6 nm6Var21 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    pjc b0 = zsd.b0(new y4s(fquVar.r, 17));
                    lot lotVar4 = new lot(11, fquVar);
                    this.k = 1;
                    if (b0.collect(lotVar4, this) == nm6Var21) {
                        break;
                    }
                } else if (i25 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 22:
                nm6 nm6Var22 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(2000L, this) == nm6Var22) {
                        break;
                    }
                } else if (i26 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                l9p l9pVar = new l9p("pop");
                pqr pqrVar = new pqr(new dou(o8g.Q(l9pVar), new s9p(t75.c(l9pVar)), "Поп", "Моя волна по жанру"));
                l9p l9pVar2 = new l9p("rock");
                ((v5v) obj2).b.l(u75.h(pqrVar, new pqr(new dou(o8g.Q(l9pVar2), new s9p(t75.c(l9pVar2)), "Рок", "Моя волна по жанру"))));
                break;
            case 23:
                n7v n7vVar = (n7v) obj2;
                nm6 nm6Var23 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    s9f[] s9fVarArr = n7v.j;
                    l7v l7vVar = n7vVar.a().r;
                    this.k = 1;
                    if (y2x.o(300L, this) == nm6Var23) {
                        break;
                    }
                } else if (i27 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                n7vVar.f.invoke();
                break;
            case 24:
                p7v p7vVar = (p7v) obj2;
                m6v m6vVar = p7vVar.k;
                nm6 nm6Var24 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    if (p7vVar.n && !m6vVar.g.isEmpty()) {
                        z6v z6vVar = p7vVar.m;
                        List list = m6vVar.g;
                        this.k = 1;
                        c = z6vVar.c(list, this);
                        if (c == nm6Var24) {
                            break;
                        }
                    } else {
                        l6vVar = null;
                        xdr xdrVar5 = p7vVar.o;
                        o6v o6vVar = p7vVar.l;
                        List list2 = m6vVar.d;
                        n6v n6vVar = m6vVar.e;
                        z8v z8vVar = new z8v(m6vVar, l6vVar, n6vVar != null ? b8v.a : new a8v(n6vVar), list2, o6vVar);
                        xdrVar5.getClass();
                        xdrVar5.m(null, z8vVar);
                        break;
                    }
                } else if (i28 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    c = obj;
                }
                l6vVar = (l6v) CollectionsKt.firstOrNull((List) c);
                xdr xdrVar52 = p7vVar.o;
                o6v o6vVar2 = p7vVar.l;
                List list22 = m6vVar.d;
                n6v n6vVar2 = m6vVar.e;
                z8v z8vVar2 = new z8v(m6vVar, l6vVar, n6vVar2 != null ? b8v.a : new a8v(n6vVar2), list22, o6vVar2);
                xdrVar52.getClass();
                xdrVar52.m(null, z8vVar2);
                break;
            case 25:
                nm6 nm6Var25 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    Object obj4 = ((xqn) obj2).a;
                    obj4.getClass();
                    this.k = 1;
                    if (fpr.d((fpr) obj4, this) == nm6Var25) {
                        break;
                    }
                } else if (i29 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 26:
                nm6 nm6Var26 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar2 = ((idv) obj2).b;
                    this.k = 1;
                    if (j0qVar2.emit(fdv.a, this) == nm6Var26) {
                        break;
                    }
                } else if (i30 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 27:
                nm6 nm6Var27 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    bkv bkvVar = ((thv) obj2).a;
                    this.k = 1;
                    if (bkvVar.b(this) == nm6Var27) {
                        break;
                    }
                } else if (i31 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var28 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar3 = (j0q) ((eps) obj2).d;
                    Unit unit = Unit.a;
                    this.k = 1;
                    if (j0qVar3.emit(unit, this) == nm6Var28) {
                        break;
                    }
                } else if (i32 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var29 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(1000L, this) == nm6Var29) {
                        break;
                    }
                } else if (i33 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                ((rxv) obj2).C.setValue(Boolean.FALSE);
                break;
        }
        return Unit.a;
    }
}
