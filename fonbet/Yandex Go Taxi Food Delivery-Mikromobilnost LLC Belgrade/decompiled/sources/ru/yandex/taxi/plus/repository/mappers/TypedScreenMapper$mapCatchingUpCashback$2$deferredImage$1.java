package ru.yandex.taxi.plus.repository.mappers;

import defpackage.g59;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.repository.mappers.TypedScreenMapper$mapCatchingUpCashback$2$deferredImage$1", f = "TypedScreenMapper.kt", l = {HProv.PROV_GOST_2001_DH}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class TypedScreenMapper$mapCatchingUpCashback$2$deferredImage$1 extends SuspendLambda implements wls {
    final /* synthetic */ g59 $dto;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedScreenMapper$mapCatchingUpCashback$2$deferredImage$1(d dVar, g59 g59Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$dto = g59Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TypedScreenMapper$mapCatchingUpCashback$2$deferredImage$1(this.this$0, this.$dto, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TypedScreenMapper$mapCatchingUpCashback$2$deferredImage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        d dVar = this.this$0;
        String str = this.$dto.d;
        this.label = 1;
        Object a = d.a(dVar, str, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
