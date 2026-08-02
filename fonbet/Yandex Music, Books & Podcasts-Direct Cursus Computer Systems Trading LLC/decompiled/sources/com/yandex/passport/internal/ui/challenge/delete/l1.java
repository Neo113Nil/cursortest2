package com.yandex.passport.internal.ui.challenge.delete;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.yandex.passport.sloth.d1 b;

    public /* synthetic */ l1(com.yandex.passport.sloth.d1 d1Var, int i) {
        this.a = i;
        this.b = d1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                this.b.close();
                break;
            case 1:
                this.b.close();
                break;
            default:
                this.b.close();
                break;
        }
        return Unit.a;
    }
}
