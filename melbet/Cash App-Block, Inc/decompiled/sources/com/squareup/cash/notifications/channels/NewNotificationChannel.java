package com.squareup.cash.notifications.channels;

import androidx.compose.runtime.saveable.ListSaverKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NewNotificationChannel {
    public final NotificationChannelId id;
    public final String label;
    public final ListSaverKt soundType;

    public NewNotificationChannel(NotificationChannelId notificationChannelId, String str, int i) {
        ListSaverKt listSaverKt = (i & 16) != 0 ? NewNotificationChannel$SoundType$DeviceDefault.INSTANCE : NewNotificationChannel$SoundType$Silent.INSTANCE;
        notificationChannelId.getClass();
        str.getClass();
        this.id = notificationChannelId;
        this.label = str;
        this.soundType = listSaverKt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewNotificationChannel)) {
            return false;
        }
        NewNotificationChannel newNotificationChannel = (NewNotificationChannel) obj;
        return this.id == newNotificationChannel.id && Intrinsics.areEqual(this.label, newNotificationChannel.label) && this.soundType.equals(newNotificationChannel.soundType);
    }

    public final NotificationChannelId getId() {
        return this.id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final ListSaverKt getSoundType() {
        return this.soundType;
    }

    public final int hashCode() {
        return this.soundType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.label), 31, true), 31, true);
    }

    public final String toString() {
        return "NewNotificationChannel(id=" + this.id + ", label=" + this.label + ", lightsEnabled=true, vibrationEnabled=true, soundType=" + this.soundType + ")";
    }
}
