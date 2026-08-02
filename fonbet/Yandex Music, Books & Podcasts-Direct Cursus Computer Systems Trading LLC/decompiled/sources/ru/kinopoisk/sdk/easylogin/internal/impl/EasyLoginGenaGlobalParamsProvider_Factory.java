package ru.kinopoisk.sdk.easylogin.internal.impl;

import defpackage.rzm;
import defpackage.szm;
import ru.kinopoisk.sdk.easylogin.internal.B3;
import ru.kinopoisk.sdk.easylogin.internal.C1282x3;
import ru.kinopoisk.sdk.easylogin.internal.D2;
import ru.kinopoisk.sdk.easylogin.internal.F2;
import ru.kinopoisk.sdk.easylogin.internal.G;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1228t2;
import ru.kinopoisk.sdk.easylogin.internal.Q2;

/* loaded from: classes5.dex */
public final class EasyLoginGenaGlobalParamsProvider_Factory implements rzm {
    private final szm appSessionIdProvider;
    private final szm currentPuidProvider;
    private final szm deviceIdentifierProvider;
    private final szm deviceSpecificationProvider;
    private final szm dispatchersProvider;
    private final szm evgenFeatureFlagsProvider;
    private final szm expsProvider;

    public EasyLoginGenaGlobalParamsProvider_Factory(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4, szm szmVar5, szm szmVar6, szm szmVar7) {
        this.currentPuidProvider = szmVar;
        this.dispatchersProvider = szmVar2;
        this.deviceIdentifierProvider = szmVar3;
        this.expsProvider = szmVar4;
        this.evgenFeatureFlagsProvider = szmVar5;
        this.deviceSpecificationProvider = szmVar6;
        this.appSessionIdProvider = szmVar7;
    }

    public static EasyLoginGenaGlobalParamsProvider_Factory create(szm szmVar, szm szmVar2, szm szmVar3, szm szmVar4, szm szmVar5, szm szmVar6, szm szmVar7) {
        return new EasyLoginGenaGlobalParamsProvider_Factory(szmVar, szmVar2, szmVar3, szmVar4, szmVar5, szmVar6, szmVar7);
    }

    public static EasyLoginGenaGlobalParamsProvider newInstance(InterfaceC1228t2 interfaceC1228t2, Q2 q2, D2 d2, B3 b3, C1282x3 c1282x3, F2 f2, G g) {
        return new EasyLoginGenaGlobalParamsProvider(interfaceC1228t2, q2, d2, b3, c1282x3, f2, g);
    }

    @Override // defpackage.szm
    public EasyLoginGenaGlobalParamsProvider get() {
        return newInstance((InterfaceC1228t2) this.currentPuidProvider.get(), (Q2) this.dispatchersProvider.get(), (D2) this.deviceIdentifierProvider.get(), (B3) this.expsProvider.get(), (C1282x3) this.evgenFeatureFlagsProvider.get(), (F2) this.deviceSpecificationProvider.get(), (G) this.appSessionIdProvider.get());
    }
}
