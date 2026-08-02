package defpackage;

import com.ybsdk.core.utils.text.Text;

/* loaded from: classes4.dex */
public final class tnn implements vnn {
    public final String a;
    public final Text.Constant b;
    public final Text.Constant c;
    public final boolean d;

    public tnn(Text.Constant constant, Text.Constant constant2, String str, boolean z) {
        this.a = str;
        this.b = constant;
        this.c = constant2;
        this.d = z;
    }

    @Override // defpackage.vnn
    public final boolean a() {
        return this.d;
    }

    @Override // defpackage.vnn
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnn)) {
            return false;
        }
        tnn tnnVar = (tnn) obj;
        return jl40.l(this.a, tnnVar.a) && this.b.equals(tnnVar.b) && this.c.equals(tnnVar.c) && this.d == tnnVar.d;
    }

    @Override // defpackage.vnn
    public final Text getCurrency() {
        return this.c;
    }

    @Override // defpackage.vnn
    public final Text getText() {
        return this.b;
    }

    @Override // defpackage.vnn
    public final String getValue() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + unr0.e(xvz.d(this.c, xvz.d(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        return "AutoFund(value=" + this.a + ", text=" + this.b + ", currency=" + this.c + ", isValidateError=" + this.d + ", isFocused=true)";
    }
}
