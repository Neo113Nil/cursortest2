package androidx.glance.appwidget;

import android.widget.RemoteViews;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class UtilsKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.SwitchAccountFromFlow.deepLinkSpecs;
    }

    public static final int inflateViewStub(RemoteViews remoteViews, TranslationContext translationContext, int i, int i2, Integer num) {
        if (i == -1) {
            a$$ExternalSyntheticBUOutline0.m$3("viewStubId must not be View.NO_ID");
            return 0;
        }
        int intValue = num != null ? num.intValue() : translationContext.lastViewId.incrementAndGet();
        if (intValue != -1) {
            remoteViews.setInt(i, "setInflatedId", intValue);
        }
        if (i2 != 0) {
            remoteViews.setInt(i, "setLayoutResource", i2);
        }
        remoteViews.setViewVisibility(i, 0);
        return intValue;
    }
}
