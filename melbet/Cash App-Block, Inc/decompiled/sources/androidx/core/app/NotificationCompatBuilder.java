package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.view.DisplayCompat;
import androidx.navigationevent.NavigationEvent_androidKt;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {
    public final Notification.Builder mBuilder;
    public final NotificationCompat.Builder mBuilderCompat;
    public final Context mContext;
    public final Bundle mExtras = new Bundle();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    public NotificationCompatBuilder(NotificationCompat.Builder builder) {
        CharSequence[] charSequenceArr;
        Bundle[] bundleArr;
        this.mBuilderCompat = builder;
        Context context = builder.mContext;
        ArrayList arrayList = builder.mInvisibleActions;
        this.mContext = context;
        Notification.Builder builder2 = new Notification.Builder(context, builder.mChannelId);
        this.mBuilder = builder2;
        Notification notification = builder.mNotification;
        CharSequence[] charSequenceArr2 = null;
        builder2.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(null).setContentIntent(builder.mContentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(builder.mNumber).setProgress(builder.mProgressMax, 0, builder.mProgressIndeterminate);
        IconCompat iconCompat = builder.mLargeIcon;
        builder2.setLargeIcon(iconCompat == null ? null : iconCompat.toIcon(context));
        builder2.setSubText(builder.mSubText).setUsesChronometer(false).setPriority(builder.mPriority);
        Iterator it = builder.mActions.iterator();
        while (it.hasNext()) {
            NotificationCompat.Action action = (NotificationCompat.Action) it.next();
            IconCompat iconCompat2 = action.getIconCompat();
            boolean z = action.mAllowGeneratedReplies;
            Bundle bundle = action.mExtras;
            Notification.Action.Builder builder3 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.toIcon(null) : null, action.title, action.actionIntent);
            RemoteInput[] remoteInputArr = action.mRemoteInputs;
            if (remoteInputArr != null) {
                int length = remoteInputArr.length;
                android.app.RemoteInput[] remoteInputArr2 = new android.app.RemoteInput[length];
                if (remoteInputArr.length > 0) {
                    RemoteInput remoteInput = remoteInputArr[0];
                    throw null;
                }
                for (int i = 0; i < length; i++) {
                    builder3.addRemoteInput(remoteInputArr2[i]);
                }
            }
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder3.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", 0);
            builder3.setSemanticAction(0);
            builder3.setContextual(false);
            if (Build.VERSION.SDK_INT >= 31) {
                DisplayCompat.setAuthenticationRequired(builder3);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", action.mShowsUserInterface);
            builder3.addExtras(bundle2);
            this.mBuilder.addAction(builder3.build());
        }
        Bundle bundle3 = builder.mExtras;
        if (bundle3 != null) {
            this.mExtras.putAll(bundle3);
        }
        this.mBuilder.setShowWhen(builder.mShowWhen);
        this.mBuilder.setLocalOnly(builder.mLocalOnly);
        this.mBuilder.setGroup(builder.mGroupKey);
        this.mBuilder.setSortKey(null);
        this.mBuilder.setGroupSummary(builder.mGroupSummary);
        this.mBuilder.setCategory(builder.mCategory);
        this.mBuilder.setColor(builder.mColor);
        this.mBuilder.setVisibility(builder.mVisibility);
        this.mBuilder.setPublicVersion(builder.mPublicVersion);
        this.mBuilder.setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = builder.mPeople;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                this.mBuilder.addPerson((String) it2.next());
            }
        }
        if (arrayList.size() > 0) {
            if (builder.mExtras == null) {
                builder.mExtras = new Bundle();
            }
            Bundle bundle4 = builder.mExtras.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i2 = 0;
            while (i2 < arrayList.size()) {
                String num = Integer.toString(i2);
                NotificationCompat.Action action2 = (NotificationCompat.Action) arrayList.get(i2);
                Bundle bundle7 = new Bundle();
                IconCompat iconCompat3 = action2.getIconCompat();
                Bundle bundle8 = action2.mExtras;
                ?? r16 = charSequenceArr2;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.getResId() : 0);
                bundle7.putCharSequence("title", action2.title);
                bundle7.putParcelable("actionIntent", action2.actionIntent);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", action2.mAllowGeneratedReplies);
                bundle7.putBundle("extras", bundle9);
                RemoteInput[] remoteInputArr3 = action2.mRemoteInputs;
                if (remoteInputArr3 == null) {
                    bundleArr = r16;
                } else {
                    bundleArr = new Bundle[remoteInputArr3.length];
                    if (remoteInputArr3.length > 0) {
                        RemoteInput remoteInput2 = remoteInputArr3[0];
                        new Bundle();
                        throw r16;
                    }
                }
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", action2.mShowsUserInterface);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(num, bundle7);
                i2++;
                charSequenceArr2 = r16;
            }
            charSequenceArr = charSequenceArr2;
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (builder.mExtras == null) {
                builder.mExtras = new Bundle();
            }
            builder.mExtras.putBundle("android.car.EXTENSIONS", bundle4);
            this.mExtras.putBundle("android.car.EXTENSIONS", bundle5);
        } else {
            charSequenceArr = null;
        }
        this.mBuilder.setExtras(builder.mExtras);
        this.mBuilder.setRemoteInputHistory(charSequenceArr);
        RemoteViews remoteViews = builder.mContentView;
        if (remoteViews != null) {
            this.mBuilder.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = builder.mBigContentView;
        if (remoteViews2 != null) {
            this.mBuilder.setCustomBigContentView(remoteViews2);
        }
        this.mBuilder.setBadgeIconType(0);
        this.mBuilder.setSettingsText(null);
        this.mBuilder.setShortcutId(builder.mShortcutId);
        this.mBuilder.setTimeoutAfter(0L);
        this.mBuilder.setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(builder.mChannelId)) {
            this.mBuilder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it3 = builder.mPersonList.iterator();
        while (it3.hasNext()) {
            this.mBuilder.addPerson(((Person) it3.next()).toAndroidPerson());
        }
        this.mBuilder.setAllowSystemGeneratedContextualActions(builder.mAllowSystemGeneratedContextualActions);
        this.mBuilder.setBubbleMetadata(null);
        if (Build.VERSION.SDK_INT >= 36) {
            NavigationEvent_androidKt.setShortCriticalText(this.mBuilder);
        }
    }
}
