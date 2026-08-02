package com.squareup.cash.appmessages.views;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import androidx.work.impl.model.WorkSpecDao_Impl$$ExternalSyntheticLambda12;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.appmessages.TooltipAppMessageViewModel;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class TooltipContainerView extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Point anchorPoint;
    public final long animationDuration;
    public Animation.AnimationListener animationOutListener;
    public final TooltipAppMessageArrowImageView arrowImageView;
    public TooltipAppMessageViewModel.Ready.ArrowPosition arrowPosition;
    public final LinearLayout contentBubble;
    public final int contentBubblePadding;
    public final TooltipAppMessageTextView contentText;
    public final ColorPalette darkModeColorPalette;
    public int hugOffset;
    public final ColorPalette lightModeColorPalette;

    public static final class TooltipAppMessageTextView extends AppCompatTextView {
        public final ColorPalette darkModeColorPalette;
        public final ColorPalette lightModeColorPalette;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TooltipAppMessageTextView(Context context) {
            super(context);
            context.getClass();
            this.lightModeColorPalette = Trace.moonCakeLight(context).colorPalette;
            this.darkModeColorPalette = Trace.moonCakeDark(context).colorPalette;
            setSingleLine(false);
            Strings.applyStyle(this, TextStyles.strongCaption);
            setTheme(ThemeHelpersKt.themeInfo(this).theme);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int lineCount = getLayout().getLineCount();
            if (lineCount > 1) {
                float f = RecyclerView.DECELERATION_RATE;
                for (int i3 = 0; i3 < lineCount; i3++) {
                    f = Math.max(f, getLayout().getLineMax(i3));
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min((int) Math.ceil(f), getMeasuredWidth()), PKIFailureInfo.systemUnavail), i2);
            }
        }

        public final void setTheme(Theme theme) {
            theme.getClass();
            setTextColor((theme == Theme.MooncakeLight ? this.darkModeColorPalette : this.lightModeColorPalette).label);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipContainerView(Context context) {
        super(context);
        context.getClass();
        this.lightModeColorPalette = Trace.moonCakeLight(context).colorPalette;
        this.darkModeColorPalette = Trace.moonCakeDark(context).colorPalette;
        this.anchorPoint = new Point();
        this.arrowPosition = TooltipAppMessageViewModel.Ready.ArrowPosition.BottomLeft;
        TooltipAppMessageTextView tooltipAppMessageTextView = new TooltipAppMessageTextView(context);
        this.contentText = tooltipAppMessageTextView;
        int dip = Views.dip((View) this, 16);
        this.contentBubblePadding = dip;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(dip, Views.dip((View) linearLayout, 12), dip, dip);
        linearLayout.setElevation(20.0f);
        linearLayout.setBackground(createBubbleBackgroundDrawable(ThemeHelpersKt.themeInfo(linearLayout).theme));
        linearLayout.addView(tooltipAppMessageTextView);
        this.contentBubble = linearLayout;
        TooltipAppMessageArrowImageView tooltipAppMessageArrowImageView = new TooltipAppMessageArrowImageView(context, null);
        tooltipAppMessageArrowImageView.setElevation(20.0f);
        this.arrowImageView = tooltipAppMessageArrowImageView;
        this.animationDuration = 140L;
        setArrowPosition(this.arrowPosition);
    }

    public final void animateOut() {
        Point point = this.anchorPoint;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.6f, 1.0f, 0.6f, 0, point.x, 0, point.y);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(new AlphaAnimation(1.0f, RecyclerView.DECELERATION_RATE));
        animationSet.setDuration(this.animationDuration);
        Animation.AnimationListener animationListener = this.animationOutListener;
        if (animationListener == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animationOutListener");
            throw null;
        }
        animationSet.setAnimationListener(animationListener);
        startAnimation(animationSet);
    }

    public final ShapeDrawable createBubbleBackgroundDrawable(Theme theme) {
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = Views.dip((View) this, 10.0f);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(theme == Theme.MooncakeLight ? this.darkModeColorPalette.background : this.lightModeColorPalette.background);
        shapeDrawable.getPaint().setAntiAlias(true);
        return shapeDrawable;
    }

    public final void setAnchorPoint(int i, int i2) {
        Point point = this.anchorPoint;
        if (point.x == i && point.y == i2) {
            return;
        }
        point.x = i;
        point.y = i2;
        requestLayout();
    }

    public final void setAnimationOutListener(Animation.AnimationListener animationListener) {
        animationListener.getClass();
        this.animationOutListener = animationListener;
    }

    public final void setArrowPosition(TooltipAppMessageViewModel.Ready.ArrowPosition arrowPosition) {
        arrowPosition.getClass();
        this.arrowPosition = arrowPosition;
        int m3813getXdipTENr5nQ = m3813getXdipTENr5nQ((int) (((getContext().getResources().getDisplayMetrics().widthPixels / getContext().getResources().getDisplayMetrics().density) * 2.0f) / 3.0f));
        int ordinal = arrowPosition.ordinal();
        final int i = 5;
        final int i2 = 4;
        final int i3 = 3;
        float f = (ordinal == 3 || ordinal == 4 || ordinal == 5) ? 180.0f : RecyclerView.DECELERATION_RATE;
        TooltipAppMessageArrowImageView tooltipAppMessageArrowImageView = this.arrowImageView;
        tooltipAppMessageArrowImageView.setRotation(f);
        int ordinal2 = arrowPosition.ordinal();
        final int i4 = 1;
        final int i5 = 2;
        LinearLayout linearLayout = this.contentBubble;
        if (ordinal2 != 0) {
            final int i6 = 6;
            if (ordinal2 == 1) {
                ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.TooltipContainerView$$ExternalSyntheticLambda0
                    public final /* synthetic */ TooltipContainerView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i7 = i;
                        TooltipContainerView tooltipContainerView = this.f$0;
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        switch (i7) {
                            case 0:
                                int i8 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 1:
                                int i9 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3813getXdipTENr5nQ(18));
                            case 2:
                                int i10 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(tooltipContainerView.hugOffset) + tooltipContainerView.anchorPoint.y);
                            case 3:
                                int i11 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(10));
                            case 4:
                                int i12 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 5:
                                int i13 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 6:
                                int i14 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 7:
                                int i15 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 8:
                                int i16 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 9:
                                int i17 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 10:
                                int i18 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 11:
                                int i19 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 12:
                                int i20 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 13:
                                int i21 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 14:
                                int i22 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            default:
                                int i23 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.anchorPoint.x);
                        }
                    }
                });
                leftTo.widthOf(2, new WorkSpecDao_Impl$$ExternalSyntheticLambda12(m3813getXdipTENr5nQ, i5));
                ContourLayout.layoutBy$default(this, linearLayout, leftTo, ContourLayout.bottomTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.TooltipContainerView$$ExternalSyntheticLambda0
                    public final /* synthetic */ TooltipContainerView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i7 = i6;
                        TooltipContainerView tooltipContainerView = this.f$0;
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        switch (i7) {
                            case 0:
                                int i8 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 1:
                                int i9 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3813getXdipTENr5nQ(18));
                            case 2:
                                int i10 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(tooltipContainerView.hugOffset) + tooltipContainerView.anchorPoint.y);
                            case 3:
                                int i11 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(10));
                            case 4:
                                int i12 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 5:
                                int i13 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 6:
                                int i14 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 7:
                                int i15 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 8:
                                int i16 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 9:
                                int i17 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 10:
                                int i18 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 11:
                                int i19 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 12:
                                int i20 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 13:
                                int i21 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 14:
                                int i22 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            default:
                                int i23 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.anchorPoint.x);
                        }
                    }
                }));
            } else if (ordinal2 == 2) {
                final int i7 = 7;
                ByteArrayProtoReader32 rightTo = ContourLayout.rightTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.TooltipContainerView$$ExternalSyntheticLambda0
                    public final /* synthetic */ TooltipContainerView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i72 = i7;
                        TooltipContainerView tooltipContainerView = this.f$0;
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        switch (i72) {
                            case 0:
                                int i8 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 1:
                                int i9 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3813getXdipTENr5nQ(18));
                            case 2:
                                int i10 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(tooltipContainerView.hugOffset) + tooltipContainerView.anchorPoint.y);
                            case 3:
                                int i11 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(10));
                            case 4:
                                int i12 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 5:
                                int i13 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 6:
                                int i14 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 7:
                                int i15 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 8:
                                int i16 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 9:
                                int i17 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 10:
                                int i18 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 11:
                                int i19 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 12:
                                int i20 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 13:
                                int i21 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 14:
                                int i22 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            default:
                                int i23 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.anchorPoint.x);
                        }
                    }
                });
                rightTo.widthOf(2, new WorkSpecDao_Impl$$ExternalSyntheticLambda12(m3813getXdipTENr5nQ, i3));
                final int i8 = 8;
                ContourLayout.layoutBy$default(this, linearLayout, rightTo, ContourLayout.bottomTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.TooltipContainerView$$ExternalSyntheticLambda0
                    public final /* synthetic */ TooltipContainerView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i72 = i8;
                        TooltipContainerView tooltipContainerView = this.f$0;
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        switch (i72) {
                            case 0:
                                int i82 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 1:
                                int i9 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3813getXdipTENr5nQ(18));
                            case 2:
                                int i10 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(tooltipContainerView.hugOffset) + tooltipContainerView.anchorPoint.y);
                            case 3:
                                int i11 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(10));
                            case 4:
                                int i12 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 5:
                                int i13 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 6:
                                int i14 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 7:
                                int i15 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 8:
                                int i16 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 9:
                                int i17 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 10:
                                int i18 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 11:
                                int i19 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 12:
                                int i20 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 13:
                                int i21 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 14:
                                int i22 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            default:
                                int i23 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.anchorPoint.x);
                        }
                    }
                }));
            } else if (ordinal2 == 3) {
                final int i9 = 9;
                ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.TooltipContainerView$$ExternalSyntheticLambda0
                    public final /* synthetic */ TooltipContainerView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i72 = i9;
                        TooltipContainerView tooltipContainerView = this.f$0;
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        switch (i72) {
                            case 0:
                                int i82 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 1:
                                int i92 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3813getXdipTENr5nQ(18));
                            case 2:
                                int i10 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(tooltipContainerView.hugOffset) + tooltipContainerView.anchorPoint.y);
                            case 3:
                                int i11 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(10));
                            case 4:
                                int i12 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 5:
                                int i13 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 6:
                                int i14 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 7:
                                int i15 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 8:
                                int i16 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 9:
                                int i17 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 10:
                                int i18 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 11:
                                int i19 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 12:
                                int i20 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 13:
                                int i21 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 14:
                                int i22 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            default:
                                int i23 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.anchorPoint.x);
                        }
                    }
                });
                leftTo2.widthOf(2, new WorkSpecDao_Impl$$ExternalSyntheticLambda12(m3813getXdipTENr5nQ, i2));
                final int i10 = 10;
                ContourLayout.layoutBy$default(this, linearLayout, leftTo2, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.TooltipContainerView$$ExternalSyntheticLambda0
                    public final /* synthetic */ TooltipContainerView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i72 = i10;
                        TooltipContainerView tooltipContainerView = this.f$0;
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        switch (i72) {
                            case 0:
                                int i82 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 1:
                                int i92 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3813getXdipTENr5nQ(18));
                            case 2:
                                int i102 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(tooltipContainerView.hugOffset) + tooltipContainerView.anchorPoint.y);
                            case 3:
                                int i11 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(10));
                            case 4:
                                int i12 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 5:
                                int i13 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 6:
                                int i14 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 7:
                                int i15 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 8:
                                int i16 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 9:
                                int i17 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 10:
                                int i18 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 11:
                                int i19 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 12:
                                int i20 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 13:
                                int i21 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 14:
                                int i22 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            default:
                                int i23 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.anchorPoint.x);
                        }
                    }
                }));
            } else if (ordinal2 == 4) {
                final int i11 = 11;
                ByteArrayProtoReader32 leftTo3 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.TooltipContainerView$$ExternalSyntheticLambda0
                    public final /* synthetic */ TooltipContainerView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i72 = i11;
                        TooltipContainerView tooltipContainerView = this.f$0;
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        switch (i72) {
                            case 0:
                                int i82 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 1:
                                int i92 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3813getXdipTENr5nQ(18));
                            case 2:
                                int i102 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(tooltipContainerView.hugOffset) + tooltipContainerView.anchorPoint.y);
                            case 3:
                                int i112 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(10));
                            case 4:
                                int i12 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 5:
                                int i13 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 6:
                                int i14 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 7:
                                int i15 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 8:
                                int i16 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 9:
                                int i17 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 10:
                                int i18 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 11:
                                int i19 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 12:
                                int i20 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 13:
                                int i21 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 14:
                                int i22 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            default:
                                int i23 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.anchorPoint.x);
                        }
                    }
                });
                leftTo3.widthOf(2, new WorkSpecDao_Impl$$ExternalSyntheticLambda12(m3813getXdipTENr5nQ, i));
                final int i12 = 12;
                ContourLayout.layoutBy$default(this, linearLayout, leftTo3, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.TooltipContainerView$$ExternalSyntheticLambda0
                    public final /* synthetic */ TooltipContainerView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i72 = i12;
                        TooltipContainerView tooltipContainerView = this.f$0;
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        switch (i72) {
                            case 0:
                                int i82 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 1:
                                int i92 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3813getXdipTENr5nQ(18));
                            case 2:
                                int i102 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(tooltipContainerView.hugOffset) + tooltipContainerView.anchorPoint.y);
                            case 3:
                                int i112 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(10));
                            case 4:
                                int i122 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 5:
                                int i13 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 6:
                                int i14 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 7:
                                int i15 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 8:
                                int i16 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 9:
                                int i17 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 10:
                                int i18 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 11:
                                int i19 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 12:
                                int i20 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 13:
                                int i21 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 14:
                                int i22 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            default:
                                int i23 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.anchorPoint.x);
                        }
                    }
                }));
            } else {
                if (ordinal2 != 5) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                final int i13 = 13;
                ByteArrayProtoReader32 rightTo2 = ContourLayout.rightTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.TooltipContainerView$$ExternalSyntheticLambda0
                    public final /* synthetic */ TooltipContainerView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i72 = i13;
                        TooltipContainerView tooltipContainerView = this.f$0;
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        switch (i72) {
                            case 0:
                                int i82 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 1:
                                int i92 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3813getXdipTENr5nQ(18));
                            case 2:
                                int i102 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(tooltipContainerView.hugOffset) + tooltipContainerView.anchorPoint.y);
                            case 3:
                                int i112 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(10));
                            case 4:
                                int i122 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 5:
                                int i132 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 6:
                                int i14 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 7:
                                int i15 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 8:
                                int i16 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 9:
                                int i17 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 10:
                                int i18 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 11:
                                int i19 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 12:
                                int i20 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 13:
                                int i21 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 14:
                                int i22 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            default:
                                int i23 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.anchorPoint.x);
                        }
                    }
                });
                rightTo2.widthOf(2, new WorkSpecDao_Impl$$ExternalSyntheticLambda12(m3813getXdipTENr5nQ, i6));
                final int i14 = 14;
                ContourLayout.layoutBy$default(this, linearLayout, rightTo2, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.TooltipContainerView$$ExternalSyntheticLambda0
                    public final /* synthetic */ TooltipContainerView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i72 = i14;
                        TooltipContainerView tooltipContainerView = this.f$0;
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        switch (i72) {
                            case 0:
                                int i82 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 1:
                                int i92 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3813getXdipTENr5nQ(18));
                            case 2:
                                int i102 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(tooltipContainerView.hugOffset) + tooltipContainerView.anchorPoint.y);
                            case 3:
                                int i112 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(10));
                            case 4:
                                int i122 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 5:
                                int i132 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 6:
                                int i142 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 7:
                                int i15 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 8:
                                int i16 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 9:
                                int i17 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                            case 10:
                                int i18 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 11:
                                int i19 = TooltipContainerView.$r8$clinit;
                                return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                            case 12:
                                int i20 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            case 13:
                                int i21 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                            case 14:
                                int i22 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                            default:
                                int i23 = TooltipContainerView.$r8$clinit;
                                layoutSpec.getClass();
                                return new XInt(tooltipContainerView.anchorPoint.x);
                        }
                    }
                }));
            }
        } else {
            final int i15 = 0;
            ByteArrayProtoReader32 leftTo4 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.TooltipContainerView$$ExternalSyntheticLambda0
                public final /* synthetic */ TooltipContainerView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i72 = i15;
                    TooltipContainerView tooltipContainerView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    switch (i72) {
                        case 0:
                            int i82 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                        case 1:
                            int i92 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(tooltipContainerView.m3813getXdipTENr5nQ(18));
                        case 2:
                            int i102 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(tooltipContainerView.hugOffset) + tooltipContainerView.anchorPoint.y);
                        case 3:
                            int i112 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(10));
                        case 4:
                            int i122 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                        case 5:
                            int i132 = TooltipContainerView.$r8$clinit;
                            return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                        case 6:
                            int i142 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                        case 7:
                            int i152 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                        case 8:
                            int i16 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                        case 9:
                            int i17 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                        case 10:
                            int i18 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                        case 11:
                            int i19 = TooltipContainerView.$r8$clinit;
                            return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                        case 12:
                            int i20 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                        case 13:
                            int i21 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                        case 14:
                            int i22 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                        default:
                            int i23 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(tooltipContainerView.anchorPoint.x);
                    }
                }
            });
            leftTo4.widthOf(2, new WorkSpecDao_Impl$$ExternalSyntheticLambda12(m3813getXdipTENr5nQ, i4));
            ContourLayout.layoutBy$default(this, linearLayout, leftTo4, ContourLayout.bottomTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.TooltipContainerView$$ExternalSyntheticLambda0
                public final /* synthetic */ TooltipContainerView f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i72 = i2;
                    TooltipContainerView tooltipContainerView = this.f$0;
                    ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                    switch (i72) {
                        case 0:
                            int i82 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                        case 1:
                            int i92 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(tooltipContainerView.m3813getXdipTENr5nQ(18));
                        case 2:
                            int i102 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(tooltipContainerView.hugOffset) + tooltipContainerView.anchorPoint.y);
                        case 3:
                            int i112 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(10));
                        case 4:
                            int i122 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                        case 5:
                            int i132 = TooltipContainerView.$r8$clinit;
                            return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                        case 6:
                            int i142 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                        case 7:
                            int i152 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                        case 8:
                            int i16 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                        case 9:
                            int i17 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                        case 10:
                            int i18 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                        case 11:
                            int i19 = TooltipContainerView.$r8$clinit;
                            return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                        case 12:
                            int i20 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                        case 13:
                            int i21 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                        case 14:
                            int i22 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                        default:
                            int i23 = TooltipContainerView.$r8$clinit;
                            layoutSpec.getClass();
                            return new XInt(tooltipContainerView.anchorPoint.x);
                    }
                }
            }));
        }
        final int i16 = 15;
        ByteArrayProtoReader32 centerHorizontallyTo = ContourLayout.centerHorizontallyTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.TooltipContainerView$$ExternalSyntheticLambda0
            public final /* synthetic */ TooltipContainerView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i72 = i16;
                TooltipContainerView tooltipContainerView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i72) {
                    case 0:
                        int i82 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                    case 1:
                        int i92 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3813getXdipTENr5nQ(18));
                    case 2:
                        int i102 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(tooltipContainerView.hugOffset) + tooltipContainerView.anchorPoint.y);
                    case 3:
                        int i112 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(10));
                    case 4:
                        int i122 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 5:
                        int i132 = TooltipContainerView.$r8$clinit;
                        return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                    case 6:
                        int i142 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 7:
                        int i152 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                    case 8:
                        int i162 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 9:
                        int i17 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                    case 10:
                        int i18 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 11:
                        int i19 = TooltipContainerView.$r8$clinit;
                        return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                    case 12:
                        int i20 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 13:
                        int i21 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                    case 14:
                        int i22 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                    default:
                        int i23 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.anchorPoint.x);
                }
            }
        });
        centerHorizontallyTo.widthOf(1, new Function1(this) { // from class: com.squareup.cash.appmessages.views.TooltipContainerView$$ExternalSyntheticLambda0
            public final /* synthetic */ TooltipContainerView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i72 = i4;
                TooltipContainerView tooltipContainerView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i72) {
                    case 0:
                        int i82 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                    case 1:
                        int i92 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3813getXdipTENr5nQ(18));
                    case 2:
                        int i102 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(tooltipContainerView.hugOffset) + tooltipContainerView.anchorPoint.y);
                    case 3:
                        int i112 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(10));
                    case 4:
                        int i122 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 5:
                        int i132 = TooltipContainerView.$r8$clinit;
                        return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                    case 6:
                        int i142 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 7:
                        int i152 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                    case 8:
                        int i162 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 9:
                        int i17 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                    case 10:
                        int i18 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 11:
                        int i19 = TooltipContainerView.$r8$clinit;
                        return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                    case 12:
                        int i20 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 13:
                        int i21 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                    case 14:
                        int i22 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                    default:
                        int i23 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.anchorPoint.x);
                }
            }
        });
        ByteArrayProtoReader32 bottomTo = ContourLayout.bottomTo(new Function1(this) { // from class: com.squareup.cash.appmessages.views.TooltipContainerView$$ExternalSyntheticLambda0
            public final /* synthetic */ TooltipContainerView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i72 = i5;
                TooltipContainerView tooltipContainerView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i72) {
                    case 0:
                        int i82 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                    case 1:
                        int i92 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3813getXdipTENr5nQ(18));
                    case 2:
                        int i102 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(tooltipContainerView.hugOffset) + tooltipContainerView.anchorPoint.y);
                    case 3:
                        int i112 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(10));
                    case 4:
                        int i122 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 5:
                        int i132 = TooltipContainerView.$r8$clinit;
                        return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                    case 6:
                        int i142 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 7:
                        int i152 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                    case 8:
                        int i162 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 9:
                        int i17 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                    case 10:
                        int i18 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 11:
                        int i19 = TooltipContainerView.$r8$clinit;
                        return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                    case 12:
                        int i20 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 13:
                        int i21 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                    case 14:
                        int i22 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                    default:
                        int i23 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.anchorPoint.x);
                }
            }
        });
        bottomTo.heightOf(1, new Function1(this) { // from class: com.squareup.cash.appmessages.views.TooltipContainerView$$ExternalSyntheticLambda0
            public final /* synthetic */ TooltipContainerView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i72 = i3;
                TooltipContainerView tooltipContainerView = this.f$0;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i72) {
                    case 0:
                        int i82 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                    case 1:
                        int i92 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3813getXdipTENr5nQ(18));
                    case 2:
                        int i102 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(tooltipContainerView.hugOffset) + tooltipContainerView.anchorPoint.y);
                    case 3:
                        int i112 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3814getYdipdBGyhoQ(10));
                    case 4:
                        int i122 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 5:
                        int i132 = TooltipContainerView.$r8$clinit;
                        return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                    case 6:
                        int i142 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 7:
                        int i152 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                    case 8:
                        int i162 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3819topdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 9:
                        int i17 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3816leftTENr5nQ(tooltipContainerView.arrowImageView) - tooltipContainerView.contentBubblePadding);
                    case 10:
                        int i18 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 11:
                        int i19 = TooltipContainerView.$r8$clinit;
                        return new XInt(Math.max(SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).left + tooltipContainerView.contentBubblePadding, tooltipContainerView.m3811centerXTENr5nQ(tooltipContainerView.arrowImageView) - (tooltipContainerView.m3820widthTENr5nQ(tooltipContainerView.contentBubble) / 2)));
                    case 12:
                        int i20 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                    case 13:
                        int i21 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.m3818rightTENr5nQ(tooltipContainerView.arrowImageView) + tooltipContainerView.contentBubblePadding);
                    case 14:
                        int i22 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return YInt.m3823boximpl(tooltipContainerView.m3810bottomdBGyhoQ(tooltipContainerView.arrowImageView));
                    default:
                        int i23 = TooltipContainerView.$r8$clinit;
                        layoutSpec.getClass();
                        return new XInt(tooltipContainerView.anchorPoint.x);
                }
            }
        });
        ContourLayout.layoutBy$default(this, tooltipAppMessageArrowImageView, centerHorizontallyTo, bottomTo);
    }

    public final void setHugOffset(int i) {
        this.hugOffset = i;
        requestLayout();
    }

    public final void setTheme(Theme theme) {
        theme.getClass();
        this.contentBubble.setBackground(createBubbleBackgroundDrawable(theme));
        this.contentText.setTheme(theme);
        this.arrowImageView.setTheme(theme);
    }

    public final void setTooltipText(String str) {
        str.getClass();
        this.contentText.setText(str);
    }
}
