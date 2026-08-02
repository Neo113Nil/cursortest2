package com.squareup.cash.presenters;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.protos.cash.ui.Color;
import com.squareup.util.cash.ColorsKt;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class AccentColorsKt {
    public static float constrainedMap(float f, float f2, float f3, float f4, float f5) {
        return lerp(f, f2, Math.max(RecyclerView.DECELERATION_RATE, Math.min(1.0f, f3 == f4 ? 0.0f : (f5 - f3) / (f4 - f3))));
    }

    public static final Color getAccentColor(Recipient recipient) {
        String str;
        Color color;
        Color validate;
        if (recipient != null && (color = recipient.themedAccentColor) != null && (validate = ColorsKt.validate(color)) != null) {
            return validate;
        }
        Color validate2 = (recipient == null || (str = recipient.rawAccentColor) == null) ? null : ColorsKt.validate(ColorsKt.toColor(str));
        if (validate2 == null) {
            return ColorsKt.toUiColor(com.squareup.cash.multiplatform.accentcolors.AccentColorsKt.getAccentColor(recipient != null ? recipient.threadedCustomerId : null, recipient != null ? recipient.customerId : null, recipient != null ? recipient.fullName : null, recipient != null ? recipient.sms : null, recipient != null ? recipient.email : null));
        }
        return validate2;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewBoostDetailsByMerchant.deepLinkSpecs;
    }

    public static float lerp(float f, float f2, float f3) {
        return CameraState$Type$EnumUnboxingLocalUtility.m(f2, f, f3, f);
    }
}
