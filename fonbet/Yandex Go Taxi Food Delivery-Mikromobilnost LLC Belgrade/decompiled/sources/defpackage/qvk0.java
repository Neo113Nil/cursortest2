package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class qvk0 {
    public final String a;
    public final FormattedText b;
    public final List c;
    public final ArrayList d;
    public final pvk0 e;
    public final String f;

    public qvk0(String str, FormattedText formattedText, List list, ArrayList arrayList, pvk0 pvk0Var, String str2) {
        this.a = str;
        this.b = formattedText;
        this.c = list;
        this.d = arrayList;
        this.e = pvk0Var;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvk0)) {
            return false;
        }
        qvk0 qvk0Var = (qvk0) obj;
        return jl40.l(this.a, qvk0Var.a) && jl40.l(this.b, qvk0Var.b) && jl40.l(this.c, qvk0Var.c) && this.d.equals(qvk0Var.d) && jl40.l(this.e, qvk0Var.e) && jl40.l(this.f, qvk0Var.f);
    }

    public final int hashCode() {
        int b = ly3.b(unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c), 31, this.d);
        pvk0 pvk0Var = this.e;
        int hashCode = (b + (pvk0Var == null ? 0 : pvk0Var.hashCode())) * 31;
        String str = this.f;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = xvz.q("RobotaxiModel(id=", this.a, ", title=", ", bullets=", this.b);
        q.append(this.c);
        q.append(", buttons=");
        q.append(this.d);
        q.append(", slider=");
        q.append(this.e);
        q.append(", imageUrl=");
        q.append(this.f);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
