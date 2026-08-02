package defpackage;

import android.os.Build;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class yt0 implements b0j {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ yt0(int i, Object obj) {
        this.a = i;
        this.b = obj;
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
                y3e y3eVar = (y3e) this.b;
                String str = y3eVar.b;
                c.getClass();
                if (str != null) {
                    c.j("X-Client-Version", str);
                }
                String str2 = y3eVar.c;
                if (str2 != null) {
                    c.j("X-Client-App", str2);
                }
                break;
            case 1:
                q0j method2 = e1jVar.method();
                String b2 = e1jVar.b();
                z9h d2 = e1jVar.d();
                z9h a2 = e1jVar.a();
                z9h c2 = e1jVar.c();
                g06 g06Var = (g06) this.b;
                String str3 = Build.MANUFACTURER;
                c2.getClass();
                if (str3 != null) {
                    c2.j("X-Device-Manufacturer", str3);
                }
                String str4 = Build.MODEL;
                if (str4 != null) {
                    c2.j("X-Device-Model", str4);
                }
                String str5 = (String) g06Var.a;
                if (str5 != null) {
                    c2.j("X-OS-Version", str5);
                }
                String str6 = (String) g06Var.b;
                if (str6 != null) {
                    c2.j("X-OS-API-Version", str6);
                }
                String str7 = (String) g06Var.c;
                if (str7 != null) {
                    c2.j("X-Screen-Width", str7);
                }
                String str8 = (String) g06Var.d;
                if (str8 != null) {
                    c2.j("X-Screen-Height", str8);
                }
                break;
            case 2:
                String b3 = e1jVar.b();
                b3.getClass();
                if (!StringsKt.M(b3, "tokenize", false)) {
                    break;
                } else {
                    break;
                }
            default:
                if (e1jVar.c().g("X-USER-UUID") != null) {
                    break;
                } else {
                    break;
                }
        }
        return nif.d(e1jVar);
    }
}
