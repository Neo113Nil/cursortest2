package defpackage;

import com.yandex.messaging.internal.entities.AiBotAction;
import com.yandex.messaging.internal.entities.Suggest;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes15.dex */
public final class sm1 {
    public final x22 a;

    public sm1(x22 x22Var) {
        this.a = x22Var;
    }

    public final void a(String str, AiBotAction aiBotAction, tu10 tu10Var, List list) {
        Pair pair = new Pair("action_title", aiBotAction.getTitle());
        AiBotAction.Icon icon = aiBotAction.getIcon();
        LinkedHashMap l = b.l(pair, new Pair("action_icon", icon.getType() + "-" + icon.getValue()), new Pair("action_elementId", aiBotAction.getButtonId()));
        if (tu10Var != null) {
            l.put("message_id", tu10Var.a);
            l.put("chat_id", tu10Var.e);
        }
        b.p(l, list);
        this.a.reportEvent(str, l);
    }

    public final void b(String str, Suggest suggest, boolean z, tu10 tu10Var, List list) {
        LinkedHashMap l = b.l(new Pair("suggest_text", suggest.getText()), new Pair("suggest_elementId", suggest.getButtonId()), new Pair("suggest_kind", z ? "layout" : "not_layout"));
        if (tu10Var != null) {
            l.put("message_id", tu10Var.a);
            l.put("chat_id", tu10Var.e);
            l.put(ClidProvider.TIMESTAMP, Long.valueOf(tu10Var.d));
        }
        b.p(l, list);
        this.a.reportEvent(str, l);
    }
}
