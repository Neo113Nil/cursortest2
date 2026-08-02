package defpackage;

import com.yandex.delivery.mapper.model.Font;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rry0 implements qqn {
    public final String a;
    public final Font b;
    public final int c;
    public final qfc d;

    public rry0(String str, Font font, int i, qfc qfcVar) {
        this.a = str;
        this.b = font;
        this.c = i;
        this.d = qfcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rry0)) {
            return false;
        }
        rry0 rry0Var = (rry0) obj;
        return jl40.l(this.a, rry0Var.a) && this.b == rry0Var.b && this.c == rry0Var.c && jl40.l(this.d, rry0Var.d);
    }

    public final int hashCode() {
        int b = oyr.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        qfc qfcVar = this.d;
        return b + (qfcVar == null ? 0 : qfcVar.hashCode());
    }

    public final String toString() {
        return "TextModel(value=" + this.a + ", font=" + this.b + ", size=" + this.c + ", color=" + this.d + Extension.C_BRAKE;
    }

    public /* synthetic */ rry0(String str, Font font, int i, int i2) {
        this(str, font, (i2 & 4) != 0 ? 24 : i, (qfc) null);
    }
}
