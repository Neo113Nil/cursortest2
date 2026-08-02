package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import n5.InterfaceC4774a;

/* loaded from: classes2.dex */
public class ZukHomeBadger implements InterfaceC4774a {
    private final Uri CONTENT_URI = Uri.parse("content://com.android.badge/badge");

    @Override // n5.InterfaceC4774a
    @TargetApi(11)
    public void executeBadge(Context context, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.CONTENT_URI, "setAppBadgeCount", (String) null, bundle);
    }

    @Override // n5.InterfaceC4774a
    public List<String> getSupportLaunchers() {
        return Collections.singletonList("com.zui.launcher");
    }
}
