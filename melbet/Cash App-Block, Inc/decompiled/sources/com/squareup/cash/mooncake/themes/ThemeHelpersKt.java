package com.squareup.cash.mooncake.themes;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "Lkotlin/Function1;", "Lcom/squareup/cash/mooncake/themes/ThemeInfo;", "themeProvider", "wrapWithTheme", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)Landroid/content/Context;", "themes"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThemeHelpersKt {
    public static final ThemeInfo findThemeInfo(Context context) {
        ThemeInfo themeInfo;
        Object obj = context;
        while (true) {
            if (!(obj instanceof HasThemeInfo)) {
                if (!(obj instanceof ContextWrapper)) {
                    themeInfo = null;
                    break;
                }
                Context baseContext = ((ContextWrapper) obj).getBaseContext();
                baseContext.getClass();
                obj = baseContext;
            } else {
                themeInfo = ((HasThemeInfo) obj).getThemeInfo();
                break;
            }
        }
        if (themeInfo != null) {
            return themeInfo;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Could not find context that implements HasThemeInfo");
        return null;
    }

    public static final ThemeHelpersKt$overrideTheme$1 overrideTheme(Context context, Function1 function1) {
        context.getClass();
        return new ThemeHelpersKt$overrideTheme$1(function1, findThemeInfo(context), context, context.getTheme());
    }

    public static final ThemeInfo themeInfo(View view) {
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        return findThemeInfo(context);
    }

    @Deprecated
    public static final Context wrapWithTheme(Context context, Function1<? super Context, ThemeInfo> function1) {
        context.getClass();
        function1.getClass();
        return new ThemeHelpersKt$overrideTheme$1(function1, context, context.getTheme());
    }

    public static final ThemeInfo themeInfo(Context context) {
        context.getClass();
        return findThemeInfo(context);
    }
}
