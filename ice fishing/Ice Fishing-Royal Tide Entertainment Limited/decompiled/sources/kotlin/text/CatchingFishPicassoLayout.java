package kotlin.text;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.catchingfish.fishcatcherpro.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class CatchingFishPicassoLayout {
    public final Notification CatchingFish;
    public CharSequence CatchingFishDaggerWebsocket;
    public CatchingFishManifestKtor CatchingFishEspressoTesting;
    public int CatchingFishFragmentHandler;
    public final ArrayList CatchingFishJetpackCompose;
    public int CatchingFishLayout;
    public final boolean CatchingFishNavigation;
    public final Context CatchingFishParcelableFAB;
    public String CatchingFishRoomDatabase;
    public Bundle CatchingFishUnitTesting;
    public IconCompat CatchingFishViewModelFAB;
    public PendingIntent CatchingFishViewModelScope;
    public CharSequence CatchingFishWorkManager;
    public final ArrayList CatchingFishSnackbar = new ArrayList();
    public final ArrayList CatchingFishCoroutine = new ArrayList();
    public final ArrayList CatchingFishReduxKtor = new ArrayList();
    public boolean CatchingFishCloudMessaging = true;
    public boolean CatchingFishOkHttp = false;
    public int CatchingFishAnimationMockk = 0;
    public int CatchingFishStateLiveData = 0;

    public CatchingFishPicassoLayout(Context context, String str) {
        Notification notification = new Notification();
        this.CatchingFish = notification;
        this.CatchingFishParcelableFAB = context;
        this.CatchingFishRoomDatabase = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.CatchingFishFragmentHandler = 0;
        this.CatchingFishJetpackCompose = new ArrayList();
        this.CatchingFishNavigation = true;
    }

    public static CharSequence CatchingFishSnackbar(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void CatchingFishCoroutine(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.CatchingFishParcelableFAB.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.CatchingFishCloudMessaging;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.CatchingFishSnackbar = bitmap;
            iconCompat = iconCompat2;
        }
        this.CatchingFishViewModelFAB = iconCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Notification CatchingFishParcelableFAB() {
        Bundle bundle;
        int i;
        ArrayList arrayList;
        int i2;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = new CatchingFishFluxFluxBundle();
        catchingFishFluxFluxBundle.CatchingFishViewModelScope = new Bundle();
        catchingFishFluxFluxBundle.CatchingFishWorkManager = this;
        Context context = this.CatchingFishParcelableFAB;
        catchingFishFluxFluxBundle.CatchingFishReduxKtor = context;
        if (Build.VERSION.SDK_INT >= 26) {
            catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket = CatchingFishJUnitMVVM.CatchingFishSnackbar(context, this.CatchingFishRoomDatabase);
        } else {
            catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket = new Notification.Builder(this.CatchingFishParcelableFAB);
        }
        Notification.Builder builder = (Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
        Notification notification = this.CatchingFish;
        Context context2 = null;
        int i3 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.CatchingFishDaggerWebsocket).setContentText(this.CatchingFishWorkManager).setContentInfo(null).setContentIntent(this.CatchingFishViewModelScope).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.CatchingFishLayout).setProgress(0, 0, false);
        Notification.Builder builder2 = (Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
        IconCompat iconCompat = this.CatchingFishViewModelFAB;
        builder2.setLargeIcon(iconCompat == null ? null : iconCompat.CatchingFishWorkManager(context));
        ((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).setSubText(null).setUsesChronometer(false).setPriority(this.CatchingFishFragmentHandler);
        ArrayList arrayList2 = this.CatchingFishSnackbar;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            CatchingFishDaggerAnimation catchingFishDaggerAnimation = (CatchingFishDaggerAnimation) obj;
            if (catchingFishDaggerAnimation.CatchingFishSnackbar == null && (i2 = catchingFishDaggerAnimation.CatchingFishDaggerWebsocket) != 0) {
                catchingFishDaggerAnimation.CatchingFishSnackbar = IconCompat.CatchingFishSnackbar(i2);
            }
            IconCompat iconCompat2 = catchingFishDaggerAnimation.CatchingFishSnackbar;
            boolean z = catchingFishDaggerAnimation.CatchingFishCoroutine;
            Bundle bundle2 = catchingFishDaggerAnimation.CatchingFishParcelableFAB;
            Notification.Action.Builder builder3 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.CatchingFishWorkManager(context2) : context2, catchingFishDaggerAnimation.CatchingFishWorkManager, catchingFishDaggerAnimation.CatchingFishViewModelScope);
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            bundle3.putBoolean("android.support.allowGeneratedReplies", z);
            int i5 = Build.VERSION.SDK_INT;
            builder3.setAllowGeneratedReplies(z);
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i5 >= 28) {
                CatchingFishRobolectricFlux.CatchingFishAnimationMockk(builder3);
            }
            if (i5 >= 29) {
                CatchingFishJUnitFlux.CatchingFishUnitTesting(builder3);
            }
            if (i5 >= 31) {
                CatchingFishPicassoIntent.CatchingFishParcelableFAB(builder3);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", catchingFishDaggerAnimation.CatchingFishReduxKtor);
            builder3.addExtras(bundle3);
            ((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).addAction(builder3.build());
            context2 = null;
        }
        Bundle bundle4 = this.CatchingFishUnitTesting;
        if (bundle4 != null) {
            ((Bundle) catchingFishFluxFluxBundle.CatchingFishViewModelScope).putAll(bundle4);
        }
        ((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).setShowWhen(this.CatchingFishCloudMessaging);
        ((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).setLocalOnly(this.CatchingFishOkHttp);
        ((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).setGroup(null);
        ((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).setSortKey(null);
        ((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).setGroupSummary(false);
        ((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).setCategory(null);
        ((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).setColor(this.CatchingFishAnimationMockk);
        ((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).setVisibility(this.CatchingFishStateLiveData);
        ((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).setPublicVersion(null);
        ((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).setSound(notification.sound, notification.audioAttributes);
        int i6 = Build.VERSION.SDK_INT;
        ArrayList arrayList3 = this.CatchingFishJetpackCompose;
        ArrayList arrayList4 = this.CatchingFishCoroutine;
        if (i6 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    CatchingFishRoomStateFlow catchingFishRoomStateFlow = new CatchingFishRoomStateFlow(arrayList3.size() + arrayList.size());
                    catchingFishRoomStateFlow.addAll(arrayList);
                    catchingFishRoomStateFlow.addAll(arrayList3);
                    arrayList3 = new ArrayList(catchingFishRoomStateFlow);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                ((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).addPerson((String) obj2);
            }
        }
        ArrayList arrayList5 = this.CatchingFishReduxKtor;
        if (arrayList5.size() > 0) {
            if (this.CatchingFishUnitTesting == null) {
                this.CatchingFishUnitTesting = new Bundle();
            }
            Bundle bundle5 = this.CatchingFishUnitTesting.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i8 = 0;
            while (i8 < arrayList5.size()) {
                String num = Integer.toString(i8);
                CatchingFishDaggerAnimation catchingFishDaggerAnimation2 = (CatchingFishDaggerAnimation) arrayList5.get(i8);
                Bundle bundle8 = new Bundle();
                if (catchingFishDaggerAnimation2.CatchingFishSnackbar == null && (i = catchingFishDaggerAnimation2.CatchingFishDaggerWebsocket) != 0) {
                    catchingFishDaggerAnimation2.CatchingFishSnackbar = IconCompat.CatchingFishSnackbar(i);
                }
                IconCompat iconCompat3 = catchingFishDaggerAnimation2.CatchingFishSnackbar;
                Bundle bundle9 = catchingFishDaggerAnimation2.CatchingFishParcelableFAB;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.CatchingFishCoroutine() : i3);
                bundle8.putCharSequence("title", catchingFishDaggerAnimation2.CatchingFishWorkManager);
                bundle8.putParcelable("actionIntent", catchingFishDaggerAnimation2.CatchingFishViewModelScope);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", catchingFishDaggerAnimation2.CatchingFishCoroutine);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", catchingFishDaggerAnimation2.CatchingFishReduxKtor);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i8++;
                i3 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.CatchingFishUnitTesting == null) {
                this.CatchingFishUnitTesting = new Bundle();
            }
            this.CatchingFishUnitTesting.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) catchingFishFluxFluxBundle.CatchingFishViewModelScope).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i9 = Build.VERSION.SDK_INT;
        ((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).setExtras(this.CatchingFishUnitTesting);
        ((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).setRemoteInputHistory(null);
        if (i9 >= 26) {
            CatchingFishJUnitMVVM.CatchingFishCloudMessaging((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket);
            CatchingFishJUnitMVVM.CatchingFishRoomDatabase((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket);
            CatchingFishJUnitMVVM.CatchingFishNavigation((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket);
            CatchingFishJUnitMVVM.CatchingFish((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket);
            CatchingFishJUnitMVVM.CatchingFishOkHttp((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket);
            if (!TextUtils.isEmpty(this.CatchingFishRoomDatabase)) {
                ((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i9 >= 28) {
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i9 >= 29) {
            CatchingFishJUnitFlux.CatchingFishEspressoTesting((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket, this.CatchingFishNavigation);
            CatchingFishJUnitFlux.CatchingFishOkHttp((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket);
        }
        if (i9 >= 36) {
            CatchingFishGoogleMaps.CatchingFishWorkManager((Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket);
        }
        CatchingFishPicassoLayout catchingFishPicassoLayout = (CatchingFishPicassoLayout) catchingFishFluxFluxBundle.CatchingFishWorkManager;
        CatchingFishManifestKtor catchingFishManifestKtor = catchingFishPicassoLayout.CatchingFishEspressoTesting;
        if (catchingFishManifestKtor != null) {
            catchingFishManifestKtor.CatchingFishParcelableFAB(catchingFishFluxFluxBundle);
        }
        Notification.Builder builder4 = (Notification.Builder) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket;
        Notification build = Build.VERSION.SDK_INT >= 26 ? builder4.build() : builder4.build();
        if (catchingFishManifestKtor != null) {
            catchingFishPicassoLayout.CatchingFishEspressoTesting.getClass();
        }
        if (catchingFishManifestKtor != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", catchingFishManifestKtor.CatchingFishCoroutine());
        }
        return build;
    }

    public final void CatchingFishReduxKtor(CatchingFishManifestKtor catchingFishManifestKtor) {
        if (this.CatchingFishEspressoTesting != catchingFishManifestKtor) {
            this.CatchingFishEspressoTesting = catchingFishManifestKtor;
            if (((CatchingFishPicassoLayout) catchingFishManifestKtor.CatchingFishParcelableFAB) != this) {
                catchingFishManifestKtor.CatchingFishParcelableFAB = this;
                CatchingFishReduxKtor(catchingFishManifestKtor);
            }
        }
    }
}
