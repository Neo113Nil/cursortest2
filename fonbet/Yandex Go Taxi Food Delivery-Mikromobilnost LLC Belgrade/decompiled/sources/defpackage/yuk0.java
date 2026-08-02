package defpackage;

import com.adjust.sdk.Constants;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yuk0 implements nqs0 {
    public final String a;

    public yuk0(String str) {
        this.a = str;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return Constants.DEEPLINK;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yuk0) && jl40.l(this.a, ((yuk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Deeplink(deeplink=", this.a, Extension.C_BRAKE);
    }
}
