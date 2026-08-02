package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lwfe;", "", "Companion", "ufe", "vfe", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class wfe {
    public static final vfe Companion = new vfe();
    public final String a;
    public final String b;
    public final FormattedText c;

    public /* synthetic */ wfe(int i, String str, String str2, FormattedText formattedText) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText;
        }
    }

    public wfe() {
        this(0);
    }

    public wfe(int i) {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = "";
        this.c = formattedText;
    }
}
