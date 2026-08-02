package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.internal.ui.bouncer.model.y1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ n(s sVar, int i) {
        this.a = i;
        this.b = sVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.a(y1.b);
                break;
            case 1:
                this.b.a(y1.a);
                break;
            case 2:
                this.b.a(y1.c);
                break;
            default:
                this.b.a(y1.b);
                break;
        }
        return Unit.a;
    }
}
