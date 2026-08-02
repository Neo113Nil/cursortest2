package ru.yandex.taxi.summary.requirements.list.interactors;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.bnx0;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vfx0;
import defpackage.zls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmi31;", "verticalTariff", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lf6v;", "Lufx0;", "Lbnx0;", "<anonymous>", "(Lmi31;Lru/yandex/taxi/theme/ThemeType;)Lf6v;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.TariffRulesStateInteractor$tariffRulesStateFlow$1", f = "TariffRulesStateInteractor.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TariffRulesStateInteractor$tariffRulesStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffRulesStateInteractor$tariffRulesStateFlow$1(l0 l0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = l0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TariffRulesStateInteractor$tariffRulesStateFlow$1 tariffRulesStateInteractor$tariffRulesStateFlow$1 = new TariffRulesStateInteractor$tariffRulesStateFlow$1(this.this$0, (Continuation) obj3);
        tariffRulesStateInteractor$tariffRulesStateFlow$1.L$0 = (mi31) obj;
        return tariffRulesStateInteractor$tariffRulesStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bnx0 bnx0Var;
        mi31 mi31Var = (mi31) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.summary.requirements.list.mapper.b bVar = this.this$0.c;
                ServiceLevel.TariffCard tariffCard = mi31Var.a.x0;
                this.L$0 = mi31Var;
                this.label = 1;
                obj = bVar.a(tariffCard, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            bnx0Var = (bnx0) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            bnx0Var = bnx0.c;
        }
        this.this$0.f.getClass();
        return ru.yandex.taxi.requirements.utils.c.b(bnx0Var, vfx0.a(mi31Var));
    }
}
