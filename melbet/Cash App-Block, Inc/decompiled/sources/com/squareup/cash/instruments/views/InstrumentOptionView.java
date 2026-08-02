package com.squareup.cash.instruments.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.cash.instruments.viewmodels.InstrumentOptionViewModel;
import com.squareup.cash.instruments.views.InstrumentAvatarView;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.Strings;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class InstrumentOptionView extends ContourLayout {
    public final InstrumentAvatarView avatarView;
    public final ColorPalette colorPalette;
    public final MooncakePillButton pillTextView;
    public final AppCompatImageView subtitleIconView;
    public final FigmaTextView subtitleView;
    public final FigmaTextView titleView;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InstrumentOptionViewModel.SubtitleIcon.values().length];
            try {
                InstrumentOptionViewModel.SubtitleIcon subtitleIcon = InstrumentOptionViewModel.SubtitleIcon.CARD;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InstrumentOptionViewModel.SubtitleIcon subtitleIcon2 = InstrumentOptionViewModel.SubtitleIcon.CARD;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentOptionView(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        realImageLoader.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        InstrumentAvatarView instrumentAvatarView = new InstrumentAvatarView(context, InstrumentAvatarView.Size.LARGE, realImageLoader);
        this.avatarView = instrumentAvatarView;
        final int i = 2;
        FigmaTextView figmaTextView = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView, TextStyles.smallTitle);
        this.titleView = figmaTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_START);
        this.subtitleIconView = appCompatImageView;
        FigmaTextView figmaTextView2 = new FigmaTextView(context, null, 2, null);
        Strings.applyStyle(figmaTextView2, TextStyles.smallBody);
        this.subtitleView = figmaTextView2;
        MooncakePillButton mooncakePillButton = new MooncakePillButton(context, null, MooncakePillButton.Size.SMALL, MooncakePillButton.Style.PRIMARY, 2, null);
        this.pillTextView = mooncakePillButton;
        setBackground(RipplesKt.createRippleDrawable$default(this, Integer.valueOf(colorPalette.background), 2));
        final int i2 = 0;
        contourHeightOf(new Function1(this) { // from class: com.squareup.cash.instruments.views.InstrumentOptionView$$ExternalSyntheticLambda0
            public final /* synthetic */ InstrumentOptionView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                InstrumentOptionView instrumentOptionView = this.f$0;
                switch (i3) {
                    case 0:
                        return new YInt(Math.max(instrumentOptionView.m3814getYdipdBGyhoQ(32) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView), instrumentOptionView.m3814getYdipdBGyhoQ(40) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.avatarView)));
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.getDip(20) + instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.avatarView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.pillTextView) - instrumentOptionView.m3813getXdipTENr5nQ(8));
                    case 3:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - ((instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView)) / 2));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.titleView));
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(18));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        FigmaTextView figmaTextView3 = instrumentOptionView.subtitleView;
                        return new YInt(instrumentOptionView.getDip(1) + ((((instrumentOptionView.m3815heightdBGyhoQ(figmaTextView3) / Math.max(figmaTextView3.getLineCount(), 1)) / 2) + instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView)) - (instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleIconView) / 2)));
                    case 7:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3814getYdipdBGyhoQ(12));
                    case 8:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 9:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.titleView) - instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 10:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView));
                    case 11:
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    default:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - instrumentOptionView.m3813getXdipTENr5nQ(20));
                }
            }
        });
        final int i3 = 11;
        ContourLayout.layoutBy$default(this, instrumentAvatarView, ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.instruments.views.InstrumentOptionView$$ExternalSyntheticLambda0
            public final /* synthetic */ InstrumentOptionView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i3;
                InstrumentOptionView instrumentOptionView = this.f$0;
                switch (i32) {
                    case 0:
                        return new YInt(Math.max(instrumentOptionView.m3814getYdipdBGyhoQ(32) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView), instrumentOptionView.m3814getYdipdBGyhoQ(40) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.avatarView)));
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.getDip(20) + instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.avatarView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.pillTextView) - instrumentOptionView.m3813getXdipTENr5nQ(8));
                    case 3:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - ((instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView)) / 2));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.titleView));
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(18));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        FigmaTextView figmaTextView3 = instrumentOptionView.subtitleView;
                        return new YInt(instrumentOptionView.getDip(1) + ((((instrumentOptionView.m3815heightdBGyhoQ(figmaTextView3) / Math.max(figmaTextView3.getLineCount(), 1)) / 2) + instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView)) - (instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleIconView) / 2)));
                    case 7:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3814getYdipdBGyhoQ(12));
                    case 8:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 9:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.titleView) - instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 10:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView));
                    case 11:
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    default:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - instrumentOptionView.m3813getXdipTENr5nQ(20));
                }
            }
        }), ContourLayout.centerVerticallyTo(new ActivityItemLayout$$ExternalSyntheticLambda4(20)));
        final int i4 = 12;
        ByteArrayProtoReader32 rightTo = ContourLayout.rightTo(new Function1(this) { // from class: com.squareup.cash.instruments.views.InstrumentOptionView$$ExternalSyntheticLambda0
            public final /* synthetic */ InstrumentOptionView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i4;
                InstrumentOptionView instrumentOptionView = this.f$0;
                switch (i32) {
                    case 0:
                        return new YInt(Math.max(instrumentOptionView.m3814getYdipdBGyhoQ(32) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView), instrumentOptionView.m3814getYdipdBGyhoQ(40) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.avatarView)));
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.getDip(20) + instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.avatarView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.pillTextView) - instrumentOptionView.m3813getXdipTENr5nQ(8));
                    case 3:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - ((instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView)) / 2));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.titleView));
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(18));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        FigmaTextView figmaTextView3 = instrumentOptionView.subtitleView;
                        return new YInt(instrumentOptionView.getDip(1) + ((((instrumentOptionView.m3815heightdBGyhoQ(figmaTextView3) / Math.max(figmaTextView3.getLineCount(), 1)) / 2) + instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView)) - (instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleIconView) / 2)));
                    case 7:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3814getYdipdBGyhoQ(12));
                    case 8:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 9:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.titleView) - instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 10:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView));
                    case 11:
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    default:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - instrumentOptionView.m3813getXdipTENr5nQ(20));
                }
            }
        });
        rightTo.widthOf(2, new ActivityItemLayout$$ExternalSyntheticLambda4(18));
        ContourLayout.layoutBy$default(this, mooncakePillButton, rightTo, ContourLayout.centerVerticallyTo(new ActivityItemLayout$$ExternalSyntheticLambda4(19)));
        final int i5 = 1;
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.instruments.views.InstrumentOptionView$$ExternalSyntheticLambda0
            public final /* synthetic */ InstrumentOptionView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i5;
                InstrumentOptionView instrumentOptionView = this.f$0;
                switch (i32) {
                    case 0:
                        return new YInt(Math.max(instrumentOptionView.m3814getYdipdBGyhoQ(32) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView), instrumentOptionView.m3814getYdipdBGyhoQ(40) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.avatarView)));
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.getDip(20) + instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.avatarView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.pillTextView) - instrumentOptionView.m3813getXdipTENr5nQ(8));
                    case 3:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - ((instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView)) / 2));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.titleView));
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(18));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        FigmaTextView figmaTextView3 = instrumentOptionView.subtitleView;
                        return new YInt(instrumentOptionView.getDip(1) + ((((instrumentOptionView.m3815heightdBGyhoQ(figmaTextView3) / Math.max(figmaTextView3.getLineCount(), 1)) / 2) + instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView)) - (instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleIconView) / 2)));
                    case 7:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3814getYdipdBGyhoQ(12));
                    case 8:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 9:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.titleView) - instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 10:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView));
                    case 11:
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    default:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - instrumentOptionView.m3813getXdipTENr5nQ(20));
                }
            }
        });
        leftTo.rightTo(1, new Function1(this) { // from class: com.squareup.cash.instruments.views.InstrumentOptionView$$ExternalSyntheticLambda0
            public final /* synthetic */ InstrumentOptionView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i;
                InstrumentOptionView instrumentOptionView = this.f$0;
                switch (i32) {
                    case 0:
                        return new YInt(Math.max(instrumentOptionView.m3814getYdipdBGyhoQ(32) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView), instrumentOptionView.m3814getYdipdBGyhoQ(40) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.avatarView)));
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.getDip(20) + instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.avatarView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.pillTextView) - instrumentOptionView.m3813getXdipTENr5nQ(8));
                    case 3:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - ((instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView)) / 2));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.titleView));
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(18));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        FigmaTextView figmaTextView3 = instrumentOptionView.subtitleView;
                        return new YInt(instrumentOptionView.getDip(1) + ((((instrumentOptionView.m3815heightdBGyhoQ(figmaTextView3) / Math.max(figmaTextView3.getLineCount(), 1)) / 2) + instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView)) - (instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleIconView) / 2)));
                    case 7:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3814getYdipdBGyhoQ(12));
                    case 8:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 9:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.titleView) - instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 10:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView));
                    case 11:
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    default:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - instrumentOptionView.m3813getXdipTENr5nQ(20));
                }
            }
        });
        final int i6 = 3;
        ContourLayout.layoutBy$default(this, figmaTextView, leftTo, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.instruments.views.InstrumentOptionView$$ExternalSyntheticLambda0
            public final /* synthetic */ InstrumentOptionView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i6;
                InstrumentOptionView instrumentOptionView = this.f$0;
                switch (i32) {
                    case 0:
                        return new YInt(Math.max(instrumentOptionView.m3814getYdipdBGyhoQ(32) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView), instrumentOptionView.m3814getYdipdBGyhoQ(40) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.avatarView)));
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.getDip(20) + instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.avatarView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.pillTextView) - instrumentOptionView.m3813getXdipTENr5nQ(8));
                    case 3:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - ((instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView)) / 2));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.titleView));
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(18));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        FigmaTextView figmaTextView3 = instrumentOptionView.subtitleView;
                        return new YInt(instrumentOptionView.getDip(1) + ((((instrumentOptionView.m3815heightdBGyhoQ(figmaTextView3) / Math.max(figmaTextView3.getLineCount(), 1)) / 2) + instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView)) - (instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleIconView) / 2)));
                    case 7:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3814getYdipdBGyhoQ(12));
                    case 8:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 9:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.titleView) - instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 10:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView));
                    case 11:
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    default:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - instrumentOptionView.m3813getXdipTENr5nQ(20));
                }
            }
        }));
        final int i7 = 4;
        ByteArrayProtoReader32 leftTo2 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.instruments.views.InstrumentOptionView$$ExternalSyntheticLambda0
            public final /* synthetic */ InstrumentOptionView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i7;
                InstrumentOptionView instrumentOptionView = this.f$0;
                switch (i32) {
                    case 0:
                        return new YInt(Math.max(instrumentOptionView.m3814getYdipdBGyhoQ(32) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView), instrumentOptionView.m3814getYdipdBGyhoQ(40) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.avatarView)));
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.getDip(20) + instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.avatarView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.pillTextView) - instrumentOptionView.m3813getXdipTENr5nQ(8));
                    case 3:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - ((instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView)) / 2));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.titleView));
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(18));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        FigmaTextView figmaTextView3 = instrumentOptionView.subtitleView;
                        return new YInt(instrumentOptionView.getDip(1) + ((((instrumentOptionView.m3815heightdBGyhoQ(figmaTextView3) / Math.max(figmaTextView3.getLineCount(), 1)) / 2) + instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView)) - (instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleIconView) / 2)));
                    case 7:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3814getYdipdBGyhoQ(12));
                    case 8:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 9:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.titleView) - instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 10:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView));
                    case 11:
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    default:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - instrumentOptionView.m3813getXdipTENr5nQ(20));
                }
            }
        });
        final int i8 = 5;
        leftTo2.widthOf(1, new Function1(this) { // from class: com.squareup.cash.instruments.views.InstrumentOptionView$$ExternalSyntheticLambda0
            public final /* synthetic */ InstrumentOptionView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i8;
                InstrumentOptionView instrumentOptionView = this.f$0;
                switch (i32) {
                    case 0:
                        return new YInt(Math.max(instrumentOptionView.m3814getYdipdBGyhoQ(32) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView), instrumentOptionView.m3814getYdipdBGyhoQ(40) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.avatarView)));
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.getDip(20) + instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.avatarView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.pillTextView) - instrumentOptionView.m3813getXdipTENr5nQ(8));
                    case 3:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - ((instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView)) / 2));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.titleView));
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(18));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        FigmaTextView figmaTextView3 = instrumentOptionView.subtitleView;
                        return new YInt(instrumentOptionView.getDip(1) + ((((instrumentOptionView.m3815heightdBGyhoQ(figmaTextView3) / Math.max(figmaTextView3.getLineCount(), 1)) / 2) + instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView)) - (instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleIconView) / 2)));
                    case 7:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3814getYdipdBGyhoQ(12));
                    case 8:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 9:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.titleView) - instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 10:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView));
                    case 11:
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    default:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - instrumentOptionView.m3813getXdipTENr5nQ(20));
                }
            }
        });
        final int i9 = 6;
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.instruments.views.InstrumentOptionView$$ExternalSyntheticLambda0
            public final /* synthetic */ InstrumentOptionView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i9;
                InstrumentOptionView instrumentOptionView = this.f$0;
                switch (i32) {
                    case 0:
                        return new YInt(Math.max(instrumentOptionView.m3814getYdipdBGyhoQ(32) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView), instrumentOptionView.m3814getYdipdBGyhoQ(40) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.avatarView)));
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.getDip(20) + instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.avatarView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.pillTextView) - instrumentOptionView.m3813getXdipTENr5nQ(8));
                    case 3:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - ((instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView)) / 2));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.titleView));
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(18));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        FigmaTextView figmaTextView3 = instrumentOptionView.subtitleView;
                        return new YInt(instrumentOptionView.getDip(1) + ((((instrumentOptionView.m3815heightdBGyhoQ(figmaTextView3) / Math.max(figmaTextView3.getLineCount(), 1)) / 2) + instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView)) - (instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleIconView) / 2)));
                    case 7:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3814getYdipdBGyhoQ(12));
                    case 8:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 9:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.titleView) - instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 10:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView));
                    case 11:
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    default:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - instrumentOptionView.m3813getXdipTENr5nQ(20));
                }
            }
        });
        final int i10 = 7;
        byteArrayProtoReader32.heightOf(1, new Function1(this) { // from class: com.squareup.cash.instruments.views.InstrumentOptionView$$ExternalSyntheticLambda0
            public final /* synthetic */ InstrumentOptionView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i10;
                InstrumentOptionView instrumentOptionView = this.f$0;
                switch (i32) {
                    case 0:
                        return new YInt(Math.max(instrumentOptionView.m3814getYdipdBGyhoQ(32) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView), instrumentOptionView.m3814getYdipdBGyhoQ(40) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.avatarView)));
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.getDip(20) + instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.avatarView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.pillTextView) - instrumentOptionView.m3813getXdipTENr5nQ(8));
                    case 3:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - ((instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView)) / 2));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.titleView));
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(18));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        FigmaTextView figmaTextView3 = instrumentOptionView.subtitleView;
                        return new YInt(instrumentOptionView.getDip(1) + ((((instrumentOptionView.m3815heightdBGyhoQ(figmaTextView3) / Math.max(figmaTextView3.getLineCount(), 1)) / 2) + instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView)) - (instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleIconView) / 2)));
                    case 7:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3814getYdipdBGyhoQ(12));
                    case 8:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 9:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.titleView) - instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 10:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView));
                    case 11:
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    default:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - instrumentOptionView.m3813getXdipTENr5nQ(20));
                }
            }
        });
        ContourLayout.layoutBy$default(this, appCompatImageView, leftTo2, byteArrayProtoReader32);
        final int i11 = 8;
        ByteArrayProtoReader32 leftTo3 = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.instruments.views.InstrumentOptionView$$ExternalSyntheticLambda0
            public final /* synthetic */ InstrumentOptionView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i11;
                InstrumentOptionView instrumentOptionView = this.f$0;
                switch (i32) {
                    case 0:
                        return new YInt(Math.max(instrumentOptionView.m3814getYdipdBGyhoQ(32) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView), instrumentOptionView.m3814getYdipdBGyhoQ(40) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.avatarView)));
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.getDip(20) + instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.avatarView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.pillTextView) - instrumentOptionView.m3813getXdipTENr5nQ(8));
                    case 3:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - ((instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView)) / 2));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.titleView));
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(18));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        FigmaTextView figmaTextView3 = instrumentOptionView.subtitleView;
                        return new YInt(instrumentOptionView.getDip(1) + ((((instrumentOptionView.m3815heightdBGyhoQ(figmaTextView3) / Math.max(figmaTextView3.getLineCount(), 1)) / 2) + instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView)) - (instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleIconView) / 2)));
                    case 7:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3814getYdipdBGyhoQ(12));
                    case 8:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 9:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.titleView) - instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 10:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView));
                    case 11:
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    default:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - instrumentOptionView.m3813getXdipTENr5nQ(20));
                }
            }
        });
        final int i12 = 9;
        leftTo3.widthOf(2, new Function1(this) { // from class: com.squareup.cash.instruments.views.InstrumentOptionView$$ExternalSyntheticLambda0
            public final /* synthetic */ InstrumentOptionView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i12;
                InstrumentOptionView instrumentOptionView = this.f$0;
                switch (i32) {
                    case 0:
                        return new YInt(Math.max(instrumentOptionView.m3814getYdipdBGyhoQ(32) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView), instrumentOptionView.m3814getYdipdBGyhoQ(40) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.avatarView)));
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.getDip(20) + instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.avatarView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.pillTextView) - instrumentOptionView.m3813getXdipTENr5nQ(8));
                    case 3:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - ((instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView)) / 2));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.titleView));
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(18));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        FigmaTextView figmaTextView3 = instrumentOptionView.subtitleView;
                        return new YInt(instrumentOptionView.getDip(1) + ((((instrumentOptionView.m3815heightdBGyhoQ(figmaTextView3) / Math.max(figmaTextView3.getLineCount(), 1)) / 2) + instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView)) - (instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleIconView) / 2)));
                    case 7:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3814getYdipdBGyhoQ(12));
                    case 8:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 9:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.titleView) - instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 10:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView));
                    case 11:
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    default:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - instrumentOptionView.m3813getXdipTENr5nQ(20));
                }
            }
        });
        final int i13 = 10;
        ContourLayout.layoutBy$default(this, figmaTextView2, leftTo3, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.instruments.views.InstrumentOptionView$$ExternalSyntheticLambda0
            public final /* synthetic */ InstrumentOptionView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i13;
                InstrumentOptionView instrumentOptionView = this.f$0;
                switch (i32) {
                    case 0:
                        return new YInt(Math.max(instrumentOptionView.m3814getYdipdBGyhoQ(32) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView), instrumentOptionView.m3814getYdipdBGyhoQ(40) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.avatarView)));
                    case 1:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.getDip(20) + instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.avatarView));
                    case 2:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.pillTextView) - instrumentOptionView.m3813getXdipTENr5nQ(8));
                    case 3:
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m$2((ContourLayout.LayoutSpec) obj) - ((instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleView) + instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.titleView)) / 2));
                    case 4:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3816leftTENr5nQ(instrumentOptionView.titleView));
                    case 5:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(18));
                    case 6:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        FigmaTextView figmaTextView3 = instrumentOptionView.subtitleView;
                        return new YInt(instrumentOptionView.getDip(1) + ((((instrumentOptionView.m3815heightdBGyhoQ(figmaTextView3) / Math.max(figmaTextView3.getLineCount(), 1)) / 2) + instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView)) - (instrumentOptionView.m3815heightdBGyhoQ(instrumentOptionView.subtitleIconView) / 2)));
                    case 7:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3814getYdipdBGyhoQ(12));
                    case 8:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 9:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.titleView) - instrumentOptionView.m3818rightTENr5nQ(instrumentOptionView.subtitleIconView));
                    case 10:
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(instrumentOptionView.m3810bottomdBGyhoQ(instrumentOptionView.titleView));
                    case 11:
                        return new XInt(instrumentOptionView.m3813getXdipTENr5nQ(20) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    default:
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - instrumentOptionView.m3813getXdipTENr5nQ(20));
                }
            }
        }));
        setFocusable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z) {
    }

    public final void setModel(InstrumentOptionViewModel instrumentOptionViewModel) {
        Integer num;
        instrumentOptionViewModel.getClass();
        String str = instrumentOptionViewModel.title;
        boolean z = instrumentOptionViewModel.enabled;
        String str2 = instrumentOptionViewModel.pillText;
        FigmaTextView figmaTextView = this.titleView;
        figmaTextView.setText(str);
        String str3 = instrumentOptionViewModel.subtitle;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = instrumentOptionViewModel.subtitleSuffix;
        String m = Recorder$$ExternalSyntheticOutline2.m(str3, " ", str4 != null ? str4 : "");
        Drawable drawable = null;
        if (StringsKt.isBlank(m)) {
            m = null;
        }
        FigmaTextView figmaTextView2 = this.subtitleView;
        figmaTextView2.setText(m);
        figmaTextView2.setVisibility(m != null ? 0 : 8);
        MooncakePillButton mooncakePillButton = this.pillTextView;
        mooncakePillButton.setText(str2);
        mooncakePillButton.setVisibility(str2 != null ? 0 : 8);
        ColorPalette colorPalette = this.colorPalette;
        AppCompatImageView appCompatImageView = this.subtitleIconView;
        if (z) {
            figmaTextView.setTextColor(colorPalette.label);
            figmaTextView2.setTextColor(colorPalette.secondaryLabel);
            appCompatImageView.setImageTintList(ColorStateList.valueOf(colorPalette.secondaryIcon));
            mooncakePillButton.setTextColor(-16727481);
        } else {
            figmaTextView.setTextColor(colorPalette.disabledLabel);
            figmaTextView2.setTextColor(colorPalette.disabledLabel);
            appCompatImageView.setImageTintList(ColorStateList.valueOf(colorPalette.disabledIcon));
            mooncakePillButton.setTextColor(colorPalette.placeholderLabel);
        }
        InstrumentOptionViewModel.SubtitleIcon subtitleIcon = instrumentOptionViewModel.subtitleIcon;
        int i = subtitleIcon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[subtitleIcon.ordinal()];
        if (i == -1) {
            num = null;
        } else if (i == 1) {
            num = Integer.valueOf(R.drawable.mooncake_card);
        } else {
            if (i != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            num = Integer.valueOf(R.drawable.mooncake_bank);
        }
        int i2 = z ? colorPalette.secondaryIcon : colorPalette.disabledIcon;
        if (num != null) {
            int intValue = num.intValue();
            Context context = getContext();
            context.getClass();
            drawable = PlatformKt.getDrawableCompat(context, intValue, Integer.valueOf(i2));
        }
        appCompatImageView.setImageDrawable(drawable);
        appCompatImageView.setVisibility(subtitleIcon != null ? 0 : 8);
        this.avatarView.setModel(instrumentOptionViewModel.avatar);
    }
}
