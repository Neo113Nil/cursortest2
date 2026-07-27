package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import j5.InterfaceC4598a;
import j5.b;
import java.util.ArrayList;
import java.util.List;
import k5.C4658a;

/* loaded from: classes2.dex */
public class DefaultBadger implements InterfaceC4598a {
    private static final String INTENT_ACTION = "android.intent.action.BADGE_COUNT_UPDATE";
    private static final String INTENT_EXTRA_ACTIVITY_NAME = "badge_count_class_name";
    private static final String INTENT_EXTRA_BADGE_COUNT = "badge_count";
    private static final String INTENT_EXTRA_PACKAGENAME = "badge_count_package_name";

    @Override // j5.InterfaceC4598a
    public void executeBadge(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent(INTENT_ACTION);
        intent.putExtra(INTENT_EXTRA_BADGE_COUNT, i);
        intent.putExtra(INTENT_EXTRA_PACKAGENAME, componentName.getPackageName());
        intent.putExtra(INTENT_EXTRA_ACTIVITY_NAME, componentName.getClassName());
        if (C4658a.canResolveBroadcast(context, intent)) {
            context.sendBroadcast(intent);
        } else {
            throw new b("unable to resolve intent: " + intent.toString());
        }
    }

    @Override // j5.InterfaceC4598a
    public List<String> getSupportLaunchers() {
        return new ArrayList(0);
    }

    public boolean isSupported(Context context) {
        return C4658a.canResolveBroadcast(context, new Intent(INTENT_ACTION));
    }
}
