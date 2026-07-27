package kotlin.text;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.service.notification.StatusBarNotification;
import androidx.browser.trusted.TrustedWebActivityService;

/* loaded from: classes.dex */
public final class CatchingFishMVIAdMobToast extends Binder implements CatchingFishDaggerFragment {
    public final /* synthetic */ TrustedWebActivityService CatchingFishEspressoTesting;

    public CatchingFishMVIAdMobToast(TrustedWebActivityService trustedWebActivityService) {
        this.CatchingFishEspressoTesting = trustedWebActivityService;
        attachInterface(this, CatchingFishDaggerFragment.CatchingFishLayout);
    }

    public final void CatchingFishParcelableFAB() {
        TrustedWebActivityService trustedWebActivityService = this.CatchingFishEspressoTesting;
        int i = trustedWebActivityService.CatchingFishDaggerWebsocket;
        if (i != -1) {
            if (i != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        } else {
            trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            trustedWebActivityService.CatchingFishSnackbar();
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
    
        r11 = r9.CatchingFishReduxKtor.getNotificationChannel(androidx.browser.trusted.TrustedWebActivityService.CatchingFishParcelableFAB(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        if (r11 != 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01a1, code lost:
    
        if (r11 != 0) goto L79;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        NotificationChannel notificationChannel;
        int importance;
        NotificationChannel notificationChannel2;
        int importance2;
        NotificationChannel notificationChannel3;
        int importance3;
        IInterface queryLocalInterface;
        String str = CatchingFishDaggerFragment.CatchingFishLayout;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        boolean z = false;
        Notification notification = null;
        TrustedWebActivityService trustedWebActivityService = this.CatchingFishEspressoTesting;
        switch (i) {
            case 2:
                Bundle bundle = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                CatchingFishParcelableFAB();
                CatchingFishHiltMVPToast.CatchingFishCloudMessaging("android.support.customtabs.trusted.PLATFORM_TAG", bundle);
                CatchingFishHiltMVPToast.CatchingFishCloudMessaging("android.support.customtabs.trusted.PLATFORM_ID", bundle);
                CatchingFishHiltMVPToast.CatchingFishCloudMessaging("android.support.customtabs.trusted.NOTIFICATION", bundle);
                CatchingFishHiltMVPToast.CatchingFishCloudMessaging("android.support.customtabs.trusted.CHANNEL_NAME", bundle);
                String string = bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG");
                int i3 = bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID");
                Notification notification2 = (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION");
                String string2 = bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME");
                if (trustedWebActivityService.CatchingFishReduxKtor == null) {
                    throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
                }
                if (new CatchingFishToastStripeAPI(trustedWebActivityService).CatchingFishParcelableFAB.areNotificationsEnabled()) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        String CatchingFishParcelableFAB = TrustedWebActivityService.CatchingFishParcelableFAB(string2);
                        NotificationManager notificationManager = trustedWebActivityService.CatchingFishReduxKtor;
                        notificationManager.createNotificationChannel(CatchingFishLifecycleJUnit.CatchingFishDaggerWebsocket(CatchingFishParcelableFAB, string2));
                        notificationChannel = notificationManager.getNotificationChannel(CatchingFishParcelableFAB);
                        importance = notificationChannel.getImportance();
                        if (importance != 0) {
                            Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(trustedWebActivityService, notification2);
                            recoverBuilder.setChannelId(CatchingFishParcelableFAB);
                            notification = recoverBuilder.build();
                        }
                        notificationChannel2 = trustedWebActivityService.CatchingFishReduxKtor.getNotificationChannel(CatchingFishParcelableFAB);
                        if (notificationChannel2 != null) {
                            importance2 = notificationChannel2.getImportance();
                            break;
                        }
                        notification2 = notification;
                    }
                    trustedWebActivityService.CatchingFishReduxKtor.notify(string, i3, notification2);
                    z = true;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", z);
                parcel2.writeNoException();
                parcel2.writeTypedObject(bundle2, 1);
                return true;
            case 3:
                Bundle bundle3 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                CatchingFishParcelableFAB();
                CatchingFishHiltMVPToast.CatchingFishCloudMessaging("android.support.customtabs.trusted.PLATFORM_TAG", bundle3);
                CatchingFishHiltMVPToast.CatchingFishCloudMessaging("android.support.customtabs.trusted.PLATFORM_ID", bundle3);
                String string3 = bundle3.getString("android.support.customtabs.trusted.PLATFORM_TAG");
                int i4 = bundle3.getInt("android.support.customtabs.trusted.PLATFORM_ID");
                NotificationManager notificationManager2 = trustedWebActivityService.CatchingFishReduxKtor;
                if (notificationManager2 == null) {
                    throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
                }
                notificationManager2.cancel(string3, i4);
                parcel2.writeNoException();
                return true;
            case 4:
                CatchingFishParcelableFAB();
                int CatchingFishCoroutine = trustedWebActivityService.CatchingFishCoroutine();
                parcel2.writeNoException();
                parcel2.writeInt(CatchingFishCoroutine);
                return true;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                CatchingFishParcelableFAB();
                NotificationManager notificationManager3 = trustedWebActivityService.CatchingFishReduxKtor;
                if (notificationManager3 == null) {
                    throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
                }
                StatusBarNotification[] activeNotifications = notificationManager3.getActiveNotifications();
                Bundle bundle4 = new Bundle();
                bundle4.putParcelableArray("android.support.customtabs.trusted.ACTIVE_NOTIFICATIONS", activeNotifications);
                parcel2.writeNoException();
                parcel2.writeTypedObject(bundle4, 1);
                return true;
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
                Bundle bundle5 = (Bundle) parcel.readTypedObject(Bundle.CREATOR);
                CatchingFishParcelableFAB();
                CatchingFishHiltMVPToast.CatchingFishCloudMessaging("android.support.customtabs.trusted.CHANNEL_NAME", bundle5);
                String string4 = bundle5.getString("android.support.customtabs.trusted.CHANNEL_NAME");
                if (trustedWebActivityService.CatchingFishReduxKtor == null) {
                    throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
                }
                if (new CatchingFishToastStripeAPI(trustedWebActivityService).CatchingFishParcelableFAB.areNotificationsEnabled()) {
                    if (Build.VERSION.SDK_INT >= 26 && notificationChannel3 != null) {
                        importance3 = notificationChannel3.getImportance();
                        break;
                    }
                    z = true;
                }
                Bundle bundle6 = new Bundle();
                bundle6.putBoolean("android.support.customtabs.trusted.NOTIFICATION_SUCCESS", z);
                parcel2.writeNoException();
                parcel2.writeTypedObject(bundle6, 1);
                return true;
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                CatchingFishParcelableFAB();
                int CatchingFishCoroutine2 = trustedWebActivityService.CatchingFishCoroutine();
                Bundle bundle7 = new Bundle();
                if (CatchingFishCoroutine2 != -1) {
                    bundle7.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(trustedWebActivityService.getResources(), CatchingFishCoroutine2));
                }
                parcel2.writeNoException();
                parcel2.writeTypedObject(bundle7, 1);
                return true;
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 9:
                parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                CatchingFishParcelableFAB();
                if (readStrongBinder != null && (queryLocalInterface = readStrongBinder.queryLocalInterface(CatchingFishToolbarHilt.CatchingFishViewModelFAB)) != null && (queryLocalInterface instanceof CatchingFishToolbarHilt)) {
                }
                parcel2.writeNoException();
                parcel2.writeTypedObject(null, 1);
                return true;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
