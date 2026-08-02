package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class eja implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8g b;
    public final /* synthetic */ xia c;
    public final /* synthetic */ bhs d;

    public /* synthetic */ eja(n8g n8gVar, xia xiaVar, bhs bhsVar, int i) {
        this.a = i;
        this.b = n8gVar;
        this.c = xiaVar;
        this.d = bhsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    lqd.b(this.b, a.a(d.d(vci.a, 1.0f), "collection_downloaded_sections_block"), 4, null, new mqd(16, 12), ild.C(-117348766, new jv(4, this.c, this.d), oq5Var), oq5Var, 197040, 8);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                oq5 oq5Var2 = (oq5) hq5Var;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    pm0.a(null, ild.C(1868141712, new eja(this.b, this.c, this.d, 0), oq5Var2), oq5Var2, 48, 1);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
