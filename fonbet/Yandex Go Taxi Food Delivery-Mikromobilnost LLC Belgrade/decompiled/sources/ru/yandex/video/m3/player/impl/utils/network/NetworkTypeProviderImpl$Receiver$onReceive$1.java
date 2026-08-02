package ru.yandex.video.m3.player.impl.utils.network;

import android.content.Context;
import defpackage.g6u;
import defpackage.h5z0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.video.m3.player.impl.utils.ObserverDispatcher;
import ru.yandex.video.m3.player.utils.network.NetworkChangeListener;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.impl.utils.network.NetworkTypeProviderImpl$Receiver$onReceive$1", f = "NetworkTypeProviderImpl.kt", l = {HProv.PP_REFCOUNT}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class NetworkTypeProviderImpl$Receiver$onReceive$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ NetworkTypeProviderImpl this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.player.impl.utils.network.NetworkTypeProviderImpl$Receiver$onReceive$1$1", f = "NetworkTypeProviderImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.player.impl.utils.network.NetworkTypeProviderImpl$Receiver$onReceive$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ NetworkTypeProviderImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NetworkTypeProviderImpl networkTypeProviderImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = networkTypeProviderImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
            return ((AnonymousClass1) create(tseVar, continuation)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ObserverDispatcher observerDispatcher;
            HashSet H0;
            Object failure;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            observerDispatcher = this.this$0.observerDispatcher;
            NetworkTypeProviderImpl networkTypeProviderImpl = this.this$0;
            synchronized (observerDispatcher.getObservers()) {
                H0 = a.H0(observerDispatcher.getObservers());
            }
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                try {
                    ((NetworkChangeListener) it.next()).onNetworkChanged(networkTypeProviderImpl.getNetworkType());
                    failure = zy11.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    h5z0.a.f(a, "notifyObservers", new Object[0]);
                }
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkTypeProviderImpl$Receiver$onReceive$1(NetworkTypeProviderImpl networkTypeProviderImpl, Context context, Continuation<? super NetworkTypeProviderImpl$Receiver$onReceive$1> continuation) {
        super(2, continuation);
        this.this$0 = networkTypeProviderImpl;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new NetworkTypeProviderImpl$Receiver$onReceive$1(this.this$0, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((NetworkTypeProviderImpl$Receiver$onReceive$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.handleOnReceive(this.$context);
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (tje.k0(g6uVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
