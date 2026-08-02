package com.yandex.plus.bdui.plus.checkout.content.controller;

import defpackage.ezc;
import defpackage.syc;
import defpackage.zne;
import defpackage.zyc;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements com.yandex.plus.core.insets.g, zyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.yandex.plus.core.insets.g
    public final void b(zne zneVar) {
        int i = this.a;
        zneVar.getClass();
        switch (i) {
            case 0:
                ((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j) this.b).a(zneVar);
                break;
            case 1:
                ((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.b) this.b).a(zneVar);
                break;
            case 2:
                ((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c) this.b).a(zneVar);
                break;
            default:
                ((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c) this.b).a(zneVar);
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
            case 2:
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
            case 0:
                return new ezc(1, 0, com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j.class, (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j) this.b, "applyInsets", "applyInsets(Landroidx/core/graphics/Insets;)V");
            case 1:
                return new ezc(1, 0, com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.b.class, (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.b) this.b, "applyInsets", "applyInsets(Landroidx/core/graphics/Insets;)V");
            case 2:
                return new ezc(1, 0, com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c.class, (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p001native.c) this.b, "applyInsets", "applyInsets(Landroidx/core/graphics/Insets;)V");
            default:
                return new ezc(1, 0, com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c.class, (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c) this.b, "applyInsets", "applyInsets(Landroidx/core/graphics/Insets;)V");
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
