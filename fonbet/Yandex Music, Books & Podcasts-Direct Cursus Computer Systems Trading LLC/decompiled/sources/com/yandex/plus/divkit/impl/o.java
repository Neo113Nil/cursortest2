package com.yandex.plus.divkit.impl;

import defpackage.ezc;
import defpackage.syc;
import defpackage.uct;
import defpackage.ywt;
import defpackage.zyc;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class o implements ywt, zyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ywt
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) ((com.yandex.plus.core.debug.panel.internal.presentation.controller.a) this.b).invoke(obj)).booleanValue();
            default:
                return ((uct) this.b).b(obj);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof ywt) && (obj instanceof zyc)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof ywt) && (obj instanceof zyc)) {
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
                return (com.yandex.plus.core.debug.panel.internal.presentation.controller.a) this.b;
            default:
                return new ezc(1, 0, uct.class, (uct) this.b, "isTypeValid", "isTypeValid(Ljava/lang/Object;)Z");
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
