package ru.yandex.taxi.logistics.sdk.tracking.impl.show_content.ui;

import defpackage.gv90;
import defpackage.mu90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sn;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.tracking.domain.api.models.ClickSource;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.show_content.ui.ShowContentViewModel$onListItemClick$1", f = "ShowContentViewModel.kt", l = {HProv.PP_RESERVED1}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ShowContentViewModel$onListItemClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $metricaLabel;
    final /* synthetic */ gv90 $payload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowContentViewModel$onListItemClick$1(a aVar, gv90 gv90Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = gv90Var;
        this.$metricaLabel = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShowContentViewModel$onListItemClick$1(this.this$0, this.$payload, this.$metricaLabel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShowContentViewModel$onListItemClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            gv90 gv90Var = this.$payload;
            String str = this.$metricaLabel;
            aVar.getClass();
            if ((gv90Var instanceof mu90) && (((mu90) gv90Var).a instanceof sn)) {
                aVar.x.x(str != null ? str.concat(".Tapped") : "SharedOrderCard.Tapped", kotlin.collections.b.i(new Pair("button_name", "extend_delivery_expiration_date"), new Pair("action_source", "content_item_button")));
            }
            j jVar = this.this$0.w;
            gv90 gv90Var2 = this.$payload;
            ClickSource clickSource = ClickSource.DYNAMIC_CONTENT_BLOCK;
            this.label = 1;
            if (jVar.b(gv90Var2, clickSource, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
