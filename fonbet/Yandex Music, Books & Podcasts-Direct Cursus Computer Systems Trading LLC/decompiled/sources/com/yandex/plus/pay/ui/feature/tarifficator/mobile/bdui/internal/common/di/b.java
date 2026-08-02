package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di;

/* loaded from: classes5.dex */
public final /* synthetic */ class b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(String str, String str2) {
        switch (this.a) {
            case 0:
                com.yandex.passport.internal.core.accounts.h hVar = (com.yandex.passport.internal.core.accounts.h) this.b;
                str.getClass();
                str2.getClass();
                ((com.yandex.plus.pay.reporter.api.f) hVar.d).b(new com.yandex.plus.pay.reporter.api.e(com.yandex.plus.pay.reporter.api.d.b, str, str2, (Throwable) null));
                break;
            default:
                com.yandex.passport.internal.entities.j jVar = (com.yandex.passport.internal.entities.j) this.b;
                str.getClass();
                str2.getClass();
                ((com.yandex.plus.pay.reporter.api.f) jVar.c).b(new com.yandex.plus.pay.reporter.api.e(com.yandex.plus.pay.reporter.api.d.b, str, str2, (Throwable) null));
                break;
        }
    }
}
