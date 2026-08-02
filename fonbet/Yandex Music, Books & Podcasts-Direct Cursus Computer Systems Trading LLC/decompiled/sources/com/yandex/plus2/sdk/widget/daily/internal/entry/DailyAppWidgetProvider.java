package com.yandex.plus2.sdk.widget.daily.internal.entry;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.os.Bundle;
import defpackage.ca8;
import defpackage.gld;
import defpackage.tf6;
import defpackage.x77;
import defpackage.x97;
import defpackage.xc;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class DailyAppWidgetProvider extends AppWidgetProvider {
    public static final /* synthetic */ int b = 0;
    public final tf6 a = gld.e(ca8.b);

    public final void a(Function2 function2) {
        x97.y(this.a, null, null, new x77(function2, null), 3);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        context.getClass();
        appWidgetManager.getClass();
        a(new xc(2, 12, null));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        context.getClass();
        a(new xc(2, 13, null));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        context.getClass();
        a(new xc(2, 14, null));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        a(new xc(2, 15, null));
    }
}
