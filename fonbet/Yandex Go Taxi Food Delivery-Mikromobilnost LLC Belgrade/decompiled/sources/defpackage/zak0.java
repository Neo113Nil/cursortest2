package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class zak0 implements ibk0 {
    public final rok0 a;

    public zak0(rok0 rok0Var) {
        this.a = rok0Var;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return "change_timeline_selected_option";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zak0) && this.a.equals(((zak0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChangeSelectedOption(option=" + this.a + Extension.C_BRAKE;
    }
}
