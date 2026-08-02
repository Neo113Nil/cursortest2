package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lv9o0;", "Lw9o0;", "Companion", "t9o0", "u9o0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class v9o0 extends w9o0 {
    public static final u9o0 Companion = new u9o0();
    public final FormattedText a;

    public v9o0(int i, FormattedText formattedText) {
        if ((i & 1) == 0) {
            this.a = FormattedText.c;
        } else {
            this.a = formattedText;
        }
    }

    public v9o0() {
        this(0);
    }

    public v9o0(int i) {
        this.a = FormattedText.c;
    }
}
