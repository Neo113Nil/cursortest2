package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class pkd extends AppWidgetProvider {
    public final dq7 a = ca8.a;

    public static final void a(pkd pkdVar, mm6 mm6Var, Context context) {
        x97.y(mm6Var, null, null, new fzb(context, pkdVar, (Continuation) null, 28), 3);
    }

    public abstract pv0 b();

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        xv7.A(this, this.a, new zy3(this, context, i, bundle, null, 2));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        xv7.A(this, this.a, new r72(this, context, iArr, (Continuation) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c A[Catch: all -> 0x0048, CancellationException -> 0x00ba, TryCatch #3 {CancellationException -> 0x00ba, all -> 0x0048, blocks: (B:21:0x0041, B:25:0x0052, B:26:0x005a, B:27:0x005b, B:28:0x0063, B:29:0x0064, B:32:0x00af, B:34:0x007a, B:36:0x008c, B:38:0x0097, B:39:0x00a3, B:41:0x009f, B:42:0x00a7, B:43:0x00ae, B:44:0x006f), top: B:4:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[Catch: all -> 0x0048, CancellationException -> 0x00ba, TryCatch #3 {CancellationException -> 0x00ba, all -> 0x0048, blocks: (B:21:0x0041, B:25:0x0052, B:26:0x005a, B:27:0x005b, B:28:0x0063, B:29:0x0064, B:32:0x00af, B:34:0x007a, B:36:0x008c, B:38:0x0097, B:39:0x00a3, B:41:0x009f, B:42:0x00a7, B:43:0x00ae, B:44:0x006f), top: B:4:0x0006 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        String action;
        Context context2;
        String canonicalName;
        int[] appWidgetIds;
        try {
            action = intent.getAction();
        } catch (CancellationException unused) {
            return;
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode == -19011148) {
                    context2 = context;
                    if (!action.equals("android.intent.action.LOCALE_CHANGED")) {
                        super.onReceive(context2, intent);
                    }
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context2);
                    String packageName = context2.getPackageName();
                    canonicalName = getClass().getCanonicalName();
                    if (canonicalName != null) {
                    }
                } else {
                    if (hashCode == 649033583) {
                        context2 = context;
                        if (!action.equals("androidx.glance.appwidget.action.DEBUG_UPDATE")) {
                            super.onReceive(context2, intent);
                        }
                        AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(context2);
                        String packageName2 = context2.getPackageName();
                        canonicalName = getClass().getCanonicalName();
                        if (canonicalName != null) {
                            throw new IllegalStateException("no canonical name");
                        }
                        ComponentName componentName = new ComponentName(packageName2, canonicalName);
                        if (intent.hasExtra("appWidgetIds")) {
                            appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                            appWidgetIds.getClass();
                        } else {
                            appWidgetIds = appWidgetManager2.getAppWidgetIds(componentName);
                        }
                        onUpdate(context2, appWidgetManager2, appWidgetIds);
                        return;
                    }
                    if (hashCode == 1989767543 && action.equals("ACTION_TRIGGER_LAMBDA")) {
                        String stringExtra = intent.getStringExtra("EXTRA_ACTION_KEY");
                        if (stringExtra == null) {
                            throw new IllegalStateException("Intent is missing ActionKey extra");
                        }
                        int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
                        if (intExtra == -1) {
                            throw new IllegalStateException("Intent is missing AppWidgetId extra");
                        }
                        xv7.A(this, this.a, new zy3(this, context, intExtra, stringExtra, null, 3));
                        return;
                    }
                }
            }
            context2 = context;
            super.onReceive(context2, intent);
        } catch (CancellationException unused2) {
        } catch (Throwable th2) {
            th = th2;
            Log.e("GlanceAppWidget", "Error in Glance App Widget", th);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        xv7.A(this, this.a, new d57(this, context, iArr, (Continuation) null, 22));
    }
}
