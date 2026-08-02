package ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.bms;
import defpackage.d37;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pez0;
import defpackage.r57;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Pair;", "", BackendConfig.Restrictions.DISABLED, "shimmering", "Lpez0;", "timeslot", "Lr57;", "<anonymous>", "(Lkotlin/Pair;Lkotlin/Pair;Lpez0;)Lr57;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui.ChangeDateTimeViewModel$buttonsFlow$1", f = "ChangeDateTimeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ChangeDateTimeViewModel$buttonsFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeDateTimeViewModel$buttonsFlow$1(d dVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ChangeDateTimeViewModel$buttonsFlow$1 changeDateTimeViewModel$buttonsFlow$1 = new ChangeDateTimeViewModel$buttonsFlow$1(this.this$0, (Continuation) obj4);
        changeDateTimeViewModel$buttonsFlow$1.L$0 = (Pair) obj;
        changeDateTimeViewModel$buttonsFlow$1.L$1 = (Pair) obj2;
        changeDateTimeViewModel$buttonsFlow$1.L$2 = (pez0) obj3;
        return changeDateTimeViewModel$buttonsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        Pair pair2 = (Pair) this.L$1;
        pez0 pez0Var = (pez0) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new r57(new d37(this.this$0.b.w, 2, ((Boolean) pair.c()).booleanValue(), ((Boolean) pair2.c()).booleanValue()), new d37(((Boolean) pair.f()).booleanValue(), ((Boolean) pair2.f()).booleanValue(), this.this$0.b.x, pez0Var != null ? pez0Var.d : null));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
