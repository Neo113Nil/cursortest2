package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.go.telemetry.ui.TelemetryReportModalView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class sdy0 implements tdy0 {
    public final /* synthetic */ TelemetryReportModalView a;

    public sdy0(TelemetryReportModalView telemetryReportModalView) {
        this.a = telemetryReportModalView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        rdy0 binding;
        Context context;
        ydy0 ydy0Var = (ydy0) obj;
        TelemetryReportModalView telemetryReportModalView = this.a;
        binding = telemetryReportModalView.getBinding();
        FrameLayout frameLayout = binding.e;
        RobotoTextView robotoTextView = binding.d;
        ButtonComponent buttonComponent = binding.c;
        boolean z = ydy0Var instanceof vdy0;
        frameLayout.setVisibility(z ? 0 : 8);
        binding.b.setVisibility(!z ? 0 : 8);
        boolean z2 = ydy0Var instanceof xdy0;
        buttonComponent.setVisibility(z2 ? 0 : 8);
        if (ydy0Var instanceof wdy0) {
            return;
        }
        if (z) {
            RobotoTextView robotoTextView2 = binding.f;
            context = telemetryReportModalView.context;
            vdy0 vdy0Var = (vdy0) ydy0Var;
            robotoTextView2.setText(context.getString(jyh0.telemetry_report_progress_state, Integer.valueOf(vdy0Var.a), Integer.valueOf(vdy0Var.b)));
            robotoTextView.setText(vdy0Var.c);
            return;
        }
        if (!z2) {
            w511.b();
        } else {
            buttonComponent.setDebounceClickListener(new y7x0(18, telemetryReportModalView, ydy0Var));
            robotoTextView.setText(((xdy0) ydy0Var).a);
        }
    }
}
