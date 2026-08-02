package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class y2f0 implements z2f0 {
    public final CharSequence a;

    public /* synthetic */ y2f0(CharSequence charSequence) {
        this.a = charSequence;
    }

    public static final /* synthetic */ y2f0 a() {
        return new y2f0("");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y2f0) {
            return jl40.l(this.a, ((y2f0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.h(this.a, "Static(text=", Extension.C_BRAKE);
    }
}
