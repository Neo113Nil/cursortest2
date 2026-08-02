package com.yandex.plus.bdui.flex.factory;

import com.yandex.plus.bdui.s;
import defpackage.c76;
import defpackage.t9f;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.yandex.passport.internal.ui.bouncer.p b;
    public final /* synthetic */ s c;
    public final /* synthetic */ c76 d;

    public /* synthetic */ m(com.yandex.passport.internal.ui.bouncer.p pVar, s sVar, c76 c76Var, int i) {
        this.a = i;
        this.b = pVar;
        this.c = sVar;
        this.d = c76Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new com.yandex.plus.bdui.flex.content.b(new m(this.b, this.c, this.d, 1));
            default:
                return (t9f) this.b.invoke(this.c, this.d);
        }
    }
}
