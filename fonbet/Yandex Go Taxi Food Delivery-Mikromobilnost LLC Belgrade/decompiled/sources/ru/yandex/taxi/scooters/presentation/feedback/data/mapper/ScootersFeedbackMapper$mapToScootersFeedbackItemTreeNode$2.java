package ru.yandex.taxi.scooters.presentation.feedback.data.mapper;

import defpackage.fln0;
import defpackage.hln0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ovq;
import defpackage.oyr;
import defpackage.tse;
import defpackage.wls;
import defpackage.ysq;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Liln0;", "<anonymous>", "(Ltse;)Liln0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.feedback.data.mapper.ScootersFeedbackMapper$mapToScootersFeedbackItemTreeNode$2", f = "ScootersFeedbackMapper.kt", l = {HProv.PP_DHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersFeedbackMapper$mapToScootersFeedbackItemTreeNode$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<ysq> $feedbackItemsFromResponse;
    final /* synthetic */ List<ovq> $feedbackTreeFromResponse;
    final /* synthetic */ String $rootItemId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFeedbackMapper$mapToScootersFeedbackItemTreeNode$2(List list, String str, a aVar, List list2, Continuation continuation) {
        super(2, continuation);
        this.$feedbackTreeFromResponse = list;
        this.$rootItemId = str;
        this.this$0 = aVar;
        this.$feedbackItemsFromResponse = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersFeedbackMapper$mapToScootersFeedbackItemTreeNode$2(this.$feedbackTreeFromResponse, this.$rootItemId, this.this$0, this.$feedbackItemsFromResponse, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFeedbackMapper$mapToScootersFeedbackItemTreeNode$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        List<ovq> list = this.$feedbackTreeFromResponse;
        String str = this.$rootItemId;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (jl40.l(((ovq) obj2).a, str)) {
                break;
            }
        }
        ovq ovqVar = (ovq) obj2;
        String str2 = this.$rootItemId;
        if (ovqVar == null) {
            ny61.g(oyr.p("Feedback item with this root item id = '", str2, "' was not found in feedback tree"));
            return null;
        }
        hln0 hln0Var = new hln0(new fln0("", str2), ovqVar.c);
        a aVar = this.this$0;
        List list2 = ovqVar.b;
        List<ysq> list3 = this.$feedbackItemsFromResponse;
        List<ovq> list4 = this.$feedbackTreeFromResponse;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object a = aVar.a(hln0Var, list2, 0, list3, list4, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
