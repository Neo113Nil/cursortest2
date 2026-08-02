package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrxt;", "Lsxt;", "Companion", "pxt", "qxt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class rxt extends sxt {
    public static final qxt Companion = new qxt();
    public static final i3y[] e = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new mvt(4)), null};
    public final Object a;
    public final double b;
    public final FormattedText.FontWeight c;
    public final String d;

    public rxt(int i, Object obj, double d, FormattedText.FontWeight fontWeight, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = obj;
        }
        if ((i & 2) == 0) {
            this.b = 13.0d;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.FontWeight.REGULAR;
        } else {
            this.c = fontWeight;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
    }

    public rxt() {
        FormattedText.FontWeight fontWeight = FormattedText.FontWeight.REGULAR;
        this.a = "";
        this.b = 13.0d;
        this.c = fontWeight;
        this.d = "";
    }
}
