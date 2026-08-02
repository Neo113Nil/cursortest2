package ru.yandex.taxi.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.yju;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyju;", "menuItem", "", "removeTaxiWorkInMenu", "<anonymous>", "(Lyju;Z)Lyju;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.domain.MainMenuItemsInteractorImpl$hireDriverFlow$1", f = "MainMenuItemsInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MainMenuItemsInteractorImpl$hireDriverFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        MainMenuItemsInteractorImpl$hireDriverFlow$1 mainMenuItemsInteractorImpl$hireDriverFlow$1 = new MainMenuItemsInteractorImpl$hireDriverFlow$1(3, (Continuation) obj3);
        mainMenuItemsInteractorImpl$hireDriverFlow$1.L$0 = (yju) obj;
        mainMenuItemsInteractorImpl$hireDriverFlow$1.Z$0 = booleanValue;
        return mainMenuItemsInteractorImpl$hireDriverFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yju yjuVar = (yju) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return z ? yju.n : yjuVar;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
