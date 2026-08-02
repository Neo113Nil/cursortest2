package com.squareup.cash.graphics.backend.gl;

import android.opengl.GLES20;
import androidx.compose.runtime.ProduceStateScope;
import com.squareup.cash.graphics.backend.gl.core.ObjMesh;
import com.squareup.cash.graphics.backend.gl.core.PBRMaterial;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class GLSceneScope$rememberMaterial$1$1$4$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ProduceStateScope $$this$produceState;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GLSceneScope$rememberMaterial$1$1$4$1(ProduceStateScope produceStateScope, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$$this$produceState = produceStateScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new GLSceneScope$rememberMaterial$1$1$4$1(this.$$this$produceState, continuation, 0);
            default:
                return new GLSceneScope$rememberMaterial$1$1$4$1(this.$$this$produceState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((GLSceneScope$rememberMaterial$1$1$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ProduceStateScope produceStateScope = this.$$this$produceState;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PBRMaterial pBRMaterial = (PBRMaterial) produceStateScope.getValue();
                if (pBRMaterial != null) {
                    GLES20.glDeleteProgram(pBRMaterial.program);
                    GLES20.glDeleteShader(pBRMaterial.vertexShader);
                    GLES20.glDeleteShader(pBRMaterial.fragmentShader);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ObjMesh objMesh = (ObjMesh) produceStateScope.getValue();
                if (objMesh != null) {
                    GLES20.glDeleteBuffers(2, objMesh.indexVertexBuffer, 0);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
