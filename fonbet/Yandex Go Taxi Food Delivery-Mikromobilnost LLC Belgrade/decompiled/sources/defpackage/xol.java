package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.yandex.div.legacy.util.Position;
import com.yandex.div.legacy.view.DivView;
import io.appmetrica.analytics.IReporter;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes11.dex */
public final class xol extends jql {
    public final DivView a;
    public final String b;
    public int c = 0;
    public final /* synthetic */ yol d;

    public xol(yol yolVar, DivView divView, String str) {
        this.d = yolVar;
        this.a = divView;
        this.b = str;
    }

    public final View a(n15 n15Var, ggk ggkVar) {
        rbh rbhVar;
        int i;
        DivView divView = this.a;
        try {
            View b = ggkVar.b(divView, n15Var, n15.a(this.b, String.valueOf(this.c)));
            if (b == null) {
                return null;
            }
            if (!(n15Var instanceof rrk) && (rbhVar = (rbh) n15Var.w) != null) {
                String str = rbhVar.c;
                str.getClass();
                switch (str) {
                    case "l":
                        i = atg0.div_horizontal_padding_l;
                        break;
                    case "m":
                        i = atg0.div_horizontal_padding_m;
                        break;
                    case "s":
                        i = atg0.div_horizontal_padding_s;
                        break;
                    default:
                        i = atg0.div_horizontal_padding;
                        break;
                }
                g8a1.h(i, mj91.a(rbhVar.b) == Position.RIGHT ? 4 : 2, b);
            }
            x3k x3kVar = (x3k) n15Var.c;
            if (x3kVar != null) {
                divView.setActionHandlerForView(b, x3kVar);
            }
            return b;
        } catch (RuntimeException e) {
            ((IReporter) ((g3y) this.d.l.a).get()).reportEvent("DIV_VIEW_BUILDING_FAILURE", b.i(new Pair("div view id", divView.getDivTag().a), new Pair("div block id", n15Var.e())));
            z83.k("Div view building failed", e);
            return null;
        }
    }

    public final View b(ljl ljlVar) {
        Iterator it = ljlVar.y.iterator();
        while (it.hasNext()) {
            if (!TextUtils.isEmpty(((kjl) it.next()).b)) {
                return a(ljlVar, this.d.j);
            }
        }
        return null;
    }
}
