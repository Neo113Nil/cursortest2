package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class wf20 {
    public final bg20 a;
    public final boolean b;

    public wf20(bg20 bg20Var, boolean z) {
        this.a = bg20Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf20)) {
            return false;
        }
        wf20 wf20Var = (wf20) obj;
        return this.a.equals(wf20Var.a) && this.b == wf20Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SwitchState(spendAmount=" + this.a + ", turnedOn=" + this.b + Extension.C_BRAKE;
    }
}
