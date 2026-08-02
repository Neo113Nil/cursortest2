package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class Q5<T> implements FlowCollector {
    public final /* synthetic */ FlowCollector a;

    @DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$notifyWebViewShown$$inlined$filter$1$2", f = "PlaidWebview.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit")
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= PKIFailureInfo.systemUnavail;
            return Q5.this.emit(null, this);
        }
    }

    public Q5(FlowCollector flowCollector) {
        this.a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        a aVar;
        int i;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.b;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.b = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = aVar.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.b;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    if (((Boolean) obj).booleanValue()) {
                        aVar.b = 1;
                        if (flowCollector.emit(obj, aVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        aVar = new a(continuation);
        Object obj22 = aVar.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
