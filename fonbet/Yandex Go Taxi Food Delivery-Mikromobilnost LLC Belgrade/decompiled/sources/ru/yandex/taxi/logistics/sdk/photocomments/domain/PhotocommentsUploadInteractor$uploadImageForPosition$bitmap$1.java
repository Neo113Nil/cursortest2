package ru.yandex.taxi.logistics.sdk.photocomments.domain;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vr;
import defpackage.wls;
import defpackage.zy11;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Ltse;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.photocomments.domain.PhotocommentsUploadInteractor$uploadImageForPosition$bitmap$1", f = "PhotocommentsUploadInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PhotocommentsUploadInteractor$uploadImageForPosition$bitmap$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $maxHeight;
    final /* synthetic */ int $maxWidth;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotocommentsUploadInteractor$uploadImageForPosition$bitmap$1(b bVar, Uri uri, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$uri = uri;
        this.$maxHeight = i;
        this.$maxWidth = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PhotocommentsUploadInteractor$uploadImageForPosition$bitmap$1(this.this$0, this.$uri, this.$maxHeight, this.$maxWidth, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PhotocommentsUploadInteractor$uploadImageForPosition$bitmap$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int max;
        int n;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        vr vrVar = this.this$0.b;
        Uri uri = this.$uri;
        int i3 = this.$maxHeight;
        int i4 = this.$maxWidth;
        vrVar.getClass();
        BitmapFactory.Options options = new BitmapFactory.Options();
        Context context = vrVar.a;
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            try {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(openInputStream, null, options2);
                int i5 = options2.outWidth;
                if (i4 != 0) {
                    i = 1;
                    while (true) {
                        int i6 = i * 2;
                        if (i5 / i6 < i4) {
                            break;
                        }
                        i = i6;
                    }
                } else {
                    i = 1;
                }
                int i7 = options2.outHeight;
                if (i3 != 0) {
                    i2 = 1;
                    while (true) {
                        int i8 = i2 * 2;
                        if (i7 / i8 < i3) {
                            break;
                        }
                        i2 = i8;
                    }
                } else {
                    i2 = 1;
                }
                max = Math.max(i, i2);
                openInputStream.close();
            } finally {
            }
        } else {
            max = 1;
        }
        options.inSampleSize = max;
        openInputStream = context.getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            try {
                n = new androidx.exifinterface.media.a(openInputStream).n();
                openInputStream.close();
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } else {
            n = 0;
        }
        float f = n;
        openInputStream = context.getContentResolver().openInputStream(uri);
        if (openInputStream == null) {
            return null;
        }
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
            if (decodeStream == null) {
                openInputStream.close();
                return null;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(f);
            Bitmap createBitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, true);
            Bitmap.Config config = createBitmap.getConfig();
            if (config == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Bitmap copy = createBitmap.copy(config, true);
            decodeStream.recycle();
            openInputStream.close();
            return copy;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
