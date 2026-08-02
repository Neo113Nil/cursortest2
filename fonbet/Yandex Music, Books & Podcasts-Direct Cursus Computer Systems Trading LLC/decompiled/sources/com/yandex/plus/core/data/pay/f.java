package com.yandex.plus.core.data.pay;

import defpackage.clc;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.rjc;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class f implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ clc b;

    public /* synthetic */ f(clc clcVar, int i) {
        this.a = i;
        this.b = clcVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new com.yandex.passport.internal.s(rjcVar, 29), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect2 = this.b.collect(new com.yandex.plus.core.debug.panel.internal.presentation.view.l(rjcVar, 3), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
