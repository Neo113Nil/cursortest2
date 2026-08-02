package ru.yandex.taxi.translations.interactor;

import defpackage.auu0;
import defpackage.k8u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz01;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.z2b0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.translations.interactor.TranslationsLoadInteractor$fetchStrings$2$1$1", f = "TranslationsLoadInteractor.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class TranslationsLoadInteractor$fetchStrings$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<String> $keySetsNames;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationsLoadInteractor$fetchStrings$2$1$1(List list, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$keySetsNames = list;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TranslationsLoadInteractor$fetchStrings$2$1$1 translationsLoadInteractor$fetchStrings$2$1$1 = new TranslationsLoadInteractor$fetchStrings$2$1$1(this.$keySetsNames, this.this$0, continuation);
        translationsLoadInteractor$fetchStrings$2$1$1.L$0 = obj;
        return translationsLoadInteractor$fetchStrings$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TranslationsLoadInteractor$fetchStrings$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            List<String> list = this.$keySetsNames;
            a aVar = this.this$0;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(tje.h(tseVar, null, null, new TranslationsLoadInteractor$fetchStrings$2$1$1$requestsJobs$1$1((String) it.next(), aVar, null), 3));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        Map s = kotlin.collections.b.s((Iterable) obj);
        oz01 oz01Var = this.this$0.b;
        oz01Var.c = s;
        oz01Var.d = oz01.b(s);
        z2b0 z2b0Var = oz01Var.b;
        wnt wntVar = z2b0Var.a;
        auu0 auu0Var = auu0.a;
        z2b0Var.b.setValue(z2b0Var, z2b0.c[0], ((xnt) wntVar).e(s, new k8u(auu0Var, new k8u(auu0Var, auu0Var, 1), 1)));
        return zy11.a;
    }
}
