package ru.yandex.taxi.cashback.router;

import android.content.Intent;
import android.net.Uri;
import defpackage.e5c;
import defpackage.ny61;
import defpackage.po91;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e5c b;

    public a(vpr vprVar, e5c e5cVar) {
        this.a = vprVar;
        this.b = e5cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ClosePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1 closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof ClosePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1) {
            closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1 = (ClosePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1) continuation;
            int i2 = closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    e5c e5cVar = this.b;
                    e5cVar.getClass();
                    Uri data = ((Intent) obj).getData();
                    if (data != null && !po91.e(data) && e5cVar.c.a(data) != null) {
                        closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1.L$0 = null;
                        closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1.L$1 = null;
                        closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1.L$2 = null;
                        closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1.L$3 = null;
                        closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1 = new ClosePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = closePlusHomeOnDeeplinkRouter$start$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
