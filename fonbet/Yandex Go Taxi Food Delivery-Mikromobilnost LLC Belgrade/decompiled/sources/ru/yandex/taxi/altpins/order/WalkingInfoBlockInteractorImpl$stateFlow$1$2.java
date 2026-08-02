package ru.yandex.taxi.altpins.order;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.usg0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$AlternativeDestination$InfoBlock;", "infoBlock", "Lzy11;", "<anonymous>", "(Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$AlternativeDestination$InfoBlock;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.order.WalkingInfoBlockInteractorImpl$stateFlow$1$2", f = "WalkingInfoBlockInteractorImpl.kt", l = {64}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class WalkingInfoBlockInteractorImpl$stateFlow$1$2 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<ThemeType> $latestTheme;
    final /* synthetic */ Ref$ObjectRef<Drawable> $shadow;
    final /* synthetic */ ThemeType $themeType;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkingInfoBlockInteractorImpl$stateFlow$1$2(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, ThemeType themeType, p pVar, Continuation continuation) {
        super(2, continuation);
        this.$shadow = ref$ObjectRef;
        this.$latestTheme = ref$ObjectRef2;
        this.$themeType = themeType;
        this.this$0 = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WalkingInfoBlockInteractorImpl$stateFlow$1$2 walkingInfoBlockInteractorImpl$stateFlow$1$2 = new WalkingInfoBlockInteractorImpl$stateFlow$1$2(this.$shadow, this.$latestTheme, this.$themeType, this.this$0, continuation);
        walkingInfoBlockInteractorImpl$stateFlow$1$2.L$0 = obj;
        return walkingInfoBlockInteractorImpl$stateFlow$1$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkingInfoBlockInteractorImpl$stateFlow$1$2) create((OrderStatusInfo.AlternativeDestination.InfoBlock) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, ru.yandex.taxi.theme.ThemeType] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef<Drawable> ref$ObjectRef;
        T t;
        OrderStatusInfo.AlternativeDestination.InfoBlock infoBlock = (OrderStatusInfo.AlternativeDestination.InfoBlock) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (infoBlock != null) {
                ref$ObjectRef = this.$shadow;
                if (ref$ObjectRef.element == null || this.$latestTheme.element != this.$themeType) {
                    ru.yandex.taxi.design.utils.b bVar = this.this$0.h;
                    int i2 = usg0.order_card_item_radius;
                    this.L$0 = null;
                    this.L$1 = ref$ObjectRef;
                    this.label = 1;
                    Object a = bVar.a(tje.r(i2, bVar.a), true, this);
                    t = a;
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ref$ObjectRef = (Ref$ObjectRef) this.L$1;
        kotlin.b.b(obj);
        t = obj;
        ref$ObjectRef.element = t;
        this.$latestTheme.element = this.$themeType;
        return zy11.a;
    }
}
