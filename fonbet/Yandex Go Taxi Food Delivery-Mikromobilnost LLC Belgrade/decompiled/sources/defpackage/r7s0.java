package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lr7s0;", "Lka40;", "Companion", "p7s0", "q7s0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class r7s0 extends ka40 {
    public static final q7s0 Companion = new q7s0();
    public final FormattedText a;
    public final String b;
    public final String c;
    public final String d;

    public r7s0(int i, FormattedText formattedText, String str, String str2, String str3) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public r7s0() {
        this.a = FormattedText.c;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
