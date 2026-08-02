package ru.yandex.taxi.logistics.sdk.tracking.domain.impl;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bo5;
import defpackage.mqi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oqi;
import defpackage.pqi;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.AnswerChoiceDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.QuestionChoiceDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverypoll.DeliveryPollRequestDto;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.PollApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.domain.impl.PollRepositoryImpl$onAnswerSelected$1", f = "PollRepositoryImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PollRepositoryImpl$onAnswerSelected$1 extends SuspendLambda implements wls {
    final /* synthetic */ pqi $newPoll;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollRepositoryImpl$onAnswerSelected$1(b bVar, pqi pqiVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$newPoll = pqiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PollRepositoryImpl$onAnswerSelected$1(this.this$0, this.$newPoll, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PollRepositoryImpl$onAnswerSelected$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        QuestionChoiceDto questionChoiceDto;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        QuestionChoiceDto questionChoiceDto2 = null;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        bo5 bo5Var = bVar.b;
        String str = bVar.d;
        pqi pqiVar = this.$newPoll;
        this.label = 1;
        bo5Var.getClass();
        String uuid = UUID.randomUUID().toString();
        Map map = pqiVar.d;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Set set = (Set) entry.getValue();
            oqi oqiVar = (oqi) pqiVar.b.get(str2);
            if (oqiVar == null) {
                questionChoiceDto = questionChoiceDto2;
            } else {
                String str3 = oqiVar.b;
                ArrayList arrayList2 = oqiVar.d;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (set.contains(((mqi) obj2).a)) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    mqi mqiVar = (mqi) it.next();
                    arrayList4.add(new AnswerChoiceDto(mqiVar.a, mqiVar.b));
                }
                questionChoiceDto = new QuestionChoiceDto(str2, str3, arrayList4);
            }
            if (questionChoiceDto != null) {
                arrayList.add(questionChoiceDto);
            }
            questionChoiceDto2 = null;
        }
        c = ((ru.yandex.taxi.logistics.sdk.network.b) ((PollApi) bo5Var.a.get()).a(uuid, new DeliveryPollRequestDto(arrayList, str))).c((r9 & 1) != 0 ? Integer.MAX_VALUE : 3, 10000L, MapiClientImpl.RETRIES_TIME_MILLIS, this);
        if (c != CoroutineSingletons.COROUTINE_SUSPENDED) {
            c = zy11Var;
        }
        return c == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
