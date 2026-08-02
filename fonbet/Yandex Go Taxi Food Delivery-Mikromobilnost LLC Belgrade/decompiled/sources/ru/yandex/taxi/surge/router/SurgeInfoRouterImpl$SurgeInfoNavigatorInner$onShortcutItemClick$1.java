package ru.yandex.taxi.surge.router;

import defpackage.dru;
import defpackage.ftw0;
import defpackage.gtw0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.uvw0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.surge.interactor.s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.router.SurgeInfoRouterImpl$SurgeInfoNavigatorInner$onShortcutItemClick$1", f = "SurgeInfoRouterImpl.kt", l = {67}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoRouterImpl$SurgeInfoNavigatorInner$onShortcutItemClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ dru $item;
    int label;
    final /* synthetic */ gtw0 this$0;
    final /* synthetic */ b this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoRouterImpl$SurgeInfoNavigatorInner$onShortcutItemClick$1(gtw0 gtw0Var, dru druVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gtw0Var;
        this.$item = druVar;
        this.this$1 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgeInfoRouterImpl$SurgeInfoNavigatorInner$onShortcutItemClick$1(this.this$0, this.$item, this.this$1, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoRouterImpl$SurgeInfoNavigatorInner$onShortcutItemClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            s sVar = this.this$0.L;
            dru druVar = this.$item;
            this.label = 1;
            obj = sVar.a(druVar, this);
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
        if (((Boolean) obj).booleanValue()) {
            uvw0 uvw0Var = this.$item.e;
            if (uvw0Var != null) {
                gtw0 gtw0Var = this.this$1.a;
                gtw0Var.A((m950) gtw0Var.M.get(), uvw0Var, new ftw0(gtw0Var));
            }
        } else {
            b bVar = this.this$1;
            String str = this.$item.c.a;
            gtw0 gtw0Var2 = bVar.a;
            gtw0Var2.r(new qu(9));
            gtw0Var2.K.handle(str);
        }
        return zy11.a;
    }
}
