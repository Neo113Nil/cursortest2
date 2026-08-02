package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.g;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class r6m0 implements t6m0 {
    public final Text a;
    public final Text b;
    public final g c;
    public final g d;
    public final YbButtonViewGroup.b e;

    public r6m0(Text text, Text text2, g gVar, g gVar2, YbButtonViewGroup.b bVar) {
        this.a = text;
        this.b = text2;
        this.c = gVar;
        this.d = gVar2;
        this.e = bVar;
    }

    public final g a() {
        return this.d;
    }

    public final YbButtonViewGroup.b b() {
        return this.e;
    }

    public final g c() {
        return this.c;
    }

    public final Text d() {
        return this.b;
    }

    public final Text e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6m0)) {
            return false;
        }
        r6m0 r6m0Var = (r6m0) obj;
        return this.a.equals(r6m0Var.a) && this.b.equals(r6m0Var.b) && this.c.equals(r6m0Var.c) && this.d.equals(r6m0Var.d) && this.e.equals(r6m0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + n.c(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder p = n.p("Content(title=", this.a, ", subtitle=", this.b, ", dateState=");
        p.append(this.c);
        p.append(", amountState=");
        p.append(this.d);
        p.append(", buttonsState=");
        p.append(this.e);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
