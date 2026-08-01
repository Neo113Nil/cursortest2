package com.instagram.common.viewpoint.core;

import android.text.Spannable;

/* renamed from: com.facebook.ads.redexgen.X.3t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC06193t {
    public static void A00(Spannable spannable, Object obj, int i, int i6, int i9) {
        for (Object obj2 : spannable.getSpans(i, i6, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i6 && spannable.getSpanFlags(obj2) == i9) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i, i6, i9);
    }
}
