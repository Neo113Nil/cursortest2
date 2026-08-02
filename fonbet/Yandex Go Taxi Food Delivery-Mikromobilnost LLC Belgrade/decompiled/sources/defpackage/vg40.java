package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvg40;", "", "Companion", "ug40", "tg40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class vg40 {
    public static final ug40 Companion = new ug40();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new e540(22))};
    public static final vg40 e = new vg40(0);
    public final String a;
    public final qe40 b;
    public final List c;

    public /* synthetic */ vg40(int i, String str, qe40 qe40Var, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = qe40Var;
        }
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg40)) {
            return false;
        }
        vg40 vg40Var = (vg40) obj;
        return jl40.l(this.a, vg40Var.a) && jl40.l(this.b, vg40Var.b) && jl40.l(this.c, vg40Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        qe40 qe40Var = this.b;
        return this.c.hashCode() + ((hashCode + (qe40Var == null ? 0 : qe40Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtTrainSchedulerDateButtonBarDto(selectedButtonId=");
        sb.append(this.a);
        sb.append(", actionButton=");
        sb.append(this.b);
        sb.append(", dateButtons=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }

    public vg40(int i) {
        this.a = "";
        this.b = null;
        this.c = EmptyList.a;
    }

    public vg40() {
        this(0);
    }
}
