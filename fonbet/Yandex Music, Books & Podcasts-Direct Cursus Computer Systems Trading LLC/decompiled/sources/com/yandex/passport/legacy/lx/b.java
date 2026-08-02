package com.yandex.passport.legacy.lx;

/* loaded from: classes4.dex */
public final class b implements a {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ a c;
    public final /* synthetic */ e d;

    public /* synthetic */ b(e eVar, j jVar, a aVar, int i) {
        this.a = i;
        this.d = eVar;
        this.b = jVar;
        this.c = aVar;
    }

    @Override // com.yandex.passport.legacy.lx.a
    /* renamed from: b */
    public final void mo1b(Object obj) {
        switch (this.a) {
            case 0:
                this.d.d.post(new androidx.core.app.c(3, this, obj));
                break;
            default:
                this.d.d.post(new androidx.core.app.c(this, (Throwable) obj, false, 4));
                break;
        }
    }
}
