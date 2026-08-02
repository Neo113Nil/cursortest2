package ru.yandex.taxi.altpins.models;

import defpackage.f4e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/altpins/models/b$a;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/altpins/models/b$a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.altpins.models.AltpinDestinationMapper$mapConfirmationScreen$2$modal$1", f = "AltpinDestinationMapper.kt", l = {83}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AltpinDestinationMapper$mapConfirmationScreen$2$modal$1 extends SuspendLambda implements wls {
    final /* synthetic */ f4e $model;
    final /* synthetic */ OptionType $selectedType;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AltpinDestinationMapper$mapConfirmationScreen$2$modal$1(f4e f4eVar, Continuation continuation, a aVar, OptionType optionType) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$model = f4eVar;
        this.$selectedType = optionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AltpinDestinationMapper$mapConfirmationScreen$2$modal$1(this.$model, continuation, this.this$0, this.$selectedType);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AltpinDestinationMapper$mapConfirmationScreen$2$modal$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        a aVar = this.this$0;
        f4e f4eVar = this.$model;
        OptionType optionType = this.$selectedType;
        this.label = 1;
        Object a = a.a(aVar, f4eVar, optionType, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
