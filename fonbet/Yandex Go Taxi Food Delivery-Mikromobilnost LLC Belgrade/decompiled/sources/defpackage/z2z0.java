package defpackage;

import java.util.Calendar;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lz2z0;", "", "Companion", "a", "v2z0", "w2z0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class z2z0 {
    public static final w2z0 Companion = new w2z0();
    public final Calendar a;
    public final String b;
    public final String c;
    public final String d;
    public final a e;

    public /* synthetic */ z2z0(int i, Calendar calendar, String str, String str2, String str3, a aVar) {
        this.a = (i & 1) == 0 ? Calendar.getInstance() : calendar;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
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
            this.e = new a(0);
        } else {
            this.e = aVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2z0)) {
            return false;
        }
        z2z0 z2z0Var = (z2z0) obj;
        return jl40.l(this.a, z2z0Var.a) && jl40.l(this.b, z2z0Var.b) && jl40.l(this.c, z2z0Var.c) && jl40.l(this.d, z2z0Var.d) && jl40.l(this.e, z2z0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TicketTimer(startTimerDate=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", timeTextColor=");
        g8e.D(sb, this.c, ", background=", this.d, ", messageAfterEnd=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lz2z0$a;", "", "Companion", "x2z0", "y2z0", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final y2z0 Companion = new y2z0();
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

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("TicketTimerEndMessage(text=", this.a, ", color=", this.b, Extension.C_BRAKE);
        }

        public a(int i) {
            this.a = "";
            this.b = "";
        }

        public a() {
            this(0);
        }
    }

    public z2z0() {
        Calendar calendar = Calendar.getInstance();
        a aVar = new a(0);
        this.a = calendar;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = aVar;
    }
}
