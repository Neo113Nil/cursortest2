package ru.yandex.taxi.controller;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.utils.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.controller.WebViewCacheLoader$preload$3", f = "WebViewCacheLoader.kt", l = {66, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class WebViewCacheLoader$preload$3 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $invalidateCache;
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewCacheLoader$preload$3(boolean z, b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$invalidateCache = z;
        this.this$0 = bVar;
        this.$token = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewCacheLoader$preload$3(this.$invalidateCache, this.this$0, this.$token, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewCacheLoader$preload$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r7 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return (String) obj;
                }
                if (i == 2) {
                    kotlin.b.b(obj);
                    return (String) obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            boolean z = this.$invalidateCache;
            b bVar = this.this$0;
            String str = this.$token;
            if (z) {
                this.label = 1;
                bVar.getClass();
                obj = g.a(3, 2000L, new WebViewCacheLoader$newNoCacheRequest$2(bVar, str, null), this);
                if (obj == coroutineSingletons) {
                }
                return (String) obj;
            }
            this.label = 2;
            obj = b.b(bVar, str, this);
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.p("Failed to preload page", th);
            throw th;
        }
    }
}
