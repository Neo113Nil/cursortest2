package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class smk {
    public final JSONObject a;
    public final JSONObject b;
    public final List c;

    public smk(JSONObject jSONObject, JSONObject jSONObject2, List list) {
        this.a = jSONObject;
        this.b = jSONObject2;
        this.c = list;
    }

    public static smk a(smk smkVar, ArrayList arrayList) {
        JSONObject jSONObject = smkVar.a;
        JSONObject jSONObject2 = smkVar.b;
        smkVar.getClass();
        return new smk(jSONObject, jSONObject2, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smk)) {
            return false;
        }
        smk smkVar = (smk) obj;
        return jl40.l(this.a, smkVar.a) && jl40.l(this.b, smkVar.b) && jl40.l(this.c, smkVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivDataForRendering(templatesJson=");
        sb.append(this.a);
        sb.append(", cardsJson=");
        sb.append(this.b);
        sb.append(", variables=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
