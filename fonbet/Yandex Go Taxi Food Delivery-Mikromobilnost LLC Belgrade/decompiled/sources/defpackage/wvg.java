package defpackage;

import com.yandex.plus.core.debug.panel.internal.presentation.view.DebugPanelLogsView;

/* loaded from: classes2.dex */
public final /* synthetic */ class wvg implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DebugPanelLogsView b;

    public /* synthetic */ wvg(DebugPanelLogsView debugPanelLogsView, int i) {
        this.a = i;
        this.b = debugPanelLogsView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 showFieldsDialog$lambda$16;
        zy11 showDialog$lambda$21;
        zy11 showLevelFilterDialog$lambda$14;
        int i = this.a;
        DebugPanelLogsView debugPanelLogsView = this.b;
        switch (i) {
            case 0:
                zy11Var = DebugPanelLogsView.setupScrollButton$lambda$24(debugPanelLogsView);
                return zy11Var;
            case 1:
                showFieldsDialog$lambda$16 = DebugPanelLogsView.showFieldsDialog$lambda$16(debugPanelLogsView);
                return showFieldsDialog$lambda$16;
            case 2:
                showDialog$lambda$21 = DebugPanelLogsView.showDialog$lambda$21(debugPanelLogsView);
                return showDialog$lambda$21;
            default:
                showLevelFilterDialog$lambda$14 = DebugPanelLogsView.showLevelFilterDialog$lambda$14(debugPanelLogsView);
                return showLevelFilterDialog$lambda$14;
        }
    }
}
