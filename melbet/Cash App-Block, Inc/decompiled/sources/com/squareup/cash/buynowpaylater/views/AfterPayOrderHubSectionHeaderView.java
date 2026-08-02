package com.squareup.cash.buynowpaylater.views;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.Strings;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class AfterPayOrderHubSectionHeaderView extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final AppCompatTextView titleTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterPayOrderHubSectionHeaderView(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        Strings.applyStyle(appCompatTextView, TextStyles.identifier);
        appCompatTextView.setTextColor(colorPalette.secondaryLabel);
        this.titleTextView = appCompatTextView;
        final int i = 0;
        contourHeightOf(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubSectionHeaderView$$ExternalSyntheticLambda0
            public final /* synthetic */ AfterPayOrderHubSectionHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                AfterPayOrderHubSectionHeaderView afterPayOrderHubSectionHeaderView = this.f$0;
                switch (i2) {
                    case 0:
                        int i3 = AfterPayOrderHubSectionHeaderView.$r8$clinit;
                        return new YInt(afterPayOrderHubSectionHeaderView.m3814getYdipdBGyhoQ(64));
                    case 1:
                        int i4 = AfterPayOrderHubSectionHeaderView.$r8$clinit;
                        return new XInt(afterPayOrderHubSectionHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 2:
                        int i5 = AfterPayOrderHubSectionHeaderView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - afterPayOrderHubSectionHeaderView.m3813getXdipTENr5nQ(24));
                    default:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i6 = AfterPayOrderHubSectionHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(layoutSpec.getParent().m4372bottomh0YXg9w() - afterPayOrderHubSectionHeaderView.m3814getYdipdBGyhoQ(12));
                }
            }
        });
        setBackgroundColor(colorPalette.secondaryBackground);
        final int i2 = 1;
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubSectionHeaderView$$ExternalSyntheticLambda0
            public final /* synthetic */ AfterPayOrderHubSectionHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                AfterPayOrderHubSectionHeaderView afterPayOrderHubSectionHeaderView = this.f$0;
                switch (i22) {
                    case 0:
                        int i3 = AfterPayOrderHubSectionHeaderView.$r8$clinit;
                        return new YInt(afterPayOrderHubSectionHeaderView.m3814getYdipdBGyhoQ(64));
                    case 1:
                        int i4 = AfterPayOrderHubSectionHeaderView.$r8$clinit;
                        return new XInt(afterPayOrderHubSectionHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 2:
                        int i5 = AfterPayOrderHubSectionHeaderView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - afterPayOrderHubSectionHeaderView.m3813getXdipTENr5nQ(24));
                    default:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i6 = AfterPayOrderHubSectionHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(layoutSpec.getParent().m4372bottomh0YXg9w() - afterPayOrderHubSectionHeaderView.m3814getYdipdBGyhoQ(12));
                }
            }
        });
        final int i3 = 2;
        leftTo.rightTo(1, new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubSectionHeaderView$$ExternalSyntheticLambda0
            public final /* synthetic */ AfterPayOrderHubSectionHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i3;
                AfterPayOrderHubSectionHeaderView afterPayOrderHubSectionHeaderView = this.f$0;
                switch (i22) {
                    case 0:
                        int i32 = AfterPayOrderHubSectionHeaderView.$r8$clinit;
                        return new YInt(afterPayOrderHubSectionHeaderView.m3814getYdipdBGyhoQ(64));
                    case 1:
                        int i4 = AfterPayOrderHubSectionHeaderView.$r8$clinit;
                        return new XInt(afterPayOrderHubSectionHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 2:
                        int i5 = AfterPayOrderHubSectionHeaderView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - afterPayOrderHubSectionHeaderView.m3813getXdipTENr5nQ(24));
                    default:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i6 = AfterPayOrderHubSectionHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(layoutSpec.getParent().m4372bottomh0YXg9w() - afterPayOrderHubSectionHeaderView.m3814getYdipdBGyhoQ(12));
                }
            }
        });
        final int i4 = 3;
        ContourLayout.layoutBy$default(this, appCompatTextView, leftTo, ContourLayout.bottomTo(new Function1(this) { // from class: com.squareup.cash.buynowpaylater.views.AfterPayOrderHubSectionHeaderView$$ExternalSyntheticLambda0
            public final /* synthetic */ AfterPayOrderHubSectionHeaderView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i4;
                AfterPayOrderHubSectionHeaderView afterPayOrderHubSectionHeaderView = this.f$0;
                switch (i22) {
                    case 0:
                        int i32 = AfterPayOrderHubSectionHeaderView.$r8$clinit;
                        return new YInt(afterPayOrderHubSectionHeaderView.m3814getYdipdBGyhoQ(64));
                    case 1:
                        int i42 = AfterPayOrderHubSectionHeaderView.$r8$clinit;
                        return new XInt(afterPayOrderHubSectionHeaderView.m3813getXdipTENr5nQ(24) + SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).left);
                    case 2:
                        int i5 = AfterPayOrderHubSectionHeaderView.$r8$clinit;
                        return new XInt(SVG$Unit$EnumUnboxingLocalUtility.m((ContourLayout.LayoutSpec) obj) - afterPayOrderHubSectionHeaderView.m3813getXdipTENr5nQ(24));
                    default:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i6 = AfterPayOrderHubSectionHeaderView.$r8$clinit;
                        layoutSpec.getClass();
                        return new YInt(layoutSpec.getParent().m4372bottomh0YXg9w() - afterPayOrderHubSectionHeaderView.m3814getYdipdBGyhoQ(12));
                }
            }
        }));
    }

    public final void setTitle(String str) {
        str.getClass();
        this.titleTextView.setText(str);
    }
}
