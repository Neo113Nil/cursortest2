package defpackage;

import com.yandex.go.dto.response.ActionType;
import com.yandex.go.dto.response.q1;
import kotlin.a;

/* loaded from: classes8.dex */
public final class txr0 {
    public final i3y a = a.a(new dwq0(20));

    public final String a(yyr0 yyr0Var) {
        q1 c = yyr0Var.getC();
        boolean z = yyr0Var instanceof pcu;
        i3y i3yVar = this.a;
        if (z) {
            return (c == null || c.a() == ActionType.TAXI_PROCEED) ? "nested_button_action:taxi_next" : g8e.o("nested_button_action:", ((tmx) i3yVar.getValue()).a(c.a()));
        }
        if (c != null) {
            return ((tmx) i3yVar.getValue()).a(c.a());
        }
        return null;
    }
}
