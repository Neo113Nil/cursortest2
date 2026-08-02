package ru.yandex.taxi.communications;

import defpackage.azs;
import defpackage.e3n;
import defpackage.kp50;
import defpackage.lwj0;
import defpackage.msf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.SuggestBannersInteractorImpl$processSuggestResponse$1", f = "SuggestBannersInteractorImpl.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class SuggestBannersInteractorImpl$processSuggestResponse$1 extends SuspendLambda implements wls {
    final /* synthetic */ lwj0 $response;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestBannersInteractorImpl$processSuggestResponse$1(lwj0 lwj0Var, i iVar, Continuation continuation) {
        super(2, continuation);
        this.$response = lwj0Var;
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestBannersInteractorImpl$processSuggestResponse$1(this.$response, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestBannersInteractorImpl$processSuggestResponse$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        msf0 msf0Var = (msf0) this.$response.b(msf0.class);
        if (msf0Var != null) {
            List<msf0.a> list = msf0Var.b;
            i iVar = this.this$0;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (msf0.a aVar : list) {
                String a = aVar.getA();
                long d = iVar.c.d();
                int b = aVar.getB();
                o430 o430Var = e3n.b;
                arrayList.add(new azs(a, e3n.e(kp50.U(b, DurationUnit.SECONDS)) + d));
            }
            ru.yandex.taxi.banners.model.g gVar = this.this$0.b;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (gVar.f(arrayList, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
