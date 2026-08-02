package com.yandex.plus.core.debug.panel.internal.presentation.viewModel;

import com.yandex.passport.common.mvi.d;
import com.yandex.plus.core.debug.panel.internal.presentation.view.l;
import com.yandex.plus.home.graphql.plusstate.e;
import defpackage.h7a;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.rjc;
import defpackage.sn2;
import defpackage.tt0;
import defpackage.ub7;
import defpackage.xdr;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class b implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                ((xdr) this.b).collect(new l(rjcVar, 1), continuation);
                break;
            case 1:
                Object collect = ((d) this.b).collect(new l(rjcVar, 5), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 2:
                Object collect2 = ((ub7) this.b).collect(new l(rjcVar, 8), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 3:
                Object collect3 = ((e) this.b).collect(new l(rjcVar, 13), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            case 4:
                Object collect4 = ((h7a) this.b).collect(new l(rjcVar, 14), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
            case 5:
                Object collect5 = ((e) this.b).collect(new l(rjcVar, 19), continuation);
                if (collect5 != nm6.a) {
                    break;
                }
                break;
            default:
                pjc[] pjcVarArr = (pjc[]) this.b;
                Object y = tt0.y(rjcVar, new sn2(3, 3, null), continuation, new com.yandex.passport.internal.ui.sloth.menu.c(3, pjcVarArr), pjcVarArr);
                if (y != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
