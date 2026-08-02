package com.squareup.cash.notifications.intents;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.play.integrity.internal.ax;
import com.squareup.cash.ui.MainActivity;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.util.android.RealIntentFactory;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class RealNotificationIntentsCreator {
    public final ax analyticsEventIntentFactory;
    public final Function1 clientRouteFormatter;
    public final AndroidClock clock;
    public final Context context;
    public final RealIntentFactory intentFactory;

    public RealNotificationIntentsCreator(ax axVar, RealIntentFactory realIntentFactory, AndroidClock androidClock, Function1 function1, Context context) {
        this.analyticsEventIntentFactory = axVar;
        this.intentFactory = realIntentFactory;
        this.clock = androidClock;
        this.clientRouteFormatter = function1;
        this.context = context;
    }

    public static Intent createInternalIntent$default(RealNotificationIntentsCreator realNotificationIntentsCreator, String str) {
        realNotificationIntentsCreator.getClass();
        Intent intent = new Intent(realNotificationIntentsCreator.context, (Class<?>) MainActivity.class);
        if (str != null) {
            intent.setData(Uri.fromParts("id", str, null));
        }
        return intent;
    }
}
