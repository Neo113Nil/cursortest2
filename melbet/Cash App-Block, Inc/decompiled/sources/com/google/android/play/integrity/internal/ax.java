package com.google.android.play.integrity.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import androidx.compose.ui.text.font.FontVariation$Settings;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.compose.ui.text.font.TypefaceCompatApi26;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.DisplayCompat;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.cdf.NotificationType;
import com.squareup.cash.integration.analytics.Action;
import com.squareup.cash.integration.analytics.AnalyticsEventReceiver;

/* loaded from: classes.dex */
public final class ax implements aw {
    public final Context a;

    public ax(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // com.google.android.play.integrity.internal.az
    public Object a() {
        return this.a;
    }

    public Intent createIntent(NotificationType notificationType) {
        Action action = Action.CONFIRMED_COMPLETE;
        notificationType.getClass();
        Intent intent = new Intent(this.a, (Class<?>) AnalyticsEventReceiver.class);
        intent.setData(Uri.fromParts(BreadcrumbHelper.Category.ANALYTICS, notificationType + " " + action + " " + System.currentTimeMillis(), null));
        intent.putExtra("event-type", notificationType);
        intent.putExtra("event-action", action);
        return intent;
    }

    public Typeface loadBlocking(ResourceFont resourceFont) {
        if (!(resourceFont instanceof ResourceFont)) {
            return null;
        }
        int i = resourceFont.resId;
        Context context = this.a;
        Typeface font = ResourcesCompat.getFont(context, i);
        font.getClass();
        FontVariation$Settings fontVariation$Settings = resourceFont.variationSettings;
        ThreadLocal threadLocal = TypefaceCompatApi26.threadLocalPaint;
        if (font == null) {
            return null;
        }
        if (fontVariation$Settings.settings.isEmpty()) {
            return font;
        }
        ThreadLocal threadLocal2 = TypefaceCompatApi26.threadLocalPaint;
        Paint paint = (Paint) threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(font);
        paint.setFontVariationSettings(DisplayCompat.toAndroidString(fontVariation$Settings, context));
        return paint.getTypeface();
    }

    public /* synthetic */ ax(Context context, boolean z) {
        this.a = context;
    }

    public ax(Application application) {
        this.a = application.getApplicationContext();
    }
}
