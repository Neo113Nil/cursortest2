package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lu8v0;", "", "Companion", "s8v0", "t8v0", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class u8v0 {
    public static final t8v0 Companion = new t8v0();
    public final rl2 a;
    public final FormattedText b;
    public final String c;

    public /* synthetic */ u8v0(int i, rl2 rl2Var, FormattedText formattedText, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = rl2Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public u8v0() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
