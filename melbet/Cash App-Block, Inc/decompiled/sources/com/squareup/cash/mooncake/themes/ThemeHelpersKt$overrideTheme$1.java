package com.squareup.cash.mooncake.themes;

import android.content.Context;
import android.content.res.Resources;
import androidx.appcompat.view.ContextThemeWrapper;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ThemeHelpersKt$overrideTheme$1 extends ContextThemeWrapper implements HasThemeInfo {
    public final /* synthetic */ int $r8$classId = 1;
    public final ThemeInfo themeInfo;

    public ThemeHelpersKt$overrideTheme$1(Function1 function1, Context context, Resources.Theme theme) {
        super(context, theme);
        this.themeInfo = (ThemeInfo) function1.invoke(context);
    }

    @Override // com.squareup.cash.mooncake.themes.HasThemeInfo
    public final ThemeInfo getThemeInfo() {
        switch (this.$r8$classId) {
        }
        return this.themeInfo;
    }

    public ThemeHelpersKt$overrideTheme$1(Function1 function1, ThemeInfo themeInfo, Context context, Resources.Theme theme) {
        super(context, theme);
        this.themeInfo = (ThemeInfo) function1.invoke(themeInfo);
    }
}
