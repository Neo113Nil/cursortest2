package ru.yandex.taxi.startup.launch;

import defpackage.g050;
import defpackage.mux;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t1b0;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.startup.launch.LaunchProcessingAnalytics$doIfEnabledWithLock$1", f = "LaunchProcessingAnalytics.kt", l = {101, HProv.PP_FAST_CODE, 103}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class LaunchProcessingAnalytics$doIfEnabledWithLock$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchProcessingAnalytics$doIfEnabledWithLock$1(k kVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$action = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LaunchProcessingAnalytics$doIfEnabledWithLock$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LaunchProcessingAnalytics$doIfEnabledWithLock$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        if (r8.a(r7) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0046, code lost:
    
        if (r8 == r0) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.sync.a aVar;
        tls tlsVar;
        Throwable th;
        g050 g050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mux muxVar = this.this$0.b;
            this.label = 1;
            obj = ((t1b0) muxVar.a.getValue()).b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var = (g050) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        g050Var.d(null);
                        return zy11.a;
                    } catch (Throwable th2) {
                        th = th2;
                        g050Var.d(null);
                        throw th;
                    }
                }
                tlsVar = (tls) this.L$1;
                ?? r3 = (g050) this.L$0;
                kotlin.b.b(obj);
                aVar = r3;
                try {
                    this.L$0 = aVar;
                    this.L$1 = null;
                    this.label = 3;
                    if (tlsVar.invoke(this) != coroutineSingletons) {
                        g050Var = aVar;
                        g050Var.d(null);
                        return zy11.a;
                    }
                    return coroutineSingletons;
                } catch (Throwable th3) {
                    kotlinx.coroutines.sync.a aVar2 = aVar;
                    th = th3;
                    g050Var = aVar2;
                    g050Var.d(null);
                    throw th;
                }
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            aVar = this.this$0.g;
            tlsVar = this.$action;
            this.L$0 = aVar;
            this.L$1 = tlsVar;
            this.label = 2;
        }
        return zy11.a;
    }
}
