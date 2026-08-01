package com.google.android.datatransport;

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
import com.icewinter.flow.winter.icecatch.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowViewProcess {
    public final ArrayList WinterFlowBatchUI;
    public String WinterFlowConcurrencyThread;
    public int WinterFlowResponseEngine;
    public IconCompat WinterFlowRouterRouter;
    public final Context WinterFlowRouterStructure;
    public WinterFlowPackageConsumer WinterFlowServerProtocol;
    public Bundle WinterFlowServiceUtility;
    public final boolean WinterFlowSingletonPlatform;
    public int WinterFlowSyntax;
    public CharSequence WinterFlowTransactionManagerStrategy;
    public PendingIntent WinterFlowUnitTestResponse;
    public final Notification WinterFlowVariableBandwidth;
    public CharSequence WinterFlowVariableVersionControl;
    public final ArrayList WinterFlowHookDataSource = new ArrayList();
    public final ArrayList WinterFlowCacheManagerAgent = new ArrayList();
    public final ArrayList WinterFlowArrayNetwork = new ArrayList();
    public boolean WinterFlowTransactionAgent = true;
    public boolean WinterFlowThreadListener = false;
    public int WinterFlowBandwidthObject = 0;
    public int WinterFlowOrchestrationSubsystem = 0;

    public WinterFlowViewProcess(Context context, String str) {
        Notification notification = new Notification();
        this.WinterFlowVariableBandwidth = notification;
        this.WinterFlowRouterStructure = context;
        this.WinterFlowConcurrencyThread = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.WinterFlowResponseEngine = 0;
        this.WinterFlowBatchUI = new ArrayList();
        this.WinterFlowSingletonPlatform = true;
    }

    public static CharSequence WinterFlowHookDataSource(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void WinterFlowArrayNetwork(WinterFlowPackageConsumer winterFlowPackageConsumer) {
        if (this.WinterFlowServerProtocol != winterFlowPackageConsumer) {
            this.WinterFlowServerProtocol = winterFlowPackageConsumer;
            if (((WinterFlowViewProcess) winterFlowPackageConsumer.WinterFlowRouterStructure) != this) {
                winterFlowPackageConsumer.WinterFlowRouterStructure = this;
                WinterFlowArrayNetwork(winterFlowPackageConsumer);
            }
        }
    }

    public final void WinterFlowCacheManagerAgent(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.WinterFlowRouterStructure.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.WinterFlowTransactionAgent;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.WinterFlowHookDataSource = bitmap;
            iconCompat = iconCompat2;
        }
        this.WinterFlowRouterRouter = iconCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Notification WinterFlowRouterStructure() {
        Bundle bundle;
        int i;
        ArrayList arrayList;
        int i2;
        WinterFlowStackProvider winterFlowStackProvider = new WinterFlowStackProvider();
        winterFlowStackProvider.WinterFlowRouterRouter = new Bundle();
        winterFlowStackProvider.WinterFlowUnitTestResponse = this;
        Context context = this.WinterFlowRouterStructure;
        winterFlowStackProvider.WinterFlowVariableVersionControl = context;
        Notification.Builder builder = new Notification.Builder(context, this.WinterFlowConcurrencyThread);
        winterFlowStackProvider.WinterFlowTransactionManagerStrategy = builder;
        Notification notification = this.WinterFlowVariableBandwidth;
        Context context2 = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.WinterFlowVariableVersionControl).setContentText(this.WinterFlowTransactionManagerStrategy).setContentInfo(null).setContentIntent(this.WinterFlowUnitTestResponse).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.WinterFlowSyntax).setProgress(0, 0, false);
        IconCompat iconCompat = this.WinterFlowRouterRouter;
        builder.setLargeIcon(iconCompat == null ? null : WinterFlowCloudStack.WinterFlowProxyStructure(iconCompat, context));
        builder.setSubText(null).setUsesChronometer(false).setPriority(this.WinterFlowResponseEngine);
        ArrayList arrayList2 = this.WinterFlowHookDataSource;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            WinterFlowRequestDataSource winterFlowRequestDataSource = (WinterFlowRequestDataSource) obj;
            IconCompat iconCompat2 = winterFlowRequestDataSource.WinterFlowHookDataSource;
            if (iconCompat2 == null && (i2 = winterFlowRequestDataSource.WinterFlowArrayNetwork) != 0) {
                iconCompat2 = IconCompat.WinterFlowRouterStructure(i2);
                winterFlowRequestDataSource.WinterFlowHookDataSource = iconCompat2;
            }
            Bundle bundle2 = winterFlowRequestDataSource.WinterFlowRouterStructure;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? WinterFlowCloudStack.WinterFlowProxyStructure(iconCompat2, context2) : context2, winterFlowRequestDataSource.WinterFlowVariableVersionControl, winterFlowRequestDataSource.WinterFlowTransactionManagerStrategy);
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putBoolean("android.support.allowGeneratedReplies", true);
            builder2.setAllowGeneratedReplies(true);
            bundle3.putInt("android.support.action.semanticAction", 0);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                WinterFlowQueueScheduler.WinterFlowTransactionAgent(builder2);
            }
            if (i4 >= 29) {
                WinterFlowBackendSubsystem.WinterFlowServerProtocol(builder2);
            }
            if (i4 >= 31) {
                WinterFlowProtocolDecorator.WinterFlowUnitTestResponse(builder2);
            }
            if (i4 >= 37) {
                WinterFlowProviderDeployment.WinterFlowRouterStructure(builder2);
                WinterFlowProviderDeployment.WinterFlowHookDataSource(builder2);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", winterFlowRequestDataSource.WinterFlowCacheManagerAgent);
            builder2.addExtras(bundle3);
            ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).addAction(builder2.build());
            context2 = null;
        }
        Bundle bundle4 = this.WinterFlowServiceUtility;
        if (bundle4 != null) {
            ((Bundle) winterFlowStackProvider.WinterFlowRouterRouter).putAll(bundle4);
        }
        ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setShowWhen(this.WinterFlowTransactionAgent);
        ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setLocalOnly(this.WinterFlowThreadListener);
        ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setGroup(null);
        ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setSortKey(null);
        ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setGroupSummary(false);
        ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setCategory(null);
        ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setColor(this.WinterFlowBandwidthObject);
        ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setVisibility(this.WinterFlowOrchestrationSubsystem);
        ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setPublicVersion(null);
        ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setSound(notification.sound, notification.audioAttributes);
        int i5 = Build.VERSION.SDK_INT;
        ArrayList arrayList3 = this.WinterFlowBatchUI;
        ArrayList arrayList4 = this.WinterFlowCacheManagerAgent;
        if (i5 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                    throw null;
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    WinterFlowRepositoryDatabase winterFlowRepositoryDatabase = new WinterFlowRepositoryDatabase(arrayList3.size() + arrayList.size());
                    winterFlowRepositoryDatabase.addAll(arrayList);
                    winterFlowRepositoryDatabase.addAll(arrayList3);
                    arrayList3 = new ArrayList(winterFlowRepositoryDatabase);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList3.get(i6);
                i6++;
                ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).addPerson((String) obj2);
            }
        }
        ArrayList arrayList5 = this.WinterFlowArrayNetwork;
        if (arrayList5.size() > 0) {
            Bundle bundle5 = this.WinterFlowServiceUtility;
            if (bundle5 == null) {
                bundle5 = new Bundle();
                this.WinterFlowServiceUtility = bundle5;
            }
            Bundle bundle6 = bundle5.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new Bundle();
            }
            Bundle bundle7 = new Bundle(bundle6);
            Bundle bundle8 = new Bundle();
            for (int i7 = 0; i7 < arrayList5.size(); i7++) {
                String num = Integer.toString(i7);
                WinterFlowRequestDataSource winterFlowRequestDataSource2 = (WinterFlowRequestDataSource) arrayList5.get(i7);
                Bundle bundle9 = new Bundle();
                IconCompat iconCompat3 = winterFlowRequestDataSource2.WinterFlowHookDataSource;
                if (iconCompat3 == null && (i = winterFlowRequestDataSource2.WinterFlowArrayNetwork) != 0) {
                    iconCompat3 = IconCompat.WinterFlowRouterStructure(i);
                    winterFlowRequestDataSource2.WinterFlowHookDataSource = iconCompat3;
                }
                Bundle bundle10 = winterFlowRequestDataSource2.WinterFlowRouterStructure;
                bundle9.putInt("icon", iconCompat3 != null ? iconCompat3.WinterFlowHookDataSource() : 0);
                bundle9.putCharSequence("title", winterFlowRequestDataSource2.WinterFlowVariableVersionControl);
                bundle9.putParcelable("actionIntent", winterFlowRequestDataSource2.WinterFlowTransactionManagerStrategy);
                Bundle bundle11 = new Bundle(bundle10);
                bundle11.putBoolean("android.support.allowGeneratedReplies", true);
                bundle9.putBundle("extras", bundle11);
                bundle9.putParcelableArray("remoteInputs", null);
                bundle9.putBoolean("showsUserInterface", winterFlowRequestDataSource2.WinterFlowCacheManagerAgent);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(num, bundle9);
            }
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            Bundle bundle12 = this.WinterFlowServiceUtility;
            if (bundle12 == null) {
                bundle12 = new Bundle();
                this.WinterFlowServiceUtility = bundle12;
            }
            bundle12.putBundle("android.car.EXTENSIONS", bundle6);
            ((Bundle) winterFlowStackProvider.WinterFlowRouterRouter).putBundle("android.car.EXTENSIONS", bundle7);
        }
        ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setExtras(this.WinterFlowServiceUtility);
        ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setRemoteInputHistory(null);
        ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setBadgeIconType(0);
        ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setSettingsText(null);
        ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setShortcutId(null);
        ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setTimeoutAfter(0L);
        ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(this.WinterFlowConcurrencyThread)) {
            ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                throw null;
            }
        }
        if (i8 >= 29) {
            WinterFlowBackendSubsystem.WinterFlowResponseEngine((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy, this.WinterFlowSingletonPlatform);
            WinterFlowBackendSubsystem.WinterFlowTransactionAgent((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy);
        }
        if (i8 >= 36) {
            WinterFlowHookNetwork.WinterFlowVariableVersionControl((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy);
        }
        WinterFlowViewProcess winterFlowViewProcess = (WinterFlowViewProcess) winterFlowStackProvider.WinterFlowUnitTestResponse;
        WinterFlowPackageConsumer winterFlowPackageConsumer = winterFlowViewProcess.WinterFlowServerProtocol;
        if (winterFlowPackageConsumer != null) {
            winterFlowPackageConsumer.WinterFlowCacheManagerAgent(winterFlowStackProvider);
        }
        Notification build = ((Notification.Builder) winterFlowStackProvider.WinterFlowTransactionManagerStrategy).build();
        if (winterFlowPackageConsumer != null) {
            winterFlowViewProcess.WinterFlowServerProtocol.getClass();
        }
        if (winterFlowPackageConsumer != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", winterFlowPackageConsumer.WinterFlowRouterRouter());
        }
        return build;
    }
}
