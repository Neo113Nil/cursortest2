package defpackage;

import android.text.Editable;
import com.yandex.plus.core.debug.panel.internal.presentation.view.DebugPanelLogsView;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class uvg implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ DebugPanelLogsView b;

    public /* synthetic */ uvg(DebugPanelLogsView debugPanelLogsView, int i) {
        this.a = i;
        this.b = debugPanelLogsView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 showFieldsDialog$lambda$15;
        zy11 zy11Var;
        zy11 zy11Var2;
        zy11 showLevelFilterDialog$lambda$13;
        int i = this.a;
        DebugPanelLogsView debugPanelLogsView = this.b;
        switch (i) {
            case 0:
                showFieldsDialog$lambda$15 = DebugPanelLogsView.showFieldsDialog$lambda$15(debugPanelLogsView, (List) obj);
                return showFieldsDialog$lambda$15;
            case 1:
                zy11Var = DebugPanelLogsView.setupListeners$lambda$7(debugPanelLogsView, (Editable) obj);
                return zy11Var;
            case 2:
                zy11Var2 = DebugPanelLogsView.setupScrollButton$lambda$25(debugPanelLogsView, ((Integer) obj).intValue());
                return zy11Var2;
            default:
                showLevelFilterDialog$lambda$13 = DebugPanelLogsView.showLevelFilterDialog$lambda$13(debugPanelLogsView, (List) obj);
                return showLevelFilterDialog$lambda$13;
        }
    }
}
