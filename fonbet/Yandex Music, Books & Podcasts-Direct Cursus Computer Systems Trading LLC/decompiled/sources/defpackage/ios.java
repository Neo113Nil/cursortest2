package defpackage;

import java.util.Map;

/* loaded from: classes5.dex */
public final class ios extends x28 {
    public final String a;
    public final tao b;
    public final z9h c;

    public ios(String str, tao taoVar, z9h z9hVar) {
        z9hVar.getClass();
        this.a = str;
        this.b = taoVar;
        this.c = z9hVar;
    }

    @Override // defpackage.e1j
    public final String b() {
        return "v2/tokenize";
    }

    @Override // defpackage.vs2, defpackage.e1j
    public final z9h c() {
        z9h z9hVar = new z9h();
        z9hVar.j("X-Request-ID", this.a);
        return z9hVar;
    }

    @Override // defpackage.x28, defpackage.vs2, defpackage.e1j
    public final z9h d() {
        z9h z9hVar = new z9h();
        z9hVar.j("method", "card");
        z9h z9hVar2 = new z9h();
        tao taoVar = this.b;
        String str = (String) taoVar.a;
        if (str != null) {
            z9hVar2.j("pan", str);
        }
        String str2 = (String) taoVar.b;
        if (str2 == null) {
            str2 = null;
        } else if (str2.length() == 2) {
            str2 = "20".concat(str2);
        }
        if (str2 != null) {
            z9hVar2.j("expiration_year", str2);
        }
        String str3 = (String) taoVar.c;
        if (str3 != null) {
            z9hVar2.j("expiration_month", str3);
        }
        String str4 = (String) taoVar.d;
        if (str4 != null) {
            z9hVar2.j("holder_name", str4);
        }
        String str5 = (String) taoVar.e;
        if (str5 != null) {
            z9hVar2.j("cvn", str5);
        }
        Map map = z9hVar.b;
        w1g.B(map, "data", z9hVar2);
        z9h z9hVar3 = this.c;
        if (z9hVar3 != null) {
            w1g.B(map, "context", z9hVar3);
        }
        return z9hVar;
    }
}
