package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ujb0 {
    public final Text a;
    public final rbv b;
    public final ColorModel.Attr c;

    public ujb0(Text text, rbv rbvVar, ColorModel.Attr attr) {
        this.a = text;
        this.b = rbvVar;
        this.c = attr;
    }

    public final ColorModel a() {
        return this.c;
    }

    public final rbv b() {
        return this.b;
    }

    public final Text c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujb0)) {
            return false;
        }
        ujb0 ujb0Var = (ujb0) obj;
        return this.a.equals(ujb0Var.a) && this.b.equals(ujb0Var.b) && this.c.equals(ujb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Tip(text=" + this.a + ", icon=" + this.b + ", backgroundColor=" + this.c + Extension.C_BRAKE;
    }
}
