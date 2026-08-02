package ru.yandex.video.m3.player.impl;

import defpackage.g050;
import defpackage.ie60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", CA20Status.STATUS_CERTIFICATE_H, "Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.impl.YandexPlayerImpl$release$1", f = "YandexPlayerImpl.kt", l = {1484, 812}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class YandexPlayerImpl$release$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ YandexPlayerImpl<H> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YandexPlayerImpl$release$1(YandexPlayerImpl<H> yandexPlayerImpl, Continuation<? super YandexPlayerImpl$release$1> continuation) {
        super(2, continuation);
        this.this$0 = yandexPlayerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new YandexPlayerImpl$release$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((YandexPlayerImpl$release$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        if (r8.a(r7) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g050 mutex;
        YandexPlayerImpl yandexPlayerImpl;
        Throwable th;
        g050 g050Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                mutex = this.this$0.getMutex();
                yandexPlayerImpl = this.this$0;
                this.L$0 = mutex;
                this.L$1 = yandexPlayerImpl;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var = (g050) this.L$0;
                    try {
                        b.b(obj);
                        g050Var.d(null);
                        return zy11.a;
                    } catch (Throwable th2) {
                        th = th2;
                        g050Var.d(null);
                        throw th;
                    }
                }
                yandexPlayerImpl = (YandexPlayerImpl) this.L$1;
                g050 g050Var2 = (g050) this.L$0;
                b.b(obj);
                mutex = g050Var2;
            }
            yandexPlayerImpl.releaseFuture();
            ie60 ie60Var = ie60.a;
            YandexPlayerImpl$release$1$1$1 yandexPlayerImpl$release$1$1$1 = new YandexPlayerImpl$release$1$1$1(yandexPlayerImpl, null);
            this.L$0 = mutex;
            this.L$1 = null;
            this.label = 2;
            if (tje.k0(ie60Var, yandexPlayerImpl$release$1$1$1, this) != coroutineSingletons) {
                g050Var = mutex;
                g050Var.d(null);
                return zy11.a;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            g050 g050Var3 = mutex;
            th = th3;
            g050Var = g050Var3;
            g050Var.d(null);
            throw th;
        }
    }
}
