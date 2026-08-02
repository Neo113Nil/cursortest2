package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import com.yandex.plus.home.dailyquests.plugin.api.model.i;
import com.yandex.plus.home.dailyquests.plugin.internal.proxy.c;
import com.yandex.plus.pay.ui.core.a;
import com.yandex.pulse.metrics.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class hv0 extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hv0(Object obj, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new hv0((iv0) this.l, continuation, 0);
            case 1:
                return new hv0((ne1) this.l, continuation, 1);
            case 2:
                return new hv0((xv4) this.l, continuation, 2);
            case 3:
                return new hv0((yx4) this.l, continuation, 3);
            case 4:
                return new hv0((tea) this.l, continuation, 4);
            case 5:
                return new hv0((rfa) this.l, continuation, 5);
            case 6:
                return new hv0((xha) this.l, continuation, 6);
            case 7:
                return new hv0((es6) this.l, continuation, 7);
            case 8:
                return new hv0((q3e) this.l, continuation, 8);
            case 9:
                return new hv0((dn9) this.l, continuation, 9);
            case 10:
                return new hv0((k8c) this.l, continuation, 10);
            case 11:
                return new hv0((f5d) this.l, continuation, 11);
            case 12:
                return new hv0((xgd) this.l, continuation, 12);
            case 13:
                return new hv0((gdf) this.l, continuation, 13);
            case 14:
                return new hv0((dff) this.l, continuation, 14);
            case 15:
                return new hv0((ghf) this.l, continuation, 15);
            case 16:
                return new hv0((r5h) this.l, continuation, 16);
            case 17:
                return new hv0((t5h) this.l, continuation, 17);
            case 18:
                return new hv0((rxv) this.l, continuation, 18);
            case 19:
                return new hv0((bci) this.l, continuation, 19);
            case 20:
                return new hv0((vli) this.l, continuation, 20);
            case 21:
                return new hv0((fik) this.l, continuation, 21);
            case 22:
                return new hv0((z4l) this.l, continuation, 22);
            case 23:
                return new hv0((z5l) this.l, continuation, 23);
            case 24:
                return new hv0((pd0) this.l, continuation, 24);
            case 25:
                return new hv0((l13) this.l, continuation, 25);
            case 26:
                return new hv0((i3) this.l, continuation, 26);
            case 27:
                return new hv0((Function1) this.l, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new hv0((a7q) this.l, continuation, 28);
            default:
                return new hv0((jp0) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((hv0) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object a2;
        Object invoke;
        Object a3;
        Object a4;
        Object a5;
        Object a6;
        Object a7;
        long i;
        Serializable m;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    iv0 iv0Var = (iv0) this.l;
                    this.k = 1;
                    if (iv0Var.a.a(this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                cl1 cl1Var = ((ne1) this.l).c;
                this.k = 1;
                Serializable p = cl1Var.p(this);
                return p == nm6Var2 ? nm6Var2 : p;
            case 2:
                xv4 xv4Var = (xv4) this.l;
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    vxr vxrVar = (vxr) xv4Var.q.getValue();
                    this.k = 1;
                    a = vxrVar.a(this);
                    if (a == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
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
                    j0q j0qVar = xv4Var.n;
                    String j0 = j66.j0();
                    this.k = 2;
                    if (j0qVar.emit(j0, this) == nm6Var3) {
                        return nm6Var3;
                    }
                }
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                yx4 yx4Var = (yx4) this.l;
                this.k = 1;
                Object a8 = yx4Var.a(this);
                return a8 == nm6Var4 ? nm6Var4 : a8;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i6 = this.k;
                if (i6 != 0) {
                    if (i6 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                yea yeaVar = ((tea) this.l).a;
                this.k = 1;
                Object a9 = yeaVar.a(this);
                return a9 == nm6Var5 ? nm6Var5 : a9;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i7 = this.k;
                if (i7 != 0) {
                    if (i7 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ufa ufaVar = ((rfa) this.l).a;
                this.k = 1;
                Object a10 = ufaVar.a(this);
                return a10 == nm6Var6 ? nm6Var6 : a10;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i8 = this.k;
                if (i8 != 0) {
                    if (i8 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                zha zhaVar = ((xha) this.l).a;
                this.k = 1;
                Object a11 = zhaVar.a(this);
                return a11 == nm6Var7 ? nm6Var7 : a11;
            case 7:
                es6 es6Var = (es6) this.l;
                Object obj2 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    mqs a12 = ((yka) ((wka) es6Var.a)).a();
                    wka wkaVar = (wka) es6Var.a;
                    Continuation continuation = null;
                    String str = a12 != null ? a12.a : null;
                    this.k = 1;
                    Object V = x97.V(dm6.b, new kun(((yka) wkaVar).c, str, continuation, 25), this);
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V != obj2) {
                        V = Unit.a;
                    }
                    if (V == obj2) {
                        return obj2;
                    }
                } else {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                e6q e6qVar = (e6q) es6Var.b;
                this.k = 2;
                if (e6qVar.a(this) == obj2) {
                    return obj2;
                }
                return Unit.a;
            case 8:
                nm6 nm6Var8 = nm6.a;
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
                q3e q3eVar = (q3e) this.l;
                this.k = 1;
                Object invoke2 = q3eVar.invoke(this);
                return invoke2 == nm6Var8 ? nm6Var8 : invoke2;
            case 9:
                nm6 nm6Var9 = nm6.a;
                int i11 = this.k;
                if (i11 != 0) {
                    if (i11 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                dn9 dn9Var = (dn9) this.l;
                this.k = 1;
                Object e = dn9.e(dn9Var, this);
                return e == nm6Var9 ? nm6Var9 : e;
            case 10:
                nm6 nm6Var10 = nm6.a;
                int i12 = this.k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                k8c k8cVar = (k8c) this.l;
                this.k = 1;
                Object a13 = k8cVar.a(this);
                return a13 == nm6Var10 ? nm6Var10 : a13;
            case 11:
                f5d f5dVar = (f5d) this.l;
                nm6 nm6Var11 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(v3d.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    v3d v3dVar = (v3d) qdcVar.C(I);
                    StationId stationId = f5dVar.a.d.a;
                    stationId.getClass();
                    this.k = 1;
                    a2 = v3dVar.a(stationId, this);
                    if (a2 == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a2 = obj;
                }
                t3d t3dVar = (t3d) a2;
                if (t3dVar instanceof s3d) {
                    return ((s3d) t3dVar).a;
                }
                if (!(t3dVar instanceof r3d)) {
                    b6e.s();
                    return null;
                }
                throw new PlaybackQueueStartValidator$InvalidQueueException("can't start " + f5dVar.a.d.a, ((r3d) t3dVar).a);
            case 12:
                nm6 nm6Var12 = nm6.a;
                int i14 = this.k;
                int i15 = 1;
                if (i14 != 0) {
                    if (i14 == 1) {
                        qgg.h0(obj);
                        a3 = obj;
                        return (mgd) a3;
                    }
                    if (i14 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    invoke = obj;
                    return (mgd) invoke;
                }
                qgg.h0(obj);
                xgd xgdVar = (xgd) this.l;
                mqs mqsVar = (mqs) xgdVar.e;
                if (mqsVar == null) {
                    u8n u8nVar = (u8n) xgdVar.d;
                    if (u8nVar instanceof re5) {
                        this.k = 1;
                        a3 = xgd.a(xgdVar, (re5) u8nVar, this);
                        if (a3 == nm6Var12) {
                            return nm6Var12;
                        }
                        return (mgd) a3;
                    }
                }
                Function1 ikcVar = mqsVar == null ? new ikc(i15, 2, null) : new lgd(new ygd(mqsVar.a, mqsVar.e, (Integer) xgdVar.f), xgdVar.c, 0.0d, null);
                this.k = 2;
                invoke = ikcVar.invoke(this);
                if (invoke == nm6Var12) {
                    return nm6Var12;
                }
                return (mgd) invoke;
            case 13:
                gdf gdfVar = (gdf) this.l;
                nm6 nm6Var13 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    vxr vxrVar2 = (vxr) gdfVar.k.getValue();
                    this.k = 1;
                    a4 = vxrVar2.a(this);
                    if (a4 == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a4 = obj;
                }
                txr txrVar2 = (txr) a4;
                if (!Intrinsics.d(txrVar2, sxr.a)) {
                    if (!Intrinsics.d(txrVar2, rxr.a)) {
                        b6e.s();
                        return null;
                    }
                    j0q j0qVar2 = gdfVar.p;
                    String j02 = j66.j0();
                    this.k = 2;
                    if (j0qVar2.emit(j02, this) == nm6Var13) {
                        return nm6Var13;
                    }
                }
                return Unit.a;
            case 14:
                dff dffVar = (dff) this.l;
                nm6 nm6Var14 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    vxr vxrVar3 = (vxr) dffVar.r.getValue();
                    this.k = 1;
                    a5 = vxrVar3.a(this);
                    if (a5 == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a5 = obj;
                }
                txr txrVar3 = (txr) a5;
                if (!Intrinsics.d(txrVar3, sxr.a)) {
                    if (!Intrinsics.d(txrVar3, rxr.a)) {
                        b6e.s();
                        return null;
                    }
                    j0q j0qVar3 = dffVar.o;
                    String j03 = j66.j0();
                    this.k = 2;
                    if (j0qVar3.emit(j03, this) == nm6Var14) {
                        return nm6Var14;
                    }
                }
                return Unit.a;
            case 15:
                ghf ghfVar = (ghf) this.l;
                nm6 nm6Var15 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    vxr vxrVar4 = (vxr) ghfVar.q.getValue();
                    this.k = 1;
                    a6 = vxrVar4.a(this);
                    if (a6 == nm6Var15) {
                        return nm6Var15;
                    }
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
                    a6 = obj;
                }
                txr txrVar4 = (txr) a6;
                if (!Intrinsics.d(txrVar4, sxr.a)) {
                    if (!Intrinsics.d(txrVar4, rxr.a)) {
                        b6e.s();
                        return null;
                    }
                    j0q j0qVar4 = ghfVar.n;
                    String j04 = j66.j0();
                    this.k = 2;
                    if (j0qVar4.emit(j04, this) == nm6Var15) {
                        return nm6Var15;
                    }
                }
                return Unit.a;
            case 16:
                nm6 nm6Var16 = nm6.a;
                int i19 = this.k;
                if (i19 != 0) {
                    if (i19 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                t5h t5hVar = ((r5h) this.l).a;
                this.k = 1;
                Object a14 = t5hVar.a(this);
                return a14 == nm6Var16 ? nm6Var16 : a14;
            case 17:
                t5h t5hVar2 = (t5h) this.l;
                nm6 nm6Var17 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    vxr vxrVar5 = (vxr) t5hVar2.l.getValue();
                    this.k = 1;
                    a7 = vxrVar5.a(this);
                    if (a7 == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i20 != 1) {
                        if (i20 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a7 = obj;
                }
                txr txrVar5 = (txr) a7;
                if (!Intrinsics.d(txrVar5, sxr.a)) {
                    if (!Intrinsics.d(txrVar5, rxr.a)) {
                        b6e.s();
                        return null;
                    }
                    j0q j0qVar5 = t5hVar2.p;
                    String j05 = j66.j0();
                    this.k = 2;
                    if (j0qVar5.emit(j05, this) == nm6Var17) {
                        return nm6Var17;
                    }
                }
                return Unit.a;
            case 18:
                rxv rxvVar = (rxv) this.l;
                nm6 nm6Var18 = nm6.a;
                int i21 = this.k;
                if (i21 != 0) {
                    if (i21 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x8a x8aVar = rxvVar.v;
                x8aVar.getClass();
                long b = x8aVar.b(bzf.s(Float.MAX_VALUE, Float.MAX_VALUE));
                float b2 = yzt.b(b);
                float c = yzt.c(b);
                int ordinal = rxvVar.e().ordinal();
                if (ordinal == 0) {
                    i = swf.i(-b2, -c);
                } else if (ordinal == 1) {
                    i = swf.i(0.0f, -c);
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    i = swf.i(-b2, 0.0f);
                }
                enj enjVar = new enj(rxvVar.g());
                oct octVar = azt.f;
                fk0 fk0Var = new fk0(enjVar, octVar, null, 12);
                enj enjVar2 = new enj(i);
                uf7 uf7Var = new uf7(new yz0(rxvVar.c, 1.0f));
                kk6 kk6Var = new kk6(rxvVar, 2);
                this.k = 1;
                Object e2 = fk0Var.e();
                long j = enjVar2.a;
                if (nqi.a(fk0Var.h, new bk0(fk0Var, enjVar2, new tf7(uf7Var, octVar, e2, new zm0(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)))), fk0Var.c.d, kk6Var, null), this) == nm6Var18) {
                    return nm6Var18;
                }
                return Unit.a;
            case 19:
                nm6 nm6Var19 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    bci bciVar = (bci) this.l;
                    this.k = 1;
                    if (bciVar.f(this) == nm6Var19) {
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
            case 20:
                nm6 nm6Var20 = nm6.a;
                int i23 = this.k;
                if (i23 != 0) {
                    if (i23 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                tli tliVar = (tli) ((vli) this.l).k.getValue();
                this.k = 1;
                Object a15 = tliVar.a(this);
                return a15 == nm6Var20 ? nm6Var20 : a15;
            case 21:
                nm6 nm6Var21 = nm6.a;
                int i24 = this.k;
                if (i24 != 0) {
                    if (i24 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                k8m k8mVar = (k8m) ((fik) this.l).e.getValue();
                this.k = 1;
                Object a16 = ((ww0) ((sw0) k8mVar.a.getValue())).a(this);
                return a16 == nm6Var21 ? nm6Var21 : a16;
            case 22:
                z4l z4lVar = (z4l) this.l;
                nm6 nm6Var22 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    if (frc.a.e.get() || p6g.C((e6l) ((oq7) z4lVar.f.getValue()).a.c.getValue())) {
                        s4l s4lVar = s4l.d;
                        this.k = 1;
                        if (z4l.a(z4lVar, s4lVar, this) == nm6Var22) {
                            return nm6Var22;
                        }
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                z5l z5lVar = (z5l) this.l;
                nm6 nm6Var23 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    if (((lja) ((e6q) ((uaa) z5lVar.d.getValue())).e.getValue()).a.isEmpty()) {
                        return c5b.a;
                    }
                    yx4 yx4Var2 = (yx4) z5lVar.e.getValue();
                    Integer num = new Integer(100);
                    this.k = 1;
                    yx4Var2.getClass();
                    m = yx4.m(yx4Var2, null, null, num, null, this, 19);
                    if (m == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    m = obj;
                }
                Iterable iterable = (Iterable) m;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((jja) it.next()).a);
                }
                return arrayList;
            case 24:
                nm6 nm6Var24 = nm6.a;
                int i27 = this.k;
                if (i27 != 0) {
                    if (i27 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                m6m m6mVar = (m6m) ((pd0) this.l).c;
                this.k = 1;
                Object a17 = m6mVar.a(this);
                return a17 == nm6Var24 ? nm6Var24 : a17;
            case 25:
                nm6 nm6Var25 = nm6.a;
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
                l13 l13Var = (l13) this.l;
                a aVar = (a) l13Var.a.D(hag.I(a.class), l13Var, l13Var.b);
                this.k = 1;
                com.yandex.plus.pay.ui.core.internal.a a18 = aVar.a();
                return a18 == nm6Var25 ? nm6Var25 : a18;
            case 26:
                nm6 nm6Var26 = nm6.a;
                int i29 = this.k;
                if (i29 != 0) {
                    if (i29 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                h8n h8nVar = (h8n) ((jyr) ((i3) this.l).c).getValue();
                this.k = 1;
                c cVar = h8nVar.a;
                ((i) h8nVar.b.getValue()).getClass();
                Object a19 = cVar.b.a(new com.yandex.plus.home.dailyquests.feature.api.model.i(), this);
                return a19 == nm6Var26 ? nm6Var26 : a19;
            case 27:
                nm6 nm6Var27 = nm6.a;
                int i30 = this.k;
                if (i30 != 0) {
                    if (i30 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                jqj jqjVar = new jqj((Function1) this.l, (Continuation) null, 1);
                mn7 mn7Var = dm6.b;
                this.k = 1;
                Object V2 = x97.V(mn7Var, jqjVar, this);
                return V2 == nm6Var27 ? nm6Var27 : V2;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var28 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    w6q w6qVar = new w6q((a7q) this.l, null, 1);
                    kotlinx.coroutines.a b3 = mal.b();
                    this.k = 1;
                    if (x97.V(b3, w6qVar, this) == nm6Var28) {
                        return nm6Var28;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                Object obj3 = nm6.a;
                int i32 = this.k;
                if (i32 != 0) {
                    if (i32 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                jp0 jp0Var = (jp0) this.l;
                this.k = 1;
                if (((mm6) jp0Var.d) == null) {
                    osh oshVar = (osh) jp0Var.g;
                    if (oshVar != null) {
                        ViewGroup viewGroup = (ViewGroup) oshVar.a;
                        int i33 = 0;
                        while (i33 < viewGroup.getChildCount()) {
                            int i34 = i33 + 1;
                            View childAt = viewGroup.getChildAt(i33);
                            if (childAt != null) {
                                if (!childAt.equals((ComposeView) oshVar.b)) {
                                    ((LinkedHashMap) oshVar.c).put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                                    childAt.setImportantForAccessibility(4);
                                }
                                i33 = i34;
                            } else {
                                rj7.m();
                            }
                        }
                    }
                    Object Q = gld.Q(new n6p(jp0Var, (Continuation) null, 5), this);
                    if (Q != nm6.a) {
                        Q = Unit.a;
                    }
                    if (Q == obj3) {
                        return obj3;
                    }
                    return Unit.a;
                }
                xq0.x("Cannot reuse one SimpleBottomSheetState for two bottom sheets");
                return null;
        }
    }
}
