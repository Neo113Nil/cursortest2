package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Ltzr0;", "", "Companion", "c", "b", "a", "qzr0", "uzr0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class tzr0 {
    public static final uzr0 Companion = new uzr0();
    public final String a;
    public final c b;
    public final b c;
    public final a d;
    public final tvw0 e;

    public /* synthetic */ tzr0(int i, String str, c cVar, b bVar, a aVar, tvw0 tvw0Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = new c(0);
        } else {
            this.b = cVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bVar;
        }
        if ((i & 8) == 0) {
            this.d = new a(0);
        } else {
            this.d = aVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = tvw0Var;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltzr0$a;", "", "Companion", "rzr0", "szr0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final szr0 Companion = new szr0();
        public final String a;

        public /* synthetic */ a(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public a(int i) {
            this.a = "";
        }

        public a() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltzr0$b;", "", "Companion", "vzr0", "wzr0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final wzr0 Companion = new wzr0();
        public final String a;

        public /* synthetic */ b(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public b() {
            this.a = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltzr0$c;", "", "Companion", "xzr0", "yzr0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class c {
        public static final yzr0 Companion = new yzr0();
        public final FormattedText a;

        public /* synthetic */ c(int i, FormattedText formattedText) {
            if ((i & 1) == 0) {
                this.a = FormattedText.c;
            } else {
                this.a = formattedText;
            }
        }

        public c() {
            this(0);
        }

        public c(int i) {
            this.a = FormattedText.c;
        }
    }

    public tzr0() {
        c cVar = new c(0);
        a aVar = new a(0);
        this.a = "";
        this.b = cVar;
        this.c = null;
        this.d = aVar;
        this.e = null;
    }
}
