package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lst4;", "Lvt4;", "Companion", "qt4", "rt4", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class st4 implements vt4 {
    public static final rt4 Companion = new rt4();
    public final fu4 a;
    public final String b;
    public final String c;

    public /* synthetic */ st4(int i, fu4 fu4Var, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = fu4Var;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st4)) {
            return false;
        }
        st4 st4Var = (st4) obj;
        return jl40.l(this.a, st4Var.a) && jl40.l(this.b, st4Var.b) && jl40.l(this.c, st4Var.c);
    }

    public final int hashCode() {
        fu4 fu4Var = this.a;
        int b = unr0.b((fu4Var == null ? 0 : fu4Var.hashCode()) * 31, 31, this.b);
        String str = this.c;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowNotificationAction(icon=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public st4() {
        this.a = null;
        this.b = "";
        this.c = null;
    }
}
