package com.yandex.plus.home;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.internal.di.z;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class h implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ h(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                return new z(jVar.a, jVar.b, jVar.c, jVar.d, jVar.e, jVar.f, jVar.g);
            case 1:
                return new com.yandex.plus.core.theme.e((com.yandex.plus.core.theme.d) this.b.b.B.getValue());
            default:
                return Boolean.valueOf(r1.l(((com.yandex.plus.home.featureflags.e) this.b.b.q).l));
        }
    }
}
