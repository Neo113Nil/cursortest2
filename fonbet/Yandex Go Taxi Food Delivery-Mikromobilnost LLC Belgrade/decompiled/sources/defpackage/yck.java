package defpackage;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivActionVideo$Action;

/* loaded from: classes11.dex */
public final class yck implements nbk {
    @Override // defpackage.nbk
    public final boolean a(String str, jbk jbkVar, Div2View div2View, rvo rvoVar) {
        String str2;
        if (!(jbkVar instanceof ibk)) {
            return false;
        }
        fdk fdkVar = ((ibk) jbkVar).b;
        String str3 = (String) fdkVar.b.a(rvoVar);
        edk edkVar = DivActionVideo$Action.Converter;
        DivActionVideo$Action divActionVideo$Action = (DivActionVideo$Action) fdkVar.a.a(rvoVar);
        edkVar.getClass();
        str2 = divActionVideo$Action.value;
        div2View.applyVideoCommand(str3, str2, rvoVar);
        return true;
    }
}
