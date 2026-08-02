package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.autotopup.state.AutoTopupType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class unn implements vnn {
    public final AutoTopupType a;
    public final String b;
    public final Text.Constant c;
    public final Text.Constant d;
    public final boolean e;
    public final boolean f;

    public unn(AutoTopupType autoTopupType, String str, Text.Constant constant, Text.Constant constant2, boolean z, boolean z2) {
        this.a = autoTopupType;
        this.b = str;
        this.c = constant;
        this.d = constant2;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.vnn
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.vnn
    public final boolean b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unn)) {
            return false;
        }
        unn unnVar = (unn) obj;
        return this.a == unnVar.a && jl40.l(this.b, unnVar.b) && this.c.equals(unnVar.c) && this.d.equals(unnVar.d) && this.e == unnVar.e && this.f == unnVar.f;
    }

    @Override // defpackage.vnn
    public final Text getCurrency() {
        return this.d;
    }

    @Override // defpackage.vnn
    public final Text getText() {
        return this.c;
    }

    @Override // defpackage.vnn
    public final String getValue() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.e(xvz.d(this.d, xvz.d(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoTopup(type=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", currency=");
        sb.append(this.d);
        sb.append(", isValidateError=");
        return smw0.k(", isFocused=", Extension.C_BRAKE, sb, this.e, this.f);
    }
}
