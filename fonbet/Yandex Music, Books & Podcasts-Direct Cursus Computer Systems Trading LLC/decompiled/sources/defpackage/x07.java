package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class x07 implements gek {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public x07(x7o x7oVar, Function0 function0) {
        this.b = x7oVar;
        this.c = (uif) function0;
    }

    @Override // defpackage.gek
    public final void a(Uri uri, List list) {
        int i = this.a;
        uri.getClass();
        list.getClass();
        switch (i) {
            case 0:
                ((z07) this.b).r.l(new adv(uri, list));
                break;
            default:
                x7o x7oVar = (x7o) this.b;
                String uri2 = uri.toString();
                uri2.getClass();
                x7oVar.onSuccess(new bn(uri2, list));
                break;
        }
    }

    @Override // defpackage.gek
    public final void b() {
        switch (this.a) {
            case 0:
                ((kw3) this.c).h();
                break;
        }
    }

    @Override // defpackage.gek
    public final void c() {
        switch (this.a) {
            case 0:
                ((z07) this.b).r.l(ycv.a);
                break;
            default:
                ((x7o) this.b).onSuccess(xm.a);
                break;
        }
    }

    @Override // defpackage.gek
    public final void d(Uri uri) {
        int i = this.a;
        uri.getClass();
        switch (i) {
            case 0:
                ((z07) this.b).r.l(new zcv(uri));
                break;
            default:
                a(uri, c5b.a);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // defpackage.gek
    public final void e() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((uif) this.c).invoke();
                break;
        }
    }

    @Override // defpackage.gek
    public final void l(String str) {
        int i = this.a;
        str.getClass();
        switch (i) {
            case 0:
                break;
            default:
                ((x7o) this.b).onSuccess(new ym(str));
                break;
        }
    }

    @Override // defpackage.gek
    public final void p(t9i t9iVar) {
        int i = this.a;
        t9iVar.getClass();
        switch (i) {
            case 0:
                break;
            default:
                ((x7o) this.b).onSuccess(new cn(t9iVar));
                break;
        }
    }

    public x07(z07 z07Var, k17 k17Var) {
        this.b = z07Var;
        this.c = k17Var;
    }

    private final void f() {
    }

    private final void g() {
    }
}
