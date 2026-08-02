package ru.yandex.taxi.summary.requirements.list.recycler;

import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.iij0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.recycler.TransferV2ViewHolder$bindLead$1", f = "RequirementsV2ViewHolders.kt", l = {992}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TransferV2ViewHolder$bindLead$1 extends SuspendLambda implements wls {
    final /* synthetic */ iij0 $data;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferV2ViewHolder$bindLead$1(iij0 iij0Var, n nVar, Continuation continuation) {
        super(2, continuation);
        this.$data = iij0Var;
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferV2ViewHolder$bindLead$1(this.$data, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferV2ViewHolder$bindLead$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ListItemComponent listItemComponent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = this.$data.c;
            if (str != null && str.length() != 0) {
                n nVar = this.this$0;
                int i2 = n.Z;
                ListItemComponent listItemComponent2 = (ListItemComponent) ((View) nVar.R);
                ru.yandex.taxi.widget.utils.e eVar = nVar.U;
                this.L$0 = null;
                this.L$1 = listItemComponent2;
                this.label = 1;
                obj = ru.yandex.taxi.widget.utils.e.f(eVar, str, null, this, 6);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                listItemComponent = listItemComponent2;
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        listItemComponent = (ListItemComponent) this.L$1;
        kotlin.b.b(obj);
        listItemComponent.setLeadImage((Drawable) obj);
        return zy11.a;
    }
}
