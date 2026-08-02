package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vw7 {
    public final String a;

    public /* synthetic */ vw7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vw7) {
            return jl40.l(this.a, ((vw7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("CancelReasonV2Id(reasonName=", this.a, Extension.C_BRAKE);
    }
}
