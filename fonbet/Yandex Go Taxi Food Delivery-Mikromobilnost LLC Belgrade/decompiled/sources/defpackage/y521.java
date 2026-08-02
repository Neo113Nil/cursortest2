package defpackage;

import com.yandex.mapkit.directions.driving.Action;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class y521 implements be00 {
    public final String a;
    public final Action b;
    public final String c;

    public y521(String str, Action action, String str2) {
        this.a = str;
        this.b = action;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y521)) {
            return false;
        }
        y521 y521Var = (y521) obj;
        return jl40.l(this.a, y521Var.a) && this.b == y521Var.b && jl40.l(this.c, y521Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Action action = this.b;
        int hashCode2 = (hashCode + (action == null ? 0 : action.hashCode())) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpcomingManeuverUiState(distance=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", nextStreet=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
