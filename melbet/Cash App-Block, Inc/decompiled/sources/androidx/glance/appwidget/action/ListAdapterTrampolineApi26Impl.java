package androidx.glance.appwidget.action;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class ListAdapterTrampolineApi26Impl {
    public static final ListAdapterTrampolineApi26Impl INSTANCE = new ListAdapterTrampolineApi26Impl();

    public final void startForegroundService(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
