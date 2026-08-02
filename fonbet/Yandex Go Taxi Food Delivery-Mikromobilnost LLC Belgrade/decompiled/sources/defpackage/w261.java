package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.ybsdk.feature.settings.internal.view.SettingsThemeView;

/* loaded from: classes3.dex */
public final class w261 implements zo31 {
    public final LinearLayout a;
    public final SettingsThemeView b;
    public final SettingsThemeView c;
    public final SettingsThemeView d;

    public w261(LinearLayout linearLayout, SettingsThemeView settingsThemeView, SettingsThemeView settingsThemeView2, SettingsThemeView settingsThemeView3) {
        this.a = linearLayout;
        this.b = settingsThemeView;
        this.c = settingsThemeView2;
        this.d = settingsThemeView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
