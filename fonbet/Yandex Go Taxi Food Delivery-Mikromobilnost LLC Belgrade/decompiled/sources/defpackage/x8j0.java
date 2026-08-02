package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.communications.model.widgets.ActionType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lx8j0;", "Lckz0;", "Companion", "v8j0", "w8j0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class x8j0 extends ckz0 {
    public static final w8j0 Companion = new w8j0();
    public final String a;
    public final Object b;

    public x8j0(String str, int i, Object obj) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = obj;
        }
    }

    @Override // defpackage.ckz0
    public final ActionType a() {
        return ActionType.REQUEST_TOTW;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8j0)) {
            return false;
        }
        x8j0 x8j0Var = (x8j0) obj;
        return jl40.l(this.a, x8j0Var.a) && jl40.l(this.b, x8j0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "RequestTotw(key=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
    }

    public x8j0() {
        this.a = "";
        this.b = null;
    }
}
