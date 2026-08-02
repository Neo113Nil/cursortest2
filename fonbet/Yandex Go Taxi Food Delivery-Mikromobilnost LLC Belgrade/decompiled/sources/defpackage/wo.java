package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lwo;", "Ler;", "Companion", "a", "to", "xo", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class wo extends er {
    public static final xo Companion = new xo();
    public final a a;

    public wo(int i, a aVar) {
        if ((i & 1) == 0) {
            this.a = new a(0);
        } else {
            this.a = aVar;
        }
    }

    public wo() {
        this.a = new a(0);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lwo$a;", "", "Companion", "uo", "vo", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final vo Companion = new vo();
        public final String a;
        public final String b;

        public /* synthetic */ a(int i, String str, String str2) {
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
        }

        public a(int i) {
            this.a = "";
            this.b = "";
        }

        public a() {
            this(0);
        }
    }
}
