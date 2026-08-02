package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content;

import defpackage.gv90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.tracking.domain.api.models.ClickSource;
import ru.yandex.taxi.logistics.sdk.tracking.impl.domain.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.DynamicContentListener$onSlotTrailClicked$1", f = "DynamicContentListener.kt", l = {144}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DynamicContentListener$onSlotTrailClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $metricaLabel;
    final /* synthetic */ gv90 $payload;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicContentListener$onSlotTrailClicked$1(gv90 gv90Var, String str, Continuation continuation, c cVar) {
        super(2, continuation);
        this.$metricaLabel = str;
        this.$payload = gv90Var;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicContentListener$onSlotTrailClicked$1(this.$payload, this.$metricaLabel, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicContentListener$onSlotTrailClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = this.$metricaLabel;
            if (str != null) {
                this.this$0.c.x(str.concat(".Tapped"), null);
            }
            gv90 gv90Var = this.$payload;
            if (gv90Var != null) {
                j jVar = this.this$0.b;
                ClickSource clickSource = ClickSource.DYNAMIC_CONTENT_BLOCK;
                this.L$0 = null;
                this.I$0 = 0;
                this.label = 1;
                if (jVar.b(gv90Var, clickSource, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
