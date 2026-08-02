package ru.yandex.taxi.modal.popup.ui.model;

import defpackage.f8e0;
import defpackage.mvg;
import defpackage.n8e0;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lt7e0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.modal.popup.ui.model.PopupDialogModalVOMapper$mapBullets$2", f = "PopupDialogModalVOMapper.kt", l = {101}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PopupDialogModalVOMapper$mapBullets$2 extends SuspendLambda implements wls {
    final /* synthetic */ n8e0 $model;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupDialogModalVOMapper$mapBullets$2(n8e0 n8e0Var, Continuation continuation, a aVar) {
        super(2, continuation);
        this.$model = n8e0Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PopupDialogModalVOMapper$mapBullets$2 popupDialogModalVOMapper$mapBullets$2 = new PopupDialogModalVOMapper$mapBullets$2(this.$model, continuation, this.this$0);
        popupDialogModalVOMapper$mapBullets$2.L$0 = obj;
        return popupDialogModalVOMapper$mapBullets$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PopupDialogModalVOMapper$mapBullets$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        n8e0 n8e0Var = this.$model;
        List list = n8e0Var.f;
        a aVar = this.this$0;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        int i2 = 0;
        for (Object obj2 : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            arrayList.add(tje.h(tseVar, null, null, new PopupDialogModalVOMapper$mapBullets$2$1$1(aVar, (f8e0) obj2, i2, n8e0Var, null), 3));
            i2 = i3;
        }
        this.L$0 = null;
        this.label = 1;
        Object b = kotlinx.coroutines.a.b(arrayList, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
