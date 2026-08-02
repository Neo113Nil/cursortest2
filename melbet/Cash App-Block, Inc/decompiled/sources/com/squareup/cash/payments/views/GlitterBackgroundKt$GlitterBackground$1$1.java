package com.squareup.cash.payments.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.compose.runtime.MutableState;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.size.Size;
import coil3.size.SizeKt;
import coil3.size.SizeResolver;
import coil3.transform.Transformation;
import com.nimbusds.jose.jca.JCAContext;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class GlitterBackgroundKt$GlitterBackground$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ RealImageLoader $imageLoader;
    public final /* synthetic */ MutableState $loadedBitmap$delegate;
    public final /* synthetic */ float $screenAspectRatio;
    public final /* synthetic */ String $url;

    /* renamed from: com.squareup.cash.payments.views.GlitterBackgroundKt$GlitterBackground$1$1$2, reason: invalid class name */
    /* loaded from: classes8.dex */
    public final class AnonymousClass2 extends Transformation {
        @Override // coil3.transform.Transformation
        public final String getCacheKey() {
            return "glitter_background";
        }

        @Override // coil3.transform.Transformation
        public final Bitmap transform(Bitmap bitmap, Size size) {
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            int width = ((int) (bitmap.getWidth() * (2048.0f / bitmap.getHeight()))) / 2;
            Rect rect2 = new Rect(1024 - width, 0, width + 1024, 2048);
            Bitmap createBitmap = Bitmap.createBitmap(2048, 2048, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(bitmap, rect, rect2, (Paint) null);
            return createBitmap;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlitterBackgroundKt$GlitterBackground$1$1(RealImageLoader realImageLoader, Context context, String str, float f, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$imageLoader = realImageLoader;
        this.$context = context;
        this.$url = str;
        this.$screenAspectRatio = f;
        this.$loadedBitmap$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GlitterBackgroundKt$GlitterBackground$1$1(this.$imageLoader, this.$context, this.$url, this.$screenAspectRatio, this.$loadedBitmap$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GlitterBackgroundKt$GlitterBackground$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        ImageRequest.Builder builder = new ImageRequest.Builder(this.$context);
        builder.data = this.$url;
        final float f = this.$screenAspectRatio;
        builder.sizeResolver = new SizeResolver() { // from class: com.squareup.cash.payments.views.GlitterBackgroundKt$GlitterBackground$1$1.1
            @Override // coil3.size.SizeResolver
            public final Object size(Continuation continuation) {
                return SizeKt.Size(MathKt__MathJVMKt.roundToInt(2048.0f * f), 2048);
            }
        };
        ImageRequestsKt.transformations(builder, CollectionsKt__CollectionsJVMKt.listOf(new AnonymousClass2()));
        builder.target = new JCAContext(this.$loadedBitmap$delegate, 23);
        this.$imageLoader.enqueue(builder.build());
        return Unit.INSTANCE;
    }
}
