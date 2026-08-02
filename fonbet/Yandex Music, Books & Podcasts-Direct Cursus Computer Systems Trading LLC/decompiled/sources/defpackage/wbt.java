package defpackage;

import ru.kinopoisk.sdk.easylogin.internal.C1288x9;
import ru.kinopoisk.sdk.easylogin.internal.H3;
import ru.kinopoisk.sdk.easylogin.internal.Hb;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1138m9;
import ru.kinopoisk.sdk.easylogin.internal.di.TvDetectedScreenDependenciesModule;
import ru.kinopoisk.sdk.easylogin.internal.di.TvDiscoveryScreenDependenciesModule;

/* loaded from: classes5.dex */
public final /* synthetic */ class wbt implements InterfaceC1138m9, Hb {
    public final /* synthetic */ int a;
    public final /* synthetic */ C1288x9 b;

    public /* synthetic */ wbt(C1288x9 c1288x9, int i) {
        this.a = i;
        this.b = c1288x9;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1138m9, ru.kinopoisk.sdk.easylogin.internal.Hb
    public final boolean a(H3 h3) {
        boolean provideTvAppInstallResolver$lambda$0;
        boolean provideTvShowInDiscoveryResolver$lambda$0;
        switch (this.a) {
            case 0:
                provideTvAppInstallResolver$lambda$0 = TvDetectedScreenDependenciesModule.provideTvAppInstallResolver$lambda$0(this.b, h3);
                return provideTvAppInstallResolver$lambda$0;
            default:
                provideTvShowInDiscoveryResolver$lambda$0 = TvDiscoveryScreenDependenciesModule.provideTvShowInDiscoveryResolver$lambda$0(this.b, h3);
                return provideTvShowInDiscoveryResolver$lambda$0;
        }
    }
}
