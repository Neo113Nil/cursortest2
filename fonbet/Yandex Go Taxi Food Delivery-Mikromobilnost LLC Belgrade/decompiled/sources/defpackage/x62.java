package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class x62 implements y62 {
    public final etz0 a;

    public x62(etz0 etz0Var) {
        this.a = etz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x62) && jl40.l(this.a, ((x62) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ToolbarAction(toolbarUiAction=" + this.a + Extension.C_BRAKE;
    }
}
