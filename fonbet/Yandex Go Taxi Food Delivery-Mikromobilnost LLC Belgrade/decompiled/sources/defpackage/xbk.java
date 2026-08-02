package defpackage;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.Expression;

/* loaded from: classes11.dex */
public final class xbk implements nbk {
    @Override // defpackage.nbk
    public final boolean a(String str, jbk jbkVar, Div2View div2View, rvo rvoVar) {
        if (!(jbkVar instanceof ebk)) {
            return false;
        }
        l9k l9kVar = ((ebk) jbkVar).b;
        String str2 = (String) l9kVar.a.a(rvoVar);
        Expression expression = l9kVar.b;
        Boolean bool = expression != null ? (Boolean) expression.a(rvoVar) : null;
        if (bool != null) {
            div2View.showTooltip(str2, bool.booleanValue());
            return true;
        }
        div2View.showTooltip(str2);
        return true;
    }
}
