package com.yandex.plus.home.graphql.plusstate;

import com.yandex.plus.core.debug.panel.internal.presentation.view.l;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.rjc;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class e implements pjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ pjc b;

    public /* synthetic */ e(pjc pjcVar, int i) {
        this.a = i;
        this.b = pjcVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object collect = this.b.collect(new l(rjcVar, 10), continuation);
                if (collect != nm6.a) {
                    break;
                }
                break;
            case 1:
                Object collect2 = this.b.collect(new l(rjcVar, 11), continuation);
                if (collect2 != nm6.a) {
                    break;
                }
                break;
            case 2:
                Object collect3 = this.b.collect(new l(rjcVar, 12), continuation);
                if (collect3 != nm6.a) {
                    break;
                }
                break;
            case 3:
                Object collect4 = this.b.collect(new l(rjcVar, 15), continuation);
                if (collect4 != nm6.a) {
                    break;
                }
                break;
            case 4:
                Object collect5 = this.b.collect(new l(rjcVar, 16), continuation);
                if (collect5 != nm6.a) {
                    break;
                }
                break;
            case 5:
                Object collect6 = this.b.collect(new l(rjcVar, 18), continuation);
                if (collect6 != nm6.a) {
                    break;
                }
                break;
            default:
                Object collect7 = this.b.collect(new l(rjcVar, 21), continuation);
                if (collect7 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
