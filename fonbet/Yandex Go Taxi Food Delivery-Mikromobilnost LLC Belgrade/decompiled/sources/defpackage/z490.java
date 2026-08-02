package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lz490;", "", "Companion", "x490", "y490", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class z490 {
    public static final y490 Companion = new y490();
    public final FormattedText a;
    public final FormattedText b;
    public final FormattedText c;
    public final FormattedText d;
    public final FormattedText e;
    public final FormattedText f;

    public /* synthetic */ z490(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4, FormattedText formattedText5, FormattedText formattedText6) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText3;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText4;
        }
        if ((i & 16) == 0) {
            this.e = FormattedText.c;
        } else {
            this.e = formattedText5;
        }
        if ((i & 32) == 0) {
            this.f = FormattedText.c;
        } else {
            this.f = formattedText6;
        }
    }

    public z490() {
        FormattedText formattedText = FormattedText.c;
        this.a = formattedText;
        this.b = formattedText;
        this.c = formattedText;
        this.d = formattedText;
        this.e = formattedText;
        this.f = formattedText;
    }
}
