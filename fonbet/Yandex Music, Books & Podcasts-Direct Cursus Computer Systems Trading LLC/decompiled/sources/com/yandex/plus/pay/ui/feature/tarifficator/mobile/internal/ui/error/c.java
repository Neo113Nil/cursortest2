package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error;

import defpackage.kfu;
import defpackage.uif;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class c extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj) {
        super(0);
        this.r = i;
        this.s = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return (kfu) ((b) this.s).invoke();
            case 1:
                return (kfu) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.b) this.s).invoke();
            case 2:
                return (kfu) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.b) this.s).invoke();
            case 3:
                return (kfu) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.b) this.s).invoke();
            case 4:
                return (kfu) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.b) this.s).invoke();
            case 5:
                return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.e) this.s;
            case 6:
                return (kfu) ((c) this.s).invoke();
            case 7:
                return (kfu) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.b) this.s).invoke();
            case 8:
                return (kfu) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.b) this.s).invoke();
            case 9:
                return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.d) this.s;
            case 10:
                return (kfu) ((c) this.s).invoke();
            case 11:
                return (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.d) this.s;
            default:
                return (kfu) ((c) this.s).invoke();
        }
    }
}
