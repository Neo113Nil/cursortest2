package defpackage;

import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class wr81 implements xh71 {
    public final String a;
    public final String b;
    public final List c;
    public final List d;

    public wr81(String str, String str2, ListBuilder listBuilder, List list) {
        this.a = str;
        this.b = str2;
        this.c = listBuilder;
        this.d = list;
    }

    @Override // defpackage.xh71
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr81)) {
            return false;
        }
        wr81 wr81Var = (wr81) obj;
        return this.a.equals(wr81Var.a) && this.b.equals(wr81Var.b) && jl40.l(this.c, wr81Var.c) && jl40.l(this.d, wr81Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return this.d.hashCode() + ((b + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        return vfc.p(b64.v("DeeplinkAction(actionType=", this.a, ", fallbackUrl=", this.b, ", fallbackTrackingUrls="), this.c, ", preferredPackages=", this.d, Extension.C_BRAKE);
    }
}
