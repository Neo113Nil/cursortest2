package ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui;

import defpackage.ja9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pez0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "dateIndex", "timeIndex", "Lpez0;", "<anonymous>", "(II)Lpez0;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.change_datetime.ui.ChangeDateTimeViewModel$selectedTimeslotFlow$1", f = "ChangeDateTimeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ChangeDateTimeViewModel$selectedTimeslotFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ int I$0;
    /* synthetic */ int I$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeDateTimeViewModel$selectedTimeslotFlow$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        ChangeDateTimeViewModel$selectedTimeslotFlow$1 changeDateTimeViewModel$selectedTimeslotFlow$1 = new ChangeDateTimeViewModel$selectedTimeslotFlow$1(this.this$0, (Continuation) obj3);
        changeDateTimeViewModel$selectedTimeslotFlow$1.I$0 = intValue;
        changeDateTimeViewModel$selectedTimeslotFlow$1.I$1 = intValue2;
        return changeDateTimeViewModel$selectedTimeslotFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        int i2 = this.I$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ja9 ja9Var = (ja9) kotlin.collections.a.S(i, this.this$0.b.y);
        if (ja9Var != null) {
            return (pez0) kotlin.collections.a.S(i2, ja9Var.b);
        }
        return null;
    }
}
