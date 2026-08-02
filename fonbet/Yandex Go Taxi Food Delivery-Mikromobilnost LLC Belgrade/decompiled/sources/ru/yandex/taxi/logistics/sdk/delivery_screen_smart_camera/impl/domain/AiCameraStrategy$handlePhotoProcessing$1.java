package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import defpackage.b64;
import defpackage.jse;
import defpackage.kn1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wbf;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.AiCameraStrategy$handlePhotoProcessing$1", f = "AiCameraStrategy.kt", l = {160}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AiCameraStrategy$handlePhotoProcessing$1 extends SuspendLambda implements wls {
    final /* synthetic */ wbf $cropInfo;
    final /* synthetic */ Bitmap $fullBitmap;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
    @mvg(c = "ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.AiCameraStrategy$handlePhotoProcessing$1$1", f = "AiCameraStrategy.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain.AiCameraStrategy$handlePhotoProcessing$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Bitmap $croppedBitmap;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Bitmap bitmap, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$croppedBitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$croppedBitmap, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            h hVar = this.this$0.d;
            if (hVar != null) {
                hVar.a(this.$croppedBitmap);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiCameraStrategy$handlePhotoProcessing$1(a aVar, Bitmap bitmap, wbf wbfVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$fullBitmap = bitmap;
        this.$cropInfo = wbfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiCameraStrategy$handlePhotoProcessing$1(this.this$0, this.$fullBitmap, this.$cropInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiCameraStrategy$handlePhotoProcessing$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kn1 kn1Var = this.this$0.b;
            Bitmap bitmap = this.$fullBitmap;
            wbf wbfVar = this.$cropInfo;
            kn1Var.getClass();
            RectF rectF = wbfVar.c;
            Matrix matrix = new Matrix();
            float f = wbfVar.a;
            float f2 = wbfVar.b;
            matrix.postTranslate(-wbfVar.e, -wbfVar.f);
            float f3 = 1.0f / wbfVar.d;
            matrix.postScale(f3, f3, f / 2.0f, f2 / 2.0f);
            matrix.mapRect(rectF);
            float min = wbfVar.g ? Math.min(f / bitmap.getWidth(), f2 / bitmap.getHeight()) : Math.max(f / bitmap.getWidth(), f2 / bitmap.getHeight());
            rectF.offset(-b64.a(bitmap.getWidth(), min, f, 2.0f), -b64.a(bitmap.getHeight(), min, f2, 2.0f));
            float f4 = rectF.left / min;
            rectF.left = f4;
            rectF.right /= min;
            rectF.top /= min;
            rectF.bottom /= min;
            int max = (int) Math.max(0.0f, f4);
            int max2 = (int) Math.max(0.0f, rectF.top);
            int min2 = (int) (Math.min(bitmap.getWidth(), rectF.right) - max);
            int min3 = (int) (Math.min(bitmap.getHeight(), rectF.bottom) - max2);
            if (min2 > 0 && min3 > 0) {
                bitmap = Bitmap.createBitmap(bitmap, max, max2, min2, min3);
            }
            a aVar = this.this$0;
            jse jseVar = aVar.c.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar, bitmap, null);
            this.L$0 = null;
            this.label = 1;
            if (tje.k0(jseVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
