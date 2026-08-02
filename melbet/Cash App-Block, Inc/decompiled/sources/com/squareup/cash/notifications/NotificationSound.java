package com.squareup.cash.notifications;

import android.net.Uri;
import com.squareup.cash.R;
import okio.ByteString;

/* loaded from: classes.dex */
public enum NotificationSound {
    CASH(Uri.parse("cash.sound://cash"), R.raw.notification_cash),
    BILL(Uri.parse("cash.sound://bill"), R.raw.notification_bill);

    public static final ByteString.Companion Companion = new ByteString.Companion();
    public final Uri persistedUri;
    public final int resId;

    NotificationSound(Uri uri, int i) {
        this.persistedUri = uri;
        this.resId = i;
    }
}
