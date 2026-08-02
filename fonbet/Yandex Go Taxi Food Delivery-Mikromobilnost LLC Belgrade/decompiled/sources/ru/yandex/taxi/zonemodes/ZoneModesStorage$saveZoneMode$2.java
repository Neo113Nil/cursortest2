package ru.yandex.taxi.zonemodes;

import com.yandex.go.zone.model.ZoneMode;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sd61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.zonemodes.ZoneModesStorage$saveZoneMode$2", f = "ZoneModesStorage.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ZoneModesStorage$saveZoneMode$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    final /* synthetic */ ZoneMode $zoneMode;
    int label;
    final /* synthetic */ sd61 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneModesStorage$saveZoneMode$2(sd61 sd61Var, String str, ZoneMode zoneMode, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sd61Var;
        this.$orderId = str;
        this.$zoneMode = zoneMode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZoneModesStorage$saveZoneMode$2(this.this$0, this.$orderId, this.$zoneMode, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ZoneModesStorage$saveZoneMode$2 zoneModesStorage$saveZoneMode$2 = (ZoneModesStorage$saveZoneMode$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        zoneModesStorage$saveZoneMode$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        sd61 sd61Var = this.this$0;
        sd61Var.c.r(this.$orderId, ((xnt) sd61Var.b).e(this.$zoneMode, ZoneMode.Companion.serializer()));
        return zy11.a;
    }
}
