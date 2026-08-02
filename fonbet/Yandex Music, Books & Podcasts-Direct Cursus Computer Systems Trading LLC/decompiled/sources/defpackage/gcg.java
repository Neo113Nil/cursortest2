package defpackage;

import ru.yandex.video.m3.ui.ListYandexPlayerView;

/* loaded from: classes6.dex */
public final class gcg implements p9g {
    public final /* synthetic */ ListYandexPlayerView a;

    public gcg(ListYandexPlayerView listYandexPlayerView) {
        this.a = listYandexPlayerView;
    }

    @Override // defpackage.p9g
    public final void d() {
        ListYandexPlayerView listYandexPlayerView = this.a;
        rre rreVar = listYandexPlayerView.a;
        rreVar.getClass();
        rreVar.H(listYandexPlayerView.e(), "onEngineDetached", null, new Object[0]);
        listYandexPlayerView.g(uop.b(listYandexPlayerView.l));
        listYandexPlayerView.f(uop.b(listYandexPlayerView.l));
    }

    @Override // defpackage.p9g
    public final void e(paw pawVar) {
        ListYandexPlayerView listYandexPlayerView = this.a;
        rre rreVar = listYandexPlayerView.a;
        rreVar.getClass();
        rreVar.H(listYandexPlayerView.e(), "onEngineAttached", null, new Object[0]);
    }
}
