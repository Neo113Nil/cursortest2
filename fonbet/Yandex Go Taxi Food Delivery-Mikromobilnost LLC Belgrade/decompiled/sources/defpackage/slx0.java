package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.model.widgets.ActionType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lslx0;", "Lckz0;", "Companion", "qlx0", "rlx0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class slx0 extends ckz0 {
    public static final rlx0 Companion = new rlx0();
    public final String a;

    public slx0(int i, String str) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
    }

    @Override // defpackage.ckz0
    public final ActionType a() {
        return ActionType.TARIFF_REDIRECT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof slx0) && jl40.l(this.a, ((slx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("TariffRedirect(tariffClass=", this.a, Extension.C_BRAKE);
    }

    public slx0() {
        this.a = "";
    }
}
