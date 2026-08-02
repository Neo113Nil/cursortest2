package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.t;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.AppMetricaYandex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes5.dex */
public final class ptd extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ptd(qyf qyfVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.j = 22;
        this.l = qyfVar;
        this.m = (aur) function2;
    }

    private final Object k(Object obj) {
        nnd nndVar = (nnd) this.m;
        t tVar = (t) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            ecg ecgVar = fcg.a;
            Context applicationContext = tVar.getApplicationContext();
            applicationContext.getClass();
            String deviceId = AppMetricaYandex.getDeviceId((Context) ((jyr) ((ju0) nndVar.b).a).getValue());
            if (deviceId == null) {
                deviceId = "No deviceId";
            }
            c5b c5bVar = c5b.a;
            c5bVar.getClass();
            ule uleVar = new ule(deviceId, c5bVar);
            Log.v("LYPMProvider", "initializeAsync");
            ou7 p = x97.p(fcg.e, null, null, new ov(applicationContext, uleVar, continuation, 29), 3);
            this.k = 1;
            obj = p.s(this);
            if (obj == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        bcg bcgVar = (bcg) obj;
        if (!tVar.isDestroyed()) {
            ((ecg) bcgVar).g(tVar);
        }
        return obj;
    }

    private final Object l(Object obj) {
        mm6 mm6Var = (mm6) this.l;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        pjc f = ((ufg) ((vfg) this.m)).f(mm6Var, false);
        this.l = null;
        this.k = 1;
        Object g0 = zsd.g0(f, this);
        return g0 == nm6Var ? nm6Var : g0;
    }

    private final Object n(Object obj) {
        mw4 mw4Var;
        xh1 xh1Var = (xh1) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            mw4 mw4Var2 = mw4.DOWNLOADED_ARTISTS;
            a04 a04Var = (a04) xh1Var.i.getValue();
            this.l = mw4Var2;
            this.k = 1;
            Object d = a04Var.d(8, this);
            if (d == nm6Var) {
                return nm6Var;
            }
            mw4Var = mw4Var2;
            obj = d;
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mw4Var = (mw4) this.l;
            qgg.h0(obj);
        }
        xgg xggVar = (xgg) obj;
        return new hz3(new nrf(mw4Var.a, mw4Var.b), xh1Var.e().c(R.string.artists), xggVar.a, xggVar.b);
    }

    /* JADX WARN: Type inference failed for: r1v40, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new ptd((hn5) this.l, (ntd) this.m, continuation, 0);
            case 1:
                return new ptd((pjc) this.l, (ivd) this.m, continuation, 1);
            case 2:
                return new ptd((u1e) this.l, (tqq) this.m, continuation, 2);
            case 3:
                return new ptd((u1e) this.l, (Function1) this.m, continuation, 3);
            case 4:
                return new ptd((cge) this.l, (ige) this.m, continuation, 4);
            case 5:
                return new ptd((fdf) this.m, continuation, 5);
            case 6:
                return new ptd((gdf) this.m, continuation, 6);
            case 7:
                return new ptd((fdf) this.l, (vbc) this.m, continuation, 7);
            case 8:
                return new ptd((gdf) this.l, (vbc) this.m, continuation, 8);
            case 9:
                return new ptd((cff) this.m, continuation, 9);
            case 10:
                return new ptd((dff) this.m, continuation, 10);
            case 11:
                return new ptd((cff) this.l, (vbc) this.m, continuation, 11);
            case 12:
                return new ptd((dff) this.l, (vbc) this.m, continuation, 12);
            case 13:
                return new ptd((ggf) this.l, (jgf) this.m, continuation, 13);
            case 14:
                return new ptd((fhf) this.l, (vbc) this.m, continuation, 14);
            case 15:
                return new ptd((ghf) this.l, (vbc) this.m, continuation, 15);
            case 16:
                return new ptd((fjf) this.l, (String) this.m, continuation, 16);
            case 17:
                return new ptd((pjc) this.l, continuation, (tkf) this.m);
            case 18:
                return new ptd((elf) this.m, continuation, 18);
            case 19:
                return new ptd((pfm) this.l, (o3k) this.m, continuation, 19);
            case 20:
                ptd ptdVar = new ptd((lvf) this.m, continuation, 20);
                ptdVar.l = obj;
                return ptdVar;
            case 21:
                return new ptd((nwf) this.l, (v3) this.m, continuation, 21);
            case 22:
                return new ptd((qyf) this.l, (Function2) this.m, continuation);
            case 23:
                ptd ptdVar2 = new ptd((w2g) this.m, continuation, 23);
                ptdVar2.l = obj;
                return ptdVar2;
            case 24:
                return new ptd((t3g) this.l, (c3g) this.m, continuation, 24);
            case 25:
                return new ptd((nsh) this.m, continuation, 25);
            case 26:
                return new ptd((t) this.l, (nnd) this.m, continuation, 26);
            case 27:
                ptd ptdVar3 = new ptd((vfg) this.m, continuation, 27);
                ptdVar3.l = obj;
                return ptdVar3;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new ptd((xh1) this.m, continuation, 28);
            default:
                return new ptd((xh1) this.m, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                ((ptd) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
            case 21:
                ((ptd) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((ptd) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x047f, code lost:
    
        if (r1 == r3) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0496, code lost:
    
        if (r1.emit(r2, r26) == r3) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0273, code lost:
    
        if (r6 == r3) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0887, code lost:
    
        if (r1 == r4) goto L382;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
    
        if (r3 == r2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0a6f, code lost:
    
        if (r1 == r4) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0b4e, code lost:
    
        if (r2.emit(r1, r26) == r3) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0b58, code lost:
    
        if (defpackage.ige.a(r1, r26) == r3) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0b77, code lost:
    
        if (r2.emit(r1, r26) == r3) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0b82, code lost:
    
        if (r2.emit(r1, r26) == r3) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014c, code lost:
    
        if (r1.emit(r3, r26) == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0139, code lost:
    
        if (r3 == r2) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Type inference failed for: r3v85, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pjc i;
        Object c;
        Object j;
        fdf fdfVar;
        Object s;
        gdf gdfVar;
        Object k;
        cff cffVar;
        Object t;
        dff dffVar;
        Object j0;
        List R;
        Object d;
        Object obj2;
        Object obj3;
        Object obj4;
        String str;
        Object obj5;
        Object a;
        Object L;
        Object h;
        nu1 nu1Var;
        Object a2;
        nrf nrfVar;
        int i2 = 25;
        int i3 = 9;
        int i4 = 0;
        int i5 = 10;
        int i6 = 2;
        int i7 = 1;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    fkn c2 = ((hn5) this.l).getLifecycle().c();
                    otd otdVar = new otd(i4, (ntd) this.m);
                    this.k = 1;
                    if (c2.a.collect(otdVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i8 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.l;
                    otd otdVar2 = new otd(i7, (ivd) this.m);
                    this.k = 1;
                    if (pjcVar.collect(otdVar2, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                u1e u1eVar = (u1e) this.l;
                nm6 nm6Var3 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    s2e s2eVar = u1eVar.C;
                    if (s2eVar == null) {
                        return Unit.a;
                    }
                    tqq tqqVar = (tqq) this.m;
                    if (tqqVar != null && (i = tqqVar.i()) != null) {
                        t58 t58Var = new t58(21, u1eVar, s2eVar);
                        this.k = 1;
                        if (i.collect(t58Var, this) == nm6Var3) {
                            return nm6Var3;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    u1e u1eVar2 = (u1e) this.l;
                    s9f[] s9fVarArr = u1e.N;
                    cmf cmfVar = (cmf) u1eVar2.l.getValue();
                    this.k = 1;
                    c = cmfVar.c(this);
                    if (c == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c = obj;
                }
                Boolean bool = (Boolean) c;
                bool.booleanValue();
                ((Function1) this.m).invoke(bool);
                return Unit.a;
            case 4:
                ige igeVar = (ige) this.m;
                x0q x0qVar = igeVar.o;
                nm6 nm6Var5 = nm6.a;
                int i12 = this.k;
                if (i12 != 0) {
                    if (i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                int ordinal = ((cge) this.l).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 4 && ordinal != 5) {
                                    b6e.s();
                                    return null;
                                }
                                if (v3g.E((dqi) igeVar.l.a.getValue()).h) {
                                    dge dgeVar = dge.a;
                                    this.k = 2;
                                    break;
                                } else {
                                    this.k = 3;
                                    break;
                                }
                            } else {
                                t tVar = igeVar.n.a;
                                lhs lhsVar = MainScreenActivity.Q0;
                                tVar.startActivity(imp.J(tVar, null, null, null, 14));
                                tVar.finish();
                            }
                        } else {
                            ege egeVar = ege.a;
                            this.k = 4;
                            break;
                        }
                    } else {
                        fge fgeVar = fge.a;
                        this.k = 1;
                        break;
                    }
                }
                return Unit.a;
            case 5:
                fdf fdfVar2 = (fdf) this.m;
                jyr jyrVar = fdfVar2.n;
                nm6 nm6Var6 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    adf adfVar = (adf) jyrVar.getValue();
                    this.l = fdfVar2;
                    this.k = 1;
                    j = ((v55) adfVar.b.getValue()).j(this);
                    if (j == nm6Var6) {
                        return nm6Var6;
                    }
                    fdfVar = fdfVar2;
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fdfVar = (fdf) this.l;
                    qgg.h0(obj);
                    j = obj;
                }
                fdf.G(fdfVar, (cfa) j);
                ox6.B(new u21(10, fdfVar2.l, ((yx4) ((adf) jyrVar.getValue()).a.getValue()).w(null), new w40(3, fdfVar2, fdf.class, "prepareState", "prepareState(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2)), ot0.F(fdfVar2), new otd(i3, fdfVar2));
                return Unit.a;
            case 6:
                gdf gdfVar2 = (gdf) this.m;
                jyr jyrVar2 = gdfVar2.r;
                nm6 nm6Var7 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    py4 py4Var = (py4) jyrVar2.getValue();
                    this.l = gdfVar2;
                    this.k = 1;
                    s = ((v55) py4Var.b.getValue()).s(this);
                    if (s != nm6Var7) {
                        gdfVar = gdfVar2;
                    }
                    return nm6Var7;
                }
                if (i14 != 1) {
                    if (i14 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gdf gdfVar3 = (gdf) this.l;
                qgg.h0(obj);
                gdfVar = gdfVar3;
                s = obj;
                gdf.G(gdfVar, (jdf) s);
                xdr xdrVar = gdfVar2.n;
                e15 e15Var = (e15) ((py4) jyrVar2.getValue()).a.getValue();
                pjc b0 = zsd.b0(new h05(e15Var.h("album_mview"), e15Var, null, 1));
                w40 w40Var = new w40(3, gdfVar2, gdf.class, "prepareState", "prepareState(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3);
                otd otdVar3 = new otd(i5, gdfVar2);
                this.l = null;
                this.k = 2;
                Object y = tt0.y(otdVar3, new l1(w40Var, (Continuation) null, i2), this, wg.s, new pjc[]{xdrVar, b0});
                if (y != nm6Var7) {
                    y = Unit.a;
                    break;
                }
                break;
            case 7:
                fdf fdfVar3 = (fdf) this.l;
                Object obj6 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    hdf hdfVar = (hdf) fdfVar3.o.getValue();
                    vbc vbcVar = (vbc) this.m;
                    hdfVar.getClass();
                    cfa a3 = hdf.a(vbcVar);
                    fdf.G(fdfVar3, a3);
                    adf adfVar2 = (adf) fdfVar3.n.getValue();
                    this.k = 1;
                    Object a4 = lmm.a(((v55) adfVar2.b.getValue()).r(), new h55(a3, null), this);
                    if (a4 != obj6) {
                        a4 = Unit.a;
                    }
                    if (a4 != obj6) {
                        a4 = Unit.a;
                    }
                    if (a4 == obj6) {
                        return obj6;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                gdf gdfVar4 = (gdf) this.l;
                Object obj7 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    idf idfVar = (idf) gdfVar4.t.getValue();
                    vbc vbcVar2 = (vbc) this.m;
                    idfVar.getClass();
                    jdf a5 = idf.a(vbcVar2);
                    gdf.G(gdfVar4, a5);
                    py4 py4Var2 = (py4) gdfVar4.r.getValue();
                    this.k = 1;
                    Object a6 = lmm.a(((v55) py4Var2.b.getValue()).r(), new p55(a5, null), this);
                    if (a6 != obj7) {
                        a6 = Unit.a;
                    }
                    if (a6 != obj7) {
                        a6 = Unit.a;
                    }
                    if (a6 == obj7) {
                        return obj7;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                cff cffVar2 = (cff) this.m;
                jyr jyrVar3 = cffVar2.n;
                nm6 nm6Var8 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    yef yefVar = (yef) jyrVar3.getValue();
                    this.l = cffVar2;
                    this.k = 1;
                    k = ((v55) yefVar.b.getValue()).k(this);
                    if (k == nm6Var8) {
                        return nm6Var8;
                    }
                    cffVar = cffVar2;
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cffVar = (cff) this.l;
                    qgg.h0(obj);
                    k = obj;
                }
                cff.a(cffVar, (dfa) k);
                ox6.B(new u21(10, cffVar2.l, ((yx4) ((yef) jyrVar3.getValue()).a.getValue()).A(null, null, null, Boolean.TRUE), new w83(3, cffVar2, cff.class, "prepareState", "prepareState(Ljava/util/List;Ljava/util/List;)Lcom/yandex/music/screen/downloadedmusic/ui/downloadedkids/kidsplaylists/KidsPlaylistsState;", 4, 5)), ot0.F(cffVar2), new otd(11, cffVar2));
                return Unit.a;
            case 10:
                dff dffVar2 = (dff) this.m;
                jyr jyrVar4 = dffVar2.q;
                nm6 nm6Var9 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    ty4 ty4Var = (ty4) jyrVar4.getValue();
                    this.l = dffVar2;
                    this.k = 1;
                    t = ((v55) ty4Var.b.getValue()).t(this);
                    if (t != nm6Var9) {
                        dffVar = dffVar2;
                    }
                    return nm6Var9;
                }
                if (i18 != 1) {
                    if (i18 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dff dffVar3 = (dff) this.l;
                qgg.h0(obj);
                dffVar = dffVar3;
                t = obj;
                dff.a(dffVar, (nef) t);
                xdr xdrVar2 = dffVar2.m;
                e15 e15Var2 = (e15) ((ty4) jyrVar4.getValue()).a.getValue();
                pjc b02 = zsd.b0(new h05(e15Var2.h("playlist_mview"), e15Var2, null, 2));
                w83 w83Var = new w83(3, dffVar2, dff.class, "prepareState", "prepareState(Ljava/util/List;Ljava/util/List;)Lcom/yandex/music/collection/kids/kidsplaylists/KidsPlaylistsState;", 4, 6);
                otd otdVar4 = new otd(12, dffVar2);
                this.l = null;
                this.k = 2;
                Object y2 = tt0.y(otdVar4, new l1(w83Var, (Continuation) null, i2), this, wg.s, new pjc[]{xdrVar2, b02});
                if (y2 != nm6Var9) {
                    y2 = Unit.a;
                    break;
                }
                break;
            case 11:
                cff cffVar3 = (cff) this.l;
                Object obj8 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    gff gffVar = (gff) cffVar3.o.getValue();
                    vbc vbcVar3 = (vbc) this.m;
                    gffVar.getClass();
                    dfa a7 = gff.a(vbcVar3);
                    cff.a(cffVar3, a7);
                    yef yefVar2 = (yef) cffVar3.n.getValue();
                    this.k = 1;
                    Object a8 = lmm.a(((v55) yefVar2.b.getValue()).r(), new i55(a7, null), this);
                    if (a8 != obj8) {
                        a8 = Unit.a;
                    }
                    if (a8 != obj8) {
                        a8 = Unit.a;
                    }
                    if (a8 == obj8) {
                        return obj8;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                dff dffVar4 = (dff) this.l;
                Object obj9 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    hff hffVar = (hff) dffVar4.t.getValue();
                    vbc vbcVar4 = (vbc) this.m;
                    hffVar.getClass();
                    nef a9 = hff.a(vbcVar4);
                    dff.a(dffVar4, a9);
                    ty4 ty4Var2 = (ty4) dffVar4.q.getValue();
                    this.k = 1;
                    Object a10 = lmm.a(((v55) ty4Var2.b.getValue()).r(), new q55(a9, null), this);
                    if (a10 != obj9) {
                        a10 = Unit.a;
                    }
                    if (a10 != obj9) {
                        a10 = Unit.a;
                    }
                    if (a10 == obj9) {
                        return obj9;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                ggf ggfVar = (ggf) this.l;
                xdr xdrVar3 = ggfVar.d;
                nm6 nm6Var10 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar4 = ggfVar.b;
                    jgf jgfVar = (jgf) this.m;
                    xdrVar4.getClass();
                    xdrVar4.m(null, jgfVar);
                    Boolean bool2 = Boolean.TRUE;
                    xdrVar3.getClass();
                    xdrVar3.m(null, bool2);
                    rar rarVar = ggfVar.h;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    ggfVar.h = ox6.B(zsd.H0(zsd.d0(zsd.b0(new ifd(ggfVar.a.g(), i3)), 1), 1), ggfVar.f, new otd(13, ggfVar));
                    long j2 = ggf.i;
                    this.k = 1;
                    if (y2x.p(j2, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                int i22 = ggf.j;
                rar rarVar2 = ggfVar.h;
                if (rarVar2 != null) {
                    rarVar2.g(null);
                }
                ggfVar.h = null;
                Boolean bool3 = Boolean.FALSE;
                xdrVar3.getClass();
                xdrVar3.m(null, bool3);
                return Unit.a;
            case 14:
                fhf fhfVar = (fhf) this.l;
                nm6 nm6Var11 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    lhf lhfVar = (lhf) fhfVar.o.getValue();
                    vbc vbcVar5 = (vbc) this.m;
                    lhfVar.getClass();
                    yfa a11 = lhf.a(vbcVar5);
                    xdr xdrVar5 = fhfVar.l;
                    lhf lhfVar2 = (lhf) fhfVar.o.getValue();
                    List list = (List) xdrVar5.getValue();
                    lhfVar2.getClass();
                    list.getClass();
                    List<vbc> list2 = list;
                    ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                    for (vbc vbcVar6 : list2) {
                        if (vbcVar6 instanceof pbc) {
                            vbcVar6 = new pbc(a11 == yfa.a);
                        } else if (vbcVar6 instanceof kbc) {
                            vbcVar6 = new kbc(a11 == yfa.b);
                        } else if (vbcVar6 instanceof ubc) {
                            vbcVar6 = new ubc(a11 == yfa.c);
                        } else if (vbcVar6 instanceof qbc) {
                            vbcVar6 = new qbc(a11 == yfa.d);
                        } else {
                            su4.s(2, null, "this type of sorting is not expected", null);
                            arrayList.add(vbcVar6);
                        }
                        arrayList.add(vbcVar6);
                    }
                    xdrVar5.m(null, arrayList);
                    xgf xgfVar = (xgf) fhfVar.n.getValue();
                    this.k = 1;
                    if (xgfVar.a(a11, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                ghf ghfVar = (ghf) this.l;
                nm6 nm6Var12 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    mhf mhfVar = (mhf) ghfVar.s.getValue();
                    vbc vbcVar7 = (vbc) this.m;
                    mhfVar.getClass();
                    ogf a12 = mhf.a(vbcVar7);
                    xdr xdrVar6 = ghfVar.o;
                    mhf mhfVar2 = (mhf) ghfVar.s.getValue();
                    List list3 = (List) xdrVar6.getValue();
                    mhfVar2.getClass();
                    list3.getClass();
                    List<vbc> list4 = list3;
                    ArrayList arrayList2 = new ArrayList(v75.o(list4, 10));
                    for (vbc vbcVar8 : list4) {
                        if (vbcVar8 instanceof nbc) {
                            vbcVar8 = new nbc(a12 == ogf.a);
                        } else if (vbcVar8 instanceof kbc) {
                            vbcVar8 = new kbc(a12 == ogf.b);
                        } else if (vbcVar8 instanceof ubc) {
                            vbcVar8 = new ubc(a12 == ogf.c);
                        } else if (vbcVar8 instanceof qbc) {
                            vbcVar8 = new qbc(a12 == ogf.d);
                        } else {
                            su4.s(2, null, "this type of sorting is not expected", null);
                            arrayList2.add(vbcVar8);
                        }
                        arrayList2.add(vbcVar8);
                    }
                    xdrVar6.m(null, arrayList2);
                    xy4 xy4Var = (xy4) ghfVar.r.getValue();
                    this.k = 1;
                    if (xy4Var.a(a12, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                fjf fjfVar = (fjf) this.l;
                nm6 nm6Var13 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar2 = ((upq) fjfVar.f.getValue()).i;
                    ejf ejfVar = new ejf((String) this.m, null, i4);
                    this.k = 1;
                    j0 = zsd.j0(x0qVar2, ejfVar, this);
                    if (j0 == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    j0 = obj;
                }
                Pair pair = (Pair) j0;
                djf djfVar = fjfVar.h;
                if (djfVar != null) {
                    djfVar.c = pair != null ? (Boolean) pair.b : null;
                }
                return Unit.a;
            case 17:
                nm6 nm6Var14 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar2 = (pjc) this.l;
                    nz5 nz5Var = new nz5((Continuation) null, (tkf) this.m, 23);
                    this.k = 1;
                    if (zsd.O(pjcVar2, nz5Var, this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                elf elfVar = (elf) this.m;
                jyr jyrVar5 = elfVar.z;
                nm6 nm6Var15 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    s9p y3 = tyf.y((lwu) ((mg5) elfVar.q.getValue()).e.a.getValue());
                    R = y3 != null ? o8g.R(y3) : null;
                    if (R == null) {
                        R = c5b.a;
                    }
                    this.l = R;
                    this.k = 1;
                    d = ((ofo) elfVar.w.getValue()).d(R, this);
                    break;
                } else {
                    if (i27 != 1) {
                        if (i27 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        if (i27 == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    R = (List) this.l;
                    qgg.h0(obj);
                    d = obj;
                }
                rj6 rj6Var = (rj6) d;
                if (!(rj6Var instanceof qj6)) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    x0q x0qVar3 = elfVar.s;
                    blf blfVar = blf.a;
                    this.l = null;
                    this.k = 2;
                    break;
                } else {
                    g5v g5vVar = (g5v) ((qj6) rj6Var).a;
                    Iterator it = g5vVar.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (Intrinsics.d(((h5v) obj2).a, "contexts")) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    h5v h5vVar = (h5v) obj2;
                    Iterable iterable = h5vVar != null ? h5vVar.b : null;
                    if (iterable == null) {
                        iterable = c5b.a;
                    }
                    Iterable<cgr> iterable2 = iterable;
                    ArrayList arrayList3 = new ArrayList(v75.o(iterable2, 10));
                    for (cgr cgrVar : iterable2) {
                        xxu xxuVar = (xxu) ((cyu) ((yxu) jyrVar5.getValue())).e.getValue();
                        arrayList3.add(new cgr(cgrVar.a, cgrVar.b, cgrVar.c, cgrVar.d, cgrVar.e, cgrVar.a.equals(xxuVar != null ? xxuVar.a : null)));
                    }
                    qdc qdcVar = elfVar.m;
                    List<String> list5 = R;
                    qdcVar.getClass();
                    list5.getClass();
                    ssg.a(3, "RadioBlocksManager", "initFromSettingsBlocks(" + arrayList3 + ")", null);
                    Iterator it2 = arrayList3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            if (list5.contains(((cgr) obj3).a.toString())) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    cgr cgrVar2 = (cgr) obj3;
                    ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        cgr cgrVar3 = (cgr) it3.next();
                        arrayList4.add(new nfn(cgrVar3, Intrinsics.d(cgrVar3, cgrVar2)));
                    }
                    ssg.a(3, "RadioBlocksManager", "New blocks: " + arrayList3 + "\nwith selection state: " + list5, null);
                    xdr xdrVar7 = (xdr) qdcVar.b;
                    xdrVar7.getClass();
                    xdrVar7.m(null, arrayList4);
                    iwe iweVar = elfVar.n;
                    LinkedHashMap linkedHashMap = g5vVar.b;
                    iweVar.getClass();
                    ssg.a(3, "RadioRestrictionsManager", "initFromRestrictions(" + linkedHashMap.entrySet() + ")", null);
                    HashMap hashMap = new HashMap();
                    for (String str2 : list5) {
                        Iterator it4 = linkedHashMap.entrySet().iterator();
                        zgn zgnVar = null;
                        while (true) {
                            if (it4.hasNext()) {
                                Map.Entry entry = (Map.Entry) it4.next();
                                Iterator it5 = ((wgn) entry.getValue()).b.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        obj5 = it5.next();
                                        if (Intrinsics.d(((zgn) obj5).a(), str2)) {
                                        }
                                    } else {
                                        obj5 = null;
                                    }
                                }
                                zgn zgnVar2 = (zgn) obj5;
                                if (zgnVar2 != null) {
                                    str = (String) entry.getKey();
                                    zgnVar = zgnVar2;
                                } else {
                                    zgnVar = zgnVar2;
                                }
                            } else {
                                str = null;
                            }
                        }
                        if (str != null && zgnVar != null) {
                            hashMap.put(str, zgnVar);
                        }
                    }
                    ssg.a(3, "RadioRestrictionsManager", "New restrictions: " + linkedHashMap.entrySet() + "\nwith selection state: " + hashMap.entrySet(), null);
                    xdr xdrVar8 = (xdr) iweVar.b;
                    ahn ahnVar = new ahn(linkedHashMap, hashMap);
                    xdrVar8.getClass();
                    xdrVar8.m(null, ahnVar);
                    yxu yxuVar = (yxu) jyrVar5.getValue();
                    this.l = null;
                    this.k = 3;
                    cyu cyuVar = (cyu) yxuVar;
                    xdr xdrVar9 = cyuVar.d;
                    xxu xxuVar2 = (xxu) xdrVar9.getValue();
                    if (xxuVar2 == null) {
                        obj4 = Unit.a;
                        break;
                    } else {
                        xdrVar9.l(null);
                        wb7 wb7Var = cyuVar.b;
                        if (wb7Var != null) {
                            obj4 = lmm.a(wb7Var, new zxu(cyuVar, xxuVar2, null), this);
                            if (obj4 != nm6.a) {
                                obj4 = Unit.a;
                                break;
                            }
                        } else {
                            obj4 = Unit.a;
                            break;
                        }
                    }
                }
                return nm6Var15;
            case 19:
                nm6 nm6Var16 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    pfm pfmVar = (pfm) this.l;
                    rna rnaVar = new rna((o3k) this.m, continuation, i6);
                    this.k = 1;
                    if (xee.v(pfmVar, rnaVar, this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 20:
                nm6 nm6Var17 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    v3k v3kVar = (v3k) this.l;
                    kvf kvfVar = ((lvf) this.m).c;
                    this.k = 1;
                    Object t2 = kvfVar.h.t(new w90(kvfVar, v3kVar, continuation, i5), this);
                    if (t2 != nm6Var17) {
                        t2 = Unit.a;
                    }
                    if (t2 == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i29 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 21:
                nm6 nm6Var18 = nm6.a;
                int i30 = this.k;
                if (i30 != 0) {
                    if (i30 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                nwf nwfVar = (nwf) this.l;
                v3 v3Var = (v3) this.m;
                this.k = 1;
                luk.a(nwfVar, v3Var, this);
                return nm6Var18;
            case 22:
                nm6 nm6Var19 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    nyf nyfVar = ((qyf) this.l).a;
                    ?? r3 = (aur) this.m;
                    this.k = 1;
                    lyf lyfVar = lyf.a;
                    dq7 dq7Var = ca8.a;
                    if (x97.V(j5h.a.g, new rlg(nyfVar, (Function2) r3, (Continuation) null), this) == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                rjc rjcVar = (rjc) this.l;
                nm6 nm6Var20 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    w2g w2gVar = (w2g) this.m;
                    l2g l2gVar = w2gVar.c;
                    h2g h2gVar = w2gVar.a;
                    boolean z = w2gVar.k;
                    this.l = rjcVar;
                    this.k = 1;
                    a = l2gVar.a(h2gVar, z, this);
                    break;
                } else {
                    if (i32 != 1) {
                        if (i32 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                bzd bzdVar = (bzd) jf0.F((rj6) a);
                this.l = null;
                this.k = 2;
                break;
            case 24:
                nm6 nm6Var21 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar4 = ((t3g) this.l).c;
                    c3g c3gVar = (c3g) this.m;
                    this.k = 1;
                    if (x0qVar4.emit(c3gVar, this) == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i33 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 25:
                nsh nshVar = (nsh) this.m;
                nm6 nm6Var22 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    jmd jmdVar = new jmd(nshVar, continuation, 16);
                    this.k = 1;
                    L = tyf.L(10000L, jmdVar, this);
                    break;
                } else {
                    if (i34 != 1) {
                        if (i34 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        nu1Var = (nu1) this.l;
                        qgg.h0(obj);
                        h = obj;
                        if (((Boolean) h).booleanValue()) {
                            ((t3g) nshVar.c).r(nu1Var);
                        } else {
                            ((t3g) nshVar.c).y(nu1Var);
                        }
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    L = obj;
                }
                nu1 nu1Var2 = (nu1) L;
                if (nu1Var2 == null) {
                    dfi.r("state loss possible", "LikesViewModel");
                    return Unit.a;
                }
                t3g t3gVar = (t3g) nshVar.c;
                this.l = nu1Var2;
                this.k = 2;
                h = t3gVar.h(nu1Var2, this);
                if (h != nm6Var22) {
                    nu1Var = nu1Var2;
                    if (((Boolean) h).booleanValue()) {
                    }
                    return Unit.a;
                }
                return nm6Var22;
            case 26:
                return k(obj);
            case 27:
                return l(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return n(obj);
            default:
                nm6 nm6Var23 = nm6.a;
                int i35 = this.k;
                if (i35 == 0) {
                    qgg.h0(obj);
                    mw4 mw4Var = mw4.DOWNLOADED_ARTISTS;
                    nrf nrfVar2 = new nrf("collection_downloaded_tracks_id", "COLLECTION_DOWNLOADED_TRACKS");
                    qja qjaVar = (qja) ((xh1) this.m).h.getValue();
                    this.l = nrfVar2;
                    this.k = 1;
                    a2 = qjaVar.a(this);
                    if (a2 == nm6Var23) {
                        return nm6Var23;
                    }
                    nrfVar = nrfVar2;
                } else {
                    if (i35 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nrfVar = (nrf) this.l;
                    qgg.h0(obj);
                    a2 = obj;
                }
                return new mja(nrfVar, ((Number) a2).intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ptd(pjc pjcVar, Continuation continuation, tkf tkfVar) {
        super(2, continuation);
        this.j = 17;
        this.l = pjcVar;
        this.m = tkfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ptd(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ptd(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
    }
}
