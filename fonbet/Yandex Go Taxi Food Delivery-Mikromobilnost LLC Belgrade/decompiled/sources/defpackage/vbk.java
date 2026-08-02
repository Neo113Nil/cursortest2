package defpackage;

import com.yandex.div.core.state.PathFormatException;
import com.yandex.div.core.view2.Div2View;

/* loaded from: classes11.dex */
public final class vbk implements nbk {
    @Override // defpackage.nbk
    public final boolean a(String str, jbk jbkVar, Div2View div2View, rvo rvoVar) {
        if (!(jbkVar instanceof bbk)) {
            return false;
        }
        u8k u8kVar = ((bbk) jbkVar).b;
        String str2 = (String) u8kVar.a.a(rvoVar);
        try {
            div2View.switchToState(xw91.h(str2), ((Boolean) u8kVar.b.a(rvoVar)).booleanValue());
            return true;
        } catch (PathFormatException e) {
            div2View.logError(new IllegalArgumentException(g8e.o("Invalid format of ", str2), e));
            return true;
        }
    }
}
