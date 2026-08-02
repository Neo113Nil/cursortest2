package com.squareup.cash.security.views;

import android.content.Context;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ScrollView;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SearchView;
import androidx.camera.video.VideoCapture;
import androidx.compose.runtime.PausedCompositionImpl;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.core.widget.PopupWindowCompat;
import androidx.viewbinding.ViewBindings;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.mooncake.components.MooncakeCheckbox;
import com.squareup.cash.mooncake.components.MooncakeEditText;
import com.squareup.cash.mooncake.components.MooncakeLargeText;
import com.squareup.cash.mooncake.components.MooncakeMediumText;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.components.MooncakeToolbar;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.cash.security.screens.PasswordDialogScreen;
import com.squareup.cash.security.screens.PasswordScreenData;
import com.squareup.cash.security.viewmodels.BiometricsCheckboxModel$Hidden;
import com.squareup.cash.security.viewmodels.BiometricsCheckboxModel$SaveBiometricsLogIn;
import com.squareup.cash.security.viewmodels.BiometricsCheckboxModel$UseBiometricsLogIn;
import com.squareup.cash.security.viewmodels.PasswordEntryViewEvent;
import com.squareup.cash.security.viewmodels.PasswordEntryViewModel;
import com.squareup.cash.security.views.databinding.SecurityViewPasswordEntryBinding;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.DialogResultListener;
import com.squareup.cash.ui.InsetsCollector;
import com.squareup.cash.ui.OnBackListener;
import com.squareup.cash.ui.SecureScreen;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.util.android.ColorsKt;
import com.squareup.util.android.Views;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import sqip.internal.GiftCardEditor$$ExternalSyntheticLambda1;

