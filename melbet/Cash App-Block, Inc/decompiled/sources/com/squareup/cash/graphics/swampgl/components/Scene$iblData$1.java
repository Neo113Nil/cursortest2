package com.squareup.cash.graphics.swampgl.components;

import android.opengl.GLES20;
import com.squareup.cash.graphics.swampgl.components.ibl.IblComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class Scene$iblData$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ IblComponent $old;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Scene$iblData$1(IblComponent iblComponent, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.$old = iblComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        IblComponent iblComponent = this.$old;
        switch (i) {
            case 0:
                return new Scene$iblData$1(iblComponent, continuation, 0);
            case 1:
                return new Scene$iblData$1(iblComponent, continuation, 1);
            default:
                return new Scene$iblData$1(iblComponent, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((Scene$iblData$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        IblComponent iblComponent = this.$old;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                iblComponent.release();
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                iblComponent.release();
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                int[] iArr = iblComponent.iblTextureIds;
                int length = iArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = iArr[i2];
                    if (i3 != 0) {
                        iblComponent.glTexOps.getClass();
                        if (i3 != 0) {
                            GLES20.glDeleteTextures(1, new int[]{i3}, 0);
                        }
                        iArr[i2] = 0;
                    }
                }
                iblComponent.iblTexturesInitialized = false;
                iblComponent.lastIblAssetHash = null;
                iblComponent.disposeCurrentAsset();
                break;
        }
        return Unit.INSTANCE;
    }
}
