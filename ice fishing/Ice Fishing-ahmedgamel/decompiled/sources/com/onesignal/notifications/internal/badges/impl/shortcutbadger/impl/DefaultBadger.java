package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import n5.InterfaceC4758a;
import n5.b;
import o5.C4800a;

/* loaded from: classes2.dex */
public class DefaultBadger implements InterfaceC4758a {
    private static final String INTENT_ACTION = "android.intent.action.BADGE_COUNT_UPDATE";
    private static final String INTENT_EXTRA_ACTIVITY_NAME = "badge_count_class_name";
    private static final String INTENT_EXTRA_BADGE_COUNT = "badge_count";
    private static final String INTENT_EXTRA_PACKAGENAME = "badge_count_package_name";

    @Override // n5.InterfaceC4758a
    public void executeBadge(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent(INTENT_ACTION);
        intent.putExtra(INTENT_EXTRA_BADGE_COUNT, i);
        intent.putExtra(INTENT_EXTRA_PACKAGENAME, componentName.getPackageName());
        intent.putExtra(INTENT_EXTRA_ACTIVITY_NAME, componentName.getClassName());
        if (C4800a.canResolveBroadcast(context, intent)) {
            context.sendBroadcast(intent);
        } else {
            throw new b("unable to resolve intent: " + intent.toString());
        }
    }

    @Override // n5.InterfaceC4758a
    public List<String> getSupportLaunchers() {
        return new ArrayList(0);
    }

    public boolean isSupported(Context context) {
        return C4800a.canResolveBroadcast(context, new Intent(INTENT_ACTION));
    }
}
