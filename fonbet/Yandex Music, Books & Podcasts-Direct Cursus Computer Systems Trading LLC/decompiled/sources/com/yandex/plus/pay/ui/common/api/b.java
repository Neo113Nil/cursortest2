package com.yandex.plus.pay.ui.common.api;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import defpackage.hq0;
import defpackage.uf6;
import java.util.Locale;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public abstract class b extends hq0 {
    public uf6 a;

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        AssetManager assets;
        uf6 uf6Var = this.a;
        if (uf6Var != null && (assets = uf6Var.getAssets()) != null) {
            return assets;
        }
        AssetManager assets2 = super.getAssets();
        assets2.getClass();
        return assets2;
    }

    @Override // defpackage.hq0, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources;
        uf6 uf6Var = this.a;
        if (uf6Var != null && (resources = uf6Var.getResources()) != null) {
            return resources;
        }
        Resources resources2 = super.getResources();
        resources2.getClass();
        return resources2;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme;
        uf6 uf6Var = this.a;
        if (uf6Var != null && (theme = uf6Var.getTheme()) != null) {
            return theme;
        }
        Resources.Theme theme2 = super.getTheme();
        theme2.getClass();
        return theme2;
    }

    public final void j(Locale locale, com.yandex.plus.ui.core.theme.a aVar, float f) {
        locale.getClass();
        aVar.getClass();
        getDelegate().n(u.r(this, aVar) ? 2 : 1);
        Configuration configuration = new Configuration(getResources().getConfiguration());
        configuration.setLocale(locale);
        configuration.densityDpi = (int) (configuration.densityDpi * f);
        this.a = new uf6(createConfigurationContext(configuration), R.style.PaySDK_Theme_Plus_DayNight);
    }
}
