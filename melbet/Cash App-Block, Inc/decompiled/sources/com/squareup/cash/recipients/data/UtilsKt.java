package com.squareup.cash.recipients.data;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.core.graphics.drawable.DrawableCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.franklin.ui.UiCustomer;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public abstract class UtilsKt {
    public static final Uri createContactAvatarRequestUri(String str, String str2, String str3) {
        if ((str == null || StringsKt.isBlank(str)) && ((str2 == null || StringsKt.isBlank(str2)) && (str3 == null || StringsKt.isBlank(str3)))) {
            return null;
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("contact");
        if (str != null && !StringsKt.isBlank(str)) {
            builder.appendQueryParameter("recipient_id", str);
        }
        if (str2 != null && !StringsKt.isBlank(str2)) {
            builder.appendQueryParameter("email", str2);
        }
        if (str3 != null && !StringsKt.isBlank(str3)) {
            builder.appendQueryParameter("sms", str3);
        }
        return builder.build();
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewPaySms.deepLinkSpecs;
    }

    public static Bitmap toBitmap$default(Drawable drawable, int i) {
        int intrinsicWidth = (i & 1) != 0 ? drawable.getIntrinsicWidth() : 1024;
        int intrinsicHeight = (i & 2) != 0 ? drawable.getIntrinsicHeight() : 1024;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (intrinsicWidth == bitmapDrawable.getBitmap().getWidth() && intrinsicHeight == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), intrinsicWidth, intrinsicHeight, true);
            }
            a$$ExternalSyntheticBUOutline0.m$3("bitmap is null");
            return null;
        }
        Rect bounds = drawable.getBounds();
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.right;
        int i5 = bounds.bottom;
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i2, i3, i4, i5);
        return createBitmap;
    }

    public static final UiCustomer toSendableUiCustomer(Recipient recipient) {
        recipient.getClass();
        return DrawableCompat.transform(recipient).toSendableUiCustomer();
    }
}
