package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes4.dex */
public final class hek implements gek {
    public gek a;
    public hmf b;

    public static void f(hek hekVar, gek gekVar) {
        hekVar.a = gekVar;
        if (hekVar.b != null) {
            hekVar.b = null;
        }
    }

    @Override // defpackage.gek
    public final void a(Uri uri, List list) {
        uri.getClass();
        list.getClass();
        this.b = new hmf(uri, list);
        gek gekVar = this.a;
        if (gekVar != null) {
            gekVar.a(uri, list);
        }
    }

    @Override // defpackage.gek
    public final void b() {
        gek gekVar = this.a;
        if (gekVar != null) {
            gekVar.b();
        }
    }

    @Override // defpackage.gek
    public final void c() {
        this.b = null;
        gek gekVar = this.a;
        if (gekVar != null) {
            gekVar.c();
        }
    }

    @Override // defpackage.gek
    public final void d(Uri uri) {
        uri.getClass();
        a(uri, c5b.a);
    }

    @Override // defpackage.gek
    public final void e() {
        gek gekVar = this.a;
        if (gekVar != null) {
            gekVar.e();
        }
    }

    @Override // defpackage.gek
    public final void l(String str) {
        str.getClass();
        gek gekVar = this.a;
        if (gekVar != null) {
            gekVar.l(str);
        }
    }

    @Override // defpackage.gek
    public final void p(t9i t9iVar) {
        t9iVar.getClass();
        gek gekVar = this.a;
        if (gekVar != null) {
            gekVar.p(t9iVar);
        }
    }
}
