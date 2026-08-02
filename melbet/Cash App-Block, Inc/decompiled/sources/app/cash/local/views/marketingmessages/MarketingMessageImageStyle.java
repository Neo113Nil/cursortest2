package app.cash.local.views.marketingmessages;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.layout.ContentScale;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public enum MarketingMessageImageStyle {
    LARGE(24.0f, 24.0f, 32.0f, 32.0f, 12.0f, 12.0f, 12.0f, 12.0f, 0.8f, Alignment.Companion.Start, Alignment.Companion.TopStart, 3, ContentScale.Companion.Fit),
    COMPACT(12.0f, 48.0f, 48.0f, 24.0f, 20.0f, RecyclerView.DECELERATION_RATE, 8.0f, 4.0f, 1.0f, Alignment.Companion.CenterHorizontally, Alignment.Companion.Center, 1, ContentScale.Companion.Crop);

    public final float badgePadding;
    public final float contentBottomPadding;
    public final float contentHorizontalPadding;
    public final float contentTopPadding;
    public final ContentScale imageContentScale;
    public final float imagePadding;
    public final float imageToBadgeTopPadding;
    public final BiasAlignment.Horizontal textAlignment;
    public final BiasAlignment textBoxAlignment;
    public final float textFillWidthFraction;
    public final int textMaxLines;
    public final float textOverlayHorizontalPadding;
    public final float textOverlayVerticalPadding;

    MarketingMessageImageStyle(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, BiasAlignment.Horizontal horizontal, BiasAlignment biasAlignment, int i, ContentScale contentScale) {
        this.badgePadding = f;
        this.contentTopPadding = f2;
        this.contentBottomPadding = f3;
        this.contentHorizontalPadding = f4;
        this.imageToBadgeTopPadding = f5;
        this.imagePadding = f6;
        this.textOverlayHorizontalPadding = f7;
        this.textOverlayVerticalPadding = f8;
        this.textFillWidthFraction = f9;
        this.textAlignment = horizontal;
        this.textBoxAlignment = biasAlignment;
        this.textMaxLines = i;
        this.imageContentScale = contentScale;
    }
}
