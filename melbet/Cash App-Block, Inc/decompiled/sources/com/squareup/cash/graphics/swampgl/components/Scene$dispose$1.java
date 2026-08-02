package com.squareup.cash.graphics.swampgl.components;

import android.opengl.GLES20;
import androidx.media3.exoplayer.RendererHolder;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class Scene$dispose$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $instancedProgramRef;
    public final /* synthetic */ int $nonInstancedProgramRef;
    public final /* synthetic */ RendererHolder $shadowMapRef;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scene$dispose$1(RendererHolder rendererHolder, int i, int i2, Continuation continuation) {
        super(1, continuation);
        this.$shadowMapRef = rendererHolder;
        this.$nonInstancedProgramRef = i;
        this.$instancedProgramRef = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Scene$dispose$1(this.$shadowMapRef, this.$nonInstancedProgramRef, this.$instancedProgramRef, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Scene$dispose$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        RendererHolder rendererHolder = this.$shadowMapRef;
        if (rendererHolder != null) {
            rendererHolder.dispose();
        }
        int i = this.$nonInstancedProgramRef;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
        }
        int i2 = this.$instancedProgramRef;
        if (i2 != 0) {
            GLES20.glDeleteProgram(i2);
        }
        return Unit.INSTANCE;
    }
}
