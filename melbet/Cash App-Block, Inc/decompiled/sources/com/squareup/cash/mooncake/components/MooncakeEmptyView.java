package com.squareup.cash.mooncake.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.os.BundleKt;
import com.google.android.material.chip.Chip;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.YInt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class MooncakeEmptyView extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public int extraHeight;
    public final MooncakeSmallText messageView;
    public final int spaceBetweenTitleAndMessage;
    public final MooncakeMediumText titleView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        ThemeInfo themeInfo = ThemeHelpersKt.themeInfo(this);
        MooncakeMediumText mooncakeMediumText = new MooncakeMediumText(context, attributeSet);
        mooncakeMediumText.setGravity(17);
        this.titleView = mooncakeMediumText;
        MooncakeSmallText mooncakeSmallText = new MooncakeSmallText(context, attributeSet);
        mooncakeSmallText.setGravity(17);
        this.messageView = mooncakeSmallText;
        this.spaceBetweenTitleAndMessage = getDip(4);
        this.extraHeight = getDip(76);
        setClipToOutline(true);
        setOutlineProvider(new Chip.AnonymousClass2(this, 2));
        ColorPalette colorPalette = themeInfo.colorPalette;
        setBackgroundColor(colorPalette.secondaryBackground);
        mooncakeMediumText.setTextColor(colorPalette.label);
        BundleKt.setTypeface(mooncakeMediumText, R.font.cashsans_medium);
        mooncakeSmallText.setTextColor(colorPalette.tertiaryLabel);
        mooncakeMediumText.setLetterSpacing(0.02f);
        mooncakeSmallText.setLetterSpacing(0.02f);
        configureLayout();
    }

    public final void configureLayout() {
        final int i = 0;
        contourHeightOf(new Function1(this) { // from class: com.squareup.cash.mooncake.components.MooncakeEmptyView$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeEmptyView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                MooncakeEmptyView mooncakeEmptyView = this.f$0;
                switch (i2) {
                    case 0:
                        return new YInt(mooncakeEmptyView.m3815heightdBGyhoQ(mooncakeEmptyView.messageView) + mooncakeEmptyView.m3815heightdBGyhoQ(mooncakeEmptyView.titleView) + mooncakeEmptyView.extraHeight);
                    case 1:
                        int i3 = MooncakeEmptyView.$r8$clinit;
                        return new YInt(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(mooncakeEmptyView.extraHeight, mooncakeEmptyView.spaceBetweenTitleAndMessage, 2, SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top));
                    default:
                        int i4 = MooncakeEmptyView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeEmptyView.m3810bottomdBGyhoQ(mooncakeEmptyView.titleView) + mooncakeEmptyView.spaceBetweenTitleAndMessage);
                }
            }
        });
        final int i2 = 1;
        ContourLayout.layoutBy$default(this, this.titleView, ContourLayout.matchParentX(getDip(24), getDip(24)), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.mooncake.components.MooncakeEmptyView$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeEmptyView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                MooncakeEmptyView mooncakeEmptyView = this.f$0;
                switch (i22) {
                    case 0:
                        return new YInt(mooncakeEmptyView.m3815heightdBGyhoQ(mooncakeEmptyView.messageView) + mooncakeEmptyView.m3815heightdBGyhoQ(mooncakeEmptyView.titleView) + mooncakeEmptyView.extraHeight);
                    case 1:
                        int i3 = MooncakeEmptyView.$r8$clinit;
                        return new YInt(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(mooncakeEmptyView.extraHeight, mooncakeEmptyView.spaceBetweenTitleAndMessage, 2, SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top));
                    default:
                        int i4 = MooncakeEmptyView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeEmptyView.m3810bottomdBGyhoQ(mooncakeEmptyView.titleView) + mooncakeEmptyView.spaceBetweenTitleAndMessage);
                }
            }
        }));
        final int i3 = 2;
        ContourLayout.layoutBy$default(this, this.messageView, ContourLayout.matchParentX(getDip(24), getDip(24)), ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.mooncake.components.MooncakeEmptyView$$ExternalSyntheticLambda0
            public final /* synthetic */ MooncakeEmptyView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i3;
                MooncakeEmptyView mooncakeEmptyView = this.f$0;
                switch (i22) {
                    case 0:
                        return new YInt(mooncakeEmptyView.m3815heightdBGyhoQ(mooncakeEmptyView.messageView) + mooncakeEmptyView.m3815heightdBGyhoQ(mooncakeEmptyView.titleView) + mooncakeEmptyView.extraHeight);
                    case 1:
                        int i32 = MooncakeEmptyView.$r8$clinit;
                        return new YInt(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(mooncakeEmptyView.extraHeight, mooncakeEmptyView.spaceBetweenTitleAndMessage, 2, SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top));
                    default:
                        int i4 = MooncakeEmptyView.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeEmptyView.m3810bottomdBGyhoQ(mooncakeEmptyView.titleView) + mooncakeEmptyView.spaceBetweenTitleAndMessage);
                }
            }
        }));
    }

    public final void setExtraHeight(int i) {
        if (this.extraHeight != i) {
            this.extraHeight = i;
            configureLayout();
        }
    }

    public final void setMessage(String str) {
        str.getClass();
        this.messageView.setText(str);
    }

    public final void setTitle(String str) {
        str.getClass();
        this.titleView.setText(str);
    }
}
