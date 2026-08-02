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
import defpackage.vpr;
import defpackage.ym00;
import defpackage.zy11;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.layers.domain.model.BubbleType;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;
    public final /* synthetic */ ym00 c;

    public a(vpr vprVar, e eVar, ym00 ym00Var) {
        this.a = vprVar;
        this.b = eVar;
        this.c = ym00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[Catch: all -> 0x005d, TryCatch #0 {, blocks: (B:18:0x0049, B:20:0x004f, B:25:0x0061, B:27:0x0065, B:29:0x006b, B:33:0x0075, B:35:0x007f, B:37:0x008d, B:39:0x0095, B:41:0x00c5, B:43:0x00cd, B:44:0x00d2, B:46:0x00d6), top: B:17:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5 A[Catch: all -> 0x005d, TryCatch #0 {, blocks: (B:18:0x0049, B:20:0x004f, B:25:0x0061, B:27:0x0065, B:29:0x006b, B:33:0x0075, B:35:0x007f, B:37:0x008d, B:39:0x0095, B:41:0x00c5, B:43:0x00cd, B:44:0x00d2, B:46:0x00d6), top: B:17:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1 advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1;
        int i;
        Integer num;
        ImageProvider imageProvider;
        Pair pair;
        kdc b;
        if (continuation instanceof AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1) {
            advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1 = (AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1) continuation;
            int i2 = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    om6 om6Var = (om6) obj;
                    e eVar = this.b;
                    ym00 ym00Var = this.c;
                    List list = om6Var.a;
                    rl6 rl6Var = om6Var.d;
                    synchronized (eVar.i) {
                        if (list.isEmpty()) {
                            pair = new Pair(ImageProvider.fromBitmap(e.m), rl6Var);
                        } else {
                            dxu0 dxu0Var = rl6Var.k;
                            String str = dxu0Var != null ? dxu0Var.a : null;
                            if (str != null) {
                                if (evu0.J(str)) {
                                    str = null;
                                }
                                if (str != null && (b = ((ufu) eVar.g).b(str)) != null) {
                                    num = Integer.valueOf(s8o.m(b, eVar.a));
                                    int intValue = num == null ? num.intValue() : 0;
                                    String hexString = Integer.toHexString(intValue);
                                    String str2 = ru.yandex.taxi.layers.source.factory.a.b(rl6Var.a) + hexString + eVar.f.getThemeType().getWireName();
                                    imageProvider = (ImageProvider) eVar.k.c(str2);
                                    if (imageProvider == null) {
                                        BubbleType e = mbb1.e(rl6Var);
                                        dxu0 dxu0Var2 = rl6Var.k;
                                        imageProvider = eVar.e(str2, ym00Var, list, intValue, hexString, e, dxu0Var2 != null ? dxu0Var2.e : null);
                                    }
                                    pair = new Pair(imageProvider, rl6Var);
                                }
                            }
                            num = null;
                            int intValue2 = num == null ? num.intValue() : 0;
                            String hexString2 = Integer.toHexString(intValue2);
                            String str22 = ru.yandex.taxi.layers.source.factory.a.b(rl6Var.a) + hexString2 + eVar.f.getThemeType().getWireName();
                            imageProvider = (ImageProvider) eVar.k.c(str22);
                            if (imageProvider == null) {
                            }
                            pair = new Pair(imageProvider, rl6Var);
                        }
                    }
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.L$0 = null;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.L$1 = null;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.L$2 = null;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.L$3 = null;
                    advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(pair, advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1) == coroutineSingletons) {
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
        advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1 = new AdvertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1(this, continuation);
        Object obj22 = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = advertBubbleComponentFactory$createMapObjectComponent$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
