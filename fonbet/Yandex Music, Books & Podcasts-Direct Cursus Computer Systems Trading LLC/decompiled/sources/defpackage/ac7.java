package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lac7;", "", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class ac7 {
    public static okq a(hip hipVar, xyn xynVar, List list, mm6 mm6Var, Function0 function0) {
        list.getClass();
        mm6Var.getClass();
        xm6 xm6Var = xynVar;
        if (xynVar == null) {
            xm6Var = new l7j();
        }
        return new okq(function0, hipVar, t75.c(new C0089ga7(list, null)), xm6Var, mm6Var);
    }

    public static okq b(hip hipVar, xyn xynVar, Function0 function0, int i) {
        if ((i & 2) != 0) {
            xynVar = null;
        }
        c5b c5bVar = c5b.a;
        dq7 dq7Var = ca8.a;
        return a(hipVar, xynVar, c5bVar, gld.e(mn7.d.plus(a4g.n())), function0);
    }
}
