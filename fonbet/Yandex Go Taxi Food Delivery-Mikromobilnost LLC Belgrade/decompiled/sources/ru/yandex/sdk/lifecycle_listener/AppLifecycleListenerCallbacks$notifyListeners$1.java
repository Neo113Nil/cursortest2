package ru.yandex.sdk.lifecycle_listener;

import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pu2;
import defpackage.tls;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.sdk.lifecycle_listener.AppLifecycleListenerCallbacks$notifyListeners$1", f = "AppLifecycleListenerCallbacks.kt", l = {109}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class AppLifecycleListenerCallbacks$notifyListeners$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $notifyAction;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AppLifecycleListenerCallbacks this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLifecycleListenerCallbacks$notifyListeners$1(AppLifecycleListenerCallbacks appLifecycleListenerCallbacks, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = appLifecycleListenerCallbacks;
        this.$notifyAction = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AppLifecycleListenerCallbacks$notifyListeners$1(this.this$0, this.$notifyAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AppLifecycleListenerCallbacks$notifyListeners$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        AppLifecycleListenerCallbacks appLifecycleListenerCallbacks;
        g050 g050Var2;
        tls tlsVar;
        Set set;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            g050Var = this.this$0.mutex;
            appLifecycleListenerCallbacks = this.this$0;
            tls tlsVar2 = this.$notifyAction;
            this.L$0 = g050Var;
            this.L$1 = appLifecycleListenerCallbacks;
            this.L$2 = tlsVar2;
            this.I$0 = 0;
            this.label = 1;
            if (g050Var.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var2 = g050Var;
            tlsVar = tlsVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tlsVar = (tls) this.L$2;
            appLifecycleListenerCallbacks = (AppLifecycleListenerCallbacks) this.L$1;
            g050Var2 = (g050) this.L$0;
            b.b(obj);
        }
        try {
            set = appLifecycleListenerCallbacks.listeners;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                tlsVar.invoke((pu2) it.next());
            }
            g050Var2.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var2.d(null);
            throw th;
        }
    }
}
