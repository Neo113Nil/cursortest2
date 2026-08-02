package com.squareup.cash.appmessages.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.extractor.mkv.Sniffer;
import com.airbnb.lottie.LottieComposition;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.lottie.CashLottieAnimationView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.util.android.Views;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AppMessageImageView extends CashLottieAnimationView {
    public int assetHeight;
    public int assetWidth;
    public AppMessageImage imageMetadata;
    public final Sniffer layoutHelper;
    public Function1 maxWidthResolver;

    public AppMessageImageView(Context context, Sniffer sniffer) {
        super(context);
        this.layoutHelper = sniffer;
        setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    /* renamed from: computedWidth-TENr5nQ, reason: not valid java name */
    public final int m2980computedWidthTENr5nQ(ContourLayout.LayoutSpec layoutSpec) {
        layoutSpec.getClass();
        AppMessageImage appMessageImage = this.imageMetadata;
        if (appMessageImage == null) {
            return 0;
        }
        Function1 function1 = this.maxWidthResolver;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("maxWidthResolver");
            throw null;
        }
        int i = ((XInt) function1.invoke(layoutSpec)).value;
        if ((appMessageImage instanceof AppMessageImage.Animated.Fill) || (appMessageImage instanceof AppMessageImage.Static.Fill)) {
            return i;
        }
        if ((appMessageImage instanceof AppMessageImage.Animated.Inset) || (appMessageImage instanceof AppMessageImage.Static.Inset)) {
            return i - (Views.dip((View) this, 24) * 2);
        }
        if (appMessageImage instanceof AppMessageImage.Animated.Fixed) {
            return Math.min(i, Views.dip((View) this, ((AppMessageImage.Animated.Fixed) appMessageImage).width));
        }
        if (appMessageImage instanceof AppMessageImage.Static.Fixed) {
            return Math.min(i, Views.dip((View) this, ((AppMessageImage.Static.Fixed) appMessageImage).width));
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void setComposition(LottieComposition lottieComposition) {
        lottieComposition.getClass();
        this.assetWidth = lottieComposition.getBounds().width();
        this.assetHeight = lottieComposition.getBounds().height();
        super.setComposition(lottieComposition);
    }

    @Override // com.airbnb.lottie.LottieAnimationView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.assetWidth = bitmap != null ? bitmap.getWidth() : 0;
        this.assetHeight = bitmap != null ? bitmap.getHeight() : 0;
        super.setImageBitmap(bitmap);
    }

    public final void setImageMetadata(AppMessageImage appMessageImage) {
        this.imageMetadata = appMessageImage;
    }

    public final void setMaxWidthResolver(Function1<? super ContourLayout.LayoutSpec, XInt> function1) {
        function1.getClass();
        this.maxWidthResolver = function1;
    }
}
