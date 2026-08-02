package defpackage;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivActionTimer$Action;

/* loaded from: classes11.dex */
public final class xck implements nbk {
    @Override // defpackage.nbk
    public final boolean a(String str, jbk jbkVar, Div2View div2View, rvo rvoVar) {
        String str2;
        if (!(jbkVar instanceof gbk)) {
            return false;
        }
        hak hakVar = ((gbk) jbkVar).b;
        String str3 = (String) hakVar.b.a(rvoVar);
        gak gakVar = DivActionTimer$Action.Converter;
        DivActionTimer$Action divActionTimer$Action = (DivActionTimer$Action) hakVar.a.a(rvoVar);
        gakVar.getClass();
        str2 = divActionTimer$Action.value;
        div2View.applyTimerCommand(str3, str2);
        return true;
    }
}
