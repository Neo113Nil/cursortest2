package io.appmetrica.analytics.push.intent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.push.impl.H2;

/* loaded from: classes4.dex */
public class NotificationActionInfo implements Parcelable {
    public static final Parcelable.Creator<NotificationActionInfo> CREATOR = new a();
    public final String actionId;
    public final NotificationActionType actionType;
    public final String channelId;
    public final boolean dismissOnAdditionalAction;
    public final boolean doNothing;
    public final boolean explicitIntent;
    public final Bundle extraBundle;
    public final long hideAfterSeconds;
    public final boolean hideQuickControlPanel;
    public final int notificationId;
    public final String notificationTag;
    public final String payload;
    public final String pushId;
    public final String targetActionUri;
    public final String transport;
    public final boolean useFlagActivityNewTask;

    private NotificationActionInfo(Parcel parcel) {
        this.pushId = parcel.readString();
        this.targetActionUri = parcel.readString();
        this.payload = parcel.readString();
        this.actionType = NotificationActionType.from(parcel.readString());
        this.actionId = parcel.readString();
        this.notificationTag = parcel.readString();
        this.notificationId = parcel.readInt();
        this.channelId = parcel.readString();
        this.hideQuickControlPanel = a(parcel);
        this.dismissOnAdditionalAction = a(parcel);
        this.extraBundle = parcel.readBundle(getClass().getClassLoader());
        this.explicitIntent = a(parcel);
        this.doNothing = a(parcel);
        this.hideAfterSeconds = parcel.readLong();
        this.transport = (String) H2.a(parcel.readString());
        this.useFlagActivityNewTask = a(parcel);
    }

    private static boolean a(Parcel parcel) {
        return parcel.readInt() == 1;
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pushId);
        parcel.writeString(this.targetActionUri);
        parcel.writeString(this.payload);
        NotificationActionType notificationActionType = this.actionType;
        parcel.writeString(notificationActionType == null ? null : notificationActionType.getType());
        parcel.writeString(this.actionId);
        parcel.writeString(this.notificationTag);
        parcel.writeInt(this.notificationId);
        parcel.writeString(this.channelId);
        parcel.writeInt(this.hideQuickControlPanel ? 1 : 0);
        parcel.writeInt(this.dismissOnAdditionalAction ? 1 : 0);
        parcel.writeBundle(this.extraBundle);
        parcel.writeInt(this.explicitIntent ? 1 : 0);
        parcel.writeInt(this.doNothing ? 1 : 0);
        parcel.writeLong(this.hideAfterSeconds);
        parcel.writeString(this.transport);
        parcel.writeInt(this.useFlagActivityNewTask ? 1 : 0);
    }

    public static class Builder {
        private final String a;
        private String b;
        private String c;
        private String d;
        private NotificationActionType e;
        private String f;
        private String g;
        private int h;
        private long i;
        private String j;
        private boolean k;
        private boolean l;
        private Bundle m;
        private boolean n;
        private boolean o;
        private boolean p;

        private Builder(String str) {
            this.h = 0;
            this.i = 0L;
            this.k = false;
            this.l = false;
            this.o = false;
            this.p = false;
            this.a = str;
        }

        public NotificationActionInfo build() {
            return new NotificationActionInfo(this, 0);
        }

        public Builder withActionId(String str) {
            this.f = str;
            return this;
        }

        public Builder withActionType(NotificationActionType notificationActionType) {
            this.e = notificationActionType;
            return this;
        }

        public Builder withChannelId(String str) {
            this.j = str;
            return this;
        }

        public Builder withDismissOnAdditionalAction(boolean z) {
            this.l = z;
            return this;
        }

        public Builder withDoNothing(boolean z) {
            this.o = z;
            return this;
        }

        public Builder withExplicitIntent(boolean z) {
            this.n = z;
            return this;
        }

        public Builder withExtraBundle(Bundle bundle) {
            this.m = bundle == null ? null : new Bundle(bundle);
            return this;
        }

        public Builder withHideAfterSeconds(long j) {
            this.i = j;
            return this;
        }

        public Builder withHideQuickControlPanel(boolean z) {
            this.k = z;
            return this;
        }

        public Builder withNotificationId(int i) {
            this.h = i;
            return this;
        }

        public Builder withNotificationTag(String str) {
            this.g = str;
            return this;
        }

        public Builder withPayload(String str) {
            this.d = str;
            return this;
        }

        public Builder withPushId(String str) {
            this.b = str;
            return this;
        }

        public Builder withTargetActionUri(String str) {
            this.c = str;
            return this;
        }

        public Builder withUseFlagActivityNewTask(boolean z) {
            this.p = z;
            return this;
        }

        public /* synthetic */ Builder(String str, int i) {
            this(str);
        }
    }

    public /* synthetic */ NotificationActionInfo(Builder builder, int i) {
        this(builder);
    }

    private NotificationActionInfo(Builder builder) {
        this.transport = builder.a;
        this.pushId = builder.b;
        this.targetActionUri = builder.c;
        this.payload = builder.d;
        this.actionType = builder.e;
        this.actionId = builder.f;
        this.notificationTag = builder.g;
        this.notificationId = builder.h;
        this.channelId = builder.j;
        this.hideQuickControlPanel = builder.k;
        this.dismissOnAdditionalAction = builder.l;
        this.extraBundle = builder.m;
        this.explicitIntent = builder.n;
        this.doNothing = builder.o;
        this.hideAfterSeconds = builder.i;
        this.useFlagActivityNewTask = builder.p;
    }

    public /* synthetic */ NotificationActionInfo(Parcel parcel, int i) {
        this(parcel);
    }
}
