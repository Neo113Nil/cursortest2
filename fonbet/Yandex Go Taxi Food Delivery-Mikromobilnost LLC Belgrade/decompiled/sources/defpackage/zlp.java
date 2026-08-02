package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lzlp;", "", "Companion", "xlp", "ylp", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class zlp {
    public static final ylp Companion = new ylp();
    public final zzs a;

    public /* synthetic */ zlp(int i, zzs zzsVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = zzsVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final zzs getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zlp) && jl40.l(this.a, ((zlp) obj).a);
    }

    public final int hashCode() {
        zzs zzsVar = this.a;
        if (zzsVar == null) {
            return 0;
        }
        return zzsVar.hashCode();
    }

    public final String toString() {
        return "FeatureGeometry(coordinates=" + this.a + Extension.C_BRAKE;
    }

    public zlp(zzs zzsVar) {
        this.a = zzsVar;
    }

    public zlp() {
        this(null);
    }
}
