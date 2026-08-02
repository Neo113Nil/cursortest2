package com.squareup.cash.onboarding.views;

import android.content.Context;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.video.VideoCapture;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.core.widget.NestedScrollView;
import app.cash.broadway.ui.Ui;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.components.MooncakeToolbar;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.widget.TextStyles;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.onboarding.viewmodels.CountrySelectorViewModel;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.InsetsCollector;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import com.squareup.cash.util.country.SupportedCountryConfig;
import com.squareup.cash.util.country.UtilKt;
import com.squareup.protos.common.countries.Country;
import com.squareup.util.Strings;
import com.squareup.util.android.PhoneNumbers;
import com.squareup.util.android.Views;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class CountrySelectorDialog extends LinearLayout implements Ui {
    public final ColorPalette colorPalette;
    public Ui.EventReceiver eventReceiver;
    public final LinearLayout itemContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CountrySelectorDialog(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        MooncakeToolbar mooncakeToolbar = new MooncakeToolbar(context, null, 2, 0 == true ? 1 : 0);
        NestedScrollView nestedScrollView = new NestedScrollView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.itemContainer = linearLayout;
        setOrientation(1);
        setBackgroundColor(colorPalette.background);
        WindowInsets windowInsets = InsetsCollector.CONSUMED;
        WindowCompat$Api35Impl.attachedTo(this).setInsetsDispatcher(new VideoCapture.AnonymousClass3((View) this, true, (AlertBannerKt$$ExternalSyntheticLambda3) null));
        mooncakeToolbar.setBackgroundColor(colorPalette.background);
        mooncakeToolbar.setNavigationIcon(R.drawable.close_black);
        mooncakeToolbar.setNavigationOnClickListener(new ChatView$$ExternalSyntheticLambda28(this, 8));
        mooncakeToolbar.setElevation(Views.dip((View) mooncakeToolbar, 0));
        addView(mooncakeToolbar, new LinearLayout.LayoutParams(-1, -2));
        nestedScrollView.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        addView(nestedScrollView, new LinearLayout.LayoutParams(-1, -2));
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.ui.Ui
    public void setModel(CountrySelectorViewModel countrySelectorViewModel) {
        countrySelectorViewModel.getClass();
        LinearLayout linearLayout = this.itemContainer;
        linearLayout.removeAllViews();
        for (Country country : countrySelectorViewModel.countries) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            linearLayout2.setBackground(RipplesKt.createRippleDrawable$default(this, null, 3));
            linearLayout2.setPaddingRelative(Views.dip((View) this, 30), 0, Views.dip((View) this, 20), 0);
            AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
            appCompatImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            Context context = getContext();
            context.getClass();
            LinkedHashMap linkedHashMap = UtilKt.SUPPORTED_COUNTRY_MAP;
            country.getClass();
            SupportedCountryConfig supportedCountryConfig = (SupportedCountryConfig) UtilKt.SUPPORTED_COUNTRY_MAP.get(country);
            appCompatImageView.setImageDrawable(supportedCountryConfig != null ? PlatformKt.getDrawableCompat(context, supportedCountryConfig.flag, null) : null);
            linearLayout2.addView(appCompatImageView, new LinearLayout.LayoutParams(Views.dip((View) this, 32), -2));
            Context context2 = getContext();
            context2.getClass();
            FigmaTextView figmaTextView = new FigmaTextView(context2, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
            String countryCallingCode = PhoneNumbers.getCountryCallingCode(country.name());
            if (countryCallingCode == null) {
                countryCallingCode = "??";
            }
            String displayName = Countries.displayName(country);
            Strings.applyStyle(figmaTextView, TextStyles.mainTitle);
            figmaTextView.setText(displayName + " (+" + countryCallingCode + ")");
            ColorPalette colorPalette = this.colorPalette;
            figmaTextView.setTextColor(colorPalette.label);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.weight = 1.0f;
            layoutParams.topMargin = Views.dip((View) this, 20);
            layoutParams.bottomMargin = Views.dip((View) this, 20);
            layoutParams.leftMargin = Views.dip((View) this, 16);
            linearLayout2.addView(figmaTextView, layoutParams);
            Country country2 = countrySelectorViewModel.selectedCountry;
            if ((country2 == country ? country2 : null) != null) {
                AppCompatImageView appCompatImageView2 = new AppCompatImageView(getContext());
                Context context3 = getContext();
                context3.getClass();
                appCompatImageView2.setImageDrawable(PlatformKt.getDrawableCompat(context3, R.drawable.mooncake_checkmark, Integer.valueOf(colorPalette.primaryButtonBackground)));
                linearLayout2.addView(appCompatImageView2);
            }
            linearLayout2.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(26, this, country));
            linearLayout.addView(linearLayout2);
            requestApplyInsets();
        }
    }
}
