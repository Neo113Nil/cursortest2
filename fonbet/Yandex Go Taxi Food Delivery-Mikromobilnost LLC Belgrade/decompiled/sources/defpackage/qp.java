package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lqp;", "Ler;", "Companion", "a", "mp", "np", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class qp extends er {
    public static final np Companion = new np();
    public final a a;

    public qp(int i, a aVar) {
        if ((i & 1) == 0) {
            this.a = new a(0);
        } else {
            this.a = aVar;
        }
    }

    public qp() {
        this.a = new a(0);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqp$a;", "", "Companion", "op", "pp", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final pp Companion = new pp();
        public final String a;
        public final FormattedText b;
        public final FormattedText c;
        public final FormattedText d;
        public final String e;

        public /* synthetic */ a(int i, String str, String str2, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = formattedText2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = formattedText3;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str2;
            }
        }

        public a(int i) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }

        public a() {
            this(0);
        }
    }
}
