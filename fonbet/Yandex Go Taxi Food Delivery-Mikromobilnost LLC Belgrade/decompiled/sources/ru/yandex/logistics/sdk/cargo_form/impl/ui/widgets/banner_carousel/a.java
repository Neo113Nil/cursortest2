package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.banner_carousel;

import defpackage.ny61;
import defpackage.pr4;
import defpackage.qr4;
import defpackage.sr4;
import defpackage.tr4;
import defpackage.v0k;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Collections;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ tr4 b;

    public a(vpr vprVar, tr4 tr4Var) {
        this.a = vprVar;
        this.b = tr4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1 bannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof BannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1) {
            bannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1 = (BannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1) continuation;
            int i2 = bannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = bannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    qr4 qr4Var = (qr4) obj;
                    int i3 = 0;
                    Object obj3 = EmptyList.a;
                    if (qr4Var != null) {
                        tr4 tr4Var = this.b;
                        if (!tr4Var.d.C(qr4Var)) {
                            v0k v0kVar = tr4Var.c;
                            v0kVar.a.l(qr4Var.c);
                            obj3 = Collections.singletonList(new pr4(new sr4(i3, tr4Var), qr4Var.b, qr4Var.d, qr4Var.e, qr4Var.a));
                        }
                    }
                    bannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1.L$0 = null;
                    bannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1.L$1 = null;
                    bannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1.L$2 = null;
                    bannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1.L$3 = null;
                    bannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1.I$0 = 0;
                    bannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj3, bannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1) == coroutineSingletons) {
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
        bannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1 = new BannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1(this, continuation);
        Object obj22 = bannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannerCarouselStateHolder$getWidgets$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
