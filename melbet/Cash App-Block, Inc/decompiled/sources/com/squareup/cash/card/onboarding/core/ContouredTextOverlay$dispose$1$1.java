package com.squareup.cash.card.onboarding.core;

import com.datadog.android.rum.internal.utils.WriteOperation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ContouredTextOverlay$dispose$1$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ CardAssetManager$AssetKey$ContouredText $key;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WriteOperation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContouredTextOverlay$dispose$1$1(WriteOperation writeOperation, CardAssetManager$AssetKey$ContouredText cardAssetManager$AssetKey$ContouredText, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = writeOperation;
        this.$key = cardAssetManager$AssetKey$ContouredText;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        CardAssetManager$AssetKey$ContouredText cardAssetManager$AssetKey$ContouredText = this.$key;
        WriteOperation writeOperation = this.this$0;
        switch (i) {
            case 0:
                return new ContouredTextOverlay$dispose$1$1(writeOperation, cardAssetManager$AssetKey$ContouredText, continuation, 0);
            case 1:
                return new ContouredTextOverlay$dispose$1$1(writeOperation, cardAssetManager$AssetKey$ContouredText, continuation, 1);
            case 2:
                return new ContouredTextOverlay$dispose$1$1(writeOperation, cardAssetManager$AssetKey$ContouredText, continuation, 2);
            default:
                return new ContouredTextOverlay$dispose$1$1(writeOperation, cardAssetManager$AssetKey$ContouredText, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((ContouredTextOverlay$dispose$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardAssetManager$AssetKey$ContouredText cardAssetManager$AssetKey$ContouredText = this.$key;
        WriteOperation writeOperation = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((CardAssetManager) writeOperation.writeScope).release(cardAssetManager$AssetKey$ContouredText);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((CardAssetManager) writeOperation.writeScope).release(cardAssetManager$AssetKey$ContouredText);
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((CardAssetManager) writeOperation.writeScope).release(cardAssetManager$AssetKey$ContouredText);
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ((CardAssetManager) writeOperation.writeScope).release(cardAssetManager$AssetKey$ContouredText);
                break;
        }
        return Unit.INSTANCE;
    }
}
