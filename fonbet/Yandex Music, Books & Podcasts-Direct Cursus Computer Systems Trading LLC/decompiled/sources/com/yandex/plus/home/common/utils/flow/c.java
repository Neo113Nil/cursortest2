package com.yandex.plus.home.common.utils.flow;

import com.yandex.plus.home.plaque.repository.api.model.d;
import defpackage.ezc;
import defpackage.nm6;
import defpackage.rjc;
import defpackage.syc;
import defpackage.zyc;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements rjc, zyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;

    public /* synthetic */ c(rjc rjcVar, int i) {
        this.a = i;
        this.b = rjcVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                Object emit = this.b.emit(obj, continuation);
                if (emit != nm6.a) {
                    break;
                }
                break;
            default:
                Object emit2 = this.b.emit((d) obj, continuation);
                if (emit2 != nm6.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof rjc) && (obj instanceof zyc)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof rjc) && (obj instanceof zyc)) {
                    break;
                }
                break;
        }
        return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        switch (this.a) {
        }
        return new ezc(2, 0, rjc.class, this.b, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
