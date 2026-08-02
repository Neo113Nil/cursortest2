package defpackage;

import android.os.Bundle;
import android.widget.TextView;
import com.yandex.music.payment.screen.promocode.viewmodel.a;
import com.yandex.music.shared.playback.utils.api.commands.NoopCallbackCommand;
import com.yandex.passport.internal.account.f;
import com.yandex.passport.internal.impl.q0;
import com.yandex.pulse.metrics.o;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.novelties.podcasts.catalog.PodcastsCatalogActivity;

/* loaded from: classes3.dex */
public final class g2l extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2l(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new g2l((ime) this.l, continuation, 0);
            case 1:
                return new g2l((d5l) this.l, continuation, 1);
            case 2:
                return new g2l((f7l) this.l, continuation, 2);
            case 3:
                return new g2l((ltm) this.l, continuation, 3);
            case 4:
                return new g2l((anl) this.l, continuation, 4);
            case 5:
                return new g2l((vfg) this.l, continuation, 5);
            case 6:
                return new g2l((grl) this.l, continuation, 6);
            case 7:
                return new g2l((yrl) this.l, continuation, 7);
            case 8:
                return new g2l((cyl) this.l, continuation, 8);
            case 9:
                return new g2l((gzl) this.l, continuation, 9);
            case 10:
                return new g2l((a3m) this.l, continuation, 10);
            case 11:
                return new g2l((m3m) this.l, continuation, 11);
            case 12:
                return new g2l((n3m) this.l, continuation, 12);
            case 13:
                return new g2l((j6m) this.l, continuation, 13);
            case 14:
                return new g2l((xdh) this.l, continuation, 14);
            case 15:
                return new g2l((tam) this.l, continuation, 15);
            case 16:
                return new g2l((qbm) this.l, continuation, 16);
            case 17:
                return new g2l((PodcastsCatalogActivity) this.l, continuation, 17);
            case 18:
                return new g2l((efm) this.l, continuation, 18);
            case 19:
                return new g2l((xmm) this.l, continuation, 19);
            case 20:
                return new g2l((cum) this.l, continuation, 20);
            case 21:
                return new g2l((a) this.l, continuation, 21);
            case 22:
                return new g2l((exm) this.l, continuation, 22);
            case 23:
                return new g2l((j2n) this.l, continuation, 23);
            case 24:
                return new g2l((sfm) this.l, continuation, 24);
            case 25:
                return new g2l((vmn) this.l, continuation, 25);
            case 26:
                return new g2l((ayn) this.l, continuation, 26);
            case 27:
                return new g2l((dho) this.l, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new g2l((f4m) this.l, continuation, 28);
            default:
                return new g2l((NoopCallbackCommand) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 9:
                ((g2l) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
            case 10:
                ((g2l) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return ((g2l) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x03b1, code lost:
    
        if (r2.emit(r3, r27) == r1) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0390, code lost:
    
        if (r2 == r1) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0416, code lost:
    
        if (r0 == r2) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x03ed, code lost:
    
        if (r3.S(r27) == r2) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x06f7, code lost:
    
        if (r1.d.m(r2, r27) == r0) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x06e1, code lost:
    
        if (defpackage.y2x.o(2000, r27) == r0) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x073f, code lost:
    
        if (r1.i(r27) == r3) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0736, code lost:
    
        if (r1.o(r0, r27) == r3) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x072b, code lost:
    
        if (r0.c(r27) == r3) goto L390;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object Q;
        Object g0;
        Object a;
        Object o;
        Object c;
        Object value;
        uwm uwmVar;
        int i = 8;
        int i2 = 13;
        int i3 = 2;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    ime imeVar = (ime) this.l;
                    x0q x0qVar = (x0q) imeVar.d;
                    f2l f2lVar = new f2l(imeVar, null);
                    this.k = 1;
                    if (zsd.O(x0qVar, f2lVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i4 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                d5l d5lVar = (d5l) this.l;
                nm6 nm6Var2 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    pjc b0 = zsd.b0(new a1l(((frt) d5lVar.a.getValue()).g(), i));
                    fmi fmiVar = new fmi(25, d5lVar);
                    this.k = 1;
                    if (b0.collect(fmiVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i5 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                f7l f7lVar = (f7l) this.l;
                uol uolVar = f7lVar.b;
                nm6 nm6Var3 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    g4l g4lVar = f7lVar.a;
                    this.k = 1;
                    break;
                } else if (i6 == 1) {
                    qgg.h0(obj);
                } else if (i6 == 2) {
                    qgg.h0(obj);
                    this.k = 3;
                    break;
                } else {
                    if (i6 == 3) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zol zolVar = zol.a;
                this.k = 2;
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    break;
                } else {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ktm ktmVar = (ktm) ((ltm) this.l);
                ktmVar.getClass();
                xll xllVar = xll.a;
                this.k = 2;
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    cnl cnlVar = (cnl) ((anl) this.l).b.getValue();
                    bdt I = hag.I(rpq.class);
                    qdc qdcVar = cnlVar.a;
                    qdcVar.getClass();
                    rpq rpqVar = (rpq) qdcVar.C(I);
                    this.k = 1;
                    if (rpqVar.a(this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i9 = this.k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                vfg vfgVar = (vfg) this.l;
                this.k = 1;
                if (vfgVar instanceof tfg) {
                    Q = ((tfg) vfgVar).d(this);
                } else {
                    if (!(vfgVar instanceof ufg)) {
                        b6e.s();
                        return null;
                    }
                    Q = gld.Q(new ptd((Object) vfgVar, (Continuation) (z ? 1 : 0), 27), this);
                }
                return Q == nm6Var6 ? nm6Var6 : Q;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i10 = this.k;
                if (i10 != 0) {
                    if (i10 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                fkn fknVar = ((grl) this.l).D;
                z0i z0iVar = new z0i(i3, 10, z2 ? 1 : 0);
                this.k = 1;
                Object h0 = zsd.h0(fknVar, z0iVar, this);
                return h0 == nm6Var7 ? nm6Var7 : h0;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(500L, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xdr xdrVar = ((yrl) this.l).g;
                bsl bslVar = bsl.a;
                xdrVar.getClass();
                xdrVar.m(null, bslVar);
                return Unit.a;
            case 8:
                cyl cylVar = (cyl) this.l;
                nm6 nm6Var9 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    a1l a1lVar = new a1l(cylVar.a.B, 29);
                    this.k = 1;
                    g0 = zsd.g0(a1lVar, this);
                    if (g0 == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g0 = obj;
                }
                Pair pair = (Pair) g0;
                cvl cvlVar = (cvl) pair.a;
                List list = (List) pair.b;
                cxl cxlVar = cylVar.f;
                bml bmlVar = new bml(1, cylVar.e.b(), tnb.class, "reportDomainObjectDeeplinkStarted", "reportDomainObjectDeeplinkStarted(Ljava/lang/String;)V", 0, 2);
                cxlVar.getClass();
                cvlVar.getClass();
                list.getClass();
                PlaylistScreenActivity playlistScreenActivity = cxlVar.a;
                sml smlVar = playlistScreenActivity.v0;
                if (smlVar == null) {
                    Intrinsics.j("trailerPlayIntegration");
                    throw null;
                }
                dyd dydVar = (dyd) smlVar.a;
                if (dydVar != null && !dydVar.c) {
                    t5t t5tVar = (t5t) dydVar.b;
                    if (t5tVar != null && t5tVar.a) {
                        cxlVar.c(cvlVar.e());
                    }
                    dydVar.c = true;
                }
                sml smlVar2 = playlistScreenActivity.v0;
                if (smlVar2 == null) {
                    Intrinsics.j("trailerPlayIntegration");
                    throw null;
                }
                dyd dydVar2 = (dyd) smlVar2.a;
                if (dydVar2 == null || !dydVar2.c) {
                    z6n z6nVar = playlistScreenActivity.Z;
                    if (z6nVar == null) {
                        Intrinsics.j("urlPlayIntegration");
                        throw null;
                    }
                    dyd dydVar3 = (dyd) z6nVar.b;
                    if (dydVar3 != null && !dydVar3.c) {
                        xpt xptVar = (xpt) dydVar3.b;
                        if (xptVar.a) {
                            a0g.H(cxlVar.a, list, xptVar.c, xptVar.b, false, new rh1(xptVar, bmlVar, cxlVar, cvlVar, list, 11));
                        }
                        dydVar3.c = true;
                    }
                }
                return Unit.a;
            case 9:
                gzl gzlVar = (gzl) this.l;
                nm6 nm6Var10 = nm6.a;
                int i13 = this.k;
                if (i13 != 0) {
                    if (i13 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q x0qVar2 = ((n0m) gzlVar.k.getValue()).A;
                gfl gflVar = new gfl(4, gzlVar);
                this.k = 1;
                x0qVar2.getClass();
                x0q.m(x0qVar2, gflVar, this);
                return nm6Var10;
            case 10:
                nm6 nm6Var11 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    a3m a3mVar = (a3m) this.l;
                    dkn dknVar = a3mVar.g;
                    gfl gflVar2 = new gfl(5, a3mVar);
                    this.k = 1;
                    if (dknVar.a.collect(gflVar2, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            case 11:
                nm6 nm6Var12 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar3 = ((m3m) this.l).r;
                    Unit unit = Unit.a;
                    this.k = 1;
                    if (x0qVar3.emit(unit, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                nm6 nm6Var13 = nm6.a;
                int i16 = this.k;
                if (i16 != 0) {
                    if (i16 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                n3m n3mVar = (n3m) this.l;
                cut cutVar = (cut) n3mVar.e;
                cvl cvlVar2 = (cvl) n3mVar.b;
                String str2 = cvlVar2.c.a;
                String str3 = cvlVar2.a;
                this.k = 1;
                Object h = cut.h(cutVar, str2, str3, true, false, this, 120);
                return h == nm6Var13 ? nm6Var13 : h;
            case 13:
                nm6 nm6Var14 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar4 = ((j6m) this.l).i;
                    Unit unit2 = Unit.a;
                    this.k = 1;
                    if (x0qVar4.emit(unit2, this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                xdh xdhVar = (xdh) this.l;
                nm6 nm6Var15 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    lum lumVar = (lum) xdhVar.a;
                    this.k = 1;
                    break;
                } else {
                    if (i18 != 1) {
                        if (i18 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                this.k = 2;
                Object collect = ((q0) ((oxa) xdhVar.b).b).n.collect(new fgf(new gfl(i, xdhVar), 28), this);
                if (collect != nm6Var15) {
                    collect = Unit.a;
                }
                if (collect != nm6Var15) {
                    collect = Unit.a;
                    break;
                }
                break;
            case 15:
                tam tamVar = (tam) this.l;
                nm6 nm6Var16 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar2 = tamVar.n;
                    Boolean bool = Boolean.TRUE;
                    xdrVar2.getClass();
                    xdrVar2.m(null, bool);
                    vxr vxrVar = (vxr) tamVar.k.getValue();
                    this.k = 1;
                    a = vxrVar.a(this);
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        xdr xdrVar3 = tamVar.n;
                        Boolean bool2 = Boolean.FALSE;
                        xdrVar3.getClass();
                        xdrVar3.m(null, bool2);
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                txr txrVar = (txr) a;
                if (!Intrinsics.d(txrVar, sxr.a)) {
                    if (!Intrinsics.d(txrVar, rxr.a)) {
                        b6e.s();
                        return null;
                    }
                    j0q j0qVar = tamVar.o;
                    String j0 = j66.j0();
                    this.k = 2;
                    break;
                }
                xdr xdrVar32 = tamVar.n;
                Boolean bool22 = Boolean.FALSE;
                xdrVar32.getClass();
                xdrVar32.m(null, bool22);
                return Unit.a;
            case 16:
                qbm qbmVar = (qbm) this.l;
                nm6 nm6Var17 = nm6.a;
                int i20 = this.k;
                if (i20 != 0) {
                    if (i20 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                j0q j0qVar2 = ((gcm) qbmVar.j.getValue()).E;
                gfl gflVar3 = new gfl(i2, qbmVar);
                this.k = 1;
                j0qVar2.collect(gflVar3, this);
                return nm6Var17;
            case 17:
                nm6 nm6Var18 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    fqq fqqVar = (fqq) PodcastsCatalogActivity.Y.getValue();
                    PodcastsCatalogActivity podcastsCatalogActivity = (PodcastsCatalogActivity) this.l;
                    this.k = 1;
                    if (fqqVar.a(podcastsCatalogActivity, this) == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                nm6 nm6Var19 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar3 = ((efm) this.l).r;
                    String j02 = j66.j0();
                    this.k = 1;
                    if (j0qVar3.emit(j02, this) == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 19:
                nm6 nm6Var20 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    xmm xmmVar = (xmm) this.l;
                    boolean z5 = xmmVar.c;
                    this.k = 1;
                    o = xmmVar.o(z5, this);
                    if (o == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    o = obj;
                }
                e73 e73Var = (e73) o;
                e73Var.getClass();
                if (e73Var instanceof c73) {
                    ssg.a(3, ((xmm) this.l).m(), hrg.q("Block load error[", ((xmm) this.l).a().a().a, "]"), null);
                }
                kzp kzpVar = ((xmm) this.l).b;
                if (kzpVar != null) {
                    kzpVar.invoke(e73Var);
                }
                ((xmm) this.l).c = false;
                return Unit.a;
            case 20:
                cum cumVar = (cum) this.l;
                nm6 nm6Var21 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    av0 av0Var = (av0) cumVar.j.getValue();
                    this.k = 1;
                    c = ((iv0) av0Var).b.c(this);
                    if (c == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c = obj;
                }
                f fVar = (f) c;
                if (fVar != null) {
                    ad a2 = ad.a(fVar);
                    if (a2.a) {
                        str = cumVar.b.getString(a2.b);
                    } else if (a2 == ad.YANDEX || a2 == ad.PDD) {
                        str = cumVar.d.a.b;
                    } else if (a2 == ad.PHONE) {
                        str = "";
                    } else {
                        dfi.r("not all users type in when", "ProfilePlusPultPresenter");
                    }
                    cumVar.n = str;
                    if (str == null) {
                        dfi.r("login is null " + fVar, "ProfilePlusPultPresenter");
                    }
                    gum gumVar = cumVar.k;
                    if (gumVar != null) {
                        ((TextView) gumVar.f.a(gum.n[2])).setText(cumVar.n);
                    }
                }
                return Unit.a;
            case 21:
                nm6 nm6Var22 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(500L, this) == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                xdr xdrVar4 = ((a) this.l).p;
                do {
                    value = xdrVar4.getValue();
                    uwmVar = (uwm) value;
                    if (uwmVar instanceof twm) {
                        uwmVar = new twm(((twm) uwmVar).a, true);
                    }
                } while (!xdrVar4.k(value, uwmVar));
                return Unit.a;
            case 22:
                exm exmVar = (exm) this.l;
                Object obj2 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    a aVar = (a) exmVar.j.getValue();
                    this.k = 1;
                    Object h02 = zsd.h0(aVar.p, new z0i(i3, i2, z3 ? 1 : 0), this);
                    Object obj3 = h02;
                    if (h02 != obj2) {
                        obj3 = Unit.a;
                    }
                    if (obj3 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                exmVar.getParentFragmentManager().e0(new Bundle(), "show_promo_code");
                return Unit.a;
            case 23:
                nm6 nm6Var23 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(500L, this) == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                j2n j2nVar = (j2n) this.l;
                s9f[] s9fVarArr = j2n.D;
                j2nVar.f(false);
                return Unit.a;
            case 24:
                nm6 nm6Var24 = nm6.a;
                int i28 = this.k;
                if (i28 != 0) {
                    if (i28 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                sfm sfmVar = (sfm) this.l;
                this.k = 1;
                Object m = sfmVar.m(this);
                return m == nm6Var24 ? nm6Var24 : m;
            case 25:
                vmn vmnVar = (vmn) this.l;
                nm6 nm6Var25 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    iwe iweVar = vmnVar.k;
                    iweVar.getClass();
                    ss3 I2 = zsd.I(new s1n((Object) iweVar, (Continuation) (z4 ? 1 : 0), 15));
                    gfl gflVar4 = new gfl(24, vmnVar);
                    this.k = 1;
                    if (I2.collect(gflVar4, this) == nm6Var25) {
                        return nm6Var25;
                    }
                } else {
                    if (i29 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 26:
                nm6 nm6Var26 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    h7a H0 = zsd.H0(((ayn) this.l).u, 2);
                    this.k = 1;
                    if (zsd.N(H0, this) == nm6Var26) {
                        return nm6Var26;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 27:
                nm6 nm6Var27 = nm6.a;
                int i31 = this.k;
                if (i31 != 0) {
                    if (i31 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                dho dhoVar = (dho) this.l;
                this.k = 1;
                Object a3 = dhoVar.a(this);
                return a3 == nm6Var27 ? nm6Var27 : a3;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var28 = nm6.a;
                int i32 = this.k;
                if (i32 != 0) {
                    if (i32 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                l18 l18Var = l18.b;
                bdt I3 = hag.I(hh1.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                hh1 hh1Var = (hh1) qdcVar2.C(I3);
                String str4 = ((c01) ((f4m) this.l).b).a;
                ap0 ap0Var = new ap0(0, Integer.MAX_VALUE);
                this.k = 1;
                Object a4 = hh1Var.a(str4, ap0Var, true, this);
                return a4 == nm6Var28 ? nm6Var28 : a4;
            default:
                nm6 nm6Var29 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    qln channel = ((NoopCallbackCommand) this.l).getChannel();
                    this.k = 1;
                    if (channel.l(this) == nm6Var29) {
                        return nm6Var29;
                    }
                } else {
                    if (i33 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
