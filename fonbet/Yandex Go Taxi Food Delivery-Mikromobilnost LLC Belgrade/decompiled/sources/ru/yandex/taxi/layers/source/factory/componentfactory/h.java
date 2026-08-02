package ru.yandex.taxi.layers.source.factory.componentfactory;

import com.yandex.runtime.image.ImageProvider;
import defpackage.dxu0;
import defpackage.evu0;
import defpackage.kdc;
import defpackage.mbb1;
import defpackage.ny61;
import defpackage.om6;
import defpackage.rl6;
import defpackage.s8o;
import defpackage.ufu;
import defpackage.vd1;
import defpackage.vpr;
import defpackage.wd1;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ l b;
    public final /* synthetic */ int c;

    public h(vpr vprVar, l lVar, int i) {
        this.a = vprVar;
        this.b = lVar;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e A[Catch: all -> 0x005f, TryCatch #0 {, blocks: (B:18:0x004b, B:20:0x0051, B:25:0x0062, B:27:0x0066, B:29:0x006c, B:33:0x0076, B:35:0x0080, B:37:0x008e, B:38:0x0094), top: B:17:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AdvertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1 advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1;
        int i;
        Integer num;
        vd1 vd1Var;
        kdc b;
        if (continuation instanceof AdvertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1) {
            advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1 = (AdvertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1) continuation;
            int i2 = advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    om6 om6Var = (om6) obj;
                    l lVar = this.b;
                    List list = om6Var.a;
                    rl6 rl6Var = om6Var.d;
                    int i3 = this.c;
                    synchronized (lVar.i) {
                        if (list.isEmpty()) {
                            vd1Var = new vd1(ImageProvider.fromBitmap(l.l), 1, rl6Var);
                        } else {
                            dxu0 dxu0Var = rl6Var.k;
                            String str = dxu0Var != null ? dxu0Var.a : null;
                            if (str != null) {
                                if (evu0.J(str)) {
                                    str = null;
                                }
                                if (str != null && (b = ((ufu) lVar.e).b(str)) != null) {
                                    num = Integer.valueOf(s8o.m(b, lVar.a));
                                    wd1 b2 = lVar.b("overlap_counter_" + i3 + "_" + lVar.g.getThemeType().name(), list, Integer.toHexString(num == null ? num.intValue() : 0), mbb1.e(rl6Var));
                                    vd1Var = new vd1(b2.a, b2.c, rl6Var);
                                }
                            }
                            num = null;
                            wd1 b22 = lVar.b("overlap_counter_" + i3 + "_" + lVar.g.getThemeType().name(), list, Integer.toHexString(num == null ? num.intValue() : 0), mbb1.e(rl6Var));
                            vd1Var = new vd1(b22.a, b22.c, rl6Var);
                        }
                    }
                    advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.L$0 = null;
                    advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.L$1 = null;
                    advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.L$2 = null;
                    advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.L$3 = null;
                    advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(vd1Var, advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1 = new AdvertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1(this, continuation);
        Object obj22 = advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = advertOverlapBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
