package com.squareup.cash.profile.views;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.Toolbar;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.profile.viewmodels.AppMessagesOptionsViewEvent;
import com.squareup.cash.profile.viewmodels.AppMessagesOptionsViewModel;
import com.squareup.cash.ui.widget.SwitchSettingView;
import com.squareup.kotterknife.KotterKnifeKt;
import com.squareup.kotterknife.Lazy;
import com.squareup.preferences.UriPreference;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;

/* loaded from: classes7.dex */
public final class AppMessagesOptionsView extends NotificationOptionsView implements Ui {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(AppMessagesOptionsView.class, "toolbarView", "getToolbarView()Landroidx/appcompat/widget/Toolbar;", 0), new PropertyReference1Impl(AppMessagesOptionsView.class, "ringtoneView", "getRingtoneView()Lcom/squareup/cash/profile/views/BasicSettingView;", 0), new PropertyReference1Impl(AppMessagesOptionsView.class, "vibrateView", "getVibrateView()Lcom/squareup/cash/ui/widget/SwitchSettingView;", 0), new PropertyReference1Impl(AppMessagesOptionsView.class, "lightView", "getLightView()Lcom/squareup/cash/ui/widget/SwitchSettingView;", 0)};
    public Ui.EventReceiver eventReceiver;
    public final CoroutineContext ioDispatcher;
    public final Lazy lightView$delegate;
    public final UriPreference ringtonePreference;
    public final Lazy ringtoneView$delegate;
    public final Lazy vibrateView$delegate;

    public AppMessagesOptionsView(ContextThemeWrapper contextThemeWrapper, UriPreference uriPreference, CoroutineContext coroutineContext) {
        super(contextThemeWrapper);
        this.ringtonePreference = uriPreference;
        this.ioDispatcher = coroutineContext;
        Lazy bindView = KotterKnifeKt.bindView(this, R.id.toolbar);
        this.ringtoneView$delegate = KotterKnifeKt.bindView(this, R.id.ringtone);
        this.vibrateView$delegate = KotterKnifeKt.bindView(this, R.id.vibrate);
        this.lightView$delegate = KotterKnifeKt.bindView(this, R.id.light);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        final int i = 1;
        setOrientation(1);
        setBackgroundColor(ThemeHelpersKt.themeInfo(this).colorPalette.background);
        View.inflate(contextThemeWrapper, R.layout.app_messages_options_view, this);
        final int i2 = 0;
        ((Toolbar) bindView.getValue(this, $$delegatedProperties[0])).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.profile.views.AppMessagesOptionsView$$ExternalSyntheticLambda0
            public final /* synthetic */ AppMessagesOptionsView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                AppMessagesOptionsView appMessagesOptionsView = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = appMessagesOptionsView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(AppMessagesOptionsViewEvent.NavigationClicked.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        UriPreference uriPreference2 = appMessagesOptionsView.ringtonePreference;
                        BasicSettingView ringtoneView = appMessagesOptionsView.getRingtoneView();
                        uriPreference2.getClass();
                        ringtoneView.getClass();
                        appMessagesOptionsView.latestRingtonePreference = uriPreference2;
                        appMessagesOptionsView.latestRingtoneView = ringtoneView;
                        Ui.EventReceiver eventReceiver2 = appMessagesOptionsView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(new AppMessagesOptionsViewEvent.PickRingtone(uriPreference2.get(), EmptyList.INSTANCE));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        getRingtoneView().setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.profile.views.AppMessagesOptionsView$$ExternalSyntheticLambda0
            public final /* synthetic */ AppMessagesOptionsView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                AppMessagesOptionsView appMessagesOptionsView = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = appMessagesOptionsView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(AppMessagesOptionsViewEvent.NavigationClicked.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        UriPreference uriPreference2 = appMessagesOptionsView.ringtonePreference;
                        BasicSettingView ringtoneView = appMessagesOptionsView.getRingtoneView();
                        uriPreference2.getClass();
                        ringtoneView.getClass();
                        appMessagesOptionsView.latestRingtonePreference = uriPreference2;
                        appMessagesOptionsView.latestRingtoneView = ringtoneView;
                        Ui.EventReceiver eventReceiver2 = appMessagesOptionsView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(new AppMessagesOptionsViewEvent.PickRingtone(uriPreference2.get(), EmptyList.INSTANCE));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        updateRingtoneDescription(getRingtoneView(), uriPreference, coroutineContext);
        getRingtoneView().setTitle(getResources().getString(R.string.app_messages_options_ringtone_title));
        getVibrateView().setOnCheckedChangeListener(new Function2(this) { // from class: com.squareup.cash.profile.views.AppMessagesOptionsView$$ExternalSyntheticLambda2
            public final /* synthetic */ AppMessagesOptionsView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i3 = i2;
                AppMessagesOptionsView appMessagesOptionsView = this.f$0;
                CompoundButton compoundButton = (CompoundButton) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                switch (i3) {
                    case 0:
                        compoundButton.getClass();
                        Ui.EventReceiver eventReceiver = appMessagesOptionsView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new AppMessagesOptionsViewEvent.VibratePreferenceChanged(booleanValue));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        compoundButton.getClass();
                        Ui.EventReceiver eventReceiver2 = appMessagesOptionsView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(new AppMessagesOptionsViewEvent.LightPreferenceChanged(booleanValue));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                }
            }
        });
        getVibrateView().setTitle(getResources().getString(R.string.notification_options_vibrate));
        getVibrateView().setTextHorizontalPadding(R.dimen.profile_item_padding_side);
        getLightView().setOnCheckedChangeListener(new Function2(this) { // from class: com.squareup.cash.profile.views.AppMessagesOptionsView$$ExternalSyntheticLambda2
            public final /* synthetic */ AppMessagesOptionsView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i3 = i;
                AppMessagesOptionsView appMessagesOptionsView = this.f$0;
                CompoundButton compoundButton = (CompoundButton) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                switch (i3) {
                    case 0:
                        compoundButton.getClass();
                        Ui.EventReceiver eventReceiver = appMessagesOptionsView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(new AppMessagesOptionsViewEvent.VibratePreferenceChanged(booleanValue));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                    default:
                        compoundButton.getClass();
                        Ui.EventReceiver eventReceiver2 = appMessagesOptionsView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(new AppMessagesOptionsViewEvent.LightPreferenceChanged(booleanValue));
                            return Unit.INSTANCE;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                        throw null;
                }
            }
        });
        getLightView().setTitle(getResources().getString(R.string.notification_options_light));
        getLightView().setTextHorizontalPadding(R.dimen.profile_item_padding_side);
    }

    public final SwitchSettingView getLightView() {
        return (SwitchSettingView) this.lightView$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public final BasicSettingView getRingtoneView() {
        return (BasicSettingView) this.ringtoneView$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final SwitchSettingView getVibrateView() {
        return (SwitchSettingView) this.vibrateView$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(AppMessagesOptionsViewModel appMessagesOptionsViewModel) {
        appMessagesOptionsViewModel.getClass();
        getLightView().setChecked(appMessagesOptionsViewModel.lightEnabled);
        getVibrateView().setChecked(appMessagesOptionsViewModel.vibrateEnabled);
    }
}
