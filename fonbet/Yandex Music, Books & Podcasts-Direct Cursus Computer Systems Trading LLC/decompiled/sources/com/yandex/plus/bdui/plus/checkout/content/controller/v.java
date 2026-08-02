package com.yandex.plus.bdui.plus.checkout.content.controller;

import defpackage.ezc;
import defpackage.syc;
import defpackage.zne;
import defpackage.zyc;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class v implements com.yandex.plus.core.insets.g, zyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b b;

    public /* synthetic */ v(com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // com.yandex.plus.core.insets.g
    public final void b(zne zneVar) {
        int i = this.a;
        zneVar.getClass();
        switch (i) {
            case 0:
                this.b.a(zneVar);
                break;
            case 1:
                this.b.a(zneVar);
                break;
            default:
                this.b.a(zneVar);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof com.yandex.plus.core.insets.g) && (obj instanceof zyc)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof com.yandex.plus.core.insets.g) && (obj instanceof zyc)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof com.yandex.plus.core.insets.g) && (obj instanceof zyc)) {
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
        return new ezc(1, 0, com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.b.class, this.b, "applyInsets", "applyInsets(Landroidx/core/graphics/Insets;)V");
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
