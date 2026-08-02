package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ylq0 implements pre {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final boolean d;
    public final FormattedText e;
    public final String f;

    public ylq0(String str, String str2, ArrayList arrayList, boolean z, FormattedText formattedText, String str3) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = z;
        this.e = formattedText;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylq0)) {
            return false;
        }
        ylq0 ylq0Var = (ylq0) obj;
        return jl40.l(this.a, ylq0Var.a) && jl40.l(this.b, ylq0Var.b) && this.c.equals(ylq0Var.c) && this.d == ylq0Var.d && jl40.l(this.e, ylq0Var.e) && jl40.l(this.f, ylq0Var.f);
    }

    @Override // defpackage.pre
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.pre
    public final String getType() {
        return "selector";
    }

    public final int hashCode() {
        int e = unr0.e(ly3.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        FormattedText formattedText = this.e;
        int hashCode = (e + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        String str = this.f;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("SelectorRemoteCoreWidget(id=", this.a, ", formStateKey=", this.b, ", options=");
        v.append(this.c);
        v.append(", disabledUnselect=");
        v.append(this.d);
        v.append(", bottomText=");
        v.append(this.e);
        v.append(", metricaLabel=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
