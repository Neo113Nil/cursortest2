package defpackage;

import java.util.ArrayList;
import java.util.List;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class amq implements zlq {
    public final zlq a;

    public amq(List list, nsh nshVar) {
        list.getClass();
        Timber.INSTANCE.d("Initialisation started", new Object[0]);
        this.a = list.isEmpty() ? new o4b() : new n8j(list, nshVar);
    }

    @Override // defpackage.zlq
    public final void a(lu2 lu2Var) {
        Timber.INSTANCE.d("onBaseUrlRemovedFromBlacklist restoredBaseUrl=" + lu2Var, new Object[0]);
        this.a.a(lu2Var);
    }

    @Override // defpackage.zlq
    public final String b() {
        return this.a.b();
    }

    @Override // defpackage.zlq
    public final void c(String str) {
        this.a.c(str);
    }

    @Override // defpackage.zlq
    public final void d(ArrayList arrayList) {
        this.a.d(arrayList);
    }

    @Override // defpackage.zlq
    public final boolean e() {
        Timber.INSTANCE.e("onChunkLoadError", new Object[0]);
        return this.a.e();
    }

    @Override // defpackage.zlq
    public final int f() {
        return this.a.f();
    }
}
