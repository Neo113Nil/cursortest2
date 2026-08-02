package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lz4w;", "", "Companion", "x4w", "y4w", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class z4w {
    public static final y4w Companion = new y4w();
    public final Boolean a;

    public /* synthetic */ z4w(Boolean bool, int i) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4w) && jl40.l(this.a, ((z4w) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "InsuranceDto(selected=" + this.a + Extension.C_BRAKE;
    }

    public z4w(Boolean bool) {
        this.a = bool;
    }

    public z4w() {
        this(null);
    }
}
