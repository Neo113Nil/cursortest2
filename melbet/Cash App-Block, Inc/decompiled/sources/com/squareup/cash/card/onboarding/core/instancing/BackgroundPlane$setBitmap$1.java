package com.squareup.cash.card.onboarding.core.instancing;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.JWECryptoParts;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class BackgroundPlane$setBitmap$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ Bitmap $bitmap;
    public float F$0;
    public long J$0;
    public int label;
    public final /* synthetic */ JWECryptoParts this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundPlane$setBitmap$1(JWECryptoParts jWECryptoParts, Bitmap bitmap, Continuation continuation) {
        super(1, continuation);
        this.this$0 = jWECryptoParts;
        this.$bitmap = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new BackgroundPlane$setBitmap$1(this.this$0, this.$bitmap, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((BackgroundPlane$setBitmap$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x011c -> B:5:0x0016). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        long currentTimeMillis;
        float f;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        JWECryptoParts jWECryptoParts = this.this$0;
        if (i2 != 0) {
            if (i2 != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float coerceIn = this.F$0;
            currentTimeMillis = this.J$0;
            SafeTrace.throwOnFailure(obj);
            f = coerceIn;
            if (f < 1.0f) {
                coerceIn = RangesKt___RangesKt.coerceIn((System.currentTimeMillis() - currentTimeMillis) / 300.0f, RecyclerView.DECELERATION_RATE, 1.0f);
                BackgroundPlaneMaterial backgroundPlaneMaterial = (BackgroundPlaneMaterial) jWECryptoParts.iv;
                backgroundPlaneMaterial.getClass();
                float coerceIn2 = RangesKt___RangesKt.coerceIn(coerceIn, RecyclerView.DECELERATION_RATE, 1.0f);
                if (backgroundPlaneMaterial.transitionT != coerceIn2) {
                    backgroundPlaneMaterial.transitionT = coerceIn2;
                    backgroundPlaneMaterial._dirty.tryEmit(Unit.INSTANCE);
                }
                if (coerceIn < 1.0f) {
                    this.J$0 = currentTimeMillis;
                    this.F$0 = coerceIn;
                    this.label = 1;
                    if (JobKt.delay(16L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    f = coerceIn;
                    if (f < 1.0f) {
                    }
                }
            }
            BackgroundPlaneMaterial backgroundPlaneMaterial2 = (BackgroundPlaneMaterial) jWECryptoParts.iv;
            i = backgroundPlaneMaterial2.previousTextureId;
            if (i != 0) {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
                backgroundPlaneMaterial2.previousTextureId = 0;
                backgroundPlaneMaterial2._dirty.tryEmit(Unit.INSTANCE);
            }
            return Unit.INSTANCE;
        }
        SafeTrace.throwOnFailure(obj);
        BackgroundPlaneMaterial backgroundPlaneMaterial3 = (BackgroundPlaneMaterial) jWECryptoParts.iv;
        int i3 = backgroundPlaneMaterial3.previousTextureId;
        SharedFlowImpl sharedFlowImpl = backgroundPlaneMaterial3._dirty;
        if (i3 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i3}, 0);
            backgroundPlaneMaterial3.previousTextureId = 0;
        }
        backgroundPlaneMaterial3.previousTextureId = backgroundPlaneMaterial3.currentTextureId;
        backgroundPlaneMaterial3.previousAspect = backgroundPlaneMaterial3.currentAspect;
        Bitmap bitmap2 = this.$bitmap;
        if (bitmap2 == null) {
            backgroundPlaneMaterial3.currentTextureId = 0;
            backgroundPlaneMaterial3.currentAspect = 1.0f;
        } else {
            if (bitmap2.getConfig() != Bitmap.Config.HARDWARE || (bitmap = bitmap2.copy(Bitmap.Config.ARGB_8888, false)) == null) {
                bitmap = bitmap2;
            }
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i4 = iArr[0];
            GLES20.glActiveTexture(34000);
            GLES20.glBindTexture(3553, i4);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                Timber.Forest forest = Timber.Forest;
                forest.tag("BackgroundPlane");
                forest.w("texImage2D error=" + glGetError, new Object[0]);
            }
            if (bitmap != bitmap2) {
                bitmap.recycle();
            }
            backgroundPlaneMaterial3.currentTextureId = i4;
            backgroundPlaneMaterial3.currentAspect = bitmap2.getHeight() > 0 ? bitmap2.getWidth() / bitmap2.getHeight() : 1.0f;
        }
        float coerceIn3 = RangesKt___RangesKt.coerceIn(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
        if (backgroundPlaneMaterial3.transitionT != coerceIn3) {
            backgroundPlaneMaterial3.transitionT = coerceIn3;
            sharedFlowImpl.tryEmit(Unit.INSTANCE);
        }
        sharedFlowImpl.tryEmit(Unit.INSTANCE);
        currentTimeMillis = System.currentTimeMillis();
        f = 0.0f;
        if (f < 1.0f) {
        }
        BackgroundPlaneMaterial backgroundPlaneMaterial22 = (BackgroundPlaneMaterial) jWECryptoParts.iv;
        i = backgroundPlaneMaterial22.previousTextureId;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
