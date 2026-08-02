package com.yandex.plus.di;

import defpackage.is6;
import defpackage.jfu;
import defpackage.uif;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class b extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ com.yandex.plus.pay.ui.common.api.b s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(com.yandex.plus.pay.ui.common.api.b bVar, int i) {
        super(0);
        this.r = i;
        this.s = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                jfu viewModelStore = this.s.getViewModelStore();
                viewModelStore.getClass();
                return viewModelStore;
            default:
                is6 defaultViewModelCreationExtras = this.s.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
                return defaultViewModelCreationExtras;
        }
    }
}
