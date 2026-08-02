package defpackage;

import android.app.Activity;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;
import ru.yandex.taxi.settings.presentation.settings.PushSettingsView;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes6.dex */
public final class r4g0 implements v3g0 {
    public final /* synthetic */ PushSettingsView a;

    public r4g0(PushSettingsView pushSettingsView) {
        this.a = pushSettingsView;
    }

    @Override // defpackage.v3g0
    public final void H6(String str) {
        FloatingTitleToolbarComponent floatingTitleToolbarComponent;
        floatingTitleToolbarComponent = this.a.toolbar;
        floatingTitleToolbarComponent.setTitle(str);
    }

    @Override // defpackage.v3g0
    public final void Qc(nba1 nba1Var) {
        boolean z = nba1Var instanceof t4g0;
        PushSettingsView pushSettingsView = this.a;
        if (z) {
            pushSettingsView.onSettingsLoaded(((t4g0) nba1Var).b);
            return;
        }
        if (nba1Var instanceof u4g0) {
            pushSettingsView.showLoading();
        } else if (nba1Var instanceof s4g0) {
            pushSettingsView.onSettingsError();
        } else {
            w511.b();
        }
    }

    @Override // defpackage.v3g0
    public final void ca(String str) {
        FloatingTitleToolbarComponent floatingTitleToolbarComponent;
        floatingTitleToolbarComponent = this.a.toolbar;
        floatingTitleToolbarComponent.setSubtitle(str);
    }

    @Override // defpackage.v3g0
    public final void wc(z0g0 z0g0Var) {
        Activity activity;
        PushSettingsView pushSettingsView = this.a;
        activity = pushSettingsView.activity;
        new AlertDialog(activity).setMessage(kyh0.push_settings_notification_channel_text).setPositiveButton(kyh0.push_settings_notification_channel_yes, new xmf0(2, pushSettingsView, z0g0Var)).setNegativeButton(kyh0.push_settings_notification_channel_cancel).show();
    }
}
