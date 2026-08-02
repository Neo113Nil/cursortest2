package com.yandex.passport.internal.ui.base;

import defpackage.syc;
import defpackage.xjj;
import defpackage.zyc;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements xjj, zyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ g(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof xjj) && (obj instanceof zyc)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof xjj) && (obj instanceof zyc)) {
                    break;
                }
                break;
        }
        return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return (com.yandex.passport.internal.ui.domik.common.a) this.b;
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }

    @Override // defpackage.xjj
    public final /* synthetic */ void onChanged(Object obj) {
        switch (this.a) {
            case 0:
                this.b.invoke(obj);
                break;
            default:
                ((com.yandex.passport.internal.ui.domik.common.a) this.b).invoke(obj);
                break;
        }
    }
}
