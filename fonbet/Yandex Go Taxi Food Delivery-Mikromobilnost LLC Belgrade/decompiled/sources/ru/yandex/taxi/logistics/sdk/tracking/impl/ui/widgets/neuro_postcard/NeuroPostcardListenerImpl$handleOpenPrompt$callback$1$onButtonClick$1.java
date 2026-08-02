package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard;

import defpackage.j360;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v360;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.NeuroPostcardListenerImpl$handleOpenPrompt$callback$1$onButtonClick$1", f = "NeuroPostcardListenerImpl.kt", l = {85}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class NeuroPostcardListenerImpl$handleOpenPrompt$callback$1$onButtonClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $text;
    int label;
    final /* synthetic */ j360 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeuroPostcardListenerImpl$handleOpenPrompt$callback$1$onButtonClick$1(j360 j360Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = j360Var;
        this.$text = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NeuroPostcardListenerImpl$handleOpenPrompt$callback$1$onButtonClick$1(this.this$0, this.$text, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NeuroPostcardListenerImpl$handleOpenPrompt$callback$1$onButtonClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j360 j360Var = this.this$0;
            ru.yandex.taxi.logistics.sdk.tracking.impl.domain.neuropostcard_network.c cVar = j360Var.c;
            String str = j360Var.a;
            String str2 = this.$text;
            this.label = 1;
            obj = cVar.a(str, str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        j360.a(this.this$0, (v360) obj);
        this.this$0.h.b();
        return zy11.a;
    }
}
