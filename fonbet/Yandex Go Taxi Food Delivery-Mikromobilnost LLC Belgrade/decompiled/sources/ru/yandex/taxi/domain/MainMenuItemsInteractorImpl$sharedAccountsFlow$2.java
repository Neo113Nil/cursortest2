package ru.yandex.taxi.domain;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.snr0;
import defpackage.tmr0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lzy11;", "<unused var>", "", "Lsnr0;", "accounts", "Lkotlin/Pair;", "Ltmr0;", "<anonymous>", "(VLjava/util/List;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.domain.MainMenuItemsInteractorImpl$sharedAccountsFlow$2", f = "MainMenuItemsInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MainMenuItemsInteractorImpl$sharedAccountsFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ s0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainMenuItemsInteractorImpl$sharedAccountsFlow$2(Continuation continuation, s0 s0Var) {
        super(3, continuation);
        this.this$0 = s0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MainMenuItemsInteractorImpl$sharedAccountsFlow$2 mainMenuItemsInteractorImpl$sharedAccountsFlow$2 = new MainMenuItemsInteractorImpl$sharedAccountsFlow$2((Continuation) obj3, this.this$0);
        mainMenuItemsInteractorImpl$sharedAccountsFlow$2.L$0 = (List) obj2;
        return mainMenuItemsInteractorImpl$sharedAccountsFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean isEnabled = this.this$0.h.isEnabled();
        List a = this.this$0.g.b.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : a) {
            if (!jl40.l(((tmr0) obj2).a, SharedAccountType.FAMILY.getTypeId()) || !isEnabled) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (!jl40.l(((snr0) obj3).h().getTypeId(), SharedAccountType.FAMILY.getTypeId()) || !isEnabled) {
                arrayList2.add(obj3);
            }
        }
        return new Pair(arrayList, arrayList2);
    }
}
