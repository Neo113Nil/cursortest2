package com.squareup.cash.profile.views;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.Toolbar;
import app.cash.broadway.ui.Ui;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.notifications.NotificationSound;
import com.squareup.cash.profile.viewmodels.PaymentNotificationOptionsViewEvent;
import com.squareup.cash.profile.viewmodels.RingtoneItem;
import com.squareup.cash.ui.widget.SwitchSettingView;
import com.squareup.kotterknife.KotterKnifeKt;
import com.squareup.kotterknife.Lazy;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.UriPreference;
import com.squareup.util.android.Uris;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;

/* loaded from: classes7.dex */
public final class PaymentNotificationOptionsView extends NotificationOptionsView implements Ui {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(PaymentNotificationOptionsView.class, "toolbarView", "getToolbarView()Landroidx/appcompat/widget/Toolbar;", 0), new PropertyReference1Impl(PaymentNotificationOptionsView.class, "ringtoneCashView", "getRingtoneCashView()Lcom/squareup/cash/profile/views/BasicSettingView;", 0), new PropertyReference1Impl(PaymentNotificationOptionsView.class, "ringtoneBillView", "getRingtoneBillView()Lcom/squareup/cash/profile/views/BasicSettingView;", 0), new PropertyReference1Impl(PaymentNotificationOptionsView.class, "ringtoneOtherView", "getRingtoneOtherView()Lcom/squareup/cash/profile/views/BasicSettingView;", 0), new PropertyReference1Impl(PaymentNotificationOptionsView.class, "vibrateView", "getVibrateView()Lcom/squareup/cash/ui/widget/SwitchSettingView;", 0), new PropertyReference1Impl(PaymentNotificationOptionsView.class, "lightView", "getLightView()Lcom/squareup/cash/ui/widget/SwitchSettingView;", 0)};
    public final List additionalItemsBill;
    public final List additionalItemsCash;
    public Ui.EventReceiver eventReceiver;
    public final BooleanPreference lightPreference;
    public final Lazy lightView$delegate;
    public final UriPreference ringtoneBillPreference;
    public final Lazy ringtoneBillView$delegate;
    public final UriPreference ringtoneCashPreference;
    public final Lazy ringtoneCashView$delegate;
    public final UriPreference ringtoneOtherPreference;
    public final Lazy ringtoneOtherView$delegate;
    public final BooleanPreference vibratePreference;
    public final Lazy vibrateView$delegate;

    public PaymentNotificationOptionsView(ContextThemeWrapper contextThemeWrapper, UriPreference uriPreference, UriPreference uriPreference2, UriPreference uriPreference3, BooleanPreference booleanPreference, BooleanPreference booleanPreference2) {
        super(contextThemeWrapper);
        this.ringtoneOtherPreference = uriPreference;
        this.ringtoneCashPreference = uriPreference2;
        this.ringtoneBillPreference = uriPreference3;
        this.vibratePreference = booleanPreference;
        this.lightPreference = booleanPreference2;
        Lazy bindView = KotterKnifeKt.bindView(this, R.id.toolbar);
        Lazy bindView2 = KotterKnifeKt.bindView(this, R.id.ringtone_cash);
        this.ringtoneCashView$delegate = bindView2;
        Lazy bindView3 = KotterKnifeKt.bindView(this, R.id.ringtone_bill);
        this.ringtoneBillView$delegate = bindView3;
        Lazy bindView4 = KotterKnifeKt.bindView(this, R.id.ringtone);
        this.ringtoneOtherView$delegate = bindView4;
        this.vibrateView$delegate = KotterKnifeKt.bindView(this, R.id.vibrate);
        this.lightView$delegate = KotterKnifeKt.bindView(this, R.id.light);
        Context context = getContext();
        context.getClass();
        NotificationSound notificationSound = NotificationSound.CASH;
        this.additionalItemsCash = CollectionsKt__CollectionsJVMKt.listOf(new RingtoneItem(R.string.ringtone_item_cash, Uris.getUriForResource(context, notificationSound.resId), notificationSound.persistedUri));
        Context context2 = getContext();
        context2.getClass();
        NotificationSound notificationSound2 = NotificationSound.BILL;
        this.additionalItemsBill = CollectionsKt__CollectionsJVMKt.listOf(new RingtoneItem(R.string.ringtone_item_bill, Uris.getUriForResource(context2, notificationSound2.resId), notificationSound2.persistedUri));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        final int i = 1;
        setOrientation(1);
        setBackgroundColor(ThemeHelpersKt.themeInfo(this).colorPalette.background);
        View.inflate(contextThemeWrapper, R.layout.payment_notification_options_view, this);
        KProperty[] kPropertyArr = $$delegatedProperties;
        final int i2 = 0;
        ((Toolbar) bindView.getValue(this, kPropertyArr[0])).setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.profile.views.PaymentNotificationOptionsView$$ExternalSyntheticLambda0
            public final /* synthetic */ PaymentNotificationOptionsView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                PaymentNotificationOptionsView paymentNotificationOptionsView = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = paymentNotificationOptionsView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(PaymentNotificationOptionsViewEvent.Exit.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    case 1:
                        UriPreference uriPreference4 = paymentNotificationOptionsView.ringtoneCashPreference;
                        BasicSettingView basicSettingView = (BasicSettingView) paymentNotificationOptionsView.ringtoneCashView$delegate.getValue(paymentNotificationOptionsView, PaymentNotificationOptionsView.$$delegatedProperties[1]);
                        uriPreference4.getClass();
                        basicSettingView.getClass();
                        paymentNotificationOptionsView.latestRingtonePreference = uriPreference4;
                        paymentNotificationOptionsView.latestRingtoneView = basicSettingView;
                        Ui.EventReceiver eventReceiver2 = paymentNotificationOptionsView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(new PaymentNotificationOptionsViewEvent.PickRingtone(uriPreference4.get(), paymentNotificationOptionsView.additionalItemsCash));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    case 2:
                        UriPreference uriPreference5 = paymentNotificationOptionsView.ringtoneBillPreference;
                        BasicSettingView basicSettingView2 = (BasicSettingView) paymentNotificationOptionsView.ringtoneBillView$delegate.getValue(paymentNotificationOptionsView, PaymentNotificationOptionsView.$$delegatedProperties[2]);
                        uriPreference5.getClass();
                        basicSettingView2.getClass();
                        paymentNotificationOptionsView.latestRingtonePreference = uriPreference5;
                        paymentNotificationOptionsView.latestRingtoneView = basicSettingView2;
                        Ui.EventReceiver eventReceiver3 = paymentNotificationOptionsView.eventReceiver;
                        if (eventReceiver3 != null) {
                            eventReceiver3.sendEvent(new PaymentNotificationOptionsViewEvent.PickRingtone(uriPreference5.get(), paymentNotificationOptionsView.additionalItemsBill));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        UriPreference uriPreference6 = paymentNotificationOptionsView.ringtoneOtherPreference;
                        BasicSettingView basicSettingView3 = (BasicSettingView) paymentNotificationOptionsView.ringtoneOtherView$delegate.getValue(paymentNotificationOptionsView, PaymentNotificationOptionsView.$$delegatedProperties[3]);
                        uriPreference6.getClass();
                        basicSettingView3.getClass();
                        paymentNotificationOptionsView.latestRingtonePreference = uriPreference6;
                        paymentNotificationOptionsView.latestRingtoneView = basicSettingView3;
                        Ui.EventReceiver eventReceiver4 = paymentNotificationOptionsView.eventReceiver;
                        if (eventReceiver4 != null) {
                            eventReceiver4.sendEvent(new PaymentNotificationOptionsViewEvent.PickRingtone(uriPreference6.get(), EmptyList.INSTANCE));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        ((BasicSettingView) bindView2.getValue(this, kPropertyArr[1])).setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.profile.views.PaymentNotificationOptionsView$$ExternalSyntheticLambda0
            public final /* synthetic */ PaymentNotificationOptionsView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                PaymentNotificationOptionsView paymentNotificationOptionsView = this.f$0;
                switch (i3) {
                    case 0:
                        Ui.EventReceiver eventReceiver = paymentNotificationOptionsView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(PaymentNotificationOptionsViewEvent.Exit.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    case 1:
                        UriPreference uriPreference4 = paymentNotificationOptionsView.ringtoneCashPreference;
                        BasicSettingView basicSettingView = (BasicSettingView) paymentNotificationOptionsView.ringtoneCashView$delegate.getValue(paymentNotificationOptionsView, PaymentNotificationOptionsView.$$delegatedProperties[1]);
                        uriPreference4.getClass();
                        basicSettingView.getClass();
                        paymentNotificationOptionsView.latestRingtonePreference = uriPreference4;
                        paymentNotificationOptionsView.latestRingtoneView = basicSettingView;
                        Ui.EventReceiver eventReceiver2 = paymentNotificationOptionsView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(new PaymentNotificationOptionsViewEvent.PickRingtone(uriPreference4.get(), paymentNotificationOptionsView.additionalItemsCash));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    case 2:
                        UriPreference uriPreference5 = paymentNotificationOptionsView.ringtoneBillPreference;
                        BasicSettingView basicSettingView2 = (BasicSettingView) paymentNotificationOptionsView.ringtoneBillView$delegate.getValue(paymentNotificationOptionsView, PaymentNotificationOptionsView.$$delegatedProperties[2]);
                        uriPreference5.getClass();
                        basicSettingView2.getClass();
                        paymentNotificationOptionsView.latestRingtonePreference = uriPreference5;
                        paymentNotificationOptionsView.latestRingtoneView = basicSettingView2;
                        Ui.EventReceiver eventReceiver3 = paymentNotificationOptionsView.eventReceiver;
                        if (eventReceiver3 != null) {
                            eventReceiver3.sendEvent(new PaymentNotificationOptionsViewEvent.PickRingtone(uriPreference5.get(), paymentNotificationOptionsView.additionalItemsBill));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        UriPreference uriPreference6 = paymentNotificationOptionsView.ringtoneOtherPreference;
                        BasicSettingView basicSettingView3 = (BasicSettingView) paymentNotificationOptionsView.ringtoneOtherView$delegate.getValue(paymentNotificationOptionsView, PaymentNotificationOptionsView.$$delegatedProperties[3]);
                        uriPreference6.getClass();
                        basicSettingView3.getClass();
                        paymentNotificationOptionsView.latestRingtonePreference = uriPreference6;
                        paymentNotificationOptionsView.latestRingtoneView = basicSettingView3;
                        Ui.EventReceiver eventReceiver4 = paymentNotificationOptionsView.eventReceiver;
                        if (eventReceiver4 != null) {
                            eventReceiver4.sendEvent(new PaymentNotificationOptionsViewEvent.PickRingtone(uriPreference6.get(), EmptyList.INSTANCE));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        final int i3 = 2;
        ((BasicSettingView) bindView3.getValue(this, kPropertyArr[2])).setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.profile.views.PaymentNotificationOptionsView$$ExternalSyntheticLambda0
            public final /* synthetic */ PaymentNotificationOptionsView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                PaymentNotificationOptionsView paymentNotificationOptionsView = this.f$0;
                switch (i32) {
                    case 0:
                        Ui.EventReceiver eventReceiver = paymentNotificationOptionsView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(PaymentNotificationOptionsViewEvent.Exit.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    case 1:
                        UriPreference uriPreference4 = paymentNotificationOptionsView.ringtoneCashPreference;
                        BasicSettingView basicSettingView = (BasicSettingView) paymentNotificationOptionsView.ringtoneCashView$delegate.getValue(paymentNotificationOptionsView, PaymentNotificationOptionsView.$$delegatedProperties[1]);
                        uriPreference4.getClass();
                        basicSettingView.getClass();
                        paymentNotificationOptionsView.latestRingtonePreference = uriPreference4;
                        paymentNotificationOptionsView.latestRingtoneView = basicSettingView;
                        Ui.EventReceiver eventReceiver2 = paymentNotificationOptionsView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(new PaymentNotificationOptionsViewEvent.PickRingtone(uriPreference4.get(), paymentNotificationOptionsView.additionalItemsCash));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    case 2:
                        UriPreference uriPreference5 = paymentNotificationOptionsView.ringtoneBillPreference;
                        BasicSettingView basicSettingView2 = (BasicSettingView) paymentNotificationOptionsView.ringtoneBillView$delegate.getValue(paymentNotificationOptionsView, PaymentNotificationOptionsView.$$delegatedProperties[2]);
                        uriPreference5.getClass();
                        basicSettingView2.getClass();
                        paymentNotificationOptionsView.latestRingtonePreference = uriPreference5;
                        paymentNotificationOptionsView.latestRingtoneView = basicSettingView2;
                        Ui.EventReceiver eventReceiver3 = paymentNotificationOptionsView.eventReceiver;
                        if (eventReceiver3 != null) {
                            eventReceiver3.sendEvent(new PaymentNotificationOptionsViewEvent.PickRingtone(uriPreference5.get(), paymentNotificationOptionsView.additionalItemsBill));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        UriPreference uriPreference6 = paymentNotificationOptionsView.ringtoneOtherPreference;
                        BasicSettingView basicSettingView3 = (BasicSettingView) paymentNotificationOptionsView.ringtoneOtherView$delegate.getValue(paymentNotificationOptionsView, PaymentNotificationOptionsView.$$delegatedProperties[3]);
                        uriPreference6.getClass();
                        basicSettingView3.getClass();
                        paymentNotificationOptionsView.latestRingtonePreference = uriPreference6;
                        paymentNotificationOptionsView.latestRingtoneView = basicSettingView3;
                        Ui.EventReceiver eventReceiver4 = paymentNotificationOptionsView.eventReceiver;
                        if (eventReceiver4 != null) {
                            eventReceiver4.sendEvent(new PaymentNotificationOptionsViewEvent.PickRingtone(uriPreference6.get(), EmptyList.INSTANCE));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        final int i4 = 3;
        ((BasicSettingView) bindView4.getValue(this, kPropertyArr[3])).setOnClickListener(new View.OnClickListener(this) { // from class: com.squareup.cash.profile.views.PaymentNotificationOptionsView$$ExternalSyntheticLambda0
            public final /* synthetic */ PaymentNotificationOptionsView f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i4;
                PaymentNotificationOptionsView paymentNotificationOptionsView = this.f$0;
                switch (i32) {
                    case 0:
                        Ui.EventReceiver eventReceiver = paymentNotificationOptionsView.eventReceiver;
                        if (eventReceiver != null) {
                            eventReceiver.sendEvent(PaymentNotificationOptionsViewEvent.Exit.INSTANCE);
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    case 1:
                        UriPreference uriPreference4 = paymentNotificationOptionsView.ringtoneCashPreference;
                        BasicSettingView basicSettingView = (BasicSettingView) paymentNotificationOptionsView.ringtoneCashView$delegate.getValue(paymentNotificationOptionsView, PaymentNotificationOptionsView.$$delegatedProperties[1]);
                        uriPreference4.getClass();
                        basicSettingView.getClass();
                        paymentNotificationOptionsView.latestRingtonePreference = uriPreference4;
                        paymentNotificationOptionsView.latestRingtoneView = basicSettingView;
                        Ui.EventReceiver eventReceiver2 = paymentNotificationOptionsView.eventReceiver;
                        if (eventReceiver2 != null) {
                            eventReceiver2.sendEvent(new PaymentNotificationOptionsViewEvent.PickRingtone(uriPreference4.get(), paymentNotificationOptionsView.additionalItemsCash));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    case 2:
                        UriPreference uriPreference5 = paymentNotificationOptionsView.ringtoneBillPreference;
                        BasicSettingView basicSettingView2 = (BasicSettingView) paymentNotificationOptionsView.ringtoneBillView$delegate.getValue(paymentNotificationOptionsView, PaymentNotificationOptionsView.$$delegatedProperties[2]);
                        uriPreference5.getClass();
                        basicSettingView2.getClass();
                        paymentNotificationOptionsView.latestRingtonePreference = uriPreference5;
                        paymentNotificationOptionsView.latestRingtoneView = basicSettingView2;
                        Ui.EventReceiver eventReceiver3 = paymentNotificationOptionsView.eventReceiver;
                        if (eventReceiver3 != null) {
                            eventReceiver3.sendEvent(new PaymentNotificationOptionsViewEvent.PickRingtone(uriPreference5.get(), paymentNotificationOptionsView.additionalItemsBill));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                    default:
                        UriPreference uriPreference6 = paymentNotificationOptionsView.ringtoneOtherPreference;
                        BasicSettingView basicSettingView3 = (BasicSettingView) paymentNotificationOptionsView.ringtoneOtherView$delegate.getValue(paymentNotificationOptionsView, PaymentNotificationOptionsView.$$delegatedProperties[3]);
                        uriPreference6.getClass();
                        basicSettingView3.getClass();
                        paymentNotificationOptionsView.latestRingtonePreference = uriPreference6;
                        paymentNotificationOptionsView.latestRingtoneView = basicSettingView3;
                        Ui.EventReceiver eventReceiver4 = paymentNotificationOptionsView.eventReceiver;
                        if (eventReceiver4 != null) {
                            eventReceiver4.sendEvent(new PaymentNotificationOptionsViewEvent.PickRingtone(uriPreference6.get(), EmptyList.INSTANCE));
                            return;
                        } else {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                }
            }
        });
        NotificationOptionsView.updateRingtoneDescription$default(this, (BasicSettingView) bindView2.getValue(this, kPropertyArr[1]), uriPreference2);
        NotificationOptionsView.updateRingtoneDescription$default(this, (BasicSettingView) bindView3.getValue(this, kPropertyArr[2]), uriPreference3);
        NotificationOptionsView.updateRingtoneDescription$default(this, (BasicSettingView) bindView4.getValue(this, kPropertyArr[3]), uriPreference);
        getVibrateView$1().setChecked(booleanPreference.get());
        getVibrateView$1().setOnCheckedChangeListener(new Function2(this) { // from class: com.squareup.cash.profile.views.PaymentNotificationOptionsView$$ExternalSyntheticLambda4
            public final /* synthetic */ PaymentNotificationOptionsView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i5 = i2;
                PaymentNotificationOptionsView paymentNotificationOptionsView = this.f$0;
                CompoundButton compoundButton = (CompoundButton) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                switch (i5) {
                    case 0:
                        compoundButton.getClass();
                        paymentNotificationOptionsView.vibratePreference.set(booleanValue);
                        break;
                    default:
                        compoundButton.getClass();
                        paymentNotificationOptionsView.lightPreference.set(booleanValue);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        getVibrateView$1().setTitle(getResources().getString(R.string.notification_options_vibrate));
        getVibrateView$1().setTextHorizontalPadding(R.dimen.profile_item_padding_side);
        getLightView$1().setChecked(booleanPreference2.get());
        getLightView$1().setOnCheckedChangeListener(new Function2(this) { // from class: com.squareup.cash.profile.views.PaymentNotificationOptionsView$$ExternalSyntheticLambda4
            public final /* synthetic */ PaymentNotificationOptionsView f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i5 = i;
                PaymentNotificationOptionsView paymentNotificationOptionsView = this.f$0;
                CompoundButton compoundButton = (CompoundButton) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                switch (i5) {
                    case 0:
                        compoundButton.getClass();
                        paymentNotificationOptionsView.vibratePreference.set(booleanValue);
                        break;
                    default:
                        compoundButton.getClass();
                        paymentNotificationOptionsView.lightPreference.set(booleanValue);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        getLightView$1().setTitle(getResources().getString(R.string.notification_options_light));
        getLightView$1().setTextHorizontalPadding(R.dimen.profile_item_padding_side);
    }

    public final SwitchSettingView getLightView$1() {
        return (SwitchSettingView) this.lightView$delegate.getValue(this, $$delegatedProperties[5]);
    }

    public final SwitchSettingView getVibrateView$1() {
        return (SwitchSettingView) this.vibrateView$delegate.getValue(this, $$delegatedProperties[4]);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(Unit unit) {
        unit.getClass();
    }
}
