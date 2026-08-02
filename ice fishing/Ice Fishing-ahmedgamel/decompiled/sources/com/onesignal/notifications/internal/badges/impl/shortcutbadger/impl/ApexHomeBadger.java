package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import n5.InterfaceC4774a;
import n5.b;
import o5.C4804a;

/* loaded from: classes2.dex */
public class ApexHomeBadger implements InterfaceC4774a {
    private static final String CLASS = "class";
    private static final String COUNT = "count";
    private static final String INTENT_UPDATE_COUNTER = "com.anddoes.launcher.COUNTER_CHANGED";
    private static final String PACKAGENAME = "package";

    @Override // n5.InterfaceC4774a
    public void executeBadge(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent(INTENT_UPDATE_COUNTER);
        intent.putExtra(PACKAGENAME, componentName.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra(CLASS, componentName.getClassName());
        if (C4804a.canResolveBroadcast(context, intent)) {
            context.sendBroadcast(intent);
        } else {
            throw new b("unable to resolve intent: " + intent.toString());
        }
    }

    @Override // n5.InterfaceC4774a
    public List<String> getSupportLaunchers() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
