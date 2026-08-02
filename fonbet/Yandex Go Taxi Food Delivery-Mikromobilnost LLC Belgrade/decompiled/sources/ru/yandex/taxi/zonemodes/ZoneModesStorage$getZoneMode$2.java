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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/zone/model/ZoneMode;", "<anonymous>", "(Ltse;)Lcom/yandex/go/zone/model/ZoneMode;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.zonemodes.ZoneModesStorage$getZoneMode$2", f = "ZoneModesStorage.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ZoneModesStorage$getZoneMode$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    int label;
    final /* synthetic */ sd61 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneModesStorage$getZoneMode$2(sd61 sd61Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sd61Var;
        this.$orderId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZoneModesStorage$getZoneMode$2(this.this$0, this.$orderId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoneModesStorage$getZoneMode$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String l = this.this$0.c.l(this.$orderId, null);
        if (l != null) {
            ZoneMode zoneMode = (ZoneMode) ((xnt) this.this$0.b).c(l, ZoneMode.Companion.serializer());
            if (zoneMode != null) {
                return zoneMode;
            }
        }
        ZoneMode.Companion.getClass();
        return ZoneMode.d;
    }
}
