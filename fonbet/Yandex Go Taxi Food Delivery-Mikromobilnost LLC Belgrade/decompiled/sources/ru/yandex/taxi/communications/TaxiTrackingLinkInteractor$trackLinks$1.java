package ru.yandex.taxi.communications;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.TaxiTrackingLinkInteractor$trackLinks$1", f = "TaxiTrackingLinkInteractor.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TaxiTrackingLinkInteractor$trackLinks$1 extends SuspendLambda implements wls {
    final /* synthetic */ Collection<String> $urls;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiTrackingLinkInteractor$trackLinks$1(Collection collection, q qVar, Continuation continuation) {
        super(2, continuation);
        this.$urls = collection;
        this.this$0 = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiTrackingLinkInteractor$trackLinks$1(this.$urls, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiTrackingLinkInteractor$trackLinks$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        q qVar;
        Iterator it;
        Object obj2;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Collection<String> collection = this.$urls;
            qVar = this.this$0;
            it = collection.iterator();
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$2;
            qVar = (q) this.L$1;
            kotlin.b.b(obj);
        }
        do {
            boolean hasNext = it.hasNext();
            obj2 = zy11.a;
            if (!hasNext) {
                return obj2;
            }
            String str = (String) it.next();
            this.L$0 = null;
            this.L$1 = qVar;
            this.L$2 = it;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 1;
            qVar.b.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0(mdh.b, new TaxiTrackingLinkInteractor$trackLinks$3(str, qVar, null), this);
            if (k0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                obj2 = k0;
            }
        } while (obj2 != obj3);
        return obj3;
    }
}
