package defpackage;

import com.yandex.messaging.core.net.entities.YaDiskUploadedFileInfo;

/* loaded from: classes15.dex */
public final class wj51 extends w920 {
    public final /* synthetic */ String a;
    public final /* synthetic */ qq31 b;

    public wj51(String str, qq31 qq31Var) {
        this.a = str;
        this.b = qq31Var;
    }

    @Override // defpackage.w920
    public final gg70 d(kvj0 kvj0Var) {
        boolean z = kvj0Var.J;
        meu meuVar = kvj0Var.y;
        if (!z) {
            String a = meuVar.a("Location");
            return new dg70(new YaDiskUploadedFileInfo(a != null ? a : null, 0L, false));
        }
        String a2 = meuVar.a("Content-Length");
        if (a2 == null) {
            a2 = null;
        }
        Long valueOf = a2 != null ? Long.valueOf(Long.parseLong(a2)) : null;
        String a3 = meuVar.a("Location");
        return new dg70(new YaDiskUploadedFileInfo(a3 != null ? a3 : null, valueOf != null ? valueOf.longValue() : 0L, true));
    }

    @Override // defpackage.w920
    public final boolean e(ngz ngzVar) {
        this.b.invoke(new YaDiskUploadedFileInfo(null, 0L, false));
        return false;
    }

    @Override // defpackage.w920
    public final void g(Object obj) {
        this.b.invoke((YaDiskUploadedFileInfo) obj);
    }

    @Override // defpackage.w920
    public final t4j0 i() {
        t4j0 t4j0Var = new t4j0();
        t4j0Var.h(this.a);
        t4j0Var.e("HEAD", null);
        return t4j0Var;
    }
}
