package com.yandex.plus.home.feature.webviews.internal;

import defpackage.bi1;
import defpackage.brr;
import defpackage.o77;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class f implements brr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.brr
    public final Object get() {
        switch (this.a) {
            case 0:
                return (String) ((brr) this.b).get();
            case 1:
                return (String) ((Function0) this.b).invoke();
            case 2:
                return ((com.yandex.plus.home.feature.webviews.internal.container.factory.a) this.b).b.a();
            case 3:
                return ((com.yandex.plus.home.auth.f) ((bi1) this.b).c).a();
            default:
                return ((com.yandex.plus.home.auth.f) ((o77) this.b).b).a();
        }
    }
}
