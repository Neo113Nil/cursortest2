package ru.yandex.taxi.search;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.search.address.model.Service;
import defpackage.dms;
import defpackage.fnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Optional;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Ljava/util/Optional;", "Lfnx0;", "tariffSelectionOptional", "Lcom/yandex/go/navigation/screen/api/Screen;", MetaDataField.SCREEN_FIELD, "Lcom/yandex/go/search/address/model/Service;", Constants.KEY_SERVICE, "", "<unused var>", "Lru/yandex/taxi/address/experiment/e;", "<anonymous>", "(Ljava/util/Optional;Lcom/yandex/go/navigation/screen/api/Screen;Lcom/yandex/go/search/address/model/Service;Ljava/lang/Object;)Lru/yandex/taxi/address/experiment/e;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.search.NewbiesRedesignInteractor$selectedTariffConfigFlow$1", f = "NewbiesRedesignInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class NewbiesRedesignInteractor$selectedTariffConfigFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewbiesRedesignInteractor$selectedTariffConfigFlow$1(Continuation continuation, c cVar) {
        super(5, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        NewbiesRedesignInteractor$selectedTariffConfigFlow$1 newbiesRedesignInteractor$selectedTariffConfigFlow$1 = new NewbiesRedesignInteractor$selectedTariffConfigFlow$1((Continuation) obj5, this.this$0);
        newbiesRedesignInteractor$selectedTariffConfigFlow$1.L$0 = (Optional) obj;
        newbiesRedesignInteractor$selectedTariffConfigFlow$1.L$1 = (Screen) obj2;
        newbiesRedesignInteractor$selectedTariffConfigFlow$1.L$2 = (Service) obj3;
        return newbiesRedesignInteractor$selectedTariffConfigFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pex0 pex0Var;
        Optional optional = (Optional) this.L$0;
        Screen screen = (Screen) this.L$1;
        Service service = (Service) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (screen == Screen.SUMMARY_TRANSPORT) {
            return null;
        }
        fnx0 fnx0Var = (fnx0) optional.orElse(null);
        String str2 = fnx0Var != null ? fnx0Var.d : null;
        if (fnx0Var != null && (pex0Var = fnx0Var.c) != null) {
            str = pex0Var.b;
        }
        return this.this$0.a.b(str2, str, service);
    }
}
