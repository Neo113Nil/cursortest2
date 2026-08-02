package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.core.view.WindowCompat$Api35Impl;

/* loaded from: classes3.dex */
public final class NotificationChannelCompat {
    public final AudioAttributes mAudioAttributes;
    public final String mConversationId;
    public final String mDescription;
    public final String mGroupId;
    public final String mId;
    public final int mImportance;
    public final int mLightColor;
    public final boolean mLights;
    public final CharSequence mName;
    public final String mParentId;
    public final boolean mShowBadge;
    public final Uri mSound;
    public final boolean mVibrationEnabled;
    public final long[] mVibrationPattern;

    public NotificationChannelCompat(NotificationChannel notificationChannel) {
        String id = notificationChannel.getId();
        int importance = notificationChannel.getImportance();
        this.mShowBadge = true;
        this.mSound = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.mLightColor = 0;
        id.getClass();
        this.mId = id;
        this.mImportance = importance;
        this.mAudioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
        this.mName = notificationChannel.getName();
        this.mDescription = notificationChannel.getDescription();
        this.mGroupId = notificationChannel.getGroup();
        this.mShowBadge = notificationChannel.canShowBadge();
        this.mSound = notificationChannel.getSound();
        this.mAudioAttributes = notificationChannel.getAudioAttributes();
        this.mLights = notificationChannel.shouldShowLights();
        this.mLightColor = notificationChannel.getLightColor();
        this.mVibrationEnabled = notificationChannel.shouldVibrate();
        this.mVibrationPattern = notificationChannel.getVibrationPattern();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.mParentId = WindowCompat$Api35Impl.getParentChannelId(notificationChannel);
            this.mConversationId = WindowCompat$Api35Impl.getConversationId(notificationChannel);
        }
        notificationChannel.canBypassDnd();
        notificationChannel.getLockscreenVisibility();
        notificationChannel.canBubble();
        if (i >= 30) {
            WindowCompat$Api35Impl.isImportantConversation(notificationChannel);
        }
    }

    public final NotificationChannel getNotificationChannel() {
        String str;
        String str2;
        NotificationChannel notificationChannel = new NotificationChannel(this.mId, this.mName, this.mImportance);
        notificationChannel.setDescription(this.mDescription);
        notificationChannel.setGroup(this.mGroupId);
        notificationChannel.setShowBadge(this.mShowBadge);
        notificationChannel.setSound(this.mSound, this.mAudioAttributes);
        notificationChannel.enableLights(this.mLights);
        notificationChannel.setLightColor(this.mLightColor);
        notificationChannel.setVibrationPattern(this.mVibrationPattern);
        notificationChannel.enableVibration(this.mVibrationEnabled);
        if (Build.VERSION.SDK_INT >= 30 && (str = this.mParentId) != null && (str2 = this.mConversationId) != null) {
            WindowCompat$Api35Impl.setConversationId(notificationChannel, str, str2);
        }
        return notificationChannel;
    }
}
