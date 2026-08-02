package com.squareup.cash.graphics.backend.gl;

import android.opengl.GLES20;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class GLSceneScope$FrameRenderer$2$1$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ long $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLSceneScope$FrameRenderer$2$1$2$1(long j, Continuation continuation) {
        super(2, continuation);
        this.$it = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GLSceneScope$FrameRenderer$2$1$2$1(this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GLSceneScope$FrameRenderer$2$1$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        long j = this.$it;
        GLES20.glViewport(0, 0, (int) (j >> 32), (int) (j & BodyPartID.bodyIdMax));
        return Unit.INSTANCE;
    }
}
