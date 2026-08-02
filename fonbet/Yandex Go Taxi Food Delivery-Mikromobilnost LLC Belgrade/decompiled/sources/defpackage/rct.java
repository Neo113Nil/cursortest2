package defpackage;

import java.util.Calendar;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lrct;", "", "Companion", "a", "b", "c", "d", "nct", "oct", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class rct {
    public static final oct Companion = new oct();
    public final a a;

    public /* synthetic */ rct(int i, a aVar) {
        if ((i & 1) == 0) {
            this.a = new a(0);
        } else {
            this.a = aVar;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrct$d;", "", "Companion", "wct", "xct", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class d {
        public static final xct Companion = new xct();
        public final String a;

        public /* synthetic */ d(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public d(int i) {
            this.a = "";
        }

        public d() {
            this(0);
        }
    }

    public rct() {
        this.a = new a(0);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrct$c;", "", "Companion", "uct", "vct", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class c {
        public static final vct Companion = new vct();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new sss(12))};
        public final d a;
        public final List b;

        public /* synthetic */ c(int i, d dVar, List list) {
            this.a = (i & 1) == 0 ? new d(0) : dVar;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        public c() {
            this(0);
        }

        public c(int i) {
            this.a = new d(0);
            this.b = EmptyList.a;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrct$b;", "", "Companion", "sct", "tct", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final tct Companion = new tct();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ b(int i, String str, String str2, String str3) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
        }

        public b(int i) {
            this.a = "";
            this.b = null;
            this.c = null;
        }

        public b() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrct$a;", "", "Companion", "pct", "qct", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final qct Companion = new qct();
        public final String a;
        public final Calendar b;
        public final String c;
        public final String d;
        public final boolean e;
        public final b f;
        public final c g;

        public /* synthetic */ a(int i, String str, Calendar calendar, String str2, String str3, boolean z, b bVar, c cVar) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = Calendar.getInstance();
            } else {
                this.b = calendar;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str3;
            }
            if ((i & 16) == 0) {
                this.e = false;
            } else {
                this.e = z;
            }
            if ((i & 32) == 0) {
                this.f = new b(0);
            } else {
                this.f = bVar;
            }
            if ((i & 64) == 0) {
                this.g = new c(0);
            } else {
                this.g = cVar;
            }
        }

        public a() {
            this(0);
        }

        public a(int i) {
            Calendar calendar = Calendar.getInstance();
            b bVar = new b(0);
            c cVar = new c(0);
            this.a = "";
            this.b = calendar;
            this.c = "";
            this.d = "";
            this.e = false;
            this.f = bVar;
            this.g = cVar;
        }
    }
}
