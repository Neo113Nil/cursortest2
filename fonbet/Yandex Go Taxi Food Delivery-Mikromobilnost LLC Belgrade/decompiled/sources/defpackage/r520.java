package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class r520 extends g720 {
    public final String d;
    public final String e;
    public final String f;

    public r520(String str, String str2, String str3) {
        super("intent");
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // defpackage.g720
    public final Map a() {
        Pair[] pairArr = {new Pair("service id", this.d), new Pair("visit id", this.e), new Pair("click id", this.f)};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            if (pair.f() != null) {
                arrayList.add(pair);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((Pair) it.next());
        }
        return b.n(this.b, b.s(arrayList2));
    }

    @Override // defpackage.g720
    public final String c() {
        Map i = b.i(new Pair("service_id", this.d), new Pair("visit_id", this.e), new Pair("click_id", this.f));
        rbx rbxVar = sbx.d;
        rbxVar.getClass();
        auu0 auu0Var = auu0.a;
        return "intent_with_data|".concat(rbxVar.c(i, new k8u(auu0Var, qke.n(auu0Var), 1)));
    }

    @Override // defpackage.g720
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r520)) {
            return false;
        }
        r520 r520Var = (r520) obj;
        return jl40.l(this.d, r520Var.d) && jl40.l(this.e, r520Var.e) && jl40.l(this.f, r520Var.f);
    }

    @Override // defpackage.g720
    public final int hashCode() {
        String str = this.d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("IntentWithData(serviceId=", this.d, ", visitId=", this.e, ", clickId="), this.f, Extension.C_BRAKE);
    }

    public r520() {
        this(null, null, null);
    }
}
