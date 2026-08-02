package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.model.widgets.b;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lqos0;", "", "Companion", "oos0", "pos0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class qos0 {
    public static final pos0 Companion = new pos0();
    public final b a;
    public final String b;
    public final String c;

    public /* synthetic */ qos0(int i, b bVar, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bVar;
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
        if (!(obj instanceof qos0)) {
            return false;
        }
        qos0 qos0Var = (qos0) obj;
        return jl40.l(this.a, qos0Var.a) && jl40.l(this.b, qos0Var.b) && jl40.l(this.c, qos0Var.c);
    }

    public final int hashCode() {
        b bVar = this.a;
        int b = unr0.b((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.b);
        String str = this.c;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Slider(action=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public qos0() {
        this.a = null;
        this.b = "";
        this.c = null;
    }
}
