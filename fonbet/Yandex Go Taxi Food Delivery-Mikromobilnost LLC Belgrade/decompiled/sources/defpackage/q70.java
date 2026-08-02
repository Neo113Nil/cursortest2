package defpackage;

import android.widget.TextView;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.network.retryPolicy.RetryTimeoutException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.widgets.common.TraceIdErrorView;
import com.ybsdk.widgets.common.YbButtonView;
import java.io.IOException;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public final /* synthetic */ class q70 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ n70 b;
    public final /* synthetic */ sls c;

    public /* synthetic */ q70(n70 n70Var, sls slsVar, int i) {
        this.a = i;
        this.b = n70Var;
        this.c = slsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.c;
        n70 n70Var = this.b;
        switch (i) {
            case 0:
                YbDivView.setData$default(((d261) n70Var.N).b, ((jpl) n70Var.Z()).d, a.m0((Iterable) slsVar.invoke(), ((jpl) n70Var.Z()).g), null, false, 12, null);
                break;
            case 1:
                g261 g261Var = (g261) n70Var.N;
                f990 f990Var = (f990) n70Var.Z();
                Throwable th = f990Var.f;
                Text text = gao.h;
                lzz0 lzz0Var = null;
                if ((th instanceof IOException) || (th instanceof RetryTimeoutException.Network)) {
                    text = gao.g;
                } else if (th instanceof FailDataException) {
                    String error = ((FailDataException) th).getError();
                    if (evu0.J(error)) {
                        error = null;
                    }
                    if (error != null) {
                        text = g8e.i(Text.Companion, error);
                    }
                }
                if (!(f990Var instanceof f990)) {
                    w511.b();
                    break;
                } else {
                    TextView textView = g261Var.d;
                    TraceIdErrorView traceIdErrorView = g261Var.e;
                    YbButtonView ybButtonView = g261Var.b;
                    TextView textView2 = g261Var.c;
                    xty0.d(textView, text);
                    textView2.setVisibility(8);
                    Throwable th2 = ((f990) n70Var.Z()).f;
                    ybButtonView.setText(gao.i);
                    ybButtonView.setOnClickListener(new njb(18, slsVar));
                    Object obj2 = ((f990) n70Var.Z()).f;
                    mzz0 mzz0Var = obj2 instanceof mzz0 ? (mzz0) obj2 : null;
                    if (mzz0Var == null || (str = mzz0Var.getTraceId()) == null) {
                        str = null;
                    }
                    if (str != null) {
                        lzz0Var = new lzz0(str);
                        traceIdErrorView.render(lzz0Var);
                    }
                    traceIdErrorView.setVisibility(lzz0Var != null ? 0 : 8);
                    break;
                }
            case 2:
                ((v561) n70Var.N).a.render(new adm0((b9m0) n70Var.Z(), ((Boolean) slsVar.invoke()).booleanValue()));
                break;
            default:
                ((z261) n70Var.N).b.setOnClickListener(new xbg0(15, slsVar));
                break;
        }
        return zy11Var;
    }
}
