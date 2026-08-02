package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Ltvw0;", "", "Companion", "a", "pvw0", "qvw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class tvw0 {
    public static final qvw0 Companion = new qvw0();
    public final a a;
    public final FormattedText b;
    public final FormattedText c;
    public final String d;
    public final r47 e;

    public /* synthetic */ tvw0(int i, a aVar, FormattedText formattedText, FormattedText formattedText2, String str, r47 r47Var) {
        this.a = (i & 1) == 0 ? null : aVar;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = new r47(0);
        } else {
            this.e = r47Var;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltvw0$a;", "", "Companion", "rvw0", "svw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final svw0 Companion = new svw0();
        public final Integer a;

        public /* synthetic */ a(int i, Integer num) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
        }

        public a() {
            this.a = null;
        }
    }

    public tvw0() {
        FormattedText formattedText = FormattedText.c;
        r47 r47Var = new r47(0);
        this.a = null;
        this.b = formattedText;
        this.c = formattedText;
        this.d = "";
        this.e = r47Var;
    }
}
