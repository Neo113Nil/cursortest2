package androidx.glance.appwidget;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AppWidgetId {
    public final int appWidgetId;

    public AppWidgetId(int i) {
        this.appWidgetId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppWidgetId) && this.appWidgetId == ((AppWidgetId) obj).appWidgetId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.appWidgetId);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("AppWidgetId(appWidgetId="), this.appWidgetId, ')');
    }
}
