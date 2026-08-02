package ru.yandex.taxi.sdc.router;

import defpackage.tls;
import defpackage.vf41;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class AcceptEulaV2Router$provideModalView$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        b bVar = (b) this.receiver;
        bVar.getClass();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.b = (String) obj;
        bVar.E.s(vf41.a(bVar.G.a().c(), new UiWebViewConfig(aVar.a(), null, true, false, false, false, null, true, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194170, null), null, null, null, 254), true);
        return zy11.a;
    }
}
