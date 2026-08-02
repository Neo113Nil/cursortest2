package ru.yandex.taxi.summary.solid.promotion_modal_windows.ui;

import defpackage.flv0;
import defpackage.ilv0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.summary.solid.promotion_modal_windows.ui.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.promotion_modal_windows.ui.SummaryPromotionModalWindowByIdRouterImpl$onLaunch$1", f = "SummaryPromotionModalWindowByIdRouterImpl.kt", l = {20}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryPromotionModalWindowByIdRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPromotionModalWindowByIdRouterImpl$onLaunch$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryPromotionModalWindowByIdRouterImpl$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryPromotionModalWindowByIdRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            String str = this.$payload;
            this.label = 1;
            obj = a.P(aVar, str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        ilv0 ilv0Var = (ilv0) obj;
        boolean z = ilv0Var instanceof flv0;
        final a aVar2 = this.this$0;
        zy11 zy11Var = zy11.a;
        if (!z) {
            aVar2.r(new qu(9));
            return zy11Var;
        }
        final int i3 = 0;
        aVar2.D.a((flv0) ilv0Var, new sls() { // from class: klv0
            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i3;
                zy11 zy11Var2 = zy11.a;
                a aVar3 = aVar2;
                switch (i4) {
                    case 0:
                        if (aVar3.u()) {
                            aVar3.r(new qu(9));
                            break;
                        }
                        break;
                    default:
                        if (aVar3.u()) {
                            aVar3.r(new qu(9));
                            break;
                        }
                        break;
                }
                return zy11Var2;
            }
        }, new sls() { // from class: klv0
            @Override // defpackage.sls
            public final Object invoke() {
                int i4 = i2;
                zy11 zy11Var2 = zy11.a;
                a aVar3 = aVar2;
                switch (i4) {
                    case 0:
                        if (aVar3.u()) {
                            aVar3.r(new qu(9));
                            break;
                        }
                        break;
                    default:
                        if (aVar3.u()) {
                            aVar3.r(new qu(9));
                            break;
                        }
                        break;
                }
                return zy11Var2;
            }
        });
        return zy11Var;
    }
}
