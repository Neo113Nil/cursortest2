package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lw6p0;", "", "Companion", "a", "q6p0", "r6p0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class w6p0 {
    public static final r6p0 Companion = new r6p0();
    public final Boolean a;
    public final Boolean b;
    public final a c;
    public final rtg d;
    public final Integer e;
    public final ief f;

    public /* synthetic */ w6p0(int i, Boolean bool, Boolean bool2, a aVar, rtg rtgVar, Integer num, ief iefVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = aVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = rtgVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = iefVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final ief getF() {
        return this.f;
    }

    /* renamed from: b, reason: from getter */
    public final rtg getD() {
        return this.d;
    }

    /* renamed from: c, reason: from getter */
    public final Boolean getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final a getC() {
        return this.c;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getE() {
        return this.e;
    }

    /* renamed from: f, reason: from getter */
    public final Boolean getA() {
        return this.a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lw6p0$a;", "", "Companion", "a", "s6p0", "t6p0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class a {
        public static final t6p0 Companion = new t6p0();
        public final String a;
        public final C0131a b;

        public /* synthetic */ a(int i, String str, C0131a c0131a) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = c0131a;
            }
        }

        /* renamed from: a, reason: from getter */
        public final C0131a getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public a() {
            this.a = "";
            this.b = null;
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lw6p0$a$a;", "", "Companion", "u6p0", "v6p0", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
        /* renamed from: w6p0$a$a, reason: collision with other inner class name */
        public static final class C0131a {
            public static final v6p0 Companion = new v6p0();
            public final long a;
            public final long b;

            public /* synthetic */ C0131a(int i, long j, long j2) {
                if ((i & 1) == 0) {
                    this.a = 0L;
                } else {
                    this.a = j;
                }
                if ((i & 2) == 0) {
                    this.b = 0L;
                } else {
                    this.b = j2;
                }
            }

            /* renamed from: a, reason: from getter */
            public final long getB() {
                return this.b;
            }

            /* renamed from: b, reason: from getter */
            public final long getA() {
                return this.a;
            }

            public C0131a() {
                this.a = 0L;
                this.b = 0L;
            }
        }
    }

    public w6p0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
