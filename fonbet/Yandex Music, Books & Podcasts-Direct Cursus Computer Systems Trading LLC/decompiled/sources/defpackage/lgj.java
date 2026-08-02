package defpackage;

import com.connectsdk.etc.helper.HttpMessage;

/* loaded from: classes5.dex */
public final class lgj implements b0j {
    public final /* synthetic */ int a;
    public final String b;

    public lgj(String str, int i) {
        this.a = i;
        str.getClass();
        switch (i) {
            case 3:
                this.b = str;
                break;
            default:
                this.b = str;
                break;
        }
    }

    @Override // defpackage.b0j
    public final mif c(e1j e1jVar) {
        int i = this.a;
        e1jVar.getClass();
        switch (i) {
            case 0:
                q0j method = e1jVar.method();
                String b = e1jVar.b();
                z9h d = e1jVar.d();
                z9h a = e1jVar.a();
                z9h c = e1jVar.c();
                c.j("X-Service-Token", this.b);
                return nif.d(new uyo(method, b, d, a, c, e1jVar.encoding()));
            case 1:
                if (e1jVar.c().g("X-Oauth-Token") == null && e1jVar.c().g("X-Uid") == null) {
                    return nif.d(e1jVar);
                }
                q0j method2 = e1jVar.method();
                String b2 = e1jVar.b();
                z9h d2 = e1jVar.d();
                z9h a2 = e1jVar.a();
                z9h c2 = e1jVar.c();
                String str = this.b;
                if (str != null) {
                    c2.j("X-PASSPORT-PARTITION", str);
                }
                return nif.d(new uyo(method2, b2, d2, a2, c2, e1jVar.encoding()));
            case 2:
                q0j method3 = e1jVar.method();
                String b3 = e1jVar.b();
                z9h d3 = e1jVar.d();
                z9h a3 = e1jVar.a();
                z9h c3 = e1jVar.c();
                String str2 = this.b;
                if (str2 != null) {
                    c3.j("Webauth-Authorization", "OAuth ".concat(str2));
                }
                return nif.d(new uyo(method3, b3, d3, a3, c3, e1jVar.encoding()));
            default:
                q0j method4 = e1jVar.method();
                String b4 = e1jVar.b();
                z9h d4 = e1jVar.d();
                z9h a4 = e1jVar.a();
                z9h c4 = e1jVar.c();
                c4.j(HttpMessage.USER_AGENT, this.b);
                return nif.d(new uyo(method4, b4, d4, a4, c4, e1jVar.encoding()));
        }
    }

    public /* synthetic */ lgj(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
    }
}
