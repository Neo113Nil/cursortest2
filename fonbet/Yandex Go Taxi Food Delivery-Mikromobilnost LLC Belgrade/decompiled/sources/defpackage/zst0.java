package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.split.deposit.internal.ui.a;
import com.ybsdk.feature.split.deposit.internal.ui.b;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.l;

/* loaded from: classes3.dex */
public final class zst0 implements ev31 {
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        b a;
        String str;
        String str2;
        sst0 sst0Var = (sst0) obj;
        boolean z = sst0Var.e;
        rst0 rst0Var = sst0Var.b;
        int i = yst0.a[sst0Var.a.ordinal()];
        if (i == 1) {
            a = a.a(rst0Var != null ? rst0Var.b : null, new l(OperationProgressView.StatusIcon.ERROR), z);
        } else if (i == 2) {
            a = a.a(rst0Var != null ? rst0Var.a : null, pc70.a, z);
        } else if (i == 3) {
            a9u0 a9u0Var = rst0Var != null ? rst0Var.d : null;
            a = new b(new sc70(j5a0.d(sst0Var.c, 0, 3), new l(OperationProgressView.StatusIcon.SUCCESS), z), (a9u0Var == null || (str2 = a9u0Var.a) == null) ? null : g8e.i(Text.Companion, str2), (a9u0Var == null || (str = a9u0Var.b) == null) ? null : g8e.i(Text.Companion, str), a9u0Var != null ? a9u0Var.c : null, 8);
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            a = a.a(rst0Var != null ? rst0Var.c : null, new l(OperationProgressView.StatusIcon.ERROR), z);
        }
        return new xst0(a, sst0Var.d);
    }
}
