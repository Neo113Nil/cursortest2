package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success;

import defpackage.arf;
import defpackage.gs6;
import defpackage.is6;
import defpackage.jfu;
import defpackage.kfu;
import defpackage.ssd;
import defpackage.uif;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class c extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(arf arfVar, int i) {
        super(0);
        this.r = i;
        this.s = arfVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [arf, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                jfu viewModelStore = ((kfu) this.s.getValue()).getViewModelStore();
                viewModelStore.getClass();
                return viewModelStore;
            case 1:
                kfu kfuVar = (kfu) this.s.getValue();
                ssd ssdVar = kfuVar instanceof ssd ? (ssd) kfuVar : null;
                is6 defaultViewModelCreationExtras = ssdVar != null ? ssdVar.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? gs6.b : defaultViewModelCreationExtras;
            case 2:
                jfu viewModelStore2 = ((kfu) this.s.getValue()).getViewModelStore();
                viewModelStore2.getClass();
                return viewModelStore2;
            case 3:
                kfu kfuVar2 = (kfu) this.s.getValue();
                ssd ssdVar2 = kfuVar2 instanceof ssd ? (ssd) kfuVar2 : null;
                is6 defaultViewModelCreationExtras2 = ssdVar2 != null ? ssdVar2.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras2 == null ? gs6.b : defaultViewModelCreationExtras2;
            case 4:
                jfu viewModelStore3 = ((kfu) this.s.getValue()).getViewModelStore();
                viewModelStore3.getClass();
                return viewModelStore3;
            case 5:
                kfu kfuVar3 = (kfu) this.s.getValue();
                ssd ssdVar3 = kfuVar3 instanceof ssd ? (ssd) kfuVar3 : null;
                is6 defaultViewModelCreationExtras3 = ssdVar3 != null ? ssdVar3.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras3 == null ? gs6.b : defaultViewModelCreationExtras3;
            case 6:
                jfu viewModelStore4 = ((kfu) this.s.getValue()).getViewModelStore();
                viewModelStore4.getClass();
                return viewModelStore4;
            default:
                kfu kfuVar4 = (kfu) this.s.getValue();
                ssd ssdVar4 = kfuVar4 instanceof ssd ? (ssd) kfuVar4 : null;
                is6 defaultViewModelCreationExtras4 = ssdVar4 != null ? ssdVar4.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras4 == null ? gs6.b : defaultViewModelCreationExtras4;
        }
    }
}
