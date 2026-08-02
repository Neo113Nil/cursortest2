package ru.yandex.logistics.sdk.order_validation.impl.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz21;
import defpackage.qz21;
import defpackage.rz21;
import defpackage.tcc;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.formvalidation.FormValidationRequestDto;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/formvalidation/FormValidationResponseDto;", "<anonymous>", "()Lan2;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.order_validation.impl.data.ValidationDataSource$validate$2", f = "ValidationDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ValidationDataSource$validate$2 extends SuspendLambda implements tls {
    final /* synthetic */ qz21 $request;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidationDataSource$validate$2(a aVar, qz21 qz21Var, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$request = qz21Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ValidationDataSource$validate$2(this.this$0, this.$request, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ValidationDataSource$validate$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ValidationApi validationApi = (ValidationApi) this.this$0.i.get();
        rz21 rz21Var = this.this$0.j;
        qz21 qz21Var = this.$request;
        rz21Var.getClass();
        ArrayList arrayList = qz21Var.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new FormValidationRequestDto.OffersDto(((pz21) it.next()).a));
        }
        return validationApi.a(new FormValidationRequestDto(arrayList2, qz21Var.b, qz21Var.c, qz21Var.d));
    }
}
