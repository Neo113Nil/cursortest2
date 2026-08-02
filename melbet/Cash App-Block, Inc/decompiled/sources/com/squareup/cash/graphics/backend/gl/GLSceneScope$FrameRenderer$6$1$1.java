package com.squareup.cash.graphics.backend.gl;

import com.squareup.cash.graphics.backend.gl.core.ObjMesh;
import com.squareup.cash.graphics.backend.gl.core.WindowSurface;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class GLSceneScope$FrameRenderer$6$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GLSceneScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GLSceneScope$FrameRenderer$6$1$1(GLSceneScope gLSceneScope, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = gLSceneScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        GLSceneScope gLSceneScope = this.this$0;
        switch (i) {
            case 0:
                return new GLSceneScope$FrameRenderer$6$1$1(gLSceneScope, continuation, 0);
            default:
                return new GLSceneScope$FrameRenderer$6$1$1(gLSceneScope, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((GLSceneScope$FrameRenderer$6$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        GLSceneScope gLSceneScope = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                long currentTimeMillis = System.currentTimeMillis();
                WindowSurface windowSurface = (WindowSurface) gLSceneScope._windowSurface.getValue();
                if (windowSurface != null) {
                    windowSurface.swapBuffers();
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 > 20) {
                    gLSceneScope.onLowFps.invoke(new Long(currentTimeMillis2));
                }
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                InputStream open = gLSceneScope.context.getAssets().open("flat_cube.obj");
                open.getClass();
                return new ObjMesh(open);
        }
    }
}
