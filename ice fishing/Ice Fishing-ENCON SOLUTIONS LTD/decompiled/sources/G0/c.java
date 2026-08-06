package G0;

import F.C0038n;
import a1.InterfaceC0090f;

/* loaded from: classes.dex */
public class c implements W0.b {
    @Override // W0.b
    public final void onAttachedToEngine(W0.a aVar) {
        InterfaceC0090f interfaceC0090f = aVar.f1856b;
        b bVar = new b(aVar.f1855a);
        H0.c cVar = H0.c.f656a;
        new C0038n(interfaceC0090f, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.initVarioqubWithAppMetricaAdapter", cVar, null).h(new E0.a(1, bVar));
        new C0038n(interfaceC0090f, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.fetchConfig", cVar, null).h(new H0.b(4, bVar));
        new C0038n(interfaceC0090f, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.activateConfig", cVar, null).h(new H0.b(5, bVar));
        new C0038n(interfaceC0090f, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getString", cVar, null).h(new H0.b(6, bVar));
        new C0038n(interfaceC0090f, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getBoolean", cVar, null).h(new H0.b(7, bVar));
        new C0038n(interfaceC0090f, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getInt", cVar, null).h(new H0.b(8, bVar));
        new C0038n(interfaceC0090f, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getDouble", cVar, null).h(new H0.b(9, bVar));
        new C0038n(interfaceC0090f, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getId", cVar, null).h(new H0.b(10, bVar));
        new C0038n(interfaceC0090f, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.putClientFeature", cVar, null).h(new H0.b(0, bVar));
        new C0038n(interfaceC0090f, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.clearClientFeatures", cVar, null).h(new H0.b(1, bVar));
        new C0038n(interfaceC0090f, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.getAllKeys", cVar, null).h(new H0.b(2, bVar));
        new C0038n(interfaceC0090f, "dev.flutter.pigeon.varioqub_plugin.VarioqubPigeon.setDefaults", cVar, null).h(new H0.b(3, bVar));
    }

    @Override // W0.b
    public final void onDetachedFromEngine(W0.a aVar) {
    }
}
