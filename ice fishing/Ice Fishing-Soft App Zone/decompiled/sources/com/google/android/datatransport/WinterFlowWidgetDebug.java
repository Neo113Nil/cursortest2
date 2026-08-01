package com.google.android.datatransport;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.GoogleApiActivity;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowWidgetDebug extends WinterFlowClassComponent {
    public WinterFlowConsumerStrategy WinterFlowHookDataSource;
    public static final Object WinterFlowCacheManagerAgent = new Object();
    public static final WinterFlowWidgetDebug WinterFlowArrayNetwork = new WinterFlowWidgetDebug();

    public static AlertDialog WinterFlowArrayNetwork(Activity activity, int i, WinterFlowCloudUtility winterFlowCloudUtility, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(WinterFlowFrameworkConcurrency.WinterFlowHookDataSource(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.icewinter.flow.winter.icecatch.R.string.common_google_play_services_enable_button) : resources.getString(com.icewinter.flow.winter.icecatch.R.string.common_google_play_services_update_button) : resources.getString(com.icewinter.flow.winter.icecatch.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, winterFlowCloudUtility);
        }
        String WinterFlowRouterStructure = WinterFlowFrameworkConcurrency.WinterFlowRouterStructure(activity, i);
        if (WinterFlowRouterStructure != null) {
            builder.setTitle(WinterFlowRouterStructure);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public static void WinterFlowUnitTestResponse(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                throw null;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        WinterFlowBandwidthHelper winterFlowBandwidthHelper = new WinterFlowBandwidthHelper();
        WinterFlowUnitTestLibrary.WinterFlowSingletonPlatform(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        winterFlowBandwidthHelper.WinterFlowVariableVersionControl = alertDialog;
        if (onCancelListener != null) {
            winterFlowBandwidthHelper.WinterFlowTransactionManagerStrategy = onCancelListener;
        }
        winterFlowBandwidthHelper.show(fragmentManager, str);
    }

    public final void WinterFlowCacheManagerAgent(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog WinterFlowArrayNetwork2 = WinterFlowArrayNetwork(googleApiActivity, i, new WinterFlowCloudUtility(super.WinterFlowRouterStructure(i, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (WinterFlowArrayNetwork2 == null) {
            return;
        }
        WinterFlowUnitTestResponse(googleApiActivity, WinterFlowArrayNetwork2, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void WinterFlowTransactionManagerStrategy(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        new IllegalArgumentException();
        if (i == 18) {
            new WinterFlowInvokerAlgorithm(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String WinterFlowVariableVersionControl = i == 6 ? WinterFlowFrameworkConcurrency.WinterFlowVariableVersionControl(context, "common_google_play_services_resolution_required_title") : WinterFlowFrameworkConcurrency.WinterFlowRouterStructure(context, i);
        if (WinterFlowVariableVersionControl == null) {
            WinterFlowVariableVersionControl = context.getResources().getString(com.icewinter.flow.winter.icecatch.R.string.common_google_play_services_notification_ticker);
        }
        String WinterFlowArrayNetwork2 = (i == 6 || i == 19) ? WinterFlowFrameworkConcurrency.WinterFlowArrayNetwork(context, "common_google_play_services_resolution_required_text", WinterFlowFrameworkConcurrency.WinterFlowCacheManagerAgent(context)) : WinterFlowFrameworkConcurrency.WinterFlowHookDataSource(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        WinterFlowUnitTestLibrary.WinterFlowConcurrencyThread(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        WinterFlowViewProcess winterFlowViewProcess = new WinterFlowViewProcess(context, null);
        winterFlowViewProcess.WinterFlowThreadListener = true;
        winterFlowViewProcess.WinterFlowVariableBandwidth.flags |= 16;
        winterFlowViewProcess.WinterFlowVariableVersionControl = WinterFlowViewProcess.WinterFlowHookDataSource(WinterFlowVariableVersionControl);
        WinterFlowConsumerCache winterFlowConsumerCache = new WinterFlowConsumerCache();
        winterFlowConsumerCache.WinterFlowHookDataSource = WinterFlowViewProcess.WinterFlowHookDataSource(WinterFlowArrayNetwork2);
        winterFlowViewProcess.WinterFlowArrayNetwork(winterFlowConsumerCache);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = WinterFlowInvokerComponent.WinterFlowBatchUI;
        if (bool == null) {
            bool = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            WinterFlowInvokerComponent.WinterFlowBatchUI = bool;
        }
        boolean booleanValue = bool.booleanValue();
        int i3 = R.drawable.stat_sys_warning;
        if (booleanValue) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            winterFlowViewProcess.WinterFlowVariableBandwidth.icon = i3;
            winterFlowViewProcess.WinterFlowResponseEngine = 2;
            if (WinterFlowInvokerComponent.WinterFlowTestingNode(context)) {
                winterFlowViewProcess.WinterFlowHookDataSource.add(new WinterFlowRequestDataSource(resources.getString(com.icewinter.flow.winter.icecatch.R.string.common_open_on_phone), pendingIntent));
            } else {
                winterFlowViewProcess.WinterFlowUnitTestResponse = pendingIntent;
            }
        } else {
            winterFlowViewProcess.WinterFlowVariableBandwidth.icon = R.drawable.stat_sys_warning;
            winterFlowViewProcess.WinterFlowVariableBandwidth.tickerText = WinterFlowViewProcess.WinterFlowHookDataSource(resources.getString(com.icewinter.flow.winter.icecatch.R.string.common_google_play_services_notification_ticker));
            winterFlowViewProcess.WinterFlowVariableBandwidth.when = System.currentTimeMillis();
            winterFlowViewProcess.WinterFlowUnitTestResponse = pendingIntent;
            winterFlowViewProcess.WinterFlowTransactionManagerStrategy = WinterFlowViewProcess.WinterFlowHookDataSource(WinterFlowArrayNetwork2);
        }
        synchronized (WinterFlowCacheManagerAgent) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.icewinter.flow.winter.icecatch.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        winterFlowViewProcess.WinterFlowConcurrencyThread = "com.google.android.gms.availability";
        Notification WinterFlowRouterStructure = winterFlowViewProcess.WinterFlowRouterStructure();
        if (i == 1 || i == 2 || i == 3) {
            WinterFlowEncryptionHandler.WinterFlowRouterStructure.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, WinterFlowRouterStructure);
    }

    public final void WinterFlowVariableVersionControl(Activity activity, WinterFlowMiddlewareVersion winterFlowMiddlewareVersion, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog WinterFlowArrayNetwork2 = WinterFlowArrayNetwork(activity, i, new WinterFlowCloudUtility(super.WinterFlowRouterStructure(i, activity, "d"), winterFlowMiddlewareVersion, 1), onCancelListener);
        if (WinterFlowArrayNetwork2 == null) {
            return;
        }
        WinterFlowUnitTestResponse(activity, WinterFlowArrayNetwork2, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
