package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import j5.InterfaceC4598a;
import j5.b;
import java.util.Arrays;
import java.util.List;
import k5.C4658a;

/* loaded from: classes2.dex */
public class NewHtcHomeBadger implements InterfaceC4598a {
    public static final String COUNT = "count";
    public static final String EXTRA_COMPONENT = "com.htc.launcher.extra.COMPONENT";
    public static final String EXTRA_COUNT = "com.htc.launcher.extra.COUNT";
    public static final String INTENT_SET_NOTIFICATION = "com.htc.launcher.action.SET_NOTIFICATION";
    public static final String INTENT_UPDATE_SHORTCUT = "com.htc.launcher.action.UPDATE_SHORTCUT";
    public static final String PACKAGENAME = "packagename";

    @Override // j5.InterfaceC4598a
    public void executeBadge(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent(INTENT_SET_NOTIFICATION);
        intent.putExtra(EXTRA_COMPONENT, componentName.flattenToShortString());
        intent.putExtra(EXTRA_COUNT, i);
        Intent intent2 = new Intent(INTENT_UPDATE_SHORTCUT);
        intent2.putExtra(PACKAGENAME, componentName.getPackageName());
        intent2.putExtra(COUNT, i);
        if (C4658a.canResolveBroadcast(context, intent) || C4658a.canResolveBroadcast(context, intent2)) {
            context.sendBroadcast(intent);
            context.sendBroadcast(intent2);
        } else {
            throw new b("unable to resolve intent: " + intent2.toString());
        }
    }

    @Override // j5.InterfaceC4598a
    public List<String> getSupportLaunchers() {
        return Arrays.asList("com.htc.launcher");
    }
}
