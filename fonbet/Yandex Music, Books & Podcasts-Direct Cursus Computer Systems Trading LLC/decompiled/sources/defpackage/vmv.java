package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes6.dex */
public final class vmv implements tmv {
    public final Context a;

    public vmv(Context context) {
        this.a = context;
    }

    public static final void a(vmv vmvVar, Class cls) {
        Context context = vmvVar.a;
        AppWidgetManager.getInstance(context).requestPinAppWidget(new ComponentName(context, (Class<?>) cls), null, null);
    }
}
