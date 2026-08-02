package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lxhp;", "Lxn11;", "Lc6z;", "Companion", "whp", "vhp", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class xhp implements xn11, c6z {
    public static final whp Companion = new whp();
    public static final i3y[] e = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new fsn(23))};
    public static final xhp f = new xhp(0);
    public final boolean b;
    public final String c;
    public final Map d;

    public /* synthetic */ xhp(int i, String str, Map map, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        this.c = (i & 2) == 0 ? "" : str;
        if ((i & 4) == 0) {
            this.d = b.f();
        } else {
            this.d = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhp)) {
            return false;
        }
        xhp xhpVar = (xhp) obj;
        return this.b == xhpVar.b && jl40.l(this.c, xhpVar.c) && jl40.l(this.d, xhpVar.d);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return b64.r(ly3.v("FavoriteSuggestSectionExperiment(isEnabled=", ", suggestSectionNameTk=", this.c, ", l10n=", this.b), this.d, Extension.C_BRAKE);
    }

    public xhp() {
        this(0);
    }

    public xhp(int i) {
        Map f2 = b.f();
        this.b = false;
        this.c = "";
        this.d = f2;
    }
}
