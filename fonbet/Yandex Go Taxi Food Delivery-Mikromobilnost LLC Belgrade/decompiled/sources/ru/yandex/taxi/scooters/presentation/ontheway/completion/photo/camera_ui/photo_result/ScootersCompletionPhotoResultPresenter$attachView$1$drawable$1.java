package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.util.Size;
import defpackage.kpm0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.y8b1;
import defpackage.zy11;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/BitmapDrawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/BitmapDrawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.photo_result.ScootersCompletionPhotoResultPresenter$attachView$1$drawable$1", f = "ScootersCompletionPhotoResultPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class ScootersCompletionPhotoResultPresenter$attachView$1$drawable$1 extends SuspendLambda implements wls {
    final /* synthetic */ Size $desiredSize;
    final /* synthetic */ kpm0 $photo;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionPhotoResultPresenter$attachView$1$drawable$1(c cVar, kpm0 kpm0Var, Size size, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$photo = kpm0Var;
        this.$desiredSize = size;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCompletionPhotoResultPresenter$attachView$1$drawable$1(this.this$0, this.$photo, this.$desiredSize, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCompletionPhotoResultPresenter$attachView$1$drawable$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Context context = this.this$0.x;
        Uri uri = this.$photo.a;
        final Size size = this.$desiredSize;
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(uri.getPath(), options);
        try {
            c = ImageDecoder.decodeBitmap(ImageDecoder.createSource(context.getContentResolver(), uri), new ImageDecoder.OnHeaderDecodedListener() { // from class: k16
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    imageDecoder.setTargetSampleSize(y8b1.b(options, size));
                    imageDecoder.setAllocator(1);
                }
            });
        } catch (IOException unused) {
            c = y8b1.c(context, uri, size);
        }
        return new BitmapDrawable(this.this$0.x.getResources(), c);
    }
}
