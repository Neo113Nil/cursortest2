package defpackage;

import io.appmetrica.analytics.impl.Hf;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class gai {
    public final fai a;
    public final HashMap b = new HashMap();
    public final jya c;

    public gai(fai faiVar) {
        jya jyaVar = new jya(3);
        jyaVar.b = "cold";
        this.c = jyaVar;
        this.a = faiVar;
    }

    public final eai a(Hf hf) {
        HashMap hashMap = this.b;
        eai eaiVar = (eai) hashMap.get(hf);
        if (eaiVar != null) {
            return eaiVar;
        }
        eai eaiVar2 = new eai(hf, this.c, this.a);
        hashMap.put(hf, eaiVar2);
        return eaiVar2;
    }
}
