package ru.yandex.video.m3.player.utils.coroutine;

import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.utils.coroutine.CoroutineQueue$launch$1", f = "CoroutineQueue.kt", l = {HProv.ALG_SID_GR3410_12_256, 46}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class CoroutineQueue$launch$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CoroutineQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineQueue$launch$1(CoroutineQueue coroutineQueue, wls wlsVar, Continuation<? super CoroutineQueue$launch$1> continuation) {
        super(2, continuation);
        this.this$0 = coroutineQueue;
        this.$block = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        CoroutineQueue$launch$1 coroutineQueue$launch$1 = new CoroutineQueue$launch$1(this.this$0, this.$block, continuation);
        coroutineQueue$launch$1.L$0 = obj;
        return coroutineQueue$launch$1;
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((CoroutineQueue$launch$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        if (r8.a(r7) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar;
        g050 g050Var;
        wls wlsVar;
        Throwable th;
        g050 g050Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                tseVar = (tse) this.L$0;
                g050Var = this.this$0.mutex;
                wlsVar = this.$block;
                this.L$0 = tseVar;
                this.L$1 = g050Var;
                this.L$2 = wlsVar;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var2 = (g050) this.L$0;
                    try {
                        b.b(obj);
                        g050Var2.d(null);
                        return zy11.a;
                    } catch (Throwable th2) {
                        th = th2;
                        g050Var2.d(null);
                        throw th;
                    }
                }
                wlsVar = (wls) this.L$2;
                g050 g050Var3 = (g050) this.L$1;
                tseVar = (tse) this.L$0;
                b.b(obj);
                g050Var = g050Var3;
            }
            this.L$0 = g050Var;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (wlsVar.invoke(tseVar, this) != coroutineSingletons) {
                g050Var2 = g050Var;
                g050Var2.d(null);
                return zy11.a;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            g050 g050Var4 = g050Var;
            th = th3;
            g050Var2 = g050Var4;
            g050Var2.d(null);
            throw th;
        }
    }
}
