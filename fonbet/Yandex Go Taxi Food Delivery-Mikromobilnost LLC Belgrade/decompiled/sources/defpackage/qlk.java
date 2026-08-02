package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.div.core.expression.variables.a;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class qlk implements plk {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public qlk(Context context, boolean z) {
        this.c = scc.g(new amk(), new zlk(), new dmk(), new gmk(context), new mlk(z), new ylk(), new llk(), new xlk(), new slk());
    }

    private final void a(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
    }

    private final void b(View view, clk clkVar) {
    }

    private final void c(View view, clk clkVar) {
    }

    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        Object obj;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                String str = clkVar.j;
                ((uxd) obj2).b(str).a(view, new yzh(div2View));
                break;
            case 1:
                Iterator it = ((List) obj2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (jl40.l(((qr51) obj).getCustomType().getType(), clkVar.j)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                qr51 qr51Var = (qr51) obj;
                if (qr51Var != null) {
                    qr51Var.b(view, clkVar, div2View, bVar);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        int i = this.b;
        plk plkVar = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                String str = clkVar.j;
                Context context = div2View.getContext();
                JSONObject jSONObject = clkVar.i;
                qnh qnhVar = new qnh(rvoVar);
                jz4 b = ((uxd) obj).b(str);
                break;
            case 1:
                Iterator it = ((List) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (jl40.l(((qr51) next).getCustomType().getType(), clkVar.j)) {
                            plkVar = next;
                        }
                    }
                }
                qr51 qr51Var = (qr51) plkVar;
                if (qr51Var == null) {
                    break;
                } else {
                    break;
                }
            default:
                plk[] plkVarArr = (plk[]) obj;
                int i2 = 0;
                while (true) {
                    if (i2 < 6) {
                        plk plkVar2 = plkVarArr[i2];
                        if (plkVar2.isCustomTypeSupported(clkVar.j)) {
                            plkVar = plkVar2;
                        } else {
                            i2++;
                        }
                    }
                }
                if (plkVar == null || (r4 = plkVar.createView(clkVar, div2View, rvoVar, bVar)) == null) {
                    break;
                }
                break;
        }
        return new View(div2View.getContext());
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        Object obj;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((uxd) obj2).a.containsKey(str);
            case 1:
                Iterator it = ((List) obj2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (jl40.l(((qr51) obj).getCustomType().getType(), str)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                qr51 qr51Var = (qr51) obj;
                if (qr51Var != null && qr51Var.isCustomTypeSupported(str)) {
                    return true;
                }
                x4c.g("Invalid type of DivKitCustomView", null, str, null, 10);
                return false;
            default:
                plk[] plkVarArr = (plk[]) obj2;
                for (int i2 = 0; i2 < 6; i2++) {
                    if (plkVarArr[i2].isCustomTypeSupported(str)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
        Object obj;
        switch (this.b) {
            case 1:
                Iterator it = ((List) this.c).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (jl40.l(((qr51) obj).getCustomType().getType(), clkVar.j)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                qr51 qr51Var = (qr51) obj;
                if (qr51Var != null) {
                    qr51Var.release();
                    break;
                }
                break;
        }
    }

    public qlk(plk[] plkVarArr) {
        this.c = plkVarArr;
    }

    public qlk(lir lirVar, a aVar, wb8 wb8Var, boolean z, boolean z2) {
        this.c = new uxd(kotlin.collections.b.i(new Pair("DivCustomWebView", new anf(lirVar)), new Pair("DivCustomLoaderView", new ekf()), new Pair("DivCustomCardInputView", new oh8(new ymu(aVar), new pm5(21, wb8Var), z, z2, lirVar))));
    }
}