/* loaded from: classes7.dex */
public final class PasswordEntryView extends ConstraintLayout implements Ui, SecureScreen, OnBackListener, DialogResultListener {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final SecurityViewPasswordEntryBinding binding;
    public final ColorPalette colorPalette;
    public Ui.EventReceiver eventReceiver;
    public final PausedCompositionImpl loadingHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordEntryView(Context context) {
        super(context);
        context.getClass();
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.colorPalette = colorPalette;
        this.loadingHelper = new PausedCompositionImpl(this, null, null, null, 62);
        WindowInsets windowInsets = InsetsCollector.CONSUMED;
        WindowCompat$Api35Impl.attachedTo(this).setInsetsDispatcher(new VideoCapture.AnonymousClass3((View) this, true, (AlertBannerKt$$ExternalSyntheticLambda3) null));
        setBackgroundColor(colorPalette.background);
        View inflate = View.inflate(new ContextThemeWrapper(context, R.style.Theme_Cash_Default_Accent), R.layout.security_view_password_entry, this);
        int i = R.id.security_view_biometrics_checkbox;
        MooncakeCheckbox mooncakeCheckbox = (MooncakeCheckbox) ViewBindings.findChildViewById(inflate, R.id.security_view_biometrics_checkbox);
        if (mooncakeCheckbox != null) {
            i = R.id.security_view_divider;
            View findChildViewById = ViewBindings.findChildViewById(inflate, R.id.security_view_divider);
            if (findChildViewById != null) {
                i = R.id.security_view_edit_text_button;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(inflate, R.id.security_view_edit_text_button);
                if (appCompatCheckBox != null) {
                    i = R.id.security_view_forgot_password_text;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(inflate, R.id.security_view_forgot_password_text);
                    if (appCompatTextView != null) {
                        i = R.id.security_view_help_button;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(inflate, R.id.security_view_help_button);
                        if (appCompatImageView != null) {
                            i = R.id.security_view_password_action_button;
                            MooncakePillButton mooncakePillButton = (MooncakePillButton) ViewBindings.findChildViewById(inflate, R.id.security_view_password_action_button);
                            if (mooncakePillButton != null) {
                                i = R.id.security_view_password_app_toolbar;
                                MooncakeToolbar mooncakeToolbar = (MooncakeToolbar) ViewBindings.findChildViewById(inflate, R.id.security_view_password_app_toolbar);
                                if (mooncakeToolbar != null) {
                                    i = R.id.security_view_password_container_edit_text;
                                    if (((LinearLayoutCompat) ViewBindings.findChildViewById(inflate, R.id.security_view_password_container_edit_text)) != null) {
                                        i = R.id.security_view_password_detail_text;
                                        MooncakeMediumText mooncakeMediumText = (MooncakeMediumText) ViewBindings.findChildViewById(inflate, R.id.security_view_password_detail_text);
                                        if (mooncakeMediumText != null) {
                                            i = R.id.security_view_password_edit_text;
                                            MooncakeEditText mooncakeEditText = (MooncakeEditText) ViewBindings.findChildViewById(inflate, R.id.security_view_password_edit_text);
                                            if (mooncakeEditText != null) {
                                                i = R.id.security_view_password_entry_internal_layout;
                                                if (((ConstraintLayout) ViewBindings.findChildViewById(inflate, R.id.security_view_password_entry_internal_layout)) != null) {
                                                    i = R.id.security_view_password_entry_scroll_container;
                                                    if (((ScrollView) ViewBindings.findChildViewById(inflate, R.id.security_view_password_entry_scroll_container)) != null) {
                                                        i = R.id.security_view_password_header;
                                                        MooncakeLargeText mooncakeLargeText = (MooncakeLargeText) ViewBindings.findChildViewById(inflate, R.id.security_view_password_header);
                                                        if (mooncakeLargeText != null) {
                                                            this.binding = new SecurityViewPasswordEntryBinding(inflate, mooncakeCheckbox, findChildViewById, appCompatCheckBox, appCompatTextView, appCompatImageView, mooncakePillButton, mooncakeToolbar, mooncakeMediumText, mooncakeEditText, mooncakeLargeText);
                                                            int i2 = colorPalette.background;
                                                            int i3 = colorPalette.tint;
                                                            mooncakeToolbar.setBackgroundColor(i2);
                                                            Context context2 = mooncakeToolbar.getContext();
                                                            context2.getClass();
                                                            int i4 = colorPalette.icon;
                                                            mooncakeToolbar.setNavigationIcon(PlatformKt.getDrawableCompat(context2, R.drawable.close_white, Integer.valueOf(i4)));
                                                            mooncakeToolbar.setNavigationOnClickListener(new PasswordEntryView$$ExternalSyntheticLambda2(this, 0));
                                                            appCompatImageView.setColorFilter(i4);
                                                            appCompatImageView.setBackground(RipplesKt.createBorderlessRippleDrawable(appCompatImageView));
                                                            appCompatImageView.setOnClickListener(new PasswordEntryView$$ExternalSyntheticLambda2(this, 1));
                                                            Context context3 = appCompatTextView.getContext();
                                                            context3.getClass();
                                                            Views.setCompoundDrawableStart(appCompatTextView, PlatformKt.getDrawableCompat(context3, R.drawable.security_views_help_question_mark, Integer.valueOf(i3)));
                                                            appCompatTextView.setTextColor(i3);
                                                            appCompatTextView.setOnClickListener(new PasswordEntryView$$ExternalSyntheticLambda2(this, 2));
                                                            mooncakeEditText.setImeOptions(2);
                                                            mooncakeEditText.setInputType(524416);
                                                            mooncakeEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                                            mooncakeEditText.setOnEditorActionListener(new GiftCardEditor$$ExternalSyntheticLambda1(this, 2));
                                                            mooncakeEditText.addTextChangedListener(new SearchView.AnonymousClass10(this, 9));
                                                            findChildViewById.setBackgroundColor(colorPalette.hairline);
                                                            appCompatCheckBox.setButtonTintList(ColorsKt.colorStateListOf(new Pair(new int[0], Integer.valueOf(colorPalette.tertiaryButtonTint))));
                                                            appCompatCheckBox.setOnCheckedChangeListener(new PasswordEntryView$$ExternalSyntheticLambda1(this, 0));
                                                            mooncakeCheckbox.setText(R.string.security_view_biometrics_text);
                                                            mooncakeCheckbox.setPaddingRelative(Views.dip((View) mooncakeCheckbox, 0), Views.dip((View) mooncakeCheckbox, 16), Views.dip((View) mooncakeCheckbox, 16), Views.dip((View) mooncakeCheckbox, 16));
                                                            mooncakePillButton.setText(getContext().getString(R.string.security_view_primary_cta));
                                                            mooncakePillButton.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(28, mooncakePillButton, this));
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        Ui.EventReceiver eventReceiver = this.eventReceiver;
        if (eventReceiver != null) {
            eventReceiver.sendEvent(PasswordEntryViewEvent.CloseScreen.INSTANCE);
            return true;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
        throw null;
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogCanceled(Screen screen) {
        screen.getClass();
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogResult(Screen screen, Object obj) {
        screen.getClass();
        if (screen instanceof BlockersScreens.FormMenuActionSheet) {
            Ui.EventReceiver eventReceiver = this.eventReceiver;
            if (eventReceiver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
            obj.getClass();
            eventReceiver.sendEvent(new PasswordEntryViewEvent.HelpMenuItemClick((BlockerAction) obj));
            return;
        }
        if ((screen instanceof PasswordDialogScreen) && (obj instanceof PasswordDialogScreen.PasswordDialog.Button)) {
            Ui.EventReceiver eventReceiver2 = this.eventReceiver;
            if (eventReceiver2 != null) {
                eventReceiver2.sendEvent(new PasswordEntryViewEvent.DialogClickEvent((PasswordDialogScreen.PasswordDialog.Button) obj));
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
        }
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(PasswordEntryViewModel passwordEntryViewModel) {
        passwordEntryViewModel.getClass();
        boolean z = passwordEntryViewModel instanceof PasswordEntryViewModel.Loading;
        PausedCompositionImpl pausedCompositionImpl = this.loadingHelper;
        if (z) {
            pausedCompositionImpl.setLoading(true);
            return;
        }
        if (!(passwordEntryViewModel instanceof PasswordEntryViewModel.Content)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        pausedCompositionImpl.setLoading(false);
        PasswordEntryViewModel.Content content = (PasswordEntryViewModel.Content) passwordEntryViewModel;
        PasswordScreenData passwordScreenData = content.passwordScreenData;
        SecurityViewPasswordEntryBinding securityViewPasswordEntryBinding = this.binding;
        ((MooncakeLargeText) securityViewPasswordEntryBinding.securityViewPasswordHeader).setText(passwordScreenData.headerText);
        MooncakeMediumText mooncakeMediumText = (MooncakeMediumText) securityViewPasswordEntryBinding.securityViewPasswordDetailText;
        String str = passwordScreenData.detailText;
        if (str == null || str.length() == 0) {
            mooncakeMediumText.setVisibility(8);
        } else {
            mooncakeMediumText.setText(str);
        }
        ((MooncakeEditText) securityViewPasswordEntryBinding.securityViewPasswordEditText).setHint(passwordScreenData.passwordPlaceholder);
        PopupWindowCompat popupWindowCompat = content.biometricsCheckboxModel;
        MooncakeCheckbox mooncakeCheckbox = (MooncakeCheckbox) securityViewPasswordEntryBinding.securityViewBiometricsCheckbox;
        if (popupWindowCompat.equals(BiometricsCheckboxModel$Hidden.INSTANCE)) {
            mooncakeCheckbox.setVisibility(8);
        } else if (popupWindowCompat instanceof BiometricsCheckboxModel$SaveBiometricsLogIn) {
            mooncakeCheckbox.setMooncakeButtonDrawable();
            mooncakeCheckbox.setCheckedSilently(((BiometricsCheckboxModel$SaveBiometricsLogIn) popupWindowCompat).isChecked);
            mooncakeCheckbox.setOnClickListener(null);
            mooncakeCheckbox.setOnCheckedChangeListener(new PasswordEntryView$$ExternalSyntheticLambda1(this, 1));
            mooncakeCheckbox.setVisibility(0);
        } else {
            if (!popupWindowCompat.equals(BiometricsCheckboxModel$UseBiometricsLogIn.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            mooncakeCheckbox.setOnCheckedChangeListener(null);
            mooncakeCheckbox.setOnClickListener(new PasswordEntryView$$ExternalSyntheticLambda2(this, 3));
            Context context = mooncakeCheckbox.getContext();
            context.getClass();
            mooncakeCheckbox.setButtonDrawable(PlatformKt.getDrawableCompat(context, R.drawable.security_views_icon_fingerprint, Integer.valueOf(this.colorPalette.tint)));
            mooncakeCheckbox.setVisibility(0);
        }
        ((AppCompatTextView) securityViewPasswordEntryBinding.securityViewForgotPasswordText).setVisibility(passwordScreenData.helpAction == null ? 8 : 0);
        ((AppCompatImageView) securityViewPasswordEntryBinding.securityViewHelpButton).setVisibility(8);
    }
}
