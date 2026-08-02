package ru.yandex.taxi.analytics.referrer;

import android.content.Intent;
import com.yandex.go.intentprocessor.k;
import com.yandex.go.preload.e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.am.t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.analytics.referrer.AdjustDeferredDeeplinkFallbackFCPListener$onFirstContentfulPaint$1", f = "AdjustDeferredDeeplinkFallbackFCPListener.kt", l = {39, 40, 42}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class AdjustDeferredDeeplinkFallbackFCPListener$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdjustDeferredDeeplinkFallbackFCPListener$onFirstContentfulPaint$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdjustDeferredDeeplinkFallbackFCPListener$onFirstContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AdjustDeferredDeeplinkFallbackFCPListener$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r7 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r7.a(r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        if (r2 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0.c;
            this.label = 1;
            eVar.c(this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Intent intent = (Intent) obj;
                if (intent == null) {
                    return zy11Var;
                }
                intent.putExtra("KEY_OPEN_REASON", "adjust_deferred_fallback");
                k.c(this.this$0.d, intent);
                return zy11Var;
            }
            kotlin.b.b(obj);
            b bVar = this.this$0.b;
            this.label = 3;
            obj = bVar.a(this);
        }
        t tVar = this.this$0.e;
        this.label = 2;
    }
}
