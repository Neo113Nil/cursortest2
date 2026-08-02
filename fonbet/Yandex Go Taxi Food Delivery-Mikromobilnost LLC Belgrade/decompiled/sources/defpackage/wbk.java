package defpackage;

import android.net.Uri;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivActionSetStoredValue$Scope;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class wbk implements nbk {
    @Override // defpackage.nbk
    public final boolean a(String str, jbk jbkVar, Div2View div2View, rvo rvoVar) {
        vgb1 blu0Var;
        if (jbkVar instanceof cbk) {
            b9k b9kVar = ((cbk) jbkVar).b;
            String str2 = (String) b9kVar.b.a(rvoVar);
            long longValue = ((Number) b9kVar.a.a(rvoVar)).longValue();
            Expression expression = b9kVar.c;
            DivActionSetStoredValue$Scope divActionSetStoredValue$Scope = expression != null ? (DivActionSetStoredValue$Scope) expression.a(rvoVar) : null;
            xll xllVar = b9kVar.d;
            if (xllVar instanceof vll) {
                blu0Var = new elu0(str2, (String) ((vll) xllVar).b.a.a(rvoVar));
            } else if (xllVar instanceof tll) {
                blu0Var = new dlu0(str2, ((Number) ((tll) xllVar).b.a.a(rvoVar)).longValue());
            } else if (xllVar instanceof qll) {
                blu0Var = new zku0(str2, ((Boolean) ((qll) xllVar).b.a.a(rvoVar)).booleanValue());
            } else if (xllVar instanceof ull) {
                blu0Var = new clu0(str2, ((Number) ((ull) xllVar).b.a.a(rvoVar)).doubleValue());
            } else if (xllVar instanceof rll) {
                blu0Var = new alu0(str2, ((Number) ((rll) xllVar).b.a.a(rvoVar)).intValue());
            } else if (xllVar instanceof wll) {
                String uri = ((Uri) ((wll) xllVar).b.a.a(rvoVar)).toString();
                try {
                    new URL(uri);
                    blu0Var = new glu0(str2, uri);
                } catch (MalformedURLException unused) {
                    ny61.g("Invalid url ".concat(uri));
                    return false;
                }
            } else if (xllVar instanceof pll) {
                blu0Var = new yku0(str2, (JSONArray) ((pll) xllVar).b.a.a(rvoVar));
            } else if (xllVar instanceof sll) {
                blu0Var = new blu0(str2, (JSONObject) ((sll) xllVar).b.a.a(rvoVar));
            } else {
                w511.b();
            }
            xgb1.c(blu0Var, longValue, div2View, divActionSetStoredValue$Scope);
            return true;
        }
        return false;
    }
}
