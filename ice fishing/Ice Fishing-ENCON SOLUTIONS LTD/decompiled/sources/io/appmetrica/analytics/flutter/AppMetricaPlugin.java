package io.appmetrica.analytics.flutter;

import P0.AbstractActivityC0072e;
import Q0.c;
import W0.b;
import X0.a;
import a1.InterfaceC0090f;
import android.content.Context;
import io.appmetrica.analytics.flutter.impl.AppMetricaConfigConverterImpl;
import io.appmetrica.analytics.flutter.impl.AppMetricaImpl;
import io.appmetrica.analytics.flutter.impl.AppMetricaLibraryAdapterImpl;
import io.appmetrica.analytics.flutter.impl.InitialDeepLinkHolderImpl;
import io.appmetrica.analytics.flutter.impl.ReporterImpl;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;

/* loaded from: classes.dex */
public class AppMetricaPlugin implements b, a {
    private AppMetricaImpl appMetrica = null;
    private AppMetricaLibraryAdapterImpl appMetricaLibraryAdapter = null;
    private InitialDeepLinkHolderImpl deeplinkHolder = null;

    @Override // X0.a
    public void onAttachedToActivity(X0.b bVar) {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = (AbstractActivityC0072e) ((c) bVar).f1518a;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = (AbstractActivityC0072e) ((c) bVar).f1518a;
        }
    }

    @Override // W0.b
    public void onAttachedToEngine(W0.a aVar) {
        this.appMetrica = new AppMetricaImpl(aVar.f1855a);
        Context context = aVar.f1855a;
        this.appMetricaLibraryAdapter = new AppMetricaLibraryAdapterImpl(context);
        this.deeplinkHolder = new InitialDeepLinkHolderImpl();
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        InterfaceC0090f interfaceC0090f = aVar.f1856b;
        Pigeon.AppMetricaPigeon.setup(interfaceC0090f, appMetricaImpl);
        Pigeon.AppMetricaLibraryAdapterPigeon.setup(interfaceC0090f, this.appMetricaLibraryAdapter);
        Pigeon.ReporterPigeon.setup(interfaceC0090f, new ReporterImpl(context));
        Pigeon.AppMetricaConfigConverterPigeon.setup(interfaceC0090f, new AppMetricaConfigConverterImpl());
        Pigeon.InitialDeepLinkHolderPigeon.setup(interfaceC0090f, this.deeplinkHolder);
    }

    @Override // X0.a
    public void onDetachedFromActivity() {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = null;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = null;
        }
    }

    @Override // X0.a
    public void onDetachedFromActivityForConfigChanges() {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = null;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = null;
        }
    }

    @Override // X0.a
    public void onReattachedToActivityForConfigChanges(X0.b bVar) {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = (AbstractActivityC0072e) ((c) bVar).f1518a;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = (AbstractActivityC0072e) ((c) bVar).f1518a;
        }
    }

    @Override // W0.b
    public void onDetachedFromEngine(W0.a aVar) {
    }
}
