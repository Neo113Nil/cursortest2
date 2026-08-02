package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqx20;", "", "Companion", "ox20", "px20", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class qx20 {
    public static final px20 Companion = new px20();
    public final FormattedText a;
    public final sx20 b;

    public /* synthetic */ qx20(int i, FormattedText formattedText, sx20 sx20Var) {
        this.a = (i & 1) == 0 ? null : formattedText;
        if ((i & 2) == 0) {
            this.b = m121.INSTANCE;
        } else {
            this.b = sx20Var;
        }
    }

    public qx20() {
        m121 m121Var = m121.INSTANCE;
        this.a = null;
        this.b = m121Var;
    }
}
