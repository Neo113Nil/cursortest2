package ru.yandex.taxi.startup.launch;

import defpackage.cne0;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.startup.launch.LaunchControllerImpl$Worker$scheduleRequest$1", f = "LaunchControllerImpl.kt", l = {90}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class LaunchControllerImpl$Worker$scheduleRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $force;
    final /* synthetic */ String $from;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchControllerImpl$Worker$scheduleRequest$1(b bVar, boolean z, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$force = z;
        this.$from = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LaunchControllerImpl$Worker$scheduleRequest$1(this.this$0, this.$force, this.$from, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LaunchControllerImpl$Worker$scheduleRequest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        g050 g050Var;
        boolean z;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            bVar = this.this$0;
            kotlinx.coroutines.sync.a aVar = bVar.d;
            boolean z2 = this.$force;
            String str2 = this.$from;
            this.L$0 = aVar;
            this.L$1 = bVar;
            this.L$2 = str2;
            this.Z$0 = z2;
            this.label = 1;
            if (aVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g050Var = aVar;
            z = z2;
            str = str2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.Z$0;
            str = (String) this.L$2;
            bVar = (b) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
        }
        if (!z) {
            try {
                if (!((cne0) bVar.b.b).f("launch_actual")) {
                    pzt0 pzt0Var = bVar.e;
                    if (pzt0Var != null && pzt0Var.isActive()) {
                    }
                }
                g050Var.d(null);
                return zy11.a;
            } catch (Throwable th) {
                g050Var.d(null);
                throw th;
            }
        }
        pzt0 pzt0Var2 = bVar.e;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        bVar.e = com.yandex.go.coroutines.b.g(bVar.c, null, null, new LaunchControllerImpl$Worker$launchRequest$1(bVar, str, null), 3);
        g050Var.d(null);
        return zy11.a;
    }
}
