package defpackage;

import android.view.View;
import android.widget.EditText;
import com.connectsdk.service.DeviceService;
import com.google.android.material.textfield.TextInputLayout;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class hcp extends ecp {
    public static final /* synthetic */ int E = 0;
    public final my6 C;
    public final /* synthetic */ mcp D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcp(mcp mcpVar, View view, my6 my6Var) {
        super(mcpVar, view, 0);
        this.D = mcpVar;
        this.C = my6Var;
        my6Var.setOnFocusChangeListener(new fcp());
        my6Var.setOnReadyListener(new gcp(0, this, mcpVar));
    }

    @Override // defpackage.ecp
    public final void t(int i) {
        super.t(i);
        int i2 = u(i) ? 0 : 8;
        my6 my6Var = this.C;
        my6Var.setVisibility(i2);
        mka mkaVar = my6Var.a;
        boolean u = u(i);
        mcp mcpVar = this.D;
        if (u) {
            g0c g0cVar = mcpVar.h;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            r1f r1fVar = r1f.a;
            vtm k = su4.k("Показ поля ввода CVV", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
            ci0 ci0Var = qjb.a;
            ci0Var.a = su4.g(1, ci0Var.a);
            k.u(qee.n() + ci0Var.a, "eventus_id");
            qne j = su4.j(k, "event_name", "input_shown_cvv", "input_shown_cvv", k);
            x60 x60Var = (x60) g0cVar;
            x60Var.getClass();
            x60Var.a(j);
        }
        my6Var.setCardPaymentSystem(((ffk) dag.y((kcp) mcpVar.i.get(i))).b);
        boolean u2 = u(c());
        if (c() == -1 || !u2) {
            TextInputLayout textInputLayout = (TextInputLayout) mkaVar.a;
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                editText.setText((CharSequence) null);
            }
            textInputLayout.setErrorEnabled(false);
            textInputLayout.setError(null);
            return;
        }
        if (u2 && mcpVar.j) {
            mcpVar.j = false;
            EditText editText2 = ((TextInputLayout) mkaVar.a).getEditText();
            if (editText2 != null) {
                qgg.d0(editText2);
            }
        }
    }
}
