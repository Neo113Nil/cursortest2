package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.res.ResourcesCompat;
import coil3.size.DimensionKt;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzbs {
    public static volatile boolean shouldCallAppCompatResources = true;

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewLoanRepayOverdueDeprecated.deepLinkSpecs;
    }

    public static Drawable getDrawable(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (shouldCallAppCompatResources) {
                return loadDrawableV7(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            shouldCallAppCompatResources = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ResourcesCompat.getDrawable(context2.getResources(), i, theme);
    }

    public static Drawable loadDrawableV7(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, theme);
            contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return DimensionKt.getDrawable(context, i);
    }
}
