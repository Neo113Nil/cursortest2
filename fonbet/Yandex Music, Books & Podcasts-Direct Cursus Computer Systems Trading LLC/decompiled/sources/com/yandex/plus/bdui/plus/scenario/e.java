package com.yandex.plus.bdui.plus.scenario;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.yandex.passport.internal.social.d b;

    public /* synthetic */ e(com.yandex.passport.internal.social.d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(this.b.b == 0);
            case 1:
                return (com.yandex.plus.bdui.query.e) this.b.d;
            default:
                return Boolean.valueOf(this.b.b == 0);
        }
    }
}
