package com.squareup.cash.card.onboarding.core;

import android.opengl.GLES20;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardAssetManager$release$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int $textureId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardAssetManager$release$1(int i, Continuation continuation, int i2) {
        super(1, continuation);
        this.$r8$classId = i2;
        this.$textureId = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new CardAssetManager$release$1(this.$textureId, continuation, 0);
            default:
                return new CardAssetManager$release$1(this.$textureId, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((CardAssetManager$release$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.$textureId;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GLES20.glDeleteTextures(1, new int[]{i2}, 0);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GLES20.glDeleteTextures(1, new int[]{i2}, 0);
                break;
        }
        return Unit.INSTANCE;
    }
}
