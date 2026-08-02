package defpackage;

import android.content.Context;
import android.graphics.Rect;
import androidx.compose.runtime.internal.a;
import com.yandex.go.walking.navigation.impl.guidance.e;

/* loaded from: classes14.dex */
public final /* synthetic */ class w141 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ w141(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).c = eVar.I.a();
                agd agdVar = (agd) yfdVar;
                agdVar.e = new w141(eVar, 1);
                fpb1.e(yfdVar, new ec31(9, eVar));
                agdVar.g = new a(410674806, new ic01(2, eVar), true);
                break;
            case 1:
                eVar.U((m341) obj, false);
                break;
            default:
                int intValue = ((Integer) obj).intValue();
                Context context = eVar.F;
                int u = tje.u(16, context);
                eVar.O.Lc(eVar, new Rect(u, u, u, tje.u(72, context) + u + intValue));
                break;
        }
        return zy11Var;
    }
}
