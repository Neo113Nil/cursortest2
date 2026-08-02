package defpackage;

import com.yandex.go.external_service.router.b;

/* loaded from: classes12.dex */
public final class w3p implements w8w0 {
    public final /* synthetic */ t7j a;
    public final /* synthetic */ b b;

    public w3p(t7j t7jVar, b bVar) {
        this.a = t7jVar;
        this.b = bVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.b.r(new qu(9));
    }

    @Override // defpackage.w8w0
    public final void onFailure(Throwable th) {
        jst.e.h(null, "Failed to open super app card", th);
        this.b.r(new qu(9));
    }

    @Override // defpackage.w8w0
    public final void p() {
        this.a.invoke();
    }
}
