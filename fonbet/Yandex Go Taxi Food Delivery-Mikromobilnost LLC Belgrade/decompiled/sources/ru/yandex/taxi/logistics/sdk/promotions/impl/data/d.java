package ru.yandex.taxi.logistics.sdk.promotions.impl.data;

import defpackage.g8e;
import defpackage.kme0;
import defpackage.mme0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public d(vpr vprVar, e eVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ShownCountRepository$wasShownToday$$inlined$map$1$2$1 shownCountRepository$wasShownToday$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ShownCountRepository$wasShownToday$$inlined$map$1$2$1) {
            shownCountRepository$wasShownToday$$inlined$map$1$2$1 = (ShownCountRepository$wasShownToday$$inlined$map$1$2$1) continuation;
            int i2 = shownCountRepository$wasShownToday$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shownCountRepository$wasShownToday$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = shownCountRepository$wasShownToday$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shownCountRepository$wasShownToday$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object c = ((mme0) obj).c(new kme0(g8e.o("pref_last_shown_date", this.b)));
                    shownCountRepository$wasShownToday$$inlined$map$1$2$1.L$0 = null;
                    shownCountRepository$wasShownToday$$inlined$map$1$2$1.L$1 = null;
                    shownCountRepository$wasShownToday$$inlined$map$1$2$1.L$2 = null;
                    shownCountRepository$wasShownToday$$inlined$map$1$2$1.L$3 = null;
                    shownCountRepository$wasShownToday$$inlined$map$1$2$1.I$0 = 0;
                    shownCountRepository$wasShownToday$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(c, shownCountRepository$wasShownToday$$inlined$map$1$2$1) == coroutineSingletons) {
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
        shownCountRepository$wasShownToday$$inlined$map$1$2$1 = new ShownCountRepository$wasShownToday$$inlined$map$1$2$1(this, continuation);
        Object obj22 = shownCountRepository$wasShownToday$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shownCountRepository$wasShownToday$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
