package com.yandex.plus.core.network.okhttp.call;

import defpackage.cg6;

/* loaded from: classes4.dex */
public final class d implements com.yandex.plus.core.network.interceptor.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.yandex.plus.core.network.okhttp.interceptor.f b;

    public /* synthetic */ d(com.yandex.plus.core.network.okhttp.interceptor.f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // com.yandex.plus.core.network.interceptor.a
    public final Object a(com.yandex.plus.core.network.interceptor.e eVar, cg6 cg6Var) {
        switch (this.a) {
            case 0:
                return this.b.e(eVar, cg6Var);
            default:
                return this.b.a(eVar, cg6Var);
        }
    }
}
