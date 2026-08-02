package ru.yandex.yandexmaps.multiplatform.pin.war;

import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.yandexmaps.multiplatform.pin.war.PinWar$launchWithLock$1", f = "PinWar.kt", l = {319, 233}, m = "invokeSuspend", v = 1)
/* loaded from: classes7.dex */
final class PinWar$launchWithLock$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $block;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinWar$launchWithLock$1(b bVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$block = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PinWar$launchWithLock$1(this.this$0, this.$block, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PinWar$launchWithLock$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.sync.a aVar;
        tls tlsVar;
        int i;
        Throwable th;
        g050 g050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                kotlin.b.b(obj);
                aVar = this.this$0.c;
                tls tlsVar2 = this.$block;
                this.L$0 = aVar;
                this.L$1 = tlsVar2;
                this.I$0 = 0;
                this.label = 1;
                if (aVar.a(this) != coroutineSingletons) {
                    tlsVar = tlsVar2;
                    i = 0;
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 != 2) {
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
            i = this.I$0;
            tlsVar = (tls) this.L$1;
            ?? r6 = (g050) this.L$0;
            kotlin.b.b(obj);
            aVar = r6;
            this.L$0 = aVar;
            this.L$1 = null;
            this.I$0 = i;
            this.I$1 = 0;
            this.label = 2;
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
}
