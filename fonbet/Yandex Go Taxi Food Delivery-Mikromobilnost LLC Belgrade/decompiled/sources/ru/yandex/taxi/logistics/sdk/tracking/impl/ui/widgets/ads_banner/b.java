package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.ads_banner;

import defpackage.aqi;
import defpackage.bqi;
import defpackage.eri;
import defpackage.fri;
import defpackage.jc1;
import defpackage.ny61;
import defpackage.pc1;
import defpackage.scc;
import defpackage.t701;
import defpackage.vc1;
import defpackage.vpr;
import defpackage.w511;
import defpackage.ypi;
import defpackage.zpi;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ jc1 b;

    public b(vpr vprVar, jc1 jc1Var) {
        this.a = vprVar;
        this.b = jc1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AdsBannerStateHolder$special$$inlined$map$1$2$1 adsBannerStateHolder$special$$inlined$map$1$2$1;
        int i;
        pc1 pc1Var;
        List h;
        vc1 vc1Var;
        if (continuation instanceof AdsBannerStateHolder$special$$inlined$map$1$2$1) {
            adsBannerStateHolder$special$$inlined$map$1$2$1 = (AdsBannerStateHolder$special$$inlined$map$1$2$1) continuation;
            int i2 = adsBannerStateHolder$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adsBannerStateHolder$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = adsBannerStateHolder$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = adsBannerStateHolder$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ypi ypiVar = ((t701) obj).a.b.k;
                    if (ypiVar != null) {
                        this.b.getClass();
                        bqi bqiVar = ypiVar.a;
                        if (bqiVar instanceof aqi) {
                            fri friVar = ((aqi) bqiVar).a;
                            String str = friVar.a;
                            eri eriVar = friVar.b;
                            vc1Var = new vc1(str, eriVar != null ? eriVar.a : null, eriVar != null ? eriVar.b : null);
                        } else {
                            if (!(bqiVar instanceof zpi)) {
                                w511.b();
                                return null;
                            }
                            vc1Var = null;
                        }
                        if (vc1Var != null) {
                            pc1Var = new pc1(vc1Var);
                            h = scc.h(pc1Var);
                            adsBannerStateHolder$special$$inlined$map$1$2$1.L$0 = null;
                            adsBannerStateHolder$special$$inlined$map$1$2$1.L$1 = null;
                            adsBannerStateHolder$special$$inlined$map$1$2$1.L$2 = null;
                            adsBannerStateHolder$special$$inlined$map$1$2$1.L$3 = null;
                            adsBannerStateHolder$special$$inlined$map$1$2$1.I$0 = 0;
                            adsBannerStateHolder$special$$inlined$map$1$2$1.label = 1;
                            if (this.a.emit(h, adsBannerStateHolder$special$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    pc1Var = null;
                    h = scc.h(pc1Var);
                    adsBannerStateHolder$special$$inlined$map$1$2$1.L$0 = null;
                    adsBannerStateHolder$special$$inlined$map$1$2$1.L$1 = null;
                    adsBannerStateHolder$special$$inlined$map$1$2$1.L$2 = null;
                    adsBannerStateHolder$special$$inlined$map$1$2$1.L$3 = null;
                    adsBannerStateHolder$special$$inlined$map$1$2$1.I$0 = 0;
                    adsBannerStateHolder$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(h, adsBannerStateHolder$special$$inlined$map$1$2$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        adsBannerStateHolder$special$$inlined$map$1$2$1 = new AdsBannerStateHolder$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = adsBannerStateHolder$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = adsBannerStateHolder$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
