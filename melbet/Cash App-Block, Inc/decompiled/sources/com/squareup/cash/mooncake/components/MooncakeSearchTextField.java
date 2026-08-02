package com.squareup.cash.mooncake.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.SearchView;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import app.cash.molecule.PlatformKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.wire.ByteArrayProtoReader32;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class MooncakeSearchTextField extends ContourLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final AppCompatImageButton clearSearchButton;
    public final MooncakeEditText editText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MooncakeSearchTextField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        final int i = 2;
        MooncakeEditText mooncakeEditText = new MooncakeEditText(context, null, 2, null);
        mooncakeEditText.setId(R.id.mooncake_search_text_field);
        final int i2 = 1;
        mooncakeEditText.setSingleLine(true);
        mooncakeEditText.setEllipsize(TextUtils.TruncateAt.END);
        mooncakeEditText.setInputType(mooncakeEditText.getInputType() | EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
        final int i3 = 3;
        mooncakeEditText.setImeOptions(mooncakeEditText.getImeOptions() | 3);
        mooncakeEditText.setMinHeight(getDip(48));
        mooncakeEditText.setMinimumHeight(getDip(48));
        mooncakeEditText.setGravity(16);
        int i4 = 8;
        mooncakeEditText.setCompoundDrawablePadding(getDip(8));
        mooncakeEditText.setImportantForAutofill(2);
        Strings.applyStyle(mooncakeEditText, TextStyles.smallBody);
        mooncakeEditText.setPaddingRelative(getDip(14), getDip(12), mooncakeEditText.getPaddingEnd(), getDip(12));
        Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.mooncake_search, Integer.valueOf(colorPalette.tertiaryLabel));
        drawableCompat.getClass();
        final int i5 = 0;
        drawableCompat.setBounds(0, 0, Views.dip((View) mooncakeEditText, 20), Views.dip((View) mooncakeEditText, 20));
        mooncakeEditText.setCompoundDrawables(drawableCompat, null, null, null);
        this.editText = mooncakeEditText;
        AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context);
        RippleDrawable createBorderlessRippleDrawable = RipplesKt.createBorderlessRippleDrawable(appCompatImageButton);
        createBorderlessRippleDrawable.setRadius(getDip(20));
        appCompatImageButton.setBackground(createBorderlessRippleDrawable);
        appCompatImageButton.setContentDescription(context.getString(R.string.clear_search));
        appCompatImageButton.setImageDrawable(PlatformKt.getDrawableCompat(context, R.drawable.search_close, Integer.valueOf(colorPalette.tertiaryLabel)));
        this.clearSearchButton = appCompatImageButton;
        setClipToPadding(false);
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new SplitButtons$$ExternalSyntheticLambda0(20));
        leftTo.rightTo(1, new Function1(this) { // from class: com.squareup.cash.mooncake.components.MooncakeSearchTextField$$ExternalSyntheticLambda1
            public final /* synthetic */ MooncakeSearchTextField f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6 = i5;
                MooncakeSearchTextField mooncakeSearchTextField = this.f$0;
                switch (i6) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i7 = MooncakeSearchTextField.$r8$clinit;
                        layoutSpec.getClass();
                        AppCompatImageButton appCompatImageButton2 = mooncakeSearchTextField.clearSearchButton;
                        return new XInt(appCompatImageButton2.getVisibility() == 0 ? mooncakeSearchTextField.m3816leftTENr5nQ(appCompatImageButton2) : layoutSpec.getParent().m4374rightblrYgr0() - mooncakeSearchTextField.m3813getXdipTENr5nQ(16));
                    case 1:
                        int i8 = MooncakeSearchTextField.$r8$clinit;
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top - mooncakeSearchTextField.getDip(4));
                    case 2:
                        int i9 = MooncakeSearchTextField.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeSearchTextField.m3817preferredWidthTENr5nQ(mooncakeSearchTextField.clearSearchButton));
                    case 3:
                        int i10 = MooncakeSearchTextField.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeSearchTextField.m3812centerYdBGyhoQ(mooncakeSearchTextField.editText));
                    default:
                        return new YInt(mooncakeSearchTextField.m3810bottomdBGyhoQ(mooncakeSearchTextField.editText));
                }
            }
        });
        ContourLayout.layoutBy$default(this, mooncakeEditText, leftTo, ContourLayout.topTo(new Function1(this) { // from class: com.squareup.cash.mooncake.components.MooncakeSearchTextField$$ExternalSyntheticLambda1
            public final /* synthetic */ MooncakeSearchTextField f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6 = i2;
                MooncakeSearchTextField mooncakeSearchTextField = this.f$0;
                switch (i6) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i7 = MooncakeSearchTextField.$r8$clinit;
                        layoutSpec.getClass();
                        AppCompatImageButton appCompatImageButton2 = mooncakeSearchTextField.clearSearchButton;
                        return new XInt(appCompatImageButton2.getVisibility() == 0 ? mooncakeSearchTextField.m3816leftTENr5nQ(appCompatImageButton2) : layoutSpec.getParent().m4374rightblrYgr0() - mooncakeSearchTextField.m3813getXdipTENr5nQ(16));
                    case 1:
                        int i8 = MooncakeSearchTextField.$r8$clinit;
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top - mooncakeSearchTextField.getDip(4));
                    case 2:
                        int i9 = MooncakeSearchTextField.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeSearchTextField.m3817preferredWidthTENr5nQ(mooncakeSearchTextField.clearSearchButton));
                    case 3:
                        int i10 = MooncakeSearchTextField.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeSearchTextField.m3812centerYdBGyhoQ(mooncakeSearchTextField.editText));
                    default:
                        return new YInt(mooncakeSearchTextField.m3810bottomdBGyhoQ(mooncakeSearchTextField.editText));
                }
            }
        }));
        ByteArrayProtoReader32 rightTo = ContourLayout.rightTo(new SplitButtons$$ExternalSyntheticLambda0(21));
        rightTo.widthOf(1, new Function1(this) { // from class: com.squareup.cash.mooncake.components.MooncakeSearchTextField$$ExternalSyntheticLambda1
            public final /* synthetic */ MooncakeSearchTextField f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6 = i;
                MooncakeSearchTextField mooncakeSearchTextField = this.f$0;
                switch (i6) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i7 = MooncakeSearchTextField.$r8$clinit;
                        layoutSpec.getClass();
                        AppCompatImageButton appCompatImageButton2 = mooncakeSearchTextField.clearSearchButton;
                        return new XInt(appCompatImageButton2.getVisibility() == 0 ? mooncakeSearchTextField.m3816leftTENr5nQ(appCompatImageButton2) : layoutSpec.getParent().m4374rightblrYgr0() - mooncakeSearchTextField.m3813getXdipTENr5nQ(16));
                    case 1:
                        int i8 = MooncakeSearchTextField.$r8$clinit;
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top - mooncakeSearchTextField.getDip(4));
                    case 2:
                        int i9 = MooncakeSearchTextField.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeSearchTextField.m3817preferredWidthTENr5nQ(mooncakeSearchTextField.clearSearchButton));
                    case 3:
                        int i10 = MooncakeSearchTextField.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeSearchTextField.m3812centerYdBGyhoQ(mooncakeSearchTextField.editText));
                    default:
                        return new YInt(mooncakeSearchTextField.m3810bottomdBGyhoQ(mooncakeSearchTextField.editText));
                }
            }
        });
        ContourLayout.layoutBy$default(this, appCompatImageButton, rightTo, ContourLayout.centerVerticallyTo(new Function1(this) { // from class: com.squareup.cash.mooncake.components.MooncakeSearchTextField$$ExternalSyntheticLambda1
            public final /* synthetic */ MooncakeSearchTextField f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i6 = i3;
                MooncakeSearchTextField mooncakeSearchTextField = this.f$0;
                switch (i6) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i7 = MooncakeSearchTextField.$r8$clinit;
                        layoutSpec.getClass();
                        AppCompatImageButton appCompatImageButton2 = mooncakeSearchTextField.clearSearchButton;
                        return new XInt(appCompatImageButton2.getVisibility() == 0 ? mooncakeSearchTextField.m3816leftTENr5nQ(appCompatImageButton2) : layoutSpec.getParent().m4374rightblrYgr0() - mooncakeSearchTextField.m3813getXdipTENr5nQ(16));
                    case 1:
                        int i8 = MooncakeSearchTextField.$r8$clinit;
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top - mooncakeSearchTextField.getDip(4));
                    case 2:
                        int i9 = MooncakeSearchTextField.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeSearchTextField.m3817preferredWidthTENr5nQ(mooncakeSearchTextField.clearSearchButton));
                    case 3:
                        int i10 = MooncakeSearchTextField.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeSearchTextField.m3812centerYdBGyhoQ(mooncakeSearchTextField.editText));
                    default:
                        return new YInt(mooncakeSearchTextField.m3810bottomdBGyhoQ(mooncakeSearchTextField.editText));
                }
            }
        }));
        final int i6 = 4;
        contourHeightOf(new Function1(this) { // from class: com.squareup.cash.mooncake.components.MooncakeSearchTextField$$ExternalSyntheticLambda1
            public final /* synthetic */ MooncakeSearchTextField f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i62 = i6;
                MooncakeSearchTextField mooncakeSearchTextField = this.f$0;
                switch (i62) {
                    case 0:
                        ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                        int i7 = MooncakeSearchTextField.$r8$clinit;
                        layoutSpec.getClass();
                        AppCompatImageButton appCompatImageButton2 = mooncakeSearchTextField.clearSearchButton;
                        return new XInt(appCompatImageButton2.getVisibility() == 0 ? mooncakeSearchTextField.m3816leftTENr5nQ(appCompatImageButton2) : layoutSpec.getParent().m4374rightblrYgr0() - mooncakeSearchTextField.m3813getXdipTENr5nQ(16));
                    case 1:
                        int i8 = MooncakeSearchTextField.$r8$clinit;
                        return new YInt(SVG$Unit$EnumUnboxingLocalUtility.m2977m((ContourLayout.LayoutSpec) obj).top - mooncakeSearchTextField.getDip(4));
                    case 2:
                        int i9 = MooncakeSearchTextField.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new XInt(mooncakeSearchTextField.m3817preferredWidthTENr5nQ(mooncakeSearchTextField.clearSearchButton));
                    case 3:
                        int i10 = MooncakeSearchTextField.$r8$clinit;
                        ((ContourLayout.LayoutSpec) obj).getClass();
                        return new YInt(mooncakeSearchTextField.m3812centerYdBGyhoQ(mooncakeSearchTextField.editText));
                    default:
                        return new YInt(mooncakeSearchTextField.m3810bottomdBGyhoQ(mooncakeSearchTextField.editText));
                }
            }
        });
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.density * 24.0f);
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(colorPalette.behindBackground);
        setBackground(new InsetDrawable((Drawable) gradientDrawable, 0, getDip(4), 0, getDip(4)));
        appCompatImageButton.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(this, 7));
        mooncakeEditText.addTextChangedListener(new SearchView.AnonymousClass10(this, i4));
        CharSequence text = mooncakeEditText.getText();
        Fade fade = new Fade();
        fade.mDuration = 150L;
        fade.mTargets.add(appCompatImageButton);
        TransitionManager.beginDelayedTransition(this, fade);
        if (text != null && !StringsKt.isBlank(text)) {
            i4 = 0;
        }
        appCompatImageButton.setVisibility(i4);
    }
}
