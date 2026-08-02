package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class r9u0 implements r921 {
    public final d451 a;

    public r9u0(d451 d451Var) {
        this.a = d451Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r9u0) && this.a.equals(((r9u0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StatusWidgetItem(widgetState=" + this.a + Extension.C_BRAKE;
    }
}
