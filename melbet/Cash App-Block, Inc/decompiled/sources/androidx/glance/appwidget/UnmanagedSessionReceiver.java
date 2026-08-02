package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.glance.appwidget.ContentReceiver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class UnmanagedSessionReceiver extends BroadcastReceiver {
    public static final ContentReceiver.Key Companion = new ContentReceiver.Key();
    public static final LinkedHashMap activeSessions = new LinkedHashMap();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Intrinsics.areEqual(intent.getAction(), "ACTION_TRIGGER_LAMBDA")) {
            if (intent.getStringExtra("EXTRA_ACTION_KEY") == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Intent is missing ActionKey extra");
                return;
            }
            int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
            if (intExtra == -1) {
                a$$ExternalSyntheticBUOutline0.m$1("Intent is missing AppWidgetId extra");
            } else {
                ContentReceiver.Key.getSession(intExtra);
                Log.e("GlanceAppWidget", "A lambda created by an unmanaged glance session cannot be servicedbecause that session is no longer running.");
            }
        }
    }
}
