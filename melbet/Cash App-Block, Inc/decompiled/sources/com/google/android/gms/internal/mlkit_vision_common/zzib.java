package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.datadog.android.rum.internal.tracking.NoOpInteractionPredicate;
import com.datadog.android.rum.tracking.ViewTarget;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;
import kotlin.text.CharsKt;

/* loaded from: classes4.dex */
public abstract class zzib {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewMoneybotChat.deepLinkSpecs;
    }

    public static final void resolveViewTargetName(NoOpInteractionPredicate noOpInteractionPredicate, ViewTarget viewTarget) {
        viewTarget.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0014 A[Catch: NotFoundException -> 0x0024, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x0024, blocks: (B:13:0x0006, B:15:0x000c, B:5:0x0014), top: B:12:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String resourceIdName(Context context, int i) {
        String resourceEntryName;
        if (context != null) {
            try {
                Resources resources = context.getResources();
                if (resources != null) {
                    resourceEntryName = resources.getResourceEntryName(i);
                    if (resourceEntryName == null) {
                        return resourceEntryName;
                    }
                    String num = Integer.toString(i, CharsKt.checkRadix(16));
                    num.getClass();
                    return "0x".concat(num);
                }
            } catch (Resources.NotFoundException unused) {
                String num2 = Integer.toString(i, CharsKt.checkRadix(16));
                num2.getClass();
                return "0x".concat(num2);
            }
        }
        resourceEntryName = null;
        if (resourceEntryName == null) {
        }
    }

    public static final String targetClassName(View view) {
        String canonicalName = view.getClass().getCanonicalName();
        return canonicalName == null ? view.getClass().getSimpleName() : canonicalName;
    }
}
