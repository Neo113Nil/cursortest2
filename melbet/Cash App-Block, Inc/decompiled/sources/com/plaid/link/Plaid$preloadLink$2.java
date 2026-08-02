package com.plaid.link;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0213k6;
import com.plaid.internal.C0243o0;
import com.plaid.internal.InterfaceC0092a3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.plaid.link.Plaid$preloadLink$2", f = "Plaid.kt", l = {118, 119}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class Plaid$preloadLink$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OnLoadCallback $onLoad;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$preloadLink$2(OnLoadCallback onLoadCallback, Continuation<? super Plaid$preloadLink$2> continuation) {
        super(2, continuation);
        this.$onLoad = onLoadCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Plaid$preloadLink$2(this.$onLoad, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Plaid$preloadLink$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r1.a(r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r1.b(r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC0092a3 orCreateTokenComponent;
        C0213k6 c0213k6;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            orCreateTokenComponent = Plaid.INSTANCE.getOrCreateTokenComponent();
            c0213k6 = (C0213k6) ((C0243o0) orCreateTokenComponent).q.get();
            this.L$0 = c0213k6;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0213k6 = (C0213k6) this.L$0;
            SafeTrace.throwOnFailure(obj);
        }
        OnLoadCallback onLoadCallback = this.$onLoad;
        this.L$0 = null;
        this.label = 2;
    }
}
