package com.yandex.passport.sloth.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ n(k kVar, int i) {
        this.a = i;
        this.b = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.a(e1.b);
                break;
            case 1:
                this.b.a(e1.a);
                break;
            case 2:
                this.b.a(e1.b);
                break;
            default:
                this.b.a(e1.c);
                break;
        }
        return Unit.a;
    }
}
