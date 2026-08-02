package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lxpo;", "", "Companion", "a", "upo", "tpo", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class xpo {
    public static final upo Companion = new upo();
    public static final xpo d = new xpo(0);
    public final k0j a;
    public final a b;
    public final x1k c;

    public /* synthetic */ xpo(int i, k0j k0jVar, a aVar, x1k x1kVar) {
        this.a = (i & 1) == 0 ? new k0j(0) : k0jVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = aVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = x1kVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final x1k getC() {
        return this.c;
    }

    public final String toString() {
        return "ExpectedDestinations{destinations=" + this.a + ", screenOptions=" + this.b + ", distanceCache=" + this.c + "}";
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lxpo$a;", "", "Companion", "vpo", "wpo", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final wpo Companion = new wpo();
        public final int a;
        public final int b;

        public /* synthetic */ a(int i, int i2, int i3) {
            if ((i & 1) == 0) {
                this.a = 0;
            } else {
                this.a = i2;
            }
            if ((i & 2) == 0) {
                this.b = 0;
            } else {
                this.b = i3;
            }
        }

        public final String toString() {
            return b64.d(this.a, this.b, "ScreenOptions{mainScreenResultsCount=", ", summaryResultsCount=", "}");
        }

        public a() {
            this.a = 0;
            this.b = 0;
        }
    }

    public xpo() {
        this(0);
    }

    public xpo(int i) {
        this.a = new k0j(0);
        this.b = null;
        this.c = null;
    }
}
