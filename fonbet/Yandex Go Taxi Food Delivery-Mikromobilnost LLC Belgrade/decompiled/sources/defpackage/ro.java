package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lro;", "Ler;", "Companion", "a", "no", "oo", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ro extends er {
    public static final oo Companion = new oo();
    public final a a;

    public ro(int i, a aVar) {
        if ((i & 1) == 0) {
            this.a = new a(0);
        } else {
            this.a = aVar;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lro$a;", "", "Companion", "po", "qo", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final qo Companion = new qo();
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

    public ro() {
        this.a = new a(0);
    }
}
