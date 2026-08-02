package com.yandex.passport.internal.ui.challenge;

import defpackage.nm6;
import defpackage.pjc;
import defpackage.rjc;
import defpackage.ub7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class d implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ ub7 b;

    public /* synthetic */ d(ub7 ub7Var, int i) {
        this.a = i;
        this.b = ub7Var;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new com.yandex.passport.internal.s(rjcVar, 25), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new com.yandex.passport.internal.s(rjcVar, 26), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect3 = this.b.collect(new com.yandex.plus.core.debug.panel.internal.presentation.view.l(rjcVar, 20), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
