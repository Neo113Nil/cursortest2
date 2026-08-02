package defpackage;

import com.yandex.div.core.expression.variables.a;
import com.yandex.go.flex.common.api.FeedSdkTheme;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class y900 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ aa00 b;

    public /* synthetic */ y900(aa00 aa00Var, int i) {
        this.a = i;
        this.b = aa00Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        aa00 aa00Var = this.b;
        switch (i) {
            case 0:
                aa00Var.D.a(v4q0.d);
                break;
            case 1:
                boolean z = !((Boolean) obj).booleanValue();
                a aVar = aa00Var.R;
                c231 g = aVar.g("superapp.document_visible");
                if (g != null) {
                    g.g(String.valueOf(z));
                    aVar.i(g);
                    break;
                }
                break;
            case 2:
                aa00Var.D.a(new u4q0((Set) obj));
                break;
            default:
                aa00Var.D.a(new a5q0((FeedSdkTheme) obj));
                break;
        }
        return zy11Var;
    }
}
