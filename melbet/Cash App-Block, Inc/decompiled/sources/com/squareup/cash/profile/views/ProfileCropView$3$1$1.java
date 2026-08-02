package com.squareup.cash.profile.views;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Looper;
import androidx.appcompat.widget.AppCompatButton;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cropview.CropView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class ProfileCropView$3$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ProfileCropView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileCropView$3$1$1(ProfileCropView profileCropView, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = profileCropView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ProfileCropView profileCropView = this.this$0;
        switch (i) {
            case 0:
                return new ProfileCropView$3$1$1(profileCropView, continuation, 0);
            default:
                return new ProfileCropView$3$1$1(profileCropView, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((ProfileCropView$3$1$1) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((ProfileCropView$3$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ProfileCropView profileCropView = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                KProperty[] kPropertyArr = ProfileCropView.$$delegatedProperties;
                ((AppCompatButton) profileCropView.cancelView$delegate.getValue(profileCropView, ProfileCropView.$$delegatedProperties[1])).setEnabled(false);
                profileCropView.getOkView().setEnabled(false);
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                KProperty[] kPropertyArr2 = ProfileCropView.$$delegatedProperties;
                CropView cropView = (CropView) profileCropView.cropView$delegate.getValue(profileCropView, ProfileCropView.$$delegatedProperties[0]);
                RectF rectF = cropView.rect;
                Bitmap bitmap = null;
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    a$$ExternalSyntheticBUOutline0.m$1("Cannot crop on the main thread");
                } else {
                    Bitmap bitmap2 = CropView.getBitmap(cropView.getDrawable());
                    if (bitmap2 != null) {
                        float bitmapScale = cropView.getBitmapScale(bitmap2);
                        Timber.Forest forest = Timber.Forest;
                        forest.i("Will crop at %s scale with %s.", Float.valueOf(bitmapScale), rectF);
                        float f = rectF.left;
                        int i2 = (int) (f * bitmapScale);
                        float f2 = rectF.top;
                        int i3 = (int) (f2 * bitmapScale);
                        int i4 = (int) ((rectF.right - f) * bitmapScale);
                        int i5 = (int) ((rectF.bottom - f2) * bitmapScale);
                        forest.i("Cropping %sx%s bitmap to %sx%s at (%s, %s).", Integer.valueOf(bitmap2.getWidth()), Integer.valueOf(bitmap2.getHeight()), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2), Integer.valueOf(i3));
                        bitmap = Bitmap.createBitmap(bitmap2, i2, i3, i4, i5);
                    }
                    if (bitmap == null) {
                        Timber.Forest.e(new AssertionError("Cropped bitmap is null"));
                    }
                }
                return bitmap;
        }
    }
}
