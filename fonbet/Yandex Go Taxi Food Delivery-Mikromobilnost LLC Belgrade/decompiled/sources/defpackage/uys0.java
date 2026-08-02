package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class uys0 implements xys0 {
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final String d;
    public final Object e;
    public final Object f;
    public final x2s g;

    public uys0(FormattedText formattedText, FormattedText formattedText2, String str, String str2, Object obj, Object obj2, x2s x2sVar) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = str;
        this.d = str2;
        this.e = obj;
        this.f = obj2;
        this.g = x2sVar;
    }

    @Override // defpackage.xys0
    public final x2s e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uys0)) {
            return false;
        }
        uys0 uys0Var = (uys0) obj;
        return this.a.equals(uys0Var.a) && jl40.l(this.b, uys0Var.b) && jl40.l(this.c, uys0Var.c) && jl40.l(this.d, uys0Var.d) && jl40.l(this.e, uys0Var.e) && jl40.l(this.f, uys0Var.f) && this.g.equals(uys0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int b = unr0.b(unr0.b((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31, 31, this.c), 31, this.d);
        Object obj = this.e;
        int hashCode2 = (b + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.f;
        return this.g.hashCode() + ((hashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AiSmartCamera(screenTitle=");
        sb.append(this.a);
        sb.append(", hintText=");
        sb.append(this.b);
        sb.append(", photoLinkFormStateKey=");
        g8e.D(sb, this.c, ", taskId=", this.d, ", formStateValue=");
        sb.append(this.e);
        sb.append(", taskParams=");
        sb.append(this.f);
        sb.append(", analyticsData=");
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
