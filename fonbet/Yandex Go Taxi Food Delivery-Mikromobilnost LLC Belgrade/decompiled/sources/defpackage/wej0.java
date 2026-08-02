package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lwej0;", "", "Companion", "uej0", "vej0", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class wej0 {
    public static final vej0 Companion = new vej0();
    public final String a;
    public final Integer b;
    public final afj0 c;

    public wej0(int i, String str, Integer num, afj0 afj0Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) != 0) {
            this.c = afj0Var;
        } else {
            afj0.Companion.getClass();
            this.c = afj0.d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wej0)) {
            return false;
        }
        wej0 wej0Var = (wej0) obj;
        return jl40.l(this.a, wej0Var.a) && jl40.l(this.b, wej0Var.b) && jl40.l(this.c, wej0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder q = n.q("RequirementCommunicationDto(id=", this.b, this.a, ", showCount=", ", fallBack=");
        q.append(this.c);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public wej0() {
        afj0.Companion.getClass();
        this.a = "";
        this.b = null;
        this.c = afj0.d;
    }
}
