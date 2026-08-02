package defpackage;

import android.os.Bundle;
import com.ybsdk.feature.settings.internal.screens.settings.presentation.SettingsFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class z7r0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsFragment b;

    public /* synthetic */ z7r0(SettingsFragment settingsFragment, int i) {
        this.a = i;
        this.b = settingsFragment;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        boolean adapter$lambda$0;
        zy11 onCreate$lambda$6;
        int i = this.a;
        SettingsFragment settingsFragment = this.b;
        switch (i) {
            case 0:
                adapter$lambda$0 = SettingsFragment.adapter$lambda$0(settingsFragment, (g9r0) obj, ((Boolean) obj2).booleanValue());
                return Boolean.valueOf(adapter$lambda$0);
            default:
                onCreate$lambda$6 = SettingsFragment.onCreate$lambda$6(settingsFragment, (String) obj, (Bundle) obj2);
                return onCreate$lambda$6;
        }
    }
}
