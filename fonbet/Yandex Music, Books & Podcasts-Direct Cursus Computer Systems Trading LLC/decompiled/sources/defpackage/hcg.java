package defpackage;

import android.R;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

/* loaded from: classes6.dex */
public final class hcg implements r9g {
    public final /* synthetic */ ListYandexPlayerView a;

    public hcg(ListYandexPlayerView listYandexPlayerView) {
        this.a = listYandexPlayerView;
    }

    @Override // defpackage.r9g
    public final void R() {
        imh d;
        ListYandexPlayerView listYandexPlayerView = this.a;
        rre rreVar = listYandexPlayerView.a;
        rreVar.getClass();
        String e = listYandexPlayerView.e();
        StringBuilder sb = new StringBuilder("new source = ");
        acg acgVar = listYandexPlayerView.i;
        sb.append((acgVar == null || (d = acgVar.d()) == null) ? null : d.d);
        rreVar.H(e, "onNewSourceIsSet", sb.toString(), new Object[0]);
        listYandexPlayerView.g(xz0.Y(new hrl[]{listYandexPlayerView.k, listYandexPlayerView.l}));
        listYandexPlayerView.n.c();
        listYandexPlayerView.e.setImageResource(R.color.transparent);
        listYandexPlayerView.e.setTag(null);
        listYandexPlayerView.f(xz0.Y(new hrl[]{listYandexPlayerView.k, listYandexPlayerView.l}));
    }

    @Override // defpackage.r9g
    public final void a() {
        this.a.n.onResume();
    }

    @Override // defpackage.r9g
    public final void v() {
        ListYandexPlayerView listYandexPlayerView = this.a;
        rre rreVar = listYandexPlayerView.a;
        rreVar.getClass();
        rreVar.H(listYandexPlayerView.e(), "onReadyForFirstPlayback", null, new Object[0]);
        hrl hrlVar = listYandexPlayerView.l;
        hrlVar.d = true;
        listYandexPlayerView.n.b(hrlVar);
    }
}
