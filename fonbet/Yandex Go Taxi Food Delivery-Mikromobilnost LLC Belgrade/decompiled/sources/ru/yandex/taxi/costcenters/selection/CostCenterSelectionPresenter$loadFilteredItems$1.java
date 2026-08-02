package ru.yandex.taxi.costcenters.selection;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.costcenters.selection.CostCenterSelectionPresenter$loadFilteredItems$1", f = "CostCenterSelectionPresenter.kt", l = {HProv.PP_NK_SYNC}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CostCenterSelectionPresenter$loadFilteredItems$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $filter;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CostCenterSelectionPresenter$loadFilteredItems$1(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$filter = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CostCenterSelectionPresenter$loadFilteredItems$1(this.this$0, this.$filter, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CostCenterSelectionPresenter$loadFilteredItems$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar2 = this.this$0;
                String str = this.$filter;
                bVar2.z.getClass();
                sjh sjhVar = uyj.a;
                CostCenterSelectionPresenter$loadFilteredItems$1$1$filteredItems$1 costCenterSelectionPresenter$loadFilteredItems$1$1$filteredItems$1 = new CostCenterSelectionPresenter$loadFilteredItems$1$1$filteredItems$1(bVar2, str, null);
                this.L$0 = bVar2;
                this.label = 1;
                Object k0 = tje.k0(sjhVar, costCenterSelectionPresenter$loadFilteredItems$1$1$filteredItems$1, this);
                if (k0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = k0;
                bVar = bVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = (b) this.L$0;
                kotlin.b.b(obj);
            }
            List list = (List) obj;
            b.Pg(bVar, new ArrayList(list), b.Og(bVar, list, bVar.B.b));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.w(th);
        }
        return zy11.a;
    }
}
