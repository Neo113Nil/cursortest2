package com.squareup.cash.profile.views;

import android.net.Uri;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import androidx.camera.video.VideoCapture;
import androidx.core.view.WindowCompat$Api35Impl;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.R;
import com.squareup.cash.notifications.NotificationSound;
import com.squareup.cash.profile.viewmodels.RingtoneResult;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.DialogResultListener;
import com.squareup.cash.ui.InsetsCollector;
import com.squareup.preferences.UriPreference;
import com.squareup.util.android.coroutines.ViewKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes7.dex */
public abstract class NotificationOptionsView extends LinearLayout implements DialogResultListener {
    public UriPreference latestRingtonePreference;
    public BasicSettingView latestRingtoneView;

    public NotificationOptionsView(ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, null);
        WindowInsets windowInsets = InsetsCollector.CONSUMED;
        WindowCompat$Api35Impl.attachedTo(this).setInsetsDispatcher(new VideoCapture.AnonymousClass3((View) this, true, (AlertBannerKt$$ExternalSyntheticLambda3) null));
    }

    public static void updateRingtoneDescription$default(NotificationOptionsView notificationOptionsView, BasicSettingView basicSettingView, UriPreference uriPreference) {
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        notificationOptionsView.updateRingtoneDescription(basicSettingView, uriPreference, DefaultIoScheduler.INSTANCE);
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogCanceled(Screen screen) {
        screen.getClass();
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogResult(Screen screen, Object obj) {
        screen.getClass();
        if (obj != null) {
            UriPreference uriPreference = this.latestRingtonePreference;
            uriPreference.getClass();
            uriPreference.set(((RingtoneResult) obj).ringtoneUri);
            BasicSettingView basicSettingView = this.latestRingtoneView;
            basicSettingView.getClass();
            UriPreference uriPreference2 = this.latestRingtonePreference;
            uriPreference2.getClass();
            updateRingtoneDescription$default(this, basicSettingView, uriPreference2);
        }
    }

    public final void updateRingtoneDescription(BasicSettingView basicSettingView, UriPreference uriPreference, CoroutineContext coroutineContext) {
        NotificationSound notificationSound;
        basicSettingView.getClass();
        uriPreference.getClass();
        coroutineContext.getClass();
        Uri uri = uriPreference.get();
        NotificationSound.Companion.getClass();
        NotificationSound notificationSound2 = NotificationSound.CASH;
        if (Intrinsics.areEqual(uri, notificationSound2.persistedUri)) {
            notificationSound = notificationSound2;
        } else {
            notificationSound = NotificationSound.BILL;
            if (!Intrinsics.areEqual(uri, notificationSound.persistedUri)) {
                notificationSound = null;
            }
        }
        if (notificationSound == notificationSound2) {
            basicSettingView.setDescription(R.string.ringtone_item_cash);
        } else if (notificationSound == NotificationSound.BILL) {
            basicSettingView.setDescription(R.string.ringtone_item_bill);
        } else {
            ViewKt.whileEachAttached(this, EmptyCoroutineContext.INSTANCE, new RealQrCodesPresenter$models$1$1(coroutineContext, uri, this, basicSettingView, null, 10));
        }
    }
}
