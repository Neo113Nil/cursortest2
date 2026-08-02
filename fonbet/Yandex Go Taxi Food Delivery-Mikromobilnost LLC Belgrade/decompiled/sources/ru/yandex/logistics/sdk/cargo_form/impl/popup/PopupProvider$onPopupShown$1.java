package ru.yandex.logistics.sdk.cargo_form.impl.popup;

import com.yandex.delivery.utils.storage.impl.c;
import defpackage.aas0;
import defpackage.m8s0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.popup.PopupProvider$onPopupShown$1", f = "PopupProvider.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PopupProvider$onPopupShown$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    final /* synthetic */ m8s0 $showPolicy;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupProvider$onPopupShown$1(b bVar, String str, m8s0 m8s0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$id = str;
        this.$showPolicy = m8s0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PopupProvider$onPopupShown$1(this.this$0, this.$id, this.$showPolicy, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PopupProvider$onPopupShown$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            aas0 aas0Var = this.this$0.b;
            aas0Var.b.add(this.$id);
            c cVar = this.this$0.e;
            m8s0 m8s0Var = this.$showPolicy;
            this.label = 1;
            if (cVar.a(m8s0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
