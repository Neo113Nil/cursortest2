package ru.yandex.taxi.controller;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/navigation/screen/api/Screen;", "<anonymous>", "(Ltse;)Lcom/yandex/go/navigation/screen/api/Screen;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.controller.StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$superappMainScreenLeftJob$1", f = "StartNextControllerDelegateImpl.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$superappMainScreenLeftJob$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/yandex/go/navigation/screen/api/Screen;"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "ru.yandex.taxi.controller.StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$superappMainScreenLeftJob$1$1", f = "StartNextControllerDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.controller.StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$superappMainScreenLeftJob$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((Screen) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Screen screen = (Screen) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(screen != Screen.MAIN_V4);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$superappMainScreenLeftJob$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$superappMainScreenLeftJob$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((StartNextControllerDelegateImpl$openMainWithAwaitOrdersOnStartup$2$superappMainScreenLeftJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        com.yandex.go.navigation.screen.b c = this.this$0.n.c();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
        this.label = 1;
        Object x = e.x(c, anonymousClass1, this);
        return x == coroutineSingletons ? coroutineSingletons : x;
    }
}
