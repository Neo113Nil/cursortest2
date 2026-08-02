package ru.yandex.sdk.lifecycle_listener;

import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pu2;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V", "ru/yandex/sdk/lifecycle_listener/AppLifecycleListenerCallbacks$notifyListeners$1"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.sdk.lifecycle_listener.AppLifecycleListenerCallbacks$onAppCreated$$inlined$notifyListeners$1", f = "AppLifecycleListenerCallbacks.kt", l = {109}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class AppLifecycleListenerCallbacks$onAppCreated$$inlined$notifyListeners$1 extends SuspendLambda implements wls {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AppLifecycleListenerCallbacks this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLifecycleListenerCallbacks$onAppCreated$$inlined$notifyListeners$1(AppLifecycleListenerCallbacks appLifecycleListenerCallbacks, Continuation continuation) {
        super(2, continuation);
        this.this$0 = appLifecycleListenerCallbacks;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AppLifecycleListenerCallbacks$onAppCreated$$inlined$notifyListeners$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AppLifecycleListenerCallbacks$onAppCreated$$inlined$notifyListeners$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        g050 g050Var2;
        AppLifecycleListenerCallbacks appLifecycleListenerCallbacks;
        Set set;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            g050Var = this.this$0.mutex;
            AppLifecycleListenerCallbacks appLifecycleListenerCallbacks2 = this.this$0;
            this.L$0 = g050Var;
            this.L$1 = appLifecycleListenerCallbacks2;
            this.I$0 = 0;
            this.label = 1;
            if (g050Var.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var2 = g050Var;
            appLifecycleListenerCallbacks = appLifecycleListenerCallbacks2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            appLifecycleListenerCallbacks = (AppLifecycleListenerCallbacks) this.L$1;
            g050Var2 = (g050) this.L$0;
            b.b(obj);
        }
        try {
            set = appLifecycleListenerCallbacks.listeners;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((pu2) it.next()).getClass();
            }
            g050Var2.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var2.d(null);
            throw th;
        }
    }
}
