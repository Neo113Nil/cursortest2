package defpackage;

import android.net.Uri;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.evaluable.MissingVariableException;
import com.yandex.div2.DivActionSubmit$Request$Method;
import com.yandex.div2.c3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ybk implements nbk {
    public ybk(dab1 dab1Var) {
    }

    @Override // defpackage.nbk
    public final boolean a(String str, jbk jbkVar, Div2View div2View, rvo rvoVar) {
        List list;
        fbk fbkVar = jbkVar instanceof fbk ? (fbk) jbkVar : null;
        if (fbkVar == null) {
            return false;
        }
        t9k t9kVar = fbkVar.b;
        s9k s9kVar = t9kVar.d;
        cxk i = new eee((String) t9kVar.a.a(rvoVar)).i(div2View);
        if (i == null) {
            return false;
        }
        List list2 = s9kVar.a;
        if (list2 != null) {
            List<q9k> list3 = list2;
            ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
            for (q9k q9kVar : list3) {
                arrayList.add(new wbz0());
            }
        }
        ((DivActionSubmit$Request$Method) s9kVar.b.a(rvoVar)).toString();
        List d = i.a.d().d();
        List list4 = d;
        if (list4 != null && !list4.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            Iterator it = d.iterator();
            while (it.hasNext()) {
                String E = tje.E((c3) it.next());
                c231 variable = i.b.getVariable(E);
                if (variable != null) {
                    Object d2 = variable.d();
                    if (d2 instanceof Uri) {
                        d2 = new rg21(d2.toString());
                    }
                    if (jSONObject.put(E, d2) == null) {
                    }
                }
                div2View.logError(new MissingVariableException(E));
            }
            jSONObject.toString();
        }
        List list5 = t9kVar.c;
        List list6 = t9kVar.b;
        List list7 = list5;
        if ((list7 == null || list7.isEmpty()) && (list = list6) != null) {
            list.isEmpty();
        }
        div2View.addLoadReference(new d7l(), div2View);
        return true;
    }
}
