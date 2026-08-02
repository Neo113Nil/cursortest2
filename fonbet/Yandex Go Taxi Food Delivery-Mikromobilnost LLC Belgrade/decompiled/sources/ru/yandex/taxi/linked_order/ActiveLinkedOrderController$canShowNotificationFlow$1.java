package ru.yandex.taxi.linked_order;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.dms;
import defpackage.if4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.v40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.fragment.BaseFragment;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "fragment", "Lru/yandex/taxi/fragment/BaseFragment;", MetaDataField.SCREEN_FIELD, "Lcom/yandex/go/navigation/screen/api/Screen;", "<unused var>", "Lcom/yandex/go/preorder/mode/SourcePointMode;", "popupActive"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.linked_order.ActiveLinkedOrderController$canShowNotificationFlow$1", f = "ActiveLinkedOrderController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class ActiveLinkedOrderController$canShowNotificationFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveLinkedOrderController$canShowNotificationFlow$1(a aVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        ActiveLinkedOrderController$canShowNotificationFlow$1 activeLinkedOrderController$canShowNotificationFlow$1 = new ActiveLinkedOrderController$canShowNotificationFlow$1(this.this$0, (Continuation) obj5);
        activeLinkedOrderController$canShowNotificationFlow$1.L$0 = (BaseFragment) obj;
        activeLinkedOrderController$canShowNotificationFlow$1.L$1 = (Screen) obj2;
        activeLinkedOrderController$canShowNotificationFlow$1.Z$0 = booleanValue;
        return activeLinkedOrderController$canShowNotificationFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        v40 v40Var = (BaseFragment) this.L$0;
        Screen screen = (Screen) this.L$1;
        boolean z2 = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (screen != Screen.MAIN_V4) {
            this.this$0.getClass();
            if ((v40Var instanceof if4) && ((if4) v40Var).canBackToActiveLinkedOrderStateBarBeVisible() && !z2) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
