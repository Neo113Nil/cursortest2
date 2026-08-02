package app.cash.local.views.brand.orders;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Density;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class BrandPinsKt$brandPins$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Color $backgroundColor;
    public final /* synthetic */ Function1 $bitmapSetter;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Density $density;
    public final /* synthetic */ LocalImage $image;
    public final /* synthetic */ RealImageLoader $imageLoader;
    public final /* synthetic */ String $themedUrl;
    public float F$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandPinsKt$brandPins$1$1(LocalImage localImage, Density density, RealImageLoader realImageLoader, Context context, String str, Color color, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$image = localImage;
        this.$density = density;
        this.$imageLoader = realImageLoader;
        this.$context = context;
        this.$themedUrl = str;
        this.$backgroundColor = color;
        this.$bitmapSetter = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BrandPinsKt$brandPins$1$1(this.$image, this.$density, this.$imageLoader, this.$context, this.$themedUrl, this.$backgroundColor, this.$bitmapSetter, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BrandPinsKt$brandPins$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BrandPinsKt$brandPins$1$1 brandPinsKt$brandPins$1$1;
        float f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Density density = this.$density;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Float ratio = LocalViewsKt.getRatio(this.$image);
            float floatValue = (ratio != null ? ratio.floatValue() : 1.0f) * 28.0f;
            int mo236toPx0680j_4 = (int) density.mo236toPx0680j_4(28.0f);
            int mo236toPx0680j_42 = (int) density.mo236toPx0680j_4(floatValue);
            this.F$0 = floatValue;
            this.label = 1;
            brandPinsKt$brandPins$1$1 = this;
            Object loadBitmapFromUrl = LocalViewsKt.loadBitmapFromUrl(this.$imageLoader, this.$context, this.$themedUrl, mo236toPx0680j_42, mo236toPx0680j_4, brandPinsKt$brandPins$1$1);
            if (loadBitmapFromUrl == coroutineSingletons) {
                return coroutineSingletons;
            }
            f = floatValue;
            obj = loadBitmapFromUrl;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = this.F$0;
            SafeTrace.throwOnFailure(obj);
            brandPinsKt$brandPins$1$1 = this;
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            Bitmap createBitmap = Bitmap.createBitmap((int) density.mo236toPx0680j_4(44.0f), (int) density.mo236toPx0680j_4(57.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Color color = brandPinsKt$brandPins$1$1.$backgroundColor;
            Drawable drawableCompat = PlatformKt.getDrawableCompat(brandPinsKt$brandPins$1$1.$context, R.drawable.local_views_seller_pin, color != null ? new Integer(ColorKt.m694toArgb8_81llA(color.value)) : null);
            drawableCompat.getClass();
            drawableCompat.setBounds(0, 0, (int) density.mo236toPx0680j_4(44.0f), (int) density.mo236toPx0680j_4(57.0f));
            drawableCompat.draw(canvas);
            canvas.drawBitmap(bitmap, density.mo236toPx0680j_4((44.0f - f) / 2.0f), density.mo236toPx0680j_4(12.0f), (Paint) null);
            brandPinsKt$brandPins$1$1.$bitmapSetter.invoke(createBitmap);
        }
        return Unit.INSTANCE;
    }
}
