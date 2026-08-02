package defpackage;

import coil3.c;
import com.yandex.go.image.domain.requests.e;
import com.yandex.go.image.internal.coil.utils.a;
import java.io.File;

/* loaded from: classes12.dex */
public final class rac implements eev {
    public final /* synthetic */ ec1 a;
    public final /* synthetic */ ec1 b;
    public final /* synthetic */ e c;
    public final /* synthetic */ j9n w;

    public rac(ec1 ec1Var, ec1 ec1Var2, e eVar, j9n j9nVar) {
        this.a = ec1Var;
        this.b = ec1Var2;
        this.c = eVar;
        this.w = j9nVar;
    }

    @Override // defpackage.eev
    public final void d(m9o m9oVar) {
        this.a.invoke(m9oVar.c);
    }

    @Override // defpackage.eev
    public final void k(t3v0 t3v0Var) {
        String str = t3v0Var.e;
        ec1 ec1Var = this.b;
        if (str == null) {
            ec1Var.invoke(new IllegalStateException("Missing cache key after load"));
            return;
        }
        sci0 sci0Var = (sci0) ((c) this.c.b).a.e.getValue();
        if (sci0Var == null) {
            ec1Var.invoke(new IllegalStateException("Missing cache instance in ImageLoader"));
            return;
        }
        qci0 a = sci0Var.a(str);
        if (a == null) {
            ec1Var.invoke(new IllegalStateException("Missing snapshot for key from ImageLoader"));
            return;
        }
        File file = a.c().toFile();
        a.a(a);
        this.w.invoke(file);
    }

    @Override // defpackage.eev
    public final void onCancel() {
    }

    @Override // defpackage.eev
    public final void onStart() {
    }
}
