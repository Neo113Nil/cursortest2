package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lzj90;", "", "Companion", "xj90", "yj90", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class zj90 {
    public static final yj90 Companion = new yj90();
    public final FormattedText a;
    public final FormattedText b;

    public /* synthetic */ zj90(int i, FormattedText formattedText, FormattedText formattedText2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
    }

    public zj90() {
        this.a = null;
        this.b = null;
    }
}
