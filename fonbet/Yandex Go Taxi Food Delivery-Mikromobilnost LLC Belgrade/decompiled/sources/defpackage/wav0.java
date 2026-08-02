package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lwav0;", "Ln96;", "Lc6z;", "Companion", "a", "b", "tav0", "sav0", "suggestedfavorites"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class wav0 extends n96 implements c6z {
    public static final tav0 Companion = new tav0();
    public static final i3y[] f = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0v0(18)), null, null};
    public static final wav0 g = new wav0(0);
    public final boolean b;
    public final Map c;
    public final a d;
    public final b e;

    public /* synthetic */ wav0(int i, boolean z, Map map, a aVar, b bVar) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = a.e;
        } else {
            this.d = aVar;
        }
        if ((i & 8) == 0) {
            this.e = b.b;
        } else {
            this.e = bVar;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.n96
    public final boolean b() {
        if (!this.b) {
            return false;
        }
        a aVar = this.d;
        return d6z.Y(this, aVar.getA()).length() > 0 && d6z.Y(this, aVar.getB()).length() > 0 && d6z.Y(this, aVar.getC()).length() > 0 && d6z.Y(this, this.e.getA()).length() > 0;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lwav0$b;", "", "Companion", "yav0", "xav0", "suggestedfavorites"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class b {
        public static final yav0 Companion = new yav0();
        public static final b b = new b(0);
        public final String a;

        public /* synthetic */ b(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public b(int i) {
            this.a = "";
        }

        public b() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lwav0$a;", "", "Companion", "vav0", "uav0", "suggestedfavorites"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class a {
        public static final vav0 Companion = new vav0();
        public static final a e = new a(0);
        public final String a;
        public final String b;
        public final String c;
        public final Integer d;

        public /* synthetic */ a(int i, Integer num, String str, String str2, String str3) {
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
                this.c = "";
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = num;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final String getC() {
            return this.c;
        }

        /* renamed from: c, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public a(int i) {
            this.a = "";
            this.b = "";
            this.c = "";
            this.d = null;
        }

        public a() {
            this(0);
        }
    }

    public wav0() {
        this(0);
    }

    public wav0(int i) {
        Map f2 = kotlin.collections.b.f();
        this.b = false;
        this.c = f2;
        this.d = a.e;
        this.e = b.b;
    }
}
