package kotlin.text;

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

/* loaded from: classes.dex */
public final class CatchingFishAdMobAdMob extends CatchingFishFABKtor {
    public CatchingFishGlideToolbar CatchingFishCoroutine;
    public static final Object CatchingFishReduxKtor = new Object();
    public static final CatchingFishAdMobAdMob CatchingFishDaggerWebsocket = new CatchingFishAdMobAdMob();

    public static AlertDialog CatchingFishReduxKtor(Activity activity, int i, CatchingFishToolbarMoshi catchingFishToolbarMoshi, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(CatchingFishContextRetrofit.CatchingFishSnackbar(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.catchingfish.fishcatcherpro.R.string.common_google_play_services_enable_button) : resources.getString(com.catchingfish.fishcatcherpro.R.string.common_google_play_services_update_button) : resources.getString(com.catchingfish.fishcatcherpro.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, catchingFishToolbarMoshi);
        }
        String CatchingFishParcelableFAB = CatchingFishContextRetrofit.CatchingFishParcelableFAB(activity, i);
        if (CatchingFishParcelableFAB != null) {
            builder.setTitle(CatchingFishParcelableFAB);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public static void CatchingFishViewModelScope(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                CatchingFishToastSharedFlow catchingFishToastSharedFlow = ((CatchingFishMVIPicasso) ((FragmentActivity) activity).CatchingFishGsonAppCompat.CatchingFishDaggerWebsocket).CatchingFishSpannableWidget;
                CatchingFishFluxWidget catchingFishFluxWidget = new CatchingFishFluxWidget();
                CatchingFishToastHiltBundle.CatchingFishStateLiveData(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                catchingFishFluxWidget.CatchingFishRetrofitMVI = alertDialog;
                if (onCancelListener != null) {
                    catchingFishFluxWidget.CatchingFishGradleLiveData = onCancelListener;
                }
                catchingFishFluxWidget.CatchingFishReduxMoshi = false;
                catchingFishFluxWidget.CatchingFishPicasso = true;
                catchingFishToastSharedFlow.getClass();
                CatchingFishCameraXEspresso catchingFishCameraXEspresso = new CatchingFishCameraXEspresso(catchingFishToastSharedFlow);
                catchingFishCameraXEspresso.CatchingFishAnimationMockk = true;
                catchingFishCameraXEspresso.CatchingFishDaggerWebsocket(0, catchingFishFluxWidget, str, 1);
                catchingFishCameraXEspresso.CatchingFishReduxKtor(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        CatchingFishMockkBundle catchingFishMockkBundle = new CatchingFishMockkBundle();
        CatchingFishToastHiltBundle.CatchingFishStateLiveData(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        catchingFishMockkBundle.CatchingFishReduxKtor = alertDialog;
        if (onCancelListener != null) {
            catchingFishMockkBundle.CatchingFishDaggerWebsocket = onCancelListener;
        }
        catchingFishMockkBundle.show(fragmentManager, str);
    }

    public final void CatchingFishCoroutine(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog CatchingFishReduxKtor2 = CatchingFishReduxKtor(googleApiActivity, i, new CatchingFishToolbarMoshi(super.CatchingFishParcelableFAB(i, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (CatchingFishReduxKtor2 == null) {
            return;
        }
        CatchingFishViewModelScope(googleApiActivity, CatchingFishReduxKtor2, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void CatchingFishDaggerWebsocket(Activity activity, CatchingFishWebsocketPayPal catchingFishWebsocketPayPal, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog CatchingFishReduxKtor2 = CatchingFishReduxKtor(activity, i, new CatchingFishToolbarMoshi(super.CatchingFishParcelableFAB(i, activity, "d"), catchingFishWebsocketPayPal, 1), onCancelListener);
        if (CatchingFishReduxKtor2 == null) {
            return;
        }
        CatchingFishViewModelScope(activity, CatchingFishReduxKtor2, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void CatchingFishWorkManager(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        NotificationChannel notificationChannel;
        CharSequence name;
        new IllegalArgumentException();
        if (i == 18) {
            new CatchingFishRoomFAB(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String CatchingFishDaggerWebsocket2 = i == 6 ? CatchingFishContextRetrofit.CatchingFishDaggerWebsocket(context, "common_google_play_services_resolution_required_title") : CatchingFishContextRetrofit.CatchingFishParcelableFAB(context, i);
        if (CatchingFishDaggerWebsocket2 == null) {
            CatchingFishDaggerWebsocket2 = context.getResources().getString(com.catchingfish.fishcatcherpro.R.string.common_google_play_services_notification_ticker);
        }
        String CatchingFishReduxKtor2 = (i == 6 || i == 19) ? CatchingFishContextRetrofit.CatchingFishReduxKtor(context, "common_google_play_services_resolution_required_text", CatchingFishContextRetrofit.CatchingFishCoroutine(context)) : CatchingFishContextRetrofit.CatchingFishSnackbar(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        CatchingFishToastHiltBundle.CatchingFishAnimationMockk(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        CatchingFishPicassoLayout catchingFishPicassoLayout = new CatchingFishPicassoLayout(context, null);
        catchingFishPicassoLayout.CatchingFishOkHttp = true;
        catchingFishPicassoLayout.CatchingFish.flags |= 16;
        catchingFishPicassoLayout.CatchingFishDaggerWebsocket = CatchingFishPicassoLayout.CatchingFishSnackbar(CatchingFishDaggerWebsocket2);
        CatchingFishGraphQLRoom catchingFishGraphQLRoom = new CatchingFishGraphQLRoom();
        catchingFishGraphQLRoom.CatchingFishSnackbar = CatchingFishPicassoLayout.CatchingFishSnackbar(CatchingFishReduxKtor2);
        catchingFishPicassoLayout.CatchingFishReduxKtor(catchingFishGraphQLRoom);
        PackageManager packageManager = context.getPackageManager();
        if (CatchingFishFirebaseDagger.CatchingFishRoomDatabase == null) {
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean booleanValue = CatchingFishFirebaseDagger.CatchingFishRoomDatabase.booleanValue();
        int i3 = R.drawable.stat_sys_warning;
        if (booleanValue) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            catchingFishPicassoLayout.CatchingFish.icon = i3;
            catchingFishPicassoLayout.CatchingFishFragmentHandler = 2;
            if (CatchingFishFirebaseDagger.CatchingFishEspressoMockk(context)) {
                catchingFishPicassoLayout.CatchingFishSnackbar.add(new CatchingFishDaggerAnimation(resources.getString(com.catchingfish.fishcatcherpro.R.string.common_open_on_phone), pendingIntent));
            } else {
                catchingFishPicassoLayout.CatchingFishViewModelScope = pendingIntent;
            }
        } else {
            catchingFishPicassoLayout.CatchingFish.icon = R.drawable.stat_sys_warning;
            catchingFishPicassoLayout.CatchingFish.tickerText = CatchingFishPicassoLayout.CatchingFishSnackbar(resources.getString(com.catchingfish.fishcatcherpro.R.string.common_google_play_services_notification_ticker));
            catchingFishPicassoLayout.CatchingFish.when = System.currentTimeMillis();
            catchingFishPicassoLayout.CatchingFishViewModelScope = pendingIntent;
            catchingFishPicassoLayout.CatchingFishWorkManager = CatchingFishPicassoLayout.CatchingFishSnackbar(CatchingFishReduxKtor2);
        }
        if (CatchingFishHiltMVPToast.CatchingFishSpannableWidget()) {
            if (!CatchingFishHiltMVPToast.CatchingFishSpannableWidget()) {
                throw new IllegalStateException();
            }
            synchronized (CatchingFishReduxKtor) {
            }
            notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.catchingfish.fishcatcherpro.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(CatchingFishLifecycleJUnit.CatchingFishMVPRobolectric(string));
            } else {
                name = notificationChannel.getName();
                if (!string.contentEquals(name)) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            catchingFishPicassoLayout.CatchingFishRoomDatabase = "com.google.android.gms.availability";
        }
        Notification CatchingFishParcelableFAB = catchingFishPicassoLayout.CatchingFishParcelableFAB();
        if (i == 1 || i == 2 || i == 3) {
            CatchingFishFluxParcelable.CatchingFishParcelableFAB.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, CatchingFishParcelableFAB);
    }
}
