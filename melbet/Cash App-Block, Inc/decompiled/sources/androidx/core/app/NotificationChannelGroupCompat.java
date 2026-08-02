package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class NotificationChannelGroupCompat {
    public final List mChannels;
    public final String mDescription;
    public final String mId;
    public final CharSequence mName;

    public NotificationChannelGroupCompat(NotificationChannelGroup notificationChannelGroup) {
        List list = Collections.EMPTY_LIST;
        String id = notificationChannelGroup.getId();
        this.mChannels = list;
        id.getClass();
        this.mId = id;
        this.mName = notificationChannelGroup.getName();
        this.mDescription = notificationChannelGroup.getDescription();
        notificationChannelGroup.isBlocked();
        List<NotificationChannel> channels = notificationChannelGroup.getChannels();
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : channels) {
            if (this.mId.equals(notificationChannel.getGroup())) {
                arrayList.add(new NotificationChannelCompat(notificationChannel));
            }
        }
    }

    public final NotificationChannelGroup getNotificationChannelGroup() {
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(this.mId, this.mName);
        notificationChannelGroup.setDescription(this.mDescription);
        return notificationChannelGroup;
    }
}
