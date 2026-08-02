package ru.yandex.taxi.plus.repository.mappers;

import defpackage.m1d0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/CharSequence;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.repository.mappers.TypedScreenMapper$mapPlusBurns$2$deferredText$1", f = "TypedScreenMapper.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TypedScreenMapper$mapPlusBurns$2$deferredText$1 extends SuspendLambda implements wls {
    final /* synthetic */ m1d0 $dto;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedScreenMapper$mapPlusBurns$2$deferredText$1(m1d0 m1d0Var, Continuation continuation, d dVar) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$dto = m1d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TypedScreenMapper$mapPlusBurns$2$deferredText$1(this.$dto, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TypedScreenMapper$mapPlusBurns$2$deferredText$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.widget.c cVar = this.this$0.b;
        FormattedText formattedText = this.$dto.b;
        this.label = 1;
        Object b = i.a.b(cVar, formattedText, kotlin.collections.b.f(), this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
