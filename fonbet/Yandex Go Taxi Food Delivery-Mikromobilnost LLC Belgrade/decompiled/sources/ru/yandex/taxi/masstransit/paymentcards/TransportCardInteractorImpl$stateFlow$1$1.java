package ru.yandex.taxi.masstransit.paymentcards;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import defpackage.d111;
import defpackage.h111;
import defpackage.hfa0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q111;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "Lhfa0;", "currentCardInfo", "Lh111;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lhfa0;)Lh111;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.paymentcards.TransportCardInteractorImpl$stateFlow$1$1", f = "TransportCardInteractorImpl.kt", l = {MSException.ERROR_INVALID_PASSWORD}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TransportCardInteractorImpl$stateFlow$1$1 extends SuspendLambda implements zls {
    final /* synthetic */ q111 $config;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportCardInteractorImpl$stateFlow$1$1(d dVar, q111 q111Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
        this.$config = q111Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TransportCardInteractorImpl$stateFlow$1$1 transportCardInteractorImpl$stateFlow$1$1 = new TransportCardInteractorImpl$stateFlow$1$1(this.this$0, this.$config, (Continuation) obj3);
        transportCardInteractorImpl$stateFlow$1$1.L$0 = (ThemeType) obj;
        transportCardInteractorImpl$stateFlow$1$1.L$1 = (hfa0) obj2;
        return transportCardInteractorImpl$stateFlow$1$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        ThemeType themeType = (ThemeType) this.L$0;
        hfa0 hfa0Var = (hfa0) this.L$1;
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
        q111 q111Var = this.$config;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        dVar.getClass();
        if (q111Var.a) {
            List list = hfa0Var.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof d111) {
                    arrayList.add(obj2);
                }
            }
            boolean isEmpty = arrayList.isEmpty();
            if (isEmpty) {
                c = dVar.b(q111Var, themeType, this);
            } else {
                if (isEmpty) {
                    w511.b();
                    return null;
                }
                c = dVar.c(q111Var, themeType, arrayList, this);
            }
        } else {
            c = h111.k;
        }
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
