package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location;

import defpackage.gw00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location.LiveLocationStateHolder$onToggleCheckedChange$1", f = "LiveLocationStateHolder.kt", l = {HProv.PROV_GOST_2001_DH, 81}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class LiveLocationStateHolder$onToggleCheckedChange$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isChecked;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveLocationStateHolder$onToggleCheckedChange$1(boolean z, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$isChecked = z;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LiveLocationStateHolder$onToggleCheckedChange$1(this.$isChecked, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LiveLocationStateHolder$onToggleCheckedChange$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r5.a(false, r4) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location.d.b(r1, r4) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean z = this.$isChecked;
            d dVar = this.this$0;
            if (z) {
                this.label = 2;
            } else {
                com.yandex.delivery.live.location.impl.repository.b bVar = dVar.b;
                this.label = 1;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            this.this$0.c("DeliveryLiveLocation.Toggle.Switched", gw00.e(new Pair("is_on", Boolean.FALSE)));
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
